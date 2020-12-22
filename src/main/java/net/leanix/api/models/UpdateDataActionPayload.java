/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.396
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

/**
 * UpdateDataActionPayload
 */

public class UpdateDataActionPayload {
  @JsonProperty("quickSearch")
  private Boolean quickSearch = false;

  @JsonProperty("fullTextSearch")
  private Boolean fullTextSearch = false;

  @JsonProperty("inFacet")
  private Boolean inFacet = false;

  @JsonProperty("inView")
  private Boolean inView = false;

  @JsonProperty("values")
  private List<String> values = new ArrayList<String>();

  public UpdateDataActionPayload quickSearch(Boolean quickSearch) {
    this.quickSearch = quickSearch;
    return this;
  }

   /**
   * Get quickSearch
   * @return quickSearch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getQuickSearch() {
    return quickSearch;
  }

  public void setQuickSearch(Boolean quickSearch) {
    this.quickSearch = quickSearch;
  }

  public UpdateDataActionPayload fullTextSearch(Boolean fullTextSearch) {
    this.fullTextSearch = fullTextSearch;
    return this;
  }

   /**
   * Get fullTextSearch
   * @return fullTextSearch
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getFullTextSearch() {
    return fullTextSearch;
  }

  public void setFullTextSearch(Boolean fullTextSearch) {
    this.fullTextSearch = fullTextSearch;
  }

  public UpdateDataActionPayload inFacet(Boolean inFacet) {
    this.inFacet = inFacet;
    return this;
  }

   /**
   * Get inFacet
   * @return inFacet
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInFacet() {
    return inFacet;
  }

  public void setInFacet(Boolean inFacet) {
    this.inFacet = inFacet;
  }

  public UpdateDataActionPayload inView(Boolean inView) {
    this.inView = inView;
    return this;
  }

   /**
   * Get inView
   * @return inView
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInView() {
    return inView;
  }

  public void setInView(Boolean inView) {
    this.inView = inView;
  }

  public UpdateDataActionPayload values(List<String> values) {
    this.values = values;
    return this;
  }

  public UpdateDataActionPayload addValuesItem(String valuesItem) {
    this.values.add(valuesItem);
    return this;
  }

   /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDataActionPayload updateDataActionPayload = (UpdateDataActionPayload) o;
    return Objects.equals(this.quickSearch, updateDataActionPayload.quickSearch) &&
        Objects.equals(this.fullTextSearch, updateDataActionPayload.fullTextSearch) &&
        Objects.equals(this.inFacet, updateDataActionPayload.inFacet) &&
        Objects.equals(this.inView, updateDataActionPayload.inView) &&
        Objects.equals(this.values, updateDataActionPayload.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quickSearch, fullTextSearch, inFacet, inView, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDataActionPayload {\n");
    
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    inFacet: ").append(toIndentedString(inFacet)).append("\n");
    sb.append("    inView: ").append(toIndentedString(inView)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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
