package net.leanix.api.test.helpers;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.Instant;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

import java.util.UUID;

public interface PersonalAccessTokenApi {
    @POST("/services/mtm/v1/personalAccessTokens")
    public Call<PersonalAccessTokenResponse> createPersonalAccessToken(@Body PersonalAccessToken token);

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
        private String token;
        private UUID userId;
        private UUID workspaceId;
        private UUID creatorId;
        private Instant expiry;
        private String description;

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

