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

import net.leanix.api.UsersApi;
import net.leanix.api.models.User;

import org.junit.ClassRule;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsersApiTest
{

	@ClassRule public static WorkspaceSetupRule setup = new WorkspaceSetupRule();
	
	final Logger logger = LoggerFactory.getLogger(UsersApiTest.class);
	
	protected UsersApi getApi() throws Exception
	{
		UsersApi api = new UsersApi(setup.getApiClient());
		return api;
	}
	
	@Test
	public void testGetList() throws Exception
	{	
		List<User> users = this.getApi().getUsers(false);
		
		// Only 1 user should be in the database after the workspace was created
		assertTrue(users.size() == 1);
	}
	
	@Test
	public void testGet() throws Exception
	{
		List<User> users = this.getApi().getUsers(false);
		
		// We expect to have at least 1 user
		assertTrue(users.size() > 0);
		User curUser = users.get(0);
		
		User user = this.getApi().getUser(curUser.getID(), false);
		// We should have at least one user
		assertNotNull(user);
	}

}
