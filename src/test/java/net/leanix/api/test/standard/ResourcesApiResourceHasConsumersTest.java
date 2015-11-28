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
import net.leanix.api.models.Consumer;
import net.leanix.api.models.ResourceHasConsumer;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiResourceHasConsumersTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourcesApiResourceHasConsumersTest.class);

	protected ResourcesApi getApi() throws Exception
	{
		ResourcesApi api = getResourcesApi();
		return api;
	}

	protected ConsumersApi getApiRelated() throws Exception
	{
		ConsumersApi api = getConsumersApi();
		return api;
	}	

	protected Resource newModel()
	{
		return new Resource();
	}

	protected Consumer newModelRelated()
	{
		return new Consumer();
	}

	protected void setAttributes(ResourceHasConsumer model)
	{
		// Attributes
		model.setUsageTypeID("1");
	}

	protected void changeAttributes(ResourceHasConsumer model)
	{
		// Attributes
	}

	protected void assertEqual(ResourceHasConsumer a, ResourceHasConsumer b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getResourceID(), b.getResourceID());
		assertEquals(a.getConsumerID(), b.getConsumerID());

		// Further attributes		
		assertEquals(a.getUsageTypeID(), b.getUsageTypeID());
	}

	protected Resource createNewModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModel();
		model.setName("Resource ResourceHasConsumer" + namePart);


		Resource newModel = this.getApi().createResource(model);
		return newModel;
	}

	protected Consumer createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Consumer model = this.newModelRelated();
		model.setName("Consumer ResourceHasConsumer" + namePart);


		Consumer newModel = this.getApiRelated().createConsumer(model);
		return newModel;
	}	

	protected ResourceHasConsumer newRelationModel(Resource model, Consumer refModel)
	{
		ResourceHasConsumer relationModel = new ResourceHasConsumer();
		relationModel.setResourceID(model.getID());
		relationModel.setConsumerID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ResourceHasConsumer createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.createNewModel(namePart + "A");
		Consumer modelRelated = this.createNewModelRelated(namePart + "B");

		ResourceHasConsumer relationModel = this.newRelationModel(model, modelRelated);

		ResourceHasConsumer newRelationModel = this.getApi().createResourceHasConsumer(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ResourceHasConsumer newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ResourceHasConsumer newGetModel = this.getApi().getResourceHasConsumer(newRelationModel.getResourceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ResourceHasConsumer newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ResourceHasConsumer updatedModel = this.getApi().updateResourceHasConsumer(newRelationModel.getResourceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ResourceHasConsumer newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteResourceHasConsumer(newRelationModel.getResourceID(), newRelationModel.getID());

		List<ResourceHasConsumer> models = this.getApi().getResourceHasConsumers(newRelationModel.getResourceID());
		boolean found = false;
		for (ResourceHasConsumer s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}