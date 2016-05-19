package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import net.leanix.api.models.ActivityFactSheet;
import net.leanix.api.models.ActivityUser;






public class Activity   {
  
  private String ID = null;
  private ActivityFactSheet factSheet = null;
  private String eventType = null;
  private ActivityUser user = null;
  private String title = null;
  private Date date = null;
  private String description = null;

  
  /**
   **/
  public Activity ID(String ID) {
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
  public Activity factSheet(ActivityFactSheet factSheet) {
    this.factSheet = factSheet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheet")
  public ActivityFactSheet getFactSheet() {
    return factSheet;
  }
  public void setFactSheet(ActivityFactSheet factSheet) {
    this.factSheet = factSheet;
  }

  
  /**
   **/
  public Activity eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventType")
  public String getEventType() {
    return eventType;
  }
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  
  /**
   **/
  public Activity user(ActivityUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public ActivityUser getUser() {
    return user;
  }
  public void setUser(ActivityUser user) {
    this.user = user;
  }

  
  /**
   **/
  public Activity title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public Activity date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  
  /**
   **/
  public Activity description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Activity activity = (Activity) o;
    return Objects.equals(this.ID, activity.ID) &&
        Objects.equals(this.factSheet, activity.factSheet) &&
        Objects.equals(this.eventType, activity.eventType) &&
        Objects.equals(this.user, activity.user) &&
        Objects.equals(this.title, activity.title) &&
        Objects.equals(this.date, activity.date) &&
        Objects.equals(this.description, activity.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, factSheet, eventType, user, title, date, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Activity {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    factSheet: ").append(toIndentedString(factSheet)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

