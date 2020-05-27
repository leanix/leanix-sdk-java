/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.174
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ExternalId
 */

public class ExternalId extends LxField {
  @JsonProperty("externalId")
  private String externalId = null;

  @JsonProperty("comment")
  private String comment = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("externalUrl")
  private String externalUrl = null;

  @JsonProperty("externalVersion")
  private String externalVersion = null;

  @JsonProperty("forceWrite")
  private Boolean forceWrite = false;

  public ExternalId externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Get externalId
   * @return externalId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ExternalId comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public ExternalId status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ExternalId externalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * Get externalUrl
   * @return externalUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalUrl() {
    return externalUrl;
  }

  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }

  public ExternalId externalVersion(String externalVersion) {
    this.externalVersion = externalVersion;
    return this;
  }

   /**
   * Get externalVersion
   * @return externalVersion
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getExternalVersion() {
    return externalVersion;
  }

  public void setExternalVersion(String externalVersion) {
    this.externalVersion = externalVersion;
  }

  public ExternalId forceWrite(Boolean forceWrite) {
    this.forceWrite = forceWrite;
    return this;
  }

   /**
   * Get forceWrite
   * @return forceWrite
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getForceWrite() {
    return forceWrite;
  }

  public void setForceWrite(Boolean forceWrite) {
    this.forceWrite = forceWrite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalId externalId = (ExternalId) o;
    return Objects.equals(this.externalId, externalId.externalId) &&
        Objects.equals(this.comment, externalId.comment) &&
        Objects.equals(this.status, externalId.status) &&
        Objects.equals(this.externalUrl, externalId.externalUrl) &&
        Objects.equals(this.externalVersion, externalId.externalVersion) &&
        Objects.equals(this.forceWrite, externalId.forceWrite) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, comment, status, externalUrl, externalVersion, forceWrite, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalId {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalVersion: ").append(toIndentedString(externalVersion)).append("\n");
    sb.append("    forceWrite: ").append(toIndentedString(forceWrite)).append("\n");
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

