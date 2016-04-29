package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ResourceHasConsumer   {
  
  private String ID = null;
  private String resourceID = null;
  private String consumerID = null;
  private String comment = null;
  private String technicalSuitabilityID = null;
  private String usageTypeID = null;
  private Long numberOfUsers = null;

  
  /**
   **/
  public ResourceHasConsumer ID(String ID) {
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
  public ResourceHasConsumer resourceID(String resourceID) {
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
  public ResourceHasConsumer consumerID(String consumerID) {
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
  public ResourceHasConsumer comment(String comment) {
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
  public ResourceHasConsumer technicalSuitabilityID(String technicalSuitabilityID) {
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
  public ResourceHasConsumer usageTypeID(String usageTypeID) {
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

  
  /**
   **/
  public ResourceHasConsumer numberOfUsers(Long numberOfUsers) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceHasConsumer resourceHasConsumer = (ResourceHasConsumer) o;
    return Objects.equals(this.ID, resourceHasConsumer.ID) &&
        Objects.equals(this.resourceID, resourceHasConsumer.resourceID) &&
        Objects.equals(this.consumerID, resourceHasConsumer.consumerID) &&
        Objects.equals(this.comment, resourceHasConsumer.comment) &&
        Objects.equals(this.technicalSuitabilityID, resourceHasConsumer.technicalSuitabilityID) &&
        Objects.equals(this.usageTypeID, resourceHasConsumer.usageTypeID) &&
        Objects.equals(this.numberOfUsers, resourceHasConsumer.numberOfUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, resourceID, consumerID, comment, technicalSuitabilityID, usageTypeID, numberOfUsers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceHasConsumer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
    sb.append("    consumerID: ").append(toIndentedString(consumerID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    technicalSuitabilityID: ").append(toIndentedString(technicalSuitabilityID)).append("\n");
    sb.append("    usageTypeID: ").append(toIndentedString(usageTypeID)).append("\n");
    sb.append("    numberOfUsers: ").append(toIndentedString(numberOfUsers)).append("\n");
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

