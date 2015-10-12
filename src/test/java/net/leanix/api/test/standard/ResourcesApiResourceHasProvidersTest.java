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
import net.leanix.api.models.Provider;
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiResourceHasProvidersTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourcesApiResourceHasProvidersTest.class);

	protected ResourcesApi getApi() throws Exception
	{
		ResourcesApi api = new ResourcesApi(setup.getApiClient());
		return api;
	}

	protected ProvidersApi getApiRelated() throws Exception
	{
		ProvidersApi api = new ProvidersApi(setup.getApiClient());
		return api;
	}	

	protected Resource newModel()
	{
		return new Resource();
	}

	protected Provider newModelRelated()
	{
		return new Provider();
	}

	protected void setAttributes(ResourceHasProvider model)
	{
		// Attributes
	}

	protected void changeAttributes(ResourceHasProvider model)
	{
		// Attributes
	}

	protected void assertEqual(ResourceHasProvider a, ResourceHasProvider b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getResourceID(), b.getResourceID());
		assertEquals(a.getProviderID(), b.getProviderID());

		// Further attributes		
	}

	protected Resource createNewModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModel();
		model.setName("Resource ResourceHasProvider" + namePart);

		model.setObjectCategoryID("1");

		Resource newModel = this.getApi().createResource(model);
		return newModel;
	}

	protected Provider createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Provider model = this.newModelRelated();
		model.setName("Provider ResourceHasProvider" + namePart);


		Provider newModel = this.getApiRelated().createProvider(model);
		return newModel;
	}	

	protected ResourceHasProvider newRelationModel(Resource model, Provider refModel)
	{
		ResourceHasProvider relationModel = new ResourceHasProvider();
		relationModel.setResourceID(model.getID());
		relationModel.setProviderID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ResourceHasProvider createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.createNewModel(namePart + "A");
		Provider modelRelated = this.createNewModelRelated(namePart + "B");

		ResourceHasProvider relationModel = this.newRelationModel(model, modelRelated);

		ResourceHasProvider newRelationModel = this.getApi().createResourceHasProvider(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ResourceHasProvider newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ResourceHasProvider newGetModel = this.getApi().getResourceHasProvider(newRelationModel.getResourceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ResourceHasProvider newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ResourceHasProvider updatedModel = this.getApi().updateResourceHasProvider(newRelationModel.getResourceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ResourceHasProvider newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteResourceHasProvider(newRelationModel.getResourceID(), newRelationModel.getID());

		List<ResourceHasProvider> models = this.getApi().getResourceHasProviders(newRelationModel.getResourceID());
		boolean found = false;
		for (ResourceHasProvider s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}