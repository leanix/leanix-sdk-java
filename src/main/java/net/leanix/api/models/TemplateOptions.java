/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.6-SNAPSHOT
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
import net.leanix.api.models.Layout;

/**
 * TemplateOptions
 */

public class TemplateOptions {
  @JsonProperty("relationName")
  private String relationName = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("layout")
  private Layout layout = null;

  public TemplateOptions relationName(String relationName) {
    this.relationName = relationName;
    return this;
  }

   /**
   * Get relationName
   * @return relationName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRelationName() {
    return relationName;
  }

  public void setRelationName(String relationName) {
    this.relationName = relationName;
  }

  public TemplateOptions fieldName(String fieldName) {
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

  public TemplateOptions layout(Layout layout) {
    this.layout = layout;
    return this;
  }

   /**
   * Get layout
   * @return layout
  **/
  @ApiModelProperty(example = "null", value = "")
  public Layout getLayout() {
    return layout;
  }

  public void setLayout(Layout layout) {
    this.layout = layout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateOptions templateOptions = (TemplateOptions) o;
    return Objects.equals(this.relationName, templateOptions.relationName) &&
        Objects.equals(this.fieldName, templateOptions.fieldName) &&
        Objects.equals(this.layout, templateOptions.layout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relationName, fieldName, layout);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateOptions {\n");
    
    sb.append("    relationName: ").append(toIndentedString(relationName)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    layout: ").append(toIndentedString(layout)).append("\n");
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

