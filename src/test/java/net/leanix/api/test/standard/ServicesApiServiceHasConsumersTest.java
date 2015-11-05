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
import net.leanix.api.models.Consumer;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServicesApiServiceHasConsumersTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ServicesApiServiceHasConsumersTest.class);

	protected ServicesApi getApi() throws Exception
	{
		ServicesApi api = getServicesApi();
		return api;
	}

	protected ConsumersApi getApiRelated() throws Exception
	{
		ConsumersApi api = getConsumersApi();
		return api;
	}	

	protected Service newModel()
	{
		return new Service();
	}

	protected Consumer newModelRelated()
	{
		return new Consumer();
	}

	protected void setAttributes(ServiceHasConsumer model)
	{
		// Attributes
		model.setUsageTypeID("1");
	}

	protected void changeAttributes(ServiceHasConsumer model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasConsumer a, ServiceHasConsumer b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getServiceID(), b.getServiceID());
		assertEquals(a.getConsumerID(), b.getConsumerID());

		// Further attributes		
		assertEquals(a.getUsageTypeID(), b.getUsageTypeID());
	}

	protected Service createNewModel(String namePart) throws ApiException, Exception
	{
		Service model = this.newModel();
		model.setName("Service ServiceHasConsumer" + namePart);


		Service newModel = this.getApi().createService(model);
		return newModel;
	}

	protected Consumer createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Consumer model = this.newModelRelated();
		model.setName("Consumer ServiceHasConsumer" + namePart);


		Consumer newModel = this.getApiRelated().createConsumer(model);
		return newModel;
	}	

	protected ServiceHasConsumer newRelationModel(Service model, Consumer refModel)
	{
		ServiceHasConsumer relationModel = new ServiceHasConsumer();
		relationModel.setServiceID(model.getID());
		relationModel.setConsumerID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasConsumer createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Service model = this.createNewModel(namePart + "A");
		Consumer modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasConsumer relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasConsumer newRelationModel = this.getApi().createServiceHasConsumer(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasConsumer newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasConsumer newGetModel = this.getApi().getServiceHasConsumer(newRelationModel.getServiceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasConsumer newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasConsumer updatedModel = this.getApi().updateServiceHasConsumer(newRelationModel.getServiceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasConsumer newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasConsumer(newRelationModel.getServiceID(), newRelationModel.getID());

		List<ServiceHasConsumer> models = this.getApi().getServiceHasConsumers(newRelationModel.getServiceID());
		boolean found = false;
		for (ServiceHasConsumer s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}