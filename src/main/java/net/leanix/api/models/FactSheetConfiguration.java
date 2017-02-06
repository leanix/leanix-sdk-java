package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.ConfigTypeOnOffWithTime;






public class FactSheetConfiguration   {
  
  private ConfigTypeOnOffWithTime qualitySeal = null;

  
  /**
   **/
  public FactSheetConfiguration qualitySeal(ConfigTypeOnOffWithTime qualitySeal) {
    this.qualitySeal = qualitySeal;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qualitySeal")
  public ConfigTypeOnOffWithTime getQualitySeal() {
    return qualitySeal;
  }
  public void setQualitySeal(ConfigTypeOnOffWithTime qualitySeal) {
    this.qualitySeal = qualitySeal;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetConfiguration factSheetConfiguration = (FactSheetConfiguration) o;
    return Objects.equals(this.qualitySeal, factSheetConfiguration.qualitySeal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qualitySeal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetConfiguration {\n");
    
    sb.append("    qualitySeal: ").append(toIndentedString(qualitySeal)).append("\n");
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

