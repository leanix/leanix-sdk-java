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
import net.leanix.api.models.BusinessCapability;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasIfaceProvider;
import net.leanix.api.models.FactSheetHasParent;
import net.leanix.api.models.Iface;
import net.leanix.api.models.Project;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.test.helpers.ActivityAssertionHelper;
import static net.leanix.api.test.helpers.ActivityAssertionHelper.assertActivitiesWithEventType;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author patrick
 */
public class ErrorHandlingTest extends TestBase {

    @Test
    public void createServiceDoesNotCreateServiceOnError() throws Exception {
        boolean exceptionOccurred = false;
        Service service = new Service();
        service.setName("ApplicationA");
        // service = this.getServicesApi().createService(service);

        Project project = new Project();
        project.setName("Project A2");
        project = this.getProjectsApi().createProject(project);

        List<ServiceHasProject> projectList = new ArrayList<>();
        ServiceHasProject projectRelation = new ServiceHasProject();
        projectRelation.setProjectID(project.getID());
        projectList.add(projectRelation);

        service.setServiceHasProjects(projectList);

        List<ServiceHasProcess> processList = new ArrayList<>();
        ServiceHasProcess wrongProcessRelation = new ServiceHasProcess();
        wrongProcessRelation.setProcessID("01234567890");
        processList.add(wrongProcessRelation);

        service.setServiceHasProcesses(processList);

        try {
            service = this.getServicesApi().createService(service);
        } catch (Exception e) {
            exceptionOccurred = true;
        }

        Assert.assertTrue("Exception occurred", exceptionOccurred);
        Assert.assertNull(service.getID());

        List<Service> services = this.getServicesApi().getServices(Boolean.TRUE, "ApplicationA");
        assertEquals("Created services", 0, services.size());

        ActivityStream activities = getActivitiesApi().getActivities(null, null, null, null, null, 0);
        assertActivitiesWithEventType(activities.getData(), "OBJECT_CREATE", 1);
    }

    @Test
    public void updateServiceForBadRelationDoesNotUpdateService() throws Exception {
        boolean exceptionOccurred = false;

        Service service = new Service();
        service.setName("Test Service");
        service.setRelease("1.0");
        service = this.getServicesApi().createService(service);

        Assert.assertNotNull(service);

        List<ServiceHasProcess> processList = new ArrayList<>();
        ServiceHasProcess wrongProcessRelation = new ServiceHasProcess();
        wrongProcessRelation.setServiceID(service.getID());
        wrongProcessRelation.setProcessID("01234567890");
        processList.add(wrongProcessRelation);

        this.getApiClient().addDefaultHeader("X-Api-Update-Relations", "true");

        service.setRelease("2.0");
        service.setServiceHasProcesses(processList);

        try {
            this.getServicesApi().updateService(service.getID(), service);
        } catch (ApiException e) {
            exceptionOccurred = true;
        } finally {
            Assert.assertTrue("Exception occurred", exceptionOccurred);
        }

        refreshSearchIndexForService(service);

        this.getApiClient().addDefaultHeader("X-Api-Update-Relations", "false");

        List<Service> services = this.getServicesApi().getServices(Boolean.TRUE, "Test%20Service");
        assertEquals("Release was not updated", "1.0", services.get(0).getRelease());

        ActivityStream activities = getActivitiesApi().getActivities(null, null, null, null, null, 0);
        assertActivitiesWithEventType(activities.getData(), "OBJECT_UPDATED", 0);
    }

    /**
     * Refreshes the search index for the given service by adding a relation
     * from a new business capability.
     *
     * @param service
     * @throws ApiException
     */
    private void refreshSearchIndexForService(Service service) throws ApiException {
        // Updating business capability related to service to trigger search object refresh
        BusinessCapability busCap = new BusinessCapability();
        busCap.setName("Test Capability");
        List<ServiceHasBusinessCapability> busCapList = new ArrayList<>();
        ServiceHasBusinessCapability busCapRelation = new ServiceHasBusinessCapability();
        busCapRelation.setServiceID(service.getID());
        busCapRelation.setSupportTypeID("2");
        busCapList.add(busCapRelation);

        busCap.setServiceHasBusinessCapabilities(busCapList);

        this.getBusinessCapabilitiesApi().createBusinessCapability(busCap);
    }
}
