/*
* The MIT License (MIT)	 
*
* Copyright (c) 2014 LeanIX GmbH
* 
* Permission is hereby granted, free of charge, to any person obtaining a copy of
* this software and associated documentation files (the "Software"), to deal in
* the Software without restriction, including without limitation the rights to
* use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
* the Software, and to permit persons to whom the Software is furnished to do so,
* subject to the following conditions:
* 
* The above copyright notice and this permission notice shall be included in all
* copies or substantial portions of the Software.
* 
* THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
* IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
* FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
* COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
* IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
* CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
*/

package net.leanix.api.test.standard;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import net.leanix.api.ProjectsApi;
import net.leanix.api.ProvidersApi;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.Project;
import net.leanix.api.models.ProjectHasProvider;
import net.leanix.api.models.Provider;
import net.leanix.api.test.WorkspaceSetupRule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProvidersApiProjectHasProvidersTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ProvidersApiProjectHasProvidersTest.class);

	protected ProvidersApi getApi() throws Exception
	{
		ProvidersApi api = new ProvidersApi(setup.getApiClient());
		return api;
	}

	protected ProjectsApi getApiRelated() throws Exception
	{
		ProjectsApi api = new ProjectsApi(setup.getApiClient());
		return api;
	}	

	protected Provider newModel()
	{
		return new Provider();
	}

	protected Project newModelRelated()
	{
		return new Project();
	}

	protected void setAttributes(ProjectHasProvider model)
	{
		// Attributes
	}

	protected void changeAttributes(ProjectHasProvider model)
	{
		// Attributes
	}

	protected void assertEqual(ProjectHasProvider a, ProjectHasProvider b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getProviderID(), b.getProviderID());
		assertEquals(a.getProjectID(), b.getProjectID());

		// Further attributes		
	}

	protected Provider createNewModel(String namePart) throws ApiException, Exception
	{
		Provider model = this.newModel();
		model.setName("Provider ProjectHasProvider" + namePart);


		Provider newModel = this.getApi().createProvider(model);
		return newModel;
	}

	protected Project createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Project model = this.newModelRelated();
		model.setName("Project ProjectHasProvider" + namePart);


		Project newModel = this.getApiRelated().createProject(model);
		return newModel;
	}	

	protected ProjectHasProvider newRelationModel(Provider model, Project refModel)
	{
		ProjectHasProvider relationModel = new ProjectHasProvider();
		relationModel.setProviderID(model.getID());
		relationModel.setProjectID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ProjectHasProvider createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Provider model = this.createNewModel(namePart + "A");
		Project modelRelated = this.createNewModelRelated(namePart + "B");

		ProjectHasProvider relationModel = this.newRelationModel(model, modelRelated);

		ProjectHasProvider newRelationModel = this.getApi().createProjectHasProvider(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ProjectHasProvider newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ProjectHasProvider newGetModel = this.getApi().getProjectHasProvider(newRelationModel.getProviderID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ProjectHasProvider newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ProjectHasProvider updatedModel = this.getApi().updateProjectHasProvider(newRelationModel.getProviderID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ProjectHasProvider newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteProjectHasProvider(newRelationModel.getProviderID(), newRelationModel.getID());

		List<ProjectHasProvider> models = this.getApi().getProjectHasProviders(newRelationModel.getProviderID());
		boolean found = false;
		for (ProjectHasProvider s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}
