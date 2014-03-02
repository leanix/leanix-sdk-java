TemplateApiTest(className, classNamePlural, attributes) ::= <<
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
import net.leanix.api.models.<className>;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class <classNamePlural>ApiTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();
	
	final Logger logger = LoggerFactory.getLogger(<classNamePlural>ApiTest.class);
	
	protected <classNamePlural>Api getApi() throws Exception
	{
		<classNamePlural>Api api = new <classNamePlural>Api(setup.getApiClient());
		return api;
	}
	
	protected <className> newModel()
	{
		return new <className>();
	}
	
	protected void setBasicAttributes(<className> model)
	{
		model.setDescription("Test Description");
		model.setReference("R-1000");
		model.setAlias("NApp");
		
		<attributes:{each | model.set<each.name>(<each.value>);
	    }>	
	}
	
	protected void assertEqual(<className> a, <className> b)
	{
		assertEquals(a.getName(), b.getName());
		assertEquals(a.getAlias(), b.getAlias());
		assertEquals(a.getReference(), b.getReference());
		assertEquals(a.getDescription(), b.getDescription());
		
		<attributes:{each | assertEquals(a.get<each.name>(), b.get<each.name>());
	    }>	
	}	
	
	@Test
	public void testCreateAndGetSuccess() throws Exception
	{	
		<className> model = this.newModel();
		model.setName("CreateServiceSuccess");
		
		this.setBasicAttributes(model);
		
		<className> newModel = this.getApi().create<className>(model);
		assertNotNull(newModel);
		assertNotNull(newModel.getID());		
		
		<className> found = this.getApi().get<className>(newModel.getID(), false);
		assertNotNull(found);
		this.assertEqual(newModel, found);
	}
	
	@Test
	public void testCreateFailDuplicate() throws Exception
	{
		// We expect an exception
		thrown.expect(ApiException.class);
		<className> model = this.newModel();
		model.setName("Duplicate");
		this.getApi().create<className>(model);
		
		this.getApi().create<className>(model);
	}
	
	@Test
	public void testCreateFailNoName() throws Exception
	{
		// We expect an exception
		thrown.expect(ApiException.class);
		<className> model = this.newModel();
		this.getApi().create<className>(model);
	}
	
	@Test
	public void testCreateFailName() throws Exception
	{
		thrown.expect(ApiException.class);
		<className> model = this.newModel();
		model.setName("\<html\>");
		this.getApi().create<className>(model);
	}	
	
	@Test
	public void testUpdateSuccess() throws Exception
	{
		<className> model = this.newModel();
		model.setName("UpdateService");	
		
		<className> newModel = this.getApi().create<className>(model);
		
		this.setBasicAttributes(newModel);
		<className> updatedModel = this.getApi().update<className>(newModel.getID(), newModel);
		
		this.assertEqual(newModel, updatedModel);
	}
	
	@Test
	public void testGetList() throws Exception
	{
		int totalItems = 5;
		
		for (int i = 0; i \< totalItems; i++)
		{
			<className> newModel = this.newModel();
			newModel.setName("GetModels " + i);
			this.getApi().create<className>(newModel);
		}
		
		int foundCount = 0;
		List\<<className>\> models = this.getApi().get<classNamePlural>(false, null);
		for (<className> s : models)
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
		<className> model = this.newModel();
		model.setName("DeleteService");	
		
		<className> newModel = this.getApi().create<className>(model);
		
		this.getApi().delete<className>(newModel.getID());
		
		List\<<className>\> models = this.getApi().get<classNamePlural>(false, null);
		boolean found = false;
		for (<className> s : models)
		{
			if (s.getID().equals(newModel.getID()))
				found = true;	
		}
		// We should no longer find the deleted item
		assertFalse(found);
	}
}
>>
