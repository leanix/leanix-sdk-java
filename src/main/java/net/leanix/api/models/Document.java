package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.FactSheetHasDocument;






public class Document   {
  
  private String ID = null;
  private String name = null;
  private String url = null;
  private String topic = null;
  private String version = null;
  private String documentTypeID = null;
  private String referenceSystem = null;
  private String referenceType = null;
  private String referenceID = null;
  private String referenceSyncTime = null;
  private String description = null;
  private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();

  
  /**
   **/
  public Document ID(String ID) {
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
  public Document name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Document url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public Document topic(String topic) {
    this.topic = topic;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("topic")
  public String getTopic() {
    return topic;
  }
  public void setTopic(String topic) {
    this.topic = topic;
  }

  
  /**
   **/
  public Document version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  
  /**
   **/
  public Document documentTypeID(String documentTypeID) {
    this.documentTypeID = documentTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("documentTypeID")
  public String getDocumentTypeID() {
    return documentTypeID;
  }
  public void setDocumentTypeID(String documentTypeID) {
    this.documentTypeID = documentTypeID;
  }

  
  /**
   **/
  public Document referenceSystem(String referenceSystem) {
    this.referenceSystem = referenceSystem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceSystem")
  public String getReferenceSystem() {
    return referenceSystem;
  }
  public void setReferenceSystem(String referenceSystem) {
    this.referenceSystem = referenceSystem;
  }

  
  /**
   **/
  public Document referenceType(String referenceType) {
    this.referenceType = referenceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceType")
  public String getReferenceType() {
    return referenceType;
  }
  public void setReferenceType(String referenceType) {
    this.referenceType = referenceType;
  }

  
  /**
   **/
  public Document referenceID(String referenceID) {
    this.referenceID = referenceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceID")
  public String getReferenceID() {
    return referenceID;
  }
  public void setReferenceID(String referenceID) {
    this.referenceID = referenceID;
  }

  
  /**
   **/
  public Document referenceSyncTime(String referenceSyncTime) {
    this.referenceSyncTime = referenceSyncTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("referenceSyncTime")
  public String getReferenceSyncTime() {
    return referenceSyncTime;
  }
  public void setReferenceSyncTime(String referenceSyncTime) {
    this.referenceSyncTime = referenceSyncTime;
  }

  
  /**
   **/
  public Document description(String description) {
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
  public Document factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
    this.factSheetHasDocuments = factSheetHasDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasDocuments")
  public List<FactSheetHasDocument> getFactSheetHasDocuments() {
    return factSheetHasDocuments;
  }
  public void setFactSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
    this.factSheetHasDocuments = factSheetHasDocuments;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.ID, document.ID) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.url, document.url) &&
        Objects.equals(this.topic, document.topic) &&
        Objects.equals(this.version, document.version) &&
        Objects.equals(this.documentTypeID, document.documentTypeID) &&
        Objects.equals(this.referenceSystem, document.referenceSystem) &&
        Objects.equals(this.referenceType, document.referenceType) &&
        Objects.equals(this.referenceID, document.referenceID) &&
        Objects.equals(this.referenceSyncTime, document.referenceSyncTime) &&
        Objects.equals(this.description, document.description) &&
        Objects.equals(this.factSheetHasDocuments, document.factSheetHasDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, url, topic, version, documentTypeID, referenceSystem, referenceType, referenceID, referenceSyncTime, description, factSheetHasDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    documentTypeID: ").append(toIndentedString(documentTypeID)).append("\n");
    sb.append("    referenceSystem: ").append(toIndentedString(referenceSystem)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
    sb.append("    referenceID: ").append(toIndentedString(referenceID)).append("\n");
    sb.append("    referenceSyncTime: ").append(toIndentedString(referenceSyncTime)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    factSheetHasDocuments: ").append(toIndentedString(factSheetHasDocuments)).append("\n");
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

