package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;






public class AuthorizationRole   {
  
  private List<String> permissions = new ArrayList<String>();
  private String name = null;

  
  /**
   **/
  public AuthorizationRole permissions(List<String> permissions) {
    this.permissions = permissions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("permissions")
  public List<String> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }

  
  /**
   **/
  public AuthorizationRole name(String name) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthorizationRole authorizationRole = (AuthorizationRole) o;
    return Objects.equals(this.permissions, authorizationRole.permissions) &&
        Objects.equals(this.name, authorizationRole.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthorizationRole {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

