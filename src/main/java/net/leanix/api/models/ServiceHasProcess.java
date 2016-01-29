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

public class ServiceHasProcess implements Serializable
{
    private static final long serialVersionUID = 1L;

	/*  */
	private String ID = null;
	/*  */
	private String serviceID = null;
	/*  */
	private String processID = null;
	/*  */
	private String constraints = null;
	/*  */
	private String constraintsBackup = null;
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

	@JsonProperty("processID")
	public String getProcessID()
	{
		return processID;
	}
	
	@JsonProperty("processID")
	public void setProcessID(String processID)
	{
		this.processID = processID;
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

	@JsonProperty("constraintsBackup")
	public String getConstraintsBackup()
	{
		return constraintsBackup;
	}
	
	@JsonProperty("constraintsBackup")
	public void setConstraintsBackup(String constraintsBackup)
	{
		this.constraintsBackup = constraintsBackup;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class ServiceHasProcess {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  serviceID: ").append(serviceID).append("\n");
		sb.append("  processID: ").append(processID).append("\n");
		sb.append("  constraints: ").append(constraints).append("\n");
		sb.append("  constraintsBackup: ").append(constraintsBackup).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

