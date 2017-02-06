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
import net.leanix.api.models.Relation;
import net.leanix.api.models.RelationResponse;
import net.leanix.api.models.BasicResponse;
import org.junit.Test;


/**
 * API tests for RelationsApi
 */
public class RelationsApiTest {

    private final RelationsApi api = new RelationsApi();

    
    /**
     * createRelation
     *
     * Creates the given relation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRelationTest() throws ApiException {
        Relation relation = null;
        // RelationResponse response = api.createRelation(relation);

        // TODO: test validations
    }
    
    /**
     * deleteRelation
     *
     * Deletes the given relation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRelationTest() throws ApiException {
        String id = null;
        // BasicResponse response = api.deleteRelation(id);

        // TODO: test validations
    }
    
    /**
     * updateRelation
     *
     * Updates the given relation
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRelationTest() throws ApiException {
        String id = null;
        Relation relation = null;
        // RelationResponse response = api.updateRelation(id, relation);

        // TODO: test validations
    }
    
}
