package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class DataObject   {
  
  private String ID = null;
  private String dataObjectClass = null;
  private String name = null;
  private String data = null;
  private String metaData = null;
  private String identifier = null;
  private String userID = null;
  private String createTime = null;
  private String updateTime = null;
  private String createUserID = null;
  private String updateUserID = null;
  private String fileType = null;
  private Long size = null;
  private String dataAccessRightID = null;

  
  /**
   **/
  public DataObject ID(String ID) {
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
  public DataObject dataObjectClass(String dataObjectClass) {
    this.dataObjectClass = dataObjectClass;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataObjectClass")
  public String getDataObjectClass() {
    return dataObjectClass;
  }
  public void setDataObjectClass(String dataObjectClass) {
    this.dataObjectClass = dataObjectClass;
  }

  
  /**
   **/
  public DataObject name(String name) {
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

  
  /**
   **/
  public DataObject data(String data) {
    this.data = data;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("data")
  public String getData() {
    return data;
  }
  public void setData(String data) {
    this.data = data;
  }

  
  /**
   **/
  public DataObject metaData(String metaData) {
    this.metaData = metaData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metaData")
  public String getMetaData() {
    return metaData;
  }
  public void setMetaData(String metaData) {
    this.metaData = metaData;
  }

  
  /**
   **/
  public DataObject identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("identifier")
  public String getIdentifier() {
    return identifier;
  }
  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  
  /**
   **/
  public DataObject userID(String userID) {
    this.userID = userID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userID")
  public String getUserID() {
    return userID;
  }
  public void setUserID(String userID) {
    this.userID = userID;
  }

  
  /**
   **/
  public DataObject createTime(String createTime) {
    this.createTime = createTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createTime")
  public String getCreateTime() {
    return createTime;
  }
  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }

  
  /**
   **/
  public DataObject updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updateTime")
  public String getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  
  /**
   **/
  public DataObject createUserID(String createUserID) {
    this.createUserID = createUserID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createUserID")
  public String getCreateUserID() {
    return createUserID;
  }
  public void setCreateUserID(String createUserID) {
    this.createUserID = createUserID;
  }

  
  /**
   **/
  public DataObject updateUserID(String updateUserID) {
    this.updateUserID = updateUserID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("updateUserID")
  public String getUpdateUserID() {
    return updateUserID;
  }
  public void setUpdateUserID(String updateUserID) {
    this.updateUserID = updateUserID;
  }

  
  /**
   **/
  public DataObject fileType(String fileType) {
    this.fileType = fileType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fileType")
  public String getFileType() {
    return fileType;
  }
  public void setFileType(String fileType) {
    this.fileType = fileType;
  }

  
  /**
   **/
  public DataObject size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }

  
  /**
   **/
  public DataObject dataAccessRightID(String dataAccessRightID) {
    this.dataAccessRightID = dataAccessRightID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dataAccessRightID")
  public String getDataAccessRightID() {
    return dataAccessRightID;
  }
  public void setDataAccessRightID(String dataAccessRightID) {
    this.dataAccessRightID = dataAccessRightID;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataObject dataObject = (DataObject) o;
    return Objects.equals(this.ID, dataObject.ID) &&
        Objects.equals(this.dataObjectClass, dataObject.dataObjectClass) &&
        Objects.equals(this.name, dataObject.name) &&
        Objects.equals(this.data, dataObject.data) &&
        Objects.equals(this.metaData, dataObject.metaData) &&
        Objects.equals(this.identifier, dataObject.identifier) &&
        Objects.equals(this.userID, dataObject.userID) &&
        Objects.equals(this.createTime, dataObject.createTime) &&
        Objects.equals(this.updateTime, dataObject.updateTime) &&
        Objects.equals(this.createUserID, dataObject.createUserID) &&
        Objects.equals(this.updateUserID, dataObject.updateUserID) &&
        Objects.equals(this.fileType, dataObject.fileType) &&
        Objects.equals(this.size, dataObject.size) &&
        Objects.equals(this.dataAccessRightID, dataObject.dataAccessRightID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, dataObjectClass, name, data, metaData, identifier, userID, createTime, updateTime, createUserID, updateUserID, fileType, size, dataAccessRightID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataObject {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    dataObjectClass: ").append(toIndentedString(dataObjectClass)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    metaData: ").append(toIndentedString(metaData)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    createUserID: ").append(toIndentedString(createUserID)).append("\n");
    sb.append("    updateUserID: ").append(toIndentedString(updateUserID)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    dataAccessRightID: ").append(toIndentedString(dataAccessRightID)).append("\n");
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

