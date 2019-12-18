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
import net.leanix.api.models.FeatureListResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FeaturesApi
 */
@Ignore
public class FeaturesApiTest {

    private final FeaturesApi api = new FeaturesApi();

    
    /**
     * getFeatures
     *
     * Retrieves features for a workspace
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFeaturesTest() throws ApiException {
        FeatureListResponse response = api.getFeatures();

        // TODO: test validations
    }
    
}
