/**
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.models.JobResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    
    /**
     * cancelJob
     *
     * Stop a running job or avoid to start a queued job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cancelJobTest() throws ApiException {
        String jobId = null;
        // JobResponse response = api.cancelJob(jobId);

        // TODO: test validations
    }
    
    /**
     * getJobStatus
     *
     * Provides information about running or finished jobs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobStatusTest() throws ApiException {
        String jobId = null;
        // JobResponse response = api.getJobStatus(jobId);

        // TODO: test validations
    }
    
}
