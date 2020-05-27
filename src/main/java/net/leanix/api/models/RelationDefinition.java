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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * RelationDefinition
 */

public class RelationDefinition {
  @JsonProperty("from")
  private FromAndToDefinition from = null;

  @JsonProperty("to")
  private FromAndToDefinition to = null;

  @JsonProperty("fields")
  private Map<String, DataType> fields = new HashMap<String, DataType>();

  @JsonProperty("constrainingRelations")
  private List<String> constrainingRelations = new ArrayList<String>();

  /**
   * Gets or Sets constraints
   */
  public enum ConstraintsEnum {
    TYPE_EQUAL("TYPE_EQUAL"),
    
    CYCLES_ALLOWED("CYCLES_ALLOWED"),
    
    FACT_SHEET_UNIQUE_LAX("FACT_SHEET_UNIQUE_LAX");

    private String value;

    ConstraintsEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConstraintsEnum fromValue(String text) {
      for (ConstraintsEnum b : ConstraintsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("constraints")
  private List<ConstraintsEnum> constraints = new ArrayList<ConstraintsEnum>();

  public RelationDefinition from(FromAndToDefinition from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "")
  public FromAndToDefinition getFrom() {
    return from;
  }

  public void setFrom(FromAndToDefinition from) {
    this.from = from;
  }

  public RelationDefinition to(FromAndToDefinition to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "")
  public FromAndToDefinition getTo() {
    return to;
  }

  public void setTo(FromAndToDefinition to) {
    this.to = to;
  }

  public RelationDefinition fields(Map<String, DataType> fields) {
    this.fields = fields;
    return this;
  }

  public RelationDefinition putFieldsItem(String key, DataType fieldsItem) {
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

  public RelationDefinition constrainingRelations(List<String> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
    return this;
  }

  public RelationDefinition addConstrainingRelationsItem(String constrainingRelationsItem) {
    this.constrainingRelations.add(constrainingRelationsItem);
    return this;
  }

   /**
   * Get constrainingRelations
   * @return constrainingRelations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getConstrainingRelations() {
    return constrainingRelations;
  }

  public void setConstrainingRelations(List<String> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
  }

  public RelationDefinition constraints(List<ConstraintsEnum> constraints) {
    this.constraints = constraints;
    return this;
  }

  public RelationDefinition addConstraintsItem(ConstraintsEnum constraintsItem) {
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ConstraintsEnum> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<ConstraintsEnum> constraints) {
    this.constraints = constraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationDefinition relationDefinition = (RelationDefinition) o;
    return Objects.equals(this.from, relationDefinition.from) &&
        Objects.equals(this.to, relationDefinition.to) &&
        Objects.equals(this.fields, relationDefinition.fields) &&
        Objects.equals(this.constrainingRelations, relationDefinition.constrainingRelations) &&
        Objects.equals(this.constraints, relationDefinition.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, fields, constrainingRelations, constraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationDefinition {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    constrainingRelations: ").append(toIndentedString(constrainingRelations)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

