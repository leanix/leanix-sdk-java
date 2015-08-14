package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConsumersApiTestController extends BaseApiFactSheetTestController
{
    public Map<String, Object> getPropertiesServiceHasConsumers()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
                new TestAttribute("UsageTypeID", "1", "1")
        ));	

        return result;
    }  
}