package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.ComponentConfiguration;






public class Configuration   {
  
  private List<ComponentConfiguration> components = new ArrayList<ComponentConfiguration>();

  
  /**
   **/
  public Configuration components(List<ComponentConfiguration> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("components")
  public List<ComponentConfiguration> getComponents() {
    return components;
  }
  public void setComponents(List<ComponentConfiguration> components) {
    this.components = components;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Configuration configuration = (Configuration) o;
    return Objects.equals(this.components, configuration.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Configuration {\n");
    
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

