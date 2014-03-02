TemplateApiRelationTest(className, classNamePlural, classNameRef, classNameRefPlural, attributeRef, classNameRelation, classNameRelationPlural, attributes, attributesUpdate, attributesModel, attributesModelRef) ::= <<
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
import net.leanix.api.models.<classNameRef>;
import net.leanix.api.models.<classNameRelation>;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class <classNamePlural>Api<classNameRelationPlural>Test
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(<classNamePlural>Api<classNameRelationPlural>Test.class);

	protected <classNamePlural>Api getApi() throws Exception
	{
		<classNamePlural>Api api = new <classNamePlural>Api(setup.getApiClient());
		return api;
	}
	
	protected <classNameRefPlural>Api getApiRelated() throws Exception
	{
		<classNameRefPlural>Api api = new <classNameRefPlural>Api(setup.getApiClient());
		return api;
	}	

	protected <className> newModel()
	{
		return new <className>();
	}
	
	protected <classNameRef> newModelRelated()
	{
		return new <classNameRef>();
	}
	
	protected void setAttributes(<classNameRelation> model)
	{
		// Attributes
		<attributes:{each | model.set<each.name>(<each.value>);}>
	}
	
	protected void changeAttributes(<classNameRelation> model)
	{
		// Attributes
		<attributesUpdate:{each | model.set<each.name>(<each.update>);}>
	}
	
	protected void assertEqual(<classNameRelation> a, <classNameRelation> b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.get<className>ID(), b.get<className>ID());
		assertEquals(a.get<if(attributeRef)><attributeRef><else><classNameRef><endif>ID(), b.get<if(attributeRef)><attributeRef><else><classNameRef><endif>ID());
		
		// Further attributes		
		<attributes:{each | assertEquals(a.get<each.name>(), b.get<each.name>());}>
	}
	
	protected <className> createNewModel(String namePart) throws ApiException, Exception
	{
		<className> model = this.newModel();
		model.setName("<className> <classNameRelation>" + namePart);
		
		<attributesModel:{each | model.set<each.name>(<each.value>);}>

		<className> newModel = this.getApi().create<className>(model);
		return newModel;
	}
	
	protected <classNameRef> createNewModelRelated(String namePart) throws ApiException, Exception
	{
		<classNameRef> model = this.newModelRelated();
		model.setName("<classNameRef> <classNameRelation>" + namePart);
		
		<attributesModelRef:{each | model.set<each.name>(<each.value>);}>

		<classNameRef> newModel = this.getApiRelated().create<classNameRef>(model);
		return newModel;
	}	
	
	protected <classNameRelation> newRelationModel(<className> model, <classNameRef> refModel)
	{
		<classNameRelation> relationModel = new <classNameRelation>();
		relationModel.set<className>ID(model.getID());
		relationModel.set<if(attributeRef)><attributeRef><else><classNameRef><endif>ID(refModel.getID());
		
		this.setAttributes(relationModel);
		
		return relationModel;
	}
	
	protected <classNameRelation> createNewRelationModel(String namePart) throws ApiException, Exception
	{
		<className> model = this.createNewModel(namePart + "A");
		<classNameRef> modelRelated = this.createNewModelRelated(namePart + "B");
	
		<classNameRelation> relationModel = this.newRelationModel(model, modelRelated);
		
		<classNameRelation> newRelationModel = this.getApi().create<classNameRelation>(model.getID(), relationModel);
		
		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		<classNameRelation> newRelationModel = this.createNewRelationModel("CreateAndGet");
		
		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());
		
		<classNameRelation> newGetModel = this.getApi().get<classNameRelation>(newRelationModel.get<className>ID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());
		
		assertEqual(newRelationModel, newGetModel);
	}
	
	@Test
	public void testUpdate() throws Exception
	{	
		<classNameRelation> newRelationModel = this.createNewRelationModel("Update");
		
		this.changeAttributes(newRelationModel);
		
		<classNameRelation> updatedModel = this.getApi().update<classNameRelation>(newRelationModel.get<className>ID(), newRelationModel.getID(), newRelationModel);
		
		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}
	
	@Test
	public void testDelete() throws Exception
	{	
		<classNameRelation> newRelationModel = this.createNewRelationModel("Delete");
		
		assertNotNull(newRelationModel);
		
		this.getApi().delete<classNameRelation>(newRelationModel.get<className>ID(), newRelationModel.getID());
		
		List\<<classNameRelation>\> models = this.getApi().get<classNameRelationPlural>(newRelationModel.get<className>ID());
		boolean found = false;
		for (<classNameRelation> s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}
		
		// We should no longer find the deleted item
		assertFalse(found);
	}
}
>>