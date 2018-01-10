/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.14-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.ExportListResponse;
import net.leanix.api.models.JobResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExportsApi
 */
@Ignore
public class ExportsApiTest {

    private final ExportsApi api = new ExportsApi();

    
    /**
     * createExportFile
     *
     * Creates an excel export file by using the given graphQL query and table configuration
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createExportFileTest() throws ApiException {
        JobResponse response = api.createExportFile();

        // TODO: test validations
    }
    
    /**
     * createFullExport
     *
     * Creates a full export of the workspace data, or an export of the changelog, depending on given type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFullExportTest() throws ApiException {
        String exportType = null;
        String startDate = null;
        String endDate = null;
        JobResponse response = api.createFullExport(exportType, startDate, endDate);

        // TODO: test validations
    }
    
    /**
     * downloadExportFile
     *
     * Returns the download file for the given ID
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadExportFileTest() throws ApiException {
        String workspaceId = null;
        String key = null;
        api.downloadExportFile(workspaceId, key);

        // TODO: test validations
    }
    
    /**
     * getExports
     *
     * Lists all exports of the given type in the workspace of the authorized user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExportsTest() throws ApiException {
        String exportType = null;
        Integer pageSize = null;
        String cursor = null;
        String sorting = null;
        String sortDirection = null;
        ExportListResponse response = api.getExports(exportType, pageSize, cursor, sorting, sortDirection);

        // TODO: test validations
    }
    
}
