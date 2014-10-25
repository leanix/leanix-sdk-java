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
import net.leanix.api.models.ResourceCapability;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourceCapabilitiesApiTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourceCapabilitiesApiTest.class);

	protected ResourceCapabilitiesApi getApi() throws Exception
	{
		ResourceCapabilitiesApi api = new ResourceCapabilitiesApi(setup.getApiClient());
		return api;
	}

	protected ResourceCapability newModel()
	{
		ResourceCapability model = new ResourceCapability();
		this.setRequiredAttributes(model);
		return model;
	}

	protected void setRequiredAttributes(ResourceCapability model)
	{
	}

	protected void setBasicAttributes(ResourceCapability model)
	{
		model.setAlias("Alias");
		model.setDescription("Test Description");
		model.setReference("R-10001");
	
	}

	protected void assertEqual(ResourceCapability a, ResourceCapability b)
	{
		assertEquals(a.getName(), b.getName());

		assertEquals(a.getAlias(), b.getAlias());
		assertEquals(a.getDescription(), b.getDescription());
		assertEquals(a.getReference(), b.getReference());
	
	}	

	@Test
	public void testCreateAndGetSuccess() throws Exception
	{	
		ResourceCapability model = this.newModel();
		model.setName("Create Model Success");

		this.setBasicAttributes(model);

		ResourceCapability newModel = this.getApi().createResourceCapability(model);
		assertNotNull(newModel);
		assertNotNull(newModel.getID());		

		ResourceCapability found = this.getApi().getResourceCapability(newModel.getID(), false);
		assertNotNull(found);
		this.assertEqual(newModel, found);
	}

	@Test
	public void testCreateFailDuplicate() throws Exception
	{
		// We expect an exception
		thrown.expect(ValidationException.class);
		ResourceCapability model = this.newModel();
		model.setName("Duplicate");
		this.getApi().createResourceCapability(model);

		this.getApi().createResourceCapability(model);
	}

	@Test
	public void testCreateFailNoName() throws Exception
	{
		// We expect an exception
		thrown.expect(ValidationException.class);
		ResourceCapability model = this.newModel();
		this.getApi().createResourceCapability(model);
	}

	@Test
	public void testCreateFailName() throws Exception
	{
		thrown.expect(ValidationException.class);
		ResourceCapability model = this.newModel();
		model.setName("<html>");
		this.getApi().createResourceCapability(model);
	}	

	@Test
	public void testUpdateSuccess() throws Exception
	{
		ResourceCapability model = this.newModel();
		model.setName("Update Model");	

		ResourceCapability newModel = this.getApi().createResourceCapability(model);

		this.setBasicAttributes(newModel);
		ResourceCapability updatedModel = this.getApi().updateResourceCapability(newModel.getID(), newModel);

		this.assertEqual(newModel, updatedModel);
	}

	@Test
	public void testGetList() throws Exception
	{
		int totalItems = 5;

		for (int i = 0; i < totalItems; i++)
		{
			ResourceCapability newModel = this.newModel();
			newModel.setName("GetModels " + i);
			this.getApi().createResourceCapability(newModel);
		}

		int foundCount = 0;
		List<ResourceCapability> models = this.getApi().getResourceCapabilities(false, null);
		for (ResourceCapability s : models)
		{
			logger.info(s.getName());
			if (s.getName().startsWith("GetModels"))
				foundCount++;
		}

		// We should have found 5 items we have inserted before
		assertEquals(totalItems, foundCount);
	}	

	@Test
	public void testDelete() throws Exception
	{
		ResourceCapability model = this.newModel();
		model.setName("Delete Model");	

		ResourceCapability newModel = this.getApi().createResourceCapability(model);

		this.getApi().deleteResourceCapability(newModel.getID());

		List<ResourceCapability> models = this.getApi().getResourceCapabilities(false, null);
		boolean found = false;
		for (ResourceCapability s : models)
		{
			if (s.getID().equals(newModel.getID()))
				found = true;	
		}
		// We should no longer find the deleted item
		assertFalse(found);
	}
}