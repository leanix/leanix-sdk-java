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

import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.test.helpers.PersonalAccessTokenApi;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.auth.Authentication;
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
import net.leanix.mtm.api.models.User.RoleEnum;
import net.leanix.mtm.api.models.UserResponse;
import net.leanix.mtm.api.models.Workspace;
import net.leanix.mtm.api.models.Workspace.StatusEnum;
import net.leanix.mtm.api.models.Workspace.TypeEnum;
import net.leanix.mtm.api.models.WorkspaceResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.Duration;
import org.joda.time.Instant;
import org.junit.rules.ExternalResource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

import java.io.IOException;
import java.lang.reflect.Field;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Creates a workspace with a permission for testing. Created workspace and corresponding EAM API client is stored as an instance member
 * variable, so it cannot be used for concurrent tests in different workspaces!
 */
public class WorkspaceSetupRule extends ExternalResource {

    private final Logger logger = LoggerFactory.getLogger(WorkspaceSetupRule.class);

    private static final String SYNC_HEADER = "X-Api-Synchronous";

    /**
     * the account's contract to use when creating a workspace
     */
    private static String CONTRACT_DISPLAY_NAME = System.getProperty("contract.displayname", "system eam REGULAR");

    /**
     * account to use when creating a workspace
     */
    private static final String ACCOUNT_NAME = CONTRACT_DISPLAY_NAME.split(" ")[0];;

    protected final net.leanix.dropkit.apiclient.ApiClient mtmApiClient = createMtmApiClient();
    protected final AccountsApi accountsApi = new AccountsApi(mtmApiClient);

    // this is workspace dependent!
    protected Workspace workspace;
    protected ApiClient leanixApiClient;

    protected String apiSetup = "professional-v1";

    protected final ObjectMapper objectMapper;

    public WorkspaceSetupRule() {
        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JodaModule());
        //objectMapper.configure(SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false)
        objectMapper.setDateFormat(new ISO8601DateFormat());
    }

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
        return this.getProperty(key, "");
    }

    protected String getApiUrl(String workspace) {
        return String.format("https://%s/%s/api/v1", getApiHostName(), workspace);
    }

    protected String getApiHostName() {
        return getProperty("api.hostname", null);
    }

    protected String getApiMtmHostName() {
        return getProperty("api.mtm.hostname");
    }

    protected String getClientId() {
        return getProperty("api.clientId", "eam");
    }

    protected String getClientSecret() {
        return getProperty("api.clientSecret");
    }

    protected String getPersonalAccessToken() {
        return getProperty("api.pat");
    }

    protected net.leanix.dropkit.apiclient.ApiClient createMtmApiClient() {
        net.leanix.dropkit.apiclient.ApiClientBuilder builder = new net.leanix.dropkit.apiclient.ApiClientBuilder()
                .withBasePath(String.format("https://%s/services/mtm/v1", getApiHostName()))
                .withTokenProviderHost(getApiHostName())
                //.withPersonalAccessToken(getPersonalAccessToken())
                .withClientCredentials(getClientId(), getClientSecret())
                .withDebugging(false);

        if (StringUtils.isNotEmpty(getApiMtmHostName())) {
            builder.withTokenProviderHost(getApiMtmHostName());
        }

        net.leanix.dropkit.apiclient.ApiClient apiClient = builder.build();
        return apiClient;
    }

    protected ApiClient createLeanixApiClient(String workspaceName, String apiKey, String tokenProviderHost) {
        ApiClientBuilder apiClientBuilder = new ApiClientBuilder()
                .withBasePath(getApiUrl(workspaceName))
                .withPersonalAccessToken(apiKey)
                .withTokenProviderHost(tokenProviderHost);

        ApiClient apiClient = apiClientBuilder.build();
        apiClient.addDefaultHeader(SYNC_HEADER, "true");
        return apiClient;
    }

    public ApiClient getLeanixApiClient() {
        return leanixApiClient;
    }

    @Override
    protected void before() throws Throwable {
        Account account = lookupAccount(ACCOUNT_NAME);
        Contract contract = lookupContract(account.getId(), CONTRACT_DISPLAY_NAME);
        this.workspace = createNewWorkspace(contract.getId());

        String apiKey = addUserToWorkspace(account, workspace);



        this.leanixApiClient = createLeanixApiClient(workspace.getName(), apiKey, getApiMtmHostName());
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
        newWorkspace.setStatus(StatusEnum.ACTIVE);
        newWorkspace.setType(TypeEnum.DEMO);
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
        u.setEmail(String.format("testjavauser-%s-%s@meshlab.com", format.format(new Date()),
                RandomStringUtils.randomAlphanumeric(4)));
        u.setUserName(u.getEmail());
        u.setFirstName("Test");
        u.setLastName("Java User");
        u.setRole(RoleEnum.ACCOUNTUSER);
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

        logger.debug("permission added");

        String apiToken = createApiToken(workspace, user);

        return apiToken;
    }

    protected String createApiToken(Workspace workspace, User user) {
        Retrofit retrofit = getRetrofit(mtmApiClient.getBasePath(), readAccessToken(mtmApiClient));
        PersonalAccessTokenApi tokenApi = retrofit.create(PersonalAccessTokenApi.class);

        PersonalAccessTokenApi.PersonalAccessToken token = new PersonalAccessTokenApi.PersonalAccessToken();
        token.setUserId(UUID.fromString(user.getId()));
        token.setWorkspaceId((UUID.fromString(workspace.getId())));
        token.setCreatorId(UUID.fromString(user.getId()));
        token.setExpiry(Instant.now().plus(Duration.standardMinutes(10)));
        token.setDescription("LeanIX-SDK-Java test run API token");

        retrofit2.Call<PersonalAccessTokenApi.PersonalAccessTokenResponse> tokenResponse = tokenApi.createPersonalAccessToken(token);
        retrofit2.Response<PersonalAccessTokenApi.PersonalAccessTokenResponse> rp;
        try {
            rp = tokenResponse.execute();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (!rp.isSuccessful()) {
            return null;
        }
        token = rp.body().getData();
        return token.getToken();
    }

    private String readAccessToken(net.leanix.dropkit.apiclient.ApiClient apiClient) {
        Authentication auth = apiClient.getAuthentication("token");
        String token;
        try {
            Field tokenField = auth.getClass().getSuperclass().getDeclaredField("accessToken");
            tokenField.setAccessible(true);
            token = (String) tokenField.get(auth);
            tokenField.setAccessible(false);
        }
        catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
        return token;
    }

    private Retrofit getRetrofit(String baseUrl, String accessToken) {

        OkHttpClient.Builder httpClientBuilder = new OkHttpClient.Builder();
//        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
//        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
//        httpClientBuilder.addInterceptor(loggingInterceptor);

        final String bearer = "Bearer " + accessToken;

        httpClientBuilder.addInterceptor(new Interceptor(){
            @Override public Response intercept(Chain chain) throws IOException {
            Request original = chain.request();

            Request.Builder requestBuilder = original.newBuilder()
                    .header("Authorization", bearer)
                    .header("Accept", "application/json")
                    .method(original.method(), original.body());

            Request request = requestBuilder.build();
            return chain.proceed(request);
        }});

        return new Retrofit.Builder()
                .baseUrl(baseUrl+'/')
//                .baseUrl("https://local-svc.leanix.net/")
                .addConverterFactory(JacksonConverterFactory.create(objectMapper))
                .client(httpClientBuilder.build())
                .build();
    }


    protected void deleteWorkspace(Workspace workspace) {
        if (workspace == null || workspace.getId() == null) {
            throw new IllegalArgumentException("Workspace (id) must be set");
        }

        WorkspacesApi workspacesApi = new WorkspacesApi(mtmApiClient);
        try {
            workspace.setStatus(net.leanix.mtm.api.models.Workspace.StatusEnum.BLOCKED);
            workspacesApi.updateWorkspace(workspace.getId(), workspace, null);
            workspacesApi.deleteWorkspace(workspace.getId());
            logger.debug("Workspace deleted = " + workspace.getId());
        } catch (net.leanix.dropkit.apiclient.ApiException e) {
            throw new RuntimeException("Unable to delete workspace with ID = " + workspace.getId(), e);
        }
    }
}
