package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ProcessHasBusinessCapability   {
  
  private String ID = null;
  private String processID = null;
  private String businessCapabilityID = null;
  private String comment = null;

  
  /**
   **/
  public ProcessHasBusinessCapability ID(String ID) {
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
  public ProcessHasBusinessCapability processID(String processID) {
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
  public ProcessHasBusinessCapability businessCapabilityID(String businessCapabilityID) {
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
  public ProcessHasBusinessCapability comment(String comment) {
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
    ProcessHasBusinessCapability processHasBusinessCapability = (ProcessHasBusinessCapability) o;
    return Objects.equals(this.ID, processHasBusinessCapability.ID) &&
        Objects.equals(this.processID, processHasBusinessCapability.processID) &&
        Objects.equals(this.businessCapabilityID, processHasBusinessCapability.businessCapabilityID) &&
        Objects.equals(this.comment, processHasBusinessCapability.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, processID, businessCapabilityID, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessHasBusinessCapability {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    processID: ").append(toIndentedString(processID)).append("\n");
    sb.append("    businessCapabilityID: ").append(toIndentedString(businessCapabilityID)).append("\n");
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

