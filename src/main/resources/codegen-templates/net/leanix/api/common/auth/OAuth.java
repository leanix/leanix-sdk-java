package net.leanix.api.common.auth;

import java.util.List;
import java.util.Map;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.Pair;

public class OAuth implements Authentication {
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) throws ApiException {
        if (accessToken != null) {
            headerParams.put("Authorization", "Bearer " + accessToken);
        }
    }
}
