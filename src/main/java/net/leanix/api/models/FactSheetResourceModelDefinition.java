/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.174
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * FactSheetResourceModelDefinition
 */

public class FactSheetResourceModelDefinition {

  @JsonProperty("resourceTypes")
  private Map<String, ResourceTypeSection> resourceTypes = new HashMap<String, ResourceTypeSection>();

  public FactSheetResourceModelDefinition resourceTypes(Map<String, ResourceTypeSection> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public FactSheetResourceModelDefinition putResourceTypesItem(String key, ResourceTypeSection resourceTypesItem) {
    this.resourceTypes.put(key, resourceTypesItem);
    return this;
  }

  /**
   * Get resourceTypes
   * @return resourceTypes
   **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ResourceTypeSection> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(Map<String, ResourceTypeSection> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetResourceModelDefinition factSheetResourceModelDefinition = (FactSheetResourceModelDefinition) o;
    return Objects.equals(this.resourceTypes, factSheetResourceModelDefinition.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetResourceModelDefinition {\n");

    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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

