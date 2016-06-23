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
import net.leanix.api.models.IfaceHasBusinessObject;
import net.leanix.api.models.IfaceHasResource;
import net.leanix.api.models.UserSubscription;






public class Iface   {
  
  private String ID = null;
  private String displayName = null;
  private String parentID = null;
  private Long level = null;
  private String release = null;
  private String name = null;
  private String reference = null;
  private String alias = null;
  private String description = null;
  private String interfaceTypeID = null;
  private String interfaceFrequencyID = null;
  private String interfaceDirectionID = null;
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
  private List<FactSheetHasIfaceProvider> factSheetHasIfaceProviders = new ArrayList<FactSheetHasIfaceProvider>();
  private List<FactSheetHasIfaceConsumer> factSheetHasIfaceConsumers = new ArrayList<FactSheetHasIfaceConsumer>();
  private List<IfaceHasBusinessObject> ifaceHasBusinessObjects = new ArrayList<IfaceHasBusinessObject>();
  private List<IfaceHasResource> ifaceHasResources = new ArrayList<IfaceHasResource>();

  
  /**
   **/
  public Iface ID(String ID) {
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
  public Iface displayName(String displayName) {
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
  public Iface parentID(String parentID) {
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
  public Iface level(Long level) {
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
  public Iface release(String release) {
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
  public Iface name(String name) {
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
  public Iface reference(String reference) {
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
  public Iface alias(String alias) {
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
  public Iface description(String description) {
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
  public Iface interfaceTypeID(String interfaceTypeID) {
    this.interfaceTypeID = interfaceTypeID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceTypeID")
  public String getInterfaceTypeID() {
    return interfaceTypeID;
  }
  public void setInterfaceTypeID(String interfaceTypeID) {
    this.interfaceTypeID = interfaceTypeID;
  }

  
  /**
   **/
  public Iface interfaceFrequencyID(String interfaceFrequencyID) {
    this.interfaceFrequencyID = interfaceFrequencyID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceFrequencyID")
  public String getInterfaceFrequencyID() {
    return interfaceFrequencyID;
  }
  public void setInterfaceFrequencyID(String interfaceFrequencyID) {
    this.interfaceFrequencyID = interfaceFrequencyID;
  }

  
  /**
   **/
  public Iface interfaceDirectionID(String interfaceDirectionID) {
    this.interfaceDirectionID = interfaceDirectionID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("interfaceDirectionID")
  public String getInterfaceDirectionID() {
    return interfaceDirectionID;
  }
  public void setInterfaceDirectionID(String interfaceDirectionID) {
    this.interfaceDirectionID = interfaceDirectionID;
  }

  
  /**
   **/
  public Iface objectStatusID(String objectStatusID) {
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
  public Iface tags(List<String> tags) {
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
  public Iface fullName(String fullName) {
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
  public Iface resourceType(String resourceType) {
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
  public Iface completion(String completion) {
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
  public Iface qualitySealExpiry(String qualitySealExpiry) {
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
  public Iface modificationTime(String modificationTime) {
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
  public Iface factSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
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
  public Iface factSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
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
  public Iface factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
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
  public Iface factSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
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
  public Iface userSubscriptions(List<UserSubscription> userSubscriptions) {
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
  public Iface factSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
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
  public Iface factSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
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
  public Iface factSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
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
  public Iface factSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
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
  public Iface factSheetHasIfaceProviders(List<FactSheetHasIfaceProvider> factSheetHasIfaceProviders) {
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
  public Iface factSheetHasIfaceConsumers(List<FactSheetHasIfaceConsumer> factSheetHasIfaceConsumers) {
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

  
  /**
   **/
  public Iface ifaceHasBusinessObjects(List<IfaceHasBusinessObject> ifaceHasBusinessObjects) {
    this.ifaceHasBusinessObjects = ifaceHasBusinessObjects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("ifaceHasBusinessObjects")
  public List<IfaceHasBusinessObject> getIfaceHasBusinessObjects() {
    return ifaceHasBusinessObjects;
  }
  public void setIfaceHasBusinessObjects(List<IfaceHasBusinessObject> ifaceHasBusinessObjects) {
    this.ifaceHasBusinessObjects = ifaceHasBusinessObjects;
  }

  
  /**
   **/
  public Iface ifaceHasResources(List<IfaceHasResource> ifaceHasResources) {
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
    Iface iface = (Iface) o;
    return Objects.equals(this.ID, iface.ID) &&
        Objects.equals(this.displayName, iface.displayName) &&
        Objects.equals(this.parentID, iface.parentID) &&
        Objects.equals(this.level, iface.level) &&
        Objects.equals(this.release, iface.release) &&
        Objects.equals(this.name, iface.name) &&
        Objects.equals(this.reference, iface.reference) &&
        Objects.equals(this.alias, iface.alias) &&
        Objects.equals(this.description, iface.description) &&
        Objects.equals(this.interfaceTypeID, iface.interfaceTypeID) &&
        Objects.equals(this.interfaceFrequencyID, iface.interfaceFrequencyID) &&
        Objects.equals(this.interfaceDirectionID, iface.interfaceDirectionID) &&
        Objects.equals(this.objectStatusID, iface.objectStatusID) &&
        Objects.equals(this.tags, iface.tags) &&
        Objects.equals(this.fullName, iface.fullName) &&
        Objects.equals(this.resourceType, iface.resourceType) &&
        Objects.equals(this.completion, iface.completion) &&
        Objects.equals(this.qualitySealExpiry, iface.qualitySealExpiry) &&
        Objects.equals(this.modificationTime, iface.modificationTime) &&
        Objects.equals(this.factSheetHasParents, iface.factSheetHasParents) &&
        Objects.equals(this.factSheetHasChildren, iface.factSheetHasChildren) &&
        Objects.equals(this.factSheetHasDocuments, iface.factSheetHasDocuments) &&
        Objects.equals(this.factSheetHasLifecycles, iface.factSheetHasLifecycles) &&
        Objects.equals(this.userSubscriptions, iface.userSubscriptions) &&
        Objects.equals(this.factSheetHasPredecessors, iface.factSheetHasPredecessors) &&
        Objects.equals(this.factSheetHasSuccessors, iface.factSheetHasSuccessors) &&
        Objects.equals(this.factSheetHasRequires, iface.factSheetHasRequires) &&
        Objects.equals(this.factSheetHasRequiredby, iface.factSheetHasRequiredby) &&
        Objects.equals(this.factSheetHasIfaceProviders, iface.factSheetHasIfaceProviders) &&
        Objects.equals(this.factSheetHasIfaceConsumers, iface.factSheetHasIfaceConsumers) &&
        Objects.equals(this.ifaceHasBusinessObjects, iface.ifaceHasBusinessObjects) &&
        Objects.equals(this.ifaceHasResources, iface.ifaceHasResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, displayName, parentID, level, release, name, reference, alias, description, interfaceTypeID, interfaceFrequencyID, interfaceDirectionID, objectStatusID, tags, fullName, resourceType, completion, qualitySealExpiry, modificationTime, factSheetHasParents, factSheetHasChildren, factSheetHasDocuments, factSheetHasLifecycles, userSubscriptions, factSheetHasPredecessors, factSheetHasSuccessors, factSheetHasRequires, factSheetHasRequiredby, factSheetHasIfaceProviders, factSheetHasIfaceConsumers, ifaceHasBusinessObjects, ifaceHasResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Iface {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    interfaceTypeID: ").append(toIndentedString(interfaceTypeID)).append("\n");
    sb.append("    interfaceFrequencyID: ").append(toIndentedString(interfaceFrequencyID)).append("\n");
    sb.append("    interfaceDirectionID: ").append(toIndentedString(interfaceDirectionID)).append("\n");
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
    sb.append("    factSheetHasIfaceProviders: ").append(toIndentedString(factSheetHasIfaceProviders)).append("\n");
    sb.append("    factSheetHasIfaceConsumers: ").append(toIndentedString(factSheetHasIfaceConsumers)).append("\n");
    sb.append("    ifaceHasBusinessObjects: ").append(toIndentedString(ifaceHasBusinessObjects)).append("\n");
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

