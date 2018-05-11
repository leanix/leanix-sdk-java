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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.SignavioGlossaryCategoryMapping;
import net.leanix.api.models.SignavioProcessMapping;

/**
 * SignavioSettings
 */

public class SignavioSettings {
  @JsonProperty("active")
  private Boolean active = false;

  @JsonProperty("userName")
  private String userName = null;

  @JsonProperty("password")
  private String password = null;

  @JsonProperty("signavioUrl")
  private String signavioUrl = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("loginParams")
  private String loginParams = null;

  @JsonProperty("processMapping")
  private SignavioProcessMapping processMapping = null;

  @JsonProperty("glossaryCategoryMappings")
  private Map<String, SignavioGlossaryCategoryMapping> glossaryCategoryMappings = new HashMap<String, SignavioGlossaryCategoryMapping>();

  public SignavioSettings active(Boolean active) {
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

  public SignavioSettings userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * Get userName
   * @return userName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SignavioSettings password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Get password
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public SignavioSettings signavioUrl(String signavioUrl) {
    this.signavioUrl = signavioUrl;
    return this;
  }

   /**
   * Get signavioUrl
   * @return signavioUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSignavioUrl() {
    return signavioUrl;
  }

  public void setSignavioUrl(String signavioUrl) {
    this.signavioUrl = signavioUrl;
  }

  public SignavioSettings tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public SignavioSettings loginParams(String loginParams) {
    this.loginParams = loginParams;
    return this;
  }

   /**
   * Get loginParams
   * @return loginParams
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLoginParams() {
    return loginParams;
  }

  public void setLoginParams(String loginParams) {
    this.loginParams = loginParams;
  }

  public SignavioSettings processMapping(SignavioProcessMapping processMapping) {
    this.processMapping = processMapping;
    return this;
  }

   /**
   * Get processMapping
   * @return processMapping
  **/
  @ApiModelProperty(example = "null", value = "")
  public SignavioProcessMapping getProcessMapping() {
    return processMapping;
  }

  public void setProcessMapping(SignavioProcessMapping processMapping) {
    this.processMapping = processMapping;
  }

  public SignavioSettings glossaryCategoryMappings(Map<String, SignavioGlossaryCategoryMapping> glossaryCategoryMappings) {
    this.glossaryCategoryMappings = glossaryCategoryMappings;
    return this;
  }

  public SignavioSettings putGlossaryCategoryMappingsItem(String key, SignavioGlossaryCategoryMapping glossaryCategoryMappingsItem) {
    this.glossaryCategoryMappings.put(key, glossaryCategoryMappingsItem);
    return this;
  }

   /**
   * Get glossaryCategoryMappings
   * @return glossaryCategoryMappings
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, SignavioGlossaryCategoryMapping> getGlossaryCategoryMappings() {
    return glossaryCategoryMappings;
  }

  public void setGlossaryCategoryMappings(Map<String, SignavioGlossaryCategoryMapping> glossaryCategoryMappings) {
    this.glossaryCategoryMappings = glossaryCategoryMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignavioSettings signavioSettings = (SignavioSettings) o;
    return Objects.equals(this.active, signavioSettings.active) &&
        Objects.equals(this.userName, signavioSettings.userName) &&
        Objects.equals(this.password, signavioSettings.password) &&
        Objects.equals(this.signavioUrl, signavioSettings.signavioUrl) &&
        Objects.equals(this.tenantId, signavioSettings.tenantId) &&
        Objects.equals(this.loginParams, signavioSettings.loginParams) &&
        Objects.equals(this.processMapping, signavioSettings.processMapping) &&
        Objects.equals(this.glossaryCategoryMappings, signavioSettings.glossaryCategoryMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, userName, password, signavioUrl, tenantId, loginParams, processMapping, glossaryCategoryMappings);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignavioSettings {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    signavioUrl: ").append(toIndentedString(signavioUrl)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    loginParams: ").append(toIndentedString(loginParams)).append("\n");
    sb.append("    processMapping: ").append(toIndentedString(processMapping)).append("\n");
    sb.append("    glossaryCategoryMappings: ").append(toIndentedString(glossaryCategoryMappings)).append("\n");
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

