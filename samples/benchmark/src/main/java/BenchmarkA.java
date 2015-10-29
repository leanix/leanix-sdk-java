
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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.util.StopWatch;

import net.leanix.api.ResourcesApi;
import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.Resource;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.benchmark.ApiClientFactory;
import net.leanix.benchmark.ConfigurationProvider;
import net.leanix.benchmark.Helper;

/**
 * Creates a list of services (SERVICE_COUNT) with a list of linked resources (RESOURCE_PER_SERVICE_COUNT)
 * 
 * @author andre
 */
public class BenchmarkA extends BaseBenchmarkTests {

    int numServices = ConfigurationProvider.getServicesCount();
    int numResourcesPerService = ConfigurationProvider.getNumResourcesPerService();
    final StopWatch stopWatch;

    public static void main(String[] args) throws Exception {
        BenchmarkA instance = new BenchmarkA();
        instance.run(instance.stopWatch);
    }

    public BenchmarkA() {
        super();
        stopWatch = new StopWatch(
                String.format("%s creates %s services withc %s resources/service", getClass().getSimpleName(), numServices,
                        numResourcesPerService));
    }

    @Override
    public void runBenchmarkOnWorkspace(StopWatch stopWatch) throws JAXBException {

        try {
            ApiClient apiClient = ApiClientFactory.getApiClient(wsName);
            apiClient.addDefaultHeader("X-Api-Update-Relations", "true");

            ServicesApi servicesApi = new ServicesApi(apiClient);
            ResourcesApi resourcesApi = new ResourcesApi(apiClient);

            // Create services
            Helper helper = new Helper(configurationProvider.getRandomSeed());
            for (int i = 0; i < numServices; i++) {
                stopWatch.start("Service " + i);
                Service service = new Service();
                service.setName(helper.getUniqueString());
                service.setDescription(helper.getUniqueText(10));

                service = servicesApi.createService(service);
                configurationProvider.increaseSeed();
                System.out.println("Create SERVICE " + i + ", name = " + service.getName() + ", id = " + service.getID());

                // Create resources
                for (int x = 0; x < numResourcesPerService; x++) {
                    Resource r = new Resource();
                    r.setName(helper.getUniqueString());
                    r.setDescription(helper.getUniqueText(10));

                    ServiceHasResource shr = new ServiceHasResource();
                    shr.setServiceID(service.getID());
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
            ex.printStackTrace();
        }
        
        // do some output to stdout
        System.out.println(stopWatch.prettyPrint());
        double totalTimeSeconds = stopWatch.getTotalTimeSeconds();
        System.out.println(String.format("Complete Time of Run (+WS Setup) : %.2f s (%d:%02d)", totalTimeSeconds,
                (int) totalTimeSeconds / 60, (int) totalTimeSeconds % 60));
        double timeTestCase = getSumOfLastTasksInSeconds(stopWatch, stopWatch.getTaskCount() - 1);
        System.out.println(String.format("Complete Job processing time     : %.2f s (%d:%02d)", timeTestCase,
                (int) timeTestCase / 60, (int) timeTestCase % 60));
        System.out.println(String.format("Average Time / FS                : %.3f s", timeTestCase / numServices));

        // write junit result file used in jenkin's performance plugin
        writeBenchmarkJUnitResultFile(getClass(), getLastTasks(stopWatch, stopWatch.getTaskCount() - 1));
    }

}
