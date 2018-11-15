/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.161-SNAPSHOT
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
import net.leanix.api.models.CustomizationConfig;
import net.leanix.api.models.CustomizationLocalisedLabel;
import net.leanix.api.models.CustomizationSection;

/**
 * FactSheetSettings
 */

public class FactSheetSettings {
  @JsonProperty("bgColor")
  private String bgColor = null;

  @JsonProperty("onTheFlyCreation")
  private Boolean onTheFlyCreation = false;

  @JsonProperty("config")
  private CustomizationConfig config = null;

  @JsonProperty("sections")
  private Map<String, CustomizationSection> sections = new HashMap<String, CustomizationSection>();

  @JsonProperty("labels")
  private Map<String, CustomizationLocalisedLabel> labels = new HashMap<String, CustomizationLocalisedLabel>();

  public FactSheetSettings bgColor(String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

   /**
   * Get bgColor
   * @return bgColor
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  public FactSheetSettings onTheFlyCreation(Boolean onTheFlyCreation) {
    this.onTheFlyCreation = onTheFlyCreation;
    return this;
  }

   /**
   * Get onTheFlyCreation
   * @return onTheFlyCreation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getOnTheFlyCreation() {
    return onTheFlyCreation;
  }

  public void setOnTheFlyCreation(Boolean onTheFlyCreation) {
    this.onTheFlyCreation = onTheFlyCreation;
  }

  public FactSheetSettings config(CustomizationConfig config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CustomizationConfig getConfig() {
    return config;
  }

  public void setConfig(CustomizationConfig config) {
    this.config = config;
  }

  public FactSheetSettings sections(Map<String, CustomizationSection> sections) {
    this.sections = sections;
    return this;
  }

  public FactSheetSettings putSectionsItem(String key, CustomizationSection sectionsItem) {
    this.sections.put(key, sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, CustomizationSection> getSections() {
    return sections;
  }

  public void setSections(Map<String, CustomizationSection> sections) {
    this.sections = sections;
  }

  public FactSheetSettings labels(Map<String, CustomizationLocalisedLabel> labels) {
    this.labels = labels;
    return this;
  }

  public FactSheetSettings putLabelsItem(String key, CustomizationLocalisedLabel labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, CustomizationLocalisedLabel> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, CustomizationLocalisedLabel> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetSettings factSheetSettings = (FactSheetSettings) o;
    return Objects.equals(this.bgColor, factSheetSettings.bgColor) &&
        Objects.equals(this.onTheFlyCreation, factSheetSettings.onTheFlyCreation) &&
        Objects.equals(this.config, factSheetSettings.config) &&
        Objects.equals(this.sections, factSheetSettings.sections) &&
        Objects.equals(this.labels, factSheetSettings.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bgColor, onTheFlyCreation, config, sections, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetSettings {\n");
    
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    onTheFlyCreation: ").append(toIndentedString(onTheFlyCreation)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

