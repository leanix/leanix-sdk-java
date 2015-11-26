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
import net.leanix.api.models.Project;
import net.leanix.api.models.Service;
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
    public void testCorrectErrorHandling() throws Exception {
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
            System.out.println("caught: " + e.getMessage());
        }

        Assert.assertTrue("Exception occurred", exceptionOccurred);
        Assert.assertNull(service.getID());
        
        List<Service> services = this.getServicesApi().getServices(Boolean.TRUE, "ApplicationA");
        assertEquals("Created services", 0, services.size());

        ActivityStream activities = getActivitiesApi().getActivities(null, null, null, null, null, 0);
        assertActivitiesWithEventType(activities.getData(), "OBJECT_CREATE", 1);
    }
}
