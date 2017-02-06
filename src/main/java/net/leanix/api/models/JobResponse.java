package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class JobResponse   {
  
  private String jobId = null;
  private String synclogId = null;

  
  /**
   **/
  public JobResponse jobId(String jobId) {
    this.jobId = jobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("jobId")
  public String getJobId() {
    return jobId;
  }
  public void setJobId(String jobId) {
    this.jobId = jobId;
  }

  
  /**
   **/
  public JobResponse synclogId(String synclogId) {
    this.synclogId = synclogId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("synclogId")
  public String getSynclogId() {
    return synclogId;
  }
  public void setSynclogId(String synclogId) {
    this.synclogId = synclogId;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobResponse jobResponse = (JobResponse) o;
    return Objects.equals(this.jobId, jobResponse.jobId) &&
        Objects.equals(this.synclogId, jobResponse.synclogId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, synclogId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobResponse {\n");
    
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    synclogId: ").append(toIndentedString(synclogId)).append("\n");
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

