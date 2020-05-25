/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.170
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ImpactManagementDefinition
 */

public class ImpactManagementDefinition {

    @JsonProperty("enabled")
    private Boolean enabled = false;

    @JsonProperty("impactDisplayingSubtypes")
    private List<String> impactDisplayingSubtypes = new ArrayList<String>();

    @JsonProperty("impactDefiningSubtypes")
    private List<String> impactDefiningSubtypes = new ArrayList<String>();

    public ImpactManagementDefinition enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get enabled
     * @return enabled
     **/
    @ApiModelProperty(example = "null", value = "")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ImpactManagementDefinition impactDisplayingSubtypes(List<String> impactDisplayingSubtypes) {
        this.impactDisplayingSubtypes = impactDisplayingSubtypes;
        return this;
    }

    public ImpactManagementDefinition addImpactDisplayingSubtypesItem(String impactDisplayingSubtypesItem) {
        this.impactDisplayingSubtypes.add(impactDisplayingSubtypesItem);
        return this;
    }

    /**
     * Get impactDisplayingSubtypes
     * @return impactDisplayingSubtypes
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<String> getImpactDisplayingSubtypes() {
        return impactDisplayingSubtypes;
    }

    public void setImpactDisplayingSubtypes(List<String> impactDisplayingSubtypes) {
        this.impactDisplayingSubtypes = impactDisplayingSubtypes;
    }

    public ImpactManagementDefinition impactDefiningSubtypes(List<String> impactDefiningSubtypes) {
        this.impactDefiningSubtypes = impactDefiningSubtypes;
        return this;
    }

    public ImpactManagementDefinition addImpactDefiningSubtypesItem(String impactDefiningSubtypesItem) {
        this.impactDefiningSubtypes.add(impactDefiningSubtypesItem);
        return this;
    }

    /**
     * Get impactDefiningSubtypes
     * @return impactDefiningSubtypes
     **/
    @ApiModelProperty(example = "null", value = "")
    public List<String> getImpactDefiningSubtypes() {
        return impactDefiningSubtypes;
    }

    public void setImpactDefiningSubtypes(List<String> impactDefiningSubtypes) {
        this.impactDefiningSubtypes = impactDefiningSubtypes;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImpactManagementDefinition impactManagementDefinition = (ImpactManagementDefinition) o;
        return Objects.equals(this.enabled, impactManagementDefinition.enabled) &&
            Objects.equals(this.impactDisplayingSubtypes, impactManagementDefinition.impactDisplayingSubtypes) &&
            Objects.equals(this.impactDefiningSubtypes, impactManagementDefinition.impactDefiningSubtypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, impactDisplayingSubtypes, impactDefiningSubtypes);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImpactManagementDefinition {\n");

        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    impactDisplayingSubtypes: ").append(toIndentedString(impactDisplayingSubtypes)).append("\n");
        sb.append("    impactDefiningSubtypes: ").append(toIndentedString(impactDefiningSubtypes)).append("\n");
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
