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

public class ServiceHasBusinessCapability implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String serviceID = null;
	/*  */
	private String businessCapabilityID = null;
	/*  */
	private Boolean isLeading = null;
	/*  */
	private String functionalSuitabilityID = null;
	/*  */
	private String comment = null;
	/*  */
	private String supportTypeID = null;
	/*  */
	private String constraints = null;
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

	@JsonProperty("serviceID")
	public String getServiceID()
	{
		return serviceID;
	}
	
	@JsonProperty("serviceID")
	public void setServiceID(String serviceID)
	{
		this.serviceID = serviceID;
	}

	@JsonProperty("businessCapabilityID")
	public String getBusinessCapabilityID()
	{
		return businessCapabilityID;
	}
	
	@JsonProperty("businessCapabilityID")
	public void setBusinessCapabilityID(String businessCapabilityID)
	{
		this.businessCapabilityID = businessCapabilityID;
	}

	@JsonProperty("isLeading")
	public Boolean getIsLeading()
	{
		return isLeading;
	}
	
	@JsonProperty("isLeading")
	public void setIsLeading(Boolean isLeading)
	{
		this.isLeading = isLeading;
	}

	@JsonProperty("functionalSuitabilityID")
	public String getFunctionalSuitabilityID()
	{
		return functionalSuitabilityID;
	}
	
	@JsonProperty("functionalSuitabilityID")
	public void setFunctionalSuitabilityID(String functionalSuitabilityID)
	{
		this.functionalSuitabilityID = functionalSuitabilityID;
	}

	@JsonProperty("comment")
	public String getComment()
	{
		return comment;
	}
	
	@JsonProperty("comment")
	public void setComment(String comment)
	{
		this.comment = comment;
	}

	@JsonProperty("supportTypeID")
	public String getSupportTypeID()
	{
		return supportTypeID;
	}
	
	@JsonProperty("supportTypeID")
	public void setSupportTypeID(String supportTypeID)
	{
		this.supportTypeID = supportTypeID;
	}

	@JsonProperty("constraints")
	public String getConstraints()
	{
		return constraints;
	}
	
	@JsonProperty("constraints")
	public void setConstraints(String constraints)
	{
		this.constraints = constraints;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceHasBusinessCapability {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  serviceID: ").append(serviceID).append("\n");
		sb.append("  businessCapabilityID: ").append(businessCapabilityID).append("\n");
		sb.append("  isLeading: ").append(isLeading).append("\n");
		sb.append("  functionalSuitabilityID: ").append(functionalSuitabilityID).append("\n");
		sb.append("  comment: ").append(comment).append("\n");
		sb.append("  supportTypeID: ").append(supportTypeID).append("\n");
		sb.append("  constraints: ").append(constraints).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

