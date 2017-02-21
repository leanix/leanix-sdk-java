/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.10-SNAPSHOT
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
import java.util.List;
import java.util.Map;
import net.leanix.api.models.Completion;

/**
 * ConcreteCompletion
 */

public class ConcreteCompletion extends Completion {
  @JsonProperty("type")
  private String type = null;

  @JsonProperty("completion")
  private Double completion = null;

  @JsonProperty("percentage")
  private Integer percentage = null;

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConcreteCompletion concreteCompletion = (ConcreteCompletion) o;
    return Objects.equals(this.type, concreteCompletion.type) &&
        Objects.equals(this.completion, concreteCompletion.completion) &&
        Objects.equals(this.percentage, concreteCompletion.percentage) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, completion, percentage, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConcreteCompletion {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

