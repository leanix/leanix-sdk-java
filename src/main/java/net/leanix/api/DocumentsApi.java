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
import net.leanix.api.models.Document;
import java.util.*;

public class DocumentsApi
{
	private ApiClient apiClient;
	
	public DocumentsApi(ApiClient client)
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

	public List<Document> getDocuments (Boolean relations, String filter) throws ApiException
	{
		// create path and map variables
		String path = "/documents".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		if(!"null".equals(String.valueOf(relations)))
			queryParams.put("relations", String.valueOf(relations));
		if(!"null".equals(String.valueOf(filter)))
			queryParams.put("filter", String.valueOf(filter));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<Document>) ApiClient.deserialize(response, "Array", Document.class);
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
	public Document createDocument (Document body) throws ApiException
	{
		// create path and map variables
		String path = "/documents".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		try
		{
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (Document) ApiClient.deserialize(response, "", Document.class);
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
	public Document getDocument (String ID, Boolean relations) throws ApiException
	{
		// create path and map variables
		String path = "/documents/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (Document) ApiClient.deserialize(response, "", Document.class);
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
	public Document updateDocument (String ID, Document body) throws ApiException
	{
		// create path and map variables
		String path = "/documents/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (Document) ApiClient.deserialize(response, "", Document.class);
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
	public void deleteDocument (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/documents/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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

