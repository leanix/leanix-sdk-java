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

import java.util.*;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.models.ServiceHasInterface;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.models.ServiceHasBusinessObject;
import net.leanix.api.models.FactSheetHasParent;
public class Service implements Serializable
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
	private String release = null;
	/*  */
	private String name = null;
	/*  */
	private String reference = null;
	/*  */
	private String alias = null;
	/*  */
	private String description = null;
	/*  */
	private String businessCriticalityID = null;
	/*  */
	private String businessCriticalityDescription = null;
	/*  */
	private String functionalSuitabilityID = null;
	/*  */
	private String functionalSuitabilityDescription = null;
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
	private List<ServiceHasBusinessCapability> serviceHasBusinessCapabilities = new ArrayList<ServiceHasBusinessCapability>();
	/*  */
	private List<ServiceHasProcess> serviceHasProcesses = new ArrayList<ServiceHasProcess>();
	/*  */
	private List<ServiceHasConsumer> serviceHasConsumers = new ArrayList<ServiceHasConsumer>();
	/*  */
	private List<ServiceHasBusinessObject> serviceHasBusinessObjects = new ArrayList<ServiceHasBusinessObject>();
	/*  */
	private List<ServiceHasInterface> serviceHasInterfaces = new ArrayList<ServiceHasInterface>();
	/*  */
	private List<ServiceHasProject> serviceHasProjects = new ArrayList<ServiceHasProject>();
	/*  */
	private List<ServiceHasResource> serviceHasResources = new ArrayList<ServiceHasResource>();
	/*  */
	private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();
	/*  */
	private List<FactSheetHasLifecycle> factSheetHasLifecycles = new ArrayList<FactSheetHasLifecycle>();
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

	@JsonProperty("businessCriticalityID")
	public String getBusinessCriticalityID()
	{
		return businessCriticalityID;
	}
	
	@JsonProperty("businessCriticalityID")
	public void setBusinessCriticalityID(String businessCriticalityID)
	{
		this.businessCriticalityID = businessCriticalityID;
	}

	@JsonProperty("businessCriticalityDescription")
	public String getBusinessCriticalityDescription()
	{
		return businessCriticalityDescription;
	}
	
	@JsonProperty("businessCriticalityDescription")
	public void setBusinessCriticalityDescription(String businessCriticalityDescription)
	{
		this.businessCriticalityDescription = businessCriticalityDescription;
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

	@JsonProperty("functionalSuitabilityDescription")
	public String getFunctionalSuitabilityDescription()
	{
		return functionalSuitabilityDescription;
	}
	
	@JsonProperty("functionalSuitabilityDescription")
	public void setFunctionalSuitabilityDescription(String functionalSuitabilityDescription)
	{
		this.functionalSuitabilityDescription = functionalSuitabilityDescription;
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

	@JsonProperty("serviceHasProcesses")
	public List<ServiceHasProcess> getServiceHasProcesses()
	{
		return serviceHasProcesses;
	}
	
	@JsonProperty("serviceHasProcesses")
	public void setServiceHasProcesses(List<ServiceHasProcess> serviceHasProcesses)
	{
		this.serviceHasProcesses = serviceHasProcesses;
	}

	@JsonProperty("serviceHasConsumers")
	public List<ServiceHasConsumer> getServiceHasConsumers()
	{
		return serviceHasConsumers;
	}
	
	@JsonProperty("serviceHasConsumers")
	public void setServiceHasConsumers(List<ServiceHasConsumer> serviceHasConsumers)
	{
		this.serviceHasConsumers = serviceHasConsumers;
	}

	@JsonProperty("serviceHasBusinessObjects")
	public List<ServiceHasBusinessObject> getServiceHasBusinessObjects()
	{
		return serviceHasBusinessObjects;
	}
	
	@JsonProperty("serviceHasBusinessObjects")
	public void setServiceHasBusinessObjects(List<ServiceHasBusinessObject> serviceHasBusinessObjects)
	{
		this.serviceHasBusinessObjects = serviceHasBusinessObjects;
	}

	@JsonProperty("serviceHasInterfaces")
	public List<ServiceHasInterface> getServiceHasInterfaces()
	{
		return serviceHasInterfaces;
	}
	
	@JsonProperty("serviceHasInterfaces")
	public void setServiceHasInterfaces(List<ServiceHasInterface> serviceHasInterfaces)
	{
		this.serviceHasInterfaces = serviceHasInterfaces;
	}

	@JsonProperty("serviceHasProjects")
	public List<ServiceHasProject> getServiceHasProjects()
	{
		return serviceHasProjects;
	}
	
	@JsonProperty("serviceHasProjects")
	public void setServiceHasProjects(List<ServiceHasProject> serviceHasProjects)
	{
		this.serviceHasProjects = serviceHasProjects;
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

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Service {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  displayName: ").append(displayName).append("\n");
		sb.append("  parentID: ").append(parentID).append("\n");
		sb.append("  level: ").append(level).append("\n");
		sb.append("  release: ").append(release).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  reference: ").append(reference).append("\n");
		sb.append("  alias: ").append(alias).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  businessCriticalityID: ").append(businessCriticalityID).append("\n");
		sb.append("  businessCriticalityDescription: ").append(businessCriticalityDescription).append("\n");
		sb.append("  functionalSuitabilityID: ").append(functionalSuitabilityID).append("\n");
		sb.append("  functionalSuitabilityDescription: ").append(functionalSuitabilityDescription).append("\n");
		sb.append("  technicalSuitabilityID: ").append(technicalSuitabilityID).append("\n");
		sb.append("  technicalSuitabilityDescription: ").append(technicalSuitabilityDescription).append("\n");
		sb.append("  objectStatusID: ").append(objectStatusID).append("\n");
		sb.append("  tags: ").append(tags).append("\n");
		sb.append("  fullName: ").append(fullName).append("\n");
		sb.append("  resourceType: ").append(resourceType).append("\n");
		sb.append("  factSheetHasParents: ").append(factSheetHasParents).append("\n");
		sb.append("  factSheetHasChildren: ").append(factSheetHasChildren).append("\n");
		sb.append("  serviceHasBusinessCapabilities: ").append(serviceHasBusinessCapabilities).append("\n");
		sb.append("  serviceHasProcesses: ").append(serviceHasProcesses).append("\n");
		sb.append("  serviceHasConsumers: ").append(serviceHasConsumers).append("\n");
		sb.append("  serviceHasBusinessObjects: ").append(serviceHasBusinessObjects).append("\n");
		sb.append("  serviceHasInterfaces: ").append(serviceHasInterfaces).append("\n");
		sb.append("  serviceHasProjects: ").append(serviceHasProjects).append("\n");
		sb.append("  serviceHasResources: ").append(serviceHasResources).append("\n");
		sb.append("  factSheetHasDocuments: ").append(factSheetHasDocuments).append("\n");
		sb.append("  factSheetHasLifecycles: ").append(factSheetHasLifecycles).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

