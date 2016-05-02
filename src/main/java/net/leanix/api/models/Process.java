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
import net.leanix.api.models.ProcessHasBusinessCapability;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.models.UserSubscription;






public class Process   {
  
  private String ID = null;
  private String displayName = null;
  private String parentID = null;
  private Long level = null;
  private String name = null;
  private String reference = null;
  private String alias = null;
  private String description = null;
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
  private List<ServiceHasProcess> serviceHasProcesses = new ArrayList<ServiceHasProcess>();
  private List<ProcessHasBusinessCapability> processHasBusinessCapabilities = new ArrayList<ProcessHasBusinessCapability>();

  
  /**
   **/
  public Process ID(String ID) {
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
  public Process displayName(String displayName) {
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
  public Process parentID(String parentID) {
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
  public Process level(Long level) {
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
  public Process name(String name) {
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
  public Process reference(String reference) {
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
  public Process alias(String alias) {
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
  public Process description(String description) {
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
  public Process objectStatusID(String objectStatusID) {
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
  public Process tags(List<String> tags) {
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
  public Process fullName(String fullName) {
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
  public Process resourceType(String resourceType) {
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
  public Process completion(String completion) {
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
  public Process qualitySealExpiry(String qualitySealExpiry) {
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
  public Process factSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
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
  public Process factSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
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
  public Process factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
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
  public Process factSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
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
  public Process userSubscriptions(List<UserSubscription> userSubscriptions) {
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
  public Process factSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
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
  public Process factSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
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
  public Process factSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
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
  public Process factSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
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
  public Process serviceHasProcesses(List<ServiceHasProcess> serviceHasProcesses) {
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
  public Process processHasBusinessCapabilities(List<ProcessHasBusinessCapability> processHasBusinessCapabilities) {
    this.processHasBusinessCapabilities = processHasBusinessCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("processHasBusinessCapabilities")
  public List<ProcessHasBusinessCapability> getProcessHasBusinessCapabilities() {
    return processHasBusinessCapabilities;
  }
  public void setProcessHasBusinessCapabilities(List<ProcessHasBusinessCapability> processHasBusinessCapabilities) {
    this.processHasBusinessCapabilities = processHasBusinessCapabilities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Process process = (Process) o;
    return Objects.equals(this.ID, process.ID) &&
        Objects.equals(this.displayName, process.displayName) &&
        Objects.equals(this.parentID, process.parentID) &&
        Objects.equals(this.level, process.level) &&
        Objects.equals(this.name, process.name) &&
        Objects.equals(this.reference, process.reference) &&
        Objects.equals(this.alias, process.alias) &&
        Objects.equals(this.description, process.description) &&
        Objects.equals(this.objectStatusID, process.objectStatusID) &&
        Objects.equals(this.tags, process.tags) &&
        Objects.equals(this.fullName, process.fullName) &&
        Objects.equals(this.resourceType, process.resourceType) &&
        Objects.equals(this.completion, process.completion) &&
        Objects.equals(this.qualitySealExpiry, process.qualitySealExpiry) &&
        Objects.equals(this.factSheetHasParents, process.factSheetHasParents) &&
        Objects.equals(this.factSheetHasChildren, process.factSheetHasChildren) &&
        Objects.equals(this.factSheetHasDocuments, process.factSheetHasDocuments) &&
        Objects.equals(this.factSheetHasLifecycles, process.factSheetHasLifecycles) &&
        Objects.equals(this.userSubscriptions, process.userSubscriptions) &&
        Objects.equals(this.factSheetHasPredecessors, process.factSheetHasPredecessors) &&
        Objects.equals(this.factSheetHasSuccessors, process.factSheetHasSuccessors) &&
        Objects.equals(this.factSheetHasRequires, process.factSheetHasRequires) &&
        Objects.equals(this.factSheetHasRequiredby, process.factSheetHasRequiredby) &&
        Objects.equals(this.serviceHasProcesses, process.serviceHasProcesses) &&
        Objects.equals(this.processHasBusinessCapabilities, process.processHasBusinessCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, displayName, parentID, level, name, reference, alias, description, objectStatusID, tags, fullName, resourceType, completion, qualitySealExpiry, factSheetHasParents, factSheetHasChildren, factSheetHasDocuments, factSheetHasLifecycles, userSubscriptions, factSheetHasPredecessors, factSheetHasSuccessors, factSheetHasRequires, factSheetHasRequiredby, serviceHasProcesses, processHasBusinessCapabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Process {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    sb.append("    serviceHasProcesses: ").append(toIndentedString(serviceHasProcesses)).append("\n");
    sb.append("    processHasBusinessCapabilities: ").append(toIndentedString(processHasBusinessCapabilities)).append("\n");
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

