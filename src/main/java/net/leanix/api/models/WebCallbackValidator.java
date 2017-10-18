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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.leanix.api.models.CustomValidator;

/**
 * WebCallbackValidator
 */

public class WebCallbackValidator extends CustomValidator {
  @JsonProperty("params")
  private Map<String, String> params = new HashMap<String, String>();

  @JsonProperty("type")
  private String type = null;

  public WebCallbackValidator params(Map<String, String> params) {
    this.params = params;
    return this;
  }

  public WebCallbackValidator putParamsItem(String key, String paramsItem) {
    this.params.put(key, paramsItem);
    return this;
  }

   /**
   * Get params
   * @return params
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Map<String, String> getParams() {
    return params;
  }

  public void setParams(Map<String, String> params) {
    this.params = params;
  }

  public WebCallbackValidator type(String type) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebCallbackValidator webCallbackValidator = (WebCallbackValidator) o;
    return Objects.equals(this.params, webCallbackValidator.params) &&
        Objects.equals(this.type, webCallbackValidator.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params, type, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebCallbackValidator {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

