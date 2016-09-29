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
import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiClientBuilder;
import net.leanix.api.models.Resource;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasResource;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AddResourceToServiceTest {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.systemDefault());

    public static void main(String[] args) {
        try {
            ApiClient apiClient = new ApiClientBuilder()
                    .withBasePath("https://app.leanix.net/demo/api/v1")
                    .withTokenProviderHost("svc.leanix.net")
                    .withApiToken("NOnrUpMXEh87xbDCYkLfrBmfbzLOFznjqVqEbNMp")
                    .build();

            ServicesApi servicesApi = new ServicesApi(apiClient);
            ResourcesApi resourcesApi = new ResourcesApi(apiClient);

            String prefix =  formatter.format(Instant.now()) + "_";

            // create Application
            Service s1 = new Service();
            s1.name(prefix + "App Test 1");
            s1 = servicesApi.createService(s1);

            // create IT Components
            Resource r1 = new Resource();
            r1.setName(prefix + "ITC Test 1");
            r1 = resourcesApi.createResource(r1);
            Resource r2 = new Resource();
            r2.setName(prefix + "ITC Test 2");
            r2 = resourcesApi.createResource(r2);

            // add IT Components to the Application
            ServiceHasResource s1r1 = new ServiceHasResource();
            s1r1.setServiceID(s1.getID());
            s1r1.setResourceID(r1.getID());
            servicesApi.createServiceHasResource(s1.getID(), s1r1);
            ServiceHasResource s1r2 = new ServiceHasResource();
            s1r2.setServiceID(s1.getID());
            s1r2.setResourceID(r2.getID());
            servicesApi.createServiceHasResource(s1.getID(), s1r2);

            // list resulting Application linked to two IT Components
            s1 = servicesApi.getService(s1.getID(), true);
            System.out.println(s1);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
