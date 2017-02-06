package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ComponentConfiguration   {
  
  private String separator = null;


  public enum OperationEnum {
    APPEND("APPEND"),
    PREPEND("PREPEND");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private OperationEnum operation = null;
  private String relation = null;
  private String field = null;

  
  /**
   **/
  public ComponentConfiguration separator(String separator) {
    this.separator = separator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("separator")
  public String getSeparator() {
    return separator;
  }
  public void setSeparator(String separator) {
    this.separator = separator;
  }

  
  /**
   **/
  public ComponentConfiguration operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }

  
  /**
   **/
  public ComponentConfiguration relation(String relation) {
    this.relation = relation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relation")
  public String getRelation() {
    return relation;
  }
  public void setRelation(String relation) {
    this.relation = relation;
  }

  
  /**
   **/
  public ComponentConfiguration field(String field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComponentConfiguration componentConfiguration = (ComponentConfiguration) o;
    return Objects.equals(this.separator, componentConfiguration.separator) &&
        Objects.equals(this.operation, componentConfiguration.operation) &&
        Objects.equals(this.relation, componentConfiguration.relation) &&
        Objects.equals(this.field, componentConfiguration.field);
  }

  @Override
  public int hashCode() {
    return Objects.hash(separator, operation, relation, field);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComponentConfiguration {\n");
    
    sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
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

