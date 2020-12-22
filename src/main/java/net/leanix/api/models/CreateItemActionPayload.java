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
import net.leanix.api.models.DataType;

/**
 * CreateItemActionPayload
 */

public class CreateItemActionPayload {
  @JsonProperty("key")
  private String key = null;

  @JsonProperty("configuration")
  private DataType _configuration = null;

  @JsonProperty("visible")
  private Boolean visible = false;

  public CreateItemActionPayload key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public CreateItemActionPayload _configuration(DataType _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * Get _configuration
   * @return _configuration
  **/
  @ApiModelProperty(example = "null", value = "")
  public DataType getConfiguration() {
    return _configuration;
  }

  public void setConfiguration(DataType _configuration) {
    this._configuration = _configuration;
  }

  public CreateItemActionPayload visible(Boolean visible) {
    this.visible = visible;
    return this;
  }

   /**
   * Get visible
   * @return visible
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getVisible() {
    return visible;
  }

  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateItemActionPayload createItemActionPayload = (CreateItemActionPayload) o;
    return Objects.equals(this.key, createItemActionPayload.key) &&
        Objects.equals(this._configuration, createItemActionPayload._configuration) &&
        Objects.equals(this.visible, createItemActionPayload.visible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, _configuration, visible);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateItemActionPayload {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
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

