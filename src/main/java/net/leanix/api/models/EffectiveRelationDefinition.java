package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class EffectiveRelationDefinition   {
  


  public enum DirectionEnum {
    FORWARD("FORWARD"),
    REVERSE("REVERSE");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DirectionEnum direction = null;
  private String reverseName = null;
  private String persistedName = null;

  
  /**
   **/
  public EffectiveRelationDefinition direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }

  
  /**
   **/
  public EffectiveRelationDefinition reverseName(String reverseName) {
    this.reverseName = reverseName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reverseName")
  public String getReverseName() {
    return reverseName;
  }
  public void setReverseName(String reverseName) {
    this.reverseName = reverseName;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("persistedName")
  public String getPersistedName() {
    return persistedName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EffectiveRelationDefinition effectiveRelationDefinition = (EffectiveRelationDefinition) o;
    return Objects.equals(this.direction, effectiveRelationDefinition.direction) &&
        Objects.equals(this.reverseName, effectiveRelationDefinition.reverseName) &&
        Objects.equals(this.persistedName, effectiveRelationDefinition.persistedName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(direction, reverseName, persistedName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EffectiveRelationDefinition {\n");
    
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    reverseName: ").append(toIndentedString(reverseName)).append("\n");
    sb.append("    persistedName: ").append(toIndentedString(persistedName)).append("\n");
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

