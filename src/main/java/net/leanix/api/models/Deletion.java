package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class Deletion   {
  


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
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DeletionTypeEnum deletionType = null;
  private Integer count = null;
  private String name = null;
  private String info1 = null;
  private String info2 = null;

  
  /**
   **/
  public Deletion deletionType(DeletionTypeEnum deletionType) {
    this.deletionType = deletionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deletionType")
  public DeletionTypeEnum getDeletionType() {
    return deletionType;
  }
  public void setDeletionType(DeletionTypeEnum deletionType) {
    this.deletionType = deletionType;
  }

  
  /**
   **/
  public Deletion count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  
  /**
   **/
  public Deletion name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Deletion info1(String info1) {
    this.info1 = info1;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("info1")
  public String getInfo1() {
    return info1;
  }
  public void setInfo1(String info1) {
    this.info1 = info1;
  }

  
  /**
   **/
  public Deletion info2(String info2) {
    this.info2 = info2;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("info2")
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

