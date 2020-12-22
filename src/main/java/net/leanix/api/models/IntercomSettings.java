/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.396
 * 
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

/**
 * IntercomSettings
 */

public class IntercomSettings {
  @JsonProperty("active")
  private Boolean active = false;

  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("identitySecret")
  private String identitySecret = null;

  public IntercomSettings active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public IntercomSettings appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Get appId
   * @return appId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public IntercomSettings identitySecret(String identitySecret) {
    this.identitySecret = identitySecret;
    return this;
  }

   /**
   * Get identitySecret
   * @return identitySecret
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIdentitySecret() {
    return identitySecret;
  }

  public void setIdentitySecret(String identitySecret) {
    this.identitySecret = identitySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntercomSettings intercomSettings = (IntercomSettings) o;
    return Objects.equals(this.active, intercomSettings.active) &&
        Objects.equals(this.appId, intercomSettings.appId) &&
        Objects.equals(this.identitySecret, intercomSettings.identitySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, appId, identitySecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntercomSettings {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    identitySecret: ").append(toIndentedString(identitySecret)).append("\n");
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

