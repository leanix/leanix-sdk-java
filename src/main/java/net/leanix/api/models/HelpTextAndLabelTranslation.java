/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.170
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * HelpTextAndLabelTranslation
 */

public class HelpTextAndLabelTranslation {
  @JsonProperty("helpText")
  private String helpText = null;

  @JsonProperty("label")
  private String label = null;

  public HelpTextAndLabelTranslation helpText(String helpText) {
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

  public HelpTextAndLabelTranslation label(String label) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelpTextAndLabelTranslation helpTextAndLabelTranslation = (HelpTextAndLabelTranslation) o;
    return Objects.equals(this.helpText, helpTextAndLabelTranslation.helpText) &&
        Objects.equals(this.label, helpTextAndLabelTranslation.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helpText, label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpTextAndLabelTranslation {\n");
    
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

