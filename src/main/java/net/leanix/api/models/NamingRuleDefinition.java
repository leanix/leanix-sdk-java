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
import net.leanix.api.models.Config;

/**
 * NamingRuleDefinition
 */

public class NamingRuleDefinition {
  @JsonProperty("regular")
  private Config regular = null;

  @JsonProperty("autogenerate")
  private Config autogenerate = null;

  public NamingRuleDefinition regular(Config regular) {
    this.regular = regular;
    return this;
  }

   /**
   * Get regular
   * @return regular
  **/
  @ApiModelProperty(example = "null", value = "")
  public Config getRegular() {
    return regular;
  }

  public void setRegular(Config regular) {
    this.regular = regular;
  }

  public NamingRuleDefinition autogenerate(Config autogenerate) {
    this.autogenerate = autogenerate;
    return this;
  }

   /**
   * Get autogenerate
   * @return autogenerate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Config getAutogenerate() {
    return autogenerate;
  }

  public void setAutogenerate(Config autogenerate) {
    this.autogenerate = autogenerate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamingRuleDefinition namingRuleDefinition = (NamingRuleDefinition) o;
    return Objects.equals(this.regular, namingRuleDefinition.regular) &&
        Objects.equals(this.autogenerate, namingRuleDefinition.autogenerate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regular, autogenerate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamingRuleDefinition {\n");
    
    sb.append("    regular: ").append(toIndentedString(regular)).append("\n");
    sb.append("    autogenerate: ").append(toIndentedString(autogenerate)).append("\n");
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

