/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.170
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * LxField
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", visible = true )
@JsonSubTypes({
  @JsonSubTypes.Type(value = StringValue.class, name = "StringValue"),
  @JsonSubTypes.Type(value = Lifecycle.class, name = "Lifecycle"),
  @JsonSubTypes.Type(value = ProjectStatusProgress.class, name = "ProjectStatusProgress"),
  @JsonSubTypes.Type(value = SingleSelect.class, name = "SingleSelect"),
  @JsonSubTypes.Type(value = MultipleSelect.class, name = "MultipleSelect"),
  @JsonSubTypes.Type(value = DateValue.class, name = "DateValue"),
  @JsonSubTypes.Type(value = DoubleValue.class, name = "DoubleValue"),
  @JsonSubTypes.Type(value = ExternalId.class, name = "ExternalId"),
  @JsonSubTypes.Type(value = IntegerValue.class, name = "IntegerValue"),
  @JsonSubTypes.Type(value = Location.class, name = "Location"),
})

public class LxField {
  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    STRINGVALUE("StringValue"),
    
    INTEGERVALUE("IntegerValue"),
    
    DOUBLEVALUE("DoubleValue"),
    
    DATEVALUE("DateValue"),
    
    SINGLESELECT("SingleSelect"),
    
    CLASSIFICATION("Classification"),
    
    LOCATION("Location"),
    
    LIFECYCLE("Lifecycle"),
    
    EXTERNALID("ExternalId"),
    
    MULTIPLESELECT("MultipleSelect"),
    
    PROJECTSTATUSPROGRESS("ProjectStatusProgress");

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

  public LxField type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LxField lxField = (LxField) o;
    return Objects.equals(this.type, lxField.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LxField {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

