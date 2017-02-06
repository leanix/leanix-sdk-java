package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.ApiError;
import net.leanix.api.models.Deletion;






public class DatamodelUpdateResponse   {
  
  private String status = null;
  private String type = null;
  private String message = null;
  private List<ApiError> errors = new ArrayList<ApiError>();
  private Long total = null;
  private List<Deletion> data = new ArrayList<Deletion>();

  
  /**
   **/
  public DatamodelUpdateResponse status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   **/
  public DatamodelUpdateResponse type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   **/
  public DatamodelUpdateResponse message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public DatamodelUpdateResponse errors(List<ApiError> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public List<ApiError> getErrors() {
    return errors;
  }
  public void setErrors(List<ApiError> errors) {
    this.errors = errors;
  }

  
  /**
   **/
  public DatamodelUpdateResponse total(Long total) {
    this.total = total;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("total")
  public Long getTotal() {
    return total;
  }
  public void setTotal(Long total) {
    this.total = total;
  }

  
  /**
   **/
  public DatamodelUpdateResponse data(List<Deletion> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<Deletion> getData() {
    return data;
  }
  public void setData(List<Deletion> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatamodelUpdateResponse datamodelUpdateResponse = (DatamodelUpdateResponse) o;
    return Objects.equals(this.status, datamodelUpdateResponse.status) &&
        Objects.equals(this.type, datamodelUpdateResponse.type) &&
        Objects.equals(this.message, datamodelUpdateResponse.message) &&
        Objects.equals(this.errors, datamodelUpdateResponse.errors) &&
        Objects.equals(this.total, datamodelUpdateResponse.total) &&
        Objects.equals(this.data, datamodelUpdateResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, message, errors, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatamodelUpdateResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

