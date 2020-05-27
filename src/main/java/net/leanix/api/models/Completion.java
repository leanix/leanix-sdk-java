/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.174
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Completion
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = SectionCompletion.class, name = "SectionCompletion"),
  @JsonSubTypes.Type(value = ConcreteCompletion.class, name = "ConcreteCompletion"),
})

public class Completion {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("completion")
  private Double completion = null;

  @JsonProperty("percentage")
  private Integer percentage = null;

  @JsonProperty("subCompletions")
  private Map<String, Completion> subCompletions = new HashMap<String, Completion>();

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

   /**
   * Get completion
   * @return completion
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCompletion() {
    return completion;
  }

   /**
   * Get percentage
   * @return percentage
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getPercentage() {
    return percentage;
  }

  public Completion subCompletions(Map<String, Completion> subCompletions) {
    this.subCompletions = subCompletions;
    return this;
  }

  public Completion putSubCompletionsItem(String key, Completion subCompletionsItem) {
    this.subCompletions.put(key, subCompletionsItem);
    return this;
  }

   /**
   * Get subCompletions
   * @return subCompletions
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Completion> getSubCompletions() {
    return subCompletions;
  }

  public void setSubCompletions(Map<String, Completion> subCompletions) {
    this.subCompletions = subCompletions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Completion completion = (Completion) o;
    return Objects.equals(this.type, completion.type) &&
        Objects.equals(this.completion, completion.completion) &&
        Objects.equals(this.percentage, completion.percentage) &&
        Objects.equals(this.subCompletions, completion.subCompletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, completion, percentage, subCompletions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Completion {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    subCompletions: ").append(toIndentedString(subCompletions)).append("\n");
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

