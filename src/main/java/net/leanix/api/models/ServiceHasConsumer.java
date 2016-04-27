package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ServiceHasConsumer   {
  
  private String ID = null;
  private String serviceID = null;
  private String consumerID = null;
  private Long numberOfUsers = null;
  private String comment = null;
  private String functionalSuitabilityID = null;
  private String usageTypeID = null;

  
  /**
   **/
  public ServiceHasConsumer ID(String ID) {
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
  public ServiceHasConsumer serviceID(String serviceID) {
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
  public ServiceHasConsumer consumerID(String consumerID) {
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
  public ServiceHasConsumer numberOfUsers(Long numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("numberOfUsers")
  public Long getNumberOfUsers() {
    return numberOfUsers;
  }
  public void setNumberOfUsers(Long numberOfUsers) {
    this.numberOfUsers = numberOfUsers;
  }

  
  /**
   **/
  public ServiceHasConsumer comment(String comment) {
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
  public ServiceHasConsumer functionalSuitabilityID(String functionalSuitabilityID) {
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
  public ServiceHasConsumer usageTypeID(String usageTypeID) {
    this.usageTypeID = usageTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("usageTypeID")
  public String getUsageTypeID() {
    return usageTypeID;
  }
  public void setUsageTypeID(String usageTypeID) {
    this.usageTypeID = usageTypeID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHasConsumer serviceHasConsumer = (ServiceHasConsumer) o;
    return Objects.equals(this.ID, serviceHasConsumer.ID) &&
        Objects.equals(this.serviceID, serviceHasConsumer.serviceID) &&
        Objects.equals(this.consumerID, serviceHasConsumer.consumerID) &&
        Objects.equals(this.numberOfUsers, serviceHasConsumer.numberOfUsers) &&
        Objects.equals(this.comment, serviceHasConsumer.comment) &&
        Objects.equals(this.functionalSuitabilityID, serviceHasConsumer.functionalSuitabilityID) &&
        Objects.equals(this.usageTypeID, serviceHasConsumer.usageTypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceID, consumerID, numberOfUsers, comment, functionalSuitabilityID, usageTypeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasConsumer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    consumerID: ").append(toIndentedString(consumerID)).append("\n");
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    functionalSuitabilityID: ").append(toIndentedString(functionalSuitabilityID)).append("\n");
    sb.append("    usageTypeID: ").append(toIndentedString(usageTypeID)).append("\n");
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

