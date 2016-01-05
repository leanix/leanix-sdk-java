package net.leanix.benchmark;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import net.leanix.api.common.ApiException;
import net.leanix.dropkit.api.Client;
import net.leanix.dropkit.api.ClientFactory;
import net.leanix.dropkit.oauth.OAuth2ClientConfig;
import net.leanix.mtm.api.AccountsApi;
import net.leanix.mtm.api.PermissionsApi;
import net.leanix.mtm.api.UsersApi;
import net.leanix.mtm.api.WorkspacesApi;
import net.leanix.mtm.api.models.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

    private static final Logger logger = LoggerFactory.getLogger(WorkspaceHelper.class);

    public WorkspaceHelper(String workspaceName) {
        super();
        this.workspaceName = workspaceName;
        mtmApiClient = ClientFactory.create(this.getClientConfig());
        workspacesApi = new WorkspacesApi(mtmApiClient);
        accountsApi = new AccountsApi(mtmApiClient);
    }

    protected OAuth2ClientConfig getClientConfig() {
        OAuth2ClientConfig config = new OAuth2ClientConfig();
        config.setBaseUrl(ConfigurationProvider.createMtmApiUrl());
        config.setTokenUrl(ConfigurationProvider.getTokenUrl());
        config.setClientId(ConfigurationProvider.getClientId());
        config.setClientSecret(ConfigurationProvider.getClientSecret());

        return config;
    }

    /**
     * Initializes environment and returns apiKey
     * @throws net.leanix.dropkit.api.ApiException
     * @throws ApiException
     */
    public String initialize() throws net.leanix.dropkit.api.ApiException, ApiException {

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

        logger.info(String.format("Workspace '%s' created, has ID %s", workspace.getName(), workspace.getId()));

        return addUserToWorkspace(account, workspace);
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

    protected String addUserToWorkspace(Account account, Workspace workspace) throws net.leanix.dropkit.api.ApiException {
        UsersApi usersApi = new UsersApi(mtmApiClient);

        User u = new User();
        SimpleDateFormat format = new SimpleDateFormat("yyyy'A'MM'A'dd'T'HH'A'mm'A'ss");
        u.setEmail("testjavauser" + format.format(new Date()) + "@meshlab.com");
        u.setUserName(u.getEmail());
        u.setFirstName("Test");
        u.setLastName("Java User");
        u.setRole("ACCOUNTUSER");
        u.setStatus("ACTIVE");
        AuthenticatedUserAccount authAccount = new AuthenticatedUserAccount();
        authAccount.setId(account.getId());
        u.setAccount(authAccount);

        UserResponse userResponse = usersApi.createUser("", u);

        User user = userResponse.getData();

        PermissionsApi permissionsApi = new PermissionsApi(mtmApiClient);

        Permission permission = new Permission();
        permission.setStatus("ACTIVE");
        permission.setRole("ADMIN");
        permission.setWorkspace(workspace);
        permission.setUser(user);

        logger.debug("add {} {} permission to workspace for the user", permission.getStatus(), permission.getRole());

        permissionsApi.setPermission(permission, true);

        logger.debug("permission added");

        return user.getApiKey();
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
