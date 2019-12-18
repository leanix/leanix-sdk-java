/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.6-SNAPSHOT
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
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.FactSheetViewModel;

/**
 * ViewModelDefinition
 */

public class ViewModelDefinition {
  @JsonProperty("factSheets")
  private List<FactSheetViewModel> factSheets = new ArrayList<FactSheetViewModel>();

  public ViewModelDefinition factSheets(List<FactSheetViewModel> factSheets) {
    this.factSheets = factSheets;
    return this;
  }

  public ViewModelDefinition addFactSheetsItem(FactSheetViewModel factSheetsItem) {
    this.factSheets.add(factSheetsItem);
    return this;
  }

   /**
   * Get factSheets
   * @return factSheets
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheetViewModel> getFactSheets() {
    return factSheets;
  }

  public void setFactSheets(List<FactSheetViewModel> factSheets) {
    this.factSheets = factSheets;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViewModelDefinition viewModelDefinition = (ViewModelDefinition) o;
    return Objects.equals(this.factSheets, viewModelDefinition.factSheets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factSheets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViewModelDefinition {\n");
    
    sb.append("    factSheets: ").append(toIndentedString(factSheets)).append("\n");
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

