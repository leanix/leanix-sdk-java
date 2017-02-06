package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.SubscriptionSettings;






public class WorkspaceSettings   {
  
  private SubscriptionSettings subscriptions = null;

  
  /**
   **/
  public WorkspaceSettings subscriptions(SubscriptionSettings subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("subscriptions")
  public SubscriptionSettings getSubscriptions() {
    return subscriptions;
  }
  public void setSubscriptions(SubscriptionSettings subscriptions) {
    this.subscriptions = subscriptions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSettings workspaceSettings = (WorkspaceSettings) o;
    return Objects.equals(this.subscriptions, workspaceSettings.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSettings {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

