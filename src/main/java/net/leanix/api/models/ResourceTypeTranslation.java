/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
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

/**
 * ResourceTypeTranslation
 */

public class ResourceTypeTranslation {
<<<<<<< HEAD

=======
>>>>>>> release/3.9.30
  @JsonProperty("label")
  private String label = null;

  public ResourceTypeTranslation label(String label) {
    this.label = label;
    return this;
  }

<<<<<<< HEAD
  /**
   * Get label
   * @return label
   **/
=======
   /**
   * Get label
   * @return label
  **/
>>>>>>> release/3.9.30
  @ApiModelProperty(example = "null", value = "")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
<<<<<<< HEAD
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTypeTranslation resourceTypeTranslation = (ResourceTypeTranslation) o;
    return Objects.equals(this.label, resourceTypeTranslation.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTypeTranslation {\n");

    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

=======
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceTypeTranslation resourceTypeTranslation = (ResourceTypeTranslation) o;
    return Objects.equals(this.label, resourceTypeTranslation.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceTypeTranslation {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
  
>>>>>>> release/3.9.30
}

