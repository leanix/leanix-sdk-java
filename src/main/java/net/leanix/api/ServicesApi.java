package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.FactSheetHasIfaceConsumer;
import net.leanix.api.models.FactSheetHasIfaceProvider;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasParent;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.ServiceHasBusinessObject;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.models.ServiceHasInterface;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.UserSubscription;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ServicesApi {
  private ApiClient apiClient;

  public ServicesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ServicesApi(ApiClient apiClient) {
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
    String localVarPath = "/services/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json")
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
   * @return FactSheetHasIfaceConsumer
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasIfaceConsumer createFactSheetHasIfaceConsumer(String ID, FactSheetHasIfaceConsumer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasIfaceConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceConsumers".replaceAll("\\{format\\}","json")
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

    
    GenericType<FactSheetHasIfaceConsumer> localVarReturnType = new GenericType<FactSheetHasIfaceConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasIfaceProvider
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasIfaceProvider createFactSheetHasIfaceProvider(String ID, FactSheetHasIfaceProvider body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createFactSheetHasIfaceProvider");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceProviders".replaceAll("\\{format\\}","json")
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

    
    GenericType<FactSheetHasIfaceProvider> localVarReturnType = new GenericType<FactSheetHasIfaceProvider>() {};
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
    String localVarPath = "/services/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json")
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
   * Create a new Application
   * 
   * @param body Message-Body (optional)
   * @return Service
   * @throws ApiException if fails to make API call
   */
  public Service createService(Service body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/services".replaceAll("\\{format\\}","json");

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

    
    GenericType<Service> localVarReturnType = new GenericType<Service>() {};
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
    String localVarPath = "/services/{ID}/serviceHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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
   * @return ServiceHasBusinessObject
   * @throws ApiException if fails to make API call
   */
  public ServiceHasBusinessObject createServiceHasBusinessObject(String ID, ServiceHasBusinessObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasBusinessObject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasBusinessObjects".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasBusinessObject> localVarReturnType = new GenericType<ServiceHasBusinessObject>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ServiceHasConsumer
   * @throws ApiException if fails to make API call
   */
  public ServiceHasConsumer createServiceHasConsumer(String ID, ServiceHasConsumer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasConsumers".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasConsumer> localVarReturnType = new GenericType<ServiceHasConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ServiceHasInterface
   * @throws ApiException if fails to make API call
   */
  public ServiceHasInterface createServiceHasInterface(String ID, ServiceHasInterface body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasInterface");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasInterfaces".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasInterface> localVarReturnType = new GenericType<ServiceHasInterface>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ServiceHasProcess
   * @throws ApiException if fails to make API call
   */
  public ServiceHasProcess createServiceHasProcess(String ID, ServiceHasProcess body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasProcess");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProcesses".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasProcess> localVarReturnType = new GenericType<ServiceHasProcess>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Create a new relation
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return ServiceHasProject
   * @throws ApiException if fails to make API call
   */
  public ServiceHasProject createServiceHasProject(String ID, ServiceHasProject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling createServiceHasProject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProjects".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasProject> localVarReturnType = new GenericType<ServiceHasProject>() {};
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
    String localVarPath = "/services/{ID}/serviceHasResources".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/userSubscriptions".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteFactSheetHasIfaceConsumer(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasIfaceConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasIfaceConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceConsumers/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteFactSheetHasIfaceProvider(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteFactSheetHasIfaceProvider");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteFactSheetHasIfaceProvider");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceProviders/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
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
   * Delete a Application by a given ID
   * 
   * @param ID Unique ID (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteService(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteService");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/serviceHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteServiceHasBusinessObject(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasBusinessObject");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasBusinessObject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasBusinessObjects/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteServiceHasConsumer(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasConsumers/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteServiceHasInterface(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasInterface");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasInterface");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasInterfaces/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteServiceHasProcess(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasProcess");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasProcess");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProcesses/{relationID}".replaceAll("\\{format\\}","json")
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
  public void deleteServiceHasProject(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling deleteServiceHasProject");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling deleteServiceHasProject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProjects/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/serviceHasResources/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json")
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
   * @return FactSheetHasIfaceConsumer
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasIfaceConsumer getFactSheetHasIfaceConsumer(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasIfaceConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasIfaceConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceConsumers/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<FactSheetHasIfaceConsumer> localVarReturnType = new GenericType<FactSheetHasIfaceConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasIfaceConsumer>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasIfaceConsumer> getFactSheetHasIfaceConsumers(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasIfaceConsumers");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceConsumers".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<FactSheetHasIfaceConsumer>> localVarReturnType = new GenericType<List<FactSheetHasIfaceConsumer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return FactSheetHasIfaceProvider
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasIfaceProvider getFactSheetHasIfaceProvider(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasIfaceProvider");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getFactSheetHasIfaceProvider");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceProviders/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<FactSheetHasIfaceProvider> localVarReturnType = new GenericType<FactSheetHasIfaceProvider>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<FactSheetHasIfaceProvider>
   * @throws ApiException if fails to make API call
   */
  public List<FactSheetHasIfaceProvider> getFactSheetHasIfaceProviders(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getFactSheetHasIfaceProviders");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceProviders".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<FactSheetHasIfaceProvider>> localVarReturnType = new GenericType<List<FactSheetHasIfaceProvider>>() {};
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
    String localVarPath = "/services/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json")
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
   * Read a Application by a given ID
   * 
   * @param ID Unique ID (required)
   * @param relations If set to true, all relations of the Fact Sheet are fetched as well. Fetching all relations can be slower. Default: false. (optional, default to false)
   * @return Service
   * @throws ApiException if fails to make API call
   */
  public Service getService(String ID, Boolean relations) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getService");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Service> localVarReturnType = new GenericType<Service>() {};
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
    String localVarPath = "/services/{ID}/serviceHasBusinessCapabilities".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/serviceHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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
   * @return ServiceHasBusinessObject
   * @throws ApiException if fails to make API call
   */
  public ServiceHasBusinessObject getServiceHasBusinessObject(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasBusinessObject");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasBusinessObject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasBusinessObjects/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasBusinessObject> localVarReturnType = new GenericType<ServiceHasBusinessObject>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasBusinessObject>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasBusinessObject> getServiceHasBusinessObjects(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasBusinessObjects");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasBusinessObjects".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ServiceHasBusinessObject>> localVarReturnType = new GenericType<List<ServiceHasBusinessObject>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ServiceHasConsumer
   * @throws ApiException if fails to make API call
   */
  public ServiceHasConsumer getServiceHasConsumer(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasConsumers/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasConsumer> localVarReturnType = new GenericType<ServiceHasConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasConsumer>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasConsumer> getServiceHasConsumers(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasConsumers");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasConsumers".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ServiceHasConsumer>> localVarReturnType = new GenericType<List<ServiceHasConsumer>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ServiceHasInterface
   * @throws ApiException if fails to make API call
   */
  public ServiceHasInterface getServiceHasInterface(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasInterface");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasInterface");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasInterfaces/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasInterface> localVarReturnType = new GenericType<ServiceHasInterface>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasInterface>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasInterface> getServiceHasInterfaces(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasInterfaces");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasInterfaces".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ServiceHasInterface>> localVarReturnType = new GenericType<List<ServiceHasInterface>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ServiceHasProcess
   * @throws ApiException if fails to make API call
   */
  public ServiceHasProcess getServiceHasProcess(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasProcess");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasProcess");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProcesses/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasProcess> localVarReturnType = new GenericType<ServiceHasProcess>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasProcess>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasProcess> getServiceHasProcesses(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasProcesses");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProcesses".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ServiceHasProcess>> localVarReturnType = new GenericType<List<ServiceHasProcess>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read by relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @return ServiceHasProject
   * @throws ApiException if fails to make API call
   */
  public ServiceHasProject getServiceHasProject(String ID, String relationID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasProject");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling getServiceHasProject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProjects/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasProject> localVarReturnType = new GenericType<ServiceHasProject>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Read all of relation
   * 
   * @param ID Unique ID (required)
   * @return List<ServiceHasProject>
   * @throws ApiException if fails to make API call
   */
  public List<ServiceHasProject> getServiceHasProjects(String ID) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling getServiceHasProjects");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProjects".replaceAll("\\{format\\}","json")
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

    
    GenericType<List<ServiceHasProject>> localVarReturnType = new GenericType<List<ServiceHasProject>>() {};
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
    String localVarPath = "/services/{ID}/serviceHasResources/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/serviceHasResources".replaceAll("\\{format\\}","json")
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
   * Read all Application
   * 
   * @param relations If set to true, all relations of the Fact Sheet are fetched as well. Fetching all relations can be slower. Default: false. (optional, default to false)
   * @param filter Full-text filter (optional)
   * @return List<Service>
   * @throws ApiException if fails to make API call
   */
  public List<Service> getServices(Boolean relations, String filter) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/services".replaceAll("\\{format\\}","json");

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

    
    GenericType<List<Service>> localVarReturnType = new GenericType<List<Service>>() {};
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
    String localVarPath = "/services/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/userSubscriptions".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json")
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
   * @return FactSheetHasIfaceConsumer
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasIfaceConsumer updateFactSheetHasIfaceConsumer(String ID, String relationID, FactSheetHasIfaceConsumer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasIfaceConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasIfaceConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceConsumers/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<FactSheetHasIfaceConsumer> localVarReturnType = new GenericType<FactSheetHasIfaceConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return FactSheetHasIfaceProvider
   * @throws ApiException if fails to make API call
   */
  public FactSheetHasIfaceProvider updateFactSheetHasIfaceProvider(String ID, String relationID, FactSheetHasIfaceProvider body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateFactSheetHasIfaceProvider");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateFactSheetHasIfaceProvider");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/factSheetHasIfaceProviders/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<FactSheetHasIfaceProvider> localVarReturnType = new GenericType<FactSheetHasIfaceProvider>() {};
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
    String localVarPath = "/services/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json")
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
   * Update a Application by a given ID
   * 
   * @param ID Unique ID (required)
   * @param body Message-Body (optional)
   * @return Service
   * @throws ApiException if fails to make API call
   */
  public Service updateService(String ID, Service body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateService");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<Service> localVarReturnType = new GenericType<Service>() {};
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
    String localVarPath = "/services/{ID}/serviceHasBusinessCapabilities/{relationID}".replaceAll("\\{format\\}","json")
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
   * @return ServiceHasBusinessObject
   * @throws ApiException if fails to make API call
   */
  public ServiceHasBusinessObject updateServiceHasBusinessObject(String ID, String relationID, ServiceHasBusinessObject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasBusinessObject");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasBusinessObject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasBusinessObjects/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasBusinessObject> localVarReturnType = new GenericType<ServiceHasBusinessObject>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ServiceHasConsumer
   * @throws ApiException if fails to make API call
   */
  public ServiceHasConsumer updateServiceHasConsumer(String ID, String relationID, ServiceHasConsumer body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasConsumer");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasConsumer");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasConsumers/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasConsumer> localVarReturnType = new GenericType<ServiceHasConsumer>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ServiceHasInterface
   * @throws ApiException if fails to make API call
   */
  public ServiceHasInterface updateServiceHasInterface(String ID, String relationID, ServiceHasInterface body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasInterface");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasInterface");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasInterfaces/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasInterface> localVarReturnType = new GenericType<ServiceHasInterface>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ServiceHasProcess
   * @throws ApiException if fails to make API call
   */
  public ServiceHasProcess updateServiceHasProcess(String ID, String relationID, ServiceHasProcess body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasProcess");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasProcess");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProcesses/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasProcess> localVarReturnType = new GenericType<ServiceHasProcess>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Update relation by a given relationID
   * 
   * @param ID Unique ID (required)
   * @param relationID Unique ID of the Relation (required)
   * @param body Message-Body (optional)
   * @return ServiceHasProject
   * @throws ApiException if fails to make API call
   */
  public ServiceHasProject updateServiceHasProject(String ID, String relationID, ServiceHasProject body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'ID' is set
    if (ID == null) {
      throw new ApiException(400, "Missing the required parameter 'ID' when calling updateServiceHasProject");
    }
    
    // verify the required parameter 'relationID' is set
    if (relationID == null) {
      throw new ApiException(400, "Missing the required parameter 'relationID' when calling updateServiceHasProject");
    }
    
    // create path and map variables
    String localVarPath = "/services/{ID}/serviceHasProjects/{relationID}".replaceAll("\\{format\\}","json")
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

    
    GenericType<ServiceHasProject> localVarReturnType = new GenericType<ServiceHasProject>() {};
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
    String localVarPath = "/services/{ID}/serviceHasResources/{relationID}".replaceAll("\\{format\\}","json")
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
    String localVarPath = "/services/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json")
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
