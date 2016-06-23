package net.leanix.benchmark;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.joda.time.Duration;
import org.joda.time.Instant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.leanix.api.common.ApiException;
import net.leanix.benchmark.api.PersonalAccessTokenApiImpl;
import net.leanix.benchmark.api.PersonalAccessTokenApiImpl.PersonalAccessTokenResponse;
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
import net.leanix.mtm.api.models.UserResponse;
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
    private final net.leanix.dropkit.apiclient.ApiClient mtmApiClient;
    private final WorkspacesApi workspacesApi;
    private final AccountsApi accountsApi;
    protected UUID apiTokenId;

    private static final Logger logger = LoggerFactory.getLogger(WorkspaceHelper.class);

    public WorkspaceHelper(String workspaceName) {
        super();
        this.workspaceName = workspaceName;

        net.leanix.dropkit.apiclient.ApiClientBuilder builder = new net.leanix.dropkit.apiclient.ApiClientBuilder()
                .withBasePath(ConfigurationProvider.createMtmApiUrl())
                .withTokenProviderHost(ConfigurationProvider.getApiHostName())
                // .withApiToken(ConfigurationProvider.getApiToken())
                .withClientCredentials(ConfigurationProvider.getClientId(), ConfigurationProvider.getClientSecret())
                .withDebugging(true);

        mtmApiClient = builder.build();

        workspacesApi = new WorkspacesApi(mtmApiClient);
        accountsApi = new AccountsApi(mtmApiClient);
    }

    /**
     * Initializes environment and returns apiKey
     * 
     * @throws net.leanix.dropkit.apiclient.ApiException
     * 
     * @throws net.leanix.dropkit.api.ApiException
     * @throws ApiException
     */
    public String initialize() throws net.leanix.dropkit.apiclient.ApiException {

        // create a new workspace with required name
        Account account = lookupAccount(ACCOUNT_NAME);
        Contract contract = lookupContract(account.getId(), CONTRACT_DISPLAY_NAME);

        net.leanix.mtm.api.models.Workspace newWorkspace = new net.leanix.mtm.api.models.Workspace();
        newWorkspace.setStatus(net.leanix.mtm.api.models.Workspace.StatusEnum.ACTIVE);
        newWorkspace.setType(net.leanix.mtm.api.models.Workspace.TypeEnum.DEMO);
        newWorkspace.setContract(contract);
        newWorkspace.setFeatureBundleId(apiSetup);
        newWorkspace.setName(workspaceName);

        WorkspaceResponse response = workspacesApi.createWorkspace(newWorkspace, null);
        Workspace workspace = response.getData();

        logger.info(String.format("Workspace '%s' created, has ID %s", workspace.getName(), workspace.getId()));

        return addUserToWorkspace(account, workspace);
    }

    public void deleteWorkspace() throws net.leanix.dropkit.apiclient.ApiException {

        WorkspaceListResponse workspaceListResponse = workspacesApi.getWorkspaces(workspaceName, null, null, null);
        Workspace workspace = workspaceListResponse.getData().get(0);
        workspace.setStatus(net.leanix.mtm.api.models.Workspace.StatusEnum.BLOCKED);
        workspacesApi.updateWorkspace(workspace.getId(), workspace, null);

        // mtmt
        workspacesApi.deleteWorkspace(workspace.getId());
        System.out.println(String.format("Workspace '%s' deleted.", workspace.getName()));
    }

    protected String addUserToWorkspace(Account account, Workspace workspace) throws net.leanix.dropkit.apiclient.ApiException {
        UsersApi usersApi = new UsersApi(mtmApiClient);

        User u = new User();
        SimpleDateFormat format = new SimpleDateFormat("yyyy'A'MM'A'dd'T'HH'A'mm'A'ss");
        u.setEmail("testjavauser" + format.format(new Date()) + "@meshlab.com");
        u.setUserName(u.getEmail());
        u.setFirstName("Test");
        u.setLastName("Java User");
        u.setRole(net.leanix.mtm.api.models.User.RoleEnum.ACCOUNTUSER);
        u.setStatus(net.leanix.mtm.api.models.User.StatusEnum.ACTIVE);
        net.leanix.mtm.api.models.Account authAccount = new net.leanix.mtm.api.models.Account();
        authAccount.setId(account.getId());
        u.setAccount(authAccount);

        UserResponse userResponse = usersApi.createUser(u);

        User user = userResponse.getData();

        PermissionsApi permissionsApi = new PermissionsApi(mtmApiClient);

        Permission permission = new Permission();
        permission.setStatus(net.leanix.mtm.api.models.Permission.StatusEnum.ACTIVE);
        permission.setRole(net.leanix.mtm.api.models.Permission.RoleEnum.ADMIN);
        permission.setWorkspace(workspace);
        permission.setUser(user);

        logger.debug("add {} {} permission to workspace for the user", permission.getStatus(), permission.getRole());

        permissionsApi.createPermission(permission, true);

        String apiToken = createApiToken(workspace, user);

        return apiToken;
    }

    protected Account lookupAccount(String accountName) throws net.leanix.dropkit.apiclient.ApiException {
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

    protected Contract lookupContract(String accountId, String contractName) throws net.leanix.dropkit.apiclient.ApiException {
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

    protected String createApiToken(Workspace workspace, User user) {
        PersonalAccessTokenApiImpl tokenApi = new PersonalAccessTokenApiImpl(mtmApiClient);

        PersonalAccessTokenApiImpl.PersonalAccessToken token = new PersonalAccessTokenApiImpl.PersonalAccessToken();
        token.setUserId(UUID.fromString(user.getId()));
        token.setWorkspaceId((UUID.fromString(workspace.getId())));
        token.setCreatorId(UUID.fromString(user.getId()));
        token.setExpiry(Instant.now().plus(Duration.standardMinutes(10)));
        token.setDescription("LeanIX-SDK-Java test run API token");

        PersonalAccessTokenResponse tokenResponse;
        try {
            tokenResponse = tokenApi.createPersonalAccessToken(token);
        } catch (net.leanix.dropkit.apiclient.ApiException e) {
            logger.error("failed to create new API-Token", e);
            return null;
        }

        apiTokenId = tokenResponse.getData().getId();
        return tokenResponse.getData().getToken();
    }

}
