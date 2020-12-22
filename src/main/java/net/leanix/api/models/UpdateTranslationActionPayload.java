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
import net.leanix.api.models.UpdateTranslationItem;

/**
 * UpdateTranslationActionPayload
 */

public class UpdateTranslationActionPayload {
  @JsonProperty("translation")
  private UpdateTranslationItem translation = null;

  @JsonProperty("language")
  private String language = null;

  public UpdateTranslationActionPayload translation(UpdateTranslationItem translation) {
    this.translation = translation;
    return this;
  }

   /**
   * Get translation
   * @return translation
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public UpdateTranslationItem getTranslation() {
    return translation;
  }

  public void setTranslation(UpdateTranslationItem translation) {
    this.translation = translation;
  }

  public UpdateTranslationActionPayload language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTranslationActionPayload updateTranslationActionPayload = (UpdateTranslationActionPayload) o;
    return Objects.equals(this.translation, updateTranslationActionPayload.translation) &&
        Objects.equals(this.language, updateTranslationActionPayload.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(translation, language);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTranslationActionPayload {\n");
    
    sb.append("    translation: ").append(toIndentedString(translation)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
