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

import net.leanix.api.common.ApiClient;
import net.leanix.api.common.ApiException;
import net.leanix.api.models.ActivityStream;

import java.util.HashMap;
import java.util.Map;

public class ActivitiesApi
{
	private ApiClient apiClient;
	
	public ActivitiesApi(ApiClient client)
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

	public ActivityStream getActivities (String scope, String startDate, String endDate, String factSheetType, String eventType, Integer countOnly) throws ApiException
	{
		// create path and map variables
		String path = "/activities".replaceAll("\\{format\\}","json");

		// query params
		Map<String, String> queryParams = new HashMap<String, String>();
		Map<String, String> headerParams = new HashMap<String, String>();

		if(!"null".equals(String.valueOf(scope)))
			queryParams.put("scope", String.valueOf(scope));
		if(!"null".equals(String.valueOf(startDate)))
			queryParams.put("startDate", String.valueOf(startDate));
		if(!"null".equals(String.valueOf(endDate)))
			queryParams.put("endDate", String.valueOf(endDate));
		if(!"null".equals(String.valueOf(factSheetType)))
			queryParams.put("factSheetType", String.valueOf(factSheetType));
		if(!"null".equals(String.valueOf(eventType)))
			queryParams.put("eventType", String.valueOf(eventType));
		if(!"null".equals(String.valueOf(countOnly)))
			queryParams.put("countOnly", String.valueOf(countOnly));
		try
		{
			String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
			if (response != null)
			{
				return (ActivityStream) ApiClient.deserialize(response, "", ActivityStream.class);
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
	}

