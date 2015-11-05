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
import net.leanix.api.models.Iface;
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.IfaceHasBusinessObject;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IfacesApiIfaceHasBusinessObjectsTest extends TestBase
{
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(IfacesApiIfaceHasBusinessObjectsTest.class);

	protected IfacesApi getApi() throws Exception
	{
		IfacesApi api = getIfacesApi();
		return api;
	}

	protected BusinessObjectsApi getApiRelated() throws Exception
	{
		BusinessObjectsApi api = getBusinessObjectsApi();
		return api;
	}	

	protected Iface newModel()
	{
		return new Iface();
	}

	protected BusinessObject newModelRelated()
	{
		return new BusinessObject();
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
		assertEquals(a.getIfaceID(), b.getIfaceID());
		assertEquals(a.getBusinessObjectID(), b.getBusinessObjectID());

		// Further attributes		
	}

	protected Iface createNewModel(String namePart) throws ApiException, Exception
	{
		Iface model = this.newModel();
		model.setName("Iface IfaceHasBusinessObject" + namePart);


		Iface newModel = this.getApi().createIface(model);
		return newModel;
	}

	protected BusinessObject createNewModelRelated(String namePart) throws ApiException, Exception
	{
		BusinessObject model = this.newModelRelated();
		model.setName("BusinessObject IfaceHasBusinessObject" + namePart);


		BusinessObject newModel = this.getApiRelated().createBusinessObject(model);
		return newModel;
	}	

	protected IfaceHasBusinessObject newRelationModel(Iface model, BusinessObject refModel)
	{
		IfaceHasBusinessObject relationModel = new IfaceHasBusinessObject();
		relationModel.setIfaceID(model.getID());
		relationModel.setBusinessObjectID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected IfaceHasBusinessObject createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Iface model = this.createNewModel(namePart + "A");
		BusinessObject modelRelated = this.createNewModelRelated(namePart + "B");

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

		IfaceHasBusinessObject newGetModel = this.getApi().getIfaceHasBusinessObject(newRelationModel.getIfaceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		IfaceHasBusinessObject newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		IfaceHasBusinessObject updatedModel = this.getApi().updateIfaceHasBusinessObject(newRelationModel.getIfaceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		IfaceHasBusinessObject newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteIfaceHasBusinessObject(newRelationModel.getIfaceID(), newRelationModel.getID());

		List<IfaceHasBusinessObject> models = this.getApi().getIfaceHasBusinessObjects(newRelationModel.getIfaceID());
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