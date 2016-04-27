package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ActivityUser   {
  
  private String ID = null;
  private String fullName = null;
  private String email = null;

  
  /**
   **/
  public ActivityUser ID(String ID) {
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
  public ActivityUser fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   **/
  public ActivityUser email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityUser activityUser = (ActivityUser) o;
    return Objects.equals(this.ID, activityUser.ID) &&
        Objects.equals(this.fullName, activityUser.fullName) &&
        Objects.equals(this.email, activityUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, fullName, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityUser {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

