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
import java.util.UUID;
import net.leanix.api.models.MetaModelActionData;

/**
 * MetaModelActionBatchData
 */

public class MetaModelActionBatchData {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("actorId")
  private UUID actorId = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    DONE("DONE"),
    
    ERROR("ERROR");

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

  @JsonProperty("errors")
  private String errors = null;

  @JsonProperty("createdAt")
  private Long createdAt = null;

  @JsonProperty("updatedAt")
  private Long updatedAt = null;

  @JsonProperty("actions")
  private List<MetaModelActionData> actions = new ArrayList<MetaModelActionData>();

  public MetaModelActionBatchData id(UUID id) {
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

  public MetaModelActionBatchData actorId(UUID actorId) {
    this.actorId = actorId;
    return this;
  }

   /**
   * Get actorId
   * @return actorId
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getActorId() {
    return actorId;
  }

  public void setActorId(UUID actorId) {
    this.actorId = actorId;
  }

  public MetaModelActionBatchData status(StatusEnum status) {
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

  public MetaModelActionBatchData errors(String errors) {
    this.errors = errors;
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrors() {
    return errors;
  }

  public void setErrors(String errors) {
    this.errors = errors;
  }

  public MetaModelActionBatchData createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public MetaModelActionBatchData updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public MetaModelActionBatchData actions(List<MetaModelActionData> actions) {
    this.actions = actions;
    return this;
  }

  public MetaModelActionBatchData addActionsItem(MetaModelActionData actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MetaModelActionData> getActions() {
    return actions;
  }

  public void setActions(List<MetaModelActionData> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaModelActionBatchData metaModelActionBatchData = (MetaModelActionBatchData) o;
    return Objects.equals(this.id, metaModelActionBatchData.id) &&
        Objects.equals(this.actorId, metaModelActionBatchData.actorId) &&
        Objects.equals(this.status, metaModelActionBatchData.status) &&
        Objects.equals(this.errors, metaModelActionBatchData.errors) &&
        Objects.equals(this.createdAt, metaModelActionBatchData.createdAt) &&
        Objects.equals(this.updatedAt, metaModelActionBatchData.updatedAt) &&
        Objects.equals(this.actions, metaModelActionBatchData.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, actorId, status, errors, createdAt, updatedAt, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaModelActionBatchData {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

