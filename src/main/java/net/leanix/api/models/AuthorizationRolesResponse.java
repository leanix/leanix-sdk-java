/**
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.8-SNAPSHOT
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.ApiError;
import net.leanix.api.models.ArrayList;
import net.leanix.api.models.AuthorizationRole;


/**
 * AuthorizationRolesResponse
 */

public class AuthorizationRolesResponse   {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("errors")
  private java.util.List<ApiError> errors = new java.util.ArrayList<ApiError>();

  @JsonProperty("total")
  private Long total = null;

  @JsonProperty("data")
  private java.util.List<AuthorizationRole> data = new java.util.ArrayList<AuthorizationRole>();

  public AuthorizationRolesResponse status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public AuthorizationRolesResponse type(String type) {
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

  public AuthorizationRolesResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public AuthorizationRolesResponse errors(java.util.List<ApiError> errors) {
    this.errors = errors;
    return this;
  }

  public AuthorizationRolesResponse addErrorsItem(ApiError errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<ApiError> getErrors() {
    return errors;
  }

  public void setErrors(java.util.List<ApiError> errors) {
    this.errors = errors;
  }

  public AuthorizationRolesResponse total(Long total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public AuthorizationRolesResponse data(java.util.List<AuthorizationRole> data) {
    this.data = data;
    return this;
  }

  public AuthorizationRolesResponse addDataItem(AuthorizationRole dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public java.util.List<AuthorizationRole> getData() {
    return data;
  }

  public void setData(java.util.List<AuthorizationRole> data) {
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
    AuthorizationRolesResponse authorizationRolesResponse = (AuthorizationRolesResponse) o;
    return Objects.equals(this.status, authorizationRolesResponse.status) &&
        Objects.equals(this.type, authorizationRolesResponse.type) &&
        Objects.equals(this.message, authorizationRolesResponse.message) &&
        Objects.equals(this.errors, authorizationRolesResponse.errors) &&
        Objects.equals(this.total, authorizationRolesResponse.total) &&
        Objects.equals(this.data, authorizationRolesResponse.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, type, message, errors, total, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationRolesResponse {\n");
    
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

