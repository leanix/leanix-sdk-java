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
import net.leanix.api.models.MetaModelActionBatchListResponse;
import net.leanix.api.models.MetaModelActionBatchResponse;
import net.leanix.api.models.MetaModelResponse;


public class MetaModelApi {

    private ApiClient apiClient;

    public MetaModelApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetaModelApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * getMetaModelActionBatch
     * Return a single action batch
     * @param id  (required)
     * @return MetaModelActionBatchResponse
     * @throws ApiException if fails to make API call
     */
    public MetaModelActionBatchResponse getActionBatch(UUID id) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException(400, "Missing the required parameter 'id' when calling getActionBatch");
        }

        // create path and map variables
        String localVarPath = "/models/metaModel/actionBatches/{id}".replaceAll("\\{format\\}", "json")
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

        GenericType<MetaModelActionBatchResponse> localVarReturnType = new GenericType<MetaModelActionBatchResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getMetaModelActionBatches
     * Return existing action batches
     * @param page The page number to access (1 indexed, defaults to 1) (optional, default to 1)
     * @param size The page size requested (defaults to 20, max 100) (optional, default to 20)
     * @return MetaModelActionBatchListResponse
     * @throws ApiException if fails to make API call
     */
    public MetaModelActionBatchListResponse getActionBatches(Integer page, Integer size) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/metaModel/actionBatches".replaceAll("\\{format\\}", "json");

        // query params
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[]{"token"};

        GenericType<MetaModelActionBatchListResponse> localVarReturnType = new GenericType<MetaModelActionBatchListResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getMetaModel
     * Retrieves the full meta model
     * @return MetaModelResponse
     * @throws ApiException if fails to make API call
     */
    public MetaModelResponse getDataModel() throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/metaModel".replaceAll("\\{format\\}", "json");

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

        GenericType<MetaModelResponse> localVarReturnType = new GenericType<MetaModelResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * getMetaModelForFactSheetType
     * Retrieves the meta model of the requested fact sheet type
     * @param factSheetType  (required)
     * @return MetaModelResponse
     * @throws ApiException if fails to make API call
     */
    public MetaModelResponse getDataModelForType(String factSheetType) throws ApiException {
        Object localVarPostBody = null;

        // verify the required parameter 'factSheetType' is set
        if (factSheetType == null) {
            throw new ApiException(400, "Missing the required parameter 'factSheetType' when calling getDataModelForType");
        }

        // create path and map variables
        String localVarPath = "/models/metaModel/{factSheetType}".replaceAll("\\{format\\}", "json")
            .replaceAll("\\{" + "factSheetType" + "\\}", apiClient.escapeString(factSheetType));

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

        GenericType<MetaModelResponse> localVarReturnType = new GenericType<MetaModelResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * postMetaModelActionBatch
     * Apply a batch of actions to the metamodel
     * @return MetaModelActionBatchResponse
     * @throws ApiException if fails to make API call
     */
    public MetaModelActionBatchResponse postActionBatch() throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/models/metaModel/actionBatches".replaceAll("\\{format\\}", "json");

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

        GenericType<MetaModelActionBatchResponse> localVarReturnType = new GenericType<MetaModelActionBatchResponse>() {
        };
        return apiClient
            .invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams,
                localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }
}
