/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.7-SNAPSHOT
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
 * SubscriptionRole
 */

public class SubscriptionRole {
  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets subscriptionType
   */
  public enum SubscriptionTypeEnum {
    ACCOUNTABLE("ACCOUNTABLE"),
    
    RESPONSIBLE("RESPONSIBLE"),
    
    OBSERVER("OBSERVER");

    private String value;

    SubscriptionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SubscriptionTypeEnum fromValue(String text) {
      for (SubscriptionTypeEnum b : SubscriptionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("subscriptionType")
  private SubscriptionTypeEnum subscriptionType = null;

  @JsonProperty("restrictToFactSheetTypes")
  private List<String> restrictToFactSheetTypes = new ArrayList<String>();

  public SubscriptionRole name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SubscriptionRole subscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
    return this;
  }

   /**
   * Get subscriptionType
   * @return subscriptionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public SubscriptionTypeEnum getSubscriptionType() {
    return subscriptionType;
  }

  public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
    this.subscriptionType = subscriptionType;
  }

  public SubscriptionRole restrictToFactSheetTypes(List<String> restrictToFactSheetTypes) {
    this.restrictToFactSheetTypes = restrictToFactSheetTypes;
    return this;
  }

  public SubscriptionRole addRestrictToFactSheetTypesItem(String restrictToFactSheetTypesItem) {
    this.restrictToFactSheetTypes.add(restrictToFactSheetTypesItem);
    return this;
  }

   /**
   * Get restrictToFactSheetTypes
   * @return restrictToFactSheetTypes
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRestrictToFactSheetTypes() {
    return restrictToFactSheetTypes;
  }

  public void setRestrictToFactSheetTypes(List<String> restrictToFactSheetTypes) {
    this.restrictToFactSheetTypes = restrictToFactSheetTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionRole subscriptionRole = (SubscriptionRole) o;
    return Objects.equals(this.name, subscriptionRole.name) &&
        Objects.equals(this.subscriptionType, subscriptionRole.subscriptionType) &&
        Objects.equals(this.restrictToFactSheetTypes, subscriptionRole.restrictToFactSheetTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, subscriptionType, restrictToFactSheetTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionRole {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
    sb.append("    restrictToFactSheetTypes: ").append(toIndentedString(restrictToFactSheetTypes)).append("\n");
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
