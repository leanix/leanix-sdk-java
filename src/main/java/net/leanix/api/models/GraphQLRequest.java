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


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * GraphQLRequest
 */

public class GraphQLRequest {
  @JsonProperty("query")
  private String query = null;

  @JsonProperty("variables")
  private Map<String, Object> variables = new HashMap<String, Object>();

  @JsonProperty("operationName")
  private String operationName = null;

  public GraphQLRequest query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Get query
   * @return query
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public GraphQLRequest variables(Map<String, Object> variables) {
    this.variables = variables;
    return this;
  }

  public GraphQLRequest putVariablesItem(String key, Object variablesItem) {
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getVariables() {
    return variables;
  }

  public void setVariables(Map<String, Object> variables) {
    this.variables = variables;
  }

  public GraphQLRequest operationName(String operationName) {
    this.operationName = operationName;
    return this;
  }

   /**
   * Get operationName
   * @return operationName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOperationName() {
    return operationName;
  }

  public void setOperationName(String operationName) {
    this.operationName = operationName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQLRequest graphQLRequest = (GraphQLRequest) o;
    return Objects.equals(this.query, graphQLRequest.query) &&
        Objects.equals(this.variables, graphQLRequest.variables) &&
        Objects.equals(this.operationName, graphQLRequest.operationName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, variables, operationName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQLRequest {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    operationName: ").append(toIndentedString(operationName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

