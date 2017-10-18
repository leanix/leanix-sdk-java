/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.132-SNAPSHOT
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
import net.leanix.api.models.NamingRuleDefinition;

/**
 * RulesDefinition
 */

public class RulesDefinition {
  @JsonProperty("defaultNamingRule")
  private NamingRuleDefinition defaultNamingRule = null;

  public RulesDefinition defaultNamingRule(NamingRuleDefinition defaultNamingRule) {
    this.defaultNamingRule = defaultNamingRule;
    return this;
  }

   /**
   * Get defaultNamingRule
   * @return defaultNamingRule
  **/
  @ApiModelProperty(example = "null", value = "")
  public NamingRuleDefinition getDefaultNamingRule() {
    return defaultNamingRule;
  }

  public void setDefaultNamingRule(NamingRuleDefinition defaultNamingRule) {
    this.defaultNamingRule = defaultNamingRule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesDefinition rulesDefinition = (RulesDefinition) o;
    return Objects.equals(this.defaultNamingRule, rulesDefinition.defaultNamingRule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultNamingRule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesDefinition {\n");
    
    sb.append("    defaultNamingRule: ").append(toIndentedString(defaultNamingRule)).append("\n");
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

