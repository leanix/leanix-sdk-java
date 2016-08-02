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
import net.leanix.api.models.ProjectHasConsumer;
import net.leanix.api.models.ResourceHasConsumer;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.models.UserSubscription;






public class Consumer   {
  
  private String ID = null;
  private String displayName = null;
  private String parentID = null;
  private Long level = null;
  private String name = null;
  private String reference = null;
  private String alias = null;
  private String description = null;
  private String nickname = null;
  private String teamID = null;
  private String email = null;
  private String sapID = null;
  private String locationID = null;
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
  private List<ServiceHasConsumer> serviceHasConsumers = new ArrayList<ServiceHasConsumer>();
  private List<ResourceHasConsumer> resourceHasConsumers = new ArrayList<ResourceHasConsumer>();
  private List<ProjectHasConsumer> projectHasConsumers = new ArrayList<ProjectHasConsumer>();

  
  /**
   **/
  public Consumer ID(String ID) {
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
  public Consumer displayName(String displayName) {
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
  public Consumer parentID(String parentID) {
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
  public Consumer level(Long level) {
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
  public Consumer name(String name) {
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
  public Consumer reference(String reference) {
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
  public Consumer alias(String alias) {
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
  public Consumer description(String description) {
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
  public Consumer nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nickname")
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  
  /**
   **/
  public Consumer teamID(String teamID) {
    this.teamID = teamID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("teamID")
  public String getTeamID() {
    return teamID;
  }
  public void setTeamID(String teamID) {
    this.teamID = teamID;
  }

  
  /**
   **/
  public Consumer email(String email) {
    this.email = email;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   **/
  public Consumer sapID(String sapID) {
    this.sapID = sapID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sapID")
  public String getSapID() {
    return sapID;
  }
  public void setSapID(String sapID) {
    this.sapID = sapID;
  }

  
  /**
   **/
  public Consumer locationID(String locationID) {
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
  public Consumer objectStatusID(String objectStatusID) {
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
  public Consumer tags(List<String> tags) {
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
  public Consumer fullName(String fullName) {
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
  public Consumer resourceType(String resourceType) {
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
  public Consumer completion(String completion) {
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
  public Consumer qualitySealExpiry(String qualitySealExpiry) {
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
  public Consumer modificationTime(String modificationTime) {
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
  public Consumer factSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
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
  public Consumer factSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
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
  public Consumer factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
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
  public Consumer factSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
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
  public Consumer userSubscriptions(List<UserSubscription> userSubscriptions) {
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
  public Consumer factSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
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
  public Consumer factSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
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
  public Consumer factSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
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
  public Consumer factSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
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
  public Consumer serviceHasConsumers(List<ServiceHasConsumer> serviceHasConsumers) {
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
  public Consumer resourceHasConsumers(List<ResourceHasConsumer> resourceHasConsumers) {
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
  public Consumer projectHasConsumers(List<ProjectHasConsumer> projectHasConsumers) {
    this.projectHasConsumers = projectHasConsumers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectHasConsumers")
  public List<ProjectHasConsumer> getProjectHasConsumers() {
    return projectHasConsumers;
  }
  public void setProjectHasConsumers(List<ProjectHasConsumer> projectHasConsumers) {
    this.projectHasConsumers = projectHasConsumers;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Consumer consumer = (Consumer) o;
    return Objects.equals(this.ID, consumer.ID) &&
        Objects.equals(this.displayName, consumer.displayName) &&
        Objects.equals(this.parentID, consumer.parentID) &&
        Objects.equals(this.level, consumer.level) &&
        Objects.equals(this.name, consumer.name) &&
        Objects.equals(this.reference, consumer.reference) &&
        Objects.equals(this.alias, consumer.alias) &&
        Objects.equals(this.description, consumer.description) &&
        Objects.equals(this.nickname, consumer.nickname) &&
        Objects.equals(this.teamID, consumer.teamID) &&
        Objects.equals(this.email, consumer.email) &&
        Objects.equals(this.sapID, consumer.sapID) &&
        Objects.equals(this.locationID, consumer.locationID) &&
        Objects.equals(this.objectStatusID, consumer.objectStatusID) &&
        Objects.equals(this.tags, consumer.tags) &&
        Objects.equals(this.fullName, consumer.fullName) &&
        Objects.equals(this.resourceType, consumer.resourceType) &&
        Objects.equals(this.completion, consumer.completion) &&
        Objects.equals(this.qualitySealExpiry, consumer.qualitySealExpiry) &&
        Objects.equals(this.modificationTime, consumer.modificationTime) &&
        Objects.equals(this.factSheetHasParents, consumer.factSheetHasParents) &&
        Objects.equals(this.factSheetHasChildren, consumer.factSheetHasChildren) &&
        Objects.equals(this.factSheetHasDocuments, consumer.factSheetHasDocuments) &&
        Objects.equals(this.factSheetHasLifecycles, consumer.factSheetHasLifecycles) &&
        Objects.equals(this.userSubscriptions, consumer.userSubscriptions) &&
        Objects.equals(this.factSheetHasPredecessors, consumer.factSheetHasPredecessors) &&
        Objects.equals(this.factSheetHasSuccessors, consumer.factSheetHasSuccessors) &&
        Objects.equals(this.factSheetHasRequires, consumer.factSheetHasRequires) &&
        Objects.equals(this.factSheetHasRequiredby, consumer.factSheetHasRequiredby) &&
        Objects.equals(this.serviceHasConsumers, consumer.serviceHasConsumers) &&
        Objects.equals(this.resourceHasConsumers, consumer.resourceHasConsumers) &&
        Objects.equals(this.projectHasConsumers, consumer.projectHasConsumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, displayName, parentID, level, name, reference, alias, description, nickname, teamID, email, sapID, locationID, objectStatusID, tags, fullName, resourceType, completion, qualitySealExpiry, modificationTime, factSheetHasParents, factSheetHasChildren, factSheetHasDocuments, factSheetHasLifecycles, userSubscriptions, factSheetHasPredecessors, factSheetHasSuccessors, factSheetHasRequires, factSheetHasRequiredby, serviceHasConsumers, resourceHasConsumers, projectHasConsumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Consumer {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    teamID: ").append(toIndentedString(teamID)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    sapID: ").append(toIndentedString(sapID)).append("\n");
    sb.append("    locationID: ").append(toIndentedString(locationID)).append("\n");
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
    sb.append("    serviceHasConsumers: ").append(toIndentedString(serviceHasConsumers)).append("\n");
    sb.append("    resourceHasConsumers: ").append(toIndentedString(resourceHasConsumers)).append("\n");
    sb.append("    projectHasConsumers: ").append(toIndentedString(projectHasConsumers)).append("\n");
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

