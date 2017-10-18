/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.132-SNAPSHOT
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
import net.leanix.api.models.ApiError;
import net.leanix.api.models.Bookmark;

/**
 * BookmarkListResponse
 */

public class BookmarkListResponse {
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

  @JsonProperty("data")
  private List<Bookmark> data = new ArrayList<Bookmark>();

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("errors")
  private List<ApiError> errors = new ArrayList<ApiError>();

  @JsonProperty("total")
  private Integer total = null;

  public BookmarkListResponse status(StatusEnum status) {
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

  public BookmarkListResponse type(String type) {
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

  public BookmarkListResponse data(List<Bookmark> data) {
    this.data = data;
    return this;
  }

  public BookmarkListResponse addDataItem(Bookmark dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Bookmark> getData() {
    return data;
  }

  public void setData(List<Bookmark> data) {
    this.data = data;
  }

  public BookmarkListResponse errorMessage(String errorMessage) {
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

  public BookmarkListResponse errors(List<ApiError> errors) {
    this.errors = errors;
    return this;
  }

  public BookmarkListResponse addErrorsItem(ApiError errorsItem) {
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

  public BookmarkListResponse total(Integer total) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookmarkListResponse bookmarkListResponse = (BookmarkListResponse) o;
    return Objects.equals(this.status, bookmarkListResponse.status) &&
        Objects.equals(this.type, bookmarkListResponse.type) &&
        Objects.equals(this.data, bookmarkListResponse.data) &&
        Objects.equals(this.errorMessage, bookmarkListResponse.errorMessage) &&
        Objects.equals(this.errors, bookmarkListResponse.errors) &&
        Objects.equals(this.total, bookmarkListResponse.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, data, errorMessage, errors, total);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkListResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
