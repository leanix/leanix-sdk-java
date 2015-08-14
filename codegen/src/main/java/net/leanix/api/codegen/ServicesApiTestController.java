package net.leanix.api.codegen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServicesApiTestController extends BaseApiFactSheetTestController
{
    public Map<String, Object> getProperties()
    {
        Map<String, Object> result = new HashMap<String, Object>();
        
        List<TestAttribute> list = new ArrayList<TestAttribute>(this.getBaseAttributes());
        
        list.add(new TestAttribute("Release", "1.0"));
        list.add(new TestAttribute("FunctionalSuitabilityID", "1"));
        list.add(new TestAttribute("FunctionalSuitabilityDescription", "Functional Suitability"));
        list.add(new TestAttribute("BusinessCriticalityID", "1"));
        list.add(new TestAttribute("BusinessCriticalityDescription", "Business Criticality"));
        
        result.put("attributes", list);
        result.put("attributesRequired", new ArrayList());

        return result;
    }
    
    public Map<String, Object> getPropertiesServiceHasBusinessCapabilities()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("SupportTypeID", "2", "2")
        ));	

        return result;
    } 
    
    public Map<String, Object> getPropertiesServiceHasBusinessObjects()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("BusinessObjectRelationID", "1", "2")
        ));	

        return result;
    } 
    
    public Map<String, Object> getPropertiesServiceHasConsumers()
    {    
        HashMap<String, Object> result = new HashMap<String, Object>();  

        result.put("attributes",Arrays.asList(
        		new TestAttribute("UsageTypeID", "1", "1")
        ));	
        
        return result;
    }
    
    public Map<String, Object> getPropertiesServiceHasProcesses()
    {    
        HashMap<String, Object> result = new HashMap<String, Object>();    	
        return result;
    }  
    
    public Map<String, Object> getPropertiesServiceHasProjects()
    {    
        HashMap<String, Object> result = new HashMap<String, Object>();    	
        return result;
    }
    
    public Map<String, Object> getPropertiesServiceHasInterfaces()
    {    
        HashMap<String, Object> result = new HashMap<String, Object>(); 
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("InterfaceDirectionID", "1", "1")
        ));
        
        return result;
    }    
    
    public Map<String, Object> getPropertiesServiceHasResources()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        ));	
        
        result.put("attributesModelRef",Arrays.asList(
        		new TestAttribute("ObjectCategoryID", "1")
        ));        

        return result;
    }     
}