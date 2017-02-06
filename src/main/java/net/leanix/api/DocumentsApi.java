package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DocumentsApi {
  private ApiClient apiClient;

  public DocumentsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DocumentsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * downloadDocument
   * Download a document&#39;s content
   * @param documentId  (required)
   * @throws ApiException if fails to make API call
   */
  public void downloadDocument(String documentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'documentId' is set
    if (documentId == null) {
      throw new ApiException(400, "Missing the required parameter 'documentId' when calling downloadDocument");
    }
    
    // create path and map variables
    String localVarPath = "/documents/{documentId}/download".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "documentId" + "\\}", apiClient.escapeString(documentId.toString()));

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

    String[] localVarAuthNames = new String[] { "token" };


    apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
