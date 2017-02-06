package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ConfigTypeOnOffWithTime   {
  
  private Boolean enabled = false;
  private Long value = null;


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
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private UnitEnum unit = null;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }

  
  /**
   **/
  public ConfigTypeOnOffWithTime value(Long value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public Long getValue() {
    return value;
  }
  public void setValue(Long value) {
    this.value = value;
  }

  
  /**
   **/
  public ConfigTypeOnOffWithTime unit(UnitEnum unit) {
    this.unit = unit;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("unit")
  public UnitEnum getUnit() {
    return unit;
  }
  public void setUnit(UnitEnum unit) {
    this.unit = unit;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigTypeOnOffWithTime configTypeOnOffWithTime = (ConfigTypeOnOffWithTime) o;
    return Objects.equals(this.enabled, configTypeOnOffWithTime.enabled) &&
        Objects.equals(this.value, configTypeOnOffWithTime.value) &&
        Objects.equals(this.unit, configTypeOnOffWithTime.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, value, unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigTypeOnOffWithTime {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

