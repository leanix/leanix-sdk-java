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

import net.leanix.api.ConsumersApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.models.Consumer;
import net.leanix.api.models.UserSubscription;
import net.leanix.dropkit.apiclient.ApiException;
import net.leanix.mtm.api.IdmApi;
import net.leanix.mtm.api.WorkspacesApi;
import net.leanix.mtm.api.models.Invitation;
import net.leanix.mtm.api.models.Permission;
import net.leanix.mtm.api.models.PermissionListResponse;
import net.leanix.mtm.api.models.User;
import net.leanix.mtm.api.models.UserResponse;
import net.leanix.mtm.api.models.Workspace;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConsumersSync {
    /**
     * Base path for accessing the workspace via the EAM REST API.
     */
    public static final String EAM_BASE_PATH = "https://local-eam.leanix.net/demo/api/v1";

    /**
     * Base path for accessing MTM via its REST API.
     */
    public static final String MTM_BASE_PATH = "https://local-svc.leanix.net/services/mtm/v1";

    /**
     * Hostname of the oauth2 token provicer.
     */
    public static final String TOKEN_PROVIDER_HOST = "local-svc.leanix.net";

    /**
     * API token to access the workspace via the REST APIs.
     */
    public static final String API_TOKEN = "ns4KbY9B4OFcWHL3h5VxjhTq5bdKByPQdACpgfLO";

    /**
     * The subscription type to use (1 "Accountable", 2 is "Responsible", 3 is "Observer").
     */
    public static String SUBSCRIPTION_TYPE_ID = "2";

    /**
     * The role detail to put on the subscription.
     *     NOTE: the role detail for the subscription type must already exist in the workspace
     *     (could be done via the UserRoleDetails API or in the GUI)
     */
    public static String ROLE_DETAIL = "Survey Owner";

    /**
     * The workspace UUID of the workspace given in the EAM base path.
     */
    public static String WORKSPACE_ID = "bcf8512d-eb8f-424e-87ec-b9e95838b8b6";

    /**
     * The email address of the user running this program (owner of the used API token).
     */
    public static String CURRENT_USER = "cio@meshlab.de";

    private final ApiClient eamApiClient;
    private final net.leanix.dropkit.apiclient.ApiClient mtmApiClient;

    private final ConsumersApi consumersApi;
    private final WorkspacesApi workspacesApi;
    private final IdmApi idmApi;


    public ConsumersSync() {
        eamApiClient = new ApiClientBuilder()
                .withBasePath(EAM_BASE_PATH)
                .withTokenProviderHost(TOKEN_PROVIDER_HOST)
                .withApiToken(API_TOKEN)

                .build();

        mtmApiClient = new net.leanix.dropkit.apiclient.ApiClientBuilder()
                .withBasePath(MTM_BASE_PATH)
                .withTokenProviderHost(TOKEN_PROVIDER_HOST)
                .withApiToken(API_TOKEN)
                .build();

        consumersApi = new ConsumersApi(eamApiClient);

        workspacesApi = new WorkspacesApi(mtmApiClient);
        idmApi = new IdmApi(mtmApiClient);
    }

    /**
     * Finds the subscription with the detail role. If it is not found, then null is returned
     *
     * @param consumer
     * @return
     */
    public UserSubscription removeDetailRoleFromSubscriptions(Consumer consumer, String preserveUserUUID) throws net.leanix.api.common.ApiException {
        List<UserSubscription> subscriptions = consumer.getUserSubscriptions();

        UserSubscription preserved = null;
        for (UserSubscription subscription : subscriptions) {
            if (subscription.getUserUUID().equals(preserveUserUUID)
                    && subscription.getSubscriptionTypeID().equals(SUBSCRIPTION_TYPE_ID)) {
                // this is the subscription for the relevant user
                preserved = subscription;
            }
            else {
                List<String> details = subscription.getRoleDetails();
                if (details.remove(ROLE_DETAIL)) {
                    // role was present
                    if (details.isEmpty()) {
                        // was the only role detail, remove subscription
                        System.out.println("\tdeleting subscription with only one role detail, user " + subscription.getUserID());
                        consumersApi.deleteUserSubscription(consumer.getID(), subscription.getID());
                    } else {
                        // more role on subscription present, just update with removed role
                        System.out.println("\tremoving role detail from subscription, user " + subscription.getUserID());
                        consumersApi.updateUserSubscription(consumer.getID(), subscription.getID(), subscription);
                    }
                }
            }
        }
        return preserved;
    }

    /**
     * Fetches a user by its email address
     *
     * @return
     * @throws ApiException
     */
    public User getUserByEmail(String email) throws ApiException {
        PermissionListResponse permissions = workspacesApi.getPermissions(WORKSPACE_ID, "", email, "", 1, 100, "");

        for (Permission p : permissions.getData()) {
            return p.getUser();
        }

        return null;
    }

    public User inviteUser(User actingUser, String email) throws ApiException {
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

        UserResponse userResponse = idmApi.invite(invitation);

        return userResponse.getData();
    }

    public static void main(String[] args) throws Exception {
        ConsumersSync consumersSync = new ConsumersSync();
        consumersSync.run(args);
    }

    public void run(String[] args) throws net.leanix.api.common.ApiException, ApiException {
        List<Consumer> consumers = consumersApi.getConsumers(true, "");

        User actingUser = getUserByEmail(CURRENT_USER);

        for (Consumer consumer : consumers) {
            System.out.println("User Group = " + consumer.getDisplayName());

            if (StringUtils.isEmpty(consumer.getEmail())) {
                System.out.println("\tno email set -- checking if role details must be removed");

                removeDetailRoleFromSubscriptions(consumer, null);
                continue;
            }

            User user = getUserByEmail(consumer.getEmail());

            // Make sure a subscription with the give email and detail role exists

            // Step 1: No users exists - first needs to be created
            String preservingUserUUID;
            if (user == null) {
                System.out.println("\tuser with email address does not exist -- inviting user");
                preservingUserUUID = null;
                user = inviteUser(actingUser, consumer.getEmail());
            }
            else {
                preservingUserUUID = user.getId();
            }

            // Step 2: remove roleDetail from all subscriptions not matching the user
            UserSubscription existingSubscription = removeDetailRoleFromSubscriptions(consumer, preservingUserUUID);

            // Step 3: Create/update subscription
            if (existingSubscription == null) {
                System.out.println("\tuser is not subscribed -- adding subscription with role detail");

                UserSubscription userSubscription = new UserSubscription();
                userSubscription.setFactSheetID(consumer.getID());
                userSubscription.setUserID(user.getId());
                userSubscription.setSubscriptionTypeID(SUBSCRIPTION_TYPE_ID);
                userSubscription.setRoleDetails(Collections.singletonList(ROLE_DETAIL));

                consumersApi.createUserSubscription(consumer.getID(), userSubscription);
            }
            else if (!existingSubscription.getRoleDetails().contains(ROLE_DETAIL)) {
                    System.out.println("\trole detail " + ROLE_DETAIL + " missing -- updating subscription");
                    List<String> newRoleDetails = new ArrayList<>(existingSubscription.getRoleDetails());
                    newRoleDetails.add(ROLE_DETAIL);
                    existingSubscription.setRoleDetails(newRoleDetails);

                    consumersApi.updateUserSubscription(existingSubscription.getFactSheetID(),
                            existingSubscription.getID(), existingSubscription);
            }
        }
    }
}
