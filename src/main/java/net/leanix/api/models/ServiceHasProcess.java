package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ServiceHasProcess   {
  
  private String ID = null;
  private String serviceID = null;
  private String processID = null;
  private String constraints = null;

  
  /**
   **/
  public ServiceHasProcess ID(String ID) {
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
  public ServiceHasProcess serviceID(String serviceID) {
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
  public ServiceHasProcess processID(String processID) {
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
  public ServiceHasProcess constraints(String constraints) {
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
    ServiceHasProcess serviceHasProcess = (ServiceHasProcess) o;
    return Objects.equals(this.ID, serviceHasProcess.ID) &&
        Objects.equals(this.serviceID, serviceHasProcess.serviceID) &&
        Objects.equals(this.processID, serviceHasProcess.processID) &&
        Objects.equals(this.constraints, serviceHasProcess.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceID, processID, constraints);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasProcess {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    processID: ").append(toIndentedString(processID)).append("\n");
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

