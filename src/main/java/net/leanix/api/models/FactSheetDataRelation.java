/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
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
import java.util.UUID;
import net.leanix.api.models.FactSheetDataRelation;
import net.leanix.api.models.FieldnameAndData;
import org.joda.time.LocalDate;

/**
 * FactSheetDataRelation
 */

public class FactSheetDataRelation {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("idFromFS")
  private UUID idFromFS = null;

  @JsonProperty("idToFS")
  private UUID idToFS = null;

  @JsonProperty("activeFrom")
  private LocalDate activeFrom = null;

  @JsonProperty("activeUntil")
  private LocalDate activeUntil = null;

  @JsonProperty("constrainingRelations")
  private List<FactSheetDataRelation> constrainingRelations = new ArrayList<FactSheetDataRelation>();

  @JsonProperty("fields")
  private List<FieldnameAndData> fields = new ArrayList<FieldnameAndData>();

  @JsonProperty("intentionallyNotSet")
  private List<String> intentionallyNotSet = new ArrayList<String>();

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    ACTIVE("ACTIVE"),
    
    ARCHIVED("ARCHIVED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("typeName")
  private String typeName = null;

  public FactSheetDataRelation id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FactSheetDataRelation idFromFS(UUID idFromFS) {
    this.idFromFS = idFromFS;
    return this;
  }

   /**
   * Get idFromFS
   * @return idFromFS
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getIdFromFS() {
    return idFromFS;
  }

  public void setIdFromFS(UUID idFromFS) {
    this.idFromFS = idFromFS;
  }

  public FactSheetDataRelation idToFS(UUID idToFS) {
    this.idToFS = idToFS;
    return this;
  }

   /**
   * Get idToFS
   * @return idToFS
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getIdToFS() {
    return idToFS;
  }

  public void setIdToFS(UUID idToFS) {
    this.idToFS = idToFS;
  }

  public FactSheetDataRelation activeFrom(LocalDate activeFrom) {
    this.activeFrom = activeFrom;
    return this;
  }

   /**
   * Get activeFrom
   * @return activeFrom
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getActiveFrom() {
    return activeFrom;
  }

  public void setActiveFrom(LocalDate activeFrom) {
    this.activeFrom = activeFrom;
  }

  public FactSheetDataRelation activeUntil(LocalDate activeUntil) {
    this.activeUntil = activeUntil;
    return this;
  }

   /**
   * Get activeUntil
   * @return activeUntil
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getActiveUntil() {
    return activeUntil;
  }

  public void setActiveUntil(LocalDate activeUntil) {
    this.activeUntil = activeUntil;
  }

  public FactSheetDataRelation constrainingRelations(List<FactSheetDataRelation> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
    return this;
  }

  public FactSheetDataRelation addConstrainingRelationsItem(FactSheetDataRelation constrainingRelationsItem) {
    this.constrainingRelations.add(constrainingRelationsItem);
    return this;
  }

   /**
   * Get constrainingRelations
   * @return constrainingRelations
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FactSheetDataRelation> getConstrainingRelations() {
    return constrainingRelations;
  }

  public void setConstrainingRelations(List<FactSheetDataRelation> constrainingRelations) {
    this.constrainingRelations = constrainingRelations;
  }

  public FactSheetDataRelation fields(List<FieldnameAndData> fields) {
    this.fields = fields;
    return this;
  }

  public FactSheetDataRelation addFieldsItem(FieldnameAndData fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * Get fields
   * @return fields
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<FieldnameAndData> getFields() {
    return fields;
  }

  public void setFields(List<FieldnameAndData> fields) {
    this.fields = fields;
  }

  public FactSheetDataRelation intentionallyNotSet(List<String> intentionallyNotSet) {
    this.intentionallyNotSet = intentionallyNotSet;
    return this;
  }

  public FactSheetDataRelation addIntentionallyNotSetItem(String intentionallyNotSetItem) {
    this.intentionallyNotSet.add(intentionallyNotSetItem);
    return this;
  }

   /**
   * Get intentionallyNotSet
   * @return intentionallyNotSet
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getIntentionallyNotSet() {
    return intentionallyNotSet;
  }

  public void setIntentionallyNotSet(List<String> intentionallyNotSet) {
    this.intentionallyNotSet = intentionallyNotSet;
  }

  public FactSheetDataRelation status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public FactSheetDataRelation typeName(String typeName) {
    this.typeName = typeName;
    return this;
  }

   /**
   * Get typeName
   * @return typeName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTypeName() {
    return typeName;
  }

  public void setTypeName(String typeName) {
    this.typeName = typeName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FactSheetDataRelation factSheetDataRelation = (FactSheetDataRelation) o;
    return Objects.equals(this.id, factSheetDataRelation.id) &&
        Objects.equals(this.idFromFS, factSheetDataRelation.idFromFS) &&
        Objects.equals(this.idToFS, factSheetDataRelation.idToFS) &&
        Objects.equals(this.activeFrom, factSheetDataRelation.activeFrom) &&
        Objects.equals(this.activeUntil, factSheetDataRelation.activeUntil) &&
        Objects.equals(this.constrainingRelations, factSheetDataRelation.constrainingRelations) &&
        Objects.equals(this.fields, factSheetDataRelation.fields) &&
        Objects.equals(this.intentionallyNotSet, factSheetDataRelation.intentionallyNotSet) &&
        Objects.equals(this.status, factSheetDataRelation.status) &&
        Objects.equals(this.typeName, factSheetDataRelation.typeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idFromFS, idToFS, activeFrom, activeUntil, constrainingRelations, fields, intentionallyNotSet, status, typeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FactSheetDataRelation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idFromFS: ").append(toIndentedString(idFromFS)).append("\n");
    sb.append("    idToFS: ").append(toIndentedString(idToFS)).append("\n");
    sb.append("    activeFrom: ").append(toIndentedString(activeFrom)).append("\n");
    sb.append("    activeUntil: ").append(toIndentedString(activeUntil)).append("\n");
    sb.append("    constrainingRelations: ").append(toIndentedString(constrainingRelations)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    intentionallyNotSet: ").append(toIndentedString(intentionallyNotSet)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
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

