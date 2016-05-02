package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class FactSheetHasParent   {
  
  private String ID = null;
  private String factSheetID = null;
  private String factSheetRefID = null;
  private String description = null;
  private String dependencyTypeID = null;

  
  /**
   **/
  public FactSheetHasParent ID(String ID) {
    this.ID = ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  
  /**
   **/
  public FactSheetHasParent factSheetID(String factSheetID) {
    this.factSheetID = factSheetID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetID")
  public String getFactSheetID() {
    return factSheetID;
  }
  public void setFactSheetID(String factSheetID) {
    this.factSheetID = factSheetID;
  }

  
  /**
   **/
  public FactSheetHasParent factSheetRefID(String factSheetRefID) {
    this.factSheetRefID = factSheetRefID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetRefID")
  public String getFactSheetRefID() {
    return factSheetRefID;
  }
  public void setFactSheetRefID(String factSheetRefID) {
    this.factSheetRefID = factSheetRefID;
  }

  
  /**
   **/
  public FactSheetHasParent description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public FactSheetHasParent dependencyTypeID(String dependencyTypeID) {
    this.dependencyTypeID = dependencyTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dependencyTypeID")
  public String getDependencyTypeID() {
    return dependencyTypeID;
  }
  public void setDependencyTypeID(String dependencyTypeID) {
    this.dependencyTypeID = dependencyTypeID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetHasParent factSheetHasParent = (FactSheetHasParent) o;
    return Objects.equals(this.ID, factSheetHasParent.ID) &&
        Objects.equals(this.factSheetID, factSheetHasParent.factSheetID) &&
        Objects.equals(this.factSheetRefID, factSheetHasParent.factSheetRefID) &&
        Objects.equals(this.description, factSheetHasParent.description) &&
        Objects.equals(this.dependencyTypeID, factSheetHasParent.dependencyTypeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, factSheetID, factSheetRefID, description, dependencyTypeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetHasParent {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    factSheetID: ").append(toIndentedString(factSheetID)).append("\n");
    sb.append("    factSheetRefID: ").append(toIndentedString(factSheetRefID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dependencyTypeID: ").append(toIndentedString(dependencyTypeID)).append("\n");
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

