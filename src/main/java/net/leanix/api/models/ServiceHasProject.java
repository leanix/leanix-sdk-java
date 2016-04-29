package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class ServiceHasProject   {
  
  private String ID = null;
  private String serviceID = null;
  private String projectID = null;
  private String comment = null;

  
  /**
   **/
  public ServiceHasProject ID(String ID) {
    this.ID = ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  
  /**
   **/
  public ServiceHasProject serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceID")
  public String getServiceID() {
    return serviceID;
  }
  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  
  /**
   **/
  public ServiceHasProject projectID(String projectID) {
    this.projectID = projectID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectID")
  public String getProjectID() {
    return projectID;
  }
  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  
  /**
   **/
  public ServiceHasProject comment(String comment) {
    this.comment = comment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  public void setComment(String comment) {
    this.comment = comment;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceHasProject serviceHasProject = (ServiceHasProject) o;
    return Objects.equals(this.ID, serviceHasProject.ID) &&
        Objects.equals(this.serviceID, serviceHasProject.serviceID) &&
        Objects.equals(this.projectID, serviceHasProject.projectID) &&
        Objects.equals(this.comment, serviceHasProject.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, serviceID, projectID, comment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceHasProject {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

