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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * BookmarkShareInputData
 */

public class BookmarkShareInputData {
  @JsonProperty("bookmarkId")
  private UUID bookmarkId = null;

  @JsonProperty("sharedByUserId")
  private UUID sharedByUserId = null;

  @JsonProperty("sharedWithUserIds")
  private List<UUID> sharedWithUserIds = new ArrayList<UUID>();

  @JsonProperty("notifyUsers")
  private Boolean notifyUsers = false;

  public BookmarkShareInputData bookmarkId(UUID bookmarkId) {
    this.bookmarkId = bookmarkId;
    return this;
  }

   /**
   * Get bookmarkId
   * @return bookmarkId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UUID getBookmarkId() {
    return bookmarkId;
  }

  public void setBookmarkId(UUID bookmarkId) {
    this.bookmarkId = bookmarkId;
  }

  public BookmarkShareInputData sharedByUserId(UUID sharedByUserId) {
    this.sharedByUserId = sharedByUserId;
    return this;
  }

   /**
   * Get sharedByUserId
   * @return sharedByUserId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getSharedByUserId() {
    return sharedByUserId;
  }

  public void setSharedByUserId(UUID sharedByUserId) {
    this.sharedByUserId = sharedByUserId;
  }

  public BookmarkShareInputData sharedWithUserIds(List<UUID> sharedWithUserIds) {
    this.sharedWithUserIds = sharedWithUserIds;
    return this;
  }

  public BookmarkShareInputData addSharedWithUserIdsItem(UUID sharedWithUserIdsItem) {
    this.sharedWithUserIds.add(sharedWithUserIdsItem);
    return this;
  }

   /**
   * Get sharedWithUserIds
   * @return sharedWithUserIds
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public List<UUID> getSharedWithUserIds() {
    return sharedWithUserIds;
  }

  public void setSharedWithUserIds(List<UUID> sharedWithUserIds) {
    this.sharedWithUserIds = sharedWithUserIds;
  }

  public BookmarkShareInputData notifyUsers(Boolean notifyUsers) {
    this.notifyUsers = notifyUsers;
    return this;
  }

   /**
   * Get notifyUsers
   * @return notifyUsers
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getNotifyUsers() {
    return notifyUsers;
  }

  public void setNotifyUsers(Boolean notifyUsers) {
    this.notifyUsers = notifyUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookmarkShareInputData bookmarkShareInputData = (BookmarkShareInputData) o;
    return Objects.equals(this.bookmarkId, bookmarkShareInputData.bookmarkId) &&
        Objects.equals(this.sharedByUserId, bookmarkShareInputData.sharedByUserId) &&
        Objects.equals(this.sharedWithUserIds, bookmarkShareInputData.sharedWithUserIds) &&
        Objects.equals(this.notifyUsers, bookmarkShareInputData.notifyUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, sharedByUserId, sharedWithUserIds, notifyUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkShareInputData {\n");
    
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    sharedByUserId: ").append(toIndentedString(sharedByUserId)).append("\n");
    sb.append("    sharedWithUserIds: ").append(toIndentedString(sharedWithUserIds)).append("\n");
    sb.append("    notifyUsers: ").append(toIndentedString(notifyUsers)).append("\n");
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

