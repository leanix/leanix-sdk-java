package net.leanix.api.codegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseApiFactSheetTestController extends BaseApiTestController
{
    public List<TestAttribute> getBaseAttributes()
    {
        return Arrays.asList(
        		new TestAttribute("Alias", "Alias"),
        		new TestAttribute("Description", "Test Description"),
        		new TestAttribute("Reference", "R-10001")
        );	
    }  
    
    public Map<String, Object> getProperties()
    {
        List<TestAttribute> list = new ArrayList<TestAttribute>(this.getBaseAttributes());
        
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("attributes", list);
        result.put("attributesRequired", new ArrayList());

        return result;
    }
}