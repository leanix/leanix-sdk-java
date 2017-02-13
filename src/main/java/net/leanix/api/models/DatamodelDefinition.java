/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.9-SNAPSHOT
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.CustomValidator;
import net.leanix.api.models.EffectiveRelationDefinition;
import net.leanix.api.models.ExternalIdFieldDefinition;
import net.leanix.api.models.FactSheetDefinition;
import net.leanix.api.models.Fs2FsRelationDefinition;
import net.leanix.api.models.RulesDefinition;

/**
 * DatamodelDefinition
 */

public class DatamodelDefinition {
  @JsonProperty("factSheets")
  private Map<String, FactSheetDefinition> factSheets = new HashMap<String, FactSheetDefinition>();

  @JsonProperty("relations")
  private Map<String, Fs2FsRelationDefinition> relations = new HashMap<String, Fs2FsRelationDefinition>();

  @JsonProperty("validators")
  private Map<String, CustomValidator> validators = new HashMap<String, CustomValidator>();

  @JsonProperty("externalIdFields")
  private Map<String, ExternalIdFieldDefinition> externalIdFields = new HashMap<String, ExternalIdFieldDefinition>();

  @JsonProperty("rules")
  private RulesDefinition rules = null;

  @JsonProperty("relationMapping")
  private Map<String, EffectiveRelationDefinition> relationMapping = new HashMap<String, EffectiveRelationDefinition>();

  public DatamodelDefinition factSheets(Map<String, FactSheetDefinition> factSheets) {
    this.factSheets = factSheets;
    return this;
  }

  public DatamodelDefinition putFactSheetsItem(String key, FactSheetDefinition factSheetsItem) {
    this.factSheets.put(key, factSheetsItem);
    return this;
  }

   /**
   * Get factSheets
   * @return factSheets
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, FactSheetDefinition> getFactSheets() {
    return factSheets;
  }

  public void setFactSheets(Map<String, FactSheetDefinition> factSheets) {
    this.factSheets = factSheets;
  }

  public DatamodelDefinition relations(Map<String, Fs2FsRelationDefinition> relations) {
    this.relations = relations;
    return this;
  }

  public DatamodelDefinition putRelationsItem(String key, Fs2FsRelationDefinition relationsItem) {
    this.relations.put(key, relationsItem);
    return this;
  }

   /**
   * Get relations
   * @return relations
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, Fs2FsRelationDefinition> getRelations() {
    return relations;
  }

  public void setRelations(Map<String, Fs2FsRelationDefinition> relations) {
    this.relations = relations;
  }

  public DatamodelDefinition validators(Map<String, CustomValidator> validators) {
    this.validators = validators;
    return this;
  }

  public DatamodelDefinition putValidatorsItem(String key, CustomValidator validatorsItem) {
    this.validators.put(key, validatorsItem);
    return this;
  }

   /**
   * Get validators
   * @return validators
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, CustomValidator> getValidators() {
    return validators;
  }

  public void setValidators(Map<String, CustomValidator> validators) {
    this.validators = validators;
  }

  public DatamodelDefinition externalIdFields(Map<String, ExternalIdFieldDefinition> externalIdFields) {
    this.externalIdFields = externalIdFields;
    return this;
  }

  public DatamodelDefinition putExternalIdFieldsItem(String key, ExternalIdFieldDefinition externalIdFieldsItem) {
    this.externalIdFields.put(key, externalIdFieldsItem);
    return this;
  }

   /**
   * Get externalIdFields
   * @return externalIdFields
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, ExternalIdFieldDefinition> getExternalIdFields() {
    return externalIdFields;
  }

  public void setExternalIdFields(Map<String, ExternalIdFieldDefinition> externalIdFields) {
    this.externalIdFields = externalIdFields;
  }

  public DatamodelDefinition rules(RulesDefinition rules) {
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @ApiModelProperty(example = "null", value = "")
  public RulesDefinition getRules() {
    return rules;
  }

  public void setRules(RulesDefinition rules) {
    this.rules = rules;
  }

  public DatamodelDefinition relationMapping(Map<String, EffectiveRelationDefinition> relationMapping) {
    this.relationMapping = relationMapping;
    return this;
  }

  public DatamodelDefinition putRelationMappingItem(String key, EffectiveRelationDefinition relationMappingItem) {
    this.relationMapping.put(key, relationMappingItem);
    return this;
  }

   /**
   * Get relationMapping
   * @return relationMapping
  **/
  @ApiModelProperty(example = "null", value = "")
  public Map<String, EffectiveRelationDefinition> getRelationMapping() {
    return relationMapping;
  }

  public void setRelationMapping(Map<String, EffectiveRelationDefinition> relationMapping) {
    this.relationMapping = relationMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatamodelDefinition datamodelDefinition = (DatamodelDefinition) o;
    return Objects.equals(this.factSheets, datamodelDefinition.factSheets) &&
        Objects.equals(this.relations, datamodelDefinition.relations) &&
        Objects.equals(this.validators, datamodelDefinition.validators) &&
        Objects.equals(this.externalIdFields, datamodelDefinition.externalIdFields) &&
        Objects.equals(this.rules, datamodelDefinition.rules) &&
        Objects.equals(this.relationMapping, datamodelDefinition.relationMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factSheets, relations, validators, externalIdFields, rules, relationMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatamodelDefinition {\n");
    
    sb.append("    factSheets: ").append(toIndentedString(factSheets)).append("\n");
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    externalIdFields: ").append(toIndentedString(externalIdFields)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    relationMapping: ").append(toIndentedString(relationMapping)).append("\n");
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

