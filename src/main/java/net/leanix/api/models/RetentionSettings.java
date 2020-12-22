/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
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
 * RetentionSettings
 */

public class RetentionSettings {
  @JsonProperty("eventUserRetentionDays")
  private Long eventUserRetentionDays = null;

  public RetentionSettings eventUserRetentionDays(Long eventUserRetentionDays) {
    this.eventUserRetentionDays = eventUserRetentionDays;
    return this;
  }

   /**
   * Get eventUserRetentionDays
   * @return eventUserRetentionDays
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEventUserRetentionDays() {
    return eventUserRetentionDays;
  }

  public void setEventUserRetentionDays(Long eventUserRetentionDays) {
    this.eventUserRetentionDays = eventUserRetentionDays;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetentionSettings retentionSettings = (RetentionSettings) o;
    return Objects.equals(this.eventUserRetentionDays, retentionSettings.eventUserRetentionDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventUserRetentionDays);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetentionSettings {\n");
    
    sb.append("    eventUserRetentionDays: ").append(toIndentedString(eventUserRetentionDays)).append("\n");
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

