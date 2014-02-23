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
import net.leanix.api.models.BusinessObject;
import net.leanix.api.models.ServiceHasInterface;
import net.leanix.api.models.ServiceHasBusinessObject;
import java.util.*;

public class BusinessObjectsApi
{
  private ApiClient apiClient;
  
  public BusinessObjectsApi(ApiClient client)
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

  public List<BusinessObject> getBusinessObjects (Boolean relations, String filter) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects".replaceAll("\\{format\\}","json");

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
        return (List<BusinessObject>) ApiClient.deserialize(response, "Array", BusinessObject.class);
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
  public BusinessObject createBusinessObject (BusinessObject body) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try
		{
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if (response != null)
			{
        return (BusinessObject) ApiClient.deserialize(response, "", BusinessObject.class);
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
  public BusinessObject getBusinessObject (String ID, Boolean relations) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
        return (BusinessObject) ApiClient.deserialize(response, "", BusinessObject.class);
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
  public BusinessObject updateBusinessObject (String ID, BusinessObject body) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
        return (BusinessObject) ApiClient.deserialize(response, "", BusinessObject.class);
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
  public void deleteBusinessObject (String ID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
  public List<ServiceHasBusinessObject> getServiceHasBusinessObjects (String ID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasBusinessObjects".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
        return (List<ServiceHasBusinessObject>) ApiClient.deserialize(response, "Array", ServiceHasBusinessObject.class);
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
  public ServiceHasBusinessObject createServiceHasBusinessObject (String ID, BusinessObject body) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasBusinessObjects".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
        return (ServiceHasBusinessObject) ApiClient.deserialize(response, "", ServiceHasBusinessObject.class);
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
  public ServiceHasBusinessObject getServiceHasBusinessObject (String ID, String relationID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasBusinessObjects/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
        return (ServiceHasBusinessObject) ApiClient.deserialize(response, "", ServiceHasBusinessObject.class);
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
  public ServiceHasBusinessObject updateServiceHasBusinessObject (String ID, String relationID, BusinessObject body) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasBusinessObjects/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
        return (ServiceHasBusinessObject) ApiClient.deserialize(response, "", ServiceHasBusinessObject.class);
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
  public void deleteServiceHasBusinessObject (String ID, String relationID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasBusinessObjects/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
  public List<ServiceHasInterface> getServiceHasInterfaces (String ID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasInterfaces".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
        return (List<ServiceHasInterface>) ApiClient.deserialize(response, "Array", ServiceHasInterface.class);
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
  public ServiceHasInterface createServiceHasInterface (String ID, BusinessObject body) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasInterfaces".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

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
        return (ServiceHasInterface) ApiClient.deserialize(response, "", ServiceHasInterface.class);
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
  public ServiceHasInterface getServiceHasInterface (String ID, String relationID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasInterfaces/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
        return (ServiceHasInterface) ApiClient.deserialize(response, "", ServiceHasInterface.class);
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
  public ServiceHasInterface updateServiceHasInterface (String ID, String relationID, BusinessObject body) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasInterfaces/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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
        return (ServiceHasInterface) ApiClient.deserialize(response, "", ServiceHasInterface.class);
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
  public void deleteServiceHasInterface (String ID, String relationID) throws ApiException
	{
    // create path and map variables
    String path = "/businessObjects/{ID}/serviceHasInterfaces/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

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

