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

public class FactSheetHasRequiredby implements Serializable
{
    private static final long serialVersionUID = 1L;

	/*  */
	private String ID = null;
	/*  */
	private String factSheetID = null;
	/*  */
	private String factSheetRefID = null;
	/*  */
	private String description = null;
	/*  */
	private String dependencyTypeID = null;
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

	@JsonProperty("factSheetID")
	public String getFactSheetID()
	{
		return factSheetID;
	}
	
	@JsonProperty("factSheetID")
	public void setFactSheetID(String factSheetID)
	{
		this.factSheetID = factSheetID;
	}

	@JsonProperty("factSheetRefID")
	public String getFactSheetRefID()
	{
		return factSheetRefID;
	}
	
	@JsonProperty("factSheetRefID")
	public void setFactSheetRefID(String factSheetRefID)
	{
		this.factSheetRefID = factSheetRefID;
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

	@JsonProperty("dependencyTypeID")
	public String getDependencyTypeID()
	{
		return dependencyTypeID;
	}
	
	@JsonProperty("dependencyTypeID")
	public void setDependencyTypeID(String dependencyTypeID)
	{
		this.dependencyTypeID = dependencyTypeID;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class FactSheetHasRequiredby {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  factSheetID: ").append(factSheetID).append("\n");
		sb.append("  factSheetRefID: ").append(factSheetRefID).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  dependencyTypeID: ").append(dependencyTypeID).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

