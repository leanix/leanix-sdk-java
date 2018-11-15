/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.161-SNAPSHOT
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
        Objects.equals(this.enabled, reportMenuEntry.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMenuEntry {\n");
    
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

