package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;

import javax.ws.rs.core.GenericType;

import net.leanix.api.models.FactSheet;
import net.leanix.api.models.FactSheetArchiveParameter;
import net.leanix.api.models.FactSheetListResponse;
import net.leanix.api.models.FactSheetRelation;
import net.leanix.api.models.FactSheetResponse;
import net.leanix.api.models.RelationListResponse;
import net.leanix.api.models.RelationResponse;
import java.util.UUID;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FactSheetsApi {
  private ApiClient apiClient;

  public FactSheetsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FactSheetsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * deleteFactSheet
   * Deletes a Fact Sheet
   * @param id  (required)
   * @param body Contains the comment and the Fact Sheet revision (optional)
   * @throws ApiException if fails to make API call
   */
  public void archiveFactSheet(String id, FactSheetArchiveParameter body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling archiveFactSheet");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * createFactSheet
   * Creates a Fact Sheet
   * @param body Fact Sheet to add (required)
   * @return FactSheetResponse
   * @throws ApiException if fails to make API call
   */
  public FactSheetResponse createFactSheet(FactSheet body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createFactSheet");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets".replaceAll("\\{format\\}","json");

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

    GenericType<FactSheetResponse> localVarReturnType = new GenericType<FactSheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * createFactSheetRelation
   * Creates the given relation with the Fact Sheet as one side of the relation. When adding constraining relations only the ID of these relations will be used.
   * @param relation  (required)
   * @param id  (required)
   * @return RelationResponse
   * @throws ApiException if fails to make API call
   */
  public RelationResponse createFactSheetRelation(FactSheetRelation relation, UUID id) throws ApiException {
    Object localVarPostBody = relation;
    
    // verify the required parameter 'relation' is set
    if (relation == null) {
      throw new ApiException(400, "Missing the required parameter 'relation' when calling createFactSheetRelation");
    }
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling createFactSheetRelation");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}/relations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

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

    GenericType<RelationResponse> localVarReturnType = new GenericType<RelationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * deleteFactSheetRelation
   * Deletes the given relation.
   * @param id  (required)
   * @param relationId  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteFactSheetRelation(UUID id, UUID relationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteFactSheetRelation");
    }
    
    // verify the required parameter 'relationId' is set
    if (relationId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationId' when calling deleteFactSheetRelation");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}/relations/{relationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "relationId" + "\\}", apiClient.escapeString(relationId.toString()));

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


    apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * getFactSheet
   * Retrieves a Fact Sheet
   * @param id  (required)
   * @param relationTypes Comma separated list of relation types to show on the Fact Sheets (optional)
   * @param permissions Show a permission field for the Fact Sheet (optional, default to false)
   * @return FactSheetResponse
   * @throws ApiException if fails to make API call
   */
  public FactSheetResponse getFactSheet(String id, String relationTypes, Boolean permissions) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFactSheet");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationTypes", relationTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissions", permissions));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<FactSheetResponse> localVarReturnType = new GenericType<FactSheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getFactSheetHierarchy
   * Retrieves a list of all Fact Sheets equal to or below a certain root Fact Sheet
   * @param rootId  (required)
   * @param pageSize Number of Fact Sheets to return, maximum is 5000 (optional, default to 40)
   * @param cursor Marks the position of the first element that should be returned (optional)
   * @return FactSheetListResponse
   * @throws ApiException if fails to make API call
   */
  public FactSheetListResponse getFactSheetHierarchy(String rootId, Integer pageSize, String cursor) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'rootId' is set
    if (rootId == null) {
      throw new ApiException(400, "Missing the required parameter 'rootId' when calling getFactSheetHierarchy");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/hierarchy/{rootId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "rootId" + "\\}", apiClient.escapeString(rootId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<FactSheetListResponse> localVarReturnType = new GenericType<FactSheetListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getFactSheetRelations
   * Retrieves all relations of a Fact Sheet, with the given type
   * @param id  (required)
   * @param type Only return relations of this type (optional)
   * @param withFactSheets Include the to Fact Sheet in the relation (optional)
   * @return RelationListResponse
   * @throws ApiException if fails to make API call
   */
  public RelationListResponse getFactSheetRelations(String id, String type, Boolean withFactSheets) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getFactSheetRelations");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}/relations".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withFactSheets", withFactSheets));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<RelationListResponse> localVarReturnType = new GenericType<RelationListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getFactSheets
   * Retrieves all Fact Sheets
   * @param type Comma separated list of Fact Sheets types to list, leave empty for all (optional)
   * @param relationTypes Comma separated list of relation types to show on the Fact Sheets (optional)
   * @param fields Comma separated list of fields to show on the Fact Sheets, leave empty for all (optional)
   * @param archivedOnly Retrieve archived fact sheets instead of active ones (optional, default to false)
   * @param pageSize Number of Fact Sheets to return, maximum is 5000 (optional, default to 40)
   * @param cursor Marks the position of the first element that should be returned (optional)
   * @param permissions Show a permission field for the Fact Sheet (optional, default to false)
   * @param completion Show completion status for the Fact Sheet (optional, default to true)
   * @param documents Include documents of the Fact Sheet (optional, default to true)
   * @return FactSheetListResponse
   * @throws ApiException if fails to make API call
   */
  public FactSheetListResponse getFactSheets(String type, String relationTypes, String fields, Boolean archivedOnly, Integer pageSize, String cursor, Boolean permissions, Boolean completion, Boolean documents) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/factSheets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationTypes", relationTypes));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fields", fields));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "archivedOnly", archivedOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissions", permissions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "completion", completion));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "documents", documents));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<FactSheetListResponse> localVarReturnType = new GenericType<FactSheetListResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateFactSheet
   * Updates a Fact Sheet
   * @param id  (required)
   * @param body Fact Sheet to update (required)
   * @param relationTypes Comma separated list of relation types to update. If no types are set, the relations will not be changed. (optional)
   * @return FactSheetResponse
   * @throws ApiException if fails to make API call
   */
  public FactSheetResponse updateFactSheet(UUID id, FactSheet body, String relationTypes) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateFactSheet");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateFactSheet");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "relationTypes", relationTypes));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<FactSheetResponse> localVarReturnType = new GenericType<FactSheetResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateFactSheetRelation
   * Updates the given relation.
   * @param id  (required)
   * @param relationId  (required)
   * @param relation  (required)
   * @return RelationResponse
   * @throws ApiException if fails to make API call
   */
  public RelationResponse updateFactSheetRelation(UUID id, UUID relationId, FactSheetRelation relation) throws ApiException {
    Object localVarPostBody = relation;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateFactSheetRelation");
    }
    
    // verify the required parameter 'relationId' is set
    if (relationId == null) {
      throw new ApiException(400, "Missing the required parameter 'relationId' when calling updateFactSheetRelation");
    }
    
    // verify the required parameter 'relation' is set
    if (relation == null) {
      throw new ApiException(400, "Missing the required parameter 'relation' when calling updateFactSheetRelation");
    }
    
    // create path and map variables
    String localVarPath = "/factSheets/{id}/relations/{relationId}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()))
      .replaceAll("\\{" + "relationId" + "\\}", apiClient.escapeString(relationId.toString()));

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

    GenericType<RelationResponse> localVarReturnType = new GenericType<RelationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
