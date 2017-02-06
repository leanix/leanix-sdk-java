/**
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.ArrayList;


/**
 * SubscriptionSettings
 */

public class SubscriptionSettings   {
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
  private java.util.List<SubscriptionTypesEnum> subscriptionTypes = new java.util.ArrayList<SubscriptionTypesEnum>();

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

  public SubscriptionSettings subscriptionTypes(java.util.List<SubscriptionTypesEnum> subscriptionTypes) {
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
  public java.util.List<SubscriptionTypesEnum> getSubscriptionTypes() {
    return subscriptionTypes;
  }

  public void setSubscriptionTypes(java.util.List<SubscriptionTypesEnum> subscriptionTypes) {
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
        Objects.equals(this.roleAssignment, subscriptionSettings.roleAssignment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionTypes, roleAssignment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionSettings {\n");
    
    sb.append("    subscriptionTypes: ").append(toIndentedString(subscriptionTypes)).append("\n");
    sb.append("    roleAssignment: ").append(toIndentedString(roleAssignment)).append("\n");
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

