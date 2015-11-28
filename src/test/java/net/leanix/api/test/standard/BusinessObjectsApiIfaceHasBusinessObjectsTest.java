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
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.Iface;
import net.leanix.api.models.IfaceHasBusinessObject;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BusinessObjectsApiIfaceHasBusinessObjectsTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(BusinessObjectsApiIfaceHasBusinessObjectsTest.class);

	protected BusinessObjectsApi getApi() throws Exception
	{
		BusinessObjectsApi api = getBusinessObjectsApi();
		return api;
	}

	protected IfacesApi getApiRelated() throws Exception
	{
		IfacesApi api = getIfacesApi();
		return api;
	}	

	protected BusinessObject newModel()
	{
		return new BusinessObject();
	}

	protected Iface newModelRelated()
	{
		return new Iface();
	}

	protected void setAttributes(IfaceHasBusinessObject model)
	{
		// Attributes
	}

	protected void changeAttributes(IfaceHasBusinessObject model)
	{
		// Attributes
	}

	protected void assertEqual(IfaceHasBusinessObject a, IfaceHasBusinessObject b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getBusinessObjectID(), b.getBusinessObjectID());
		assertEquals(a.getIfaceID(), b.getIfaceID());

		// Further attributes		
	}

	protected BusinessObject createNewModel(String namePart) throws ApiException, Exception
	{
		BusinessObject model = this.newModel();
		model.setName("BusinessObject IfaceHasBusinessObject" + namePart);


		BusinessObject newModel = this.getApi().createBusinessObject(model);
		return newModel;
	}

	protected Iface createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Iface model = this.newModelRelated();
		model.setName("Iface IfaceHasBusinessObject" + namePart);


		Iface newModel = this.getApiRelated().createIface(model);
		return newModel;
	}	

	protected IfaceHasBusinessObject newRelationModel(BusinessObject model, Iface refModel)
	{
		IfaceHasBusinessObject relationModel = new IfaceHasBusinessObject();
		relationModel.setBusinessObjectID(model.getID());
		relationModel.setIfaceID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected IfaceHasBusinessObject createNewRelationModel(String namePart) throws ApiException, Exception
	{
		BusinessObject model = this.createNewModel(namePart + "A");
		Iface modelRelated = this.createNewModelRelated(namePart + "B");

		IfaceHasBusinessObject relationModel = this.newRelationModel(model, modelRelated);

		IfaceHasBusinessObject newRelationModel = this.getApi().createIfaceHasBusinessObject(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		IfaceHasBusinessObject newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		IfaceHasBusinessObject newGetModel = this.getApi().getIfaceHasBusinessObject(newRelationModel.getBusinessObjectID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		IfaceHasBusinessObject newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		IfaceHasBusinessObject updatedModel = this.getApi().updateIfaceHasBusinessObject(newRelationModel.getBusinessObjectID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		IfaceHasBusinessObject newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteIfaceHasBusinessObject(newRelationModel.getBusinessObjectID(), newRelationModel.getID());

		List<IfaceHasBusinessObject> models = this.getApi().getIfaceHasBusinessObjects(newRelationModel.getBusinessObjectID());
		boolean found = false;
		for (IfaceHasBusinessObject s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}