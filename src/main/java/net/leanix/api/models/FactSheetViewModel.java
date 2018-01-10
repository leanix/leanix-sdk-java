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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.HoverConfig;
import net.leanix.api.models.Section;

/**
 * FactSheetViewModel
 */

public class FactSheetViewModel {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("bgColor")
  private String bgColor = null;

  @JsonProperty("color")
  private String color = null;

  @JsonProperty("onTheFlyCreation")
  private Boolean onTheFlyCreation = false;

  @JsonProperty("fieldMetaData")
  private Map<String, Object> fieldMetaData = new HashMap<String, Object>();

  @JsonProperty("sections")
  private List<Section> sections = new ArrayList<Section>();

  @JsonProperty("hoverConfig")
  private HoverConfig hoverConfig = null;

  public FactSheetViewModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FactSheetViewModel bgColor(String bgColor) {
    this.bgColor = bgColor;
    return this;
  }

   /**
   * Get bgColor
   * @return bgColor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBgColor() {
    return bgColor;
  }

  public void setBgColor(String bgColor) {
    this.bgColor = bgColor;
  }

  public FactSheetViewModel color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public FactSheetViewModel onTheFlyCreation(Boolean onTheFlyCreation) {
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

  public FactSheetViewModel fieldMetaData(Map<String, Object> fieldMetaData) {
    this.fieldMetaData = fieldMetaData;
    return this;
  }

  public FactSheetViewModel putFieldMetaDataItem(String key, Object fieldMetaDataItem) {
    this.fieldMetaData.put(key, fieldMetaDataItem);
    return this;
  }

   /**
   * Get fieldMetaData
   * @return fieldMetaData
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getFieldMetaData() {
    return fieldMetaData;
  }

  public void setFieldMetaData(Map<String, Object> fieldMetaData) {
    this.fieldMetaData = fieldMetaData;
  }

  public FactSheetViewModel sections(List<Section> sections) {
    this.sections = sections;
    return this;
  }

  public FactSheetViewModel addSectionsItem(Section sectionsItem) {
    this.sections.add(sectionsItem);
    return this;
  }

   /**
   * Get sections
   * @return sections
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Section> getSections() {
    return sections;
  }

  public void setSections(List<Section> sections) {
    this.sections = sections;
  }

  public FactSheetViewModel hoverConfig(HoverConfig hoverConfig) {
    this.hoverConfig = hoverConfig;
    return this;
  }

   /**
   * Get hoverConfig
   * @return hoverConfig
  **/
  @ApiModelProperty(example = "null", value = "")
  public HoverConfig getHoverConfig() {
    return hoverConfig;
  }

  public void setHoverConfig(HoverConfig hoverConfig) {
    this.hoverConfig = hoverConfig;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetViewModel factSheetViewModel = (FactSheetViewModel) o;
    return Objects.equals(this.type, factSheetViewModel.type) &&
        Objects.equals(this.bgColor, factSheetViewModel.bgColor) &&
        Objects.equals(this.color, factSheetViewModel.color) &&
        Objects.equals(this.onTheFlyCreation, factSheetViewModel.onTheFlyCreation) &&
        Objects.equals(this.fieldMetaData, factSheetViewModel.fieldMetaData) &&
        Objects.equals(this.sections, factSheetViewModel.sections) &&
        Objects.equals(this.hoverConfig, factSheetViewModel.hoverConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, bgColor, color, onTheFlyCreation, fieldMetaData, sections, hoverConfig);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetViewModel {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    bgColor: ").append(toIndentedString(bgColor)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    onTheFlyCreation: ").append(toIndentedString(onTheFlyCreation)).append("\n");
    sb.append("    fieldMetaData: ").append(toIndentedString(fieldMetaData)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
    sb.append("    hoverConfig: ").append(toIndentedString(hoverConfig)).append("\n");
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

