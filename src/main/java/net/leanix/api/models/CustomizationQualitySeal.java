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
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CustomizationQualitySeal
 */

public class CustomizationQualitySeal {
  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("value")
  private Long value = null;

  /**
   * Gets or Sets unit
   */
  public enum UnitEnum {
    NANOSECONDS("NANOSECONDS"),
    
    MICROSECONDS("MICROSECONDS"),
    
    MILLISECONDS("MILLISECONDS"),
    
    SECONDS("SECONDS"),
    
    MINUTES("MINUTES"),
    
    HOURS("HOURS"),
    
    DAYS("DAYS");

    private String value;

    UnitEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnitEnum fromValue(String text) {
      for (UnitEnum b : UnitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
            return b;
        }
      }
        return null;
    }
  }

    @JsonProperty("unit")
    private UnitEnum unit = null;

    @JsonProperty("ignoreUpdatesForFields")
    private List<String> ignoreUpdatesForFields = new ArrayList<String>();

    @JsonProperty("ignoreUpdatesForRelations")
    private List<String> ignoreUpdatesForRelations = new ArrayList<String>();

    public CustomizationQualitySeal enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public CustomizationQualitySeal value(Long value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getValue() {
    return value;
  }

  public void setValue(Long value) {
    this.value = value;
  }

  public CustomizationQualitySeal unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
    **/
   @ApiModelProperty(example = "null", value = "")
   public UnitEnum getUnit() {
       return unit;
   }

    public void setUnit(UnitEnum unit) {
        this.unit = unit;
    }

    public CustomizationQualitySeal ignoreUpdatesForFields(List<String> ignoreUpdatesForFields) {
        this.ignoreUpdatesForFields = ignoreUpdatesForFields;
        return this;
    }

    public CustomizationQualitySeal addIgnoreUpdatesForFieldsItem(String ignoreUpdatesForFieldsItem) {
        this.ignoreUpdatesForFields.add(ignoreUpdatesForFieldsItem);
        return this;
    }

    /**
     * Get ignoreUpdatesForFields
     * @return ignoreUpdatesForFields
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<String> getIgnoreUpdatesForFields() {
        return ignoreUpdatesForFields;
    }

    public void setIgnoreUpdatesForFields(List<String> ignoreUpdatesForFields) {
        this.ignoreUpdatesForFields = ignoreUpdatesForFields;
    }

    public CustomizationQualitySeal ignoreUpdatesForRelations(List<String> ignoreUpdatesForRelations) {
        this.ignoreUpdatesForRelations = ignoreUpdatesForRelations;
        return this;
    }

    public CustomizationQualitySeal addIgnoreUpdatesForRelationsItem(String ignoreUpdatesForRelationsItem) {
        this.ignoreUpdatesForRelations.add(ignoreUpdatesForRelationsItem);
        return this;
    }

    /**
     * Get ignoreUpdatesForRelations
     * @return ignoreUpdatesForRelations
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<String> getIgnoreUpdatesForRelations() {
        return ignoreUpdatesForRelations;
    }

    public void setIgnoreUpdatesForRelations(List<String> ignoreUpdatesForRelations) {
        this.ignoreUpdatesForRelations = ignoreUpdatesForRelations;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    CustomizationQualitySeal customizationQualitySeal = (CustomizationQualitySeal) o;
        return Objects.equals(this.enabled, customizationQualitySeal.enabled) &&
            Objects.equals(this.value, customizationQualitySeal.value) &&
            Objects.equals(this.unit, customizationQualitySeal.unit) &&
            Objects.equals(this.ignoreUpdatesForFields, customizationQualitySeal.ignoreUpdatesForFields) &&
            Objects.equals(this.ignoreUpdatesForRelations, customizationQualitySeal.ignoreUpdatesForRelations);
  }

  @Override
  public int hashCode() {
      return Objects.hash(enabled, value, unit, ignoreUpdatesForFields, ignoreUpdatesForRelations);
  }


  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class CustomizationQualitySeal {\n");

      sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
      sb.append("    value: ").append(toIndentedString(value)).append("\n");
      sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
      sb.append("    ignoreUpdatesForFields: ").append(toIndentedString(ignoreUpdatesForFields)).append("\n");
      sb.append("    ignoreUpdatesForRelations: ").append(toIndentedString(ignoreUpdatesForRelations)).append("\n");
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

