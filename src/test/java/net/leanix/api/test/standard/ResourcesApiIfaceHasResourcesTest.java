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
import net.leanix.api.models.Iface;
import net.leanix.api.models.IfaceHasResource;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResourcesApiIfaceHasResourcesTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ResourcesApiIfaceHasResourcesTest.class);

	protected ResourcesApi getApi() throws Exception
	{
		ResourcesApi api = getResourcesApi();
		return api;
	}

	protected IfacesApi getApiRelated() throws Exception
	{
		IfacesApi api = getIfacesApi();
		return api;
	}	

	protected Resource newModel()
	{
		return new Resource();
	}

	protected Iface newModelRelated()
	{
		return new Iface();
	}

	protected void setAttributes(IfaceHasResource model)
	{
		// Attributes
	}

	protected void changeAttributes(IfaceHasResource model)
	{
		// Attributes
	}

	protected void assertEqual(IfaceHasResource a, IfaceHasResource b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getResourceID(), b.getResourceID());
		assertEquals(a.getIfaceID(), b.getIfaceID());

		// Further attributes		
	}

	protected Resource createNewModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.newModel();
		model.setName("Resource IfaceHasResource" + namePart);


		Resource newModel = this.getApi().createResource(model);
		return newModel;
	}

	protected Iface createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Iface model = this.newModelRelated();
		model.setName("Iface IfaceHasResource" + namePart);


		Iface newModel = this.getApiRelated().createIface(model);
		return newModel;
	}	

	protected IfaceHasResource newRelationModel(Resource model, Iface refModel)
	{
		IfaceHasResource relationModel = new IfaceHasResource();
		relationModel.setResourceID(model.getID());
		relationModel.setIfaceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected IfaceHasResource createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Resource model = this.createNewModel(namePart + "A");
		Iface modelRelated = this.createNewModelRelated(namePart + "B");

		IfaceHasResource relationModel = this.newRelationModel(model, modelRelated);

		IfaceHasResource newRelationModel = this.getApi().createIfaceHasResource(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		IfaceHasResource newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		IfaceHasResource newGetModel = this.getApi().getIfaceHasResource(newRelationModel.getResourceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		IfaceHasResource newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		IfaceHasResource updatedModel = this.getApi().updateIfaceHasResource(newRelationModel.getResourceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		IfaceHasResource newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteIfaceHasResource(newRelationModel.getResourceID(), newRelationModel.getID());

		List<IfaceHasResource> models = this.getApi().getIfaceHasResources(newRelationModel.getResourceID());
		boolean found = false;
		for (IfaceHasResource s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}