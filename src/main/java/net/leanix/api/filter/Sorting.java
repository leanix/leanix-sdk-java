package net.leanix.api.filter;

public class Sorting {
    public enum SortingMode {
        BY_FIELD, BY_LIFECYCLE_LAST_PHASE
    }

    public enum SortingOrder {
        ASC, DESC
    }

    private SortingMode mode;
    private String key;
    private SortingOrder order;

    public SortingMode getMode() {
        return mode;
    }

    public void setMode(SortingMode mode) {
        this.mode = mode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public SortingOrder getOrder() {
        return order;
    }

    public void setOrder(SortingOrder order) {
        this.order = order;
    }
}