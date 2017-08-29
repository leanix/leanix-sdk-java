package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.ActivityStream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class ActivitiesApi {
  private ApiClient apiClient;

  public ActivitiesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ActivitiesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get the latest activities
   * 
   * @param scope If set to &#39;my&#39;, only the activities related to subscribed Fact Sheet are listed for the authenticated user. (optional)
   * @param startDate If set, only activities greater or equal the given date time are retrieved. If no start time is given, then the start time is calculated based on the last event. (optional)
   * @param endDate If set, only activities less or equal the given date time are retrieved. If no end time is given, all activities until today are selected. (optional)
   * @param factSheetType Type of Fact Sheet, e.g. services for Application (optional)
   * @param eventType Event type, e.g. creation of a Fact Sheet: OBJECT_CREATE (optional)
   * @param countOnly If set to 1, then only the count is transmitted and data is left empty (optional)
   * @param orderById If set to 1, the result is ordered by ID (optional)
   * @param startId If set this ID is used as starting point for the query. (optional)
   * @param pageSize If set only the given number of results is returned. (optional)
   * @return ActivityStream
   * @throws ApiException if fails to make API call
   */
  public ActivityStream getActivities(String scope, String startDate, String endDate, String factSheetType, String eventType, Integer countOnly, Integer orderById, String startId, Integer pageSize) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/activities".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "scope", scope));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factSheetType", factSheetType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "eventType", eventType));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "countOnly", countOnly));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderById", orderById));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startId", startId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    

    

    

    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    
    GenericType<ActivityStream> localVarReturnType = new GenericType<ActivityStream>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}
