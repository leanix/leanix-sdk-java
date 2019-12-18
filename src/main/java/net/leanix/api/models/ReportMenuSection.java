/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.6-SNAPSHOT
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
import net.leanix.api.models.ReportMenuEntry;

/**
 * ReportMenuSection
 */

public class ReportMenuSection {
  @JsonProperty("icon")
  private String icon = null;

  @JsonProperty("entries")
  private List<ReportMenuEntry> entries = new ArrayList<ReportMenuEntry>();

  public ReportMenuSection icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public ReportMenuSection entries(List<ReportMenuEntry> entries) {
    this.entries = entries;
    return this;
  }

  public ReportMenuSection addEntriesItem(ReportMenuEntry entriesItem) {
    this.entries.add(entriesItem);
    return this;
  }

   /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<ReportMenuEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<ReportMenuEntry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportMenuSection reportMenuSection = (ReportMenuSection) o;
    return Objects.equals(this.icon, reportMenuSection.icon) &&
        Objects.equals(this.entries, reportMenuSection.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(icon, entries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportMenuSection {\n");
    
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

