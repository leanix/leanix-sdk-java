package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.leanix.api.models.JsonNode;






public class SavedQuery   {
  
  private UUID id = null;
  private UUID workspaceId = null;
  private UUID creatorId = null;
  private String name = null;


  public enum QueryTypeEnum {
    INVENTORY("INVENTORY"),
    REPORTING("REPORTING");

    private String value;

    QueryTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private QueryTypeEnum queryType = null;
  private String groupKey = null;
  private Map<String, JsonNode> state = new HashMap<String, JsonNode>();
  private Long rev = null;

  
  /**
   **/
  public SavedQuery id(UUID id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public UUID getId() {
    return id;
  }
  public void setId(UUID id) {
    this.id = id;
  }

  
  /**
   **/
  public SavedQuery workspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("workspaceId")
  public UUID getWorkspaceId() {
    return workspaceId;
  }
  public void setWorkspaceId(UUID workspaceId) {
    this.workspaceId = workspaceId;
  }

  
  /**
   **/
  public SavedQuery creatorId(UUID creatorId) {
    this.creatorId = creatorId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("creatorId")
  public UUID getCreatorId() {
    return creatorId;
  }
  public void setCreatorId(UUID creatorId) {
    this.creatorId = creatorId;
  }

  
  /**
   **/
  public SavedQuery name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public SavedQuery queryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("queryType")
  public QueryTypeEnum getQueryType() {
    return queryType;
  }
  public void setQueryType(QueryTypeEnum queryType) {
    this.queryType = queryType;
  }

  
  /**
   **/
  public SavedQuery groupKey(String groupKey) {
    this.groupKey = groupKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("groupKey")
  public String getGroupKey() {
    return groupKey;
  }
  public void setGroupKey(String groupKey) {
    this.groupKey = groupKey;
  }

  
  /**
   **/
  public SavedQuery state(Map<String, JsonNode> state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "")
  @JsonProperty("state")
  public Map<String, JsonNode> getState() {
    return state;
  }
  public void setState(Map<String, JsonNode> state) {
    this.state = state;
  }

  
  /**
   **/
  public SavedQuery rev(Long rev) {
    this.rev = rev;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("_rev")
  public Long getRev() {
    return rev;
  }
  public void setRev(Long rev) {
    this.rev = rev;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedQuery savedQuery = (SavedQuery) o;
    return Objects.equals(this.id, savedQuery.id) &&
        Objects.equals(this.workspaceId, savedQuery.workspaceId) &&
        Objects.equals(this.creatorId, savedQuery.creatorId) &&
        Objects.equals(this.name, savedQuery.name) &&
        Objects.equals(this.queryType, savedQuery.queryType) &&
        Objects.equals(this.groupKey, savedQuery.groupKey) &&
        Objects.equals(this.state, savedQuery.state) &&
        Objects.equals(this.rev, savedQuery.rev);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, workspaceId, creatorId, name, queryType, groupKey, state, rev);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedQuery {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
    sb.append("    groupKey: ").append(toIndentedString(groupKey)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    rev: ").append(toIndentedString(rev)).append("\n");
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

