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
import java.util.ArrayList;
import java.util.List;

/**
 * SubscriptionSettings
 */

public class SubscriptionSettings {
  /**
   * Gets or Sets subscriptionTypes
   */
  public enum SubscriptionTypesEnum {
    ACCOUNTABLE("ACCOUNTABLE"),
    
    RESPONSIBLE("RESPONSIBLE"),
    
    OBSERVER("OBSERVER");

    private String value;

    SubscriptionTypesEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriptionTypesEnum fromValue(String text) {
      for (SubscriptionTypesEnum b : SubscriptionTypesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("subscriptionTypes")
  private List<SubscriptionTypesEnum> subscriptionTypes = new ArrayList<SubscriptionTypesEnum>();

  /**
   * Gets or Sets roleAssignment
   */
  public enum RoleAssignmentEnum {
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    RoleAssignmentEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleAssignmentEnum fromValue(String text) {
      for (RoleAssignmentEnum b : RoleAssignmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roleAssignment")
  private RoleAssignmentEnum roleAssignment = null;

  /**
   * Gets or Sets roleMode
   */
  public enum RoleModeEnum {
    ON_THE_FLY("ON_THE_FLY"),
    
    OPTIONAL("OPTIONAL"),
    
    REQUIRED("REQUIRED");

    private String value;

    RoleModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleModeEnum fromValue(String text) {
      for (RoleModeEnum b : RoleModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("roleMode")
  private RoleModeEnum roleMode = null;

  public SubscriptionSettings subscriptionTypes(List<SubscriptionTypesEnum> subscriptionTypes) {
    this.subscriptionTypes = subscriptionTypes;
    return this;
  }

  public SubscriptionSettings addSubscriptionTypesItem(SubscriptionTypesEnum subscriptionTypesItem) {
    this.subscriptionTypes.add(subscriptionTypesItem);
    return this;
  }

   /**
   * Get subscriptionTypes
   * @return subscriptionTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<SubscriptionTypesEnum> getSubscriptionTypes() {
    return subscriptionTypes;
  }

  public void setSubscriptionTypes(List<SubscriptionTypesEnum> subscriptionTypes) {
    this.subscriptionTypes = subscriptionTypes;
  }

  public SubscriptionSettings roleAssignment(RoleAssignmentEnum roleAssignment) {
    this.roleAssignment = roleAssignment;
    return this;
  }

   /**
   * Get roleAssignment
   * @return roleAssignment
  **/
  @ApiModelProperty(example = "null", value = "")
  public RoleAssignmentEnum getRoleAssignment() {
    return roleAssignment;
  }

  public void setRoleAssignment(RoleAssignmentEnum roleAssignment) {
    this.roleAssignment = roleAssignment;
  }

  public SubscriptionSettings roleMode(RoleModeEnum roleMode) {
    this.roleMode = roleMode;
    return this;
  }

   /**
   * Get roleMode
   * @return roleMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public RoleModeEnum getRoleMode() {
    return roleMode;
  }

  public void setRoleMode(RoleModeEnum roleMode) {
    this.roleMode = roleMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionSettings subscriptionSettings = (SubscriptionSettings) o;
    return Objects.equals(this.subscriptionTypes, subscriptionSettings.subscriptionTypes) &&
        Objects.equals(this.roleAssignment, subscriptionSettings.roleAssignment) &&
        Objects.equals(this.roleMode, subscriptionSettings.roleMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionTypes, roleAssignment, roleMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSettings {\n");
    
    sb.append("    subscriptionTypes: ").append(toIndentedString(subscriptionTypes)).append("\n");
    sb.append("    roleAssignment: ").append(toIndentedString(roleAssignment)).append("\n");
    sb.append("    roleMode: ").append(toIndentedString(roleMode)).append("\n");
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

