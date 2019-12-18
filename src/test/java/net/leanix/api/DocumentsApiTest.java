/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.6-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentsApi
 */
@Ignore
public class DocumentsApiTest {

    private final DocumentsApi api = new DocumentsApi();

    
    /**
     * downloadDocument
     *
     * Download a document&#39;s content
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadDocumentTest() throws ApiException {
        String documentId = null;
        api.downloadDocument(documentId);

        // TODO: test validations
    }
    
}
