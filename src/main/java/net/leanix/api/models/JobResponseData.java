/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.132-SNAPSHOT
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
 * JobResponseData
 */

public class JobResponseData {
  @JsonProperty("jobId")
  private String jobId = null;

  @JsonProperty("synclogId")
  private String synclogId = null;

  @JsonProperty("message")
  private String message = null;

  public JobResponseData jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }

   /**
   * Get jobId
   * @return jobId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getJobId() {
    return jobId;
  }

  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  public JobResponseData synclogId(String synclogId) {
    this.synclogId = synclogId;
    return this;
  }

   /**
   * Get synclogId
   * @return synclogId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSynclogId() {
    return synclogId;
  }

  public void setSynclogId(String synclogId) {
    this.synclogId = synclogId;
  }

  public JobResponseData message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResponseData jobResponseData = (JobResponseData) o;
    return Objects.equals(this.jobId, jobResponseData.jobId) &&
        Objects.equals(this.synclogId, jobResponseData.synclogId) &&
        Objects.equals(this.message, jobResponseData.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, synclogId, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponseData {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    synclogId: ").append(toIndentedString(synclogId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
