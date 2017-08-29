package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ProjectHasConsumer   {
  
  private String ID = null;
  private String projectID = null;
  private String consumerID = null;
  private String comment = null;
  private String projectImpactID = null;

  
  /**
   **/
  public ProjectHasConsumer ID(String ID) {
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
  public ProjectHasConsumer projectID(String projectID) {
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
  public ProjectHasConsumer consumerID(String consumerID) {
    this.consumerID = consumerID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("consumerID")
  public String getConsumerID() {
    return consumerID;
  }
  public void setConsumerID(String consumerID) {
    this.consumerID = consumerID;
  }

  
  /**
   **/
  public ProjectHasConsumer comment(String comment) {
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

  
  /**
   **/
  public ProjectHasConsumer projectImpactID(String projectImpactID) {
    this.projectImpactID = projectImpactID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectImpactID")
  public String getProjectImpactID() {
    return projectImpactID;
  }
  public void setProjectImpactID(String projectImpactID) {
    this.projectImpactID = projectImpactID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectHasConsumer projectHasConsumer = (ProjectHasConsumer) o;
    return Objects.equals(this.ID, projectHasConsumer.ID) &&
        Objects.equals(this.projectID, projectHasConsumer.projectID) &&
        Objects.equals(this.consumerID, projectHasConsumer.consumerID) &&
        Objects.equals(this.comment, projectHasConsumer.comment) &&
        Objects.equals(this.projectImpactID, projectHasConsumer.projectImpactID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, projectID, consumerID, comment, projectImpactID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHasConsumer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    consumerID: ").append(toIndentedString(consumerID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    projectImpactID: ").append(toIndentedString(projectImpactID)).append("\n");
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

