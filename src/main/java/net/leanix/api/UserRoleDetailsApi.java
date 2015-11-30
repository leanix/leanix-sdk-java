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

package net.leanix.api;

import net.leanix.api.common.ApiException;
import net.leanix.api.common.ApiClient;
import net.leanix.api.models.UserRoleDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserRoleDetailsApi
{
	private ApiClient apiClient;
	
	public UserRoleDetailsApi(ApiClient client)
	{
		this.apiClient = client;
	}
	
	public void setClient(ApiClient client)
	{
		this.apiClient = client;
	}

	public ApiClient getClient()
	{
		return this.apiClient;
	}

	public List<UserRoleDetail> getUserRoleDetails (Boolean relations) throws ApiException
	{
		// create path and map variables
		String path = "/userRoleDetails".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		if(!"null".equals(String.valueOf(relations)))
			queryParams.put("relations", String.valueOf(relations));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<UserRoleDetail>) ApiClient.deserialize(response, "Array", UserRoleDetail.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	public UserRoleDetail createUserRoleDetail (UserRoleDetail body) throws ApiException
	{
		// create path and map variables
		String path = "/userRoleDetails".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		try
		{
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (UserRoleDetail) ApiClient.deserialize(response, "", UserRoleDetail.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	public UserRoleDetail getUserRoleDetail (String ID, Boolean relations) throws ApiException
	{
		// create path and map variables
		String path = "/userRoleDetails/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		if(!"null".equals(String.valueOf(relations)))
			queryParams.put("relations", String.valueOf(relations));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (UserRoleDetail) ApiClient.deserialize(response, "", UserRoleDetail.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	public UserRoleDetail updateUserRoleDetail (String ID, UserRoleDetail body) throws ApiException
	{
		// create path and map variables
		String path = "/userRoleDetails/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (UserRoleDetail) ApiClient.deserialize(response, "", UserRoleDetail.class);
			}
			else
			{
				return null;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return null;
			}
			else
			{
				throw ex;
			}
		}
	}
	public void deleteUserRoleDetail (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/userRoleDetails/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
			if (response != null)
			{
				return ;
			}
			else
			{
				return ;
			}
		}
		catch (ApiException ex)
		{
			if(ex.getCode() == 404)
			{
				return ;
			}
			else
			{
				throw ex;
			}
		}
	}
	}

