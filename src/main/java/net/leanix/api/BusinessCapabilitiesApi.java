package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.BusinessCapability;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasParent;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.ProcessHasBusinessCapability;
import net.leanix.api.models.ProjectHasBusinessCapability;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.UserSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BusinessCapabilitiesApi {
  private ApiClient apiClient;

  public BusinessCapabilitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BusinessCapabilitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Create a new Bus. Capability
   * 
   * @param body Message-Body (optional)
   * @return BusinessCapability
   * @throws ApiException if fails to make API call
   */
  public BusinessCapability createBusinessCapability(BusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/businessCapabilities".replaceAll("\\{format\\}","json");

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

    
    GenericType<BusinessCapability> localVarReturnType = new GenericType<BusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json")
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
   * @return ProcessHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ProcessHasBusinessCapability createProcessHasBusinessCapability(String ID, ProcessHasBusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createProcessHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/processHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProcessHasBusinessCapability> localVarReturnType = new GenericType<ProcessHasBusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ProjectHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ProjectHasBusinessCapability createProjectHasBusinessCapability(String ID, ProjectHasBusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createProjectHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/projectHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProjectHasBusinessCapability> localVarReturnType = new GenericType<ProjectHasBusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ServiceHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ServiceHasBusinessCapability createServiceHasBusinessCapability(String ID, ServiceHasBusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/serviceHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasBusinessCapability> localVarReturnType = new GenericType<ServiceHasBusinessCapability>() {};
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
    String localVarPath = "/businessCapabilities/{ID}/userSubscriptions".replaceAll("\\{format\\}","json")
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
   * Delete a Bus. Capability by a given ID
   * 
   * @param ID Unique ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBusinessCapability(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteProcessHasBusinessCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteProcessHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteProcessHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/processHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteProjectHasBusinessCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteProjectHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteProjectHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/projectHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteServiceHasBusinessCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/serviceHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
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
   * Read all Bus. Capability
   * 
   * @param relations If set to true, all relations of the Fact Sheet are fetched as well. Fetching all relations can be slower. Default: false. (optional, default to false)
   * @param filter Full-text filter (optional)
   * @return List<BusinessCapability>
   * @throws ApiException if fails to make API call
   */
  public List<BusinessCapability> getBusinessCapabilities(Boolean relations, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/businessCapabilities".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<BusinessCapability>> localVarReturnType = new GenericType<List<BusinessCapability>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read a Bus. Capability by a given ID
   * 
   * @param ID Unique ID (required)
   * @param relations If set to true, all relations of the Fact Sheet are fetched as well. Fetching all relations can be slower. Default: false. (optional, default to false)
   * @return BusinessCapability
   * @throws ApiException if fails to make API call
   */
  public BusinessCapability getBusinessCapability(String ID, Boolean relations) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<BusinessCapability> localVarReturnType = new GenericType<BusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json")
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
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ProcessHasBusinessCapability>
   * @throws ApiException if fails to make API call
   */
  public List<ProcessHasBusinessCapability> getProcessHasBusinessCapabilities(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getProcessHasBusinessCapabilities");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/processHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ProcessHasBusinessCapability>> localVarReturnType = new GenericType<List<ProcessHasBusinessCapability>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ProcessHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ProcessHasBusinessCapability getProcessHasBusinessCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getProcessHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getProcessHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/processHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProcessHasBusinessCapability> localVarReturnType = new GenericType<ProcessHasBusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ProjectHasBusinessCapability>
   * @throws ApiException if fails to make API call
   */
  public List<ProjectHasBusinessCapability> getProjectHasBusinessCapabilities(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getProjectHasBusinessCapabilities");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/projectHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ProjectHasBusinessCapability>> localVarReturnType = new GenericType<List<ProjectHasBusinessCapability>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ProjectHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ProjectHasBusinessCapability getProjectHasBusinessCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getProjectHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getProjectHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/projectHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProjectHasBusinessCapability> localVarReturnType = new GenericType<ProjectHasBusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasBusinessCapability>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasBusinessCapability> getServiceHasBusinessCapabilities(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasBusinessCapabilities");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/serviceHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ServiceHasBusinessCapability>> localVarReturnType = new GenericType<List<ServiceHasBusinessCapability>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ServiceHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ServiceHasBusinessCapability getServiceHasBusinessCapability(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/serviceHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasBusinessCapability> localVarReturnType = new GenericType<ServiceHasBusinessCapability>() {};
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
    String localVarPath = "/businessCapabilities/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/userSubscriptions".replaceAll("\\{format\\}","json")
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
   * Update a Bus. Capability by a given ID
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return BusinessCapability
   * @throws ApiException if fails to make API call
   */
  public BusinessCapability updateBusinessCapability(String ID, BusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<BusinessCapability> localVarReturnType = new GenericType<BusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/businessCapabilities/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
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
   * @return ProcessHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ProcessHasBusinessCapability updateProcessHasBusinessCapability(String ID, String relationID, ProcessHasBusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateProcessHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateProcessHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/processHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProcessHasBusinessCapability> localVarReturnType = new GenericType<ProcessHasBusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ProjectHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ProjectHasBusinessCapability updateProjectHasBusinessCapability(String ID, String relationID, ProjectHasBusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateProjectHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateProjectHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/projectHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ProjectHasBusinessCapability> localVarReturnType = new GenericType<ProjectHasBusinessCapability>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ServiceHasBusinessCapability
   * @throws ApiException if fails to make API call
   */
  public ServiceHasBusinessCapability updateServiceHasBusinessCapability(String ID, String relationID, ServiceHasBusinessCapability body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasBusinessCapability");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasBusinessCapability");
    }
    
    // create path and map variables
    String localVarPath = "/businessCapabilities/{ID}/serviceHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasBusinessCapability> localVarReturnType = new GenericType<ServiceHasBusinessCapability>() {};
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
    String localVarPath = "/businessCapabilities/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
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
