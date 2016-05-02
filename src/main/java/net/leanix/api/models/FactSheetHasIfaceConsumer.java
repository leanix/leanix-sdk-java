package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class FactSheetHasIfaceConsumer   {
  
  private String ID = null;
  private String factSheetID = null;
  private String ifaceID = null;

  
  /**
   **/
  public FactSheetHasIfaceConsumer ID(String ID) {
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
  public FactSheetHasIfaceConsumer factSheetID(String factSheetID) {
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
  public FactSheetHasIfaceConsumer ifaceID(String ifaceID) {
    this.ifaceID = ifaceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifaceID")
  public String getIfaceID() {
    return ifaceID;
  }
  public void setIfaceID(String ifaceID) {
    this.ifaceID = ifaceID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetHasIfaceConsumer factSheetHasIfaceConsumer = (FactSheetHasIfaceConsumer) o;
    return Objects.equals(this.ID, factSheetHasIfaceConsumer.ID) &&
        Objects.equals(this.factSheetID, factSheetHasIfaceConsumer.factSheetID) &&
        Objects.equals(this.ifaceID, factSheetHasIfaceConsumer.ifaceID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, factSheetID, ifaceID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetHasIfaceConsumer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    factSheetID: ").append(toIndentedString(factSheetID)).append("\n");
    sb.append("    ifaceID: ").append(toIndentedString(ifaceID)).append("\n");
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

