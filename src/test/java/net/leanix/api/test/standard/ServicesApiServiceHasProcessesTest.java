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
import net.leanix.api.models.Process;
import net.leanix.api.models.ServiceHasProcess;
import net.leanix.api.*;
import net.leanix.api.test.*;

import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServicesApiServiceHasProcessesTest
{
	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	@Rule public ExpectedException thrown = ExpectedException.none();

	final Logger logger = LoggerFactory.getLogger(ServicesApiServiceHasProcessesTest.class);

	protected ServicesApi getApi() throws Exception
	{
		ServicesApi api = new ServicesApi(setup.getApiClient());
		return api;
	}

	protected ProcessesApi getApiRelated() throws Exception
	{
		ProcessesApi api = new ProcessesApi(setup.getApiClient());
		return api;
	}	

	protected Service newModel()
	{
		return new Service();
	}

	protected Process newModelRelated()
	{
		return new Process();
	}

	protected void setAttributes(ServiceHasProcess model)
	{
		// Attributes
	}

	protected void changeAttributes(ServiceHasProcess model)
	{
		// Attributes
	}

	protected void assertEqual(ServiceHasProcess a, ServiceHasProcess b)
	{
		assertEquals(a.getID(), b.getID());
		assertEquals(a.getServiceID(), b.getServiceID());
		assertEquals(a.getProcessID(), b.getProcessID());

		// Further attributes		
	}

	protected Service createNewModel(String namePart) throws ApiException, Exception
	{
		Service model = this.newModel();
		model.setName("Service ServiceHasProcess" + namePart);


		Service newModel = this.getApi().createService(model);
		return newModel;
	}

	protected Process createNewModelRelated(String namePart) throws ApiException, Exception
	{
		Process model = this.newModelRelated();
		model.setName("Process ServiceHasProcess" + namePart);


		Process newModel = this.getApiRelated().createProcess(model);
		return newModel;
	}	

	protected ServiceHasProcess newRelationModel(Service model, Process refModel)
	{
		ServiceHasProcess relationModel = new ServiceHasProcess();
		relationModel.setServiceID(model.getID());
		relationModel.setProcessID(refModel.getID());

		this.setAttributes(relationModel);

		return relationModel;
	}

	protected ServiceHasProcess createNewRelationModel(String namePart) throws ApiException, Exception
	{
		Service model = this.createNewModel(namePart + "A");
		Process modelRelated = this.createNewModelRelated(namePart + "B");

		ServiceHasProcess relationModel = this.newRelationModel(model, modelRelated);

		ServiceHasProcess newRelationModel = this.getApi().createServiceHasProcess(model.getID(), relationModel);

		return newRelationModel;
	}

	@Test
	public void testCreateAndGet() throws Exception
	{	
		ServiceHasProcess newRelationModel = this.createNewRelationModel("CreateAndGet");

		assertNotNull(newRelationModel);
		assertNotNull(newRelationModel.getID());

		ServiceHasProcess newGetModel = this.getApi().getServiceHasProcess(newRelationModel.getServiceID(), newRelationModel.getID());
		assertNotNull(newGetModel);
		assertNotNull(newGetModel.getID());

		assertEqual(newRelationModel, newGetModel);
	}

	@Test
	public void testUpdate() throws Exception
	{	
		ServiceHasProcess newRelationModel = this.createNewRelationModel("Update");

		this.changeAttributes(newRelationModel);

		ServiceHasProcess updatedModel = this.getApi().updateServiceHasProcess(newRelationModel.getServiceID(), newRelationModel.getID(), newRelationModel);

		assertNotNull(updatedModel);
		assertEqual(newRelationModel, updatedModel);
	}

	@Test
	public void testDelete() throws Exception
	{	
		ServiceHasProcess newRelationModel = this.createNewRelationModel("Delete");

		assertNotNull(newRelationModel);

		this.getApi().deleteServiceHasProcess(newRelationModel.getServiceID(), newRelationModel.getID());

		List<ServiceHasProcess> models = this.getApi().getServiceHasProcesses(newRelationModel.getServiceID());
		boolean found = false;
		for (ServiceHasProcess s : models)
		{
			if (newRelationModel.getID().equals(s.getID()))
				found = true;	
		}

		// We should no longer find the deleted item
		assertFalse(found);
	}
}