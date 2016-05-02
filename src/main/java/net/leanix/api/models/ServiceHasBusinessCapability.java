package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ServiceHasBusinessCapability   {
  
  private String ID = null;
  private String serviceID = null;
  private String businessCapabilityID = null;
  private Boolean isLeading = null;
  private String functionalSuitabilityID = null;
  private String comment = null;
  private String supportTypeID = null;
  private String constraints = null;

  
  /**
   **/
  public ServiceHasBusinessCapability ID(String ID) {
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
  public ServiceHasBusinessCapability serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceID")
  public String getServiceID() {
    return serviceID;
  }
  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  
  /**
   **/
  public ServiceHasBusinessCapability businessCapabilityID(String businessCapabilityID) {
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
  public ServiceHasBusinessCapability isLeading(Boolean isLeading) {
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
  public ServiceHasBusinessCapability functionalSuitabilityID(String functionalSuitabilityID) {
    this.functionalSuitabilityID = functionalSuitabilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("functionalSuitabilityID")
  public String getFunctionalSuitabilityID() {
    return functionalSuitabilityID;
  }
  public void setFunctionalSuitabilityID(String functionalSuitabilityID) {
    this.functionalSuitabilityID = functionalSuitabilityID;
  }

  
  /**
   **/
  public ServiceHasBusinessCapability comment(String comment) {
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
  public ServiceHasBusinessCapability supportTypeID(String supportTypeID) {
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
  public ServiceHasBusinessCapability constraints(String constraints) {
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
    ServiceHasBusinessCapability serviceHasBusinessCapability = (ServiceHasBusinessCapability) o;
    return Objects.equals(this.ID, serviceHasBusinessCapability.ID) &&
        Objects.equals(this.serviceID, serviceHasBusinessCapability.serviceID) &&
        Objects.equals(this.businessCapabilityID, serviceHasBusinessCapability.businessCapabilityID) &&
        Objects.equals(this.isLeading, serviceHasBusinessCapability.isLeading) &&
        Objects.equals(this.functionalSuitabilityID, serviceHasBusinessCapability.functionalSuitabilityID) &&
        Objects.equals(this.comment, serviceHasBusinessCapability.comment) &&
        Objects.equals(this.supportTypeID, serviceHasBusinessCapability.supportTypeID) &&
        Objects.equals(this.constraints, serviceHasBusinessCapability.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceID, businessCapabilityID, isLeading, functionalSuitabilityID, comment, supportTypeID, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasBusinessCapability {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    businessCapabilityID: ").append(toIndentedString(businessCapabilityID)).append("\n");
    sb.append("    isLeading: ").append(toIndentedString(isLeading)).append("\n");
    sb.append("    functionalSuitabilityID: ").append(toIndentedString(functionalSuitabilityID)).append("\n");
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

