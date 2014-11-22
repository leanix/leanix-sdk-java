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

public class ServiceHasInterface implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String name = null;
	/*  */
	private String serviceID = null;
	/*  */
	private String serviceRefID = null;
	/*  */
	private String interfaceDirectionID = null;
	/*  */
	private String interfaceFrequencyID = null;
	/*  */
	private String interfaceTypeID = null;
	/*  */
	private String interfaceTechnologyID = null;
	/*  */
	private String reference = null;
	/*  */
	private String businessObjects = null;
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

	@JsonProperty("serviceRefID")
	public String getServiceRefID()
	{
		return serviceRefID;
	}
	
	@JsonProperty("serviceRefID")
	public void setServiceRefID(String serviceRefID)
	{
		this.serviceRefID = serviceRefID;
	}

	@JsonProperty("interfaceDirectionID")
	public String getInterfaceDirectionID()
	{
		return interfaceDirectionID;
	}
	
	@JsonProperty("interfaceDirectionID")
	public void setInterfaceDirectionID(String interfaceDirectionID)
	{
		this.interfaceDirectionID = interfaceDirectionID;
	}

	@JsonProperty("interfaceFrequencyID")
	public String getInterfaceFrequencyID()
	{
		return interfaceFrequencyID;
	}
	
	@JsonProperty("interfaceFrequencyID")
	public void setInterfaceFrequencyID(String interfaceFrequencyID)
	{
		this.interfaceFrequencyID = interfaceFrequencyID;
	}

	@JsonProperty("interfaceTypeID")
	public String getInterfaceTypeID()
	{
		return interfaceTypeID;
	}
	
	@JsonProperty("interfaceTypeID")
	public void setInterfaceTypeID(String interfaceTypeID)
	{
		this.interfaceTypeID = interfaceTypeID;
	}

	@JsonProperty("interfaceTechnologyID")
	public String getInterfaceTechnologyID()
	{
		return interfaceTechnologyID;
	}
	
	@JsonProperty("interfaceTechnologyID")
	public void setInterfaceTechnologyID(String interfaceTechnologyID)
	{
		this.interfaceTechnologyID = interfaceTechnologyID;
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

	@JsonProperty("businessObjects")
	public String getBusinessObjects()
	{
		return businessObjects;
	}
	
	@JsonProperty("businessObjects")
	public void setBusinessObjects(String businessObjects)
	{
		this.businessObjects = businessObjects;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceHasInterface {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  serviceID: ").append(serviceID).append("\n");
		sb.append("  serviceRefID: ").append(serviceRefID).append("\n");
		sb.append("  interfaceDirectionID: ").append(interfaceDirectionID).append("\n");
		sb.append("  interfaceFrequencyID: ").append(interfaceFrequencyID).append("\n");
		sb.append("  interfaceTypeID: ").append(interfaceTypeID).append("\n");
		sb.append("  interfaceTechnologyID: ").append(interfaceTechnologyID).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("  businessObjects: ").append(businessObjects).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

