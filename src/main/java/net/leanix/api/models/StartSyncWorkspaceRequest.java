package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;






public class StartSyncWorkspaceRequest   {
  
  private String workspaceId = null;
  private String workspaceName = null;
  private UUID userId = null;
  private String eamBasePath = null;
  private Boolean useSynclog = false;

  
  /**
   **/
  public StartSyncWorkspaceRequest workspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("workspaceId")
  public String getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(String workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   **/
  public StartSyncWorkspaceRequest workspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("workspaceName")
  public String getWorkspaceName() {
    return workspaceName;
  }
  public void setWorkspaceName(String workspaceName) {
    this.workspaceName = workspaceName;
  }

  
  /**
   **/
  public StartSyncWorkspaceRequest userId(UUID userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public UUID getUserId() {
    return userId;
  }
  public void setUserId(UUID userId) {
    this.userId = userId;
  }

  
  /**
   **/
  public StartSyncWorkspaceRequest eamBasePath(String eamBasePath) {
    this.eamBasePath = eamBasePath;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("eamBasePath")
  public String getEamBasePath() {
    return eamBasePath;
  }
  public void setEamBasePath(String eamBasePath) {
    this.eamBasePath = eamBasePath;
  }

  
  /**
   **/
  public StartSyncWorkspaceRequest useSynclog(Boolean useSynclog) {
    this.useSynclog = useSynclog;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("useSynclog")
  public Boolean getUseSynclog() {
    return useSynclog;
  }
  public void setUseSynclog(Boolean useSynclog) {
    this.useSynclog = useSynclog;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartSyncWorkspaceRequest startSyncWorkspaceRequest = (StartSyncWorkspaceRequest) o;
    return Objects.equals(this.workspaceId, startSyncWorkspaceRequest.workspaceId) &&
        Objects.equals(this.workspaceName, startSyncWorkspaceRequest.workspaceName) &&
        Objects.equals(this.userId, startSyncWorkspaceRequest.userId) &&
        Objects.equals(this.eamBasePath, startSyncWorkspaceRequest.eamBasePath) &&
        Objects.equals(this.useSynclog, startSyncWorkspaceRequest.useSynclog);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workspaceId, workspaceName, userId, eamBasePath, useSynclog);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartSyncWorkspaceRequest {\n");
    
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    eamBasePath: ").append(toIndentedString(eamBasePath)).append("\n");
    sb.append("    useSynclog: ").append(toIndentedString(useSynclog)).append("\n");
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

