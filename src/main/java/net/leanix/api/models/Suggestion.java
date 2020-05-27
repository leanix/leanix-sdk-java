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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Suggestion
 */

public class Suggestion {
  @JsonProperty("objectId")
  private UUID objectId = null;

  @JsonProperty("displayName")
  private String displayName = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("reasons")
  private List<Reason> reasons = new ArrayList<Reason>();

  public Suggestion objectId(UUID objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * Get objectId
   * @return objectId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getObjectId() {
    return objectId;
  }

  public void setObjectId(UUID objectId) {
    this.objectId = objectId;
  }

  public Suggestion displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Suggestion type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Suggestion reasons(List<Reason> reasons) {
    this.reasons = reasons;
    return this;
  }

  public Suggestion addReasonsItem(Reason reasonsItem) {
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * Get reasons
   * @return reasons
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Reason> getReasons() {
    return reasons;
  }

  public void setReasons(List<Reason> reasons) {
    this.reasons = reasons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Suggestion suggestion = (Suggestion) o;
    return Objects.equals(this.objectId, suggestion.objectId) &&
        Objects.equals(this.displayName, suggestion.displayName) &&
        Objects.equals(this.type, suggestion.type) &&
        Objects.equals(this.reasons, suggestion.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, displayName, type, reasons);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Suggestion {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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

