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
import net.leanix.api.models.LinkedSubscriptionRoleData;
import net.leanix.api.models.SubscriptionRoleLegacy;

/**
 * Subscription
 */

public class Subscription {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("userId")
  private UUID userId = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    ACCOUNTABLE("ACCOUNTABLE"),
    
    RESPONSIBLE("RESPONSIBLE"),
    
    OBSERVER("OBSERVER");

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

  @JsonProperty("linkedRoles")
  private List<LinkedSubscriptionRoleData> linkedRoles = new ArrayList<LinkedSubscriptionRoleData>();

  @JsonProperty("roles")
  private List<SubscriptionRoleLegacy> roles = new ArrayList<SubscriptionRoleLegacy>();

  public Subscription id(UUID id) {
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

  public Subscription userId(UUID userId) {
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

  public Subscription type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Subscription linkedRoles(List<LinkedSubscriptionRoleData> linkedRoles) {
    this.linkedRoles = linkedRoles;
    return this;
  }

  public Subscription addLinkedRolesItem(LinkedSubscriptionRoleData linkedRolesItem) {
    this.linkedRoles.add(linkedRolesItem);
    return this;
  }

   /**
   * Get linkedRoles
   * @return linkedRoles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<LinkedSubscriptionRoleData> getLinkedRoles() {
    return linkedRoles;
  }

  public void setLinkedRoles(List<LinkedSubscriptionRoleData> linkedRoles) {
    this.linkedRoles = linkedRoles;
  }

  public Subscription roles(List<SubscriptionRoleLegacy> roles) {
    this.roles = roles;
    return this;
  }

  public Subscription addRolesItem(SubscriptionRoleLegacy rolesItem) {
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SubscriptionRoleLegacy> getRoles() {
    return roles;
  }

  public void setRoles(List<SubscriptionRoleLegacy> roles) {
    this.roles = roles;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.userId, subscription.userId) &&
        Objects.equals(this.type, subscription.type) &&
        Objects.equals(this.linkedRoles, subscription.linkedRoles) &&
        Objects.equals(this.roles, subscription.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, type, linkedRoles, roles);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    linkedRoles: ").append(toIndentedString(linkedRoles)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

