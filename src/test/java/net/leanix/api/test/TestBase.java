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

import net.leanix.api.BusinessCapabilitiesApi;
import net.leanix.api.BusinessObjectsApi;
import net.leanix.api.ConsumersApi;
import net.leanix.api.DocumentsApi;
import net.leanix.api.IfacesApi;
import net.leanix.api.ProcessesApi;
import net.leanix.api.ProjectsApi;
import net.leanix.api.ProvidersApi;
import net.leanix.api.ResourceCapabilitiesApi;
import net.leanix.api.ResourcesApi;
import net.leanix.api.ServicesApi;
import net.leanix.api.UserRoleDetailsApi;
import net.leanix.api.UsersApi;

public class TestBase extends NotSuiteBasedTestBase {

    protected ServicesApi getServicesApi() {
        return new ServicesApi(getApiClient());
    }

    protected BusinessCapabilitiesApi getBusinessCapabilitiesApi() {
        return new BusinessCapabilitiesApi(getApiClient());
    }

    protected ConsumersApi getConsumersApi() {
        return new ConsumersApi(getApiClient());
    }

    protected ProvidersApi getProvidersApi() {
        return new ProvidersApi(getApiClient());
    }

    protected ResourcesApi getResourcesApi() {
        return new ResourcesApi(getApiClient());
    }

    protected BusinessObjectsApi getBusinessObjectsApi() {
        return new BusinessObjectsApi(getApiClient());
    }

    protected ResourceCapabilitiesApi getResourceCapabilitiesApi() {
        return new ResourceCapabilitiesApi(getApiClient());
    }

    protected ProjectsApi getProjectsApi() {
        return new ProjectsApi(getApiClient());
    }

    protected ProcessesApi getProcessesApi() {
        return new ProcessesApi(getApiClient());
    }

    protected DocumentsApi getDocumentsApi() {
        return new DocumentsApi(getApiClient());
    }

    protected UsersApi getUsersApi() {
        return new UsersApi(getApiClient());
    }

    protected IfacesApi getIfacesApi() {
        return new IfacesApi(getApiClient());
    }
    
    protected UserRoleDetailsApi getUserRoleDetailApi() {
        return new UserRoleDetailsApi(getApiClient());
    }
}
