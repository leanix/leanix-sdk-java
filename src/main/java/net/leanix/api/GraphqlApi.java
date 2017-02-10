package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import java.io.File;
import net.leanix.api.models.GraphQLRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GraphqlApi {
  private ApiClient apiClient;

  public GraphqlApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GraphqlApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * processGraphQL
   * Processes GraphQL requests
   * @param request  (required)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> processGraphQL(GraphQLRequest request) throws ApiException {
    Object localVarPostBody = request;
    
    // verify the required parameter 'request' is set
    if (request == null) {
      throw new ApiException(400, "Missing the required parameter 'request' when calling processGraphQL");
    }
    
    // create path and map variables
    String localVarPath = "/graphql".replaceAll("\\{format\\}","json");

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

    GenericType<Map<String, Object>> localVarReturnType = new GenericType<Map<String, Object>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * processGraphQLMultipart
   * Processes GraphQL requests, supporting multipart documents
   * @param graphQLRequest  (required)
   * @param file  (required)
   * @return Map&lt;String, Object&gt;
   * @throws ApiException if fails to make API call
   */
  public Map<String, Object> processGraphQLMultipart(String graphQLRequest, File file) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'graphQLRequest' is set
    if (graphQLRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'graphQLRequest' when calling processGraphQLMultipart");
    }
    
    // verify the required parameter 'file' is set
    if (file == null) {
      throw new ApiException(400, "Missing the required parameter 'file' when calling processGraphQLMultipart");
    }
    
    // create path and map variables
    String localVarPath = "/graphql/upload".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (graphQLRequest != null)
      localVarFormParams.put("graphQLRequest", graphQLRequest);
if (file != null)
      localVarFormParams.put("file", file);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<Map<String, Object>> localVarReturnType = new GenericType<Map<String, Object>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
