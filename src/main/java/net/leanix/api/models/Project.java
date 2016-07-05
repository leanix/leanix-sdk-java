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
import net.leanix.api.models.ProjectHasBusinessCapability;
import net.leanix.api.models.ProjectHasConsumer;
import net.leanix.api.models.ProjectHasProvider;
import net.leanix.api.models.ProjectHasResource;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.models.UserSubscription;






public class Project   {
  
  private String ID = null;
  private String displayName = null;
  private String parentID = null;
  private Long level = null;
  private String name = null;
  private String reference = null;
  private String alias = null;
  private String description = null;
  private Long progress = null;
  private String businessValueID = null;
  private String businessValueDescription = null;
  private String projectRiskID = null;
  private String projectRiskDescription = null;
  private Double budgetOpex = null;
  private Double budgetCapex = null;
  private String costComment = null;
  private Double netPresentValue = null;
  private Double paybackPeriod = null;
  private String benefitComment = null;
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
  private List<ServiceHasProject> serviceHasProjects = new ArrayList<ServiceHasProject>();
  private List<ProjectHasBusinessCapability> projectHasBusinessCapabilities = new ArrayList<ProjectHasBusinessCapability>();
  private List<ProjectHasProvider> projectHasProviders = new ArrayList<ProjectHasProvider>();
  private List<ProjectHasResource> projectHasResources = new ArrayList<ProjectHasResource>();
  private List<ProjectHasConsumer> projectHasConsumers = new ArrayList<ProjectHasConsumer>();

  
  /**
   **/
  public Project ID(String ID) {
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
  public Project displayName(String displayName) {
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
  public Project parentID(String parentID) {
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
  public Project level(Long level) {
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
  public Project name(String name) {
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
  public Project reference(String reference) {
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
  public Project alias(String alias) {
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
  public Project description(String description) {
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
  public Project progress(Long progress) {
    this.progress = progress;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("progress")
  public Long getProgress() {
    return progress;
  }
  public void setProgress(Long progress) {
    this.progress = progress;
  }

  
  /**
   **/
  public Project businessValueID(String businessValueID) {
    this.businessValueID = businessValueID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessValueID")
  public String getBusinessValueID() {
    return businessValueID;
  }
  public void setBusinessValueID(String businessValueID) {
    this.businessValueID = businessValueID;
  }

  
  /**
   **/
  public Project businessValueDescription(String businessValueDescription) {
    this.businessValueDescription = businessValueDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("businessValueDescription")
  public String getBusinessValueDescription() {
    return businessValueDescription;
  }
  public void setBusinessValueDescription(String businessValueDescription) {
    this.businessValueDescription = businessValueDescription;
  }

  
  /**
   **/
  public Project projectRiskID(String projectRiskID) {
    this.projectRiskID = projectRiskID;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectRiskID")
  public String getProjectRiskID() {
    return projectRiskID;
  }
  public void setProjectRiskID(String projectRiskID) {
    this.projectRiskID = projectRiskID;
  }

  
  /**
   **/
  public Project projectRiskDescription(String projectRiskDescription) {
    this.projectRiskDescription = projectRiskDescription;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectRiskDescription")
  public String getProjectRiskDescription() {
    return projectRiskDescription;
  }
  public void setProjectRiskDescription(String projectRiskDescription) {
    this.projectRiskDescription = projectRiskDescription;
  }

  
  /**
   **/
  public Project budgetOpex(Double budgetOpex) {
    this.budgetOpex = budgetOpex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("budgetOpex")
  public Double getBudgetOpex() {
    return budgetOpex;
  }
  public void setBudgetOpex(Double budgetOpex) {
    this.budgetOpex = budgetOpex;
  }

  
  /**
   **/
  public Project budgetCapex(Double budgetCapex) {
    this.budgetCapex = budgetCapex;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("budgetCapex")
  public Double getBudgetCapex() {
    return budgetCapex;
  }
  public void setBudgetCapex(Double budgetCapex) {
    this.budgetCapex = budgetCapex;
  }

  
  /**
   **/
  public Project costComment(String costComment) {
    this.costComment = costComment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("costComment")
  public String getCostComment() {
    return costComment;
  }
  public void setCostComment(String costComment) {
    this.costComment = costComment;
  }

  
  /**
   **/
  public Project netPresentValue(Double netPresentValue) {
    this.netPresentValue = netPresentValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("netPresentValue")
  public Double getNetPresentValue() {
    return netPresentValue;
  }
  public void setNetPresentValue(Double netPresentValue) {
    this.netPresentValue = netPresentValue;
  }

  
  /**
   **/
  public Project paybackPeriod(Double paybackPeriod) {
    this.paybackPeriod = paybackPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("paybackPeriod")
  public Double getPaybackPeriod() {
    return paybackPeriod;
  }
  public void setPaybackPeriod(Double paybackPeriod) {
    this.paybackPeriod = paybackPeriod;
  }

  
  /**
   **/
  public Project benefitComment(String benefitComment) {
    this.benefitComment = benefitComment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("benefitComment")
  public String getBenefitComment() {
    return benefitComment;
  }
  public void setBenefitComment(String benefitComment) {
    this.benefitComment = benefitComment;
  }

  
  /**
   **/
  public Project objectStatusID(String objectStatusID) {
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
  public Project tags(List<String> tags) {
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
  public Project fullName(String fullName) {
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
  public Project resourceType(String resourceType) {
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
  public Project completion(String completion) {
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
  public Project qualitySealExpiry(String qualitySealExpiry) {
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
  public Project modificationTime(String modificationTime) {
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
  public Project factSheetHasParents(List<FactSheetHasParent> factSheetHasParents) {
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
  public Project factSheetHasChildren(List<FactSheetHasChild> factSheetHasChildren) {
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
  public Project factSheetHasDocuments(List<FactSheetHasDocument> factSheetHasDocuments) {
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
  public Project factSheetHasLifecycles(List<FactSheetHasLifecycle> factSheetHasLifecycles) {
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
  public Project userSubscriptions(List<UserSubscription> userSubscriptions) {
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
  public Project factSheetHasPredecessors(List<FactSheetHasPredecessor> factSheetHasPredecessors) {
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
  public Project factSheetHasSuccessors(List<FactSheetHasSuccessor> factSheetHasSuccessors) {
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
  public Project factSheetHasRequires(List<FactSheetHasRequires> factSheetHasRequires) {
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
  public Project factSheetHasRequiredby(List<FactSheetHasRequiredby> factSheetHasRequiredby) {
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
  public Project serviceHasProjects(List<ServiceHasProject> serviceHasProjects) {
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
  public Project projectHasBusinessCapabilities(List<ProjectHasBusinessCapability> projectHasBusinessCapabilities) {
    this.projectHasBusinessCapabilities = projectHasBusinessCapabilities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectHasBusinessCapabilities")
  public List<ProjectHasBusinessCapability> getProjectHasBusinessCapabilities() {
    return projectHasBusinessCapabilities;
  }
  public void setProjectHasBusinessCapabilities(List<ProjectHasBusinessCapability> projectHasBusinessCapabilities) {
    this.projectHasBusinessCapabilities = projectHasBusinessCapabilities;
  }

  
  /**
   **/
  public Project projectHasProviders(List<ProjectHasProvider> projectHasProviders) {
    this.projectHasProviders = projectHasProviders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("projectHasProviders")
  public List<ProjectHasProvider> getProjectHasProviders() {
    return projectHasProviders;
  }
  public void setProjectHasProviders(List<ProjectHasProvider> projectHasProviders) {
    this.projectHasProviders = projectHasProviders;
  }

  
  /**
   **/
  public Project projectHasResources(List<ProjectHasResource> projectHasResources) {
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
  public Project projectHasConsumers(List<ProjectHasConsumer> projectHasConsumers) {
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
    Project project = (Project) o;
    return Objects.equals(this.ID, project.ID) &&
        Objects.equals(this.displayName, project.displayName) &&
        Objects.equals(this.parentID, project.parentID) &&
        Objects.equals(this.level, project.level) &&
        Objects.equals(this.name, project.name) &&
        Objects.equals(this.reference, project.reference) &&
        Objects.equals(this.alias, project.alias) &&
        Objects.equals(this.description, project.description) &&
        Objects.equals(this.progress, project.progress) &&
        Objects.equals(this.businessValueID, project.businessValueID) &&
        Objects.equals(this.businessValueDescription, project.businessValueDescription) &&
        Objects.equals(this.projectRiskID, project.projectRiskID) &&
        Objects.equals(this.projectRiskDescription, project.projectRiskDescription) &&
        Objects.equals(this.budgetOpex, project.budgetOpex) &&
        Objects.equals(this.budgetCapex, project.budgetCapex) &&
        Objects.equals(this.costComment, project.costComment) &&
        Objects.equals(this.netPresentValue, project.netPresentValue) &&
        Objects.equals(this.paybackPeriod, project.paybackPeriod) &&
        Objects.equals(this.benefitComment, project.benefitComment) &&
        Objects.equals(this.objectStatusID, project.objectStatusID) &&
        Objects.equals(this.tags, project.tags) &&
        Objects.equals(this.fullName, project.fullName) &&
        Objects.equals(this.resourceType, project.resourceType) &&
        Objects.equals(this.completion, project.completion) &&
        Objects.equals(this.qualitySealExpiry, project.qualitySealExpiry) &&
        Objects.equals(this.modificationTime, project.modificationTime) &&
        Objects.equals(this.factSheetHasParents, project.factSheetHasParents) &&
        Objects.equals(this.factSheetHasChildren, project.factSheetHasChildren) &&
        Objects.equals(this.factSheetHasDocuments, project.factSheetHasDocuments) &&
        Objects.equals(this.factSheetHasLifecycles, project.factSheetHasLifecycles) &&
        Objects.equals(this.userSubscriptions, project.userSubscriptions) &&
        Objects.equals(this.factSheetHasPredecessors, project.factSheetHasPredecessors) &&
        Objects.equals(this.factSheetHasSuccessors, project.factSheetHasSuccessors) &&
        Objects.equals(this.factSheetHasRequires, project.factSheetHasRequires) &&
        Objects.equals(this.factSheetHasRequiredby, project.factSheetHasRequiredby) &&
        Objects.equals(this.serviceHasProjects, project.serviceHasProjects) &&
        Objects.equals(this.projectHasBusinessCapabilities, project.projectHasBusinessCapabilities) &&
        Objects.equals(this.projectHasProviders, project.projectHasProviders) &&
        Objects.equals(this.projectHasResources, project.projectHasResources) &&
        Objects.equals(this.projectHasConsumers, project.projectHasConsumers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, displayName, parentID, level, name, reference, alias, description, progress, businessValueID, businessValueDescription, projectRiskID, projectRiskDescription, budgetOpex, budgetCapex, costComment, netPresentValue, paybackPeriod, benefitComment, objectStatusID, tags, fullName, resourceType, completion, qualitySealExpiry, modificationTime, factSheetHasParents, factSheetHasChildren, factSheetHasDocuments, factSheetHasLifecycles, userSubscriptions, factSheetHasPredecessors, factSheetHasSuccessors, factSheetHasRequires, factSheetHasRequiredby, serviceHasProjects, projectHasBusinessCapabilities, projectHasProviders, projectHasResources, projectHasConsumers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    parentID: ").append(toIndentedString(parentID)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    businessValueID: ").append(toIndentedString(businessValueID)).append("\n");
    sb.append("    businessValueDescription: ").append(toIndentedString(businessValueDescription)).append("\n");
    sb.append("    projectRiskID: ").append(toIndentedString(projectRiskID)).append("\n");
    sb.append("    projectRiskDescription: ").append(toIndentedString(projectRiskDescription)).append("\n");
    sb.append("    budgetOpex: ").append(toIndentedString(budgetOpex)).append("\n");
    sb.append("    budgetCapex: ").append(toIndentedString(budgetCapex)).append("\n");
    sb.append("    costComment: ").append(toIndentedString(costComment)).append("\n");
    sb.append("    netPresentValue: ").append(toIndentedString(netPresentValue)).append("\n");
    sb.append("    paybackPeriod: ").append(toIndentedString(paybackPeriod)).append("\n");
    sb.append("    benefitComment: ").append(toIndentedString(benefitComment)).append("\n");
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
    sb.append("    serviceHasProjects: ").append(toIndentedString(serviceHasProjects)).append("\n");
    sb.append("    projectHasBusinessCapabilities: ").append(toIndentedString(projectHasBusinessCapabilities)).append("\n");
    sb.append("    projectHasProviders: ").append(toIndentedString(projectHasProviders)).append("\n");
    sb.append("    projectHasResources: ").append(toIndentedString(projectHasResources)).append("\n");
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

