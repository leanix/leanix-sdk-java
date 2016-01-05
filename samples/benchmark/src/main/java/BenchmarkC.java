
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
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import javax.xml.bind.JAXBException;

import org.springframework.util.StopWatch;

import net.leanix.api.BusinessCapabilitiesApi;
import net.leanix.api.BusinessObjectsApi;
import net.leanix.api.ConsumersApi;
import net.leanix.api.IfacesApi;
import net.leanix.api.ProcessesApi;
import net.leanix.api.ProjectsApi;
import net.leanix.api.ProvidersApi;
import net.leanix.api.ResourcesApi;
import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.BusinessCapability;
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.Consumer;
import net.leanix.api.models.FactSheetHasIfaceProvider;
import net.leanix.api.models.Iface;
import net.leanix.api.models.IfaceHasBusinessObject;
import net.leanix.api.models.Process;
import net.leanix.api.models.Project;
import net.leanix.api.models.Provider;
import net.leanix.api.models.Resource;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.benchmark.ApiClientFactory;
import net.leanix.benchmark.ConfigurationProvider;
import net.leanix.benchmark.Helper;
import net.leanix.benchmark.performance.ReportBuilder;
import net.leanix.benchmark.performance.TestSuite;

/**
 * Creates a list of services (SERVICE_COUNT) with a list of linked resources (RESOURCE_PER_SERVICE_COUNT)
 * 
 * @author andre
 */
public class BenchmarkC extends BaseBenchmarkTests {

    int numServices = ConfigurationProvider.getServicesCount();
    int numResourcesPerService = ConfigurationProvider.getNumResourcesPerService();
    final StopWatch stopWatch;

    public static void main(String[] args) throws Exception {
        BenchmarkC instance = new BenchmarkC();
        instance.run(instance.stopWatch);
    }

    public BenchmarkC() {
        super();
        stopWatch = new StopWatch(
                String.format("%s creates %s services withc %s resources/service", getClass().getSimpleName(), numServices,
                        numResourcesPerService));
    }

    @Override
    public void runBenchmarkOnWorkspace(StopWatch stopWatch) throws JAXBException {
        try {
            ApiClient apiClient = ApiClientFactory.getApiClient(wsName, apiKey);
            apiClient.addDefaultHeader("X-Api-Update-Relations", "true");
            // allow asynchronous job run
            apiClient.addDefaultHeader("X-Api-Synchronous", "false");

            ServicesApi servicesApi = new ServicesApi(apiClient);
            ResourcesApi resourcesApi = new ResourcesApi(apiClient);
            ConsumersApi consumersApi = new ConsumersApi(apiClient);
            BusinessCapabilitiesApi businessCapabilitiesApi = new BusinessCapabilitiesApi(apiClient);
            ProcessesApi processApi = new ProcessesApi(apiClient);
            ProjectsApi projectApi = new ProjectsApi(apiClient);
            BusinessObjectsApi businessObjectApi = new BusinessObjectsApi(apiClient);
            IfacesApi ifacesApi = new IfacesApi(apiClient);

            Helper h = new Helper(configurationProvider.getRandomSeed());
            // Add consumers (User Group)
            List<Consumer> consumers = new ArrayList<>();
            stopWatch.start("adding Consumers " + Helper.getProperty("consumers.count", "10"));
            for (int i = 0; i < Integer.parseInt(Helper.getProperty("consumers.count", "10")); i++) {
                Consumer c = new Consumer();
                c.setName(h.getUniqueString());
                c.setDescription(h.getUniqueText(10));
                c = consumersApi.createConsumer(c);
                System.out.println(String.format("Create USER GROUP %d, name = %s, id = %s", i, c.getName(), c.getID()));
                consumers.add(c);
            }
            stopWatch.stop();

            // Add provider
            List<Provider> providers = new ArrayList<>();
            stopWatch.start("adding Provider " + Helper.getProperty("provider.count", "2"));
            for (int i = 0; i < Integer.parseInt(Helper.getProperty("provider.count", "2")); i++) {
                Provider model = new Provider();
                model.setName("Provider " + h.getUniqueString());
                model.setDescription(h.getUniqueText(40));
                model = new ProvidersApi(apiClient).createProvider(model);
                System.out.println(String.format("Create PROVIDER %d, name = %s, id = %s", i, model.getName(), model.getID()));
                providers.add(model);
            }
            stopWatch.stop();

            // Add business capability
            List<BusinessCapability> bcs = new ArrayList<>();
            stopWatch.start("adding BusinessCapabilities " + Helper.getProperty("businessCapabilities.count", "8"));
            for (int i = 0; i < Integer.parseInt(Helper.getProperty("businessCapabilities.count", "8")); i++) {
                BusinessCapability bc = new BusinessCapability();
                bc.setName(h.getUniqueString());
                bc.setDescription(h.getUniqueText(10));
                bc = businessCapabilitiesApi.createBusinessCapability(bc);
                System.out.println(String.format("Create BUS. CAPABILITY %d, name = %s, id = %s", i, bc.getName(), bc.getID()));
                bcs.add(bc);
            }
            stopWatch.stop();

            // Add Processes
            List<Process> processes = new ArrayList<>();
            stopWatch.start("adding Processes " + Helper.getProperty("processes.count", "8"));
            for (int i = 0; i < Integer.parseInt(Helper.getProperty("processes.count", "8")); i++) {
                Process process = new Process();
                process.setName(h.getUniqueString());
                process.setDescription(h.getUniqueText(10));
                process = processApi.createProcess(process);
                System.out.println(String.format("Create PROCESS %d, name = %s, id = %s", i, process.getName(), process.getID()));
                processes.add(process);
            }
            stopWatch.stop();

            // Add Projects
            List<Project> projects = new ArrayList<>();
            stopWatch.start("adding Projects " + Helper.getProperty("projects.count", "8"));
            for (int i = 0; i < Integer.parseInt(Helper.getProperty("projects.count", "8")); i++) {
                Project project = new Project();
                project.setName(h.getUniqueString());
                project.setDescription(h.getUniqueText(10));
                project = projectApi.createProject(project);
                System.out.println(String.format("Create PROJECT %d, name = %s, id = %s", i, project.getName(), project.getID()));
                projects.add(project);
            }
            stopWatch.stop();

            // Add Business Objects (Data Objects)
            List<BusinessObject> businessObjects = new ArrayList<>();
            stopWatch.start("adding Data Objects " + Helper.getProperty("businessobjects.count", "6"));
            for (int i = 0; i < Integer.parseInt(Helper.getProperty("businessobjects.count", "6")); i++) {
                BusinessObject businessObject = new BusinessObject();
                businessObject.setName("Data Object " + h.getUniqueString());
                businessObject.setDescription(h.getUniqueText(40));
                businessObject = businessObjectApi.createBusinessObject(businessObject);
                System.out.println(String.format("Create DATA OBJECT %d, name = %s, id = %s", i, businessObject.getName(),
                        businessObject.getID()));
                businessObjects.add(businessObject);
            }
            stopWatch.stop();

            // Add Interfaces assigned with business objects
            List<Iface> interfaces = new ArrayList<>();
            stopWatch.start("adding Interfaces " + numServices);
            for (int i = 0; i < numServices; i++) {
                Iface iface = new Iface();
                iface.setName("IFace " + h.getUniqueString());
                iface.setDescription(h.getUniqueText(40));
                IfaceHasBusinessObject ifaceHasBusinessObject = new IfaceHasBusinessObject();
                ifaceHasBusinessObject.setBusinessObjectID(
                        businessObjects.get(ThreadLocalRandom.current().nextInt(0, businessObjects.size() - 1)).getID());
                iface.setIfaceHasBusinessObjects(Arrays.asList(ifaceHasBusinessObject));
                iface.setInterfaceDirectionID("1");

                iface = ifacesApi.createIface(iface);
                System.out.println(String.format("Create INTERFACE %d, name = %s, id = %s", i, iface.getName(), iface.getID()));
                interfaces.add(iface);
            }
            stopWatch.stop();

            // Create services
            for (int i = 0; i < numServices; i++) {
                stopWatch.start("Service " + i);
                Service s = new Service();
                s.setName(h.getUniqueString());
                s.setDescription(h.getUniqueText(10));
                s.setFactSheetHasLifecycles(h.getRandomLifecycle("2010-01-10", "2020-01-01"));

                if (consumers.size() > 0) {
                    Consumer cur = consumers.get(ThreadLocalRandom.current().nextInt(0, consumers.size() - 1));
                    ServiceHasConsumer shc = new ServiceHasConsumer();
                    shc.setUsageTypeID("1");
                    shc.setConsumerID(cur.getID());
                    List<ServiceHasConsumer> shcList = new ArrayList<>();
                    shcList.add(shc);
                    s.setServiceHasConsumers(shcList);
                }

                if (bcs.size() > 0) {
                    BusinessCapability cur = bcs.get(ThreadLocalRandom.current().nextInt(0, bcs.size() - 1));
                    ServiceHasBusinessCapability shb = new ServiceHasBusinessCapability();
                    shb.setSupportTypeID("1");
                    shb.setBusinessCapabilityID(cur.getID());
                    List<ServiceHasBusinessCapability> shbList = new ArrayList<>();
                    shbList.add(shb);
                    s.setServiceHasBusinessCapabilities(shbList);
                }

                if (processes.size() > 0) {
                    Process process = processes.get(ThreadLocalRandom.current().nextInt(0, processes.size() - 1));
                    ServiceHasProcess shp = new ServiceHasProcess();
                    shp.setProcessID(process.getID());
                    s.setServiceHasProcesses(Arrays.asList(shp));
                }

                if (projects.size() > 0) {
                    Project project = projects.get(ThreadLocalRandom.current().nextInt(0, projects.size() - 1));
                    ServiceHasProject shp = new ServiceHasProject();
                    shp.setProjectID(project.getID());
                    s.setServiceHasProjects(Arrays.asList(shp));
                }
                // TODO rwe:
                if (interfaces.size() > 0) {
                    Iface iface = interfaces.get(i);
                    FactSheetHasIfaceProvider factSheetHasIfaceProvider = new FactSheetHasIfaceProvider();
                    factSheetHasIfaceProvider.setIfaceID(iface.getID());
                    s.setFactSheetHasIfaceProviders(Arrays.asList(factSheetHasIfaceProvider));
                }

                s = servicesApi.createService(s);
                System.out.println("Create SERVICE " + i + ", name = " + s.getName() + ", id = " + s.getID());

                // Create resources (IT Components)
                for (int x = 0; x < numResourcesPerService; x++) {
                    Resource r = new Resource();
                    r.setName(h.getUniqueString());
                    r.setDescription(h.getUniqueText(10));
                    r.setFactSheetHasLifecycles(h.getRandomLifecycle("2012-01-10", "2020-01-01"));

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
            ReportBuilder reportBuilder = new ReportBuilder().forTestClass(getClass());
            TestSuite testSuite = reportBuilder.addErrorTestResult("runBenchmarkOnWorkspace", 0, ex).build();
            writeBenchmarkJUnitResultFile(getClass(), testSuite);
            return;
        }

        // do some output to stdout
        System.out.println(stopWatch.prettyPrint());
        double totalTimeSeconds = stopWatch.getTotalTimeSeconds();
        System.out.println(String.format("Complete Time of Run (+WS Setup) : %.2f s (%d:%02d)", totalTimeSeconds,
                (int) totalTimeSeconds / 60, (int) totalTimeSeconds % 60));
        double timeTestCase = getSumOfLastTasksInSeconds(stopWatch, stopWatch.getTaskCount() - 1);
        System.out.println(String.format("Complete Job processing time     : %.2f s (%d:%02d)", timeTestCase,
                (int) timeTestCase / 60, (int) timeTestCase % 60));
        System.out.println(String.format("Average Time of test for / %d FS : %.3f s", numServices, timeTestCase / numServices));

        // write junit result file used in jenkin's performance plugin
        // TestSuite testSuite = createTestSuiteObjectBasedOnTaskInfo(getClass(),
        // getLastTasks(stopWatch, stopWatch.getTaskCount() - 1));
        ReportBuilder reportBuilder = new ReportBuilder().forTestClass(getClass());
        TestSuite testSuite = reportBuilder
                .addSuccessfulTestResult(String.format("Average time for %d FS", numServices), timeTestCase / numServices)
                .build();

        writeBenchmarkJUnitResultFile(getClass(), testSuite);
    }
}
