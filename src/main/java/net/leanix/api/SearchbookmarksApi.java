package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.BookmarkSuggestionsResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SearchbookmarksApi {
  private ApiClient apiClient;

  public SearchbookmarksApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SearchbookmarksApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * getBookmarkSuggestions
   * Returns a list of bookmark suggestions for a given search term or all the bookmarks matching filter
   * @param type Bookmark type (optional)
   * @param subtype Bookmark subtype (optional)
   * @param q Search term (optional)
   * @param personalized Personalized (optional, default to false)
   * @param sort Sorting. Default sorting criterion is bookmark name. (optional)
   * @param cursor Pagination cursor. The result page will start with the entry immediately after the entry corresponding to the cursor. Order of the cursor values matters.This parameter needs to be specified multiple times: once for each entry in the list, e.g., cursor&#x3D;b2h5by1vaHlv&amp;cursor&#x3D;Ym9va21hcmsj (optional)
   * @param pageSize Page size (optional, default to 40)
   * @param sortDirection The direction of the sorting. Default sorting order for name is ASC, for date fields - DSC. (optional)
   * @param factSheetId FactSheet ID, which must appear in bookmark (applicable only to bookmarks of BookmarkType VISUALIZER) (optional)
   * @param predefinedOnly Indicates if only predefined bookmarks should be returned. (optional, default to false)
   * @return BookmarkSuggestionsResponse
   * @throws ApiException if fails to make API call
   */
  public BookmarkSuggestionsResponse getBookmarkSuggestions(String type, String subtype, String q, Boolean personalized, String sort, List<String> cursor, Integer pageSize, String sortDirection, UUID factSheetId, Boolean predefinedOnly) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/search/bookmarks".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subtype", subtype));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "personalized", personalized));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "factSheetId", factSheetId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "predefinedOnly", predefinedOnly));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<BookmarkSuggestionsResponse> localVarReturnType = new GenericType<BookmarkSuggestionsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
