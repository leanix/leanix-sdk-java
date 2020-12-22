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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * ReportingModelTranslation
 */

public class ReportingModelTranslation {
  @JsonProperty("menu")
  private Map<String, String> menu = new HashMap<String, String>();

  @JsonProperty("reports")
  private Map<String, String> reports = new HashMap<String, String>();

  public ReportingModelTranslation menu(Map<String, String> menu) {
    this.menu = menu;
    return this;
  }

  public ReportingModelTranslation putMenuItem(String key, String menuItem) {
    this.menu.put(key, menuItem);
    return this;
  }

   /**
   * Get menu
   * @return menu
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getMenu() {
    return menu;
  }

  public void setMenu(Map<String, String> menu) {
    this.menu = menu;
  }

  public ReportingModelTranslation reports(Map<String, String> reports) {
    this.reports = reports;
    return this;
  }

  public ReportingModelTranslation putReportsItem(String key, String reportsItem) {
    this.reports.put(key, reportsItem);
    return this;
  }

   /**
   * Get reports
   * @return reports
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, String> getReports() {
    return reports;
  }

  public void setReports(Map<String, String> reports) {
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
    ReportingModelTranslation reportingModelTranslation = (ReportingModelTranslation) o;
    return Objects.equals(this.menu, reportingModelTranslation.menu) &&
        Objects.equals(this.reports, reportingModelTranslation.reports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menu, reports);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingModelTranslation {\n");
    
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

