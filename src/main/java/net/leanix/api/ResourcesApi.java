package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasParent;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.IfaceHasResource;
import net.leanix.api.models.ProjectHasResource;
import net.leanix.api.models.Resource;
import net.leanix.api.models.ResourceHasConsumer;
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.models.ResourceHasResourceCapability;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.UserSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ResourcesApi {
  private ApiClient apiClient;

  public ResourcesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ResourcesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasChild
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasChild createFactSheetHasChild(String ID, FactSheetHasChild body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasChild");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasChild> localVarReturnType = new GenericType<FactSheetHasChild>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasDocument
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasDocument createFactSheetHasDocument(String ID, FactSheetHasDocument body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasDocument");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasDocument> localVarReturnType = new GenericType<FactSheetHasDocument>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasLifecycle
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasLifecycle createFactSheetHasLifecycle(String ID, FactSheetHasLifecycle body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasLifecycle");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasLifecycle> localVarReturnType = new GenericType<FactSheetHasLifecycle>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasParent
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasParent createFactSheetHasParent(String ID, FactSheetHasParent body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasParent");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasParent> localVarReturnType = new GenericType<FactSheetHasParent>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasPredecessor
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasPredecessor createFactSheetHasPredecessor(String ID, FactSheetHasPredecessor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasPredecessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasPredecessor> localVarReturnType = new GenericType<FactSheetHasPredecessor>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasRequiredby
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasRequiredby createFactSheetHasRequiredby(String ID, FactSheetHasRequiredby body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasRequiredby");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasRequiredby> localVarReturnType = new GenericType<FactSheetHasRequiredby>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasRequires
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasRequires createFactSheetHasRequires(String ID, FactSheetHasRequires body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasRequires");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasRequires> localVarReturnType = new GenericType<FactSheetHasRequires>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasSuccessor
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasSuccessor createFactSheetHasSuccessor(String ID, FactSheetHasSuccessor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasSuccessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasSuccessor> localVarReturnType = new GenericType<FactSheetHasSuccessor>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return IfaceHasResource
   * @throws ApiException if fails to make API call
   */
  public IfaceHasResource createIfaceHasResource(String ID, IfaceHasResource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createIfaceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/ifaceHasResources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IfaceHasResource> localVarReturnType = new GenericType<IfaceHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ProjectHasResource
   * @throws ApiException if fails to make API call
   */
  public ProjectHasResource createProjectHasResource(String ID, ProjectHasResource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createProjectHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/projectHasResources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ProjectHasResource> localVarReturnType = new GenericType<ProjectHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new IT Component
   * 
   * @param body Message-Body (optional)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource createResource(Resource body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/resources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ResourceHasConsumer
   * @throws ApiException if fails to make API call
   */
  public ResourceHasConsumer createResourceHasConsumer(String ID, ResourceHasConsumer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createResourceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasConsumers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasConsumer> localVarReturnType = new GenericType<ResourceHasConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ResourceHasProvider
   * @throws ApiException if fails to make API call
   */
  public ResourceHasProvider createResourceHasProvider(String ID, ResourceHasProvider body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createResourceHasProvider");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasProviders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasProvider> localVarReturnType = new GenericType<ResourceHasProvider>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ResourceHasResourceCapability
   * @throws ApiException if fails to make API call
   */
  public ResourceHasResourceCapability createResourceHasResourceCapability(String ID, ResourceHasResourceCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createResourceHasResourceCapability");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasResourceCapabilities".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasResourceCapability> localVarReturnType = new GenericType<ResourceHasResourceCapability>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ServiceHasResource
   * @throws ApiException if fails to make API call
   */
  public ServiceHasResource createServiceHasResource(String ID, ServiceHasResource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/serviceHasResources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ServiceHasResource> localVarReturnType = new GenericType<ServiceHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return UserSubscription
   * @throws ApiException if fails to make API call
   */
  public UserSubscription createUserSubscription(String ID, UserSubscription body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createUserSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/userSubscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserSubscription> localVarReturnType = new GenericType<UserSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasChild(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasChild");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasChild");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasDocument(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasDocument");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasDocument");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasLifecycle(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasLifecycle");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasLifecycle");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasParent(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasParent");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasParent");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasPredecessor(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasPredecessor");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasPredecessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasRequiredby(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasRequiredby");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasRequiredby");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasRequires(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasRequires");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasRequires");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetHasSuccessor(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasSuccessor");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasSuccessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteIfaceHasResource(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteIfaceHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteIfaceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/ifaceHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteProjectHasResource(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteProjectHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteProjectHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/projectHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete a IT Component by a given ID
   * 
   * @param ID Unique ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteResource(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteResourceHasConsumer(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteResourceHasConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteResourceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasConsumers/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteResourceHasProvider(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteResourceHasProvider");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteResourceHasProvider");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasProviders/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteResourceHasResourceCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteResourceHasResourceCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteResourceHasResourceCapability");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasResourceCapabilities/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteServiceHasResource(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/serviceHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Delete relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteUserSubscription(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteUserSubscription");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteUserSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasChild
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasChild getFactSheetHasChild(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasChild");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasChild");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasChild> localVarReturnType = new GenericType<FactSheetHasChild>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasChild>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasChild> getFactSheetHasChildren(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasChildren");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasChild>> localVarReturnType = new GenericType<List<FactSheetHasChild>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasDocument
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasDocument getFactSheetHasDocument(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasDocument");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasDocument");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasDocument> localVarReturnType = new GenericType<FactSheetHasDocument>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasDocument>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasDocument> getFactSheetHasDocuments(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasDocuments");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasDocument>> localVarReturnType = new GenericType<List<FactSheetHasDocument>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasLifecycle
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasLifecycle getFactSheetHasLifecycle(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasLifecycle");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasLifecycle");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasLifecycle> localVarReturnType = new GenericType<FactSheetHasLifecycle>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasLifecycle>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasLifecycle> getFactSheetHasLifecycles(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasLifecycles");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasLifecycle>> localVarReturnType = new GenericType<List<FactSheetHasLifecycle>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasParent
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasParent getFactSheetHasParent(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasParent");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasParent");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasParent> localVarReturnType = new GenericType<FactSheetHasParent>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasParent>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasParent> getFactSheetHasParents(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasParents");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasParent>> localVarReturnType = new GenericType<List<FactSheetHasParent>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasPredecessor
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasPredecessor getFactSheetHasPredecessor(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasPredecessor");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasPredecessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasPredecessor> localVarReturnType = new GenericType<FactSheetHasPredecessor>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasPredecessor>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasPredecessor> getFactSheetHasPredecessors(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasPredecessors");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasPredecessor>> localVarReturnType = new GenericType<List<FactSheetHasPredecessor>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasRequiredby>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasRequiredby> getFactSheetHasRequiredByAll(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasRequiredByAll");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasRequiredby>> localVarReturnType = new GenericType<List<FactSheetHasRequiredby>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasRequiredby
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasRequiredby getFactSheetHasRequiredby(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasRequiredby");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasRequiredby");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasRequiredby> localVarReturnType = new GenericType<FactSheetHasRequiredby>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasRequires
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasRequires getFactSheetHasRequires(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasRequires");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasRequires");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasRequires> localVarReturnType = new GenericType<FactSheetHasRequires>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasRequires>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasRequires> getFactSheetHasRequiresAll(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasRequiresAll");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasRequires>> localVarReturnType = new GenericType<List<FactSheetHasRequires>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasSuccessor
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasSuccessor getFactSheetHasSuccessor(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasSuccessor");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasSuccessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasSuccessor> localVarReturnType = new GenericType<FactSheetHasSuccessor>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasSuccessor>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasSuccessor> getFactSheetHasSuccessors(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasSuccessors");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<FactSheetHasSuccessor>> localVarReturnType = new GenericType<List<FactSheetHasSuccessor>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return IfaceHasResource
   * @throws ApiException if fails to make API call
   */
  public IfaceHasResource getIfaceHasResource(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getIfaceHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getIfaceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/ifaceHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IfaceHasResource> localVarReturnType = new GenericType<IfaceHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<IfaceHasResource>
   * @throws ApiException if fails to make API call
   */
  public List<IfaceHasResource> getIfaceHasResources(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getIfaceHasResources");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/ifaceHasResources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<IfaceHasResource>> localVarReturnType = new GenericType<List<IfaceHasResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ProjectHasResource
   * @throws ApiException if fails to make API call
   */
  public ProjectHasResource getProjectHasResource(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getProjectHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getProjectHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/projectHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ProjectHasResource> localVarReturnType = new GenericType<ProjectHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ProjectHasResource>
   * @throws ApiException if fails to make API call
   */
  public List<ProjectHasResource> getProjectHasResources(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getProjectHasResources");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/projectHasResources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<ProjectHasResource>> localVarReturnType = new GenericType<List<ProjectHasResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read a IT Component by a given ID
   * 
   * @param ID Unique ID (required)
   * @param relations If set to true, all relations of the Fact Sheet are fetched as well. Fetching all relations can be slower. Default: false. (optional, default to false)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource getResource(String ID, Boolean relations) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relations", relations));
    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ResourceHasConsumer
   * @throws ApiException if fails to make API call
   */
  public ResourceHasConsumer getResourceHasConsumer(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResourceHasConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getResourceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasConsumers/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasConsumer> localVarReturnType = new GenericType<ResourceHasConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ResourceHasConsumer>
   * @throws ApiException if fails to make API call
   */
  public List<ResourceHasConsumer> getResourceHasConsumers(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResourceHasConsumers");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasConsumers".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<ResourceHasConsumer>> localVarReturnType = new GenericType<List<ResourceHasConsumer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ResourceHasProvider
   * @throws ApiException if fails to make API call
   */
  public ResourceHasProvider getResourceHasProvider(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResourceHasProvider");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getResourceHasProvider");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasProviders/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasProvider> localVarReturnType = new GenericType<ResourceHasProvider>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ResourceHasProvider>
   * @throws ApiException if fails to make API call
   */
  public List<ResourceHasProvider> getResourceHasProviders(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResourceHasProviders");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasProviders".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<ResourceHasProvider>> localVarReturnType = new GenericType<List<ResourceHasProvider>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ResourceHasResourceCapability>
   * @throws ApiException if fails to make API call
   */
  public List<ResourceHasResourceCapability> getResourceHasResourceCapabilities(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResourceHasResourceCapabilities");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasResourceCapabilities".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<ResourceHasResourceCapability>> localVarReturnType = new GenericType<List<ResourceHasResourceCapability>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ResourceHasResourceCapability
   * @throws ApiException if fails to make API call
   */
  public ResourceHasResourceCapability getResourceHasResourceCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getResourceHasResourceCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getResourceHasResourceCapability");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasResourceCapabilities/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasResourceCapability> localVarReturnType = new GenericType<ResourceHasResourceCapability>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all IT Component
   * 
   * @param relations If set to true, all relations of the Fact Sheet are fetched as well. Fetching all relations can be slower. Default: false. (optional, default to false)
   * @param filter Full-text filter (optional)
   * @return List<Resource>
   * @throws ApiException if fails to make API call
   */
  public List<Resource> getResources(Boolean relations, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/resources".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relations", relations));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<Resource>> localVarReturnType = new GenericType<List<Resource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ServiceHasResource
   * @throws ApiException if fails to make API call
   */
  public ServiceHasResource getServiceHasResource(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/serviceHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ServiceHasResource> localVarReturnType = new GenericType<ServiceHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasResource>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasResource> getServiceHasResources(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasResources");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/serviceHasResources".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<ServiceHasResource>> localVarReturnType = new GenericType<List<ServiceHasResource>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return UserSubscription
   * @throws ApiException if fails to make API call
   */
  public UserSubscription getUserSubscription(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getUserSubscription");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getUserSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserSubscription> localVarReturnType = new GenericType<UserSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<UserSubscription>
   * @throws ApiException if fails to make API call
   */
  public List<UserSubscription> getUserSubscriptions(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getUserSubscriptions");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/userSubscriptions".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<List<UserSubscription>> localVarReturnType = new GenericType<List<UserSubscription>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasChild
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasChild updateFactSheetHasChild(String ID, String relationID, FactSheetHasChild body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasChild");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasChild");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasChild> localVarReturnType = new GenericType<FactSheetHasChild>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasDocument
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasDocument updateFactSheetHasDocument(String ID, String relationID, FactSheetHasDocument body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasDocument");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasDocument");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasDocument> localVarReturnType = new GenericType<FactSheetHasDocument>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasLifecycle
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasLifecycle updateFactSheetHasLifecycle(String ID, String relationID, FactSheetHasLifecycle body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasLifecycle");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasLifecycle");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasLifecycle> localVarReturnType = new GenericType<FactSheetHasLifecycle>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasParent
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasParent updateFactSheetHasParent(String ID, String relationID, FactSheetHasParent body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasParent");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasParent");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasParent> localVarReturnType = new GenericType<FactSheetHasParent>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasPredecessor
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasPredecessor updateFactSheetHasPredecessor(String ID, String relationID, FactSheetHasPredecessor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasPredecessor");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasPredecessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasPredecessor> localVarReturnType = new GenericType<FactSheetHasPredecessor>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasRequiredby
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasRequiredby updateFactSheetHasRequiredby(String ID, String relationID, FactSheetHasRequiredby body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasRequiredby");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasRequiredby");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasRequiredby> localVarReturnType = new GenericType<FactSheetHasRequiredby>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasRequires
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasRequires updateFactSheetHasRequires(String ID, String relationID, FactSheetHasRequires body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasRequires");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasRequires");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasRequires> localVarReturnType = new GenericType<FactSheetHasRequires>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasSuccessor
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasSuccessor updateFactSheetHasSuccessor(String ID, String relationID, FactSheetHasSuccessor body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasSuccessor");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasSuccessor");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<FactSheetHasSuccessor> localVarReturnType = new GenericType<FactSheetHasSuccessor>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return IfaceHasResource
   * @throws ApiException if fails to make API call
   */
  public IfaceHasResource updateIfaceHasResource(String ID, String relationID, IfaceHasResource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateIfaceHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateIfaceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/ifaceHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<IfaceHasResource> localVarReturnType = new GenericType<IfaceHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ProjectHasResource
   * @throws ApiException if fails to make API call
   */
  public ProjectHasResource updateProjectHasResource(String ID, String relationID, ProjectHasResource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateProjectHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateProjectHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/projectHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ProjectHasResource> localVarReturnType = new GenericType<ProjectHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update a IT Component by a given ID
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return Resource
   * @throws ApiException if fails to make API call
   */
  public Resource updateResource(String ID, Resource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<Resource> localVarReturnType = new GenericType<Resource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ResourceHasConsumer
   * @throws ApiException if fails to make API call
   */
  public ResourceHasConsumer updateResourceHasConsumer(String ID, String relationID, ResourceHasConsumer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateResourceHasConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateResourceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasConsumers/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasConsumer> localVarReturnType = new GenericType<ResourceHasConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ResourceHasProvider
   * @throws ApiException if fails to make API call
   */
  public ResourceHasProvider updateResourceHasProvider(String ID, String relationID, ResourceHasProvider body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateResourceHasProvider");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateResourceHasProvider");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasProviders/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasProvider> localVarReturnType = new GenericType<ResourceHasProvider>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ResourceHasResourceCapability
   * @throws ApiException if fails to make API call
   */
  public ResourceHasResourceCapability updateResourceHasResourceCapability(String ID, String relationID, ResourceHasResourceCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateResourceHasResourceCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateResourceHasResourceCapability");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/resourceHasResourceCapabilities/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ResourceHasResourceCapability> localVarReturnType = new GenericType<ResourceHasResourceCapability>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ServiceHasResource
   * @throws ApiException if fails to make API call
   */
  public ServiceHasResource updateServiceHasResource(String ID, String relationID, ServiceHasResource body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasResource");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasResource");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/serviceHasResources/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ServiceHasResource> localVarReturnType = new GenericType<ServiceHasResource>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return UserSubscription
   * @throws ApiException if fails to make API call
   */
  public UserSubscription updateUserSubscription(String ID, String relationID, UserSubscription body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateUserSubscription");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateUserSubscription");
    }
    
    // create path and map variables
    String localVarPath = "/resources/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()))
      .replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<UserSubscription> localVarReturnType = new GenericType<UserSubscription>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
