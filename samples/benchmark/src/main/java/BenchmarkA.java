
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.util.StopWatch;

import net.leanix.api.ResourcesApi;
import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.Resource;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.benchmark.ApiClientFactory;
import net.leanix.benchmark.Helper;
import net.leanix.mtm.api.models.Workspace;

/**
 * Creates a list of services (SERVICE_COUNT) with a list of linked resources (RESOURCE_PER_SERVICE_COUNT)
 * 
 * @author andre
 */
public class BenchmarkA {

    public static void main(String[] args) throws Exception {
        Helper helper = new Helper();
        String numServices = helper.getProperty("services.count", "50");
        String numResourcesPerService = helper.getProperty("resourcesPerServices.count", "5");
        StopWatch stopWatch = new StopWatch(
                String.format("Benchmark A creates %s services withc %s resources/service", numServices, numResourcesPerService));

        try {

            ApiClient apiClient = ApiClientFactory.getApiClient();
            apiClient.addDefaultHeader("X-Api-Update-Relations", "true");

            ServicesApi servicesApi = new ServicesApi(apiClient);
            ResourcesApi resourcesApi = new ResourcesApi(apiClient);

            Workspace workspace = new Workspace();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            workspace.setName("benchmarka" + format.format(new Date()));

            // Todo: Create fresh workspace in MTM

            // Create services
            for (int i = 0; i < Integer.parseInt(numServices); i++) {
                stopWatch.start("Service " + i);
                Service s = new Service();
                s.setName(helper.getUniqueString());
                s.setDescription(helper.getUniqueText(10));

                s = servicesApi.createService(s);
                System.out.println("Create SERVICE " + i + ", name = " + s.getName() + ", id = " + s.getID());

                // Create resources
                for (int x = 0; x < Integer.parseInt(numResourcesPerService); x++) {
                    Resource r = new Resource();
                    r.setName(helper.getUniqueString());
                    r.setDescription(helper.getUniqueText(10));

                    ServiceHasResource shr = new ServiceHasResource();
                    shr.setServiceID(s.getID());
                    shr.setComment("Created by SDK");

                    List<ServiceHasResource> shrList = new ArrayList<>();
                    shrList.add(shr);
                    r.setServiceHasResources(shrList);

                    r = resourcesApi.createResource(r);

                    System.out.println("Create RESOURCE " + i + ", name = " + r.getName() + ", id = " + r.getID());
                }
                stopWatch.stop();
            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
        System.out.println(stopWatch.prettyPrint());
    }
}
