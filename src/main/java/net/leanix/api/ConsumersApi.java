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
import net.leanix.api.models.FactSheetHasDocument;
import net.leanix.api.models.ResourceHasConsumer;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.ServiceHasConsumer;
import net.leanix.api.models.Consumer;
import net.leanix.api.models.FactSheetHasParent;
import java.util.*;

public class ConsumersApi
{
	private ApiClient apiClient;
	
	public ConsumersApi(ApiClient client)
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

	public List<Consumer> getConsumers (Boolean relations, String filter) throws ApiException
	{
		// create path and map variables
		String path = "/consumers".replaceAll("\\{format\\}","json");

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
				return (List<Consumer>) ApiClient.deserialize(response, "Array", Consumer.class);
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
	public Consumer createConsumer (Consumer body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		try
		{
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (Consumer) ApiClient.deserialize(response, "", Consumer.class);
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
	public Consumer getConsumer (String ID, Boolean relations) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (Consumer) ApiClient.deserialize(response, "", Consumer.class);
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
	public Consumer updateConsumer (String ID, Consumer body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (Consumer) ApiClient.deserialize(response, "", Consumer.class);
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
	public void deleteConsumer (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
	public List<FactSheetHasLifecycle> getFactSheetHasLifecycles (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<FactSheetHasLifecycle>) ApiClient.deserialize(response, "Array", FactSheetHasLifecycle.class);
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
	public FactSheetHasLifecycle createFactSheetHasLifecycle (String ID, FactSheetHasLifecycle body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasLifecycle) ApiClient.deserialize(response, "", FactSheetHasLifecycle.class);
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
	public FactSheetHasLifecycle getFactSheetHasLifecycle (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (FactSheetHasLifecycle) ApiClient.deserialize(response, "", FactSheetHasLifecycle.class);
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
	public FactSheetHasLifecycle updateFactSheetHasLifecycle (String ID, String relationID, FactSheetHasLifecycle body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasLifecycle) ApiClient.deserialize(response, "", FactSheetHasLifecycle.class);
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
	public void deleteFactSheetHasLifecycle (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
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
	public List<FactSheetHasParent> getFactSheetHasParents (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<FactSheetHasParent>) ApiClient.deserialize(response, "Array", FactSheetHasParent.class);
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
	public FactSheetHasParent createFactSheetHasParent (String ID, FactSheetHasParent body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasParent) ApiClient.deserialize(response, "", FactSheetHasParent.class);
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
	public FactSheetHasParent getFactSheetHasParent (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (FactSheetHasParent) ApiClient.deserialize(response, "", FactSheetHasParent.class);
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
	public FactSheetHasParent updateFactSheetHasParent (String ID, String relationID, FactSheetHasParent body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasParent) ApiClient.deserialize(response, "", FactSheetHasParent.class);
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
	public void deleteFactSheetHasParent (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
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
	public List<FactSheetHasChild> getFactSheetHasChildren (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<FactSheetHasChild>) ApiClient.deserialize(response, "Array", FactSheetHasChild.class);
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
	public FactSheetHasChild createFactSheetHasChild (String ID, FactSheetHasChild body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasChild) ApiClient.deserialize(response, "", FactSheetHasChild.class);
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
	public FactSheetHasChild getFactSheetHasChild (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (FactSheetHasChild) ApiClient.deserialize(response, "", FactSheetHasChild.class);
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
	public FactSheetHasChild updateFactSheetHasChild (String ID, String relationID, FactSheetHasChild body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasChild) ApiClient.deserialize(response, "", FactSheetHasChild.class);
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
	public void deleteFactSheetHasChild (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
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
	public List<ServiceHasConsumer> getServiceHasConsumers (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/serviceHasConsumers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<ServiceHasConsumer>) ApiClient.deserialize(response, "Array", ServiceHasConsumer.class);
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
	public ServiceHasConsumer createServiceHasConsumer (String ID, ServiceHasConsumer body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/serviceHasConsumers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (ServiceHasConsumer) ApiClient.deserialize(response, "", ServiceHasConsumer.class);
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
	public ServiceHasConsumer getServiceHasConsumer (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/serviceHasConsumers/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (ServiceHasConsumer) ApiClient.deserialize(response, "", ServiceHasConsumer.class);
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
	public ServiceHasConsumer updateServiceHasConsumer (String ID, String relationID, ServiceHasConsumer body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/serviceHasConsumers/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (ServiceHasConsumer) ApiClient.deserialize(response, "", ServiceHasConsumer.class);
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
	public void deleteServiceHasConsumer (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/serviceHasConsumers/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
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
	public List<ResourceHasConsumer> getResourceHasConsumers (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/resourceHasConsumers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<ResourceHasConsumer>) ApiClient.deserialize(response, "Array", ResourceHasConsumer.class);
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
	public ResourceHasConsumer createResourceHasConsumer (String ID, ResourceHasConsumer body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/resourceHasConsumers".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (ResourceHasConsumer) ApiClient.deserialize(response, "", ResourceHasConsumer.class);
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
	public ResourceHasConsumer getResourceHasConsumer (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/resourceHasConsumers/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (ResourceHasConsumer) ApiClient.deserialize(response, "", ResourceHasConsumer.class);
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
	public ResourceHasConsumer updateResourceHasConsumer (String ID, String relationID, ResourceHasConsumer body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/resourceHasConsumers/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (ResourceHasConsumer) ApiClient.deserialize(response, "", ResourceHasConsumer.class);
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
	public void deleteResourceHasConsumer (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/resourceHasConsumers/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
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
	public List<FactSheetHasDocument> getFactSheetHasDocuments (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (List<FactSheetHasDocument>) ApiClient.deserialize(response, "Array", FactSheetHasDocument.class);
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
	public FactSheetHasDocument createFactSheetHasDocument (String ID, FactSheetHasDocument body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasDocument) ApiClient.deserialize(response, "", FactSheetHasDocument.class);
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
	public FactSheetHasDocument getFactSheetHasDocument (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (FactSheetHasDocument) ApiClient.deserialize(response, "", FactSheetHasDocument.class);
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
	public FactSheetHasDocument updateFactSheetHasDocument (String ID, String relationID, FactSheetHasDocument body) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
		{
			throw new ApiException(400, "missing required params");
		}
		try
		{
			String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
			if (response != null)
			{
				return (FactSheetHasDocument) ApiClient.deserialize(response, "", FactSheetHasDocument.class);
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
	public void deleteFactSheetHasDocument (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/consumers/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		// verify required params are set
		if(ID == null || relationID == null )
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

