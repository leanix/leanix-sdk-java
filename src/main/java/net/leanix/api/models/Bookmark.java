/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.144-SNAPSHOT
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.leanix.api.models.User;

/**
 * Bookmark
 */

public class Bookmark {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("userId")
  private UUID userId = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    INVENTORY("INVENTORY"),
    
    REPORTING("REPORTING"),
    
    VISUALIZER("VISUALIZER");

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

  @JsonProperty("groupKey")
  private String groupKey = null;

  @JsonProperty("state")
  private Map<String, Object> state = new HashMap<String, Object>();

  @JsonProperty("description")
  private String description = null;

  /**
   * Gets or Sets sharing
   */
  public enum SharingEnum {
    PRIVATE("PRIVATE"),
    
    PUBLISHED("PUBLISHED"),
    
    SHARED("SHARED"),
    
    SYSTEM("SYSTEM");

    private String value;

    SharingEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SharingEnum fromValue(String text) {
      for (SharingEnum b : SharingEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sharing")
  private SharingEnum sharing = null;

  @JsonProperty("updatedAt")
  private OffsetDateTime updatedAt = null;

  @JsonProperty("user")
  private User user = null;

  public Bookmark id(UUID id) {
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

  public Bookmark userId(UUID userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UUID getUserId() {
    return userId;
  }

  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  public Bookmark name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Bookmark type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Bookmark groupKey(String groupKey) {
    this.groupKey = groupKey;
    return this;
  }

   /**
   * Get groupKey
   * @return groupKey
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupKey() {
    return groupKey;
  }

  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  public Bookmark state(Map<String, Object> state) {
    this.state = state;
    return this;
  }

  public Bookmark putStateItem(String key, Object stateItem) {
    this.state.put(key, stateItem);
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Map<String, Object> getState() {
    return state;
  }

  public void setState(Map<String, Object> state) {
    this.state = state;
  }

  public Bookmark description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Bookmark sharing(SharingEnum sharing) {
    this.sharing = sharing;
    return this;
  }

   /**
   * Get sharing
   * @return sharing
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public SharingEnum getSharing() {
    return sharing;
  }

  public void setSharing(SharingEnum sharing) {
    this.sharing = sharing;
  }

  public Bookmark updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Bookmark user(User user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(example = "null", value = "")
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Bookmark bookmark = (Bookmark) o;
    return Objects.equals(this.id, bookmark.id) &&
        Objects.equals(this.userId, bookmark.userId) &&
        Objects.equals(this.name, bookmark.name) &&
        Objects.equals(this.type, bookmark.type) &&
        Objects.equals(this.groupKey, bookmark.groupKey) &&
        Objects.equals(this.state, bookmark.state) &&
        Objects.equals(this.description, bookmark.description) &&
        Objects.equals(this.sharing, bookmark.sharing) &&
        Objects.equals(this.updatedAt, bookmark.updatedAt) &&
        Objects.equals(this.user, bookmark.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, name, type, groupKey, state, description, sharing, updatedAt, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Bookmark {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupKey: ").append(toIndentedString(groupKey)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sharing: ").append(toIndentedString(sharing)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

