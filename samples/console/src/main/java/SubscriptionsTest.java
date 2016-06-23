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

import net.leanix.api.ResourcesApi;
import net.leanix.api.UsersApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.models.Resource;
import net.leanix.api.models.User;
import net.leanix.api.models.UserSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubscriptionsTest {
    public static void main(String[] args) {
        try {
            ApiClient apiClient = new ApiClientBuilder()
                    .withBasePath("https://app.leanix.net/demo/api/v1")
                    .withTokenProviderHost("svc.leanix.net")
                    .withApiToken("NOnrUpMXEh87xbDCYkLfrBmfbzLOFznjqVqEbNMp")
                    .build();

            ResourcesApi resourcesApi = new ResourcesApi(apiClient);
            UsersApi usersApi = new UsersApi(apiClient);

            List<User> users = usersApi.getUsers(false);
            Map<String, User> lookup = new HashMap<>();
            for (User u : users) {
                lookup.put(u.getID(), u);
            }
            System.out.println("Found " + users.size() + " users");

            List<String> missing = new ArrayList<>();

            List<Resource> resources = resourcesApi.getResources(true, "");
            for (Resource cur : resources) {
                System.out.println("Application: " + cur.getDisplayName());

                for (UserSubscription sub : cur.getUserSubscriptions()) {
                    // Get via Lookup
                    boolean missingUser = false;
                    User lookupUser = lookup.get(sub.getUserID());
                    if (lookupUser != null)
                        System.out.println("  Lookup: " + lookupUser.getEmail());
                    else {
                        System.out.println("  ERROR: Not found in lookup" + sub.getUserID());
                        missingUser = true;
                    }

                    // Get via API
                    User u = usersApi.getUser(sub.getUserID(), false);
                    if (u != null) {
                        System.out.println("  User: " + u.getEmail());
                        if (missingUser)
                            missing.add(u.getEmail() + " " + u.getID() + " " + u.getUuid());
                    } else {
                        System.out.println("  ERROR: Not found " + sub.getUserID());
                    }
                }
            }

            System.out.println("# of missing items = " + missing.size());
            for (String s : missing) {
                System.out.println("  Missing: " + s);
            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
