package net.leanix.api.codegen;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ServicesApiTestController extends BaseApiTestController
{
    public Map<String, Object> getProperties()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("Release", "1.0"),
        		new TestAttribute("FunctionalSuitabilityID", "1"),
        		new TestAttribute("FunctionalSuitabilityDescription", "Functional Suitability"),
        		new TestAttribute("BusinessCriticalityID", "1"),
        		new TestAttribute("BusinessCriticalityDescription", "Business Criticality")
        ));	

        return result;
    }
    
    public Map<String, Object> getPropertiesServiceHasBusinessCapabilities()
    {
        HashMap<String, Object> result = new HashMap<String, Object>();
        
        result.put("attributes",Arrays.asList(
        		new TestAttribute("IsLeading", new Boolean(true), new Boolean(true))
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