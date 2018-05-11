/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.60-SNAPSHOT
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

/**
 * Rule
 */

public class Rule {
  @JsonProperty("tagName")
  private String tagName = null;

  @JsonProperty("operator")
  private String operator = null;

  @JsonProperty("target")
  private String target = null;

  public Rule tagName(String tagName) {
    this.tagName = tagName;
    return this;
  }

   /**
   * Get tagName
   * @return tagName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTagName() {
    return tagName;
  }

  public void setTagName(String tagName) {
    this.tagName = tagName;
  }

  public Rule operator(String operator) {
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOperator() {
    return operator;
  }

  public void setOperator(String operator) {
    this.operator = operator;
  }

  public Rule target(String target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.tagName, rule.tagName) &&
        Objects.equals(this.operator, rule.operator) &&
        Objects.equals(this.target, rule.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagName, operator, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    tagName: ").append(toIndentedString(tagName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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

