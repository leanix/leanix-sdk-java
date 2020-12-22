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
import java.util.UUID;

/**
 * MostRecentAction
 */

public class MostRecentAction {
  @JsonProperty("actionDateTime")
  private OffsetDateTime actionDateTime = null;

  /**
   * Gets or Sets actionName
   */
  public enum ActionNameEnum {
    CREATED("CREATED"),
    
    VIEWED("VIEWED"),
    
    UPDATED("UPDATED"),
    
    SHARED("SHARED");

    private String value;

    ActionNameEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActionNameEnum fromValue(String text) {
      for (ActionNameEnum b : ActionNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("actionName")
  private ActionNameEnum actionName = null;

  @JsonProperty("sharedByUserId")
  private UUID sharedByUserId = null;

  @JsonProperty("myViews")
  private Long myViews = null;

   /**
   * Get actionDateTime
   * @return actionDateTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getActionDateTime() {
    return actionDateTime;
  }

   /**
   * Get actionName
   * @return actionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public ActionNameEnum getActionName() {
    return actionName;
  }

   /**
   * Get sharedByUserId
   * @return sharedByUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getSharedByUserId() {
    return sharedByUserId;
  }

   /**
   * Get myViews
   * @return myViews
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getMyViews() {
    return myViews;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MostRecentAction mostRecentAction = (MostRecentAction) o;
    return Objects.equals(this.actionDateTime, mostRecentAction.actionDateTime) &&
        Objects.equals(this.actionName, mostRecentAction.actionName) &&
        Objects.equals(this.sharedByUserId, mostRecentAction.sharedByUserId) &&
        Objects.equals(this.myViews, mostRecentAction.myViews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionDateTime, actionName, sharedByUserId, myViews);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MostRecentAction {\n");
    
    sb.append("    actionDateTime: ").append(toIndentedString(actionDateTime)).append("\n");
    sb.append("    actionName: ").append(toIndentedString(actionName)).append("\n");
    sb.append("    sharedByUserId: ").append(toIndentedString(sharedByUserId)).append("\n");
    sb.append("    myViews: ").append(toIndentedString(myViews)).append("\n");
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

