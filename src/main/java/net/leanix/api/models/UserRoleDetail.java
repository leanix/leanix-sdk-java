package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class UserRoleDetail   {
  
  private String ID = null;
  private String name = null;
  private String description = null;
  private String subscriptionTypeID = null;

  
  /**
   **/
  public UserRoleDetail ID(String ID) {
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
  public UserRoleDetail name(String name) {
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
  public UserRoleDetail description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public UserRoleDetail subscriptionTypeID(String subscriptionTypeID) {
    this.subscriptionTypeID = subscriptionTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subscriptionTypeID")
  public String getSubscriptionTypeID() {
    return subscriptionTypeID;
  }
  public void setSubscriptionTypeID(String subscriptionTypeID) {
    this.subscriptionTypeID = subscriptionTypeID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRoleDetail userRoleDetail = (UserRoleDetail) o;
    return Objects.equals(this.ID, userRoleDetail.ID) &&
        Objects.equals(this.name, userRoleDetail.name) &&
        Objects.equals(this.description, userRoleDetail.description) &&
        Objects.equals(this.subscriptionTypeID, userRoleDetail.subscriptionTypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, description, subscriptionTypeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRoleDetail {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    subscriptionTypeID: ").append(toIndentedString(subscriptionTypeID)).append("\n");
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

