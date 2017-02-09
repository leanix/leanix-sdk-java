/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.9-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import net.leanix.api.models.Instant;
import net.leanix.api.models.Reply;

/**
 * GQLComment
 */

public class GQLComment {
  @JsonProperty("message")
  private String message = null;

  @JsonProperty("id")
  private UUID id = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    CLOSED("CLOSED"),
    
    REOPENED("REOPENED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("userId")
  private UUID userId = null;

  @JsonProperty("factSheetId")
  private UUID factSheetId = null;

  @JsonProperty("replies")
  private List<Reply> replies = new ArrayList<Reply>();

  @JsonProperty("creationTimestamp")
  private Instant creationTimestamp = null;

  public GQLComment message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public GQLComment id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public GQLComment status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public GQLComment userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public GQLComment factSheetId(UUID factSheetId) {
    this.factSheetId = factSheetId;
    return this;
  }

   /**
   * Get factSheetId
   * @return factSheetId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getFactSheetId() {
    return factSheetId;
  }

  public void setFactSheetId(UUID factSheetId) {
    this.factSheetId = factSheetId;
  }

  public GQLComment replies(List<Reply> replies) {
    this.replies = replies;
    return this;
  }

  public GQLComment addRepliesItem(Reply repliesItem) {
    this.replies.add(repliesItem);
    return this;
  }

   /**
   * Get replies
   * @return replies
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Reply> getReplies() {
    return replies;
  }

  public void setReplies(List<Reply> replies) {
    this.replies = replies;
  }

  public GQLComment creationTimestamp(Instant creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

   /**
   * Get creationTimestamp
   * @return creationTimestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Instant getCreationTimestamp() {
    return creationTimestamp;
  }

  public void setCreationTimestamp(Instant creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GQLComment gqLComment = (GQLComment) o;
    return Objects.equals(this.message, gqLComment.message) &&
        Objects.equals(this.id, gqLComment.id) &&
        Objects.equals(this.status, gqLComment.status) &&
        Objects.equals(this.userId, gqLComment.userId) &&
        Objects.equals(this.factSheetId, gqLComment.factSheetId) &&
        Objects.equals(this.replies, gqLComment.replies) &&
        Objects.equals(this.creationTimestamp, gqLComment.creationTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, id, status, userId, factSheetId, replies, creationTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GQLComment {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    factSheetId: ").append(toIndentedString(factSheetId)).append("\n");
    sb.append("    replies: ").append(toIndentedString(replies)).append("\n");
    sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
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

