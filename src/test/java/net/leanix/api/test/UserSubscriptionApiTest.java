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
import net.leanix.api.models.UserRoleDetail;
import net.leanix.api.models.UserSubscription;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author andre
 */
public class UserSubscriptionApiTest extends TestBase {
    static String SUBSCRIPTION_TYPE_ID = "2"; // Responsible
    
    protected Service createService(String name) throws ApiException {
        Service model = new Service();
        model.setName(name);
        return this.getServicesApi().createService(model);
    }

    protected User getUser() throws ApiException {
        List<net.leanix.api.models.User> response = this.getUsersApi().getUsers(true);

        return response.get(0);
    }
    
    protected UserRoleDetail createUserRoleDetail(String roleName) throws ApiException {
        UserRoleDetail userRoleDetail = new UserRoleDetail();
        userRoleDetail.setName(roleName);
        userRoleDetail.setSubscriptionTypeID(UserSubscriptionApiTest.SUBSCRIPTION_TYPE_ID);
        
        return this.getUserRoleDetailApi().createUserRoleDetail(userRoleDetail);
    }

    /**
     * Creates a new Service and User Subscription
     * @throws ApiException 
     */
    @Test
    public void testCreateUserSubscriptionWithoutUserRoleDetails() throws ApiException {
        Service newModel = this.createService("Service A");
        assertNotNull(newModel);
        assertNotNull(newModel.getID());
      
        UserSubscription sub = new UserSubscription();
        sub.setFactSheetID(newModel.getID());
        sub.setSubscriptionTypeID(UserSubscriptionApiTest.SUBSCRIPTION_TYPE_ID);
        sub.setUserID(this.getUser().getID());

        this.getServicesApi().createUserSubscription(newModel.getID(), sub);
        
        Service fetchedService = this.getServicesApi().getService(newModel.getID(), Boolean.TRUE);
        assertNotNull(fetchedService.getUserSubscriptions());
        assertEquals(1, fetchedService.getUserSubscriptions().size());
        assertEquals("2", fetchedService.getUserSubscriptions().get(0).getSubscriptionTypeID());
        assertNotNull(fetchedService.getUserSubscriptions().get(0).getRoleDetails());
        assertEquals(0, fetchedService.getUserSubscriptions().get(0).getRoleDetails().size());
    }    
    
    /**
     * Creates a new Service and User Subscription with User Role Details
     * @throws ApiException 
     */
    @Test
    public void testCreateUserSubscriptionWithUserRoleDetails() throws ApiException {
        Service newModel = this.createService("Service B");
        assertNotNull(newModel);
        assertNotNull(newModel.getID());
        
        UserRoleDetail userRoleDetail = this.createUserRoleDetail("IT Owner");
        
        List<String> userRoleDetails = new ArrayList<>();
        userRoleDetails.add(userRoleDetail.getName());

        UserSubscription sub = new UserSubscription();
        sub.setFactSheetID(newModel.getID());
        sub.setSubscriptionTypeID(UserSubscriptionApiTest.SUBSCRIPTION_TYPE_ID);
        sub.setUserID(this.getUser().getID());
        sub.setRoleDetails(userRoleDetails);

        this.getServicesApi().createUserSubscription(newModel.getID(), sub);
        
        Service fetchedService = this.getServicesApi().getService(newModel.getID(), Boolean.TRUE);
        assertNotNull(fetchedService.getUserSubscriptions());
        assertEquals(1, fetchedService.getUserSubscriptions().size());
        assertEquals("2", fetchedService.getUserSubscriptions().get(0).getSubscriptionTypeID());
        assertNotNull(fetchedService.getUserSubscriptions().get(0).getRoleDetails());
        assertEquals(1, fetchedService.getUserSubscriptions().get(0).getRoleDetails().size());
        assertEquals(userRoleDetail.getName(), fetchedService.getUserSubscriptions().get(0).getRoleDetails().get(0));
    }
    
    /**
     * Creates a new Service and User Subscription with User Role Details and updates afterwards
     * @throws ApiException 
     */
    @Test
    public void testCreateUserSubscriptionWithUserRoleDetailsAndUpdate() throws ApiException {
        Service newModel = this.createService("Service C");
        assertNotNull(newModel);
        assertNotNull(newModel.getID());
        
        UserRoleDetail userRoleDetail = this.createUserRoleDetail("IT Owner 2");
        
        List<String> userRoleDetails = new ArrayList<>();
        userRoleDetails.add(userRoleDetail.getName());

        UserSubscription sub = new UserSubscription();
        sub.setFactSheetID(newModel.getID());
        sub.setSubscriptionTypeID(UserSubscriptionApiTest.SUBSCRIPTION_TYPE_ID);
        sub.setUserID(this.getUser().getID());
        sub.setRoleDetails(userRoleDetails);

        this.getServicesApi().createUserSubscription(newModel.getID(), sub);
        
        Service fetchedService = this.getServicesApi().getService(newModel.getID(), Boolean.TRUE);
        assertNotNull(fetchedService.getUserSubscriptions());
        assertEquals(1, fetchedService.getUserSubscriptions().size());
        assertEquals("2", fetchedService.getUserSubscriptions().get(0).getSubscriptionTypeID());
        assertNotNull(fetchedService.getUserSubscriptions().get(0).getRoleDetails());
        assertEquals(1, fetchedService.getUserSubscriptions().get(0).getRoleDetails().size());
        assertEquals(userRoleDetail.getName(), fetchedService.getUserSubscriptions().get(0).getRoleDetails().get(0));
        
        UserRoleDetail userRoleDetailNew = this.createUserRoleDetail("IT Responsible 2");
        userRoleDetails.add(userRoleDetailNew.getName());
        
        UserSubscription toBeUpdated = fetchedService.getUserSubscriptions().get(0);
        toBeUpdated.setRoleDetails(userRoleDetails);
        
        this.getServicesApi().updateUserSubscription(newModel.getID(), toBeUpdated.getID(), toBeUpdated);
        
        // Now we should have two user role details
        Service updatedService = this.getServicesApi().getService(newModel.getID(), Boolean.TRUE);
        assertEquals(2, fetchedService.getUserSubscriptions().get(0).getRoleDetails().size());
    }
}
