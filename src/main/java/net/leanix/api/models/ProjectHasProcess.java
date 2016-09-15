package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ProjectHasProcess   {
  
  private String ID = null;
  private String projectID = null;
  private String processID = null;
  private String comment = null;

  
  /**
   **/
  public ProjectHasProcess ID(String ID) {
    this.ID = ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  
  /**
   **/
  public ProjectHasProcess projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectID")
  public String getProjectID() {
    return projectID;
  }
  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  
  /**
   **/
  public ProjectHasProcess processID(String processID) {
    this.processID = processID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processID")
  public String getProcessID() {
    return processID;
  }
  public void setProcessID(String processID) {
    this.processID = processID;
  }

  
  /**
   **/
  public ProjectHasProcess comment(String comment) {
    this.comment = comment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectHasProcess projectHasProcess = (ProjectHasProcess) o;
    return Objects.equals(this.ID, projectHasProcess.ID) &&
        Objects.equals(this.projectID, projectHasProcess.projectID) &&
        Objects.equals(this.processID, projectHasProcess.processID) &&
        Objects.equals(this.comment, projectHasProcess.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, projectID, processID, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHasProcess {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    processID: ").append(toIndentedString(processID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

