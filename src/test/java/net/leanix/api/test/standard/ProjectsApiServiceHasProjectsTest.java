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
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProjectsApiServiceHasProjectsTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ProjectsApiServiceHasProjectsTest.class);

	protected ProjectsApi getApi() throws Exception
	{
		ProjectsApi api = getProjectsApi();
		return api;
	}

	protected ServicesApi getApiRelated() throws Exception
	{
		ServicesApi api = getServicesApi();
		return api;
	}	

	protected Project newModel()
	{
		return new Project();
	}

	protected Service newModelRelated()
	{
		return new Service();
	}

	protected void setAttributes(ServiceHasProject model)
	{
		// Attributes
	}

	protected void changeAttributes(ServiceHasProject model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasProject a, ServiceHasProject b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getProjectID(), b.getProjectID());
		assertEquals(a.getServiceID(), b.getServiceID());

		// Further attributes		
	}

	protected Project createNewModel(String namePart) throws ApiException, Exception
	{
		Project model = this.newModel();
		model.setName("Project ServiceHasProject" + namePart);


		Project newModel = this.getApi().createProject(model);
		return newModel;
	}

	protected Service createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Service model = this.newModelRelated();
		model.setName("Service ServiceHasProject" + namePart);


		Service newModel = this.getApiRelated().createService(model);
		return newModel;
	}	

	protected ServiceHasProject newRelationModel(Project model, Service refModel)
	{
		ServiceHasProject relationModel = new ServiceHasProject();
		relationModel.setProjectID(model.getID());
		relationModel.setServiceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasProject createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Project model = this.createNewModel(namePart + "A");
		Service modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasProject relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasProject newRelationModel = this.getApi().createServiceHasProject(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasProject newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasProject newGetModel = this.getApi().getServiceHasProject(newRelationModel.getProjectID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasProject newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasProject updatedModel = this.getApi().updateServiceHasProject(newRelationModel.getProjectID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasProject newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasProject(newRelationModel.getProjectID(), newRelationModel.getID());

		List<ServiceHasProject> models = this.getApi().getServiceHasProjects(newRelationModel.getProjectID());
		boolean found = false;
		for (ServiceHasProject s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}