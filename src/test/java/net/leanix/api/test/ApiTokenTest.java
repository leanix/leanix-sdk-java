package net.leanix.api.test;

import net.leanix.api.ActivitiesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.common.ApiException;

import org.junit.Ignore;
import org.junit.Test;

import java.net.URI;

/**
 * Created by dlatt on 07/06/16.
 */
public class ApiTokenTest {
    @Test
    @Ignore
    public void fetchToken() throws ApiException {
        ApiClient apiClient = new ApiClientBuilder()
                .withDebugging(true)
            .withBasePath("https://app.leanix.net/dildemo")
            .withPersonalAccessToken("3KvNEj3hfeh9Fb4RmZmnakf7yOAR6fHgndUJ9GDC")
            .withOAuth2TokenUrl(URI.create("https://svc.leanix.net/services/mtm/v1/oauth2/token"))
            .build();

        ActivitiesApi api = new ActivitiesApi(apiClient);
        api.getActivities(null, null, null, null, null, 1);
    }

}
