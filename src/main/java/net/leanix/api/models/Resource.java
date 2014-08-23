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
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.ResourceHasResourceCapability;
public class Resource
{
	/*  */
	private String ID = null;
	/*  */
	private String displayName = null;
	/*  */
	private String parentID = null;
	/*  */
	private Long level = null;
	/*  */
	private String name = null;
	/*  */
	private String reference = null;
	/*  */
	private String alias = null;
	/*  */
	private String description = null;
	/*  */
	private String objectCategoryID = null;
	/*  */
	private String locationID = null;
	/*  */
	private String technicalSuitabilityID = null;
	/*  */
	private String technicalSuitabilityDescription = null;
	/*  */
	private List<String> tags = new ArrayList<String>();
	/*  */
	private List<ResourceHasProvider> resourceHasProviders = new ArrayList<ResourceHasProvider>();
	/*  */
	private List<ResourceHasResourceCapability> resourceHasResourceCapabilities = new ArrayList<ResourceHasResourceCapability>();
	/*  */
	private List<ServiceHasResource> serviceHasResources = new ArrayList<ServiceHasResource>();
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

	@JsonProperty("displayName")
	public String getDisplayName()
	{
		return displayName;
	}
	
	@JsonProperty("displayName")
	public void setDisplayName(String displayName)
	{
		this.displayName = displayName;
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

	@JsonProperty("level")
	public Long getLevel()
	{
		return level;
	}
	
	@JsonProperty("level")
	public void setLevel(Long level)
	{
		this.level = level;
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

	@JsonProperty("objectCategoryID")
	public String getObjectCategoryID()
	{
		return objectCategoryID;
	}
	
	@JsonProperty("objectCategoryID")
	public void setObjectCategoryID(String objectCategoryID)
	{
		this.objectCategoryID = objectCategoryID;
	}

	@JsonProperty("locationID")
	public String getLocationID()
	{
		return locationID;
	}
	
	@JsonProperty("locationID")
	public void setLocationID(String locationID)
	{
		this.locationID = locationID;
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

	@JsonProperty("technicalSuitabilityDescription")
	public String getTechnicalSuitabilityDescription()
	{
		return technicalSuitabilityDescription;
	}
	
	@JsonProperty("technicalSuitabilityDescription")
	public void setTechnicalSuitabilityDescription(String technicalSuitabilityDescription)
	{
		this.technicalSuitabilityDescription = technicalSuitabilityDescription;
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

	@JsonProperty("resourceHasResourceCapabilities")
	public List<ResourceHasResourceCapability> getResourceHasResourceCapabilities()
	{
		return resourceHasResourceCapabilities;
	}
	
	@JsonProperty("resourceHasResourceCapabilities")
	public void setResourceHasResourceCapabilities(List<ResourceHasResourceCapability> resourceHasResourceCapabilities)
	{
		this.resourceHasResourceCapabilities = resourceHasResourceCapabilities;
	}

	@JsonProperty("serviceHasResources")
	public List<ServiceHasResource> getServiceHasResources()
	{
		return serviceHasResources;
	}
	
	@JsonProperty("serviceHasResources")
	public void setServiceHasResources(List<ServiceHasResource> serviceHasResources)
	{
		this.serviceHasResources = serviceHasResources;
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
		sb.append("class Resource {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  displayName: ").append(displayName).append("\n");
		sb.append("  parentID: ").append(parentID).append("\n");
		sb.append("  level: ").append(level).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("  alias: ").append(alias).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  objectCategoryID: ").append(objectCategoryID).append("\n");
		sb.append("  locationID: ").append(locationID).append("\n");
		sb.append("  technicalSuitabilityID: ").append(technicalSuitabilityID).append("\n");
		sb.append("  technicalSuitabilityDescription: ").append(technicalSuitabilityDescription).append("\n");
		sb.append("  tags: ").append(tags).append("\n");
		sb.append("  resourceHasProviders: ").append(resourceHasProviders).append("\n");
		sb.append("  resourceHasResourceCapabilities: ").append(resourceHasResourceCapabilities).append("\n");
		sb.append("  serviceHasResources: ").append(serviceHasResources).append("\n");
		sb.append("  factSheetHasDocuments: ").append(factSheetHasDocuments).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

