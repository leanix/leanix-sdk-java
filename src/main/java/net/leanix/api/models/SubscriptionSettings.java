package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;






public class SubscriptionSettings   {
  


  public enum SubscriptionTypesEnum {
    ACCOUNTABLE("ACCOUNTABLE"),
    RESPONSIBLE("RESPONSIBLE"),
    OBSERVER("OBSERVER");

    private String value;

    SubscriptionTypesEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<SubscriptionTypesEnum> subscriptionTypes = new ArrayList<SubscriptionTypesEnum>();


  public enum RoleAssignmentEnum {
    SINGLE("SINGLE"),
    MULTIPLE("MULTIPLE");

    private String value;

    RoleAssignmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private RoleAssignmentEnum roleAssignment = null;

  
  /**
   **/
  public SubscriptionSettings subscriptionTypes(List<SubscriptionTypesEnum> subscriptionTypes) {
    this.subscriptionTypes = subscriptionTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subscriptionTypes")
  public List<SubscriptionTypesEnum> getSubscriptionTypes() {
    return subscriptionTypes;
  }
  public void setSubscriptionTypes(List<SubscriptionTypesEnum> subscriptionTypes) {
    this.subscriptionTypes = subscriptionTypes;
  }

  
  /**
   **/
  public SubscriptionSettings roleAssignment(RoleAssignmentEnum roleAssignment) {
    this.roleAssignment = roleAssignment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("roleAssignment")
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

