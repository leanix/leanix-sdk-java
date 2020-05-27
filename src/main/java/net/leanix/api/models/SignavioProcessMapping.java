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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SignavioProcessMapping
 */

public class SignavioProcessMapping {
  @JsonProperty("active")
  private Boolean active = false;

  @JsonProperty("strict")
  private Boolean strict = false;

  @JsonProperty("directoryIds")
  private List<String> directoryIds = new ArrayList<String>();

  @JsonProperty("factSheetType")
  private String factSheetType = null;

  /**
   * Gets or Sets linkProcessingMode
   */
  public enum LinkProcessingModeEnum {
    NO_PROCESSING("NO_PROCESSING"),
    
    PARENT_CHILD("PARENT_CHILD");

    private String value;

    LinkProcessingModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static LinkProcessingModeEnum fromValue(String text) {
      for (LinkProcessingModeEnum b : LinkProcessingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("linkProcessingMode")
  private LinkProcessingModeEnum linkProcessingMode = null;

  @JsonProperty("publishedOnly")
  private Boolean publishedOnly = false;

  public SignavioProcessMapping active(Boolean active) {
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

  public SignavioProcessMapping strict(Boolean strict) {
    this.strict = strict;
    return this;
  }

   /**
   * Get strict
   * @return strict
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getStrict() {
    return strict;
  }

  public void setStrict(Boolean strict) {
    this.strict = strict;
  }

  public SignavioProcessMapping directoryIds(List<String> directoryIds) {
    this.directoryIds = directoryIds;
    return this;
  }

  public SignavioProcessMapping addDirectoryIdsItem(String directoryIdsItem) {
    this.directoryIds.add(directoryIdsItem);
    return this;
  }

   /**
   * Get directoryIds
   * @return directoryIds
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getDirectoryIds() {
    return directoryIds;
  }

  public void setDirectoryIds(List<String> directoryIds) {
    this.directoryIds = directoryIds;
  }

  public SignavioProcessMapping factSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
    return this;
  }

   /**
   * Get factSheetType
   * @return factSheetType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFactSheetType() {
    return factSheetType;
  }

  public void setFactSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
  }

  public SignavioProcessMapping linkProcessingMode(LinkProcessingModeEnum linkProcessingMode) {
    this.linkProcessingMode = linkProcessingMode;
    return this;
  }

   /**
   * Get linkProcessingMode
   * @return linkProcessingMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public LinkProcessingModeEnum getLinkProcessingMode() {
    return linkProcessingMode;
  }

  public void setLinkProcessingMode(LinkProcessingModeEnum linkProcessingMode) {
    this.linkProcessingMode = linkProcessingMode;
  }

  public SignavioProcessMapping publishedOnly(Boolean publishedOnly) {
    this.publishedOnly = publishedOnly;
    return this;
  }

   /**
   * Get publishedOnly
   * @return publishedOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPublishedOnly() {
    return publishedOnly;
  }

  public void setPublishedOnly(Boolean publishedOnly) {
    this.publishedOnly = publishedOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignavioProcessMapping signavioProcessMapping = (SignavioProcessMapping) o;
    return Objects.equals(this.active, signavioProcessMapping.active) &&
        Objects.equals(this.strict, signavioProcessMapping.strict) &&
        Objects.equals(this.directoryIds, signavioProcessMapping.directoryIds) &&
        Objects.equals(this.factSheetType, signavioProcessMapping.factSheetType) &&
        Objects.equals(this.linkProcessingMode, signavioProcessMapping.linkProcessingMode) &&
        Objects.equals(this.publishedOnly, signavioProcessMapping.publishedOnly);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, strict, directoryIds, factSheetType, linkProcessingMode, publishedOnly);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignavioProcessMapping {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
    sb.append("    directoryIds: ").append(toIndentedString(directoryIds)).append("\n");
    sb.append("    factSheetType: ").append(toIndentedString(factSheetType)).append("\n");
    sb.append("    linkProcessingMode: ").append(toIndentedString(linkProcessingMode)).append("\n");
    sb.append("    publishedOnly: ").append(toIndentedString(publishedOnly)).append("\n");
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

