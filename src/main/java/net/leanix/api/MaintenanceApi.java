package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.JobResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MaintenanceApi {
  private ApiClient apiClient;

  public MaintenanceApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MaintenanceApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * syncIndex
   * Starts the synchronization of the index of a workspace.
   * @param workspaceId  (required)
   * @param target used to specify which 2nd datastore should be synchronized (required)
   * @return JobResponse
   * @throws ApiException if fails to make API call
   */
  public JobResponse syncIndex(UUID workspaceId, String target) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling syncIndex");
    }
    
    // verify the required parameter 'target' is set
    if (target == null) {
      throw new ApiException(400, "Missing the required parameter 'target' when calling syncIndex");
    }
    
    // create path and map variables
    String localVarPath = "/maintenance/synchronize/{target}/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()))
      .replaceAll("\\{" + "target" + "\\}", apiClient.escapeString(target.toString()));

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
