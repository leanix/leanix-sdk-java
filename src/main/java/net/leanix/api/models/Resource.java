package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasParent;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.IfaceHasResource;
import net.leanix.api.models.ProjectHasResource;
import net.leanix.api.models.ResourceHasConsumer;
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.models.ResourceHasResourceCapability;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.UserSubscription;






public class Resource   {
  
  private String ID = null;
  private String displayName = null;
  private String parentID = null;
  private Long level = null;
  private String name = null;
  private String reference = null;
  private String alias = null;
  private String description = null;
  private String release = null;
  private String objectCategoryID = null;
  private String locationID = null;
  private String technicalSuitabilityID = null;
  private String technicalSuitabilityDescription = null;
  private String objectStatusID = null;
  private List<String> tags = new ArrayList<String>();
  private String fullName = null;
  private String resourceType = null;
  private String completion = null;
  private String qualitySealExpiry = null;
  private String modificationTime = null;
  private List<FactSheetHasParent> factSheetHasParents = new ArrayList<FactSheetHasParent>();
  private List<FactSheetHasChild> factSheetHasChildren = new ArrayList<FactSheetHasChild>();
  private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();
  private List<FactSheetHasLifecycle> factSheetHasLifecycles = new ArrayList<FactSheetHasLifecycle>();
  private List<UserSubscription> userSubscriptions = new ArrayList<UserSubscription>();
  private List<FactSheetHasPredecessor> factSheetHasPredecessors = new ArrayList<FactSheetHasPredecessor>();
  private List<FactSheetHasSuccessor> factSheetHasSuccessors = new ArrayList<FactSheetHasSuccessor>();
  private List<FactSheetHasRequires> factSheetHasRequires = new ArrayList<FactSheetHasRequires>();
  private List<FactSheetHasRequiredby> factSheetHasRequiredby = new ArrayList<FactSheetHasRequiredby>();
  private List<ResourceHasProvider> resourceHasProviders = new ArrayList<ResourceHasProvider>();
  private List<ResourceHasResourceCapability> resourceHasResourceCapabilities = new ArrayList<ResourceHasResourceCapability>();
  private List<ServiceHasResource> serviceHasResources = new ArrayList<ServiceHasResource>();
  private List<ProjectHasResource> projectHasResources = new ArrayList<ProjectHasResource>();
  private List<ResourceHasConsumer> resourceHasConsumers = new ArrayList<ResourceHasConsumer>();
  private List<IfaceHasResource> ifaceHasResources = new ArrayList<IfaceHasResource>();

  
  /**
   **/
  public Resource ID(String ID) {
    this.ID = ID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  public void setID(String ID) {
    this.ID = ID;
  }

  
  /**
   **/
  public Resource displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  public Resource parentID(String parentID) {
    this.parentID = parentID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("parentID")
  public String getParentID() {
    return parentID;
  }
  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  
  /**
   **/
  public Resource level(Long level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public Long getLevel() {
    return level;
  }
  public void setLevel(Long level) {
    this.level = level;
  }

  
  /**
   **/
  public Resource name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public Resource reference(String reference) {
    this.reference = reference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  
  /**
   **/
  public Resource alias(String alias) {
    this.alias = alias;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  public void setAlias(String alias) {
    this.alias = alias;
  }

  
  /**
   **/
  public Resource description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public Resource release(String release) {
    this.release = release;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("release")
  public String getRelease() {
    return release;
  }
  public void setRelease(String release) {
    this.release = release;
  }

  
  /**
   **/
  public Resource objectCategoryID(String objectCategoryID) {
    this.objectCategoryID = objectCategoryID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("objectCategoryID")
  public String getObjectCategoryID() {
    return objectCategoryID;
  }
  public void setObjectCategoryID(String objectCategoryID) {
    this.objectCategoryID = objectCategoryID;
  }

  
  /**
   **/
  public Resource locationID(String locationID) {
    this.locationID = locationID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("locationID")
  public String getLocationID() {
    return locationID;
  }
  public void setLocationID(String locationID) {
    this.locationID = locationID;
  }

  
  /**
   **/
  public Resource technicalSuitabilityID(String technicalSuitabilityID) {
    this.technicalSuitabilityID = technicalSuitabilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("technicalSuitabilityID")
  public String getTechnicalSuitabilityID() {
    return technicalSuitabilityID;
  }
  public void setTechnicalSuitabilityID(String technicalSuitabilityID) {
    this.technicalSuitabilityID = technicalSuitabilityID;
  }

  
  /**
   **/
  public Resource technicalSuitabilityDescription(String technicalSuitabilityDescription) {
    this.technicalSuitabilityDescription = technicalSuitabilityDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("technicalSuitabilityDescription")
  public String getTechnicalSuitabilityDescription() {
    return technicalSuitabilityDescription;
  }
  public void setTechnicalSuitabilityDescription(String technicalSuitabilityDescription) {
    this.technicalSuitabilityDescription = technicalSuitabilityDescription;
  }

  
  /**
   **/
  public Resource objectStatusID(String objectStatusID) {
    this.objectStatusID = objectStatusID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("objectStatusID")
  public String getObjectStatusID() {
    return objectStatusID;
  }
  public void setObjectStatusID(String objectStatusID) {
    this.objectStatusID = objectStatusID;
  }

  
  /**
   **/
  public Resource tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  
  /**
   **/
  public Resource fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fullName")
  public String getFullName() {
    return fullName;
  }
  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  
  /**
   **/
  public Resource resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceType")
  public String getResourceType() {
    return resourceType;
  }
  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  
  /**
   **/
  public Resource completion(String completion) {
    this.completion = completion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("completion")
  public String getCompletion() {
    return completion;
  }
  public void setCompletion(String completion) {
    this.completion = completion;
  }

  
  /**
   **/
  public Resource qualitySealExpiry(String qualitySealExpiry) {
    this.qualitySealExpiry = qualitySealExpiry;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qualitySealExpiry")
  public String getQualitySealExpiry() {
    return qualitySealExpiry;
  }
  public void setQualitySealExpiry(String qualitySealExpiry) {
    this.qualitySealExpiry = qualitySealExpiry;
  }

  
  /**
   **/
  public Resource modificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modificationTime")
  public String getModificationTime() {
    return modificationTime;
  }
  public void setModificationTime(String modificationTime) {
    this.modificationTime = modificationTime;
  }

  
  /**
   **/
  public Resource factSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
    this.factSheetHasParents = factSheetHasParents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasParents")
  public List<FactSheetHasParent> getFactSheetHasParents() {
    return factSheetHasParents;
  }
  public void setFactSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
    this.factSheetHasParents = factSheetHasParents;
  }

  
  /**
   **/
  public Resource factSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
    this.factSheetHasChildren = factSheetHasChildren;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasChildren")
  public List<FactSheetHasChild> getFactSheetHasChildren() {
    return factSheetHasChildren;
  }
  public void setFactSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
    this.factSheetHasChildren = factSheetHasChildren;
  }

  
  /**
   **/
  public Resource factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
    this.factSheetHasDocuments = factSheetHasDocuments;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasDocuments")
  public List<FactSheetHasDocument> getFactSheetHasDocuments() {
    return factSheetHasDocuments;
  }
  public void setFactSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
    this.factSheetHasDocuments = factSheetHasDocuments;
  }

  
  /**
   **/
  public Resource factSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
    this.factSheetHasLifecycles = factSheetHasLifecycles;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasLifecycles")
  public List<FactSheetHasLifecycle> getFactSheetHasLifecycles() {
    return factSheetHasLifecycles;
  }
  public void setFactSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
    this.factSheetHasLifecycles = factSheetHasLifecycles;
  }

  
  /**
   **/
  public Resource userSubscriptions(List<UserSubscription> userSubscriptions) {
    this.userSubscriptions = userSubscriptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userSubscriptions")
  public List<UserSubscription> getUserSubscriptions() {
    return userSubscriptions;
  }
  public void setUserSubscriptions(List<UserSubscription> userSubscriptions) {
    this.userSubscriptions = userSubscriptions;
  }

  
  /**
   **/
  public Resource factSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
    this.factSheetHasPredecessors = factSheetHasPredecessors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasPredecessors")
  public List<FactSheetHasPredecessor> getFactSheetHasPredecessors() {
    return factSheetHasPredecessors;
  }
  public void setFactSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
    this.factSheetHasPredecessors = factSheetHasPredecessors;
  }

  
  /**
   **/
  public Resource factSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
    this.factSheetHasSuccessors = factSheetHasSuccessors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasSuccessors")
  public List<FactSheetHasSuccessor> getFactSheetHasSuccessors() {
    return factSheetHasSuccessors;
  }
  public void setFactSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
    this.factSheetHasSuccessors = factSheetHasSuccessors;
  }

  
  /**
   **/
  public Resource factSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
    this.factSheetHasRequires = factSheetHasRequires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasRequires")
  public List<FactSheetHasRequires> getFactSheetHasRequires() {
    return factSheetHasRequires;
  }
  public void setFactSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
    this.factSheetHasRequires = factSheetHasRequires;
  }

  
  /**
   **/
  public Resource factSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
    this.factSheetHasRequiredby = factSheetHasRequiredby;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasRequiredby")
  public List<FactSheetHasRequiredby> getFactSheetHasRequiredby() {
    return factSheetHasRequiredby;
  }
  public void setFactSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
    this.factSheetHasRequiredby = factSheetHasRequiredby;
  }

  
  /**
   **/
  public Resource resourceHasProviders(List<ResourceHasProvider> resourceHasProviders) {
    this.resourceHasProviders = resourceHasProviders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceHasProviders")
  public List<ResourceHasProvider> getResourceHasProviders() {
    return resourceHasProviders;
  }
  public void setResourceHasProviders(List<ResourceHasProvider> resourceHasProviders) {
    this.resourceHasProviders = resourceHasProviders;
  }

  
  /**
   **/
  public Resource resourceHasResourceCapabilities(List<ResourceHasResourceCapability> resourceHasResourceCapabilities) {
    this.resourceHasResourceCapabilities = resourceHasResourceCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceHasResourceCapabilities")
  public List<ResourceHasResourceCapability> getResourceHasResourceCapabilities() {
    return resourceHasResourceCapabilities;
  }
  public void setResourceHasResourceCapabilities(List<ResourceHasResourceCapability> resourceHasResourceCapabilities) {
    this.resourceHasResourceCapabilities = resourceHasResourceCapabilities;
  }

  
  /**
   **/
  public Resource serviceHasResources(List<ServiceHasResource> serviceHasResources) {
    this.serviceHasResources = serviceHasResources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasResources")
  public List<ServiceHasResource> getServiceHasResources() {
    return serviceHasResources;
  }
  public void setServiceHasResources(List<ServiceHasResource> serviceHasResources) {
    this.serviceHasResources = serviceHasResources;
  }

  
  /**
   **/
  public Resource projectHasResources(List<ProjectHasResource> projectHasResources) {
    this.projectHasResources = projectHasResources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectHasResources")
  public List<ProjectHasResource> getProjectHasResources() {
    return projectHasResources;
  }
  public void setProjectHasResources(List<ProjectHasResource> projectHasResources) {
    this.projectHasResources = projectHasResources;
  }

  
  /**
   **/
  public Resource resourceHasConsumers(List<ResourceHasConsumer> resourceHasConsumers) {
    this.resourceHasConsumers = resourceHasConsumers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resourceHasConsumers")
  public List<ResourceHasConsumer> getResourceHasConsumers() {
    return resourceHasConsumers;
  }
  public void setResourceHasConsumers(List<ResourceHasConsumer> resourceHasConsumers) {
    this.resourceHasConsumers = resourceHasConsumers;
  }

  
  /**
   **/
  public Resource ifaceHasResources(List<IfaceHasResource> ifaceHasResources) {
    this.ifaceHasResources = ifaceHasResources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifaceHasResources")
  public List<IfaceHasResource> getIfaceHasResources() {
    return ifaceHasResources;
  }
  public void setIfaceHasResources(List<IfaceHasResource> ifaceHasResources) {
    this.ifaceHasResources = ifaceHasResources;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.ID, resource.ID) &&
        Objects.equals(this.displayName, resource.displayName) &&
        Objects.equals(this.parentID, resource.parentID) &&
        Objects.equals(this.level, resource.level) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.reference, resource.reference) &&
        Objects.equals(this.alias, resource.alias) &&
        Objects.equals(this.description, resource.description) &&
        Objects.equals(this.release, resource.release) &&
        Objects.equals(this.objectCategoryID, resource.objectCategoryID) &&
        Objects.equals(this.locationID, resource.locationID) &&
        Objects.equals(this.technicalSuitabilityID, resource.technicalSuitabilityID) &&
        Objects.equals(this.technicalSuitabilityDescription, resource.technicalSuitabilityDescription) &&
        Objects.equals(this.objectStatusID, resource.objectStatusID) &&
        Objects.equals(this.tags, resource.tags) &&
        Objects.equals(this.fullName, resource.fullName) &&
        Objects.equals(this.resourceType, resource.resourceType) &&
        Objects.equals(this.completion, resource.completion) &&
        Objects.equals(this.qualitySealExpiry, resource.qualitySealExpiry) &&
        Objects.equals(this.modificationTime, resource.modificationTime) &&
        Objects.equals(this.factSheetHasParents, resource.factSheetHasParents) &&
        Objects.equals(this.factSheetHasChildren, resource.factSheetHasChildren) &&
        Objects.equals(this.factSheetHasDocuments, resource.factSheetHasDocuments) &&
        Objects.equals(this.factSheetHasLifecycles, resource.factSheetHasLifecycles) &&
        Objects.equals(this.userSubscriptions, resource.userSubscriptions) &&
        Objects.equals(this.factSheetHasPredecessors, resource.factSheetHasPredecessors) &&
        Objects.equals(this.factSheetHasSuccessors, resource.factSheetHasSuccessors) &&
        Objects.equals(this.factSheetHasRequires, resource.factSheetHasRequires) &&
        Objects.equals(this.factSheetHasRequiredby, resource.factSheetHasRequiredby) &&
        Objects.equals(this.resourceHasProviders, resource.resourceHasProviders) &&
        Objects.equals(this.resourceHasResourceCapabilities, resource.resourceHasResourceCapabilities) &&
        Objects.equals(this.serviceHasResources, resource.serviceHasResources) &&
        Objects.equals(this.projectHasResources, resource.projectHasResources) &&
        Objects.equals(this.resourceHasConsumers, resource.resourceHasConsumers) &&
        Objects.equals(this.ifaceHasResources, resource.ifaceHasResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, displayName, parentID, level, name, reference, alias, description, release, objectCategoryID, locationID, technicalSuitabilityID, technicalSuitabilityDescription, objectStatusID, tags, fullName, resourceType, completion, qualitySealExpiry, modificationTime, factSheetHasParents, factSheetHasChildren, factSheetHasDocuments, factSheetHasLifecycles, userSubscriptions, factSheetHasPredecessors, factSheetHasSuccessors, factSheetHasRequires, factSheetHasRequiredby, resourceHasProviders, resourceHasResourceCapabilities, serviceHasResources, projectHasResources, resourceHasConsumers, ifaceHasResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    objectCategoryID: ").append(toIndentedString(objectCategoryID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
    sb.append("    technicalSuitabilityID: ").append(toIndentedString(technicalSuitabilityID)).append("\n");
    sb.append("    technicalSuitabilityDescription: ").append(toIndentedString(technicalSuitabilityDescription)).append("\n");
    sb.append("    objectStatusID: ").append(toIndentedString(objectStatusID)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    qualitySealExpiry: ").append(toIndentedString(qualitySealExpiry)).append("\n");
    sb.append("    modificationTime: ").append(toIndentedString(modificationTime)).append("\n");
    sb.append("    factSheetHasParents: ").append(toIndentedString(factSheetHasParents)).append("\n");
    sb.append("    factSheetHasChildren: ").append(toIndentedString(factSheetHasChildren)).append("\n");
    sb.append("    factSheetHasDocuments: ").append(toIndentedString(factSheetHasDocuments)).append("\n");
    sb.append("    factSheetHasLifecycles: ").append(toIndentedString(factSheetHasLifecycles)).append("\n");
    sb.append("    userSubscriptions: ").append(toIndentedString(userSubscriptions)).append("\n");
    sb.append("    factSheetHasPredecessors: ").append(toIndentedString(factSheetHasPredecessors)).append("\n");
    sb.append("    factSheetHasSuccessors: ").append(toIndentedString(factSheetHasSuccessors)).append("\n");
    sb.append("    factSheetHasRequires: ").append(toIndentedString(factSheetHasRequires)).append("\n");
    sb.append("    factSheetHasRequiredby: ").append(toIndentedString(factSheetHasRequiredby)).append("\n");
    sb.append("    resourceHasProviders: ").append(toIndentedString(resourceHasProviders)).append("\n");
    sb.append("    resourceHasResourceCapabilities: ").append(toIndentedString(resourceHasResourceCapabilities)).append("\n");
    sb.append("    serviceHasResources: ").append(toIndentedString(serviceHasResources)).append("\n");
    sb.append("    projectHasResources: ").append(toIndentedString(projectHasResources)).append("\n");
    sb.append("    resourceHasConsumers: ").append(toIndentedString(resourceHasConsumers)).append("\n");
    sb.append("    ifaceHasResources: ").append(toIndentedString(ifaceHasResources)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

