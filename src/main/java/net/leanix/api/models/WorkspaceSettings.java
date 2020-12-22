/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
<<<<<<< HEAD
 * OpenAPI spec version: 5.0.174
 *
=======
 * OpenAPI spec version: 5.0.396
 * 
>>>>>>> release/3.9.30
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.leanix.api.models.Dashboard;
import net.leanix.api.models.Design;
import net.leanix.api.models.HelpSettings;
import net.leanix.api.models.IntegrationsSettings;
import net.leanix.api.models.Metrics;
import net.leanix.api.models.RetentionSettings;
import net.leanix.api.models.SnapshotSettings;
import net.leanix.api.models.SubscriptionSettings;
import net.leanix.api.models.TagSettings;

/**
 * WorkspaceSettings
 */

public class WorkspaceSettings {
  @JsonProperty("subscriptions")
  private SubscriptionSettings subscriptions = null;

  @JsonProperty("tags")
  private TagSettings tags = null;

  @JsonProperty("help")
  private HelpSettings help = null;

  @JsonProperty("snapshot")
  private SnapshotSettings snapshot = null;

  @JsonProperty("integrations")
  private IntegrationsSettings integrations = null;

    @JsonProperty("currency")
    private String currency = null;

    @JsonProperty("language")
    private String language = null;

    @JsonProperty("jsSnippet")
    private String jsSnippet = null;

  @JsonProperty("idleTimeoutMinutes")
  private Integer idleTimeoutMinutes = null;

  @JsonProperty("defaultReportId")
  private String defaultReportId = null;

  /**
   * Gets or Sets dataPrivacy
   */
  public enum DataPrivacyEnum {
    NORMAL("NORMAL"),
    
    RELAXED("RELAXED");

    private String value;

    DataPrivacyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DataPrivacyEnum fromValue(String text) {
      for (DataPrivacyEnum b : DataPrivacyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("dataPrivacy")
  private DataPrivacyEnum dataPrivacy = null;

  /**
   * Gets or Sets completionScore
   */
  public enum CompletionScoreEnum {
    ENABLED("ENABLED"),
    
    DISABLED("DISABLED");

    private String value;

    CompletionScoreEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CompletionScoreEnum fromValue(String text) {
      for (CompletionScoreEnum b : CompletionScoreEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("completionScore")
  private CompletionScoreEnum completionScore = null;

  /**
   * Gets or Sets quickSearchMode
   */
  public enum QuickSearchModeEnum {
    LIST_VIEW("LIST_VIEW"),
    
    GROUPED_VIEW("GROUPED_VIEW");

    private String value;

    QuickSearchModeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static QuickSearchModeEnum fromValue(String text) {
        for (QuickSearchModeEnum b : QuickSearchModeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
  }

  @JsonProperty("quickSearchMode")
  private QuickSearchModeEnum quickSearchMode = null;

  @JsonProperty("design")
  private Design design = null;

  @JsonProperty("metrics")
  private Metrics metrics = null;

  @JsonProperty("smartIndicatorsEnabled")
  private Boolean smartIndicatorsEnabled = false;

  @JsonProperty("dashboards")
  private List<Dashboard> dashboards = new ArrayList<Dashboard>();

  @JsonProperty("retention")
  private RetentionSettings retention = null;

<<<<<<< HEAD
    public WorkspaceSettings subscriptions(SubscriptionSettings subscriptions) {
        this.subscriptions = subscriptions;
        return this;
    }

    /**
     * Get subscriptions
     * @return subscriptions
     **/
    @ApiModelProperty(example = "null", value = "")
    public SubscriptionSettings getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(SubscriptionSettings subscriptions) {
        this.subscriptions = subscriptions;
    }
=======
  public WorkspaceSettings subscriptions(SubscriptionSettings subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public SubscriptionSettings getSubscriptions() {
    return subscriptions;
  }
>>>>>>> release/3.9.30

  public void setSubscriptions(SubscriptionSettings subscriptions) {
    this.subscriptions = subscriptions;
  }

  public WorkspaceSettings tags(TagSettings tags) {
    this.tags = tags;
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public TagSettings getTags() {
    return tags;
  }

  public void setTags(TagSettings tags) {
    this.tags = tags;
  }

<<<<<<< HEAD
    /**
     * Get help
     * @return help
     **/
    @ApiModelProperty(example = "null", value = "")
    public HelpSettings getHelp() {
        return help;
    }
=======
  public WorkspaceSettings help(HelpSettings help) {
    this.help = help;
    return this;
  }

   /**
   * Get help
   * @return help
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public HelpSettings getHelp() {
    return help;
  }
>>>>>>> release/3.9.30

    public void setHelp(HelpSettings help) {
        this.help = help;
    }

    public WorkspaceSettings snapshot(SnapshotSettings snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public SnapshotSettings getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(SnapshotSettings snapshot) {
    this.snapshot = snapshot;
  }

  public WorkspaceSettings integrations(IntegrationsSettings integrations) {
    this.integrations = integrations;
    return this;
  }

   /**
   * Get integrations
   * @return integrations
  **/
  @ApiModelProperty(example = "null", value = "")
  public IntegrationsSettings getIntegrations() {
    return integrations;
  }

  public void setIntegrations(IntegrationsSettings integrations) {
    this.integrations = integrations;
  }

  public WorkspaceSettings currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public WorkspaceSettings language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public WorkspaceSettings jsSnippet(String jsSnippet) {
    this.jsSnippet = jsSnippet;
    return this;
  }

   /**
   * Get jsSnippet
   * @return jsSnippet
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getJsSnippet() {
    return jsSnippet;
  }

  public void setJsSnippet(String jsSnippet) {
    this.jsSnippet = jsSnippet;
  }

  public WorkspaceSettings idleTimeoutMinutes(Integer idleTimeoutMinutes) {
    this.idleTimeoutMinutes = idleTimeoutMinutes;
    return this;
  }

   /**
   * Get idleTimeoutMinutes
   * minimum: 1
   * @return idleTimeoutMinutes
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Integer getIdleTimeoutMinutes() {
    return idleTimeoutMinutes;
  }

  public void setIdleTimeoutMinutes(Integer idleTimeoutMinutes) {
    this.idleTimeoutMinutes = idleTimeoutMinutes;
  }

  public WorkspaceSettings defaultReportId(String defaultReportId) {
    this.defaultReportId = defaultReportId;
    return this;
  }

   /**
   * Get defaultReportId
   * @return defaultReportId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultReportId() {
    return defaultReportId;
  }

  public void setDefaultReportId(String defaultReportId) {
    this.defaultReportId = defaultReportId;
  }

  public WorkspaceSettings dataPrivacy(DataPrivacyEnum dataPrivacy) {
    this.dataPrivacy = dataPrivacy;
    return this;
  }

   /**
   * Get dataPrivacy
   * @return dataPrivacy
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DataPrivacyEnum getDataPrivacy() {
    return dataPrivacy;
  }

  public void setDataPrivacy(DataPrivacyEnum dataPrivacy) {
    this.dataPrivacy = dataPrivacy;
  }

  public WorkspaceSettings completionScore(CompletionScoreEnum completionScore) {
    this.completionScore = completionScore;
    return this;
  }

   /**
   * Get completionScore
   * @return completionScore
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public CompletionScoreEnum getCompletionScore() {
    return completionScore;
  }

  public void setCompletionScore(CompletionScoreEnum completionScore) {
    this.completionScore = completionScore;
  }

  public WorkspaceSettings quickSearchMode(QuickSearchModeEnum quickSearchMode) {
    this.quickSearchMode = quickSearchMode;
    return this;
  }

   /**
   * Get quickSearchMode
   * @return quickSearchMode
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public QuickSearchModeEnum getQuickSearchMode() {
    return quickSearchMode;
  }

  public void setQuickSearchMode(QuickSearchModeEnum quickSearchMode) {
    this.quickSearchMode = quickSearchMode;
  }

  public WorkspaceSettings design(Design design) {
    this.design = design;
    return this;
  }

   /**
   * Get design
   * @return design
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Design getDesign() {
    return design;
  }

  public void setDesign(Design design) {
    this.design = design;
  }

  public WorkspaceSettings metrics(Metrics metrics) {
    this.metrics = metrics;
    return this;
  }

<<<<<<< HEAD
    /**
     * Get metrics
     * @return metrics
     **/
    @ApiModelProperty(example = "null", value = "")
    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }
=======
   /**
   * Get metrics
   * @return metrics
  **/
  @ApiModelProperty(example = "null", value = "")
  public Metrics getMetrics() {
    return metrics;
  }
>>>>>>> release/3.9.30

  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }

  public WorkspaceSettings smartIndicatorsEnabled(Boolean smartIndicatorsEnabled) {
    this.smartIndicatorsEnabled = smartIndicatorsEnabled;
    return this;
  }

   /**
   * Get smartIndicatorsEnabled
   * @return smartIndicatorsEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSmartIndicatorsEnabled() {
    return smartIndicatorsEnabled;
  }

  public void setSmartIndicatorsEnabled(Boolean smartIndicatorsEnabled) {
    this.smartIndicatorsEnabled = smartIndicatorsEnabled;
  }

  public WorkspaceSettings dashboards(List<Dashboard> dashboards) {
    this.dashboards = dashboards;
    return this;
  }

  public WorkspaceSettings addDashboardsItem(Dashboard dashboardsItem) {
    this.dashboards.add(dashboardsItem);
    return this;
  }

    /**
     * Get dashboards
     * @return dashboards
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<Dashboard> getDashboards() {
        return dashboards;
    }

  public void setDashboards(List<Dashboard> dashboards) {
    this.dashboards = dashboards;
  }

  public WorkspaceSettings retention(RetentionSettings retention) {
    this.retention = retention;
    return this;
  }

   /**
   * Get retention
   * @return retention
  **/
  @ApiModelProperty(example = "null", value = "")
  public RetentionSettings getRetention() {
    return retention;
  }

  public void setRetention(RetentionSettings retention) {
    this.retention = retention;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkspaceSettings workspaceSettings = (WorkspaceSettings) o;
    return Objects.equals(this.subscriptions, workspaceSettings.subscriptions) &&
        Objects.equals(this.tags, workspaceSettings.tags) &&
        Objects.equals(this.help, workspaceSettings.help) &&
        Objects.equals(this.snapshot, workspaceSettings.snapshot) &&
        Objects.equals(this.integrations, workspaceSettings.integrations) &&
        Objects.equals(this.currency, workspaceSettings.currency) &&
        Objects.equals(this.language, workspaceSettings.language) &&
        Objects.equals(this.jsSnippet, workspaceSettings.jsSnippet) &&
        Objects.equals(this.idleTimeoutMinutes, workspaceSettings.idleTimeoutMinutes) &&
        Objects.equals(this.defaultReportId, workspaceSettings.defaultReportId) &&
        Objects.equals(this.dataPrivacy, workspaceSettings.dataPrivacy) &&
        Objects.equals(this.completionScore, workspaceSettings.completionScore) &&
        Objects.equals(this.quickSearchMode, workspaceSettings.quickSearchMode) &&
        Objects.equals(this.design, workspaceSettings.design) &&
        Objects.equals(this.metrics, workspaceSettings.metrics) &&
        Objects.equals(this.smartIndicatorsEnabled, workspaceSettings.smartIndicatorsEnabled) &&
        Objects.equals(this.dashboards, workspaceSettings.dashboards) &&
        Objects.equals(this.retention, workspaceSettings.retention);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptions, tags, help, snapshot, integrations, currency, language, jsSnippet, idleTimeoutMinutes, defaultReportId, dataPrivacy, completionScore, quickSearchMode, design, metrics, smartIndicatorsEnabled, dashboards, retention);
  }


  @Override
  public String toString() {
<<<<<<< HEAD
      StringBuilder sb = new StringBuilder();
      sb.append("class WorkspaceSettings {\n");

      sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
      sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
      sb.append("    help: ").append(toIndentedString(help)).append("\n");
      sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
      sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
      sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
      sb.append("    language: ").append(toIndentedString(language)).append("\n");
      sb.append("    jsSnippet: ").append(toIndentedString(jsSnippet)).append("\n");
      sb.append("    idleTimeoutMinutes: ").append(toIndentedString(idleTimeoutMinutes)).append("\n");
      sb.append("    defaultReportId: ").append(toIndentedString(defaultReportId)).append("\n");
      sb.append("    dataPrivacy: ").append(toIndentedString(dataPrivacy)).append("\n");
      sb.append("    quickSearchMode: ").append(toIndentedString(quickSearchMode)).append("\n");
      sb.append("    design: ").append(toIndentedString(design)).append("\n");
      sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
      sb.append("    smartIndicatorsEnabled: ").append(toIndentedString(smartIndicatorsEnabled)).append("\n");
      sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
      sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
      sb.append("}");
      return sb.toString();
=======
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkspaceSettings {\n");
    
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    jsSnippet: ").append(toIndentedString(jsSnippet)).append("\n");
    sb.append("    idleTimeoutMinutes: ").append(toIndentedString(idleTimeoutMinutes)).append("\n");
    sb.append("    defaultReportId: ").append(toIndentedString(defaultReportId)).append("\n");
    sb.append("    dataPrivacy: ").append(toIndentedString(dataPrivacy)).append("\n");
    sb.append("    completionScore: ").append(toIndentedString(completionScore)).append("\n");
    sb.append("    quickSearchMode: ").append(toIndentedString(quickSearchMode)).append("\n");
    sb.append("    design: ").append(toIndentedString(design)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    smartIndicatorsEnabled: ").append(toIndentedString(smartIndicatorsEnabled)).append("\n");
    sb.append("    dashboards: ").append(toIndentedString(dashboards)).append("\n");
    sb.append("    retention: ").append(toIndentedString(retention)).append("\n");
    sb.append("}");
    return sb.toString();
>>>>>>> release/3.9.30
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

