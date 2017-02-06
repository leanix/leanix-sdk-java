package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class FromAndToDefinition   {
  
  private String factSheetType = null;


  public enum MultiplicityEnum {
    SINGLE("SINGLE"),
    MULTI("MULTI");

    private String value;

    MultiplicityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private MultiplicityEnum multiplicity = null;
  private String name = null;

  
  /**
   **/
  public FromAndToDefinition factSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetType")
  public String getFactSheetType() {
    return factSheetType;
  }
  public void setFactSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
  }

  
  /**
   **/
  public FromAndToDefinition multiplicity(MultiplicityEnum multiplicity) {
    this.multiplicity = multiplicity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("multiplicity")
  public MultiplicityEnum getMultiplicity() {
    return multiplicity;
  }
  public void setMultiplicity(MultiplicityEnum multiplicity) {
    this.multiplicity = multiplicity;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FromAndToDefinition fromAndToDefinition = (FromAndToDefinition) o;
    return Objects.equals(this.factSheetType, fromAndToDefinition.factSheetType) &&
        Objects.equals(this.multiplicity, fromAndToDefinition.multiplicity) &&
        Objects.equals(this.name, fromAndToDefinition.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factSheetType, multiplicity, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FromAndToDefinition {\n");
    
    sb.append("    factSheetType: ").append(toIndentedString(factSheetType)).append("\n");
    sb.append("    multiplicity: ").append(toIndentedString(multiplicity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

