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
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServicesApiTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ServicesApiTest.class);

	protected ServicesApi getApi() throws Exception
	{
		ServicesApi api = getServicesApi();
		return api;
	}

	protected Service newModel()
	{
		Service model = new Service();
		this.setRequiredAttributes(model);
		return model;
	}

	protected void setRequiredAttributes(Service model)
	{
	}

	protected void setBasicAttributes(Service model)
	{
		model.setAlias("Alias");
		model.setDescription("Test Description");
		model.setReference("R-10001");
		model.setRelease("1.0");
		model.setFunctionalSuitabilityID("1");
		model.setFunctionalSuitabilityDescription("Functional Suitability");
		model.setBusinessCriticalityID("1");
		model.setBusinessCriticalityDescription("Business Criticality");
	
	}

	protected void assertEqual(Service a, Service b)
	{
		assertEquals(a.getName(), b.getName());

		assertEquals(a.getAlias(), b.getAlias());
		assertEquals(a.getDescription(), b.getDescription());
		assertEquals(a.getReference(), b.getReference());
		assertEquals(a.getRelease(), b.getRelease());
		assertEquals(a.getFunctionalSuitabilityID(), b.getFunctionalSuitabilityID());
		assertEquals(a.getFunctionalSuitabilityDescription(), b.getFunctionalSuitabilityDescription());
		assertEquals(a.getBusinessCriticalityID(), b.getBusinessCriticalityID());
		assertEquals(a.getBusinessCriticalityDescription(), b.getBusinessCriticalityDescription());
	
	}	

	@Test
	public void testCreateAndGetSuccess() throws Exception
	{	
		Service model = this.newModel();
		model.setName("Create Model Success");

		this.setBasicAttributes(model);

		Service newModel = this.getApi().createService(model);
		assertNotNull(newModel);
		assertNotNull(newModel.getID());		

		Service found = this.getApi().getService(newModel.getID(), false);
		assertNotNull(found);
		this.assertEqual(newModel, found);
	}

	@Test
	public void testCreateFailDuplicate() throws Exception
	{
		// We expect an exception
		thrown.expect(ApiException.class);
		Service model = this.newModel();
		model.setName("Duplicate");
		this.getApi().createService(model);

		this.getApi().createService(model);
	}

	@Test
	public void testCreateFailNoName() throws Exception
	{
		// We expect an exception
		thrown.expect(ApiException.class);
		Service model = this.newModel();
		this.getApi().createService(model);
	}

	@Test
	public void testCreateFailName() throws Exception
	{
		thrown.expect(ApiException.class);
		Service model = this.newModel();
		model.setName("<html>");
		this.getApi().createService(model);
	}	

	@Test
	public void testUpdateSuccess() throws Exception
	{
		Service model = this.newModel();
		model.setName("Update Model");	

		Service newModel = this.getApi().createService(model);

		this.setBasicAttributes(newModel);
		Service updatedModel = this.getApi().updateService(newModel.getID(), newModel);

		this.assertEqual(newModel, updatedModel);
	}

	@Test
	public void testGetList() throws Exception
	{
		int totalItems = 5;

		for (int i = 0; i < totalItems; i++)
		{
			Service newModel = this.newModel();
			newModel.setName("GetModels " + i);
			this.getApi().createService(newModel);
		}

		int foundCount = 0;
		List<Service> models = this.getApi().getServices(false, null);
		for (Service s : models)
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
		Service model = this.newModel();
		model.setName("Delete Model");	

		Service newModel = this.getApi().createService(model);

		this.getApi().deleteService(newModel.getID());

		List<Service> models = this.getApi().getServices(false, null);
		boolean found = false;
		for (Service s : models)
		{
			if (s.getID().equals(newModel.getID()))
				found = true;	
		}
		// We should no longer find the deleted item
		assertFalse(found);
	}
}