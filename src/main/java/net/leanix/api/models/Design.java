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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Design
 */

public class Design {
  /**
   * Gets or Sets activeMode
   */
  public enum ActiveModeEnum {
    CLASSIC("CLASSIC"),
    
    MODERN("MODERN"),
    
    CUSTOM("CUSTOM");

    private String value;

    ActiveModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActiveModeEnum fromValue(String text) {
      for (ActiveModeEnum b : ActiveModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("activeMode")
  private ActiveModeEnum activeMode = null;

  @JsonProperty("customCss")
  private Map<String, Object> customCss = new HashMap<String, Object>();

  public Design activeMode(ActiveModeEnum activeMode) {
    this.activeMode = activeMode;
    return this;
  }

   /**
   * Get activeMode
   * @return activeMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public ActiveModeEnum getActiveMode() {
    return activeMode;
  }

  public void setActiveMode(ActiveModeEnum activeMode) {
    this.activeMode = activeMode;
  }

  public Design customCss(Map<String, Object> customCss) {
    this.customCss = customCss;
    return this;
  }

  public Design putCustomCssItem(String key, Object customCssItem) {
    this.customCss.put(key, customCssItem);
    return this;
  }

   /**
   * Get customCss
   * @return customCss
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Object> getCustomCss() {
    return customCss;
  }

  public void setCustomCss(Map<String, Object> customCss) {
    this.customCss = customCss;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Design design = (Design) o;
    return Objects.equals(this.activeMode, design.activeMode) &&
        Objects.equals(this.customCss, design.customCss);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeMode, customCss);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Design {\n");
    
    sb.append("    activeMode: ").append(toIndentedString(activeMode)).append("\n");
    sb.append("    customCss: ").append(toIndentedString(customCss)).append("\n");
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
