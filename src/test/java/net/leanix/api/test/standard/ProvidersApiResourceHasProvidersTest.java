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

import net.leanix.api.ProvidersApi;
import net.leanix.api.ResourcesApi;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.Provider;
import net.leanix.api.models.Resource;
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.test.WorkspaceSetupRule;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProvidersApiResourceHasProvidersTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ProvidersApiResourceHasProvidersTest.class);

	protected ProvidersApi getApi() throws Exception
	{
		ProvidersApi api = new ProvidersApi(setup.getApiClient());
		return api;
	}

	protected ResourcesApi getApiRelated() throws Exception
	{
		ResourcesApi api = new ResourcesApi(setup.getApiClient());
		return api;
	}	

	protected Provider newModel()
	{
		return new Provider();
	}

	protected Resource newModelRelated()
	{
		return new Resource();
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
		assertEquals(a.getProviderID(), b.getProviderID());
		assertEquals(a.getResourceID(), b.getResourceID());

		// Further attributes		
	}

	protected Provider createNewModel(String namePart) throws ApiException, Exception
	{
		Provider model = this.newModel();
		model.setName("Provider ResourceHasProvider" + namePart);


		Provider newModel = this.getApi().createProvider(model);
		return newModel;
	}

	protected Resource createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModelRelated();
		model.setName("Resource ResourceHasProvider" + namePart);

		model.setObjectCategoryID("2");

		Resource newModel = this.getApiRelated().createResource(model);
		return newModel;
	}	

	protected ResourceHasProvider newRelationModel(Provider model, Resource refModel)
	{
		ResourceHasProvider relationModel = new ResourceHasProvider();
		relationModel.setProviderID(model.getID());
		relationModel.setResourceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ResourceHasProvider createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Provider model = this.createNewModel(namePart + "A");
		Resource modelRelated = this.createNewModelRelated(namePart + "B");

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

		ResourceHasProvider newGetModel = this.getApi().getResourceHasProvider(newRelationModel.getProviderID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ResourceHasProvider newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ResourceHasProvider updatedModel = this.getApi().updateResourceHasProvider(newRelationModel.getProviderID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ResourceHasProvider newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteResourceHasProvider(newRelationModel.getProviderID(), newRelationModel.getID());

		List<ResourceHasProvider> models = this.getApi().getResourceHasProviders(newRelationModel.getProviderID());
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
