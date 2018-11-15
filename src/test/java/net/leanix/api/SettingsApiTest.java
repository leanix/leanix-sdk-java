/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.161-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.FactSheetSettings;
import net.leanix.api.models.FactSheetSettingsResponse;
import net.leanix.api.models.Response;
import net.leanix.api.models.SettingsResponse;
import net.leanix.api.models.WorkspaceSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SettingsApi
 */
@Ignore
public class SettingsApiTest {

    private final SettingsApi api = new SettingsApi();

    
    /**
     * getFactSheetSettings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getModelCustomizationTest() throws ApiException {
        String factSheetType = null;
        FactSheetSettingsResponse response = api.getModelCustomization(factSheetType);

        // TODO: test validations
    }
    
    /**
     * getSettings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSettingsTest() throws ApiException {
        SettingsResponse response = api.getSettings();

        // TODO: test validations
    }
    
    /**
     * putFactSheetSettings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateModelsWithCustomizationTest() throws ApiException {
        String factSheetType = null;
        FactSheetSettings body = null;
        api.updateModelsWithCustomization(factSheetType, body);

        // TODO: test validations
    }
    
    /**
     * updateSettings
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSettingsTest() throws ApiException {
        WorkspaceSettings body = null;
        Response response = api.updateSettings(body);

        // TODO: test validations
    }
    
}
