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
import java.util.List;
import java.util.Map;
import net.leanix.api.models.DataType;

/**
 * FactSheetReferencesType
 */

public class FactSheetReferencesType extends DataType {
  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  @JsonProperty("targetFactSheetType")
  private String targetFactSheetType = null;

  @JsonProperty("identifyingField")
  private String identifyingField = null;

   /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMandatory() {
    return mandatory;
  }

   /**
   * Get targetFactSheetType
   * @return targetFactSheetType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTargetFactSheetType() {
    return targetFactSheetType;
  }

   /**
   * Get identifyingField
   * @return identifyingField
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdentifyingField() {
    return identifyingField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetReferencesType factSheetReferencesType = (FactSheetReferencesType) o;
    return Objects.equals(this.mandatory, factSheetReferencesType.mandatory) &&
        Objects.equals(this.targetFactSheetType, factSheetReferencesType.targetFactSheetType) &&
        Objects.equals(this.identifyingField, factSheetReferencesType.identifyingField) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, targetFactSheetType, identifyingField, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetReferencesType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    targetFactSheetType: ").append(toIndentedString(targetFactSheetType)).append("\n");
    sb.append("    identifyingField: ").append(toIndentedString(identifyingField)).append("\n");
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
