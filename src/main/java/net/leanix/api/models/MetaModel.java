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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * MetaModel
 */

public class MetaModel {

  @JsonProperty("modelInfo")
  private MetaModelInfo modelInfo = null;

  @JsonProperty("factSheetTypes")
  private List<MetaFactSheetType> factSheetTypes = new ArrayList<MetaFactSheetType>();

  public MetaModel modelInfo(MetaModelInfo modelInfo) {
    this.modelInfo = modelInfo;
    return this;
  }

  /**
   * Get modelInfo
   * @return modelInfo
   **/
  @ApiModelProperty(example = "null", value = "")
  public MetaModelInfo getModelInfo() {
    return modelInfo;
  }

  public void setModelInfo(MetaModelInfo modelInfo) {
    this.modelInfo = modelInfo;
  }

  public MetaModel factSheetTypes(List<MetaFactSheetType> factSheetTypes) {
    this.factSheetTypes = factSheetTypes;
    return this;
  }

  public MetaModel addFactSheetTypesItem(MetaFactSheetType factSheetTypesItem) {
    this.factSheetTypes.add(factSheetTypesItem);
    return this;
  }

  /**
   * Get factSheetTypes
   * @return factSheetTypes
   **/
  @ApiModelProperty(example = "null", value = "")
  public List<MetaFactSheetType> getFactSheetTypes() {
    return factSheetTypes;
  }

  public void setFactSheetTypes(List<MetaFactSheetType> factSheetTypes) {
    this.factSheetTypes = factSheetTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaModel metaModel = (MetaModel) o;
    return Objects.equals(this.modelInfo, metaModel.modelInfo) &&
        Objects.equals(this.factSheetTypes, metaModel.factSheetTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelInfo, factSheetTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaModel {\n");

    sb.append("    modelInfo: ").append(toIndentedString(modelInfo)).append("\n");
    sb.append("    factSheetTypes: ").append(toIndentedString(factSheetTypes)).append("\n");
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
