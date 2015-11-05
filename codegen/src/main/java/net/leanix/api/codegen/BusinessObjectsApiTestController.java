package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BusinessObjectsApiTestController extends BaseApiFactSheetTestController
{
    public Map<String, Object> getPropertiesServiceHasBusinessObjects()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("BusinessObjectRelationID", "1", "2")
        ));	

        return result;
    }

    public Map<String, Object> getPropertiesIfaceHasBusinessObjects()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        return result;
    }
}
