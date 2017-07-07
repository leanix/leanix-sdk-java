package net.leanix.api.filter;

public class SubscriptionFilter {
    public enum SubscriptionType {
        RESPONSIBLE, OBSERVER, ACCOUNTABLE, ALL
    }

    private SubscriptionType type;
    private String roleId;

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }
}