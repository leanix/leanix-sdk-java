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
import java.time.OffsetDateTime;
import java.util.UUID;
import net.leanix.api.models.MostRecentAction;
import net.leanix.api.models.Reason;
import net.leanix.api.models.User;

/**
 * BookmarkSuggestion
 */

public class BookmarkSuggestion {
  @JsonProperty("bookmarkId")
  private UUID bookmarkId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    INVENTORY("INVENTORY"),
    
    REPORTING("REPORTING"),
    
    VISUALIZER("VISUALIZER"),
    
    DASHBOARD("DASHBOARD"),
    
    INVENTORY_EXPORT("INVENTORY_EXPORT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("subtype")
  private String subtype = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("mostRecentAction")
  private MostRecentAction mostRecentAction = null;

  @JsonProperty("hitReason")
  private Reason hitReason = null;

  @JsonProperty("views")
  private Long views = null;

  @JsonProperty("predefined")
  private Boolean predefined = false;

  @JsonProperty("bookmarkOwner")
  private User bookmarkOwner = null;

   /**
   * Get bookmarkId
   * @return bookmarkId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getBookmarkId() {
    return bookmarkId;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubtype() {
    return subtype;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public BookmarkSuggestion mostRecentAction(MostRecentAction mostRecentAction) {
    this.mostRecentAction = mostRecentAction;
    return this;
  }

   /**
   * Get mostRecentAction
   * @return mostRecentAction
  **/
  @ApiModelProperty(example = "null", value = "")
  public MostRecentAction getMostRecentAction() {
    return mostRecentAction;
  }

  public void setMostRecentAction(MostRecentAction mostRecentAction) {
    this.mostRecentAction = mostRecentAction;
  }

  public BookmarkSuggestion hitReason(Reason hitReason) {
    this.hitReason = hitReason;
    return this;
  }

   /**
   * Get hitReason
   * @return hitReason
  **/
  @ApiModelProperty(example = "null", value = "")
  public Reason getHitReason() {
    return hitReason;
  }

  public void setHitReason(Reason hitReason) {
    this.hitReason = hitReason;
  }

   /**
   * Get views
   * @return views
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getViews() {
    return views;
  }

   /**
   * Get predefined
   * @return predefined
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPredefined() {
    return predefined;
  }

  public BookmarkSuggestion bookmarkOwner(User bookmarkOwner) {
    this.bookmarkOwner = bookmarkOwner;
    return this;
  }

   /**
   * Get bookmarkOwner
   * @return bookmarkOwner
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getBookmarkOwner() {
    return bookmarkOwner;
  }

  public void setBookmarkOwner(User bookmarkOwner) {
    this.bookmarkOwner = bookmarkOwner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookmarkSuggestion bookmarkSuggestion = (BookmarkSuggestion) o;
    return Objects.equals(this.bookmarkId, bookmarkSuggestion.bookmarkId) &&
        Objects.equals(this.name, bookmarkSuggestion.name) &&
        Objects.equals(this.type, bookmarkSuggestion.type) &&
        Objects.equals(this.subtype, bookmarkSuggestion.subtype) &&
        Objects.equals(this.createdAt, bookmarkSuggestion.createdAt) &&
        Objects.equals(this.updatedAt, bookmarkSuggestion.updatedAt) &&
        Objects.equals(this.mostRecentAction, bookmarkSuggestion.mostRecentAction) &&
        Objects.equals(this.hitReason, bookmarkSuggestion.hitReason) &&
        Objects.equals(this.views, bookmarkSuggestion.views) &&
        Objects.equals(this.predefined, bookmarkSuggestion.predefined) &&
        Objects.equals(this.bookmarkOwner, bookmarkSuggestion.bookmarkOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bookmarkId, name, type, subtype, createdAt, updatedAt, mostRecentAction, hitReason, views, predefined, bookmarkOwner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkSuggestion {\n");
    
    sb.append("    bookmarkId: ").append(toIndentedString(bookmarkId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    mostRecentAction: ").append(toIndentedString(mostRecentAction)).append("\n");
    sb.append("    hitReason: ").append(toIndentedString(hitReason)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
    sb.append("    predefined: ").append(toIndentedString(predefined)).append("\n");
    sb.append("    bookmarkOwner: ").append(toIndentedString(bookmarkOwner)).append("\n");
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

