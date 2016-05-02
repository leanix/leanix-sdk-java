package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ResourceHasResourceCapability   {
  
  private String ID = null;
  private String resourceCapabilityID = null;
  private String resourceID = null;
  private Boolean isLeading = null;
  private String comment = null;
  private String supportTypeID = null;
  private String constraints = null;

  
  /**
   **/
  public ResourceHasResourceCapability ID(String ID) {
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
  public ResourceHasResourceCapability resourceCapabilityID(String resourceCapabilityID) {
    this.resourceCapabilityID = resourceCapabilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceCapabilityID")
  public String getResourceCapabilityID() {
    return resourceCapabilityID;
  }
  public void setResourceCapabilityID(String resourceCapabilityID) {
    this.resourceCapabilityID = resourceCapabilityID;
  }

  
  /**
   **/
  public ResourceHasResourceCapability resourceID(String resourceID) {
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
  public ResourceHasResourceCapability isLeading(Boolean isLeading) {
    this.isLeading = isLeading;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isLeading")
  public Boolean getIsLeading() {
    return isLeading;
  }
  public void setIsLeading(Boolean isLeading) {
    this.isLeading = isLeading;
  }

  
  /**
   **/
  public ResourceHasResourceCapability comment(String comment) {
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
  public ResourceHasResourceCapability supportTypeID(String supportTypeID) {
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
  public ResourceHasResourceCapability constraints(String constraints) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceHasResourceCapability resourceHasResourceCapability = (ResourceHasResourceCapability) o;
    return Objects.equals(this.ID, resourceHasResourceCapability.ID) &&
        Objects.equals(this.resourceCapabilityID, resourceHasResourceCapability.resourceCapabilityID) &&
        Objects.equals(this.resourceID, resourceHasResourceCapability.resourceID) &&
        Objects.equals(this.isLeading, resourceHasResourceCapability.isLeading) &&
        Objects.equals(this.comment, resourceHasResourceCapability.comment) &&
        Objects.equals(this.supportTypeID, resourceHasResourceCapability.supportTypeID) &&
        Objects.equals(this.constraints, resourceHasResourceCapability.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, resourceCapabilityID, resourceID, isLeading, comment, supportTypeID, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceHasResourceCapability {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    resourceCapabilityID: ").append(toIndentedString(resourceCapabilityID)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    isLeading: ").append(toIndentedString(isLeading)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    supportTypeID: ").append(toIndentedString(supportTypeID)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

