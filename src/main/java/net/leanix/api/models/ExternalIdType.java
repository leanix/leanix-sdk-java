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
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.DataType;

/**
 * ExternalIdType
 */

public class ExternalIdType extends DataType {
  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  @JsonProperty("urlTemplate")
  private String urlTemplate = null;

  @JsonProperty("uniqueFactSheet")
  private Boolean uniqueFactSheet = false;

  @JsonProperty("autoIncrement")
  private Boolean autoIncrement = false;

  @JsonProperty("readOnly")
  private Boolean readOnly = false;

  @JsonProperty("validators")
  private List<String> validators = new ArrayList<String>();

   /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getMandatory() {
    return mandatory;
  }

   /**
   * Get urlTemplate
   * @return urlTemplate
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrlTemplate() {
    return urlTemplate;
  }

   /**
   * Get uniqueFactSheet
   * @return uniqueFactSheet
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getUniqueFactSheet() {
    return uniqueFactSheet;
  }

   /**
   * Get autoIncrement
   * @return autoIncrement
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getAutoIncrement() {
    return autoIncrement;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public ExternalIdType validators(List<String> validators) {
    this.validators = validators;
    return this;
  }

  public ExternalIdType addValidatorsItem(String validatorsItem) {
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getValidators() {
    return validators;
  }

  public void setValidators(List<String> validators) {
    this.validators = validators;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalIdType externalIdType = (ExternalIdType) o;
    return Objects.equals(this.mandatory, externalIdType.mandatory) &&
        Objects.equals(this.urlTemplate, externalIdType.urlTemplate) &&
        Objects.equals(this.uniqueFactSheet, externalIdType.uniqueFactSheet) &&
        Objects.equals(this.autoIncrement, externalIdType.autoIncrement) &&
        Objects.equals(this.readOnly, externalIdType.readOnly) &&
        Objects.equals(this.validators, externalIdType.validators) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandatory, urlTemplate, uniqueFactSheet, autoIncrement, readOnly, validators, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
    sb.append("    uniqueFactSheet: ").append(toIndentedString(uniqueFactSheet)).append("\n");
    sb.append("    autoIncrement: ").append(toIndentedString(autoIncrement)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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

