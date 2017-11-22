/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.140-SNAPSHOT
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
import net.leanix.api.models.ConfigTypeOnOffWithTime;

/**
 * FactSheetConfiguration
 */

public class FactSheetConfiguration {
  @JsonProperty("qualitySeal")
  private ConfigTypeOnOffWithTime qualitySeal = null;

  @JsonProperty("maxHierarchyLevel")
  private Integer maxHierarchyLevel = null;

  public FactSheetConfiguration qualitySeal(ConfigTypeOnOffWithTime qualitySeal) {
    this.qualitySeal = qualitySeal;
    return this;
  }

   /**
   * Get qualitySeal
   * @return qualitySeal
  **/
  @ApiModelProperty(example = "null", value = "")
  public ConfigTypeOnOffWithTime getQualitySeal() {
    return qualitySeal;
  }

  public void setQualitySeal(ConfigTypeOnOffWithTime qualitySeal) {
    this.qualitySeal = qualitySeal;
  }

  public FactSheetConfiguration maxHierarchyLevel(Integer maxHierarchyLevel) {
    this.maxHierarchyLevel = maxHierarchyLevel;
    return this;
  }

   /**
   * Get maxHierarchyLevel
   * @return maxHierarchyLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMaxHierarchyLevel() {
    return maxHierarchyLevel;
  }

  public void setMaxHierarchyLevel(Integer maxHierarchyLevel) {
    this.maxHierarchyLevel = maxHierarchyLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetConfiguration factSheetConfiguration = (FactSheetConfiguration) o;
    return Objects.equals(this.qualitySeal, factSheetConfiguration.qualitySeal) &&
        Objects.equals(this.maxHierarchyLevel, factSheetConfiguration.maxHierarchyLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualitySeal, maxHierarchyLevel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetConfiguration {\n");
    
    sb.append("    qualitySeal: ").append(toIndentedString(qualitySeal)).append("\n");
    sb.append("    maxHierarchyLevel: ").append(toIndentedString(maxHierarchyLevel)).append("\n");
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

