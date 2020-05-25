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
 * Series
 */

public class Series {
  @JsonProperty("title")
  private String title = null;

  @JsonProperty("measurement")
  private String measurement = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("tagsRule")
  private TagsRule tagsRule = null;

  @JsonProperty("aggregationFunction")
  private String aggregationFunction = null;

  @JsonProperty("grouping")
  private String grouping = null;

  @JsonProperty("color")
  private String color = null;

  public Series title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Series measurement(String measurement) {
    this.measurement = measurement;
    return this;
  }

   /**
   * Get measurement
   * @return measurement
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMeasurement() {
    return measurement;
  }

  public void setMeasurement(String measurement) {
    this.measurement = measurement;
  }

  public Series fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

   /**
   * Get fieldName
   * @return fieldName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public Series type(String type) {
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

  public Series tagsRule(TagsRule tagsRule) {
    this.tagsRule = tagsRule;
    return this;
  }

   /**
   * Get tagsRule
   * @return tagsRule
  **/
  @ApiModelProperty(example = "null", value = "")
  public TagsRule getTagsRule() {
    return tagsRule;
  }

  public void setTagsRule(TagsRule tagsRule) {
    this.tagsRule = tagsRule;
  }

  public Series aggregationFunction(String aggregationFunction) {
    this.aggregationFunction = aggregationFunction;
    return this;
  }

   /**
   * Get aggregationFunction
   * @return aggregationFunction
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAggregationFunction() {
    return aggregationFunction;
  }

  public void setAggregationFunction(String aggregationFunction) {
    this.aggregationFunction = aggregationFunction;
  }

  public Series grouping(String grouping) {
    this.grouping = grouping;
    return this;
  }

   /**
   * Get grouping
   * @return grouping
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGrouping() {
    return grouping;
  }

  public void setGrouping(String grouping) {
    this.grouping = grouping;
  }

  public Series color(String color) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Series series = (Series) o;
    return Objects.equals(this.title, series.title) &&
        Objects.equals(this.measurement, series.measurement) &&
        Objects.equals(this.fieldName, series.fieldName) &&
        Objects.equals(this.type, series.type) &&
        Objects.equals(this.tagsRule, series.tagsRule) &&
        Objects.equals(this.aggregationFunction, series.aggregationFunction) &&
        Objects.equals(this.grouping, series.grouping) &&
        Objects.equals(this.color, series.color);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, measurement, fieldName, type, tagsRule, aggregationFunction, grouping, color);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Series {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    measurement: ").append(toIndentedString(measurement)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tagsRule: ").append(toIndentedString(tagsRule)).append("\n");
    sb.append("    aggregationFunction: ").append(toIndentedString(aggregationFunction)).append("\n");
    sb.append("    grouping: ").append(toIndentedString(grouping)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
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

