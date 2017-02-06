package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;






public class ExternalIdFieldDefinition   {
  
  private Boolean quickSearch = false;
  private Boolean fullTextSearch = false;
  private String urlTemplate = null;
  private Boolean uniqueFactSheet = false;
  private Boolean readOnly = false;
  private List<String> forFactSheets = new ArrayList<String>();
  private String validator = null;

  
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

  
  /**
   **/
  public ExternalIdFieldDefinition forFactSheets(List<String> forFactSheets) {
    this.forFactSheets = forFactSheets;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("forFactSheets")
  public List<String> getForFactSheets() {
    return forFactSheets;
  }
  public void setForFactSheets(List<String> forFactSheets) {
    this.forFactSheets = forFactSheets;
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
    ExternalIdFieldDefinition externalIdFieldDefinition = (ExternalIdFieldDefinition) o;
    return Objects.equals(this.quickSearch, externalIdFieldDefinition.quickSearch) &&
        Objects.equals(this.fullTextSearch, externalIdFieldDefinition.fullTextSearch) &&
        Objects.equals(this.urlTemplate, externalIdFieldDefinition.urlTemplate) &&
        Objects.equals(this.uniqueFactSheet, externalIdFieldDefinition.uniqueFactSheet) &&
        Objects.equals(this.readOnly, externalIdFieldDefinition.readOnly) &&
        Objects.equals(this.forFactSheets, externalIdFieldDefinition.forFactSheets) &&
        Objects.equals(this.validator, externalIdFieldDefinition.validator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(quickSearch, fullTextSearch, urlTemplate, uniqueFactSheet, readOnly, forFactSheets, validator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalIdFieldDefinition {\n");
    
    sb.append("    quickSearch: ").append(toIndentedString(quickSearch)).append("\n");
    sb.append("    fullTextSearch: ").append(toIndentedString(fullTextSearch)).append("\n");
    sb.append("    urlTemplate: ").append(toIndentedString(urlTemplate)).append("\n");
    sb.append("    uniqueFactSheet: ").append(toIndentedString(uniqueFactSheet)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    forFactSheets: ").append(toIndentedString(forFactSheets)).append("\n");
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

