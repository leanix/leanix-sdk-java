/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.DataType;

/**
 * MultipleSelectType
 */

public class MultipleSelectType extends DataType {
  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  @JsonProperty("values")
  private List<String> values = new ArrayList<String>();

   /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMandatory() {
    return mandatory;
  }

  public MultipleSelectType values(List<String> values) {
    this.values = values;
    return this;
  }

  public MultipleSelectType addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultipleSelectType multipleSelectType = (MultipleSelectType) o;
    return Objects.equals(this.mandatory, multipleSelectType.mandatory) &&
        Objects.equals(this.values, multipleSelectType.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, values, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultipleSelectType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

