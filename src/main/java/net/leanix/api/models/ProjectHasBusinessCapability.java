package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ProjectHasBusinessCapability   {
  
  private String ID = null;
  private String projectID = null;
  private String businessCapabilityID = null;
  private String comment = null;
  private String supportTypeID = null;
  private String constraints = null;
  private String projectImpactID = null;

  
  /**
   **/
  public ProjectHasBusinessCapability ID(String ID) {
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
  public ProjectHasBusinessCapability projectID(String projectID) {
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
  public ProjectHasBusinessCapability businessCapabilityID(String businessCapabilityID) {
    this.businessCapabilityID = businessCapabilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessCapabilityID")
  public String getBusinessCapabilityID() {
    return businessCapabilityID;
  }
  public void setBusinessCapabilityID(String businessCapabilityID) {
    this.businessCapabilityID = businessCapabilityID;
  }

  
  /**
   **/
  public ProjectHasBusinessCapability comment(String comment) {
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
  public ProjectHasBusinessCapability supportTypeID(String supportTypeID) {
    this.supportTypeID = supportTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("supportTypeID")
  public String getSupportTypeID() {
    return supportTypeID;
  }
  public void setSupportTypeID(String supportTypeID) {
    this.supportTypeID = supportTypeID;
  }

  
  /**
   **/
  public ProjectHasBusinessCapability constraints(String constraints) {
    this.constraints = constraints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("constraints")
  public String getConstraints() {
    return constraints;
  }
  public void setConstraints(String constraints) {
    this.constraints = constraints;
  }

  
  /**
   **/
  public ProjectHasBusinessCapability projectImpactID(String projectImpactID) {
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
    ProjectHasBusinessCapability projectHasBusinessCapability = (ProjectHasBusinessCapability) o;
    return Objects.equals(this.ID, projectHasBusinessCapability.ID) &&
        Objects.equals(this.projectID, projectHasBusinessCapability.projectID) &&
        Objects.equals(this.businessCapabilityID, projectHasBusinessCapability.businessCapabilityID) &&
        Objects.equals(this.comment, projectHasBusinessCapability.comment) &&
        Objects.equals(this.supportTypeID, projectHasBusinessCapability.supportTypeID) &&
        Objects.equals(this.constraints, projectHasBusinessCapability.constraints) &&
        Objects.equals(this.projectImpactID, projectHasBusinessCapability.projectImpactID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, projectID, businessCapabilityID, comment, supportTypeID, constraints, projectImpactID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHasBusinessCapability {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    businessCapabilityID: ").append(toIndentedString(businessCapabilityID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    supportTypeID: ").append(toIndentedString(supportTypeID)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

