/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.14-SNAPSHOT
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
import net.leanix.api.models.ReportConfiguration;
import net.leanix.api.models.ReportMenuSection;

/**
 * ReportingModelDefinition
 */

public class ReportingModelDefinition {
  @JsonProperty("menu")
  private Map<String, ReportMenuSection> menu = new HashMap<String, ReportMenuSection>();

  @JsonProperty("reports")
  private Map<String, ReportConfiguration> reports = new HashMap<String, ReportConfiguration>();

  public ReportingModelDefinition menu(Map<String, ReportMenuSection> menu) {
    this.menu = menu;
    return this;
  }

  public ReportingModelDefinition putMenuItem(String key, ReportMenuSection menuItem) {
    this.menu.put(key, menuItem);
    return this;
  }

   /**
   * Get menu
   * @return menu
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ReportMenuSection> getMenu() {
    return menu;
  }

  public void setMenu(Map<String, ReportMenuSection> menu) {
    this.menu = menu;
  }

  public ReportingModelDefinition reports(Map<String, ReportConfiguration> reports) {
    this.reports = reports;
    return this;
  }

  public ReportingModelDefinition putReportsItem(String key, ReportConfiguration reportsItem) {
    this.reports.put(key, reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ReportConfiguration> getReports() {
    return reports;
  }

  public void setReports(Map<String, ReportConfiguration> reports) {
    this.reports = reports;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingModelDefinition reportingModelDefinition = (ReportingModelDefinition) o;
    return Objects.equals(this.menu, reportingModelDefinition.menu) &&
        Objects.equals(this.reports, reportingModelDefinition.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menu, reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingModelDefinition {\n");
    
    sb.append("    menu: ").append(toIndentedString(menu)).append("\n");
    sb.append("    reports: ").append(toIndentedString(reports)).append("\n");
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

