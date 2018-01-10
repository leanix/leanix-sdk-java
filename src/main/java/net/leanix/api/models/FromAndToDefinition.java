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


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FromAndToDefinition
 */

public class FromAndToDefinition {
  @JsonProperty("factSheetType")
  private String factSheetType = null;

  /**
   * Gets or Sets multiplicity
   */
  public enum MultiplicityEnum {
    SINGLE("SINGLE"),
    
    MULTI("MULTI");

    private String value;

    MultiplicityEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MultiplicityEnum fromValue(String text) {
      for (MultiplicityEnum b : MultiplicityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("multiplicity")
  private MultiplicityEnum multiplicity = null;

  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("groupByTargetField")
  private String groupByTargetField = null;

  public FromAndToDefinition factSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
    return this;
  }

   /**
   * Get factSheetType
   * @return factSheetType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFactSheetType() {
    return factSheetType;
  }

  public void setFactSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
  }

  public FromAndToDefinition multiplicity(MultiplicityEnum multiplicity) {
    this.multiplicity = multiplicity;
    return this;
  }

   /**
   * Get multiplicity
   * @return multiplicity
  **/
  @ApiModelProperty(example = "null", value = "")
  public MultiplicityEnum getMultiplicity() {
    return multiplicity;
  }

  public void setMultiplicity(MultiplicityEnum multiplicity) {
    this.multiplicity = multiplicity;
  }

  public FromAndToDefinition mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public FromAndToDefinition groupByTargetField(String groupByTargetField) {
    this.groupByTargetField = groupByTargetField;
    return this;
  }

   /**
   * Get groupByTargetField
   * @return groupByTargetField
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupByTargetField() {
    return groupByTargetField;
  }

  public void setGroupByTargetField(String groupByTargetField) {
    this.groupByTargetField = groupByTargetField;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FromAndToDefinition fromAndToDefinition = (FromAndToDefinition) o;
    return Objects.equals(this.factSheetType, fromAndToDefinition.factSheetType) &&
        Objects.equals(this.multiplicity, fromAndToDefinition.multiplicity) &&
        Objects.equals(this.mandatory, fromAndToDefinition.mandatory) &&
        Objects.equals(this.name, fromAndToDefinition.name) &&
        Objects.equals(this.groupByTargetField, fromAndToDefinition.groupByTargetField);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factSheetType, multiplicity, mandatory, name, groupByTargetField);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FromAndToDefinition {\n");
    
    sb.append("    factSheetType: ").append(toIndentedString(factSheetType)).append("\n");
    sb.append("    multiplicity: ").append(toIndentedString(multiplicity)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    groupByTargetField: ").append(toIndentedString(groupByTargetField)).append("\n");
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

