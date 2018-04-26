/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.48-SNAPSHOT
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
 * DashboardModelTranslation
 */

public class DashboardModelTranslation {
  @JsonProperty("shortcuts")
  private Map<String, String> shortcuts = new HashMap<String, String>();

  @JsonProperty("panels")
  private Map<String, String> panels = new HashMap<String, String>();

  public DashboardModelTranslation shortcuts(Map<String, String> shortcuts) {
    this.shortcuts = shortcuts;
    return this;
  }

  public DashboardModelTranslation putShortcutsItem(String key, String shortcutsItem) {
    this.shortcuts.put(key, shortcutsItem);
    return this;
  }

   /**
   * Get shortcuts
   * @return shortcuts
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getShortcuts() {
    return shortcuts;
  }

  public void setShortcuts(Map<String, String> shortcuts) {
    this.shortcuts = shortcuts;
  }

  public DashboardModelTranslation panels(Map<String, String> panels) {
    this.panels = panels;
    return this;
  }

  public DashboardModelTranslation putPanelsItem(String key, String panelsItem) {
    this.panels.put(key, panelsItem);
    return this;
  }

   /**
   * Get panels
   * @return panels
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getPanels() {
    return panels;
  }

  public void setPanels(Map<String, String> panels) {
    this.panels = panels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardModelTranslation dashboardModelTranslation = (DashboardModelTranslation) o;
    return Objects.equals(this.shortcuts, dashboardModelTranslation.shortcuts) &&
        Objects.equals(this.panels, dashboardModelTranslation.panels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shortcuts, panels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardModelTranslation {\n");
    
    sb.append("    shortcuts: ").append(toIndentedString(shortcuts)).append("\n");
    sb.append("    panels: ").append(toIndentedString(panels)).append("\n");
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

