package net.leanix.api.test.helpers;

import java.util.UUID;

import org.joda.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ApiTokenApi {

    @POST("/services/mtm/v1/apiTokens")
    public Call<PersonalAccessTokenResponse> createApiToken(@Body ApiToken token);

    @DELETE("/services/mtm/v1/apiTokens/{id}")
    public Call<Void> deleteApiToken(@Path("id") UUID id);

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class PersonalAccessTokenResponse {
        private ApiToken data;

        public ApiToken getData() {
            return data;
        }

        public void setData(ApiToken data) {
            this.data = data;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApiToken {
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
