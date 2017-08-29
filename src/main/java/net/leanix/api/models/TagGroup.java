package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.Tag;






public class TagGroup   {
  
  private String ID = null;
  private String name = null;
  private String description = null;
  private String shortName = null;
  private Long mode = null;
  private String factSheetType = null;
  private List<Tag> tags = new ArrayList<Tag>();

  
  /**
   **/
  public TagGroup ID(String ID) {
    this.ID = ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  
  /**
   **/
  public TagGroup name(String name) {
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
  public TagGroup description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public TagGroup shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  
  /**
   **/
  public TagGroup mode(Long mode) {
    this.mode = mode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mode")
  public Long getMode() {
    return mode;
  }
  public void setMode(Long mode) {
    this.mode = mode;
  }

  
  /**
   **/
  public TagGroup factSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetType")
  public String getFactSheetType() {
    return factSheetType;
  }
  public void setFactSheetType(String factSheetType) {
    this.factSheetType = factSheetType;
  }

  
  /**
   **/
  public TagGroup tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<Tag> getTags() {
    return tags;
  }
  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagGroup tagGroup = (TagGroup) o;
    return Objects.equals(this.ID, tagGroup.ID) &&
        Objects.equals(this.name, tagGroup.name) &&
        Objects.equals(this.description, tagGroup.description) &&
        Objects.equals(this.shortName, tagGroup.shortName) &&
        Objects.equals(this.mode, tagGroup.mode) &&
        Objects.equals(this.factSheetType, tagGroup.factSheetType) &&
        Objects.equals(this.tags, tagGroup.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, description, shortName, mode, factSheetType, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagGroup {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    factSheetType: ").append(toIndentedString(factSheetType)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

