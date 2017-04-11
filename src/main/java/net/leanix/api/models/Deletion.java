/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 0.1.13-SNAPSHOT
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

/**
 * Deletion
 */

public class Deletion {
  /**
   * Gets or Sets deletionType
   */
  public enum DeletionTypeEnum {
    FACT_SHEET("FACT_SHEET"),
    
    RELATION("RELATION"),
    
    FACT_SHEET_FIELD("FACT_SHEET_FIELD"),
    
    RELATION_FIELD("RELATION_FIELD");

    private String value;

    DeletionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DeletionTypeEnum fromValue(String text) {
      for (DeletionTypeEnum b : DeletionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deletionType")
  private DeletionTypeEnum deletionType = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("info1")
  private String info1 = null;

  @JsonProperty("info2")
  private String info2 = null;

  public Deletion deletionType(DeletionTypeEnum deletionType) {
    this.deletionType = deletionType;
    return this;
  }

   /**
   * Get deletionType
   * @return deletionType
  **/
  @ApiModelProperty(example = "null", value = "")
  public DeletionTypeEnum getDeletionType() {
    return deletionType;
  }

  public void setDeletionType(DeletionTypeEnum deletionType) {
    this.deletionType = deletionType;
  }

  public Deletion count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Deletion name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Deletion info1(String info1) {
    this.info1 = info1;
    return this;
  }

   /**
   * Get info1
   * @return info1
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInfo1() {
    return info1;
  }

  public void setInfo1(String info1) {
    this.info1 = info1;
  }

  public Deletion info2(String info2) {
    this.info2 = info2;
    return this;
  }

   /**
   * Get info2
   * @return info2
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInfo2() {
    return info2;
  }

  public void setInfo2(String info2) {
    this.info2 = info2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Deletion deletion = (Deletion) o;
    return Objects.equals(this.deletionType, deletion.deletionType) &&
        Objects.equals(this.count, deletion.count) &&
        Objects.equals(this.name, deletion.name) &&
        Objects.equals(this.info1, deletion.info1) &&
        Objects.equals(this.info2, deletion.info2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deletionType, count, name, info1, info2);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Deletion {\n");
    
    sb.append("    deletionType: ").append(toIndentedString(deletionType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    info1: ").append(toIndentedString(info1)).append("\n");
    sb.append("    info2: ").append(toIndentedString(info2)).append("\n");
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

