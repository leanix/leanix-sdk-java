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

import net.leanix.api.BusinessObjectsApi;
import net.leanix.api.ServicesApi;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasBusinessObject;
import net.leanix.api.test.WorkspaceSetupRule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ServicesApiServiceHasBusinessObjectsTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ServicesApiServiceHasBusinessObjectsTest.class);

	protected ServicesApi getApi() throws Exception
	{
		ServicesApi api = new ServicesApi(setup.getApiClient());
		return api;
	}

	protected BusinessObjectsApi getApiRelated() throws Exception
	{
		BusinessObjectsApi api = new BusinessObjectsApi(setup.getApiClient());
		return api;
	}	

	protected Service newModel()
	{
		return new Service();
	}

	protected BusinessObject newModelRelated()
	{
		return new BusinessObject();
	}

	protected void setAttributes(ServiceHasBusinessObject model)
	{
		// Attributes
		model.setBusinessObjectRelationID("1");
	}

	protected void changeAttributes(ServiceHasBusinessObject model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasBusinessObject a, ServiceHasBusinessObject b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getServiceID(), b.getServiceID());
		assertEquals(a.getBusinessObjectID(), b.getBusinessObjectID());

		// Further attributes		
		assertEquals(a.getBusinessObjectRelationID(), b.getBusinessObjectRelationID());
	}

	protected Service createNewModel(String namePart) throws ApiException, Exception
	{
		Service model = this.newModel();
		model.setName("Service ServiceHasBusinessObject" + namePart);


		Service newModel = this.getApi().createService(model);
		return newModel;
	}

	protected BusinessObject createNewModelRelated(String namePart) throws ApiException, Exception
	{
		BusinessObject model = this.newModelRelated();
		model.setName("BusinessObject ServiceHasBusinessObject" + namePart);


		BusinessObject newModel = this.getApiRelated().createBusinessObject(model);
		return newModel;
	}	

	protected ServiceHasBusinessObject newRelationModel(Service model, BusinessObject refModel)
	{
		ServiceHasBusinessObject relationModel = new ServiceHasBusinessObject();
		relationModel.setServiceID(model.getID());
		relationModel.setBusinessObjectID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasBusinessObject createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Service model = this.createNewModel(namePart + "A");
		BusinessObject modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasBusinessObject relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasBusinessObject newRelationModel = this.getApi().createServiceHasBusinessObject(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasBusinessObject newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasBusinessObject newGetModel = this.getApi().getServiceHasBusinessObject(newRelationModel.getServiceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasBusinessObject newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasBusinessObject updatedModel = this.getApi().updateServiceHasBusinessObject(newRelationModel.getServiceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasBusinessObject newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasBusinessObject(newRelationModel.getServiceID(), newRelationModel.getID());

		List<ServiceHasBusinessObject> models = this.getApi().getServiceHasBusinessObjects(newRelationModel.getServiceID());
		boolean found = false;
		for (ServiceHasBusinessObject s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}
