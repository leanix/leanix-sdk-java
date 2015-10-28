package net.leanix.api.test;

import net.leanix.api.common.ApiClient;

import org.junit.ClassRule;

public class NotSuiteBasedTestBase {
    @ClassRule
    public static WorkspaceSetupRule workspaceSetupRule = new WorkspaceSetupRule();

    protected ApiClient getApiClient() {
        return workspaceSetupRule.getLeanixApiClient();
    }
}
