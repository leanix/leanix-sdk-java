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

import static org.junit.Assert.*;

import java.util.List;

import net.leanix.api.common.*;
import net.leanix.api.models.Project;
import net.leanix.api.models.Provider;
import net.leanix.api.models.ProjectHasProvider;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectsApiProjectHasProvidersTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ProjectsApiProjectHasProvidersTest.class);

	protected ProjectsApi getApi() throws Exception
	{
		ProjectsApi api = getProjectsApi();
		return api;
	}

	protected ProvidersApi getApiRelated() throws Exception
	{
		ProvidersApi api = getProvidersApi();
		return api;
	}	

	protected Project newModel()
	{
		return new Project();
	}

	protected Provider newModelRelated()
	{
		return new Provider();
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
		assertEquals(a.getProjectID(), b.getProjectID());
		assertEquals(a.getProviderID(), b.getProviderID());

		// Further attributes		
	}

	protected Project createNewModel(String namePart) throws ApiException, Exception
	{
		Project model = this.newModel();
		model.setName("Project ProjectHasProvider" + namePart);


		Project newModel = this.getApi().createProject(model);
		return newModel;
	}

	protected Provider createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Provider model = this.newModelRelated();
		model.setName("Provider ProjectHasProvider" + namePart);


		Provider newModel = this.getApiRelated().createProvider(model);
		return newModel;
	}	

	protected ProjectHasProvider newRelationModel(Project model, Provider refModel)
	{
		ProjectHasProvider relationModel = new ProjectHasProvider();
		relationModel.setProjectID(model.getID());
		relationModel.setProviderID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ProjectHasProvider createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Project model = this.createNewModel(namePart + "A");
		Provider modelRelated = this.createNewModelRelated(namePart + "B");

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

		ProjectHasProvider newGetModel = this.getApi().getProjectHasProvider(newRelationModel.getProjectID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ProjectHasProvider newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ProjectHasProvider updatedModel = this.getApi().updateProjectHasProvider(newRelationModel.getProjectID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ProjectHasProvider newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteProjectHasProvider(newRelationModel.getProjectID(), newRelationModel.getID());

		List<ProjectHasProvider> models = this.getApi().getProjectHasProviders(newRelationModel.getProjectID());
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