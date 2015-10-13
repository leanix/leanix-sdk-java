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

import java.io.Serializable;

public class ServiceHasResource implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String resourceID = null;
	/*  */
	private String serviceID = null;
	/*  */
	private String comment = null;
	/*  */
	private String technicalSuitabilityID = null;
	/*  */
	private Double costTotalAnnual = null;
	/*  */
	private String serviceLevelID = null;
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

	@JsonProperty("resourceID")
	public String getResourceID()
	{
		return resourceID;
	}
	
	@JsonProperty("resourceID")
	public void setResourceID(String resourceID)
	{
		this.resourceID = resourceID;
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

	@JsonProperty("technicalSuitabilityID")
	public String getTechnicalSuitabilityID()
	{
		return technicalSuitabilityID;
	}
	
	@JsonProperty("technicalSuitabilityID")
	public void setTechnicalSuitabilityID(String technicalSuitabilityID)
	{
		this.technicalSuitabilityID = technicalSuitabilityID;
	}

	@JsonProperty("costTotalAnnual")
	public Double getCostTotalAnnual()
	{
		return costTotalAnnual;
	}
	
	@JsonProperty("costTotalAnnual")
	public void setCostTotalAnnual(Double costTotalAnnual)
	{
		this.costTotalAnnual = costTotalAnnual;
	}

	@JsonProperty("serviceLevelID")
	public String getServiceLevelID()
	{
		return serviceLevelID;
	}
	
	@JsonProperty("serviceLevelID")
	public void setServiceLevelID(String serviceLevelID)
	{
		this.serviceLevelID = serviceLevelID;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceHasResource {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  resourceID: ").append(resourceID).append("\n");
		sb.append("  serviceID: ").append(serviceID).append("\n");
		sb.append("  comment: ").append(comment).append("\n");
		sb.append("  technicalSuitabilityID: ").append(technicalSuitabilityID).append("\n");
		sb.append("  costTotalAnnual: ").append(costTotalAnnual).append("\n");
		sb.append("  serviceLevelID: ").append(serviceLevelID).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

