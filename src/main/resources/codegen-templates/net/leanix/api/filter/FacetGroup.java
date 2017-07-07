package net.leanix.api.filter;

import java.util.List;

public class FacetGroup {
    private String facetKey;
    private String operator;
    private String facetType;
    private List<FacetListEntry> results;
    private DateFilter dateFilter;
    private SubscriptionFilter subscriptionFilter;
    private FacetSubFilter subFilter;

    public String getFacetKey() {
        return facetKey;
    }

    public void setFacetKey(String facetKey) {
        this.facetKey = facetKey;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getFacetType() {
        return facetType;
    }

    public void setFacetType(String facetType) {
        this.facetType = facetType;
    }

    public List<FacetListEntry> getResults() {
        return results;
    }

    public void setResults(List<FacetListEntry> results) {
        this.results = results;
    }

    public DateFilter getDateFilter() {
        return dateFilter;
    }

    public void setDateFilter(DateFilter dateFilter) {
        this.dateFilter = dateFilter;
    }

    public SubscriptionFilter getSubscriptionFilter() {
        return subscriptionFilter;
    }

    public void setSubscriptionFilter(SubscriptionFilter subscriptionFilter) {
        this.subscriptionFilter = subscriptionFilter;
    }

    public FacetSubFilter getSubFilter() {
        return subFilter;
    }

    public void setSubFilter(FacetSubFilter subFilter) {
        this.subFilter = subFilter;
    }
}