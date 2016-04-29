package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ResourceHasProvider   {
  
  private String ID = null;
  private String providerID = null;
  private String resourceID = null;

  
  /**
   **/
  public ResourceHasProvider ID(String ID) {
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
  public ResourceHasProvider providerID(String providerID) {
    this.providerID = providerID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("providerID")
  public String getProviderID() {
    return providerID;
  }
  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }

  
  /**
   **/
  public ResourceHasProvider resourceID(String resourceID) {
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
    ResourceHasProvider resourceHasProvider = (ResourceHasProvider) o;
    return Objects.equals(this.ID, resourceHasProvider.ID) &&
        Objects.equals(this.providerID, resourceHasProvider.providerID) &&
        Objects.equals(this.resourceID, resourceHasProvider.resourceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, providerID, resourceID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceHasProvider {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
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

