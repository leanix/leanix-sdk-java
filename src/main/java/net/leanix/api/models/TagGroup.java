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
 * TagGroup
 */

public class TagGroup {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("shortName")
  private String shortName = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("mandatory")
  private Boolean mandatory = false;

  /**
   * Gets or Sets mode
   */
  public enum ModeEnum {
    SINGLE("SINGLE"),
    
    MULTIPLE("MULTIPLE");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String text) {
      for (ModeEnum b : ModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("mode")
  private ModeEnum mode = null;

  @JsonProperty("restrictToFactSheetTypes")
  private List<String> restrictToFactSheetTypes = new ArrayList<String>();

  public TagGroup id(UUID id) {
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

  public TagGroup name(String name) {
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

  public TagGroup shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public TagGroup description(String description) {
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

  public TagGroup mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Get mandatory
   * @return mandatory
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }

  public TagGroup mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public TagGroup restrictToFactSheetTypes(List<String> restrictToFactSheetTypes) {
    this.restrictToFactSheetTypes = restrictToFactSheetTypes;
    return this;
  }

  public TagGroup addRestrictToFactSheetTypesItem(String restrictToFactSheetTypesItem) {
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
    TagGroup tagGroup = (TagGroup) o;
    return Objects.equals(this.id, tagGroup.id) &&
        Objects.equals(this.name, tagGroup.name) &&
        Objects.equals(this.shortName, tagGroup.shortName) &&
        Objects.equals(this.description, tagGroup.description) &&
        Objects.equals(this.mandatory, tagGroup.mandatory) &&
        Objects.equals(this.mode, tagGroup.mode) &&
        Objects.equals(this.restrictToFactSheetTypes, tagGroup.restrictToFactSheetTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortName, description, mandatory, mode, restrictToFactSheetTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagGroup {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

