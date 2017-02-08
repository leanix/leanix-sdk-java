/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
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
import net.leanix.api.models.DataType;
import net.leanix.api.models.FactSheetConfiguration;

/**
 * FactSheetDefinition
 */

public class FactSheetDefinition {
  @JsonProperty("relations")
  private List<String> relations = new ArrayList<String>();

  @JsonProperty("config")
  private FactSheetConfiguration config = null;

  @JsonProperty("fields")
  private Map<String, DataType> fields = new HashMap<String, DataType>();

  public FactSheetDefinition relations(List<String> relations) {
    this.relations = relations;
    return this;
  }

  public FactSheetDefinition addRelationsItem(String relationsItem) {
    this.relations.add(relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRelations() {
    return relations;
  }

  public void setRelations(List<String> relations) {
    this.relations = relations;
  }

  public FactSheetDefinition config(FactSheetConfiguration config) {
    this.config = config;
    return this;
  }

   /**
   * Get config
   * @return config
  **/
  @ApiModelProperty(example = "null", value = "")
  public FactSheetConfiguration getConfig() {
    return config;
  }

  public void setConfig(FactSheetConfiguration config) {
    this.config = config;
  }

  public FactSheetDefinition fields(Map<String, DataType> fields) {
    this.fields = fields;
    return this;
  }

  public FactSheetDefinition putFieldsItem(String key, DataType fieldsItem) {
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, DataType> getFields() {
    return fields;
  }

  public void setFields(Map<String, DataType> fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetDefinition factSheetDefinition = (FactSheetDefinition) o;
    return Objects.equals(this.relations, factSheetDefinition.relations) &&
        Objects.equals(this.config, factSheetDefinition.config) &&
        Objects.equals(this.fields, factSheetDefinition.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relations, config, fields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetDefinition {\n");
    
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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

