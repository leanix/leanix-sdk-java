/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 3.9.139-SNAPSHOT
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
import net.leanix.api.models.LxField;
import net.leanix.api.models.ProjectStatus;

/**
 * ProjectStatusProgress
 */

public class ProjectStatusProgress extends LxField {
  @JsonProperty("projectStatus")
  private List<ProjectStatus> projectStatus = new ArrayList<ProjectStatus>();

  public ProjectStatusProgress projectStatus(List<ProjectStatus> projectStatus) {
    this.projectStatus = projectStatus;
    return this;
  }

  public ProjectStatusProgress addProjectStatusItem(ProjectStatus projectStatusItem) {
    this.projectStatus.add(projectStatusItem);
    return this;
  }

   /**
   * Get projectStatus
   * @return projectStatus
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ProjectStatus> getProjectStatus() {
    return projectStatus;
  }

  public void setProjectStatus(List<ProjectStatus> projectStatus) {
    this.projectStatus = projectStatus;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatusProgress projectStatusProgress = (ProjectStatusProgress) o;
    return Objects.equals(this.projectStatus, projectStatusProgress.projectStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectStatus, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatusProgress {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    projectStatus: ").append(toIndentedString(projectStatus)).append("\n");
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

