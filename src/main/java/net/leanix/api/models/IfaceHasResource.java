package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class IfaceHasResource   {
  
  private String ID = null;
  private String ifaceID = null;
  private String resourceID = null;

  
  /**
   **/
  public IfaceHasResource ID(String ID) {
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
  public IfaceHasResource ifaceID(String ifaceID) {
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
  public IfaceHasResource resourceID(String resourceID) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IfaceHasResource ifaceHasResource = (IfaceHasResource) o;
    return Objects.equals(this.ID, ifaceHasResource.ID) &&
        Objects.equals(this.ifaceID, ifaceHasResource.ifaceID) &&
        Objects.equals(this.resourceID, ifaceHasResource.resourceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, ifaceID, resourceID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IfaceHasResource {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    ifaceID: ").append(toIndentedString(ifaceID)).append("\n");
    sb.append("    resourceID: ").append(toIndentedString(resourceID)).append("\n");
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

