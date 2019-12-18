package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.SuggestionsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SuggestionsApi {
  private ApiClient apiClient;

  public SuggestionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SuggestionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getSuggestions
   * Retrieves a list of suggestions for a search term
   * @param q search term (required)
   * @param object suggestions object type (optional, default to factSheet)
   * @param count number of suggestions, defaultValue is 50 if perType &#x3D; false, 25 otherwise (optional)
   * @param perType if suggestions are to be grouped per object type (optional, default to false)
   * @return SuggestionsResponse
   * @throws ApiException if fails to make API call
   */
  public SuggestionsResponse getSuggestions(String q, String object, Integer count, Boolean perType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'q' is set
    if (q == null) {
      throw new ApiException(400, "Missing the required parameter 'q' when calling getSuggestions");
    }
    
    // create path and map variables
    String localVarPath = "/suggestions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "object", object));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "count", count));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "perType", perType));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<SuggestionsResponse> localVarReturnType = new GenericType<SuggestionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
