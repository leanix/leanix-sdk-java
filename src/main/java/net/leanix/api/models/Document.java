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

import java.util.*;
import net.leanix.api.models.FactSheetHasDocument;
public class Document implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String name = null;
	/*  */
	private String url = null;
	/*  */
	private String topic = null;
	/*  */
	private String version = null;
	/*  */
	private String documentTypeID = null;
	/*  */
	private String referenceSystem = null;
	/*  */
	private String referenceType = null;
	/*  */
	private String referenceID = null;
	/*  */
	private String referenceSyncTime = null;
	/*  */
	private String description = null;
	/*  */
	private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();
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

	@JsonProperty("url")
	public String getUrl()
	{
		return url;
	}
	
	@JsonProperty("url")
	public void setUrl(String url)
	{
		this.url = url;
	}

	@JsonProperty("topic")
	public String getTopic()
	{
		return topic;
	}
	
	@JsonProperty("topic")
	public void setTopic(String topic)
	{
		this.topic = topic;
	}

	@JsonProperty("version")
	public String getVersion()
	{
		return version;
	}
	
	@JsonProperty("version")
	public void setVersion(String version)
	{
		this.version = version;
	}

	@JsonProperty("documentTypeID")
	public String getDocumentTypeID()
	{
		return documentTypeID;
	}
	
	@JsonProperty("documentTypeID")
	public void setDocumentTypeID(String documentTypeID)
	{
		this.documentTypeID = documentTypeID;
	}

	@JsonProperty("referenceSystem")
	public String getReferenceSystem()
	{
		return referenceSystem;
	}
	
	@JsonProperty("referenceSystem")
	public void setReferenceSystem(String referenceSystem)
	{
		this.referenceSystem = referenceSystem;
	}

	@JsonProperty("referenceType")
	public String getReferenceType()
	{
		return referenceType;
	}
	
	@JsonProperty("referenceType")
	public void setReferenceType(String referenceType)
	{
		this.referenceType = referenceType;
	}

	@JsonProperty("referenceID")
	public String getReferenceID()
	{
		return referenceID;
	}
	
	@JsonProperty("referenceID")
	public void setReferenceID(String referenceID)
	{
		this.referenceID = referenceID;
	}

	@JsonProperty("referenceSyncTime")
	public String getReferenceSyncTime()
	{
		return referenceSyncTime;
	}
	
	@JsonProperty("referenceSyncTime")
	public void setReferenceSyncTime(String referenceSyncTime)
	{
		this.referenceSyncTime = referenceSyncTime;
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

	@JsonProperty("factSheetHasDocuments")
	public List<FactSheetHasDocument> getFactSheetHasDocuments()
	{
		return factSheetHasDocuments;
	}
	
	@JsonProperty("factSheetHasDocuments")
	public void setFactSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments)
	{
		this.factSheetHasDocuments = factSheetHasDocuments;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Document {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  url: ").append(url).append("\n");
		sb.append("  topic: ").append(topic).append("\n");
		sb.append("  version: ").append(version).append("\n");
		sb.append("  documentTypeID: ").append(documentTypeID).append("\n");
		sb.append("  referenceSystem: ").append(referenceSystem).append("\n");
		sb.append("  referenceType: ").append(referenceType).append("\n");
		sb.append("  referenceID: ").append(referenceID).append("\n");
		sb.append("  referenceSyncTime: ").append(referenceSyncTime).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  factSheetHasDocuments: ").append(factSheetHasDocuments).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

