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

/**
 * StructuredNode
 */

public class StructuredNode {
  @JsonProperty("inputNode")
  private String inputNode = null;

  @JsonProperty("factSheetType")
  private String factSheetType = null;

  @JsonProperty("relation")
  private String relation = null;

  @JsonProperty("effectiveRelation")
  private String effectiveRelation = null;

  @JsonProperty("section")
  private String section = null;

  @JsonProperty("subsection")
  private String subsection = null;

  @JsonProperty("field")
  private String field = null;

  @JsonProperty("fieldValue")
  private String fieldValue = null;

  /**
   * Gets or Sets nodeType
   */
  public enum NodeTypeEnum {
    FACT_SHEET_TYPE_NODE("FACT_SHEET_TYPE_NODE"),
    
    SECTION_NODE("SECTION_NODE"),
    
    SUBSECTION_NODE("SUBSECTION_NODE"),
    
    FIELD_NODE("FIELD_NODE"),
    
    FIELD_VALUE_NODE("FIELD_VALUE_NODE");

    private String value;

    NodeTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NodeTypeEnum fromValue(String text) {
      for (NodeTypeEnum b : NodeTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nodeType")
  private NodeTypeEnum nodeType = null;

  @JsonProperty("subsectionRelation")
  private Boolean subsectionRelation = false;

  public StructuredNode inputNode(String inputNode) {
    this.inputNode = inputNode;
    return this;
  }

   /**
   * Get inputNode
   * @return inputNode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInputNode() {
    return inputNode;
  }

  public void setInputNode(String inputNode) {
    this.inputNode = inputNode;
  }

  public StructuredNode factSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
    return this;
  }

   /**
   * Get factSheetType
   * @return factSheetType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFactSheetType() {
    return factSheetType;
  }

  public void setFactSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
  }

  public StructuredNode relation(String relation) {
    this.relation = relation;
    return this;
  }

   /**
   * Get relation
   * @return relation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRelation() {
    return relation;
  }

  public void setRelation(String relation) {
    this.relation = relation;
  }

  public StructuredNode effectiveRelation(String effectiveRelation) {
    this.effectiveRelation = effectiveRelation;
    return this;
  }

   /**
   * Get effectiveRelation
   * @return effectiveRelation
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEffectiveRelation() {
    return effectiveRelation;
  }

  public void setEffectiveRelation(String effectiveRelation) {
    this.effectiveRelation = effectiveRelation;
  }

  public StructuredNode section(String section) {
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public StructuredNode subsection(String subsection) {
    this.subsection = subsection;
    return this;
  }

   /**
   * Get subsection
   * @return subsection
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubsection() {
    return subsection;
  }

  public void setSubsection(String subsection) {
    this.subsection = subsection;
  }

  public StructuredNode field(String field) {
    this.field = field;
    return this;
  }

   /**
   * Get field
   * @return field
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public StructuredNode fieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
    return this;
  }

   /**
   * Get fieldValue
   * @return fieldValue
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFieldValue() {
    return fieldValue;
  }

  public void setFieldValue(String fieldValue) {
    this.fieldValue = fieldValue;
  }

  public StructuredNode nodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public NodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(NodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public StructuredNode subsectionRelation(Boolean subsectionRelation) {
    this.subsectionRelation = subsectionRelation;
    return this;
  }

   /**
   * Get subsectionRelation
   * @return subsectionRelation
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSubsectionRelation() {
    return subsectionRelation;
  }

  public void setSubsectionRelation(Boolean subsectionRelation) {
    this.subsectionRelation = subsectionRelation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StructuredNode structuredNode = (StructuredNode) o;
    return Objects.equals(this.inputNode, structuredNode.inputNode) &&
        Objects.equals(this.factSheetType, structuredNode.factSheetType) &&
        Objects.equals(this.relation, structuredNode.relation) &&
        Objects.equals(this.effectiveRelation, structuredNode.effectiveRelation) &&
        Objects.equals(this.section, structuredNode.section) &&
        Objects.equals(this.subsection, structuredNode.subsection) &&
        Objects.equals(this.field, structuredNode.field) &&
        Objects.equals(this.fieldValue, structuredNode.fieldValue) &&
        Objects.equals(this.nodeType, structuredNode.nodeType) &&
        Objects.equals(this.subsectionRelation, structuredNode.subsectionRelation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inputNode, factSheetType, relation, effectiveRelation, section, subsection, field, fieldValue, nodeType, subsectionRelation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StructuredNode {\n");
    
    sb.append("    inputNode: ").append(toIndentedString(inputNode)).append("\n");
    sb.append("    factSheetType: ").append(toIndentedString(factSheetType)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    effectiveRelation: ").append(toIndentedString(effectiveRelation)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    subsection: ").append(toIndentedString(subsection)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldValue: ").append(toIndentedString(fieldValue)).append("\n");
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    subsectionRelation: ").append(toIndentedString(subsectionRelation)).append("\n");
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

