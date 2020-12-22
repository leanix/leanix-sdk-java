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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.MetaFieldValue;
import net.leanix.api.models.MetaItemTranslation;

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

  @JsonProperty("visible")
  private Boolean visible = false;

  @JsonProperty("quickSearch")
  private Boolean quickSearch = false;

  @JsonProperty("fullTextSearch")
  private Boolean fullTextSearch = false;

  @JsonProperty("inFacet")
  private Boolean inFacet = false;

  @JsonProperty("inView")
  private Boolean inView = false;

  @JsonProperty("renderType")
  private String renderType = null;

  @JsonProperty("readOnly")
  private Boolean readOnly = false;

  @JsonProperty("size")
  private Integer size = null;

  @JsonProperty("metadata")
  private Object metadata = null;

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

  public MetaField visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  public MetaField quickSearch(Boolean quickSearch) {
    this.quickSearch = quickSearch;
    return this;
  }

   /**
   * Get quickSearch
   * @return quickSearch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getQuickSearch() {
    return quickSearch;
  }

  public void setQuickSearch(Boolean quickSearch) {
    this.quickSearch = quickSearch;
  }

  public MetaField fullTextSearch(Boolean fullTextSearch) {
    this.fullTextSearch = fullTextSearch;
    return this;
  }

   /**
   * Get fullTextSearch
   * @return fullTextSearch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFullTextSearch() {
    return fullTextSearch;
  }

  public void setFullTextSearch(Boolean fullTextSearch) {
    this.fullTextSearch = fullTextSearch;
  }

  public MetaField inFacet(Boolean inFacet) {
    this.inFacet = inFacet;
    return this;
  }

   /**
   * Get inFacet
   * @return inFacet
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInFacet() {
    return inFacet;
  }

  public void setInFacet(Boolean inFacet) {
    this.inFacet = inFacet;
  }

  public MetaField inView(Boolean inView) {
    this.inView = inView;
    return this;
  }

   /**
   * Get inView
   * @return inView
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInView() {
    return inView;
  }

  public void setInView(Boolean inView) {
    this.inView = inView;
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

  public MetaField readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public MetaField size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public MetaField metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(example = "null", value = "")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
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
        Objects.equals(this.visible, metaField.visible) &&
        Objects.equals(this.quickSearch, metaField.quickSearch) &&
        Objects.equals(this.fullTextSearch, metaField.fullTextSearch) &&
        Objects.equals(this.inFacet, metaField.inFacet) &&
        Objects.equals(this.inView, metaField.inView) &&
        Objects.equals(this.renderType, metaField.renderType) &&
        Objects.equals(this.readOnly, metaField.readOnly) &&
        Objects.equals(this.size, metaField.size) &&
        Objects.equals(this.metadata, metaField.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, type, values, translations, visible, quickSearch, fullTextSearch, inFacet, inView, renderType, readOnly, size, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaField {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    inFacet: ").append(toIndentedString(inFacet)).append("\n");
    sb.append("    inView: ").append(toIndentedString(inView)).append("\n");
    sb.append("    renderType: ").append(toIndentedString(renderType)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

