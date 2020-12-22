/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
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

/**
 * TagSettings
 */

public class TagSettings {
  /**
   * Gets or Sets taggingMode
   */
  public enum TaggingModeEnum {
    ON_THE_FLY("ON_THE_FLY"),
    
    PRE_DEFINED_ONLY("PRE_DEFINED_ONLY"),
    
    PRE_DEFINED_OR_ON_THE_FLY("PRE_DEFINED_OR_ON_THE_FLY");

    private String value;

    TaggingModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaggingModeEnum fromValue(String text) {
      for (TaggingModeEnum b : TaggingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("taggingMode")
  private TaggingModeEnum taggingMode = null;

  public TagSettings taggingMode(TaggingModeEnum taggingMode) {
    this.taggingMode = taggingMode;
    return this;
  }

   /**
   * Get taggingMode
   * @return taggingMode
  **/
  @ApiModelProperty(example = "null", value = "")
  public TaggingModeEnum getTaggingMode() {
    return taggingMode;
  }

  public void setTaggingMode(TaggingModeEnum taggingMode) {
    this.taggingMode = taggingMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagSettings tagSettings = (TagSettings) o;
    return Objects.equals(this.taggingMode, tagSettings.taggingMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taggingMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagSettings {\n");
    
    sb.append("    taggingMode: ").append(toIndentedString(taggingMode)).append("\n");
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

