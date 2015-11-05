package net.leanix.benchmark;

import java.util.List;

import net.leanix.api.common.ApiException;
import net.leanix.dropkit.api.Client;
import net.leanix.dropkit.api.ClientFactory;
import net.leanix.mtm.api.AccountsApi;
import net.leanix.mtm.api.PermissionsApi;
import net.leanix.mtm.api.UsersApi;
import net.leanix.mtm.api.WorkspacesApi;
import net.leanix.mtm.api.models.Account;
import net.leanix.mtm.api.models.AccountListResponse;
import net.leanix.mtm.api.models.Contract;
import net.leanix.mtm.api.models.ContractListResponse;
import net.leanix.mtm.api.models.Permission;
import net.leanix.mtm.api.models.User;
import net.leanix.mtm.api.models.UserListResponse;
import net.leanix.mtm.api.models.Workspace;
import net.leanix.mtm.api.models.WorkspaceListResponse;
import net.leanix.mtm.api.models.WorkspaceResponse;

public class WorkspaceHelper {

    /**
     * account to use when creating a workspace
     */
    private static final String ACCOUNT_NAME = "leanix";

    /**
     * the account's contract to use when creating a workspace
     */
    private static final String CONTRACT_DISPLAY_NAME = "leanix eam REGULAR";
    private static final String apiSetup = "professional-v1";

    private final String workspaceName;
    private final Client mtmApiClient;
    private final WorkspacesApi workspacesApi;
    private final AccountsApi accountsApi;

    public WorkspaceHelper(String workspaceName) {
        super();
        this.workspaceName = workspaceName;
        mtmApiClient = ClientFactory.create(ConfigurationProvider.createMtmApiUrl(), ConfigurationProvider.getTokenUrl(),
                ConfigurationProvider.getVerificationUrl(), ConfigurationProvider.getClientId(),
                ConfigurationProvider.getClientSecret());
        workspacesApi = new WorkspacesApi(mtmApiClient);
        accountsApi = new AccountsApi(mtmApiClient);
    }

    /**
     * Creates a new workspace or takes care that an old one with name {@linkplain #workspaceName} already exists.
     * 
     * @return <code>true</code> if the workspace already exists
     * @throws net.leanix.dropkit.api.ApiException
     * @throws ApiException
     */
    public boolean getExistingWorkspaceOrCreateNew() throws net.leanix.dropkit.api.ApiException, ApiException {
        WorkspaceListResponse workspaceListResponse = workspacesApi.getWorkspaces(null, null, null, null);
        for (Workspace workspace : workspaceListResponse.getData()) {
            // System.out.println(String.format("Found workspace: %s", workspace.getName()));
            if (workspace.getName().equals(workspaceName)) {
                return true;
            }
        }

        // create a new workspace with required name
        Account account = lookupAccount(ACCOUNT_NAME);
        Contract contract = lookupContract(account.getId(), CONTRACT_DISPLAY_NAME);

        net.leanix.mtm.api.models.Workspace newWorkspace = new net.leanix.mtm.api.models.Workspace();
        newWorkspace.setStatus("ACTIVE");
        newWorkspace.setType("DEMO");
        newWorkspace.setContract(contract);
        newWorkspace.setFeatureBundleId(apiSetup);
        newWorkspace.setName(workspaceName);

        WorkspaceResponse response = workspacesApi.createWorkspace(newWorkspace, null);
        Workspace workspace = response.getData();

        System.out.println(String.format("Workspace '%s' created, has ID %s", workspace.getName(), workspace.getId()));

        addUserToWorkspace(workspace, ConfigurationProvider.getApiUserEmail());

        return false;
    }

    public void deleteWorkspace() throws net.leanix.dropkit.api.ApiException {

        WorkspaceListResponse workspaceListResponse = workspacesApi.getWorkspaces(workspaceName, null, null, null);
        Workspace workspace = workspaceListResponse.getData().get(0);
        workspace.setStatus("BLOCKED");
        workspacesApi.updateWorkspace(workspace.getId(), workspace, null);

        // mtmt
        workspacesApi.deleteWorkspace(workspace.getId());
        System.out.println(String.format("Workspace '%s' deleted.", workspace.getName()));
    }

    private void addUserToWorkspace(Workspace workspace, String email) throws ApiException, net.leanix.dropkit.api.ApiException {
        UsersApi usersApi = new UsersApi(mtmApiClient);
        System.out.println(String.format("looking for user %s", email));
        UserListResponse response = usersApi.getUsers(email, null, null, null, null);
        if (response.getData().size() != 1) {
            throw new RuntimeException("user " + email + " not found.");
        }

        User user = response.getData().get(0);

        PermissionsApi permissionsApi = new PermissionsApi(mtmApiClient);

        Permission permission = new Permission();
        permission.setStatus("ACTIVE");
        permission.setRole("ADMIN");
        permission.setWorkspace(workspace);
        permission.setUser(user);

        System.out.println(
                String.format("try to add %s %s permission to workspace for the user...", permission.getStatus(),
                        permission.getRole()));

        permissionsApi.setPermission(permission, "sync");

        System.out.println("permission added");
    }

    protected Account lookupAccount(String accountName) throws ApiException, net.leanix.dropkit.api.ApiException {
        AccountListResponse response = accountsApi.getAccounts(accountName, null, null, null);
        List<Account> accountsFound = response.getData();
        if (accountsFound == null) {
            throw new RuntimeException("no accounts list returned, status was " + response.getStatus());
        }
        if (accountsFound.size() != 1) {
            throw new RuntimeException("no unique account " + accountName + " found, found " + accountsFound.size() + " matches");
        }

        return accountsFound.get(0);
    }

    protected Contract lookupContract(String accountId, String contractName)
            throws ApiException, net.leanix.dropkit.api.ApiException {
        ContractListResponse response = accountsApi.getContracts(accountId, null, null, null);
        List<Contract> contractsFound = response.getData();
        if (contractsFound == null) {
            throw new RuntimeException("no contracts list returned, status was " + response.getStatus());
        }

        Contract found = null;
        for (Contract crsContract : contractsFound) {
            if (crsContract.getDisplayName() != null && crsContract.getDisplayName().startsWith(contractName)) {
                if (found != null) {
                    throw new RuntimeException(
                            "multiple contracts found with display name '" + contractName + "' for account " + accountId);
                }
                found = crsContract;
            }
        }
        if (found == null) {
            throw new RuntimeException("no contract found with display name '" + contractName + "' for account " + accountId);
        }

        return found;
    }

}
