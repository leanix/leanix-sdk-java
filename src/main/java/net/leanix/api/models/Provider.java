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
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.models.ProjectHasProvider;
public class Provider
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
	private String providerCriticalityID = null;
	/*  */
	private String providerCriticalityDescription = null;
	/*  */
	private String providerQualityID = null;
	/*  */
	private String providerQualityDescription = null;
	/*  */
	private List<String> tags = new ArrayList<String>();
	/*  */
	private List<ResourceHasProvider> resourceHasProviders = new ArrayList<ResourceHasProvider>();
	/*  */
	private List<ProjectHasProvider> projectHasProviders = new ArrayList<ProjectHasProvider>();
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

	@JsonProperty("providerCriticalityID")
	public String getProviderCriticalityID()
	{
		return providerCriticalityID;
	}
	
	@JsonProperty("providerCriticalityID")
	public void setProviderCriticalityID(String providerCriticalityID)
	{
		this.providerCriticalityID = providerCriticalityID;
	}

	@JsonProperty("providerCriticalityDescription")
	public String getProviderCriticalityDescription()
	{
		return providerCriticalityDescription;
	}
	
	@JsonProperty("providerCriticalityDescription")
	public void setProviderCriticalityDescription(String providerCriticalityDescription)
	{
		this.providerCriticalityDescription = providerCriticalityDescription;
	}

	@JsonProperty("providerQualityID")
	public String getProviderQualityID()
	{
		return providerQualityID;
	}
	
	@JsonProperty("providerQualityID")
	public void setProviderQualityID(String providerQualityID)
	{
		this.providerQualityID = providerQualityID;
	}

	@JsonProperty("providerQualityDescription")
	public String getProviderQualityDescription()
	{
		return providerQualityDescription;
	}
	
	@JsonProperty("providerQualityDescription")
	public void setProviderQualityDescription(String providerQualityDescription)
	{
		this.providerQualityDescription = providerQualityDescription;
	}

	@JsonProperty("tags")
	public List<String> getTags()
	{
		return tags;
	}
	
	@JsonProperty("tags")
	public void setTags(List<String> tags)
	{
		this.tags = tags;
	}

	@JsonProperty("resourceHasProviders")
	public List<ResourceHasProvider> getResourceHasProviders()
	{
		return resourceHasProviders;
	}
	
	@JsonProperty("resourceHasProviders")
	public void setResourceHasProviders(List<ResourceHasProvider> resourceHasProviders)
	{
		this.resourceHasProviders = resourceHasProviders;
	}

	@JsonProperty("projectHasProviders")
	public List<ProjectHasProvider> getProjectHasProviders()
	{
		return projectHasProviders;
	}
	
	@JsonProperty("projectHasProviders")
	public void setProjectHasProviders(List<ProjectHasProvider> projectHasProviders)
	{
		this.projectHasProviders = projectHasProviders;
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
		sb.append("class Provider {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("  alias: ").append(alias).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  providerCriticalityID: ").append(providerCriticalityID).append("\n");
		sb.append("  providerCriticalityDescription: ").append(providerCriticalityDescription).append("\n");
		sb.append("  providerQualityID: ").append(providerQualityID).append("\n");
		sb.append("  providerQualityDescription: ").append(providerQualityDescription).append("\n");
		sb.append("  tags: ").append(tags).append("\n");
		sb.append("  resourceHasProviders: ").append(resourceHasProviders).append("\n");
		sb.append("  projectHasProviders: ").append(projectHasProviders).append("\n");
		sb.append("  factSheetHasDocuments: ").append(factSheetHasDocuments).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

