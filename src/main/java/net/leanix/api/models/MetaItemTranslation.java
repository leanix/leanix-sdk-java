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
import net.leanix.api.models.MetaItemTranslationNumber;

/**
 * MetaItemTranslation
 */

public class MetaItemTranslation {
  @JsonProperty("label")
  private String label = null;

  @JsonProperty("number")
  private MetaItemTranslationNumber number = null;

  @JsonProperty("helpText")
  private String helpText = null;

  public MetaItemTranslation label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public MetaItemTranslation number(MetaItemTranslationNumber number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public MetaItemTranslationNumber getNumber() {
    return number;
  }

  public void setNumber(MetaItemTranslationNumber number) {
    this.number = number;
  }

  public MetaItemTranslation helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }

   /**
   * Get helpText
   * @return helpText
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHelpText() {
    return helpText;
  }

  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaItemTranslation metaItemTranslation = (MetaItemTranslation) o;
    return Objects.equals(this.label, metaItemTranslation.label) &&
        Objects.equals(this.number, metaItemTranslation.number) &&
        Objects.equals(this.helpText, metaItemTranslation.helpText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, number, helpText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaItemTranslation {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
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

