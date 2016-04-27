package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ProjectHasProvider   {
  
  private String ID = null;
  private String providerID = null;
  private String projectID = null;
  private Double orderedOpex = null;
  private Double orderedCapex = null;
  private String orderNo = null;

  
  /**
   **/
  public ProjectHasProvider ID(String ID) {
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
  public ProjectHasProvider providerID(String providerID) {
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
  public ProjectHasProvider projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectID")
  public String getProjectID() {
    return projectID;
  }
  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  
  /**
   **/
  public ProjectHasProvider orderedOpex(Double orderedOpex) {
    this.orderedOpex = orderedOpex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderedOpex")
  public Double getOrderedOpex() {
    return orderedOpex;
  }
  public void setOrderedOpex(Double orderedOpex) {
    this.orderedOpex = orderedOpex;
  }

  
  /**
   **/
  public ProjectHasProvider orderedCapex(Double orderedCapex) {
    this.orderedCapex = orderedCapex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderedCapex")
  public Double getOrderedCapex() {
    return orderedCapex;
  }
  public void setOrderedCapex(Double orderedCapex) {
    this.orderedCapex = orderedCapex;
  }

  
  /**
   **/
  public ProjectHasProvider orderNo(String orderNo) {
    this.orderNo = orderNo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("orderNo")
  public String getOrderNo() {
    return orderNo;
  }
  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectHasProvider projectHasProvider = (ProjectHasProvider) o;
    return Objects.equals(this.ID, projectHasProvider.ID) &&
        Objects.equals(this.providerID, projectHasProvider.providerID) &&
        Objects.equals(this.projectID, projectHasProvider.projectID) &&
        Objects.equals(this.orderedOpex, projectHasProvider.orderedOpex) &&
        Objects.equals(this.orderedCapex, projectHasProvider.orderedCapex) &&
        Objects.equals(this.orderNo, projectHasProvider.orderNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, providerID, projectID, orderedOpex, orderedCapex, orderNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHasProvider {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    orderedOpex: ").append(toIndentedString(orderedOpex)).append("\n");
    sb.append("    orderedCapex: ").append(toIndentedString(orderedCapex)).append("\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
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

