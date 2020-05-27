/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.174
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * MetaField
 */

public class MetaField {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("values")
  private List<MetaFieldValue> values = new ArrayList<MetaFieldValue>();

  @JsonProperty("translations")
  private Map<String, MetaItemTranslation> translations = new HashMap<String, MetaItemTranslation>();

  @JsonProperty("renderType")
  private String renderType = null;

  public MetaField key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Get key
   * @return key
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public MetaField type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MetaField values(List<MetaFieldValue> values) {
    this.values = values;
    return this;
  }

  public MetaField addValuesItem(MetaFieldValue valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<MetaFieldValue> getValues() {
    return values;
  }

  public void setValues(List<MetaFieldValue> values) {
    this.values = values;
  }

  public MetaField translations(Map<String, MetaItemTranslation> translations) {
    this.translations = translations;
    return this;
  }

  public MetaField putTranslationsItem(String key, MetaItemTranslation translationsItem) {
    this.translations.put(key, translationsItem);
    return this;
  }

  /**
   * Get translations
   * @return translations
   **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, MetaItemTranslation> getTranslations() {
    return translations;
  }

  public void setTranslations(Map<String, MetaItemTranslation> translations) {
    this.translations = translations;
  }

  public MetaField renderType(String renderType) {
    this.renderType = renderType;
    return this;
  }

  /**
   * Get renderType
   * @return renderType
   **/
  @ApiModelProperty(example = "null", value = "")
  public String getRenderType() {
    return renderType;
  }

  public void setRenderType(String renderType) {
    this.renderType = renderType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaField metaField = (MetaField) o;
    return Objects.equals(this.key, metaField.key) &&
        Objects.equals(this.type, metaField.type) &&
        Objects.equals(this.values, metaField.values) &&
        Objects.equals(this.translations, metaField.translations) &&
        Objects.equals(this.renderType, metaField.renderType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, values, translations, renderType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaField {\n");

    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    renderType: ").append(toIndentedString(renderType)).append("\n");
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

