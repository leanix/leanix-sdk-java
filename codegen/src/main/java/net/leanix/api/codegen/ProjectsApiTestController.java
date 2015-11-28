package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProjectsApiTestController extends BaseApiFactSheetTestController
{
    public Map<String, Object> getPropertiesServiceHasProjects()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	

        return result;
    }
    
    public Map<String, Object> getPropertiesProjectHasProviders()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	

        return result;
    }

    public Map<String, Object> getPropertiesProjectHasResources()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        return result;
    }
}
