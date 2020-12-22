/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import net.leanix.api.models.User;

/**
 * SharedUserInfo
 */

public class SharedUserInfo {
  @JsonProperty("sharedWithUser")
  private User sharedWithUser = null;

  @JsonProperty("sharedAt")
  private OffsetDateTime sharedAt = null;

  public SharedUserInfo sharedWithUser(User sharedWithUser) {
    this.sharedWithUser = sharedWithUser;
    return this;
  }

   /**
   * Get sharedWithUser
   * @return sharedWithUser
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getSharedWithUser() {
    return sharedWithUser;
  }

  public void setSharedWithUser(User sharedWithUser) {
    this.sharedWithUser = sharedWithUser;
  }

  public SharedUserInfo sharedAt(OffsetDateTime sharedAt) {
    this.sharedAt = sharedAt;
    return this;
  }

   /**
   * Get sharedAt
   * @return sharedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getSharedAt() {
    return sharedAt;
  }

  public void setSharedAt(OffsetDateTime sharedAt) {
    this.sharedAt = sharedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedUserInfo sharedUserInfo = (SharedUserInfo) o;
    return Objects.equals(this.sharedWithUser, sharedUserInfo.sharedWithUser) &&
        Objects.equals(this.sharedAt, sharedUserInfo.sharedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedWithUser, sharedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedUserInfo {\n");
    
    sb.append("    sharedWithUser: ").append(toIndentedString(sharedWithUser)).append("\n");
    sb.append("    sharedAt: ").append(toIndentedString(sharedAt)).append("\n");
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

