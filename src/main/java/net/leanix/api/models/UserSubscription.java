package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;






public class UserSubscription   {
  
  private String ID = null;
  private String factSheetID = null;
  private String userID = null;
  private String subscriptionTypeID = null;
  private List<String> roleDetails = new ArrayList<String>();
  private String userUUID = null;

  
  /**
   **/
  public UserSubscription ID(String ID) {
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
  public UserSubscription factSheetID(String factSheetID) {
    this.factSheetID = factSheetID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetID")
  public String getFactSheetID() {
    return factSheetID;
  }
  public void setFactSheetID(String factSheetID) {
    this.factSheetID = factSheetID;
  }

  
  /**
   **/
  public UserSubscription userID(String userID) {
    this.userID = userID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  
  /**
   **/
  public UserSubscription subscriptionTypeID(String subscriptionTypeID) {
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

  
  /**
   **/
  public UserSubscription roleDetails(List<String> roleDetails) {
    this.roleDetails = roleDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roleDetails")
  public List<String> getRoleDetails() {
    return roleDetails;
  }
  public void setRoleDetails(List<String> roleDetails) {
    this.roleDetails = roleDetails;
  }

  
  /**
   **/
  public UserSubscription userUUID(String userUUID) {
    this.userUUID = userUUID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userUUID")
  public String getUserUUID() {
    return userUUID;
  }
  public void setUserUUID(String userUUID) {
    this.userUUID = userUUID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSubscription userSubscription = (UserSubscription) o;
    return Objects.equals(this.ID, userSubscription.ID) &&
        Objects.equals(this.factSheetID, userSubscription.factSheetID) &&
        Objects.equals(this.userID, userSubscription.userID) &&
        Objects.equals(this.subscriptionTypeID, userSubscription.subscriptionTypeID) &&
        Objects.equals(this.roleDetails, userSubscription.roleDetails) &&
        Objects.equals(this.userUUID, userSubscription.userUUID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, factSheetID, userID, subscriptionTypeID, roleDetails, userUUID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSubscription {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    factSheetID: ").append(toIndentedString(factSheetID)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    subscriptionTypeID: ").append(toIndentedString(subscriptionTypeID)).append("\n");
    sb.append("    roleDetails: ").append(toIndentedString(roleDetails)).append("\n");
    sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
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

