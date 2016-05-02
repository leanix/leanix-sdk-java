package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ProjectHasResource   {
  
  private String ID = null;
  private String projectID = null;
  private String resourceID = null;
  private String comment = null;

  
  /**
   **/
  public ProjectHasResource ID(String ID) {
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
  public ProjectHasResource projectID(String projectID) {
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
  public ProjectHasResource resourceID(String resourceID) {
    this.resourceID = resourceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceID")
  public String getResourceID() {
    return resourceID;
  }
  public void setResourceID(String resourceID) {
    this.resourceID = resourceID;
  }

  
  /**
   **/
  public ProjectHasResource comment(String comment) {
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
    ProjectHasResource projectHasResource = (ProjectHasResource) o;
    return Objects.equals(this.ID, projectHasResource.ID) &&
        Objects.equals(this.projectID, projectHasResource.projectID) &&
        Objects.equals(this.resourceID, projectHasResource.resourceID) &&
        Objects.equals(this.comment, projectHasResource.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, projectID, resourceID, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHasResource {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
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

