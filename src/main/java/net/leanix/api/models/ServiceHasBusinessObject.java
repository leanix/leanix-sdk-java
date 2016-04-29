package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ServiceHasBusinessObject   {
  
  private String ID = null;
  private String serviceID = null;
  private String businessObjectID = null;
  private String businessObjectRelationID = null;

  
  /**
   **/
  public ServiceHasBusinessObject ID(String ID) {
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
  public ServiceHasBusinessObject serviceID(String serviceID) {
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
  public ServiceHasBusinessObject businessObjectID(String businessObjectID) {
    this.businessObjectID = businessObjectID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessObjectID")
  public String getBusinessObjectID() {
    return businessObjectID;
  }
  public void setBusinessObjectID(String businessObjectID) {
    this.businessObjectID = businessObjectID;
  }

  
  /**
   **/
  public ServiceHasBusinessObject businessObjectRelationID(String businessObjectRelationID) {
    this.businessObjectRelationID = businessObjectRelationID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessObjectRelationID")
  public String getBusinessObjectRelationID() {
    return businessObjectRelationID;
  }
  public void setBusinessObjectRelationID(String businessObjectRelationID) {
    this.businessObjectRelationID = businessObjectRelationID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHasBusinessObject serviceHasBusinessObject = (ServiceHasBusinessObject) o;
    return Objects.equals(this.ID, serviceHasBusinessObject.ID) &&
        Objects.equals(this.serviceID, serviceHasBusinessObject.serviceID) &&
        Objects.equals(this.businessObjectID, serviceHasBusinessObject.businessObjectID) &&
        Objects.equals(this.businessObjectRelationID, serviceHasBusinessObject.businessObjectRelationID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceID, businessObjectID, businessObjectRelationID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasBusinessObject {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    businessObjectID: ").append(toIndentedString(businessObjectID)).append("\n");
    sb.append("    businessObjectRelationID: ").append(toIndentedString(businessObjectRelationID)).append("\n");
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

