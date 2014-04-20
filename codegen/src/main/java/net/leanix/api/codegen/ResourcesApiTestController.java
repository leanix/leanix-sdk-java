package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ResourcesApiTestController extends BaseApiFactSheetTestController
{
    public Map<String, Object> getPropertiesResourceHasResourceCapabilities()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("IsLeading", new Boolean(true), new Boolean(true))
        ));	

        return result;
    }
    
    public Map<String, Object> getPropertiesResourceHasProvider()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	
        
        result.put("attributesModel",Arrays.asList(
        		new TestAttribute("ObjectCategoryID", "1")
        ));	
        

        return result;
    }    
    

    public Map<String, Object> getPropertiesServiceHasResources()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	
        
        result.put("attributesModel",Arrays.asList(
        		new TestAttribute("ObjectCategoryID", "2")
        ));        

        return result;
    }    
}