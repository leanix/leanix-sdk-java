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

/**
 * ChartConfig
 */

public class ChartConfig {
  @JsonProperty("timespan")
  private String timespan = null;

  @JsonProperty("titleYAxis")
  private String titleYAxis = null;

  @JsonProperty("chartType")
  private String chartType = null;

  public ChartConfig timespan(String timespan) {
    this.timespan = timespan;
    return this;
  }

   /**
   * Get timespan
   * @return timespan
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTimespan() {
    return timespan;
  }

  public void setTimespan(String timespan) {
    this.timespan = timespan;
  }

  public ChartConfig titleYAxis(String titleYAxis) {
    this.titleYAxis = titleYAxis;
    return this;
  }

   /**
   * Get titleYAxis
   * @return titleYAxis
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTitleYAxis() {
    return titleYAxis;
  }

  public void setTitleYAxis(String titleYAxis) {
    this.titleYAxis = titleYAxis;
  }

  public ChartConfig chartType(String chartType) {
    this.chartType = chartType;
    return this;
  }

   /**
   * Get chartType
   * @return chartType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getChartType() {
    return chartType;
  }

  public void setChartType(String chartType) {
    this.chartType = chartType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChartConfig chartConfig = (ChartConfig) o;
    return Objects.equals(this.timespan, chartConfig.timespan) &&
        Objects.equals(this.titleYAxis, chartConfig.titleYAxis) &&
        Objects.equals(this.chartType, chartConfig.chartType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timespan, titleYAxis, chartType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChartConfig {\n");
    
    sb.append("    timespan: ").append(toIndentedString(timespan)).append("\n");
    sb.append("    titleYAxis: ").append(toIndentedString(titleYAxis)).append("\n");
    sb.append("    chartType: ").append(toIndentedString(chartType)).append("\n");
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

