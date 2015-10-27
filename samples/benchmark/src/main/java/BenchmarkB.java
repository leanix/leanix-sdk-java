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
import net.leanix.api.BusinessCapabilitiesApi;
import net.leanix.api.ConsumersApi;
import net.leanix.api.ResourcesApi;
import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.BusinessCapability;
import net.leanix.api.models.Consumer;
import net.leanix.api.models.Resource;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.benchmark.ApiClientFactory;
import net.leanix.benchmark.Helper;
import net.leanix.mtm.api.models.Workspace;
import java.util.concurrent.ThreadLocalRandom;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.ServiceHasConsumer;

/**
 * Creates a list of services (SERVICE_COUNT) with a list of linked
 * resources (RESOURCE_PER_SERVICE_COUNT)
 * 
 * @author andre
 */
public class BenchmarkB {
    
    public static void main(String[] args) {
        try {
            Helper h = new Helper();

            ApiClient apiClient = ApiClientFactory.getApiClient();
            apiClient.addDefaultHeader("X-Api-Update-Relations", "true");

            ServicesApi servicesApi = new ServicesApi(apiClient);
            ResourcesApi resourcesApi = new ResourcesApi(apiClient);
            ConsumersApi consumersApi = new ConsumersApi(apiClient);
            BusinessCapabilitiesApi businessCapabilitiesApi = new BusinessCapabilitiesApi(apiClient);
            
            Workspace w = new Workspace();
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            w.setName("benchmarka" + format.format(new Date()));
            
            // Todo: Create fresh workspace in MTM
            
            // Add consumers
            List<Consumer> consumers = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(h.getProperty("consumers.count", "20")); i++) {
                Consumer c = new Consumer();
                c.setName(h.getUniqueString());
                c.setDescription(h.getUniqueText(10));
                c = consumersApi.createConsumer(c);
                consumers.add(c);
            }
            
            // Add business capability
            List<BusinessCapability> bcs = new ArrayList<>();
            for (int i = 0; i < Integer.parseInt(h.getProperty("businessCapabilities.count", "8")); i++) {
                BusinessCapability bc = new BusinessCapability();
                bc.setName(h.getUniqueString());
                bc.setDescription(h.getUniqueText(10));
                bc = businessCapabilitiesApi.createBusinessCapability(bc);
                bcs.add(bc);
            }
            
            // Create services
            for (int i = 0; i < Integer.parseInt(h.getProperty("services.count", "50")); i++) {
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
                
                s = servicesApi.createService(s);
                System.out.println("Create SERVICE " + i + ", name = " + s.getName() + ", id = " + s.getID());
                
                // Create resources
                for (int x = 0; x < Integer.parseInt(h.getProperty("resourcesPerServices.count", "5")); x++) {
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
            }
           
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
