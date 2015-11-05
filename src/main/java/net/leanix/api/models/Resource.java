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
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.UserSubscription;
import net.leanix.api.models.ProjectHasResource;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.ResourceHasResourceCapability;
import net.leanix.api.models.FactSheetHasParent;
public class Resource implements Serializable
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
	private String release = null;
	/*  */
	private String objectCategoryID = null;
	/*  */
	private String locationID = null;
	/*  */
	private String technicalSuitabilityID = null;
	/*  */
	private String technicalSuitabilityDescription = null;
	/*  */
	private String objectStatusID = null;
	/*  */
	private List<String> tags = new ArrayList<String>();
	/*  */
	private String fullName = null;
	/*  */
	private String resourceType = null;
	/*  */
	private List<FactSheetHasParent> factSheetHasParents = new ArrayList<FactSheetHasParent>();
	/*  */
	private List<FactSheetHasChild> factSheetHasChildren = new ArrayList<FactSheetHasChild>();
	/*  */
	private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();
	/*  */
	private List<FactSheetHasLifecycle> factSheetHasLifecycles = new ArrayList<FactSheetHasLifecycle>();
	/*  */
	private List<UserSubscription> userSubscriptions = new ArrayList<UserSubscription>();
	/*  */
	private List<FactSheetHasPredecessor> factSheetHasPredecessors = new ArrayList<FactSheetHasPredecessor>();
	/*  */
	private List<FactSheetHasSuccessor> factSheetHasSuccessors = new ArrayList<FactSheetHasSuccessor>();
	/*  */
	private List<FactSheetHasRequires> factSheetHasRequires = new ArrayList<FactSheetHasRequires>();
	/*  */
	private List<FactSheetHasRequiredby> factSheetHasRequiredby = new ArrayList<FactSheetHasRequiredby>();
	/*  */
	private List<ResourceHasProvider> resourceHasProviders = new ArrayList<ResourceHasProvider>();
	/*  */
	private List<ResourceHasResourceCapability> resourceHasResourceCapabilities = new ArrayList<ResourceHasResourceCapability>();
	/*  */
	private List<ServiceHasResource> serviceHasResources = new ArrayList<ServiceHasResource>();
	/*  */
	private List<ProjectHasResource> projectHasResources = new ArrayList<ProjectHasResource>();
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

	@JsonProperty("release")
	public String getRelease()
	{
		return release;
	}
	
	@JsonProperty("release")
	public void setRelease(String release)
	{
		this.release = release;
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

	@JsonProperty("objectStatusID")
	public String getObjectStatusID()
	{
		return objectStatusID;
	}
	
	@JsonProperty("objectStatusID")
	public void setObjectStatusID(String objectStatusID)
	{
		this.objectStatusID = objectStatusID;
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

	@JsonProperty("fullName")
	public String getFullName()
	{
		return fullName;
	}
	
	@JsonProperty("fullName")
	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	@JsonProperty("resourceType")
	public String getResourceType()
	{
		return resourceType;
	}
	
	@JsonProperty("resourceType")
	public void setResourceType(String resourceType)
	{
		this.resourceType = resourceType;
	}

	@JsonProperty("factSheetHasParents")
	public List<FactSheetHasParent> getFactSheetHasParents()
	{
		return factSheetHasParents;
	}
	
	@JsonProperty("factSheetHasParents")
	public void setFactSheetHasParents(List<FactSheetHasParent> factSheetHasParents)
	{
		this.factSheetHasParents = factSheetHasParents;
	}

	@JsonProperty("factSheetHasChildren")
	public List<FactSheetHasChild> getFactSheetHasChildren()
	{
		return factSheetHasChildren;
	}
	
	@JsonProperty("factSheetHasChildren")
	public void setFactSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren)
	{
		this.factSheetHasChildren = factSheetHasChildren;
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

	@JsonProperty("factSheetHasLifecycles")
	public List<FactSheetHasLifecycle> getFactSheetHasLifecycles()
	{
		return factSheetHasLifecycles;
	}
	
	@JsonProperty("factSheetHasLifecycles")
	public void setFactSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles)
	{
		this.factSheetHasLifecycles = factSheetHasLifecycles;
	}

	@JsonProperty("userSubscriptions")
	public List<UserSubscription> getUserSubscriptions()
	{
		return userSubscriptions;
	}
	
	@JsonProperty("userSubscriptions")
	public void setUserSubscriptions(List<UserSubscription> userSubscriptions)
	{
		this.userSubscriptions = userSubscriptions;
	}

	@JsonProperty("factSheetHasPredecessors")
	public List<FactSheetHasPredecessor> getFactSheetHasPredecessors()
	{
		return factSheetHasPredecessors;
	}
	
	@JsonProperty("factSheetHasPredecessors")
	public void setFactSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors)
	{
		this.factSheetHasPredecessors = factSheetHasPredecessors;
	}

	@JsonProperty("factSheetHasSuccessors")
	public List<FactSheetHasSuccessor> getFactSheetHasSuccessors()
	{
		return factSheetHasSuccessors;
	}
	
	@JsonProperty("factSheetHasSuccessors")
	public void setFactSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors)
	{
		this.factSheetHasSuccessors = factSheetHasSuccessors;
	}

	@JsonProperty("factSheetHasRequires")
	public List<FactSheetHasRequires> getFactSheetHasRequires()
	{
		return factSheetHasRequires;
	}
	
	@JsonProperty("factSheetHasRequires")
	public void setFactSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires)
	{
		this.factSheetHasRequires = factSheetHasRequires;
	}

	@JsonProperty("factSheetHasRequiredby")
	public List<FactSheetHasRequiredby> getFactSheetHasRequiredby()
	{
		return factSheetHasRequiredby;
	}
	
	@JsonProperty("factSheetHasRequiredby")
	public void setFactSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby)
	{
		this.factSheetHasRequiredby = factSheetHasRequiredby;
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

	@JsonProperty("projectHasResources")
	public List<ProjectHasResource> getProjectHasResources()
	{
		return projectHasResources;
	}
	
	@JsonProperty("projectHasResources")
	public void setProjectHasResources(List<ProjectHasResource> projectHasResources)
	{
		this.projectHasResources = projectHasResources;
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
		sb.append("  release: ").append(release).append("\n");
		sb.append("  objectCategoryID: ").append(objectCategoryID).append("\n");
		sb.append("  locationID: ").append(locationID).append("\n");
		sb.append("  technicalSuitabilityID: ").append(technicalSuitabilityID).append("\n");
		sb.append("  technicalSuitabilityDescription: ").append(technicalSuitabilityDescription).append("\n");
		sb.append("  objectStatusID: ").append(objectStatusID).append("\n");
		sb.append("  tags: ").append(tags).append("\n");
		sb.append("  fullName: ").append(fullName).append("\n");
		sb.append("  resourceType: ").append(resourceType).append("\n");
		sb.append("  factSheetHasParents: ").append(factSheetHasParents).append("\n");
		sb.append("  factSheetHasChildren: ").append(factSheetHasChildren).append("\n");
		sb.append("  factSheetHasDocuments: ").append(factSheetHasDocuments).append("\n");
		sb.append("  factSheetHasLifecycles: ").append(factSheetHasLifecycles).append("\n");
		sb.append("  userSubscriptions: ").append(userSubscriptions).append("\n");
		sb.append("  factSheetHasPredecessors: ").append(factSheetHasPredecessors).append("\n");
		sb.append("  factSheetHasSuccessors: ").append(factSheetHasSuccessors).append("\n");
		sb.append("  factSheetHasRequires: ").append(factSheetHasRequires).append("\n");
		sb.append("  factSheetHasRequiredby: ").append(factSheetHasRequiredby).append("\n");
		sb.append("  resourceHasProviders: ").append(resourceHasProviders).append("\n");
		sb.append("  resourceHasResourceCapabilities: ").append(resourceHasResourceCapabilities).append("\n");
		sb.append("  serviceHasResources: ").append(serviceHasResources).append("\n");
		sb.append("  projectHasResources: ").append(projectHasResources).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

