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
import net.leanix.api.models.MetaField;
import net.leanix.api.models.MetaItemTranslation;
import net.leanix.api.models.MetaRelationDefinition;

/**
 * MetaSubsection
 */

public class MetaSubsection {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("weight")
  private Double weight = null;

  @JsonProperty("visible")
  private Boolean visible = false;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FIELD("FIELD"),
    
    RELATION("RELATION"),
    
    RELATION_DIAGRAM("RELATION_DIAGRAM"),
    
    PROJECT_STATUS("PROJECT_STATUS"),
    
    PROPERTIES("PROPERTIES"),
    
    FS_REFERENCES("FS_REFERENCES");

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

  @JsonProperty("translations")
  private Map<String, MetaItemTranslation> translations = new HashMap<String, MetaItemTranslation>();

  @JsonProperty("fields")
  private List<MetaField> fields = new ArrayList<MetaField>();

  @JsonProperty("from")
  private MetaRelationDefinition from = null;

  @JsonProperty("to")
  private MetaRelationDefinition to = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets direction
   */
  public enum DirectionEnum {
    FORWARD("FORWARD"),
    
    REVERSE("REVERSE");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("direction")
  private DirectionEnum direction = null;

  public MetaSubsection key(String key) {
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

  public MetaSubsection weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public MetaSubsection visible(Boolean visible) {
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

  public MetaSubsection type(TypeEnum type) {
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

  public MetaSubsection translations(Map<String, MetaItemTranslation> translations) {
    this.translations = translations;
    return this;
  }

  public MetaSubsection putTranslationsItem(String key, MetaItemTranslation translationsItem) {
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

  public MetaSubsection fields(List<MetaField> fields) {
    this.fields = fields;
    return this;
  }

  public MetaSubsection addFieldsItem(MetaField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MetaField> getFields() {
    return fields;
  }

  public void setFields(List<MetaField> fields) {
    this.fields = fields;
  }

  public MetaSubsection from(MetaRelationDefinition from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "")
  public MetaRelationDefinition getFrom() {
    return from;
  }

  public void setFrom(MetaRelationDefinition from) {
    this.from = from;
  }

  public MetaSubsection to(MetaRelationDefinition to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "")
  public MetaRelationDefinition getTo() {
    return to;
  }

  public void setTo(MetaRelationDefinition to) {
    this.to = to;
  }

  public MetaSubsection name(String name) {
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

  public MetaSubsection direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @ApiModelProperty(example = "null", value = "")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaSubsection metaSubsection = (MetaSubsection) o;
    return Objects.equals(this.key, metaSubsection.key) &&
        Objects.equals(this.weight, metaSubsection.weight) &&
        Objects.equals(this.visible, metaSubsection.visible) &&
        Objects.equals(this.type, metaSubsection.type) &&
        Objects.equals(this.translations, metaSubsection.translations) &&
        Objects.equals(this.fields, metaSubsection.fields) &&
        Objects.equals(this.from, metaSubsection.from) &&
        Objects.equals(this.to, metaSubsection.to) &&
        Objects.equals(this.name, metaSubsection.name) &&
        Objects.equals(this.direction, metaSubsection.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, weight, visible, type, translations, fields, from, to, name, direction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaSubsection {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    translations: ").append(toIndentedString(translations)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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

