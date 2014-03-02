package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ProvidersApiTestController extends BaseApiTestController
{
    public Map<String, Object> getPropertiesProjectHasProviders()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	

        return result;
    }  
    
    public Map<String, Object> getPropertiesResourceHasProvider()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	
        
        result.put("attributesModelRef",Arrays.asList(
        		new TestAttribute("ObjectCategoryID", "2")
        ));        

        return result;
    }
  
}