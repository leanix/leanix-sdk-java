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
import java.util.*;
import net.leanix.api.models.ServiceHasBusinessCapability;
public class BusinessCapability
{
	/*  */
	private String ID = null;
	/*  */
	private String name = null;
	/*  */
	private String reference = null;
	/*  */
	private String alias = null;
	/*  */
	private String description = null;
	/*  */
	private String parentID = null;
	/*  */
	private List<BusinessCapability> businessCapabilities = new ArrayList<BusinessCapability>();
	/*  */
	private List<ServiceHasBusinessCapability> serviceHasBusinessCapabilities = new ArrayList<ServiceHasBusinessCapability>();
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

	@JsonProperty("reference")
	public String getReference()
	{
		return reference;
	}
	
	@JsonProperty("reference")
	public void setReference(String reference)
	{
		this.reference = reference;
	}

	@JsonProperty("alias")
	public String getAlias()
	{
		return alias;
	}
	
	@JsonProperty("alias")
	public void setAlias(String alias)
	{
		this.alias = alias;
	}

	@JsonProperty("description")
	public String getDescription()
	{
		return description;
	}
	
	@JsonProperty("description")
	public void setDescription(String description)
	{
		this.description = description;
	}

	@JsonProperty("parentID")
	public String getParentID()
	{
		return parentID;
	}
	
	@JsonProperty("parentID")
	public void setParentID(String parentID)
	{
		this.parentID = parentID;
	}

	@JsonProperty("businessCapabilities")
	public List<BusinessCapability> getBusinessCapabilities()
	{
		return businessCapabilities;
	}
	
	@JsonProperty("businessCapabilities")
	public void setBusinessCapabilities(List<BusinessCapability> businessCapabilities)
	{
		this.businessCapabilities = businessCapabilities;
	}

	@JsonProperty("serviceHasBusinessCapabilities")
	public List<ServiceHasBusinessCapability> getServiceHasBusinessCapabilities()
	{
		return serviceHasBusinessCapabilities;
	}
	
	@JsonProperty("serviceHasBusinessCapabilities")
	public void setServiceHasBusinessCapabilities(List<ServiceHasBusinessCapability> serviceHasBusinessCapabilities)
	{
		this.serviceHasBusinessCapabilities = serviceHasBusinessCapabilities;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class BusinessCapability {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("  alias: ").append(alias).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  parentID: ").append(parentID).append("\n");
		sb.append("  businessCapabilities: ").append(businessCapabilities).append("\n");
		sb.append("  serviceHasBusinessCapabilities: ").append(serviceHasBusinessCapabilities).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

