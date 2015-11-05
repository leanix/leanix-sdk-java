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
}
