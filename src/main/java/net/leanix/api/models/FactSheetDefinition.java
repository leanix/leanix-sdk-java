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
import net.leanix.api.models.FactSheetConfiguration;






public class FactSheetDefinition   {
  
  private List<String> relations = new ArrayList<String>();
  private FactSheetConfiguration config = null;
  private Map<String, DataType> fields = new HashMap<String, DataType>();

  
  /**
   **/
  public FactSheetDefinition relations(List<String> relations) {
    this.relations = relations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relations")
  public List<String> getRelations() {
    return relations;
  }
  public void setRelations(List<String> relations) {
    this.relations = relations;
  }

  
  /**
   **/
  public FactSheetDefinition config(FactSheetConfiguration config) {
    this.config = config;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("config")
  public FactSheetConfiguration getConfig() {
    return config;
  }
  public void setConfig(FactSheetConfiguration config) {
    this.config = config;
  }

  
  /**
   **/
  public FactSheetDefinition fields(Map<String, DataType> fields) {
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

