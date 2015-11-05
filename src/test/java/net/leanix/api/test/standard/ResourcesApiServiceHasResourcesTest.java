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
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasResource;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiServiceHasResourcesTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourcesApiServiceHasResourcesTest.class);

	protected ResourcesApi getApi() throws Exception
	{
		ResourcesApi api = getResourcesApi();
		return api;
	}

	protected ServicesApi getApiRelated() throws Exception
	{
		ServicesApi api = getServicesApi();
		return api;
	}	

	protected Resource newModel()
	{
		return new Resource();
	}

	protected Service newModelRelated()
	{
		return new Service();
	}

	protected void setAttributes(ServiceHasResource model)
	{
		// Attributes
	}

	protected void changeAttributes(ServiceHasResource model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasResource a, ServiceHasResource b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getResourceID(), b.getResourceID());
		assertEquals(a.getServiceID(), b.getServiceID());

		// Further attributes		
	}

	protected Resource createNewModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModel();
		model.setName("Resource ServiceHasResource" + namePart);

		model.setObjectCategoryID("2");

		Resource newModel = this.getApi().createResource(model);
		return newModel;
	}

	protected Service createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Service model = this.newModelRelated();
		model.setName("Service ServiceHasResource" + namePart);


		Service newModel = this.getApiRelated().createService(model);
		return newModel;
	}	

	protected ServiceHasResource newRelationModel(Resource model, Service refModel)
	{
		ServiceHasResource relationModel = new ServiceHasResource();
		relationModel.setResourceID(model.getID());
		relationModel.setServiceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasResource createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.createNewModel(namePart + "A");
		Service modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasResource relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasResource newRelationModel = this.getApi().createServiceHasResource(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasResource newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasResource newGetModel = this.getApi().getServiceHasResource(newRelationModel.getResourceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasResource newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasResource updatedModel = this.getApi().updateServiceHasResource(newRelationModel.getResourceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasResource newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasResource(newRelationModel.getResourceID(), newRelationModel.getID());

		List<ServiceHasResource> models = this.getApi().getServiceHasResources(newRelationModel.getResourceID());
		boolean found = false;
		for (ServiceHasResource s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}