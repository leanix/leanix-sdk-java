package net.leanix.api.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.leanix.api.WorkspacesApi;
import net.leanix.api.common.*;
import net.leanix.api.models.*;

import org.junit.rules.*;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class WorkspaceSetupRule extends ExternalResource
{
	protected String apiSetup = "{\"featureBundleID\":\"professional-v1\"}";

	protected boolean cleanUpWorkspace = true;

	protected ApiClient apiClient = null;
	protected Workspace workspace = null;
	final Logger logger = LoggerFactory.getLogger(WorkspaceSetupRule.class);
	
	protected String getProperty(String key, String defaultValue) throws Exception
	{
		String value = System.getProperty(key);
		if (value == null && defaultValue == null)
			throw new Exception("Property " + key + " not set and no default given");
		
		if (value == null)
			value = defaultValue;
		
		return value;
	}
	
	protected String getProperty(String key) throws Exception
	{
		return this.getProperty(key, null);
	}
	
	protected String getApiWorkspace() throws Exception
	{
		return this.getProperty("api.workspace", "demo");
	}
	
	protected String getApiKey() throws Exception
	{
		return this.getProperty("api.key");
	}
	
	protected String createApiUrl(String workspace) throws Exception
	{
		return this.getProperty("api.baseurl") + "/" + workspace + "/api/" + this.getProperty("api.version", "v1");
	}

	@Override
	protected void before() throws Throwable
	{
		this.workspace = this.createNewWorkspace();
	}

	@Override
	protected void after()
	{
		try
		{
			if (this.cleanUpWorkspace)
			{
				this.deleteWorkspace(this.workspace);
			}
		}
		catch (Exception e)
		{
			logger.error("Unable to delete workspace with ID = " + this.workspace.getID());
			e.printStackTrace();
		}
	}

	protected Workspace createNewWorkspace() throws Exception
	{
		Workspace workspace = null;

		ApiClient bootstrapClient = this.createApiClient(this.getApiWorkspace());
		WorkspacesApi workspacesApi = new WorkspacesApi(bootstrapClient);

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		String newWorkspaceName = "testjava" + format.format(new Date());
		logger.info("New Workspace name = " + newWorkspaceName);

		Workspace newWorkspace = new Workspace();
		newWorkspace.setSetup(this.apiSetup);
		newWorkspace.setName(newWorkspaceName);

		workspace = workspacesApi.createWorkspace(newWorkspace);
		logger.info("Workspace created under ID = " + workspace.getID());

		bootstrapClient = this.createApiClient(newWorkspaceName);
		workspacesApi = new WorkspacesApi(bootstrapClient);
		Workspace w = workspacesApi.getWorkspace(workspace.getID(), false);
		if (w == null)
		{
			throw new Exception("Workspace not found");
		}

		return workspace;
	}

	protected void deleteWorkspace(Workspace workspace) throws Exception
	{
		if (workspace == null || workspace.getID() == null)
		{
			throw new Exception("Workspace must be set");
		}

		ApiClient bootstrapClient = this.createApiClient(this.getApiWorkspace());
		WorkspacesApi workspacesApi = new WorkspacesApi(bootstrapClient);
		try
		{
			workspacesApi.deleteWorkspace(workspace.getID());
			logger.info("Workspace deleted = " + workspace.getID());
		}
		catch (ApiException e)
		{
			logger.error("Unable to delete workspace with ID = " + workspace.getID());
			e.printStackTrace();
		}
	}

	protected ApiClient createApiClient(String workspace) throws Exception
	{
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath(this.createApiUrl(workspace));
		apiClient.setApiKey(this.getApiKey());

		return apiClient;
	}

	public ApiClient getApiClient() throws Exception
	{
		if (apiClient == null)
		{
			if (this.workspace == null)
			{
				throw new Exception("Workspace is not set");
			}

			apiClient = this.createApiClient(this.workspace.getName());
		}
		return apiClient;
	}
}
