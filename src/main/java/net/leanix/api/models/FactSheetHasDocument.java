package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class FactSheetHasDocument   {
  
  private String ID = null;
  private String factSheetID = null;
  private String documentID = null;

  
  /**
   **/
  public FactSheetHasDocument ID(String ID) {
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
  public FactSheetHasDocument factSheetID(String factSheetID) {
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
  public FactSheetHasDocument documentID(String documentID) {
    this.documentID = documentID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentID")
  public String getDocumentID() {
    return documentID;
  }
  public void setDocumentID(String documentID) {
    this.documentID = documentID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetHasDocument factSheetHasDocument = (FactSheetHasDocument) o;
    return Objects.equals(this.ID, factSheetHasDocument.ID) &&
        Objects.equals(this.factSheetID, factSheetHasDocument.factSheetID) &&
        Objects.equals(this.documentID, factSheetHasDocument.documentID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, factSheetID, documentID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetHasDocument {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    factSheetID: ").append(toIndentedString(factSheetID)).append("\n");
    sb.append("    documentID: ").append(toIndentedString(documentID)).append("\n");
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

