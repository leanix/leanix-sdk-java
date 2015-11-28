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
import net.leanix.api.models.BusinessCapability;
import net.leanix.api.models.Service;
import net.leanix.api.models.ServiceHasBusinessCapability;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessCapabilitiesApiServiceHasBusinessCapabilitiesTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(BusinessCapabilitiesApiServiceHasBusinessCapabilitiesTest.class);

	protected BusinessCapabilitiesApi getApi() throws Exception
	{
		BusinessCapabilitiesApi api = getBusinessCapabilitiesApi();
		return api;
	}

	protected ServicesApi getApiRelated() throws Exception
	{
		ServicesApi api = getServicesApi();
		return api;
	}	

	protected BusinessCapability newModel()
	{
		return new BusinessCapability();
	}

	protected Service newModelRelated()
	{
		return new Service();
	}

	protected void setAttributes(ServiceHasBusinessCapability model)
	{
		// Attributes
		model.setSupportTypeID("2");
	}

	protected void changeAttributes(ServiceHasBusinessCapability model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasBusinessCapability a, ServiceHasBusinessCapability b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getBusinessCapabilityID(), b.getBusinessCapabilityID());
		assertEquals(a.getServiceID(), b.getServiceID());

		// Further attributes		
		assertEquals(a.getSupportTypeID(), b.getSupportTypeID());
	}

	protected BusinessCapability createNewModel(String namePart) throws ApiException, Exception
	{
		BusinessCapability model = this.newModel();
		model.setName("BusinessCapability ServiceHasBusinessCapability" + namePart);


		BusinessCapability newModel = this.getApi().createBusinessCapability(model);
		return newModel;
	}

	protected Service createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Service model = this.newModelRelated();
		model.setName("Service ServiceHasBusinessCapability" + namePart);


		Service newModel = this.getApiRelated().createService(model);
		return newModel;
	}	

	protected ServiceHasBusinessCapability newRelationModel(BusinessCapability model, Service refModel)
	{
		ServiceHasBusinessCapability relationModel = new ServiceHasBusinessCapability();
		relationModel.setBusinessCapabilityID(model.getID());
		relationModel.setServiceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasBusinessCapability createNewRelationModel(String namePart) throws ApiException, Exception
	{
		BusinessCapability model = this.createNewModel(namePart + "A");
		Service modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasBusinessCapability relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasBusinessCapability newRelationModel = this.getApi().createServiceHasBusinessCapability(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasBusinessCapability newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasBusinessCapability newGetModel = this.getApi().getServiceHasBusinessCapability(newRelationModel.getBusinessCapabilityID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasBusinessCapability newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasBusinessCapability updatedModel = this.getApi().updateServiceHasBusinessCapability(newRelationModel.getBusinessCapabilityID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasBusinessCapability newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasBusinessCapability(newRelationModel.getBusinessCapabilityID(), newRelationModel.getID());

		List<ServiceHasBusinessCapability> models = this.getApi().getServiceHasBusinessCapabilities(newRelationModel.getBusinessCapabilityID());
		boolean found = false;
		for (ServiceHasBusinessCapability s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}