package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.FactSheetSettings;
import net.leanix.api.models.FactSheetSettingsResponse;
import net.leanix.api.models.Response;
import net.leanix.api.models.SettingsResponse;
import net.leanix.api.models.WorkspaceSettings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SettingsApi {
  private ApiClient apiClient;

  public SettingsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SettingsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getFactSheetSettings
   * 
   * @param factSheetType  (required)
   * @return FactSheetSettingsResponse
   * @throws ApiException if fails to make API call
   */
  public FactSheetSettingsResponse getModelCustomization(String factSheetType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'factSheetType' is set
    if (factSheetType == null) {
      throw new ApiException(400, "Missing the required parameter 'factSheetType' when calling getModelCustomization");
    }
    
    // create path and map variables
    String localVarPath = "/settings/factSheets/{factSheetType}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "factSheetType" + "\\}", apiClient.escapeString(factSheetType.toString()));

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

    GenericType<FactSheetSettingsResponse> localVarReturnType = new GenericType<FactSheetSettingsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getSettings
   * 
   * @return SettingsResponse
   * @throws ApiException if fails to make API call
   */
  public SettingsResponse getSettings() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/settings".replaceAll("\\{format\\}","json");

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

    GenericType<SettingsResponse> localVarReturnType = new GenericType<SettingsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * putFactSheetSettings
   * 
   * @param factSheetType  (required)
   * @param body customization (required)
   * @throws ApiException if fails to make API call
   */
  public void updateModelsWithCustomization(String factSheetType, FactSheetSettings body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'factSheetType' is set
    if (factSheetType == null) {
      throw new ApiException(400, "Missing the required parameter 'factSheetType' when calling updateModelsWithCustomization");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateModelsWithCustomization");
    }
    
    // create path and map variables
    String localVarPath = "/settings/factSheets/{factSheetType}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "factSheetType" + "\\}", apiClient.escapeString(factSheetType.toString()));

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


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * updateSettings
   * 
   * @param body the settings for the workspace (required)
   * @return Response
   * @throws ApiException if fails to make API call
   */
  public Response updateSettings(WorkspaceSettings body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateSettings");
    }
    
    // create path and map variables
    String localVarPath = "/settings".replaceAll("\\{format\\}","json");

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

    GenericType<Response> localVarReturnType = new GenericType<Response>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
