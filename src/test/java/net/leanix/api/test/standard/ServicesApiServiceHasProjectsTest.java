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
import net.leanix.api.models.Service;
import net.leanix.api.models.Project;
import net.leanix.api.models.ServiceHasProject;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServicesApiServiceHasProjectsTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ServicesApiServiceHasProjectsTest.class);

	protected ServicesApi getApi() throws Exception
	{
		ServicesApi api = getServicesApi();
		return api;
	}

	protected ProjectsApi getApiRelated() throws Exception
	{
		ProjectsApi api = getProjectsApi();
		return api;
	}	

	protected Service newModel()
	{
		return new Service();
	}

	protected Project newModelRelated()
	{
		return new Project();
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
		assertEquals(a.getServiceID(), b.getServiceID());
		assertEquals(a.getProjectID(), b.getProjectID());

		// Further attributes		
	}

	protected Service createNewModel(String namePart) throws ApiException, Exception
	{
		Service model = this.newModel();
		model.setName("Service ServiceHasProject" + namePart);


		Service newModel = this.getApi().createService(model);
		return newModel;
	}

	protected Project createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Project model = this.newModelRelated();
		model.setName("Project ServiceHasProject" + namePart);


		Project newModel = this.getApiRelated().createProject(model);
		return newModel;
	}	

	protected ServiceHasProject newRelationModel(Service model, Project refModel)
	{
		ServiceHasProject relationModel = new ServiceHasProject();
		relationModel.setServiceID(model.getID());
		relationModel.setProjectID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasProject createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Service model = this.createNewModel(namePart + "A");
		Project modelRelated = this.createNewModelRelated(namePart + "B");

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

		ServiceHasProject newGetModel = this.getApi().getServiceHasProject(newRelationModel.getServiceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasProject newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasProject updatedModel = this.getApi().updateServiceHasProject(newRelationModel.getServiceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasProject newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasProject(newRelationModel.getServiceID(), newRelationModel.getID());

		List<ServiceHasProject> models = this.getApi().getServiceHasProjects(newRelationModel.getServiceID());
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