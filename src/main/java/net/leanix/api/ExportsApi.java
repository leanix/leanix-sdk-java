package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.ExportListResponse;
import net.leanix.api.models.JobResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ExportsApi {
  private ApiClient apiClient;

  public ExportsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ExportsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * createExportFile
   * Creates an excel export file by using the given graphQL query and table configuration
   * @return JobResponse
   * @throws ApiException if fails to make API call
   */
  public JobResponse createExportFile() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/exports/excel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "text/plain"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<JobResponse> localVarReturnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * createFullExport
   * Creates a full export of the workspace data, or an export of the changelog, depending on given type
   * @param exportType The type of the export, must be either SNAPSHOT, AUDIT_LOG or AUDIT_LOG_LEGACY (optional)
   * @param startDate The start date of the audit log export in ISO-8601 format. (optional)
   * @param endDate The end date of the audit log export in ISO-8601 format. If left empty today is assumed (optional)
   * @return JobResponse
   * @throws ApiException if fails to make API call
   */
  public JobResponse createFullExport(String exportType, String startDate, String endDate) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/exports/fullExport".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exportType", exportType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<JobResponse> localVarReturnType = new GenericType<JobResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * downloadExportFile
   * Returns the download file for the given ID
   * @param workspaceId the ID of the workspace to retrieve the download for (required)
   * @param key a one time use key identifying the download to retrieve (required)
   * @throws ApiException if fails to make API call
   */
  public void downloadExportFile(String workspaceId, String key) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'workspaceId' is set
    if (workspaceId == null) {
      throw new ApiException(400, "Missing the required parameter 'workspaceId' when calling downloadExportFile");
    }
    
    // verify the required parameter 'key' is set
    if (key == null) {
      throw new ApiException(400, "Missing the required parameter 'key' when calling downloadExportFile");
    }
    
    // create path and map variables
    String localVarPath = "/exports/downloads/{workspaceId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "workspaceId" + "\\}", apiClient.escapeString(workspaceId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "key", key));

    
    
    final String[] localVarAccepts = {
      "application/octet-stream"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * getExports
   * Lists all exports of the given type in the workspace of the authorized user
   * @param exportType Comma separated list of types of exports to return, if left empty AUDIT_LOG and SNAPSHOT, and AUDIT_LOG_LEGACY exports are returned (optional)
   * @param userId Retrieve exports initiated by the given user (optional)
   * @param pageSize Number of Exports to return, maximum is 100 (optional, default to 40)
   * @param cursor Marks the position of the first element that should be returned (optional)
   * @param sorting the field to sort the results by (optional, default to createdAt)
   * @param sortDirection the direction of the sorting (optional, default to ASC)
   * @return ExportListResponse
   * @throws ApiException if fails to make API call
   */
  public ExportListResponse getExports(String exportType, UUID userId, Integer pageSize, String cursor, String sorting, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/exports".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exportType", exportType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userId", userId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sorting", sorting));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ExportListResponse> localVarReturnType = new GenericType<ExportListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
