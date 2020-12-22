/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.ProjectStatusProviderInfo;

/**
 * ProjectStatus
 */

public class ProjectStatus {
  @JsonProperty("date")
  private LocalDate date = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("progress")
  private Integer progress = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("projectStatusProviderInfos")
  private List<ProjectStatusProviderInfo> projectStatusProviderInfos = new ArrayList<ProjectStatusProviderInfo>();

  public ProjectStatus date(LocalDate date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public ProjectStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProjectStatus progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Get progress
   * @return progress
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public ProjectStatus description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProjectStatus id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProjectStatus projectStatusProviderInfos(List<ProjectStatusProviderInfo> projectStatusProviderInfos) {
    this.projectStatusProviderInfos = projectStatusProviderInfos;
    return this;
  }

  public ProjectStatus addProjectStatusProviderInfosItem(ProjectStatusProviderInfo projectStatusProviderInfosItem) {
    this.projectStatusProviderInfos.add(projectStatusProviderInfosItem);
    return this;
  }

   /**
   * Get projectStatusProviderInfos
   * @return projectStatusProviderInfos
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<ProjectStatusProviderInfo> getProjectStatusProviderInfos() {
    return projectStatusProviderInfos;
  }

  public void setProjectStatusProviderInfos(List<ProjectStatusProviderInfo> projectStatusProviderInfos) {
    this.projectStatusProviderInfos = projectStatusProviderInfos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatus projectStatus = (ProjectStatus) o;
    return Objects.equals(this.date, projectStatus.date) &&
        Objects.equals(this.status, projectStatus.status) &&
        Objects.equals(this.progress, projectStatus.progress) &&
        Objects.equals(this.description, projectStatus.description) &&
        Objects.equals(this.id, projectStatus.id) &&
        Objects.equals(this.projectStatusProviderInfos, projectStatus.projectStatusProviderInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, status, progress, description, id, projectStatusProviderInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatus {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectStatusProviderInfos: ").append(toIndentedString(projectStatusProviderInfos)).append("\n");
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

