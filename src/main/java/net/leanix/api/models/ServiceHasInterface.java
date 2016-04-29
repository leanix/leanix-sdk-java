package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.InterfaceTechnology;






public class ServiceHasInterface   {
  
  private String ID = null;
  private String name = null;
  private String serviceID = null;
  private String serviceRefID = null;
  private String interfaceDirectionID = null;
  private String interfaceFrequencyID = null;
  private String interfaceTypeID = null;
  private String interfaceTechnologyID = null;
  private String reference = null;
  private String visibilityID = null;
  private String link = null;
  private String ifaceID = null;
  private InterfaceTechnology interfaceTechnology = null;
  private List<BusinessObject> businessObjects = new ArrayList<BusinessObject>();

  
  /**
   **/
  public ServiceHasInterface ID(String ID) {
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
  public ServiceHasInterface name(String name) {
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
  public ServiceHasInterface serviceID(String serviceID) {
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
  public ServiceHasInterface serviceRefID(String serviceRefID) {
    this.serviceRefID = serviceRefID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceRefID")
  public String getServiceRefID() {
    return serviceRefID;
  }
  public void setServiceRefID(String serviceRefID) {
    this.serviceRefID = serviceRefID;
  }

  
  /**
   **/
  public ServiceHasInterface interfaceDirectionID(String interfaceDirectionID) {
    this.interfaceDirectionID = interfaceDirectionID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceDirectionID")
  public String getInterfaceDirectionID() {
    return interfaceDirectionID;
  }
  public void setInterfaceDirectionID(String interfaceDirectionID) {
    this.interfaceDirectionID = interfaceDirectionID;
  }

  
  /**
   **/
  public ServiceHasInterface interfaceFrequencyID(String interfaceFrequencyID) {
    this.interfaceFrequencyID = interfaceFrequencyID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceFrequencyID")
  public String getInterfaceFrequencyID() {
    return interfaceFrequencyID;
  }
  public void setInterfaceFrequencyID(String interfaceFrequencyID) {
    this.interfaceFrequencyID = interfaceFrequencyID;
  }

  
  /**
   **/
  public ServiceHasInterface interfaceTypeID(String interfaceTypeID) {
    this.interfaceTypeID = interfaceTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceTypeID")
  public String getInterfaceTypeID() {
    return interfaceTypeID;
  }
  public void setInterfaceTypeID(String interfaceTypeID) {
    this.interfaceTypeID = interfaceTypeID;
  }

  
  /**
   **/
  public ServiceHasInterface interfaceTechnologyID(String interfaceTechnologyID) {
    this.interfaceTechnologyID = interfaceTechnologyID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceTechnologyID")
  public String getInterfaceTechnologyID() {
    return interfaceTechnologyID;
  }
  public void setInterfaceTechnologyID(String interfaceTechnologyID) {
    this.interfaceTechnologyID = interfaceTechnologyID;
  }

  
  /**
   **/
  public ServiceHasInterface reference(String reference) {
    this.reference = reference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  
  /**
   **/
  public ServiceHasInterface visibilityID(String visibilityID) {
    this.visibilityID = visibilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visibilityID")
  public String getVisibilityID() {
    return visibilityID;
  }
  public void setVisibilityID(String visibilityID) {
    this.visibilityID = visibilityID;
  }

  
  /**
   **/
  public ServiceHasInterface link(String link) {
    this.link = link;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("link")
  public String getLink() {
    return link;
  }
  public void setLink(String link) {
    this.link = link;
  }

  
  /**
   **/
  public ServiceHasInterface ifaceID(String ifaceID) {
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
  public ServiceHasInterface interfaceTechnology(InterfaceTechnology interfaceTechnology) {
    this.interfaceTechnology = interfaceTechnology;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceTechnology")
  public InterfaceTechnology getInterfaceTechnology() {
    return interfaceTechnology;
  }
  public void setInterfaceTechnology(InterfaceTechnology interfaceTechnology) {
    this.interfaceTechnology = interfaceTechnology;
  }

  
  /**
   **/
  public ServiceHasInterface businessObjects(List<BusinessObject> businessObjects) {
    this.businessObjects = businessObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessObjects")
  public List<BusinessObject> getBusinessObjects() {
    return businessObjects;
  }
  public void setBusinessObjects(List<BusinessObject> businessObjects) {
    this.businessObjects = businessObjects;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHasInterface serviceHasInterface = (ServiceHasInterface) o;
    return Objects.equals(this.ID, serviceHasInterface.ID) &&
        Objects.equals(this.name, serviceHasInterface.name) &&
        Objects.equals(this.serviceID, serviceHasInterface.serviceID) &&
        Objects.equals(this.serviceRefID, serviceHasInterface.serviceRefID) &&
        Objects.equals(this.interfaceDirectionID, serviceHasInterface.interfaceDirectionID) &&
        Objects.equals(this.interfaceFrequencyID, serviceHasInterface.interfaceFrequencyID) &&
        Objects.equals(this.interfaceTypeID, serviceHasInterface.interfaceTypeID) &&
        Objects.equals(this.interfaceTechnologyID, serviceHasInterface.interfaceTechnologyID) &&
        Objects.equals(this.reference, serviceHasInterface.reference) &&
        Objects.equals(this.visibilityID, serviceHasInterface.visibilityID) &&
        Objects.equals(this.link, serviceHasInterface.link) &&
        Objects.equals(this.ifaceID, serviceHasInterface.ifaceID) &&
        Objects.equals(this.interfaceTechnology, serviceHasInterface.interfaceTechnology) &&
        Objects.equals(this.businessObjects, serviceHasInterface.businessObjects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, serviceID, serviceRefID, interfaceDirectionID, interfaceFrequencyID, interfaceTypeID, interfaceTechnologyID, reference, visibilityID, link, ifaceID, interfaceTechnology, businessObjects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasInterface {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    serviceRefID: ").append(toIndentedString(serviceRefID)).append("\n");
    sb.append("    interfaceDirectionID: ").append(toIndentedString(interfaceDirectionID)).append("\n");
    sb.append("    interfaceFrequencyID: ").append(toIndentedString(interfaceFrequencyID)).append("\n");
    sb.append("    interfaceTypeID: ").append(toIndentedString(interfaceTypeID)).append("\n");
    sb.append("    interfaceTechnologyID: ").append(toIndentedString(interfaceTechnologyID)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    visibilityID: ").append(toIndentedString(visibilityID)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    ifaceID: ").append(toIndentedString(ifaceID)).append("\n");
    sb.append("    interfaceTechnology: ").append(toIndentedString(interfaceTechnology)).append("\n");
    sb.append("    businessObjects: ").append(toIndentedString(businessObjects)).append("\n");
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

