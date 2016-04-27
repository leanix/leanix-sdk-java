package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ServiceHasResource   {
  
  private String ID = null;
  private String resourceID = null;
  private String serviceID = null;
  private String comment = null;
  private String technicalSuitabilityID = null;
  private Double costTotalAnnual = null;
  private String serviceLevelID = null;

  
  /**
   **/
  public ServiceHasResource ID(String ID) {
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
  public ServiceHasResource resourceID(String resourceID) {
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
  public ServiceHasResource serviceID(String serviceID) {
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
  public ServiceHasResource comment(String comment) {
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
  public ServiceHasResource technicalSuitabilityID(String technicalSuitabilityID) {
    this.technicalSuitabilityID = technicalSuitabilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("technicalSuitabilityID")
  public String getTechnicalSuitabilityID() {
    return technicalSuitabilityID;
  }
  public void setTechnicalSuitabilityID(String technicalSuitabilityID) {
    this.technicalSuitabilityID = technicalSuitabilityID;
  }

  
  /**
   **/
  public ServiceHasResource costTotalAnnual(Double costTotalAnnual) {
    this.costTotalAnnual = costTotalAnnual;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("costTotalAnnual")
  public Double getCostTotalAnnual() {
    return costTotalAnnual;
  }
  public void setCostTotalAnnual(Double costTotalAnnual) {
    this.costTotalAnnual = costTotalAnnual;
  }

  
  /**
   **/
  public ServiceHasResource serviceLevelID(String serviceLevelID) {
    this.serviceLevelID = serviceLevelID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceLevelID")
  public String getServiceLevelID() {
    return serviceLevelID;
  }
  public void setServiceLevelID(String serviceLevelID) {
    this.serviceLevelID = serviceLevelID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHasResource serviceHasResource = (ServiceHasResource) o;
    return Objects.equals(this.ID, serviceHasResource.ID) &&
        Objects.equals(this.resourceID, serviceHasResource.resourceID) &&
        Objects.equals(this.serviceID, serviceHasResource.serviceID) &&
        Objects.equals(this.comment, serviceHasResource.comment) &&
        Objects.equals(this.technicalSuitabilityID, serviceHasResource.technicalSuitabilityID) &&
        Objects.equals(this.costTotalAnnual, serviceHasResource.costTotalAnnual) &&
        Objects.equals(this.serviceLevelID, serviceHasResource.serviceLevelID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, resourceID, serviceID, comment, technicalSuitabilityID, costTotalAnnual, serviceLevelID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasResource {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    technicalSuitabilityID: ").append(toIndentedString(technicalSuitabilityID)).append("\n");
    sb.append("    costTotalAnnual: ").append(toIndentedString(costTotalAnnual)).append("\n");
    sb.append("    serviceLevelID: ").append(toIndentedString(serviceLevelID)).append("\n");
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

