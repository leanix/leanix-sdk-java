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
import net.leanix.api.models.HelpTextAndLabelTranslation;

/**
 * ViewModelTranslation
 */

public class ViewModelTranslation {
  @JsonProperty("section")
  private Map<String, String> section = new HashMap<String, String>();

  @JsonProperty("subsection")
  private Map<String, HelpTextAndLabelTranslation> subsection = new HashMap<String, HelpTextAndLabelTranslation>();

  public ViewModelTranslation section(Map<String, String> section) {
    this.section = section;
    return this;
  }

  public ViewModelTranslation putSectionItem(String key, String sectionItem) {
    this.section.put(key, sectionItem);
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getSection() {
    return section;
  }

  public void setSection(Map<String, String> section) {
    this.section = section;
  }

  public ViewModelTranslation subsection(Map<String, HelpTextAndLabelTranslation> subsection) {
    this.subsection = subsection;
    return this;
  }

  public ViewModelTranslation putSubsectionItem(String key, HelpTextAndLabelTranslation subsectionItem) {
    this.subsection.put(key, subsectionItem);
    return this;
  }

   /**
   * Get subsection
   * @return subsection
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, HelpTextAndLabelTranslation> getSubsection() {
    return subsection;
  }

  public void setSubsection(Map<String, HelpTextAndLabelTranslation> subsection) {
    this.subsection = subsection;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewModelTranslation viewModelTranslation = (ViewModelTranslation) o;
    return Objects.equals(this.section, viewModelTranslation.section) &&
        Objects.equals(this.subsection, viewModelTranslation.subsection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(section, subsection);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewModelTranslation {\n");
    
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    subsection: ").append(toIndentedString(subsection)).append("\n");
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

