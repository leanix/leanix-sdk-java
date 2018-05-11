/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.60-SNAPSHOT
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
 * API tests for AssetsApi
 */
@Ignore
public class AssetsApiTest {

    private final AssetsApi api = new AssetsApi();

    
    /**
     * deleteAsset
     *
     * Delete an asset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAssetTest() throws ApiException {
        String asset = null;
        api.deleteAsset(asset);

        // TODO: test validations
    }
    
    /**
     * downloadAsset
     *
     * Download an asset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadAssetTest() throws ApiException {
        String asset = null;
        api.downloadAsset(asset);

        // TODO: test validations
    }
    
    /**
     * upsertAsset
     *
     * Upsert an asset
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void upsertAssetTest() throws ApiException {
        String asset = null;
        api.upsertAsset(asset);

        // TODO: test validations
    }
    
}
