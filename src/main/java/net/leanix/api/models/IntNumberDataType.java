package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.DataType;






public class IntNumberDataType extends DataType  {
  
  private String type = null;
  private Boolean quickSearch = false;
  private Boolean fullTextSearch = false;

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("quickSearch")
  public Boolean getQuickSearch() {
    return quickSearch;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullTextSearch")
  public Boolean getFullTextSearch() {
    return fullTextSearch;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntNumberDataType intNumberDataType = (IntNumberDataType) o;
    return Objects.equals(this.type, intNumberDataType.type) &&
        Objects.equals(this.quickSearch, intNumberDataType.quickSearch) &&
        Objects.equals(this.fullTextSearch, intNumberDataType.fullTextSearch) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, quickSearch, fullTextSearch, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntNumberDataType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
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

