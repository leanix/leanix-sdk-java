package net.leanix.benchmark;

import java.util.List;

import net.leanix.api.WorkspacesApi;
import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.Workspace;

public class WorkspaceHelper {

    private final String workspaceName;
    private final WorkspacesApi workspacesApi;

    public WorkspaceHelper(ApiClient apiClient, String workspaceName) {
        super();
        this.workspaceName = workspaceName;
        workspacesApi = new WorkspacesApi(apiClient);
    }

    /**
     * Creates a new workspace or takes care that an old one with name {@linkplain #workspaceName} already exists.
     * 
     * @return <code>true</code> if the workspace already exists
     * @throws ApiException
     */
    public boolean createWorkspace() throws ApiException {
        List<Workspace> workspaces = workspacesApi.getWorkspaces(false);
        for (Workspace workspace : workspaces) {
            System.out.println(String.format("Found workspace: %s", workspace.getName()));
            if (workspace.getName().equals(workspaceName)) {
                return true;
            }
        }

        // create a new workspace with required name
        // TODO: create new workspace here...
        throw new RuntimeException("TODO: call api to create new workspace here...");
    }
}
