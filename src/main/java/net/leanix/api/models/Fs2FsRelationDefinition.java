package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.DataType;
import net.leanix.api.models.FromAndToDefinition;






public class Fs2FsRelationDefinition   {
  
  private FromAndToDefinition from = null;
  private FromAndToDefinition to = null;
  private List<String> constrainingRelations = new ArrayList<String>();


  public enum ConstraintsEnum {
    TYPE_EQUAL("TYPE_EQUAL"),
    CYCLES_ALLOWED("CYCLES_ALLOWED"),
    FACT_SHEET_UNIQUE_LAX("FACT_SHEET_UNIQUE_LAX");

    private String value;

    ConstraintsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<ConstraintsEnum> constraints = new ArrayList<ConstraintsEnum>();
  private Map<String, DataType> fields = new HashMap<String, DataType>();

  
  /**
   **/
  public Fs2FsRelationDefinition from(FromAndToDefinition from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("from")
  public FromAndToDefinition getFrom() {
    return from;
  }
  public void setFrom(FromAndToDefinition from) {
    this.from = from;
  }

  
  /**
   **/
  public Fs2FsRelationDefinition to(FromAndToDefinition to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("to")
  public FromAndToDefinition getTo() {
    return to;
  }
  public void setTo(FromAndToDefinition to) {
    this.to = to;
  }

  
  /**
   **/
  public Fs2FsRelationDefinition constrainingRelations(List<String> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("constrainingRelations")
  public List<String> getConstrainingRelations() {
    return constrainingRelations;
  }
  public void setConstrainingRelations(List<String> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
  }

  
  /**
   **/
  public Fs2FsRelationDefinition constraints(List<ConstraintsEnum> constraints) {
    this.constraints = constraints;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("constraints")
  public List<ConstraintsEnum> getConstraints() {
    return constraints;
  }
  public void setConstraints(List<ConstraintsEnum> constraints) {
    this.constraints = constraints;
  }

  
  /**
   **/
  public Fs2FsRelationDefinition fields(Map<String, DataType> fields) {
    this.fields = fields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fields")
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
    Fs2FsRelationDefinition fs2FsRelationDefinition = (Fs2FsRelationDefinition) o;
    return Objects.equals(this.from, fs2FsRelationDefinition.from) &&
        Objects.equals(this.to, fs2FsRelationDefinition.to) &&
        Objects.equals(this.constrainingRelations, fs2FsRelationDefinition.constrainingRelations) &&
        Objects.equals(this.constraints, fs2FsRelationDefinition.constraints) &&
        Objects.equals(this.fields, fs2FsRelationDefinition.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, constrainingRelations, constraints, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Fs2FsRelationDefinition {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    constrainingRelations: ").append(toIndentedString(constrainingRelations)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

