package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.DataType;






public class ExternalIdType extends DataType  {
  
  private String type = null;
  private Boolean quickSearch = false;
  private Boolean fullTextSearch = false;
  private String urlTemplate = null;
  private Boolean uniqueFactSheet = false;
  private Boolean readOnly = false;
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
  @JsonProperty("urlTemplate")
  public String getUrlTemplate() {
    return urlTemplate;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uniqueFactSheet")
  public Boolean getUniqueFactSheet() {
    return uniqueFactSheet;
  }

  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("readOnly")
  public Boolean getReadOnly() {
    return readOnly;
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
    ExternalIdType externalIdType = (ExternalIdType) o;
    return Objects.equals(this.type, externalIdType.type) &&
        Objects.equals(this.quickSearch, externalIdType.quickSearch) &&
        Objects.equals(this.fullTextSearch, externalIdType.fullTextSearch) &&
        Objects.equals(this.urlTemplate, externalIdType.urlTemplate) &&
        Objects.equals(this.uniqueFactSheet, externalIdType.uniqueFactSheet) &&
        Objects.equals(this.readOnly, externalIdType.readOnly) &&
        Objects.equals(this.validator, externalIdType.validator) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, quickSearch, fullTextSearch, urlTemplate, uniqueFactSheet, readOnly, validator, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdType {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
    sb.append("    uniqueFactSheet: ").append(toIndentedString(uniqueFactSheet)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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

