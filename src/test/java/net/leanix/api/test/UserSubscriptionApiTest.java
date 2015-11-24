/*
 * The MIT License (MIT)	 
 *
 * Copyright (c) 2015 LeanIX GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package net.leanix.api.test;

import java.util.ArrayList;
import java.util.List;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.Service;
import net.leanix.api.models.User;
import net.leanix.api.models.UserSubscription;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class UserSubscriptionApiTest extends TestBase {

    protected Service newModel() {
        Service model = new Service();
        model.setName("Test Name");
        return model;
    }

    protected User getUser() throws ApiException {
        List<net.leanix.api.models.User> response = this.getUsersApi().getUsers(true);

        return response.get(0);
    }

    @Test
    public void testCreateUserSubscription() throws ApiException {
        Service model = this.newModel();
        Service newModel = this.getServicesApi().createService(model);
        assertNotNull(newModel);
        assertNotNull(newModel.getID());

        UserSubscription sub = new UserSubscription();
        sub.setFactSheetID(newModel.getID());
        sub.setSubscriptionTypeID("2");
        sub.setUserID(this.getUser().getID());
        sub.setRoleDetails(new ArrayList<String>());

        this.getServicesApi().createUserSubscription(newModel.getID(), sub);
    }
}
