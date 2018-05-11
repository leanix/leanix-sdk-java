/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.60-SNAPSHOT
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
 * HelpSettings
 */

public class HelpSettings {
  @JsonProperty("helpCenter")
  private String helpCenter = null;

  @JsonProperty("userGuide")
  private String userGuide = null;

  @JsonProperty("supportEmail")
  private String supportEmail = null;

  @JsonProperty("supportUrl")
  private String supportUrl = null;

  @JsonProperty("showHelpTours")
  private Boolean showHelpTours = false;

  public HelpSettings helpCenter(String helpCenter) {
    this.helpCenter = helpCenter;
    return this;
  }

   /**
   * Get helpCenter
   * @return helpCenter
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHelpCenter() {
    return helpCenter;
  }

  public void setHelpCenter(String helpCenter) {
    this.helpCenter = helpCenter;
  }

  public HelpSettings userGuide(String userGuide) {
    this.userGuide = userGuide;
    return this;
  }

   /**
   * Get userGuide
   * @return userGuide
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserGuide() {
    return userGuide;
  }

  public void setUserGuide(String userGuide) {
    this.userGuide = userGuide;
  }

  public HelpSettings supportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
    return this;
  }

   /**
   * Get supportEmail
   * @return supportEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSupportEmail() {
    return supportEmail;
  }

  public void setSupportEmail(String supportEmail) {
    this.supportEmail = supportEmail;
  }

  public HelpSettings supportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
    return this;
  }

   /**
   * Get supportUrl
   * @return supportUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSupportUrl() {
    return supportUrl;
  }

  public void setSupportUrl(String supportUrl) {
    this.supportUrl = supportUrl;
  }

  public HelpSettings showHelpTours(Boolean showHelpTours) {
    this.showHelpTours = showHelpTours;
    return this;
  }

   /**
   * Get showHelpTours
   * @return showHelpTours
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getShowHelpTours() {
    return showHelpTours;
  }

  public void setShowHelpTours(Boolean showHelpTours) {
    this.showHelpTours = showHelpTours;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelpSettings helpSettings = (HelpSettings) o;
    return Objects.equals(this.helpCenter, helpSettings.helpCenter) &&
        Objects.equals(this.userGuide, helpSettings.userGuide) &&
        Objects.equals(this.supportEmail, helpSettings.supportEmail) &&
        Objects.equals(this.supportUrl, helpSettings.supportUrl) &&
        Objects.equals(this.showHelpTours, helpSettings.showHelpTours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(helpCenter, userGuide, supportEmail, supportUrl, showHelpTours);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpSettings {\n");
    
    sb.append("    helpCenter: ").append(toIndentedString(helpCenter)).append("\n");
    sb.append("    userGuide: ").append(toIndentedString(userGuide)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    supportUrl: ").append(toIndentedString(supportUrl)).append("\n");
    sb.append("    showHelpTours: ").append(toIndentedString(showHelpTours)).append("\n");
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

