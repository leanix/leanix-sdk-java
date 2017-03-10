/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.13-SNAPSHOT
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
 * Instant
 */

public class Instant {
  @JsonProperty("nano")
  private Integer nano = null;

  @JsonProperty("epochSecond")
  private Long epochSecond = null;

  public Instant nano(Integer nano) {
    this.nano = nano;
    return this;
  }

   /**
   * Get nano
   * @return nano
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getNano() {
    return nano;
  }

  public void setNano(Integer nano) {
    this.nano = nano;
  }

  public Instant epochSecond(Long epochSecond) {
    this.epochSecond = epochSecond;
    return this;
  }

   /**
   * Get epochSecond
   * @return epochSecond
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getEpochSecond() {
    return epochSecond;
  }

  public void setEpochSecond(Long epochSecond) {
    this.epochSecond = epochSecond;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instant instant = (Instant) o;
    return Objects.equals(this.nano, instant.nano) &&
        Objects.equals(this.epochSecond, instant.epochSecond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nano, epochSecond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instant {\n");
    
    sb.append("    nano: ").append(toIndentedString(nano)).append("\n");
    sb.append("    epochSecond: ").append(toIndentedString(epochSecond)).append("\n");
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

