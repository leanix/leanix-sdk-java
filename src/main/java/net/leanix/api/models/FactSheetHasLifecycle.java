package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;






public class FactSheetHasLifecycle   {
  
  private String ID = null;
  private String factSheetID = null;
  private String lifecycleStateID = null;
  private Date startDate = null;

  
  /**
   **/
  public FactSheetHasLifecycle ID(String ID) {
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
  public FactSheetHasLifecycle factSheetID(String factSheetID) {
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
  public FactSheetHasLifecycle lifecycleStateID(String lifecycleStateID) {
    this.lifecycleStateID = lifecycleStateID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lifecycleStateID")
  public String getLifecycleStateID() {
    return lifecycleStateID;
  }
  public void setLifecycleStateID(String lifecycleStateID) {
    this.lifecycleStateID = lifecycleStateID;
  }

  
  /**
   **/
  public FactSheetHasLifecycle startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetHasLifecycle factSheetHasLifecycle = (FactSheetHasLifecycle) o;
    return Objects.equals(this.ID, factSheetHasLifecycle.ID) &&
        Objects.equals(this.factSheetID, factSheetHasLifecycle.factSheetID) &&
        Objects.equals(this.lifecycleStateID, factSheetHasLifecycle.lifecycleStateID) &&
        Objects.equals(this.startDate, factSheetHasLifecycle.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, factSheetID, lifecycleStateID, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetHasLifecycle {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    factSheetID: ").append(toIndentedString(factSheetID)).append("\n");
    sb.append("    lifecycleStateID: ").append(toIndentedString(lifecycleStateID)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

