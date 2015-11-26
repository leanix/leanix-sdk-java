/*
 * The MIT License
 *
 * Copyright 2015 LeanIX GmbH.
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
package net.leanix.api.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.Activity;
import net.leanix.api.models.ActivityStream;
import net.leanix.api.models.FactSheetHasIfaceProvider;
import net.leanix.api.models.Iface;
import net.leanix.api.models.Service;
import static net.leanix.api.test.helpers.ActivityAssertionHelper.assertActivitiesForFactSheet;
import static net.leanix.api.test.helpers.ActivityAssertionHelper.assertActivitiesWithEventType;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author patrick
 */
public class ActivitiesApiTest extends TestBase {

    @Test
    @Ignore
    public void testNoActivitiesReturnsEmptyList() throws Exception {
        ActivityStream activities = getAllActivitiesFromApi();
        assertEquals(0, activities.getCount(), 0.001);
        assertEquals(0, activities.getData().size());
    }

    @Test
    public void testAllActivitiesCreatedAfterFactSheetActions() throws Exception {
        List<Activity> activities;
        Service service = createService("TestApplication");

        activities = getActivitiesFromApiForFactSheets("TestApplication");
        assertActivitiesWithEventType(activities, "OBJECT_CREATE", 1);

        service.setName("TestApplicationRenamed");
        this.getServicesApi().updateService(service.getID(), service);

        activities = getActivitiesFromApiForFactSheets("TestApplicationRenamed");
        assertActivitiesWithEventType(activities, "OBJECT_UPDATE", 1);

        this.getServicesApi().deleteService(service.getID());
        activities = getActivitiesFromApiForFactSheets("TestApplicationRenamed");
        assertActivitiesWithEventType(activities, "OBJECT_ARCHIVED", 1);

    }

    @Test
    public void testActivitiesAreReturnedAfterRelationCreation() throws Exception {
        Service service = createService("TestApplication2");
        Iface iface = createIface("TestIface2");

        FactSheetHasIfaceProvider provider = new FactSheetHasIfaceProvider();
        provider.setFactSheetID(service.getID());
        provider.setIfaceID(iface.getID());

        this.getServicesApi()
                .createFactSheetHasIfaceProvider(service.getID(), provider);

        List<Activity> activities = getActivitiesFromApiForFactSheets("TestApplication2", "TestIface2");

        assertActivitiesForFactSheet(activities, "TestApplication2", 2);
        assertActivitiesForFactSheet(activities, "TestIface2", 2);
        assertActivitiesWithEventType(activities, "OBJECT_CREATE", 2);
        assertActivitiesWithEventType(activities, "OBJECT_RELATION_CREATE", 2);
    }

    private Service createService(final String factSheetName) throws ApiException {
        Service model = new Service();
        model.setName(factSheetName);
        return this.getServicesApi().createService(model);
    }

    private Iface createIface(final String factSheetName) throws ApiException {
        Iface model = new Iface();
        model.setName(factSheetName);
        return this.getIfacesApi().createIface(model);
    }

    private ActivityStream getAllActivitiesFromApi() throws ApiException {
        ActivityStream activities = getActivitiesApi().getActivities(null, null, null, null, null, 0);
        return activities;
    }

    private List<Activity> filterByNames(ActivityStream activities, String... names) throws ApiException {
        List<Activity> resultList = new ArrayList<>();
        List<String> nameList = Arrays.asList(names);

        for (Activity activity : activities.getData()) {
            String factSheetName = activity.getFactSheet().getName();
            System.out.println("found activity for: " + factSheetName);
            System.out.println(" -- event type: " + activity.getEventType());
            if (nameList.contains(factSheetName)) {
                resultList.add(activity);
                System.out.println("filtered activity for: " + factSheetName);
            }
        }

        return resultList;
    }

    private List<Activity> getActivitiesFromApiForFactSheets(String... names) throws ApiException {
        ActivityStream activities = getAllActivitiesFromApi();
        return filterByNames(activities, names);
    }
}
