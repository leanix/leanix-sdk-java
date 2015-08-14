/*
* The MIT License (MIT)	 
*
* Copyright (c) 2014 LeanIX GmbH
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of
* this software and associated documentation files (the "Software"), to deal in
* the Software without restriction, including without limitation the rights to
* use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
* the Software, and to permit persons to whom the Software is furnished to do so,
* subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
* FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
* COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
* IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
* CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.*;

public class DataObject implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String dataObjectClass = null;
	/*  */
	private String name = null;
	/*  */
	private String data = null;
	/*  */
	private String metaData = null;
	/*  */
	private String identifier = null;
	/*  */
	private String userID = null;
	/*  */
	private String createTime = null;
	/*  */
	private String updateTime = null;
	/*  */
	private String createUserID = null;
	/*  */
	private String updateUserID = null;
	/*  */
	private String fileType = null;
	/*  */
	private Long size = null;
	/*  */
	private String dataAccessRightID = null;
	@JsonProperty("ID")
	public String getID()
	{
		return ID;
	}
	
	@JsonProperty("ID")
	public void setID(String ID)
	{
		this.ID = ID;
	}

	@JsonProperty("dataObjectClass")
	public String getDataObjectClass()
	{
		return dataObjectClass;
	}
	
	@JsonProperty("dataObjectClass")
	public void setDataObjectClass(String dataObjectClass)
	{
		this.dataObjectClass = dataObjectClass;
	}

	@JsonProperty("name")
	public String getName()
	{
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name)
	{
		this.name = name;
	}

	@JsonProperty("data")
	public String getData()
	{
		return data;
	}
	
	@JsonProperty("data")
	public void setData(String data)
	{
		this.data = data;
	}

	@JsonProperty("metaData")
	public String getMetaData()
	{
		return metaData;
	}
	
	@JsonProperty("metaData")
	public void setMetaData(String metaData)
	{
		this.metaData = metaData;
	}

	@JsonProperty("identifier")
	public String getIdentifier()
	{
		return identifier;
	}
	
	@JsonProperty("identifier")
	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}

	@JsonProperty("userID")
	public String getUserID()
	{
		return userID;
	}
	
	@JsonProperty("userID")
	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	@JsonProperty("createTime")
	public String getCreateTime()
	{
		return createTime;
	}
	
	@JsonProperty("createTime")
	public void setCreateTime(String createTime)
	{
		this.createTime = createTime;
	}

	@JsonProperty("updateTime")
	public String getUpdateTime()
	{
		return updateTime;
	}
	
	@JsonProperty("updateTime")
	public void setUpdateTime(String updateTime)
	{
		this.updateTime = updateTime;
	}

	@JsonProperty("createUserID")
	public String getCreateUserID()
	{
		return createUserID;
	}
	
	@JsonProperty("createUserID")
	public void setCreateUserID(String createUserID)
	{
		this.createUserID = createUserID;
	}

	@JsonProperty("updateUserID")
	public String getUpdateUserID()
	{
		return updateUserID;
	}
	
	@JsonProperty("updateUserID")
	public void setUpdateUserID(String updateUserID)
	{
		this.updateUserID = updateUserID;
	}

	@JsonProperty("fileType")
	public String getFileType()
	{
		return fileType;
	}
	
	@JsonProperty("fileType")
	public void setFileType(String fileType)
	{
		this.fileType = fileType;
	}

	@JsonProperty("size")
	public Long getSize()
	{
		return size;
	}
	
	@JsonProperty("size")
	public void setSize(Long size)
	{
		this.size = size;
	}

	@JsonProperty("dataAccessRightID")
	public String getDataAccessRightID()
	{
		return dataAccessRightID;
	}
	
	@JsonProperty("dataAccessRightID")
	public void setDataAccessRightID(String dataAccessRightID)
	{
		this.dataAccessRightID = dataAccessRightID;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class DataObject {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  dataObjectClass: ").append(dataObjectClass).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  data: ").append(data).append("\n");
		sb.append("  metaData: ").append(metaData).append("\n");
		sb.append("  identifier: ").append(identifier).append("\n");
		sb.append("  userID: ").append(userID).append("\n");
		sb.append("  createTime: ").append(createTime).append("\n");
		sb.append("  updateTime: ").append(updateTime).append("\n");
		sb.append("  createUserID: ").append(createUserID).append("\n");
		sb.append("  updateUserID: ").append(updateUserID).append("\n");
		sb.append("  fileType: ").append(fileType).append("\n");
		sb.append("  size: ").append(size).append("\n");
		sb.append("  dataAccessRightID: ").append(dataAccessRightID).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

