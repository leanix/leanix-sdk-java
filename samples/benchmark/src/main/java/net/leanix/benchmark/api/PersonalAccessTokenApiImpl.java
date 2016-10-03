package net.leanix.benchmark.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.ws.rs.core.GenericType;

import org.joda.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import net.leanix.dropkit.apiclient.ApiClient;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.dropkit.apiclient.Pair;

public class PersonalAccessTokenApiImpl {

    private final ApiClient apiClient;

    public PersonalAccessTokenApiImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public PersonalAccessTokenResponse createPersonalAccessToken(PersonalAccessToken body) throws ApiException {
        // @POST("/services/mtm/v1/apiTokens")
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling createPermission");
        }

        // create path and map variables
        String localVarPath = "/apiTokens".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "token" };

        GenericType<PersonalAccessTokenResponse> localVarReturnType = new GenericType<PersonalAccessTokenResponse>() {};
        return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    public void deletePersonalAccessToken(UUID id) throws ApiException {
        // @DELETE("/services/mtm/v1/apiTokens/{id}")
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getPermission");
        }

        // create path and map variables
        String localVarPath = "/apiTokens/{id}".replaceAll("\\{format\\}", "json")
                .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
                "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "token" };

        GenericType<Void> localVarReturnType = new GenericType<Void>() {};
        apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams,
                localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PersonalAccessTokenResponse {
        private PersonalAccessToken data;

        public PersonalAccessToken getData() {
            return data;
        }

        public void setData(PersonalAccessToken data) {
            this.data = data;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PersonalAccessToken {
        private UUID id;
        private String token;
        private UUID userId;
        private UUID workspaceId;
        private UUID creatorId;
        private Instant expiry;
        private String description;

        public UUID getId() {
            return id;
        }

        public void setId(UUID id) {
            this.id = id;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public UUID getWorkspaceId() {
            return workspaceId;
        }

        public void setWorkspaceId(UUID workspaceId) {
            this.workspaceId = workspaceId;
        }

        public UUID getUserId() {
            return userId;
        }

        public void setUserId(UUID userId) {
            this.userId = userId;
        }

        public Instant getExpiry() {
            return expiry;
        }

        public void setExpiry(Instant expiry) {
            this.expiry = expiry;
        }

        public UUID getCreatorId() {
            return creatorId;
        }

        public void setCreatorId(UUID creatorId) {
            this.creatorId = creatorId;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

}
