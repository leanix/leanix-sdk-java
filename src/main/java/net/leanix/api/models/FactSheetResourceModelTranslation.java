/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.396
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
import net.leanix.api.models.ResourceTypeTranslation;

/**
 * FactSheetResourceModelTranslation
 */

public class FactSheetResourceModelTranslation {
  @JsonProperty("resourceTypes")
  private Map<String, ResourceTypeTranslation> resourceTypes = new HashMap<String, ResourceTypeTranslation>();

  public FactSheetResourceModelTranslation resourceTypes(Map<String, ResourceTypeTranslation> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public FactSheetResourceModelTranslation putResourceTypesItem(String key, ResourceTypeTranslation resourceTypesItem) {
    this.resourceTypes.put(key, resourceTypesItem);
    return this;
  }

   /**
   * Get resourceTypes
   * @return resourceTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ResourceTypeTranslation> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(Map<String, ResourceTypeTranslation> resourceTypes) {
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
    FactSheetResourceModelTranslation factSheetResourceModelTranslation = (FactSheetResourceModelTranslation) o;
    return Objects.equals(this.resourceTypes, factSheetResourceModelTranslation.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetResourceModelTranslation {\n");
    
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

