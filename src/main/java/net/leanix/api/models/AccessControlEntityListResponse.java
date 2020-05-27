/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.174
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * AccessControlEntityListResponse
 */

public class AccessControlEntityListResponse {
  @JsonProperty("data")
  private List<AccessControlEntity> data = new ArrayList<AccessControlEntity>();

  @JsonProperty("total")
  private Integer total = null;

  @JsonProperty("endCursor")
  private String endCursor = null;

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    OK("OK"),
    
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

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("errors")
  private List<ApiError> errors = new ArrayList<ApiError>();

  public AccessControlEntityListResponse data(List<AccessControlEntity> data) {
    this.data = data;
    return this;
  }

  public AccessControlEntityListResponse addDataItem(AccessControlEntity dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<AccessControlEntity> getData() {
    return data;
  }

  public void setData(List<AccessControlEntity> data) {
    this.data = data;
  }

  public AccessControlEntityListResponse total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

   /**
   * Get endCursor
   * @return endCursor
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEndCursor() {
    return endCursor;
  }

  public AccessControlEntityListResponse status(StatusEnum status) {
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

  public AccessControlEntityListResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public AccessControlEntityListResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Get errorMessage
   * @return errorMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AccessControlEntityListResponse errors(List<ApiError> errors) {
    this.errors = errors;
    return this;
  }

  public AccessControlEntityListResponse addErrorsItem(ApiError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ApiError> getErrors() {
    return errors;
  }

  public void setErrors(List<ApiError> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessControlEntityListResponse accessControlEntityListResponse = (AccessControlEntityListResponse) o;
    return Objects.equals(this.data, accessControlEntityListResponse.data) &&
        Objects.equals(this.total, accessControlEntityListResponse.total) &&
        Objects.equals(this.endCursor, accessControlEntityListResponse.endCursor) &&
        Objects.equals(this.status, accessControlEntityListResponse.status) &&
        Objects.equals(this.type, accessControlEntityListResponse.type) &&
        Objects.equals(this.errorMessage, accessControlEntityListResponse.errorMessage) &&
        Objects.equals(this.errors, accessControlEntityListResponse.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, total, endCursor, status, type, errorMessage, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessControlEntityListResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    endCursor: ").append(toIndentedString(endCursor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

