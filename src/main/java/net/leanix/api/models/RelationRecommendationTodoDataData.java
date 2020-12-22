/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
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
import net.leanix.api.models.FactSheetReference;

/**
 * RelationRecommendationTodoDataData
 */

public class RelationRecommendationTodoDataData {
  @JsonProperty("factSheets")
  private List<FactSheetReference> factSheets = new ArrayList<FactSheetReference>();

  @JsonProperty("targetFactSheet")
  private FactSheetReference targetFactSheet = null;

  @JsonProperty("score")
  private Double score = null;

  public RelationRecommendationTodoDataData factSheets(List<FactSheetReference> factSheets) {
    this.factSheets = factSheets;
    return this;
  }

  public RelationRecommendationTodoDataData addFactSheetsItem(FactSheetReference factSheetsItem) {
    this.factSheets.add(factSheetsItem);
    return this;
  }

   /**
   * Get factSheets
   * @return factSheets
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheetReference> getFactSheets() {
    return factSheets;
  }

  public void setFactSheets(List<FactSheetReference> factSheets) {
    this.factSheets = factSheets;
  }

  public RelationRecommendationTodoDataData targetFactSheet(FactSheetReference targetFactSheet) {
    this.targetFactSheet = targetFactSheet;
    return this;
  }

   /**
   * Get targetFactSheet
   * @return targetFactSheet
  **/
  @ApiModelProperty(example = "null", value = "")
  public FactSheetReference getTargetFactSheet() {
    return targetFactSheet;
  }

  public void setTargetFactSheet(FactSheetReference targetFactSheet) {
    this.targetFactSheet = targetFactSheet;
  }

  public RelationRecommendationTodoDataData score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * Get score
   * @return score
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RelationRecommendationTodoDataData relationRecommendationTodoDataData = (RelationRecommendationTodoDataData) o;
    return Objects.equals(this.factSheets, relationRecommendationTodoDataData.factSheets) &&
        Objects.equals(this.targetFactSheet, relationRecommendationTodoDataData.targetFactSheet) &&
        Objects.equals(this.score, relationRecommendationTodoDataData.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factSheets, targetFactSheet, score);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RelationRecommendationTodoDataData {\n");
    
    sb.append("    factSheets: ").append(toIndentedString(factSheets)).append("\n");
    sb.append("    targetFactSheet: ").append(toIndentedString(targetFactSheet)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

