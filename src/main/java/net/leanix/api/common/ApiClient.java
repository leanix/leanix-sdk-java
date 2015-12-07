/*
* The MIT License (MIT)
*
* Copyright (c) 2015 LeanIX GmbH
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

package net.leanix.api.common;

import com.fasterxml.jackson.databind.JavaType;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.client.urlconnection.HttpURLConnectionFactory;
import com.sun.jersey.client.urlconnection.URLConnectionClientHandler;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiClient
{
	private Client cachedJerseyClient = null;
	private boolean enableHttpLogging;

	private Map<String, String> defaultHeaderMap = new HashMap<String, String>();
	private String basePath;

	/**
	 * Enables/disables HTTP traffic logging by Jersey via java util logging.
	 * Removes the cached Jersey client so a correctly configure new one will be created on
	 * the next call to invokeAPI().
	 *
	 * @param flag
	 */
	public void setEnableHttpLogging(boolean flag) {
		this.cachedJerseyClient = null;
		this.enableHttpLogging = flag;
	}

	public boolean isEnableHttpLogging() {
		return enableHttpLogging;
	}

	/**
	 * Sets a new base path configuration (destination) for this client.
	 * Removes the cached Jersey client so a correctly configure new one will be created on
	 * the next call to invokeAPI().
	 * <p>
	 * Please consider using multiple ApiClient instances instead, each one having a fixed
	 * configuration. Creating Jersey clients is expensive.
	 * @param basePath
	 */
	public void setBasePath(String basePath)
	{
		this.basePath = basePath;
	}
		
	public String getBasePath()
	{
		return basePath;
	}
	
	public void setApiKey(String apiKey)
	{
		this.addDefaultHeader("Api-Key", apiKey);
	}
	
	public void addDefaultHeader(String key, String value)
	{
		defaultHeaderMap.put(key, value);
	}

	public String escapeString(String str)
	{
		return str;
	}

	public static Object deserialize(String json, String containerType, Class cls) throws ApiException
	{
		try
		{
			if("List".equals(containerType) || "Array".equals(containerType))
			{
				JavaType typeInfo = JsonUtil.getJsonMapper().getTypeFactory().constructCollectionType(List.class, cls);
				List response = (List<?>) JsonUtil.getJsonMapper().readValue(json, typeInfo);
				return response;
			}
			else if(String.class.equals(cls))
			{
				if(json != null && json.startsWith("\"") && json.endsWith("\"") && json.length() > 1)
					return json.substring(1, json.length() - 2);
				else 
					return json;
			}
			else
			{
				return JsonUtil.getJsonMapper().readValue(json, cls);
			}
		}
		catch (IOException e)
		{
			throw new ApiException(500, e.getMessage());
		}
	}

	public static String serialize(Object obj) throws ApiException
	{
		try
		{
			if (obj != null) 
				return JsonUtil.getJsonMapper().writeValueAsString(obj);
			else 
				return null;
		}
		catch (Exception e)
		{
			throw new ApiException(500, e.getMessage());
		}
	}

	public String invokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams) throws ApiException
	{
		Client client = getClient();

		StringBuilder b = new StringBuilder();
		
		for(String key : queryParams.keySet())
		{
			String value = queryParams.get(key);
			if (value != null)
			{
				if(b.toString().length() == 0)
					b.append("?");
				else
					b.append("&");
				b.append(escapeString(key)).append("=").append(escapeString(value));
			}
		}
		String querystring = b.toString();

		Builder builder = client.resource(basePath + path + querystring).accept("application/json");
		for(String key : headerParams.keySet())
		{
			builder.header(key, headerParams.get(key));
		}
		
		for(String key : defaultHeaderMap.keySet())
		{
			if(!headerParams.containsKey(key))
			{
				builder.header(key, defaultHeaderMap.get(key));
			}
		}
		ClientResponse response = null;

		if("GET".equals(method))
		{
			response = (ClientResponse) builder.get(ClientResponse.class);
		}
		else if ("POST".equals(method))
		{
			if(body == null)
				response = builder.post(ClientResponse.class, serialize(body));
			else
				response = builder.type("application/json").post(ClientResponse.class, serialize(body));
		}
		else if ("PUT".equals(method))
		{
			if(body == null)
				response = builder.put(ClientResponse.class, serialize(body));
			else
				response = builder.type("application/json").put(ClientResponse.class, serialize(body));
		}
		else if ("DELETE".equals(method))
		{
			if(body == null)
				response = builder.delete(ClientResponse.class, serialize(body));
			else
				response = builder.type("application/json").delete(ClientResponse.class, serialize(body));
		}
		else
		{
			throw new ApiException(500, "unknown method type " + method);
		}

		if(response.getStatus() == 200)
		{
			return (String) response.getEntity(String.class);
		}
        else if (response.getStatus() == 422)
        {
            Response resp = null;
            resp = (Response) ApiClient.deserialize((String) response.getEntity(String.class), "", Response.class);
            
            throw new ValidationException(resp);
        }
		else
		{
			throw new ApiException(response.getStatus(), response.getEntity(String.class));      
		}
	}

	private Client getClient() {
		Client client = cachedJerseyClient;

		if (client == null) {
			client = new Client(
				new URLConnectionClientHandler(
					new HttpURLConnectionFactory() {
						Proxy p = null;
						@Override
						public HttpURLConnection getHttpURLConnection(URL url) throws IOException {
							if(p == null) {
								if (System.getProperties().containsKey("http.proxyHost")) {
									p = new Proxy(Proxy.Type.HTTP,
											new InetSocketAddress(
											System.getProperty("http.proxyHost"),
											Integer.getInteger("http.proxyPort", 80)));
								} else
									p = Proxy.NO_PROXY;
							}
							return (HttpURLConnection) url.openConnection(p);
						}
					}),
					new DefaultClientConfig());

			if (enableHttpLogging) {
				client.addFilter(new LoggingFilter());
			}
			cachedJerseyClient = client;
		}
		return client;
	}
}


