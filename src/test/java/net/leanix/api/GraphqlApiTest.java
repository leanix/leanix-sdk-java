/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.132-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import java.io.File;
import net.leanix.api.models.GraphQLRequest;
import net.leanix.api.models.GraphQLResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GraphqlApi
 */
@Ignore
public class GraphqlApiTest {

    private final GraphqlApi api = new GraphqlApi();

    
    /**
     * processGraphQL
     *
     * Processes GraphQL requests
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGraphQLTest() throws ApiException {
        GraphQLRequest request = null;
        GraphQLResult response = api.processGraphQL(request);

        // TODO: test validations
    }
    
    /**
     * processGraphQLMultipart
     *
     * Processes GraphQL requests, supporting multipart documents
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void processGraphQLMultipartTest() throws ApiException {
        String graphQLRequest = null;
        File file = null;
        GraphQLResult response = api.processGraphQLMultipart(graphQLRequest, file);

        // TODO: test validations
    }
    
}