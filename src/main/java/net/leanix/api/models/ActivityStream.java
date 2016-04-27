package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.leanix.api.models.Activity;






public class ActivityStream   {
  
  private Date update = null;
  private Long count = null;
  private List<Activity> data = new ArrayList<Activity>();

  
  /**
   **/
  public ActivityStream update(Date update) {
    this.update = update;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("update")
  public Date getUpdate() {
    return update;
  }
  public void setUpdate(Date update) {
    this.update = update;
  }

  
  /**
   **/
  public ActivityStream count(Long count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("count")
  public Long getCount() {
    return count;
  }
  public void setCount(Long count) {
    this.count = count;
  }

  
  /**
   **/
  public ActivityStream data(List<Activity> data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public List<Activity> getData() {
    return data;
  }
  public void setData(List<Activity> data) {
    this.data = data;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityStream activityStream = (ActivityStream) o;
    return Objects.equals(this.update, activityStream.update) &&
        Objects.equals(this.count, activityStream.count) &&
        Objects.equals(this.data, activityStream.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(update, count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityStream {\n");
    
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

