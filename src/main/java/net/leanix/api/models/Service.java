package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.FactSheetHasIfaceConsumer;
import net.leanix.api.models.FactSheetHasIfaceProvider;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasParent;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.models.ServiceHasBusinessObject;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.models.ServiceHasInterface;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.models.UserSubscription;






public class Service   {
  
  private String ID = null;
  private String displayName = null;
  private String parentID = null;
  private Long level = null;
  private String release = null;
  private String name = null;
  private String reference = null;
  private String alias = null;
  private String description = null;
  private String businessCriticalityID = null;
  private String businessCriticalityDescription = null;
  private String functionalSuitabilityID = null;
  private String functionalSuitabilityDescription = null;
  private String technicalSuitabilityID = null;
  private String technicalSuitabilityDescription = null;
  private String objectStatusID = null;
  private List<String> tags = new ArrayList<String>();
  private String fullName = null;
  private String resourceType = null;
  private String completion = null;
  private String qualitySealExpiry = null;
  private List<FactSheetHasParent> factSheetHasParents = new ArrayList<FactSheetHasParent>();
  private List<FactSheetHasChild> factSheetHasChildren = new ArrayList<FactSheetHasChild>();
  private List<FactSheetHasDocument> factSheetHasDocuments = new ArrayList<FactSheetHasDocument>();
  private List<FactSheetHasLifecycle> factSheetHasLifecycles = new ArrayList<FactSheetHasLifecycle>();
  private List<UserSubscription> userSubscriptions = new ArrayList<UserSubscription>();
  private List<FactSheetHasPredecessor> factSheetHasPredecessors = new ArrayList<FactSheetHasPredecessor>();
  private List<FactSheetHasSuccessor> factSheetHasSuccessors = new ArrayList<FactSheetHasSuccessor>();
  private List<FactSheetHasRequires> factSheetHasRequires = new ArrayList<FactSheetHasRequires>();
  private List<FactSheetHasRequiredby> factSheetHasRequiredby = new ArrayList<FactSheetHasRequiredby>();
  private List<ServiceHasBusinessCapability> serviceHasBusinessCapabilities = new ArrayList<ServiceHasBusinessCapability>();
  private List<ServiceHasProcess> serviceHasProcesses = new ArrayList<ServiceHasProcess>();
  private List<ServiceHasConsumer> serviceHasConsumers = new ArrayList<ServiceHasConsumer>();
  private List<ServiceHasBusinessObject> serviceHasBusinessObjects = new ArrayList<ServiceHasBusinessObject>();
  private List<ServiceHasInterface> serviceHasInterfaces = new ArrayList<ServiceHasInterface>();
  private List<ServiceHasProject> serviceHasProjects = new ArrayList<ServiceHasProject>();
  private List<ServiceHasResource> serviceHasResources = new ArrayList<ServiceHasResource>();
  private List<FactSheetHasIfaceProvider> factSheetHasIfaceProviders = new ArrayList<FactSheetHasIfaceProvider>();
  private List<FactSheetHasIfaceConsumer> factSheetHasIfaceConsumers = new ArrayList<FactSheetHasIfaceConsumer>();

  
  /**
   **/
  public Service ID(String ID) {
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
  public Service displayName(String displayName) {
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
  public Service parentID(String parentID) {
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
  public Service level(Long level) {
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
  public Service release(String release) {
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
  public Service name(String name) {
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
  public Service reference(String reference) {
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
  public Service alias(String alias) {
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
  public Service description(String description) {
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
  public Service businessCriticalityID(String businessCriticalityID) {
    this.businessCriticalityID = businessCriticalityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessCriticalityID")
  public String getBusinessCriticalityID() {
    return businessCriticalityID;
  }
  public void setBusinessCriticalityID(String businessCriticalityID) {
    this.businessCriticalityID = businessCriticalityID;
  }

  
  /**
   **/
  public Service businessCriticalityDescription(String businessCriticalityDescription) {
    this.businessCriticalityDescription = businessCriticalityDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessCriticalityDescription")
  public String getBusinessCriticalityDescription() {
    return businessCriticalityDescription;
  }
  public void setBusinessCriticalityDescription(String businessCriticalityDescription) {
    this.businessCriticalityDescription = businessCriticalityDescription;
  }

  
  /**
   **/
  public Service functionalSuitabilityID(String functionalSuitabilityID) {
    this.functionalSuitabilityID = functionalSuitabilityID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("functionalSuitabilityID")
  public String getFunctionalSuitabilityID() {
    return functionalSuitabilityID;
  }
  public void setFunctionalSuitabilityID(String functionalSuitabilityID) {
    this.functionalSuitabilityID = functionalSuitabilityID;
  }

  
  /**
   **/
  public Service functionalSuitabilityDescription(String functionalSuitabilityDescription) {
    this.functionalSuitabilityDescription = functionalSuitabilityDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("functionalSuitabilityDescription")
  public String getFunctionalSuitabilityDescription() {
    return functionalSuitabilityDescription;
  }
  public void setFunctionalSuitabilityDescription(String functionalSuitabilityDescription) {
    this.functionalSuitabilityDescription = functionalSuitabilityDescription;
  }

  
  /**
   **/
  public Service technicalSuitabilityID(String technicalSuitabilityID) {
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
  public Service technicalSuitabilityDescription(String technicalSuitabilityDescription) {
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
  public Service objectStatusID(String objectStatusID) {
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
  public Service tags(List<String> tags) {
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
  public Service fullName(String fullName) {
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
  public Service resourceType(String resourceType) {
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
  public Service completion(String completion) {
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
  public Service qualitySealExpiry(String qualitySealExpiry) {
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
  public Service factSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
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
  public Service factSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
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
  public Service factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
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
  public Service factSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
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
  public Service userSubscriptions(List<UserSubscription> userSubscriptions) {
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
  public Service factSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
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
  public Service factSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
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
  public Service factSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
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
  public Service factSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
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
  public Service serviceHasBusinessCapabilities(List<ServiceHasBusinessCapability> serviceHasBusinessCapabilities) {
    this.serviceHasBusinessCapabilities = serviceHasBusinessCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasBusinessCapabilities")
  public List<ServiceHasBusinessCapability> getServiceHasBusinessCapabilities() {
    return serviceHasBusinessCapabilities;
  }
  public void setServiceHasBusinessCapabilities(List<ServiceHasBusinessCapability> serviceHasBusinessCapabilities) {
    this.serviceHasBusinessCapabilities = serviceHasBusinessCapabilities;
  }

  
  /**
   **/
  public Service serviceHasProcesses(List<ServiceHasProcess> serviceHasProcesses) {
    this.serviceHasProcesses = serviceHasProcesses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasProcesses")
  public List<ServiceHasProcess> getServiceHasProcesses() {
    return serviceHasProcesses;
  }
  public void setServiceHasProcesses(List<ServiceHasProcess> serviceHasProcesses) {
    this.serviceHasProcesses = serviceHasProcesses;
  }

  
  /**
   **/
  public Service serviceHasConsumers(List<ServiceHasConsumer> serviceHasConsumers) {
    this.serviceHasConsumers = serviceHasConsumers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasConsumers")
  public List<ServiceHasConsumer> getServiceHasConsumers() {
    return serviceHasConsumers;
  }
  public void setServiceHasConsumers(List<ServiceHasConsumer> serviceHasConsumers) {
    this.serviceHasConsumers = serviceHasConsumers;
  }

  
  /**
   **/
  public Service serviceHasBusinessObjects(List<ServiceHasBusinessObject> serviceHasBusinessObjects) {
    this.serviceHasBusinessObjects = serviceHasBusinessObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasBusinessObjects")
  public List<ServiceHasBusinessObject> getServiceHasBusinessObjects() {
    return serviceHasBusinessObjects;
  }
  public void setServiceHasBusinessObjects(List<ServiceHasBusinessObject> serviceHasBusinessObjects) {
    this.serviceHasBusinessObjects = serviceHasBusinessObjects;
  }

  
  /**
   **/
  public Service serviceHasInterfaces(List<ServiceHasInterface> serviceHasInterfaces) {
    this.serviceHasInterfaces = serviceHasInterfaces;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasInterfaces")
  public List<ServiceHasInterface> getServiceHasInterfaces() {
    return serviceHasInterfaces;
  }
  public void setServiceHasInterfaces(List<ServiceHasInterface> serviceHasInterfaces) {
    this.serviceHasInterfaces = serviceHasInterfaces;
  }

  
  /**
   **/
  public Service serviceHasProjects(List<ServiceHasProject> serviceHasProjects) {
    this.serviceHasProjects = serviceHasProjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("serviceHasProjects")
  public List<ServiceHasProject> getServiceHasProjects() {
    return serviceHasProjects;
  }
  public void setServiceHasProjects(List<ServiceHasProject> serviceHasProjects) {
    this.serviceHasProjects = serviceHasProjects;
  }

  
  /**
   **/
  public Service serviceHasResources(List<ServiceHasResource> serviceHasResources) {
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
  public Service factSheetHasIfaceProviders(List<FactSheetHasIfaceProvider> factSheetHasIfaceProviders) {
    this.factSheetHasIfaceProviders = factSheetHasIfaceProviders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasIfaceProviders")
  public List<FactSheetHasIfaceProvider> getFactSheetHasIfaceProviders() {
    return factSheetHasIfaceProviders;
  }
  public void setFactSheetHasIfaceProviders(List<FactSheetHasIfaceProvider> factSheetHasIfaceProviders) {
    this.factSheetHasIfaceProviders = factSheetHasIfaceProviders;
  }

  
  /**
   **/
  public Service factSheetHasIfaceConsumers(List<FactSheetHasIfaceConsumer> factSheetHasIfaceConsumers) {
    this.factSheetHasIfaceConsumers = factSheetHasIfaceConsumers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("factSheetHasIfaceConsumers")
  public List<FactSheetHasIfaceConsumer> getFactSheetHasIfaceConsumers() {
    return factSheetHasIfaceConsumers;
  }
  public void setFactSheetHasIfaceConsumers(List<FactSheetHasIfaceConsumer> factSheetHasIfaceConsumers) {
    this.factSheetHasIfaceConsumers = factSheetHasIfaceConsumers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.ID, service.ID) &&
        Objects.equals(this.displayName, service.displayName) &&
        Objects.equals(this.parentID, service.parentID) &&
        Objects.equals(this.level, service.level) &&
        Objects.equals(this.release, service.release) &&
        Objects.equals(this.name, service.name) &&
        Objects.equals(this.reference, service.reference) &&
        Objects.equals(this.alias, service.alias) &&
        Objects.equals(this.description, service.description) &&
        Objects.equals(this.businessCriticalityID, service.businessCriticalityID) &&
        Objects.equals(this.businessCriticalityDescription, service.businessCriticalityDescription) &&
        Objects.equals(this.functionalSuitabilityID, service.functionalSuitabilityID) &&
        Objects.equals(this.functionalSuitabilityDescription, service.functionalSuitabilityDescription) &&
        Objects.equals(this.technicalSuitabilityID, service.technicalSuitabilityID) &&
        Objects.equals(this.technicalSuitabilityDescription, service.technicalSuitabilityDescription) &&
        Objects.equals(this.objectStatusID, service.objectStatusID) &&
        Objects.equals(this.tags, service.tags) &&
        Objects.equals(this.fullName, service.fullName) &&
        Objects.equals(this.resourceType, service.resourceType) &&
        Objects.equals(this.completion, service.completion) &&
        Objects.equals(this.qualitySealExpiry, service.qualitySealExpiry) &&
        Objects.equals(this.factSheetHasParents, service.factSheetHasParents) &&
        Objects.equals(this.factSheetHasChildren, service.factSheetHasChildren) &&
        Objects.equals(this.factSheetHasDocuments, service.factSheetHasDocuments) &&
        Objects.equals(this.factSheetHasLifecycles, service.factSheetHasLifecycles) &&
        Objects.equals(this.userSubscriptions, service.userSubscriptions) &&
        Objects.equals(this.factSheetHasPredecessors, service.factSheetHasPredecessors) &&
        Objects.equals(this.factSheetHasSuccessors, service.factSheetHasSuccessors) &&
        Objects.equals(this.factSheetHasRequires, service.factSheetHasRequires) &&
        Objects.equals(this.factSheetHasRequiredby, service.factSheetHasRequiredby) &&
        Objects.equals(this.serviceHasBusinessCapabilities, service.serviceHasBusinessCapabilities) &&
        Objects.equals(this.serviceHasProcesses, service.serviceHasProcesses) &&
        Objects.equals(this.serviceHasConsumers, service.serviceHasConsumers) &&
        Objects.equals(this.serviceHasBusinessObjects, service.serviceHasBusinessObjects) &&
        Objects.equals(this.serviceHasInterfaces, service.serviceHasInterfaces) &&
        Objects.equals(this.serviceHasProjects, service.serviceHasProjects) &&
        Objects.equals(this.serviceHasResources, service.serviceHasResources) &&
        Objects.equals(this.factSheetHasIfaceProviders, service.factSheetHasIfaceProviders) &&
        Objects.equals(this.factSheetHasIfaceConsumers, service.factSheetHasIfaceConsumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, displayName, parentID, level, release, name, reference, alias, description, businessCriticalityID, businessCriticalityDescription, functionalSuitabilityID, functionalSuitabilityDescription, technicalSuitabilityID, technicalSuitabilityDescription, objectStatusID, tags, fullName, resourceType, completion, qualitySealExpiry, factSheetHasParents, factSheetHasChildren, factSheetHasDocuments, factSheetHasLifecycles, userSubscriptions, factSheetHasPredecessors, factSheetHasSuccessors, factSheetHasRequires, factSheetHasRequiredby, serviceHasBusinessCapabilities, serviceHasProcesses, serviceHasConsumers, serviceHasBusinessObjects, serviceHasInterfaces, serviceHasProjects, serviceHasResources, factSheetHasIfaceProviders, factSheetHasIfaceConsumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    businessCriticalityID: ").append(toIndentedString(businessCriticalityID)).append("\n");
    sb.append("    businessCriticalityDescription: ").append(toIndentedString(businessCriticalityDescription)).append("\n");
    sb.append("    functionalSuitabilityID: ").append(toIndentedString(functionalSuitabilityID)).append("\n");
    sb.append("    functionalSuitabilityDescription: ").append(toIndentedString(functionalSuitabilityDescription)).append("\n");
    sb.append("    technicalSuitabilityID: ").append(toIndentedString(technicalSuitabilityID)).append("\n");
    sb.append("    technicalSuitabilityDescription: ").append(toIndentedString(technicalSuitabilityDescription)).append("\n");
    sb.append("    objectStatusID: ").append(toIndentedString(objectStatusID)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    completion: ").append(toIndentedString(completion)).append("\n");
    sb.append("    qualitySealExpiry: ").append(toIndentedString(qualitySealExpiry)).append("\n");
    sb.append("    factSheetHasParents: ").append(toIndentedString(factSheetHasParents)).append("\n");
    sb.append("    factSheetHasChildren: ").append(toIndentedString(factSheetHasChildren)).append("\n");
    sb.append("    factSheetHasDocuments: ").append(toIndentedString(factSheetHasDocuments)).append("\n");
    sb.append("    factSheetHasLifecycles: ").append(toIndentedString(factSheetHasLifecycles)).append("\n");
    sb.append("    userSubscriptions: ").append(toIndentedString(userSubscriptions)).append("\n");
    sb.append("    factSheetHasPredecessors: ").append(toIndentedString(factSheetHasPredecessors)).append("\n");
    sb.append("    factSheetHasSuccessors: ").append(toIndentedString(factSheetHasSuccessors)).append("\n");
    sb.append("    factSheetHasRequires: ").append(toIndentedString(factSheetHasRequires)).append("\n");
    sb.append("    factSheetHasRequiredby: ").append(toIndentedString(factSheetHasRequiredby)).append("\n");
    sb.append("    serviceHasBusinessCapabilities: ").append(toIndentedString(serviceHasBusinessCapabilities)).append("\n");
    sb.append("    serviceHasProcesses: ").append(toIndentedString(serviceHasProcesses)).append("\n");
    sb.append("    serviceHasConsumers: ").append(toIndentedString(serviceHasConsumers)).append("\n");
    sb.append("    serviceHasBusinessObjects: ").append(toIndentedString(serviceHasBusinessObjects)).append("\n");
    sb.append("    serviceHasInterfaces: ").append(toIndentedString(serviceHasInterfaces)).append("\n");
    sb.append("    serviceHasProjects: ").append(toIndentedString(serviceHasProjects)).append("\n");
    sb.append("    serviceHasResources: ").append(toIndentedString(serviceHasResources)).append("\n");
    sb.append("    factSheetHasIfaceProviders: ").append(toIndentedString(factSheetHasIfaceProviders)).append("\n");
    sb.append("    factSheetHasIfaceConsumers: ").append(toIndentedString(factSheetHasIfaceConsumers)).append("\n");
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

