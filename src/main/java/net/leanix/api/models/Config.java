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
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.ComponentConfig;

/**
 * Config
 */

public class Config {
  @JsonProperty("fullName")
  private List<ComponentConfig> fullName = new ArrayList<ComponentConfig>();

  @JsonProperty("displayName")
  private List<ComponentConfig> displayName = new ArrayList<ComponentConfig>();

  public Config fullName(List<ComponentConfig> fullName) {
    this.fullName = fullName;
    return this;
  }

  public Config addFullNameItem(ComponentConfig fullNameItem) {
    this.fullName.add(fullNameItem);
    return this;
  }

   /**
   * Get fullName
   * @return fullName
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ComponentConfig> getFullName() {
    return fullName;
  }

  public void setFullName(List<ComponentConfig> fullName) {
    this.fullName = fullName;
  }

  public Config displayName(List<ComponentConfig> displayName) {
    this.displayName = displayName;
    return this;
  }

  public Config addDisplayNameItem(ComponentConfig displayNameItem) {
    this.displayName.add(displayNameItem);
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ComponentConfig> getDisplayName() {
    return displayName;
  }

  public void setDisplayName(List<ComponentConfig> displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.fullName, config.fullName) &&
        Objects.equals(this.displayName, config.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, displayName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

