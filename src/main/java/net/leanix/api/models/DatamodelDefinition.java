package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
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






public class DatamodelDefinition   {
  
  private Map<String, Fs2FsRelationDefinition> relations = new HashMap<String, Fs2FsRelationDefinition>();
  private Map<String, ExternalIdFieldDefinition> externalIdFields = new HashMap<String, ExternalIdFieldDefinition>();
  private Map<String, FactSheetDefinition> factSheets = new HashMap<String, FactSheetDefinition>();
  private RulesDefinition rules = null;
  private Map<String, EffectiveRelationDefinition> relationMapping = new HashMap<String, EffectiveRelationDefinition>();
  private Map<String, CustomValidator> validators = new HashMap<String, CustomValidator>();

  
  /**
   **/
  public DatamodelDefinition relations(Map<String, Fs2FsRelationDefinition> relations) {
    this.relations = relations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relations")
  public Map<String, Fs2FsRelationDefinition> getRelations() {
    return relations;
  }
  public void setRelations(Map<String, Fs2FsRelationDefinition> relations) {
    this.relations = relations;
  }

  
  /**
   **/
  public DatamodelDefinition externalIdFields(Map<String, ExternalIdFieldDefinition> externalIdFields) {
    this.externalIdFields = externalIdFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("externalIdFields")
  public Map<String, ExternalIdFieldDefinition> getExternalIdFields() {
    return externalIdFields;
  }
  public void setExternalIdFields(Map<String, ExternalIdFieldDefinition> externalIdFields) {
    this.externalIdFields = externalIdFields;
  }

  
  /**
   **/
  public DatamodelDefinition factSheets(Map<String, FactSheetDefinition> factSheets) {
    this.factSheets = factSheets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheets")
  public Map<String, FactSheetDefinition> getFactSheets() {
    return factSheets;
  }
  public void setFactSheets(Map<String, FactSheetDefinition> factSheets) {
    this.factSheets = factSheets;
  }

  
  /**
   **/
  public DatamodelDefinition rules(RulesDefinition rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("rules")
  public RulesDefinition getRules() {
    return rules;
  }
  public void setRules(RulesDefinition rules) {
    this.rules = rules;
  }

  
  /**
   **/
  public DatamodelDefinition relationMapping(Map<String, EffectiveRelationDefinition> relationMapping) {
    this.relationMapping = relationMapping;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relationMapping")
  public Map<String, EffectiveRelationDefinition> getRelationMapping() {
    return relationMapping;
  }
  public void setRelationMapping(Map<String, EffectiveRelationDefinition> relationMapping) {
    this.relationMapping = relationMapping;
  }

  
  /**
   **/
  public DatamodelDefinition validators(Map<String, CustomValidator> validators) {
    this.validators = validators;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validators")
  public Map<String, CustomValidator> getValidators() {
    return validators;
  }
  public void setValidators(Map<String, CustomValidator> validators) {
    this.validators = validators;
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
    return Objects.equals(this.relations, datamodelDefinition.relations) &&
        Objects.equals(this.externalIdFields, datamodelDefinition.externalIdFields) &&
        Objects.equals(this.factSheets, datamodelDefinition.factSheets) &&
        Objects.equals(this.rules, datamodelDefinition.rules) &&
        Objects.equals(this.relationMapping, datamodelDefinition.relationMapping) &&
        Objects.equals(this.validators, datamodelDefinition.validators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(relations, externalIdFields, factSheets, rules, relationMapping, validators);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatamodelDefinition {\n");
    
    sb.append("    relations: ").append(toIndentedString(relations)).append("\n");
    sb.append("    externalIdFields: ").append(toIndentedString(externalIdFields)).append("\n");
    sb.append("    factSheets: ").append(toIndentedString(factSheets)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    relationMapping: ").append(toIndentedString(relationMapping)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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

