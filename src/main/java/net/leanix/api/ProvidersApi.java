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
import net.leanix.api.models.ResourceHasProvider;
import net.leanix.api.models.FactSheetHasPredecessor;
import net.leanix.api.models.FactSheetHasRequires;
import net.leanix.api.models.FactSheetHasChild;
import net.leanix.api.models.FactSheetHasLifecycle;
import net.leanix.api.models.UserSubscription;
import net.leanix.api.models.Provider;
import net.leanix.api.models.ProjectHasProvider;
import net.leanix.api.models.FactSheetHasSuccessor;
import net.leanix.api.models.FactSheetHasRequiredby;
import net.leanix.api.models.FactSheetHasParent;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProvidersApi
{
	private ApiClient apiClient;
	
	public ProvidersApi(ApiClient client)
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

	public List<Provider> getProviders (Boolean relations, String filter) throws ApiException
	{
		// create path and map variables
		String path = "/providers".replaceAll("\\{format\\}","json");

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
				return (List<Provider>) ApiClient.deserialize(response, "Array", Provider.class);
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
	public Provider createProvider (Provider body) throws ApiException
	{
		// create path and map variables
		String path = "/providers".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		try
		{
			String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
			if (response != null)
			{
				return (Provider) ApiClient.deserialize(response, "", Provider.class);
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
	public Provider getProvider (String ID, Boolean relations) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (Provider) ApiClient.deserialize(response, "", Provider.class);
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
	public Provider updateProvider (String ID, Provider body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (Provider) ApiClient.deserialize(response, "", Provider.class);
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
	public void deleteProvider (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
	public List<FactSheetHasParent> getFactSheetHasParents (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasParents".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasParents/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasChildren".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasChildren/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasDocuments".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasDocuments/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<FactSheetHasLifecycle> getFactSheetHasLifecycles (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasLifecycles".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
		String path = "/providers/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
		String path = "/providers/{ID}/factSheetHasLifecycles/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<UserSubscription> getUserSubscriptions (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/userSubscriptions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<UserSubscription>) ApiClient.deserialize(response, "Array", UserSubscription.class);
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
	public UserSubscription createUserSubscription (String ID, UserSubscription body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/userSubscriptions".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (UserSubscription) ApiClient.deserialize(response, "", UserSubscription.class);
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
	public UserSubscription getUserSubscription (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (UserSubscription) ApiClient.deserialize(response, "", UserSubscription.class);
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
	public UserSubscription updateUserSubscription (String ID, String relationID, UserSubscription body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (UserSubscription) ApiClient.deserialize(response, "", UserSubscription.class);
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
	public void deleteUserSubscription (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/userSubscriptions/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<FactSheetHasPredecessor> getFactSheetHasPredecessors (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<FactSheetHasPredecessor>) ApiClient.deserialize(response, "Array", FactSheetHasPredecessor.class);
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
	public FactSheetHasPredecessor createFactSheetHasPredecessor (String ID, FactSheetHasPredecessor body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasPredecessors".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (FactSheetHasPredecessor) ApiClient.deserialize(response, "", FactSheetHasPredecessor.class);
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
	public FactSheetHasPredecessor getFactSheetHasPredecessor (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasPredecessor) ApiClient.deserialize(response, "", FactSheetHasPredecessor.class);
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
	public FactSheetHasPredecessor updateFactSheetHasPredecessor (String ID, String relationID, FactSheetHasPredecessor body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasPredecessor) ApiClient.deserialize(response, "", FactSheetHasPredecessor.class);
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
	public void deleteFactSheetHasPredecessor (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasPredecessors/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<FactSheetHasSuccessor> getFactSheetHasSuccessors (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<FactSheetHasSuccessor>) ApiClient.deserialize(response, "Array", FactSheetHasSuccessor.class);
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
	public FactSheetHasSuccessor createFactSheetHasSuccessor (String ID, FactSheetHasSuccessor body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasSuccessors".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (FactSheetHasSuccessor) ApiClient.deserialize(response, "", FactSheetHasSuccessor.class);
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
	public FactSheetHasSuccessor getFactSheetHasSuccessor (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasSuccessor) ApiClient.deserialize(response, "", FactSheetHasSuccessor.class);
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
	public FactSheetHasSuccessor updateFactSheetHasSuccessor (String ID, String relationID, FactSheetHasSuccessor body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasSuccessor) ApiClient.deserialize(response, "", FactSheetHasSuccessor.class);
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
	public void deleteFactSheetHasSuccessor (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasSuccessors/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<FactSheetHasRequires> getFactSheetHasRequiresAll (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<FactSheetHasRequires>) ApiClient.deserialize(response, "Array", FactSheetHasRequires.class);
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
	public FactSheetHasRequires createFactSheetHasRequires (String ID, FactSheetHasRequires body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequires".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (FactSheetHasRequires) ApiClient.deserialize(response, "", FactSheetHasRequires.class);
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
	public FactSheetHasRequires getFactSheetHasRequires (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasRequires) ApiClient.deserialize(response, "", FactSheetHasRequires.class);
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
	public FactSheetHasRequires updateFactSheetHasRequires (String ID, String relationID, FactSheetHasRequires body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasRequires) ApiClient.deserialize(response, "", FactSheetHasRequires.class);
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
	public void deleteFactSheetHasRequires (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequires/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<FactSheetHasRequiredby> getFactSheetHasRequiredByAll (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<FactSheetHasRequiredby>) ApiClient.deserialize(response, "Array", FactSheetHasRequiredby.class);
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
	public FactSheetHasRequiredby createFactSheetHasRequiredby (String ID, FactSheetHasRequiredby body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequiredby".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (FactSheetHasRequiredby) ApiClient.deserialize(response, "", FactSheetHasRequiredby.class);
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
	public FactSheetHasRequiredby getFactSheetHasRequiredby (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasRequiredby) ApiClient.deserialize(response, "", FactSheetHasRequiredby.class);
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
	public FactSheetHasRequiredby updateFactSheetHasRequiredby (String ID, String relationID, FactSheetHasRequiredby body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (FactSheetHasRequiredby) ApiClient.deserialize(response, "", FactSheetHasRequiredby.class);
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
	public void deleteFactSheetHasRequiredby (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/factSheetHasRequiredby/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<ResourceHasProvider> getResourceHasProviders (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/resourceHasProviders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<ResourceHasProvider>) ApiClient.deserialize(response, "Array", ResourceHasProvider.class);
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
	public ResourceHasProvider createResourceHasProvider (String ID, ResourceHasProvider body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/resourceHasProviders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (ResourceHasProvider) ApiClient.deserialize(response, "", ResourceHasProvider.class);
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
	public ResourceHasProvider getResourceHasProvider (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/resourceHasProviders/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (ResourceHasProvider) ApiClient.deserialize(response, "", ResourceHasProvider.class);
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
	public ResourceHasProvider updateResourceHasProvider (String ID, String relationID, ResourceHasProvider body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/resourceHasProviders/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (ResourceHasProvider) ApiClient.deserialize(response, "", ResourceHasProvider.class);
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
	public void deleteResourceHasProvider (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/resourceHasProviders/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
	public List<ProjectHasProvider> getProjectHasProviders (String ID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/projectHasProviders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (List<ProjectHasProvider>) ApiClient.deserialize(response, "Array", ProjectHasProvider.class);
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
	public ProjectHasProvider createProjectHasProvider (String ID, ProjectHasProvider body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/projectHasProviders".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
				return (ProjectHasProvider) ApiClient.deserialize(response, "", ProjectHasProvider.class);
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
	public ProjectHasProvider getProjectHasProvider (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/projectHasProviders/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (ProjectHasProvider) ApiClient.deserialize(response, "", ProjectHasProvider.class);
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
	public ProjectHasProvider updateProjectHasProvider (String ID, String relationID, ProjectHasProvider body) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/projectHasProviders/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
				return (ProjectHasProvider) ApiClient.deserialize(response, "", ProjectHasProvider.class);
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
	public void deleteProjectHasProvider (String ID, String relationID) throws ApiException
	{
		// create path and map variables
		String path = "/providers/{ID}/projectHasProviders/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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

