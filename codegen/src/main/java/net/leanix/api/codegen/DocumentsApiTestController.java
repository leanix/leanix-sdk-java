package net.leanix.api.codegen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentsApiTestController extends BaseApiTestController
{
    public Map<String, Object> getProperties()
    {
        Map<String, Object> result = new HashMap<String, Object>();
        
        List<TestAttribute> list = new ArrayList<TestAttribute>();
        list.add(new TestAttribute("Url", "http://www.heise.de"));
        
        result.put("attributes", list);
        result.put("attributesRequired", list);

        return result;
    } 
}