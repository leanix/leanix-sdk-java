package net.leanix.api.test;

import net.leanix.api.ActivitiesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.common.ApiException;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URI;

public class ApiTokenTest {
    @Test
    @Ignore("this is only for helping in developer tests")
    public void fetchToken() throws ApiException {
        ApiClient apiClient = new ApiClientBuilder()
                .withDebugging(true)
            .withBasePath("https://app.leanix.net/dildemo")
            .withPersonalAccessToken("fill me in.")
            .withOAuth2TokenUrl(URI.create("https://svc.leanix.net/services/mtm/v1/oauth2/token"))
            .build();

        ActivitiesApi api = new ActivitiesApi(apiClient);
        api.getActivities(null, null, null, null, null, 1);
    }

}
