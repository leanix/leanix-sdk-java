/*
 * The MIT License
 *
 * Copyright 2016 LeanIX GmbH
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

import net.leanix.api.UsersApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.ConsumersApi;
import net.leanix.api.models.*;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.mtm.api.IdmApi;
import net.leanix.mtm.api.WorkspacesApi;
import net.leanix.mtm.api.models.*;
import net.leanix.mtm.api.models.User;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ConsumersSync {
    public static String DETAIL_ROLE = "Survey Owner";
    public static String SUBSCRIPTION_TYPE = "2";
    public static String WORKSPACE_ID = "f4aef31b-47f5-4f1b-8b1d-561e7b6a4228";
    public static String CURRENT_USER = "cio@meshlab.de";

    /**
     * Finds the subscription with the detail role. If it is not found, then null is returned
     *
     * @param consumer
     * @return
     */
    public static UserSubscription getSubcription(Consumer consumer, String detailRole) {
        List<UserSubscription> subscriptions = consumer.getUserSubscriptions();

        for (UserSubscription sub : subscriptions) {
            List<String> details = sub.getRoleDetails();
            for (String role : details) {
                if (detailRole.equals(role)) {
                    return sub;
                }
            }
        }

        return null;
    }

    public static ApiClient getClient() {
        return new ApiClientBuilder()
                .withBasePath("https://local-eam.leanix.net/demo/api/v1")
                .withTokenProviderHost("local-eam.leanix.net")
                .withApiToken("wDGmFPXc2Or4Ja8BpcVmweGZfkKkKwjzxLk6WxTV")
                .build();
    }

    public static net.leanix.dropkit.apiclient.ApiClient getMtmClient() {
        return new net.leanix.dropkit.apiclient.ApiClientBuilder()
                .withBasePath("https://local-eam.leanix.net/services/mtm/v1")
                .withTokenProviderHost("local-eam.leanix.net")
                .withApiToken("wDGmFPXc2Or4Ja8BpcVmweGZfkKkKwjzxLk6WxTV")
                .build();
    }

    /**
     * Fetches a user by its email address
     *
     * @return
     * @throws ApiException
     */
    public static User getUserByEmail(String email) throws ApiException {
        WorkspacesApi workspacesApi = new WorkspacesApi(getMtmClient());

        PermissionListResponse permissions = workspacesApi.getPermissions(WORKSPACE_ID, "", email, "", 1, 100, "");

        for (Permission p : permissions.getData()) {
            return p.getUser();
        }

        return null;
    }

    public static User inviteUser(User actingUser, String email) throws ApiException {
        Workspace w = new Workspace();
        w.setId(WORKSPACE_ID);

        Permission p = new Permission();
        p.setWorkspace(w);
        p.setRole(Permission.RoleEnum.MEMBER);

        User u = new User();
        u.setEmail(email);

        Invitation invitation = new Invitation();
        invitation.setHost(actingUser);
        invitation.setWorkspace(w);
        invitation.setPermission(p);
        invitation.setUser(u);

        IdmApi idmApi = new IdmApi(getMtmClient());
        UserResponse userResponse = idmApi.invite(invitation);

        return userResponse.getData();
    }


    public static void main(String[] args) {
        try {

            ApiClient apiClient = getClient();
            ConsumersApi consumersApi = new ConsumersApi(apiClient);
            List<Consumer> consumers = consumersApi.getConsumers(true, "");

            User actingUser = getUserByEmail(CURRENT_USER);

            for (Consumer c : consumers) {
                System.out.println("User Group = " + c.getDisplayName());

                UserSubscription sub = getSubcription(c, DETAIL_ROLE);

                if (sub != null) {
                    System.out.println("Found Subscription " + DETAIL_ROLE + " with ID = " + sub.getID());
                }

                if (!StringUtils.isEmpty(c.getEmail())) {
                    // If a subscription exists, we first delete it
                    if (sub != null) {
                        System.out.println("Delete subscription with ID = " + sub.getID());
                        consumersApi.deleteUserSubscription(c.getID(), sub.getID());
                    }
                    
                    // Make sure a subscription with the give email and detail role exists
                    User user = getUserByEmail(c.getEmail());

                    // Step 1: No users exists - first needs to be created
                    if (user == null) {
                        user = inviteUser(actingUser, c.getEmail());
                    }

                    List<String> roleDetails = new ArrayList<>();
                    roleDetails.add(DETAIL_ROLE);

                    // Step 2: Create subscription
                    UserSubscription us = new UserSubscription();
                    us.setFactSheetID(c.getID());
                    us.setSubscriptionTypeID(SUBSCRIPTION_TYPE);
                    us.setUserID(user.getId());
                    us.setRoleDetails(roleDetails);

                    consumersApi.createUserSubscription(c.getID(), us);

                } else {

                    // Delete subscription if exists - no email set
                    if (sub != null) {
                        System.out.println("Delete subscription with ID = " + sub.getID());
                        consumersApi.deleteUserSubscription(c.getID(), sub.getID());
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
