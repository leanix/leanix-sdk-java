package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.AuthorizationRole;
import net.leanix.api.models.AuthorizationRolesResponse;
import net.leanix.api.models.BasicResponse;
import net.leanix.api.models.DatamodelDefinition;
import net.leanix.api.models.DatamodelDefinitionResponse;
import net.leanix.api.models.DatamodelUpdateResponse;
import net.leanix.api.models.ViewModelResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ModelsApi {
  private ApiClient apiClient;

  public ModelsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getAuthorization
   * Provides all authorization roles were for each role a set of permission is defined.
   * @return AuthorizationRolesResponse
   * @throws ApiException if fails to make API call
   */
  public AuthorizationRolesResponse getAuthorization() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/models/authorization".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<AuthorizationRolesResponse> localVarReturnType = new GenericType<AuthorizationRolesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getDataModel
   * Retrieves the model for a workspace
   * @return DatamodelDefinitionResponse
   * @throws ApiException if fails to make API call
   */
  public DatamodelDefinitionResponse getDataModel() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/models".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<DatamodelDefinitionResponse> localVarReturnType = new GenericType<DatamodelDefinitionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getEnrichedDataModel
   * Retrieves the model for a workspace, including redundant data that makes life easy for the web front end
   * @return DatamodelDefinitionResponse
   * @throws ApiException if fails to make API call
   */
  public DatamodelDefinitionResponse getEnrichedDataModel() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/models/enriched".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<DatamodelDefinitionResponse> localVarReturnType = new GenericType<DatamodelDefinitionResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getViewModel
   * Retrieves the view model for a workspace
   * @return ViewModelResponse
   * @throws ApiException if fails to make API call
   */
  public ViewModelResponse getViewModel() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/models/viewModel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<ViewModelResponse> localVarReturnType = new GenericType<ViewModelResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateAuthorization
   * Updates all authorization roles for a given workspace. This means all existing roles and its permissions will be overriden
   * @param body The authorization configuration for the workspace which contains all roles and its permissions (required)
   * @return BasicResponse
   * @throws ApiException if fails to make API call
   */
  public BasicResponse updateAuthorization(List<AuthorizationRole> body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAuthorization");
    }
    
    // create path and map variables
    String localVarPath = "/models/authorization".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<BasicResponse> localVarReturnType = new GenericType<BasicResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateDataModel
   * Updates the data model for a workspace
   * @param body the data model for the workspace (required)
   * @param force whether changes should be forced (optional, default to false)
   * @return DatamodelUpdateResponse
   * @throws ApiException if fails to make API call
   */
  public DatamodelUpdateResponse updateDataModel(DatamodelDefinition body, Boolean force) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateDataModel");
    }
    
    // create path and map variables
    String localVarPath = "/models".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<DatamodelUpdateResponse> localVarReturnType = new GenericType<DatamodelUpdateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateViewModel
   * Updates the view model for a workspace
   * @param body the view model for the workspace (required)
   * @return BasicResponse
   * @throws ApiException if fails to make API call
   */
  public BasicResponse updateViewModel(String body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateViewModel");
    }
    
    // create path and map variables
    String localVarPath = "/models/viewModel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<BasicResponse> localVarReturnType = new GenericType<BasicResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
