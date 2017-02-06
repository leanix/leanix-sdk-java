package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.JobResponse;
import net.leanix.api.models.StartSyncWorkspaceRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class EamApi {
  private ApiClient apiClient;

  public EamApi() {
    this(Configuration.getDefaultApiClient());
  }

  public EamApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * createRandomWorkspace
   * Starts generation of a random workspace. This method is useful if you want to setup a large workspace in order to get an impression of pathfinder&#39;s performance on large workspaces.
   * @param numberOfApplications Number of applications to create (max: 5000, default: 100) (optional)
   * @param levelCountItComponents Number of depth were IT-Components are arrange unter applcations (max: 6, default: 2) (optional)
   * @return JobResponse
   * @throws ApiException if fails to make API call
   */
  public JobResponse createRandomWorkspace(Integer numberOfApplications, Integer levelCountItComponents) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/eam/randomWorkspace".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "numberOfApplications", numberOfApplications));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "levelCountItComponents", levelCountItComponents));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    
    GenericType<JobResponse> localVarReturnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * startSync
   * Starts the synchronization of a workspace.
   * @param body  (required)
   * @return JobResponse
   * @throws ApiException if fails to make API call
   */
  public JobResponse startSync(StartSyncWorkspaceRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling startSync");
    }
    
    // create path and map variables
    String localVarPath = "/eam/synchronize".replaceAll("\\{format\\}","json");

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

    
    GenericType<JobResponse> localVarReturnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
