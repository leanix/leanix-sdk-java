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

package net.leanix.api.test;

import static org.junit.Assert.*;

import java.util.List;

import net.leanix.api.common.*;
import net.leanix.api.models.Document;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocumentsApiTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(DocumentsApiTest.class);

	protected DocumentsApi getApi() throws Exception
	{
		DocumentsApi api = new DocumentsApi(setup.getApiClient());
		return api;
	}

	protected Document newModel()
	{
		Document model = new Document();
		this.setRequiredAttributes(model);
		return model;
	}

	protected void setRequiredAttributes(Document model)
	{
		model.setUrl("http://www.heise.de");

	}

	protected void setBasicAttributes(Document model)
	{
		model.setUrl("http://www.heise.de");
	
	}

	protected void assertEqual(Document a, Document b)
	{
		assertEquals(a.getName(), b.getName());

		assertEquals(a.getUrl(), b.getUrl());
	
	}	

	@Test
	public void testCreateAndGetSuccess() throws Exception
	{	
		Document model = this.newModel();
		model.setName("Create Model Success");

		this.setBasicAttributes(model);

		Document newModel = this.getApi().createDocument(model);
		assertNotNull(newModel);
		assertNotNull(newModel.getID());		

		Document found = this.getApi().getDocument(newModel.getID(), false);
		assertNotNull(found);
		this.assertEqual(newModel, found);
	}

	@Test
	public void testCreateFailNoName() throws Exception
	{
		// We expect an exception
		thrown.expect(ApiException.class);
		Document model = this.newModel();
		this.getApi().createDocument(model);
	}

	@Test
	public void testCreateFailName() throws Exception
	{
		thrown.expect(ApiException.class);
		Document model = this.newModel();
		model.setName("<html>");
		this.getApi().createDocument(model);
	}	

	@Test
	public void testUpdateSuccess() throws Exception
	{
		Document model = this.newModel();
		model.setName("Update Model");	

		Document newModel = this.getApi().createDocument(model);

		this.setBasicAttributes(newModel);
		Document updatedModel = this.getApi().updateDocument(newModel.getID(), newModel);

		this.assertEqual(newModel, updatedModel);
	}

	@Test
	public void testGetList() throws Exception
	{
		int totalItems = 5;

		for (int i = 0; i < totalItems; i++)
		{
			Document newModel = this.newModel();
			newModel.setName("GetModels " + i);
			this.getApi().createDocument(newModel);
		}

		int foundCount = 0;
		List<Document> models = this.getApi().getDocuments(false, null);
		for (Document s : models)
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
		Document model = this.newModel();
		model.setName("Delete Model");	

		Document newModel = this.getApi().createDocument(model);

		this.getApi().deleteDocument(newModel.getID());

		List<Document> models = this.getApi().getDocuments(false, null);
		boolean found = false;
		for (Document s : models)
		{
			if (s.getID().equals(newModel.getID()))
				found = true;	
		}
		// We should no longer find the deleted item
		assertFalse(found);
	}
}