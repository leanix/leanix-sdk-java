package net.leanix.api.filter;

import java.util.List;

public class FacetSubFilter {
    private List<FacetGroup> facetGroups;
    private List<FacetFilter> facetFilters;

    public List<FacetGroup> getFacetGroups() {
        return facetGroups;
    }

    public void setFacetGroups(List<FacetGroup> facetGroups) {
        this.facetGroups = facetGroups;
    }

    public List<FacetFilter> getFacetFilters() {
        return facetFilters;
    }

    public void setFacetFilters(List<FacetFilter> facetFilters) {
        this.facetFilters = facetFilters;
    }
}