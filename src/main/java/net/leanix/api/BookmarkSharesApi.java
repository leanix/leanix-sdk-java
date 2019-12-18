package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.BookmarkShareInputData;
import net.leanix.api.models.BookmarkSharesResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BookmarkSharesApi {
  private ApiClient apiClient;

  public BookmarkSharesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BookmarkSharesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * createBookmarkShares
   * Saves a bookmark share in the database
   * @param bookmarkShare Field SharedByUserId, if set, needs to be same as the calling user&#39;s id. (optional)
   * @return BookmarkSharesResponse
   * @throws ApiException if fails to make API call
   */
  public BookmarkSharesResponse createBookmarkShare(BookmarkShareInputData bookmarkShare) throws ApiException {
    Object localVarPostBody = bookmarkShare;
    
    // create path and map variables
    String localVarPath = "/bookmarkShares".replaceAll("\\{format\\}","json");

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

    GenericType<BookmarkSharesResponse> localVarReturnType = new GenericType<BookmarkSharesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * deleteBookmarkShares
   * Deletes a bookmark share by the calling user.
   * @param bookmarkId Specifies the bookmark id (required)
   * @param sharedWithUserId Specifies the sharedWith userId (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteBookmarkShare(UUID bookmarkId, UUID sharedWithUserId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookmarkId' is set
    if (bookmarkId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookmarkId' when calling deleteBookmarkShare");
    }
    
    // verify the required parameter 'sharedWithUserId' is set
    if (sharedWithUserId == null) {
      throw new ApiException(400, "Missing the required parameter 'sharedWithUserId' when calling deleteBookmarkShare");
    }
    
    // create path and map variables
    String localVarPath = "/bookmarkShares".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bookmarkId", bookmarkId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sharedWithUserId", sharedWithUserId));

    
    
    final String[] localVarAccepts = {
      
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * getBookmarkShares
   * Retrieves all stored bookmark shared by the calling user.
   * @param bookmarkId Specifies the bookmark id (required)
   * @return BookmarkSharesResponse
   * @throws ApiException if fails to make API call
   */
  public BookmarkSharesResponse getBookmarkShares(UUID bookmarkId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'bookmarkId' is set
    if (bookmarkId == null) {
      throw new ApiException(400, "Missing the required parameter 'bookmarkId' when calling getBookmarkShares");
    }
    
    // create path and map variables
    String localVarPath = "/bookmarkShares".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "bookmarkId", bookmarkId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<BookmarkSharesResponse> localVarReturnType = new GenericType<BookmarkSharesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
