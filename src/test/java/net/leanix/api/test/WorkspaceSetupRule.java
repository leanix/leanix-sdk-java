/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2015 LeanIX GmbH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.leanix.api.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.leanix.api.common.ApiClient;
import net.leanix.dropkit.api.ApiException;
import net.leanix.dropkit.api.Client;
import net.leanix.dropkit.api.ClientFactory;
import net.leanix.dropkit.oauth.FlowException;
import net.leanix.dropkit.oauth.OAuth2ClientConfig;
import net.leanix.mtm.api.AccountsApi;
import net.leanix.mtm.api.PermissionsApi;
import net.leanix.mtm.api.UsersApi;
import net.leanix.mtm.api.WorkspacesApi;
import net.leanix.mtm.api.models.Account;
import net.leanix.mtm.api.models.AccountListResponse;
import net.leanix.mtm.api.models.AuthenticatedUserAccount;
import net.leanix.mtm.api.models.Contract;
import net.leanix.mtm.api.models.ContractListResponse;
import net.leanix.mtm.api.models.Permission;
import net.leanix.mtm.api.models.User;
import net.leanix.mtm.api.models.UserResponse;
import net.leanix.mtm.api.models.Workspace;
import net.leanix.mtm.api.models.WorkspaceResponse;

/**
 * Creates a workspace with a permission for testing. Created workspace and
 * corresponding EAM API client is stored as an instance member variable, so it
 * cannot be used for concurrent tests in different workspaces!
 */
public class WorkspaceSetupRule extends ExternalResource {

    private final Logger logger = LoggerFactory.getLogger(WorkspaceSetupRule.class);

    private static final String SYNC_HEADER = "X-Api-Synchronous";
    /**
     * account to use when creating a workspace
     */
    private static final String ACCOUNT_NAME = "leanix";

    /**
     * the account's contract to use when creating a workspace
     */
    private static final String CONTRACT_DISPLAY_NAME = "leanix eam REGULAR";

    protected final Client mtmApiClient = createMtmApiClient();
    protected final AccountsApi accountsApi = new AccountsApi(mtmApiClient);

    // this is workspace dependent!
    protected Workspace workspace;
    protected ApiClient leanixApiClient;

    protected String apiSetup = "professional-v1";

    protected String getProperty(String key, String defaultValue) {
        String value = System.getProperty(key);
        if (value == null && defaultValue == null) {
            throw new IllegalArgumentException("Property " + key + " not set and no default given");
        }

        if (value == null) {
            value = defaultValue;
        }

        return value;
    }

    protected String getProperty(String key) {
        return this.getProperty(key, null);
    }

    protected String createApiUrl(String workspace) {
        return this.getProperty("api.baseurl") + "/" + workspace + "/api/" + this.getProperty("api.version", "v1");
    }

    protected String createMtmApiUrl() {
        return this.getProperty("api.mtm.baseurl") + "/services/mtm/" + this.getProperty("api.mtm.version", "v1");
    }

    protected OAuth2ClientConfig getClientConfig() {
        OAuth2ClientConfig config = new OAuth2ClientConfig();
        config.setBaseUrl(createMtmApiUrl());
        config.setTokenUrl(getTokenUrl());
        config.setClientId(getClientId());
        config.setClientSecret(getClientSecret());

        return config;
    }

    protected Client createMtmApiClient() {
        Client client = ClientFactory.create(this.getClientConfig(), false);
        // may add a header here via client.addDefaultHeader("test-hdr", "val1");
        return client;
    }

    protected String getTokenUrl() {
        return getProperty("api.tokenUrl");
    }

    protected String getClientId() {
        return getProperty("api.clientId");
    }

    protected String getClientSecret() {
        return getProperty("api.clientSecret");
    }

    protected ApiClient createLeanixApiClient(String workspaceName, String apiKey) throws FlowException {
        ApiClient apiClient = new ApiClient();
        apiClient.setEnableHttpLogging(false);
        apiClient.addDefaultHeader(SYNC_HEADER, "true");
        apiClient.setBasePath(createApiUrl(workspaceName));
        apiClient.setApiKey(apiKey);

        return apiClient;
    }

    public ApiClient getLeanixApiClient() {
        return leanixApiClient;
    }

    public Client getMtmApiClient() {
        return mtmApiClient;
    }

    @Override
    protected void before() throws Throwable {
        Account account = lookupAccount(ACCOUNT_NAME);
        Contract contract = lookupContract(account.getId(), CONTRACT_DISPLAY_NAME);
        this.workspace = createNewWorkspace(contract.getId());

        String apiKey = addUserToWorkspace(account, workspace);

        this.leanixApiClient = createLeanixApiClient(workspace.getName(), apiKey);
    }

    // cannot delete workspaces due to referential integrity constraints already immediately after creation of the workspace
    @Override
    protected void after() {
        this.deleteWorkspace(this.workspace);
    }

    protected Account lookupAccount(String accountName) throws ApiException {
        AccountListResponse response = accountsApi.getAccounts(accountName, null, null, null);
        List<Account> accountsFound = response.getData();
        if (accountsFound == null) {
            throw new RuntimeException("no accounts list returned, status was " + response.getStatus());
        }

        if (accountsFound.size() == 0) {
            throw new RuntimeException("No accounts retrieved matching name " + accountName);
        }

        Account searchedAccount = null;

        for (Account accountFound : accountsFound) {
            if (accountFound.getName().equals(accountName)) {
                searchedAccount = accountFound;
                break;
            }
        }

        if (searchedAccount == null) {
            throw new RuntimeException("No account found with name " + accountName);
        }

        return searchedAccount;
    }

    protected Contract lookupContract(String accountId, String contractName) throws ApiException {
        ContractListResponse response = accountsApi.getContracts(accountId, null, null, null);
        List<Contract> contractsFound = response.getData();
        if (contractsFound == null) {
            throw new RuntimeException("no contracts list returned, status was " + response.getStatus());
        }

        Contract found = null;
        for (Contract crsContract : contractsFound) {
            if (crsContract.getDisplayName() != null && crsContract.getDisplayName().startsWith(contractName)) {
                if (found != null) {
                    throw new RuntimeException("multiple contracts found with display name '" + contractName + "' for account " + accountId);
                }
                found = crsContract;
            }
        }
        if (found == null) {
            throw new RuntimeException("no contract found with display name '" + contractName + "' for account " + accountId);
        }

        return found;
    }

    protected Workspace createNewWorkspace(String contractId) throws Exception {
        WorkspacesApi workspacesApi = new WorkspacesApi(mtmApiClient);

        SimpleDateFormat format = new SimpleDateFormat("yyyy'A'MM'A'dd'T'HH'A'mm'A'ss");
        String newWorkspaceName = "testjava" + format.format(new Date());
        logger.debug("creating new test workspace {} using contract {}", newWorkspaceName, contractId);

        Contract contract = new Contract();
        contract.setId(contractId);
        Account account = lookupAccount(ACCOUNT_NAME);
        contract = lookupContract(account.getId(), CONTRACT_DISPLAY_NAME);

        Workspace newWorkspace = new Workspace();
        newWorkspace.setStatus("ACTIVE");
        newWorkspace.setType("DEMO");
        newWorkspace.setContract(contract);
        newWorkspace.setFeatureBundleId(this.apiSetup);
        newWorkspace.setName(newWorkspaceName);

        WorkspaceResponse response = workspacesApi.createWorkspace(newWorkspace, null);
        Workspace workspace = response.getData();

        logger.debug("workspace {} created, has ID {}", workspace.getName(), workspace.getId());

        return workspace;
    }

    protected String addUserToWorkspace(Account account, Workspace workspace) throws ApiException {
        UsersApi usersApi = new UsersApi(mtmApiClient);

        User u = new User();
        SimpleDateFormat format = new SimpleDateFormat("yyyy'A'MM'A'dd'T'HH'A'mm'A'ss");
        u.setEmail(String.format("testjavauser-%s-%s@meshlab.com", format.format(new Date()), RandomStringUtils.randomAlphanumeric(4)));
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

    protected void deleteWorkspace(Workspace workspace) {
        if (workspace == null || workspace.getId() == null) {
            throw new IllegalArgumentException("Workspace (id) must be set");
        }

        WorkspacesApi workspacesApi = new WorkspacesApi(mtmApiClient);
        try {
            workspace.setStatus("BLOCKED");
            workspacesApi.updateWorkspace(workspace.getId(), workspace, null);
            workspacesApi.deleteWorkspace(workspace.getId());
            logger.debug("Workspace deleted = " + workspace.getId());
        } catch (ApiException e) {
            throw new RuntimeException("Unable to delete workspace with ID = " + workspace.getId(), e);
        }
    }
}
