/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.396
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
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.Instance;

/**
 * Permission
 */

public class Permission {
  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("actions")
  private List<String> actions = new ArrayList<String>();

  @JsonProperty("instances")
  private List<Instance> instances = new ArrayList<Instance>();

  public Permission domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * Get domain
   * @return domain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public Permission actions(List<String> actions) {
    this.actions = actions;
    return this;
  }

  public Permission addActionsItem(String actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Get actions
   * @return actions
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getActions() {
    return actions;
  }

  public void setActions(List<String> actions) {
    this.actions = actions;
  }

  public Permission instances(List<Instance> instances) {
    this.instances = instances;
    return this;
  }

  public Permission addInstancesItem(Instance instancesItem) {
    this.instances.add(instancesItem);
    return this;
  }

   /**
   * Get instances
   * @return instances
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Instance> getInstances() {
    return instances;
  }

  public void setInstances(List<Instance> instances) {
    this.instances = instances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Permission permission = (Permission) o;
    return Objects.equals(this.domain, permission.domain) &&
        Objects.equals(this.actions, permission.actions) &&
        Objects.equals(this.instances, permission.instances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(domain, actions, instances);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Permission {\n");
    
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    instances: ").append(toIndentedString(instances)).append("\n");
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
