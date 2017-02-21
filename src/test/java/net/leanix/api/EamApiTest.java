/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.10-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.JobResponse;
import net.leanix.api.models.StartSyncWorkspaceRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EamApi
 */
@Ignore
public class EamApiTest {

    private final EamApi api = new EamApi();

    
    /**
     * createRandomWorkspace
     *
     * Starts generation of a random workspace. This method is useful if you want to setup a large workspace in order to get an impression of pathfinder&#39;s performance on large workspaces.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRandomWorkspaceTest() throws ApiException {
        Integer numberOfApplications = null;
        Integer levelCountItComponents = null;
        JobResponse response = api.createRandomWorkspace(numberOfApplications, levelCountItComponents);

        // TODO: test validations
    }
    
    /**
     * startSync
     *
     * Starts the synchronization of a workspace.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void startSyncTest() throws ApiException {
        StartSyncWorkspaceRequest body = null;
        JobResponse response = api.startSync(body);

        // TODO: test validations
    }
    
}
