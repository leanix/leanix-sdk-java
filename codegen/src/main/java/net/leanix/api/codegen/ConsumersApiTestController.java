package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ConsumersApiTestController extends BaseApiTestController
{
    public Map<String, Object> getPropertiesServiceHasConsumers()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	

        return result;
    }  
}