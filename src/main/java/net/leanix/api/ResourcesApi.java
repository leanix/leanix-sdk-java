/*
 * The MIT License (MIT)	 
 *
 * Copyright (c) 2013 LeanIX GmbH
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
import net.leanix.api.models.ServiceHasResourceSvc;
import net.leanix.api.models.ResourceHasProviderHW;
import net.leanix.api.models.Resource;
import net.leanix.api.models.ResourceHasProviderSW;
import net.leanix.api.models.ServiceHasResourceSW;
import net.leanix.api.models.ServiceHasResourceHW;
import net.leanix.api.models.ResourceHasProviderSvc;
import net.leanix.api.models.ResourceHasResourceCapability;
import java.util.*;

public class ResourcesApi {

  private ApiClient apiClient;
  
  public ResourcesApi(ApiClient client) {
    this.apiClient = client;
  }
  
  public void setClient(ApiClient client) {
    this.apiClient = client;
  }

  public ApiClient getClient() {
    return this.apiClient;
  }

  public List<Resource> getResources (Boolean relations, String filter) throws ApiException {
    // create path and map variables
    String path = "/resources".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    if(!"null".equals(String.valueOf(relations)))
      queryParams.put("relations", String.valueOf(relations));
    if(!"null".equals(String.valueOf(filter)))
      queryParams.put("filter", String.valueOf(filter));
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<Resource>) ApiClient.deserialize(response, "Array", Resource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Resource createResource (Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources".replaceAll("\\{format\\}","json");

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (Resource) ApiClient.deserialize(response, "", Resource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Resource getResource (String ID, Boolean relations) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    if(!"null".equals(String.valueOf(relations)))
      queryParams.put("relations", String.valueOf(relations));
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (Resource) ApiClient.deserialize(response, "", Resource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public Resource updateResource (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (Resource) ApiClient.deserialize(response, "", Resource.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteResource (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ResourceHasProviderSvc> getResourceHasProvidersSvc (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSvc".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ResourceHasProviderSvc>) ApiClient.deserialize(response, "Array", ResourceHasProviderSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderSvc createResourceHasProviderSvc (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSvc".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasProviderSvc) ApiClient.deserialize(response, "", ResourceHasProviderSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderSvc getResourceHasProviderSvc (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSvc/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ResourceHasProviderSvc) ApiClient.deserialize(response, "", ResourceHasProviderSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderSvc updateResourceHasProviderSvc (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSvc/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasProviderSvc) ApiClient.deserialize(response, "", ResourceHasProviderSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteResourceHasProviderSvc (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSvc/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ResourceHasProviderSW> getResourceHasProvidersSW (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ResourceHasProviderSW>) ApiClient.deserialize(response, "Array", ResourceHasProviderSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderSW createResourceHasProviderSW (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasProviderSW) ApiClient.deserialize(response, "", ResourceHasProviderSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderSW getResourceHasProviderSW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ResourceHasProviderSW) ApiClient.deserialize(response, "", ResourceHasProviderSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderSW updateResourceHasProviderSW (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasProviderSW) ApiClient.deserialize(response, "", ResourceHasProviderSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteResourceHasProviderSW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersSW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ResourceHasProviderHW> getResourceHasProvidersHW (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersHW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ResourceHasProviderHW>) ApiClient.deserialize(response, "Array", ResourceHasProviderHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderHW createResourceHasProviderHW (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersHW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasProviderHW) ApiClient.deserialize(response, "", ResourceHasProviderHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderHW getResourceHasProviderHW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersHW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ResourceHasProviderHW) ApiClient.deserialize(response, "", ResourceHasProviderHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasProviderHW updateResourceHasProviderHW (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersHW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasProviderHW) ApiClient.deserialize(response, "", ResourceHasProviderHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteResourceHasProviderHW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasProvidersHW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ResourceHasResourceCapability> getResourceHasResourceCapabilities (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasResourceCapabilities".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ResourceHasResourceCapability>) ApiClient.deserialize(response, "Array", ResourceHasResourceCapability.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasResourceCapability createResourceHasResourceCapability (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasResourceCapabilities".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasResourceCapability) ApiClient.deserialize(response, "", ResourceHasResourceCapability.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasResourceCapability getResourceHasResourceCapability (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasResourceCapabilities/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ResourceHasResourceCapability) ApiClient.deserialize(response, "", ResourceHasResourceCapability.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ResourceHasResourceCapability updateResourceHasResourceCapability (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasResourceCapabilities/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ResourceHasResourceCapability) ApiClient.deserialize(response, "", ResourceHasResourceCapability.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteResourceHasResourceCapability (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/resourceHasResourceCapabilities/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ServiceHasResourceSvc> getServiceHasResourcesSvc (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSvc".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ServiceHasResourceSvc>) ApiClient.deserialize(response, "Array", ServiceHasResourceSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceSvc createServiceHasResourceSvc (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSvc".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ServiceHasResourceSvc) ApiClient.deserialize(response, "", ServiceHasResourceSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceSvc getServiceHasResourceSvc (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSvc/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ServiceHasResourceSvc) ApiClient.deserialize(response, "", ServiceHasResourceSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceSvc updateServiceHasResourceSvc (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSvc/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ServiceHasResourceSvc) ApiClient.deserialize(response, "", ServiceHasResourceSvc.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteServiceHasResourceSvc (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSvc/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ServiceHasResourceSW> getServiceHasResourcesSW (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ServiceHasResourceSW>) ApiClient.deserialize(response, "Array", ServiceHasResourceSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceSW createServiceHasResourceSW (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ServiceHasResourceSW) ApiClient.deserialize(response, "", ServiceHasResourceSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceSW getServiceHasResourceSW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ServiceHasResourceSW) ApiClient.deserialize(response, "", ServiceHasResourceSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceSW updateServiceHasResourceSW (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ServiceHasResourceSW) ApiClient.deserialize(response, "", ServiceHasResourceSW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteServiceHasResourceSW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesSW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  public List<ServiceHasResourceHW> getServiceHasResourcesHW (String ID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesHW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (List<ServiceHasResourceHW>) ApiClient.deserialize(response, "Array", ServiceHasResourceHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceHW createServiceHasResourceHW (String ID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesHW".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "POST", queryParams, body, headerParams);
      if(response != null){
        return (ServiceHasResourceHW) ApiClient.deserialize(response, "", ServiceHasResourceHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceHW getServiceHasResourceHW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesHW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "GET", queryParams, null, headerParams);
      if(response != null){
        return (ServiceHasResourceHW) ApiClient.deserialize(response, "", ServiceHasResourceHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public ServiceHasResourceHW updateServiceHasResourceHW (String ID, String relationID, Resource body) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesHW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "PUT", queryParams, body, headerParams);
      if(response != null){
        return (ServiceHasResourceHW) ApiClient.deserialize(response, "", ServiceHasResourceHW.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return null;
      }
      else {
        throw ex;
      }
    }
  }
  public void deleteServiceHasResourceHW (String ID, String relationID) throws ApiException {
    // create path and map variables
    String path = "/resources/{ID}/serviceHasResourcesHW/{relationID}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "ID" + "\\}", apiClient.escapeString(ID.toString())).replaceAll("\\{" + "relationID" + "\\}", apiClient.escapeString(relationID.toString()));

    // query params
    Map<String, String> queryParams = new HashMap<String, String>();
    Map<String, String> headerParams = new HashMap<String, String>();

    // verify required params are set
    if(ID == null || relationID == null ) {
       throw new ApiException(400, "missing required params");
    }
    try {
      String response = apiClient.invokeAPI(path, "DELETE", queryParams, null, headerParams);
      if(response != null){
        return ;
      }
      else {
        return ;
      }
    } catch (ApiException ex) {
      if(ex.getCode() == 404) {
      	return ;
      }
      else {
        throw ex;
      }
    }
  }
  }

