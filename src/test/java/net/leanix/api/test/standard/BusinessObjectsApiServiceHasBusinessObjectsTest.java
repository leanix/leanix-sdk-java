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
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasBusinessObject;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessObjectsApiServiceHasBusinessObjectsTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(BusinessObjectsApiServiceHasBusinessObjectsTest.class);

	protected BusinessObjectsApi getApi() throws Exception
	{
		BusinessObjectsApi api = new BusinessObjectsApi(setup.getApiClient());
		return api;
	}

	protected ServicesApi getApiRelated() throws Exception
	{
		ServicesApi api = new ServicesApi(setup.getApiClient());
		return api;
	}	

	protected BusinessObject newModel()
	{
		return new BusinessObject();
	}

	protected Service newModelRelated()
	{
		return new Service();
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
		assertEquals(a.getBusinessObjectID(), b.getBusinessObjectID());
		assertEquals(a.getServiceID(), b.getServiceID());

		// Further attributes		
		assertEquals(a.getBusinessObjectRelationID(), b.getBusinessObjectRelationID());
	}

	protected BusinessObject createNewModel(String namePart) throws ApiException, Exception
	{
		BusinessObject model = this.newModel();
		model.setName("BusinessObject ServiceHasBusinessObject" + namePart);


		BusinessObject newModel = this.getApi().createBusinessObject(model);
		return newModel;
	}

	protected Service createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Service model = this.newModelRelated();
		model.setName("Service ServiceHasBusinessObject" + namePart);


		Service newModel = this.getApiRelated().createService(model);
		return newModel;
	}	

	protected ServiceHasBusinessObject newRelationModel(BusinessObject model, Service refModel)
	{
		ServiceHasBusinessObject relationModel = new ServiceHasBusinessObject();
		relationModel.setBusinessObjectID(model.getID());
		relationModel.setServiceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasBusinessObject createNewRelationModel(String namePart) throws ApiException, Exception
	{
		BusinessObject model = this.createNewModel(namePart + "A");
		Service modelRelated = this.createNewModelRelated(namePart + "B");

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

		ServiceHasBusinessObject newGetModel = this.getApi().getServiceHasBusinessObject(newRelationModel.getBusinessObjectID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasBusinessObject newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasBusinessObject updatedModel = this.getApi().updateServiceHasBusinessObject(newRelationModel.getBusinessObjectID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasBusinessObject newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasBusinessObject(newRelationModel.getBusinessObjectID(), newRelationModel.getID());

		List<ServiceHasBusinessObject> models = this.getApi().getServiceHasBusinessObjects(newRelationModel.getBusinessObjectID());
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