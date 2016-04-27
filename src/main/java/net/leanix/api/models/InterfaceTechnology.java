package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class InterfaceTechnology   {
  
  private String ID = null;
  private String name = null;
  private String resourceID = null;

  
  /**
   **/
  public InterfaceTechnology ID(String ID) {
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
  public InterfaceTechnology name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public InterfaceTechnology resourceID(String resourceID) {
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
    InterfaceTechnology interfaceTechnology = (InterfaceTechnology) o;
    return Objects.equals(this.ID, interfaceTechnology.ID) &&
        Objects.equals(this.name, interfaceTechnology.name) &&
        Objects.equals(this.resourceID, interfaceTechnology.resourceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, resourceID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InterfaceTechnology {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

