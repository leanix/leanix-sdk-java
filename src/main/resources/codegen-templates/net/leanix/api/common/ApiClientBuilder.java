package net.leanix.api.common;

import java.net.URI;

/**
 * Convenient Builder classed which helps to create and setup a new {@linkplain ApiClient} instance.
 * 
 * <pre>
 * e.g. Create a ApiClient for metrics service using a personal access token for authorization:
 * 
 * String host = "test-app.leanix.net";
 * ApiClient apiClient = new ApiClientBuilder()
 *              .withBasePath(String.format("https://%s/services/metrics/v1", host))
 *              .withTokenProviderHost(host)
 *              .withPersonalAccessToken("my Personal Access Token")
 *              .withDebugging(true).build();
 * </pre>
 * 
 * @author ralfwehner
 *
 */
public class ApiClientBuilder {

    private String basePath;

    private URI oauth2TokenUri;

    private String clientId;
    private String clientSecret;

    private String personalAccessToken;

    private String apiKey;

    private boolean debugging = false;

    public ApiClient build() {

        ApiClient apiClient = new ApiClient();

        apiClient.setDebugging(debugging);
        if (personalAccessToken != null && !personalAccessToken.isEmpty()) {
            apiClient.setPersonalAccessToken(personalAccessToken, oauth2TokenUri);
        } else if (clientId != null && clientSecret != null) {
            apiClient.setClientCredentials(clientId, clientSecret, oauth2TokenUri);
        } else if (apiKey != null) {
            apiClient.setApiKey(apiKey);
        }
        apiClient.setBasePath(basePath);

        return apiClient;
    }

    /**
     * Set the base url that is used to access your service. EG: <code>https://test-app.leanix.net/services/metrics/v1</code>
     * 
     * @param basePath
     * @return
     */
    public ApiClientBuilder withBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * Specifies all urls needed to get an access token based on given host name and common url naming convention.
     * 
     * @param host
     * @return
     */
    public ApiClientBuilder withTokenProviderHost(String host) {
        withOAuth2TokenUrl(URI.create(String.format("https://%s/services/mtm/v1/oauth2/token", host)));
        return this;
    }

    /**
     * Sets your client Id and client Secret.
     * 
     * @param clientId
     * @param clientSecret
     * @return
     */
    public ApiClientBuilder withClientCredentials(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        return this;
    }

    /**
     * Set the personal access token that is used to retrieve an access token.
     * 
     * @param personalAccessToken
     * @return
     */
    public ApiClientBuilder withPersonalAccessToken(String personalAccessToken) {
        this.personalAccessToken = personalAccessToken;
        return this;
    }

    /**
     * Sets the url that is used when a new access token will be fetched with specified client id and client secret.
     * 
     * @param uri
     * @return
     */
    public ApiClientBuilder withOAuth2TokenUrl(URI uri) {
        this.oauth2TokenUri = uri;
        return this;
    }

    public ApiClientBuilder withDebugging(boolean debugging) {
        this.debugging = debugging;
        return this;
    }

    public ApiClientBuilder withApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
}
