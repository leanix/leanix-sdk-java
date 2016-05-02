package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class IfaceHasBusinessObject   {
  
  private String ID = null;
  private String ifaceID = null;
  private String businessObjectID = null;

  
  /**
   **/
  public IfaceHasBusinessObject ID(String ID) {
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
  public IfaceHasBusinessObject ifaceID(String ifaceID) {
    this.ifaceID = ifaceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifaceID")
  public String getIfaceID() {
    return ifaceID;
  }
  public void setIfaceID(String ifaceID) {
    this.ifaceID = ifaceID;
  }

  
  /**
   **/
  public IfaceHasBusinessObject businessObjectID(String businessObjectID) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IfaceHasBusinessObject ifaceHasBusinessObject = (IfaceHasBusinessObject) o;
    return Objects.equals(this.ID, ifaceHasBusinessObject.ID) &&
        Objects.equals(this.ifaceID, ifaceHasBusinessObject.ifaceID) &&
        Objects.equals(this.businessObjectID, ifaceHasBusinessObject.businessObjectID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, ifaceID, businessObjectID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IfaceHasBusinessObject {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    ifaceID: ").append(toIndentedString(ifaceID)).append("\n");
    sb.append("    businessObjectID: ").append(toIndentedString(businessObjectID)).append("\n");
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

