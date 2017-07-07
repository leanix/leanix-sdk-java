package net.leanix.api.filter;

import java.util.List;

public class FacetFilter {
    private String facetKey;
    private List<String> keys;
    private String operator;
    private DateFilter dateFilter;
    private SubscriptionFilter subscriptionFilter;
    private List<FacetFilter> subFilter;

    public String getFacetKey() {
        return facetKey;
    }

    public void setFacetKey(String facetKey) {
        this.facetKey = facetKey;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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

    public List<FacetFilter> getSubFilter() {
        return subFilter;
    }

    public void setSubFilter(List<FacetFilter> subFilter) {
        this.subFilter = subFilter;
    }
}