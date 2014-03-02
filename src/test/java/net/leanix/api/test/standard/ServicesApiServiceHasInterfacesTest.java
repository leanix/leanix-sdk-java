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
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasInterface;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServicesApiServiceHasInterfacesTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ServicesApiServiceHasInterfacesTest.class);

	protected ServicesApi getApi() throws Exception
	{
		ServicesApi api = new ServicesApi(setup.getApiClient());
		return api;
	}

	protected ServicesApi getApiRelated() throws Exception
	{
		ServicesApi api = new ServicesApi(setup.getApiClient());
		return api;
	}	

	protected Service newModel()
	{
		return new Service();
	}

	protected Service newModelRelated()
	{
		return new Service();
	}

	protected void setAttributes(ServiceHasInterface model)
	{
		// Attributes
		model.setInterfaceDirectionID("1");
	}

	protected void changeAttributes(ServiceHasInterface model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasInterface a, ServiceHasInterface b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getServiceID(), b.getServiceID());
		assertEquals(a.getServiceRefID(), b.getServiceRefID());

		// Further attributes		
		assertEquals(a.getInterfaceDirectionID(), b.getInterfaceDirectionID());
	}

	protected Service createNewModel(String namePart) throws ApiException, Exception
	{
		Service model = this.newModel();
		model.setName("Service ServiceHasInterface" + namePart);


		Service newModel = this.getApi().createService(model);
		return newModel;
	}

	protected Service createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Service model = this.newModelRelated();
		model.setName("Service ServiceHasInterface" + namePart);


		Service newModel = this.getApiRelated().createService(model);
		return newModel;
	}	

	protected ServiceHasInterface newRelationModel(Service model, Service refModel)
	{
		ServiceHasInterface relationModel = new ServiceHasInterface();
		relationModel.setServiceID(model.getID());
		relationModel.setServiceRefID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasInterface createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Service model = this.createNewModel(namePart + "A");
		Service modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasInterface relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasInterface newRelationModel = this.getApi().createServiceHasInterface(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasInterface newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasInterface newGetModel = this.getApi().getServiceHasInterface(newRelationModel.getServiceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasInterface newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasInterface updatedModel = this.getApi().updateServiceHasInterface(newRelationModel.getServiceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasInterface newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasInterface(newRelationModel.getServiceID(), newRelationModel.getID());

		List<ServiceHasInterface> models = this.getApi().getServiceHasInterfaces(newRelationModel.getServiceID());
		boolean found = false;
		for (ServiceHasInterface s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}