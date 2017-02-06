package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.DataType;






public class StringDataType extends DataType  {
  
  private String type = null;
  private Boolean quickSearch = false;
  private Boolean fullTextSearch = false;
  private String validator = null;

  
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

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("validator")
  public String getValidator() {
    return validator;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringDataType stringDataType = (StringDataType) o;
    return Objects.equals(this.type, stringDataType.type) &&
        Objects.equals(this.quickSearch, stringDataType.quickSearch) &&
        Objects.equals(this.fullTextSearch, stringDataType.fullTextSearch) &&
        Objects.equals(this.validator, stringDataType.validator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, quickSearch, fullTextSearch, validator, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringDataType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    validator: ").append(toIndentedString(validator)).append("\n");
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

