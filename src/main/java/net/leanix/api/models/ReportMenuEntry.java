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

/**
 * ReportMenuEntry
 */

public class ReportMenuEntry {
  @JsonProperty("report")
  private String report = null;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("predefinedReportDescription")
  private String predefinedReportDescription = null;

  @JsonProperty("predefinedReportName")
  private String predefinedReportName = null;

  @JsonProperty("defaultSharingPriority")
  private Integer defaultSharingPriority = null;

  public ReportMenuEntry report(String report) {
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReport() {
    return report;
  }

  public void setReport(String report) {
    this.report = report;
  }

  public ReportMenuEntry enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ReportMenuEntry predefinedReportDescription(String predefinedReportDescription) {
    this.predefinedReportDescription = predefinedReportDescription;
    return this;
  }

   /**
   * Get predefinedReportDescription
   * @return predefinedReportDescription
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPredefinedReportDescription() {
    return predefinedReportDescription;
  }

  public void setPredefinedReportDescription(String predefinedReportDescription) {
    this.predefinedReportDescription = predefinedReportDescription;
  }

  public ReportMenuEntry predefinedReportName(String predefinedReportName) {
    this.predefinedReportName = predefinedReportName;
    return this;
  }

   /**
   * Get predefinedReportName
   * @return predefinedReportName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPredefinedReportName() {
    return predefinedReportName;
  }

  public void setPredefinedReportName(String predefinedReportName) {
    this.predefinedReportName = predefinedReportName;
  }

  public ReportMenuEntry defaultSharingPriority(Integer defaultSharingPriority) {
    this.defaultSharingPriority = defaultSharingPriority;
    return this;
  }

   /**
   * Get defaultSharingPriority
   * @return defaultSharingPriority
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDefaultSharingPriority() {
    return defaultSharingPriority;
  }

  public void setDefaultSharingPriority(Integer defaultSharingPriority) {
    this.defaultSharingPriority = defaultSharingPriority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportMenuEntry reportMenuEntry = (ReportMenuEntry) o;
    return Objects.equals(this.report, reportMenuEntry.report) &&
        Objects.equals(this.enabled, reportMenuEntry.enabled) &&
        Objects.equals(this.predefinedReportDescription, reportMenuEntry.predefinedReportDescription) &&
        Objects.equals(this.predefinedReportName, reportMenuEntry.predefinedReportName) &&
        Objects.equals(this.defaultSharingPriority, reportMenuEntry.defaultSharingPriority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, enabled, predefinedReportDescription, predefinedReportName, defaultSharingPriority);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMenuEntry {\n");
    
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    predefinedReportDescription: ").append(toIndentedString(predefinedReportDescription)).append("\n");
    sb.append("    predefinedReportName: ").append(toIndentedString(predefinedReportName)).append("\n");
    sb.append("    defaultSharingPriority: ").append(toIndentedString(defaultSharingPriority)).append("\n");
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

