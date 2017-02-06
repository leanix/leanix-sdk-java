package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.DataType;






public class StatusType extends DataType  {
  
  private String type = null;
  private Boolean quickSearch = false;
  private Boolean fullTextSearch = false;
  private List<String> values = new ArrayList<String>();

  
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

  
  /**
   **/
  public StatusType values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusType statusType = (StatusType) o;
    return Objects.equals(this.type, statusType.type) &&
        Objects.equals(this.quickSearch, statusType.quickSearch) &&
        Objects.equals(this.fullTextSearch, statusType.fullTextSearch) &&
        Objects.equals(this.values, statusType.values) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, quickSearch, fullTextSearch, values, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

