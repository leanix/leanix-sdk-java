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
import net.leanix.api.models.Resource;
import net.leanix.api.models.Project;
import net.leanix.api.models.ProjectHasResource;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiProjectHasResourcesTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourcesApiProjectHasResourcesTest.class);

	protected ResourcesApi getApi() throws Exception
	{
		ResourcesApi api = getResourcesApi();
		return api;
	}

	protected ProjectsApi getApiRelated() throws Exception
	{
		ProjectsApi api = getProjectsApi();
		return api;
	}	

	protected Resource newModel()
	{
		return new Resource();
	}

	protected Project newModelRelated()
	{
		return new Project();
	}

	protected void setAttributes(ProjectHasResource model)
	{
		// Attributes
	}

	protected void changeAttributes(ProjectHasResource model)
	{
		// Attributes
	}

	protected void assertEqual(ProjectHasResource a, ProjectHasResource b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getResourceID(), b.getResourceID());
		assertEquals(a.getProjectID(), b.getProjectID());

		// Further attributes		
	}

	protected Resource createNewModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModel();
		model.setName("Resource ProjectHasResource" + namePart);


		Resource newModel = this.getApi().createResource(model);
		return newModel;
	}

	protected Project createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Project model = this.newModelRelated();
		model.setName("Project ProjectHasResource" + namePart);


		Project newModel = this.getApiRelated().createProject(model);
		return newModel;
	}	

	protected ProjectHasResource newRelationModel(Resource model, Project refModel)
	{
		ProjectHasResource relationModel = new ProjectHasResource();
		relationModel.setResourceID(model.getID());
		relationModel.setProjectID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ProjectHasResource createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.createNewModel(namePart + "A");
		Project modelRelated = this.createNewModelRelated(namePart + "B");

		ProjectHasResource relationModel = this.newRelationModel(model, modelRelated);

		ProjectHasResource newRelationModel = this.getApi().createProjectHasResource(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ProjectHasResource newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ProjectHasResource newGetModel = this.getApi().getProjectHasResource(newRelationModel.getResourceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ProjectHasResource newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ProjectHasResource updatedModel = this.getApi().updateProjectHasResource(newRelationModel.getResourceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ProjectHasResource newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteProjectHasResource(newRelationModel.getResourceID(), newRelationModel.getID());

		List<ProjectHasResource> models = this.getApi().getProjectHasResources(newRelationModel.getResourceID());
		boolean found = false;
		for (ProjectHasResource s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}