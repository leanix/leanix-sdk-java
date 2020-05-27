package net.leanix.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.ws.rs.core.GenericType;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.common.Configuration;
import net.leanix.api.common.Pair;
import net.leanix.api.models.AccessControlEntity;
import net.leanix.api.models.AccessControlEntityListResponse;
import net.leanix.api.models.AccessControlEntityResponse;
import net.leanix.api.models.AuthorizationRole;
import net.leanix.api.models.AuthorizationRolesResponse;
import net.leanix.api.models.DataModel;
import net.leanix.api.models.DataModelDefinitionResponse;
import net.leanix.api.models.DataModelUpdateResponse;
import net.leanix.api.models.FactSheetResourceModelDefinition;
import net.leanix.api.models.FactSheetResourceModelResponse;
import net.leanix.api.models.LanguageResponse;
import net.leanix.api.models.ReportingModelDefinition;
import net.leanix.api.models.ReportingModelResponse;
import net.leanix.api.models.Response;
import net.leanix.api.models.Translation;
import net.leanix.api.models.ViewModelDefinition;
import net.leanix.api.models.ViewModelResponse;


public class ModelsApi {
  private ApiClient apiClient;

  public ModelsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ModelsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * createAccessControlEntity
   * Creates an access control entity
   * @param body New access control entity (optional)
   * @return AccessControlEntityResponse
   * @throws ApiException if fails to make API call
   */
  public AccessControlEntityResponse createAccessControlEntity(AccessControlEntity body) throws ApiException {
    Object localVarPostBody = body;
    
    // create path and map variables
    String localVarPath = "/models/accessControlEntities".replaceAll("\\{format\\}","json");

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

    GenericType<AccessControlEntityResponse> localVarReturnType = new GenericType<AccessControlEntityResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * deleteAccessControlEntity
   * Deletes an access control entity
   * @param id  (required)
   * @throws ApiException if fails to make API call
   */
  public void deleteAccessControlEntity(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling deleteAccessControlEntity");
    }
    
    // create path and map variables
    String localVarPath = "/models/accessControlEntities/{id}".replaceAll("\\{format\\}","json")
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
   * getAccessControlEntities
   * Retrieves all access control entities
   * @param pageSize Number of reports to be returned, maximum is 100 (optional, default to 40)
   * @param cursor Marks the position of the first element that should be returned (optional)
   * @param sorting The field to sort the results by (optional, default to name)
   * @param sortDirection The direction of the sorting (optional, default to ASC)
   * @return AccessControlEntityListResponse
   * @throws ApiException if fails to make API call
   */
  public AccessControlEntityListResponse getAccessControlEntities(Integer pageSize, String cursor, String sorting, String sortDirection) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/models/accessControlEntities".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cursor", cursor));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sorting", sorting));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortDirection", sortDirection));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
      final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

      final String[] localVarContentTypes = {
          "application/json"
      };
      final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

      String[] localVarAuthNames = new String[]{"token"};

      GenericType<AccessControlEntityListResponse> localVarReturnType = new GenericType<AccessControlEntityListResponse>() {
      };
      return apiClient
          .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
              localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

    /**
     * getAuthorization
     * Provides all authorization roles were for each role a set of permission is defined.
     * @param workspaceId  (optional)
     * @return AuthorizationRolesResponse
     * @throws ApiException if fails to make API call
     */
    public AuthorizationRolesResponse getAuthorization(UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/authorization".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<AuthorizationRolesResponse> localVarReturnType = new GenericType<AuthorizationRolesResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getDataModel
     * Retrieves the model for a workspace
     * @param workspaceId  (optional)
     * @return DataModelDefinitionResponse
     * @throws ApiException if fails to make API call
     */
    public DataModelDefinitionResponse getDataModel(UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/dataModel".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<DataModelDefinitionResponse> localVarReturnType = new GenericType<DataModelDefinitionResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getEnrichedDataModel
     * Retrieves the model for a workspace, including redundant data that makes life easy for the web front end
     * @param workspaceId  (optional)
     * @return DataModelDefinitionResponse
     * @throws ApiException if fails to make API call
     */
    public DataModelDefinitionResponse getEnrichedDataModel(UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/dataModel/enriched".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<DataModelDefinitionResponse> localVarReturnType = new GenericType<DataModelDefinitionResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getFactSheetResourceModel
     * Retrieves the fact sheet resource model for a workspace
     * @param workspaceId  (optional)
     * @return FactSheetResourceModelResponse
     * @throws ApiException if fails to make API call
     */
    public FactSheetResourceModelResponse getFactSheetResourceModel(UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/factSheetResources".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<FactSheetResourceModelResponse> localVarReturnType = new GenericType<FactSheetResourceModelResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getLanguage
     * Get the given language
     * @param id  (required)
     * @param workspaceId  (optional)
     * @return LanguageResponse
     * @throws ApiException if fails to make API call
     */
    public LanguageResponse getLanguage(String id, UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getLanguage");
        }

        // create path and map variables
        String localVarPath = "/models/languages/{id}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<LanguageResponse> localVarReturnType = new GenericType<LanguageResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getReportingModel
     * Retrieves the report model for a workspace
     * @param workspaceId  (optional)
     * @return ReportingModelResponse
     * @throws ApiException if fails to make API call
     */
    public ReportingModelResponse getReportingModel(UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/reportingModel".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<ReportingModelResponse> localVarReturnType = new GenericType<ReportingModelResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getViewModel
     * Retrieves the view model for a workspace
     * @param workspaceId  (optional)
     * @return ViewModelResponse
     * @throws ApiException if fails to make API call
     */
    public ViewModelResponse getViewModel(UUID workspaceId) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/viewModel".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };

    GenericType<ViewModelResponse> localVarReturnType = new GenericType<ViewModelResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * getAccessControlEntity
   * Reads an access control entity
   * @param id  (required)
   * @return AccessControlEntityResponse
   * @throws ApiException if fails to make API call
   */
  public AccessControlEntityResponse readAccessControlEntity(UUID id) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling readAccessControlEntity");
    }
    
    // create path and map variables
    String localVarPath = "/models/accessControlEntities/{id}".replaceAll("\\{format\\}","json")
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

    GenericType<AccessControlEntityResponse> localVarReturnType = new GenericType<AccessControlEntityResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * updateAccessControlEntity
   * Updates an access control entity
   * @param id  (required)
   * @param accessControlEntity  (optional)
   * @return AccessControlEntityResponse
   * @throws ApiException if fails to make API call
   */
  public AccessControlEntityResponse updateAccessControlEntity(UUID id, AccessControlEntity accessControlEntity) throws ApiException {
    Object localVarPostBody = accessControlEntity;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling updateAccessControlEntity");
    }
    
    // create path and map variables
    String localVarPath = "/models/accessControlEntities/{id}".replaceAll("\\{format\\}","json")
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

      String[] localVarAuthNames = new String[]{"token"};

      GenericType<AccessControlEntityResponse> localVarReturnType = new GenericType<AccessControlEntityResponse>() {
      };
      return apiClient
          .invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
              localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

    /**
     * updateAuthorization
     * Updates all authorization roles for a given workspace. This means all existing roles and its permissions will be overriden
     * @param body The authorization configuration for the workspace which contains all roles and its permissions (required)
     * @param workspaceId  (optional)
     * @return Response
     * @throws ApiException if fails to make API call
     */
    public Response updateAuthorization(List<AuthorizationRole> body, UUID workspaceId) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateAuthorization");
        }

        // create path and map variables
        String localVarPath = "/models/authorization".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<Response> localVarReturnType = new GenericType<Response>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * updateDataModel
     * Updates the data model for a workspace
     * @param body the data model for the workspace (required)
     * @param force whether changes should be forced (optional, default to false)
     * @param workspaceId  (optional)
     * @return DataModelUpdateResponse
     * @throws ApiException if fails to make API call
     */
    public DataModelUpdateResponse updateDataModel(DataModel body, Boolean force, UUID workspaceId) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateDataModel");
        }

        // create path and map variables
        String localVarPath = "/models/dataModel".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<DataModelUpdateResponse> localVarReturnType = new GenericType<DataModelUpdateResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * updateFactSheetResourceModel
     * Updates the fact sheet resource model for a workspace
     * @param body the fact sheet resource model for the workspace (required)
     * @param workspaceId  (optional)
     * @throws ApiException if fails to make API call
     */
    public void updateFactSheetResourceModel(FactSheetResourceModelDefinition body, UUID workspaceId) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateFactSheetResourceModel");
        }

        // create path and map variables
        String localVarPath = "/models/factSheetResources".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
            localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     * updateLanguage
     * Updates the given language
     * @param id  (required)
     * @param definition  (required)
     * @param workspaceId  (optional)
     * @return Response
     * @throws ApiException if fails to make API call
     */
    public Response updateLanguage(String id, Translation definition, UUID workspaceId) throws ApiException {
        Object localVarPostBody = definition;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling updateLanguage");
        }

        // verify the required parameter 'definition' is set
        if (definition == null) {
            throw new ApiException(400, "Missing the required parameter 'definition' when calling updateLanguage");
        }

        // create path and map variables
        String localVarPath = "/models/languages/{id}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id));

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<Response> localVarReturnType = new GenericType<Response>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * updateReportingModel
     * Updates the report model for a workspace
     * @param body the report model for the workspace (required)
     * @param workspaceId  (optional)
     * @throws ApiException if fails to make API call
     */
    public void updateReportingModel(ReportingModelDefinition body, UUID workspaceId) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateReportingModel");
        }

        // create path and map variables
        String localVarPath = "/models/reportingModel".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
            localVarAccept, localVarContentType, localVarAuthNames, null);
    }

    /**
     * updateViewModel
     * Updates the view model for a workspace
     * @param body the view model for the workspace (required)
     * @param workspaceId  (optional)
     * @throws ApiException if fails to make API call
     */
    public void updateViewModel(ViewModelDefinition body, UUID workspaceId) throws ApiException {
        Object localVarPostBody = body;

        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException(400, "Missing the required parameter 'body' when calling updateViewModel");
        }

        // create path and map variables
        String localVarPath = "/models/viewModel".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "workspaceId", workspaceId));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "token" };


    apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
