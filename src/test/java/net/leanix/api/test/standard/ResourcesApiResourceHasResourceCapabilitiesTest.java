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
import net.leanix.api.models.ResourceCapability;
import net.leanix.api.models.ResourceHasResourceCapability;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiResourceHasResourceCapabilitiesTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourcesApiResourceHasResourceCapabilitiesTest.class);

	protected ResourcesApi getApi() throws Exception
	{
		ResourcesApi api = new ResourcesApi(setup.getApiClient());
		return api;
	}

	protected ResourceCapabilitiesApi getApiRelated() throws Exception
	{
		ResourceCapabilitiesApi api = new ResourceCapabilitiesApi(setup.getApiClient());
		return api;
	}	

	protected Resource newModel()
	{
		return new Resource();
	}

	protected ResourceCapability newModelRelated()
	{
		return new ResourceCapability();
	}

	protected void setAttributes(ResourceHasResourceCapability model)
	{
		// Attributes
		model.setSupportTypeID("2");
	}

	protected void changeAttributes(ResourceHasResourceCapability model)
	{
		// Attributes
	}

	protected void assertEqual(ResourceHasResourceCapability a, ResourceHasResourceCapability b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getResourceID(), b.getResourceID());
		assertEquals(a.getResourceCapabilityID(), b.getResourceCapabilityID());

		// Further attributes		
		assertEquals(a.getSupportTypeID(), b.getSupportTypeID());
	}

	protected Resource createNewModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModel();
		model.setName("Resource ResourceHasResourceCapability" + namePart);


		Resource newModel = this.getApi().createResource(model);
		return newModel;
	}

	protected ResourceCapability createNewModelRelated(String namePart) throws ApiException, Exception
	{
		ResourceCapability model = this.newModelRelated();
		model.setName("ResourceCapability ResourceHasResourceCapability" + namePart);


		ResourceCapability newModel = this.getApiRelated().createResourceCapability(model);
		return newModel;
	}	

	protected ResourceHasResourceCapability newRelationModel(Resource model, ResourceCapability refModel)
	{
		ResourceHasResourceCapability relationModel = new ResourceHasResourceCapability();
		relationModel.setResourceID(model.getID());
		relationModel.setResourceCapabilityID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ResourceHasResourceCapability createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.createNewModel(namePart + "A");
		ResourceCapability modelRelated = this.createNewModelRelated(namePart + "B");

		ResourceHasResourceCapability relationModel = this.newRelationModel(model, modelRelated);

		ResourceHasResourceCapability newRelationModel = this.getApi().createResourceHasResourceCapability(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ResourceHasResourceCapability newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ResourceHasResourceCapability newGetModel = this.getApi().getResourceHasResourceCapability(newRelationModel.getResourceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ResourceHasResourceCapability newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ResourceHasResourceCapability updatedModel = this.getApi().updateResourceHasResourceCapability(newRelationModel.getResourceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ResourceHasResourceCapability newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteResourceHasResourceCapability(newRelationModel.getResourceID(), newRelationModel.getID());

		List<ResourceHasResourceCapability> models = this.getApi().getResourceHasResourceCapabilities(newRelationModel.getResourceID());
		boolean found = false;
		for (ResourceHasResourceCapability s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}