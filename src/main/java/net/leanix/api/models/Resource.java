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

package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.*;
import net.leanix.api.models.ServiceHasResourceSvc;
import net.leanix.api.models.ResourceHasProviderHW;
import net.leanix.api.models.ResourceHasProviderSW;
import net.leanix.api.models.ServiceHasResourceHW;
import net.leanix.api.models.ServiceHasResourceSW;
import net.leanix.api.models.ResourceHasProviderSvc;
import net.leanix.api.models.ResourceHasResourceCapability;
public class Resource {
  /*  */
  private String ID = null;
  /*  */
  private String name = null;
  /*  */
  private String displayName = null;
  /*  */
  private String reference = null;
  /*  */
  private String alias = null;
  /*  */
  private String description = null;
  /*  */
  private String objectCategoryID = null;
  /*  */
  private String locationID = null;
  /*  */
  private List<ResourceHasProviderSvc> resourceHasProvidersSvc = new ArrayList<ResourceHasProviderSvc>();
  /*  */
  private List<ResourceHasProviderSW> resourceHasProvidersSW = new ArrayList<ResourceHasProviderSW>();
  /*  */
  private List<ResourceHasProviderHW> resourceHasProvidersHW = new ArrayList<ResourceHasProviderHW>();
  /*  */
  private List<ResourceHasResourceCapability> resourceHasResourceCapabilities = new ArrayList<ResourceHasResourceCapability>();
  /*  */
  private List<ServiceHasResourceSvc> serviceHasResourcesSvc = new ArrayList<ServiceHasResourceSvc>();
  /*  */
  private List<ServiceHasResourceSW> serviceHasResourcesSW = new ArrayList<ServiceHasResourceSW>();
  /*  */
  private List<ServiceHasResourceHW> serviceHasResourcesHW = new ArrayList<ServiceHasResourceHW>();
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  
  @JsonProperty("ID")
  public void setID(String ID) {
    this.ID = ID;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }
  
  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  
  @JsonProperty("displayName")
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }
  
  @JsonProperty("reference")
  public void setReference(String reference) {
    this.reference = reference;
  }

  @JsonProperty("alias")
  public String getAlias() {
    return alias;
  }
  
  @JsonProperty("alias")
  public void setAlias(String alias) {
    this.alias = alias;
  }

  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  
  @JsonProperty("description")
  public void setDescription(String description) {
    this.description = description;
  }

  @JsonProperty("objectCategoryID")
  public String getObjectCategoryID() {
    return objectCategoryID;
  }
  
  @JsonProperty("objectCategoryID")
  public void setObjectCategoryID(String objectCategoryID) {
    this.objectCategoryID = objectCategoryID;
  }

  @JsonProperty("locationID")
  public String getLocationID() {
    return locationID;
  }
  
  @JsonProperty("locationID")
  public void setLocationID(String locationID) {
    this.locationID = locationID;
  }

  @JsonProperty("resourceHasProvidersSvc")
  public List<ResourceHasProviderSvc> getResourceHasProvidersSvc() {
    return resourceHasProvidersSvc;
  }
  
  @JsonProperty("resourceHasProvidersSvc")
  public void setResourceHasProvidersSvc(List<ResourceHasProviderSvc> resourceHasProvidersSvc) {
    this.resourceHasProvidersSvc = resourceHasProvidersSvc;
  }

  @JsonProperty("resourceHasProvidersSW")
  public List<ResourceHasProviderSW> getResourceHasProvidersSW() {
    return resourceHasProvidersSW;
  }
  
  @JsonProperty("resourceHasProvidersSW")
  public void setResourceHasProvidersSW(List<ResourceHasProviderSW> resourceHasProvidersSW) {
    this.resourceHasProvidersSW = resourceHasProvidersSW;
  }

  @JsonProperty("resourceHasProvidersHW")
  public List<ResourceHasProviderHW> getResourceHasProvidersHW() {
    return resourceHasProvidersHW;
  }
  
  @JsonProperty("resourceHasProvidersHW")
  public void setResourceHasProvidersHW(List<ResourceHasProviderHW> resourceHasProvidersHW) {
    this.resourceHasProvidersHW = resourceHasProvidersHW;
  }

  @JsonProperty("resourceHasResourceCapabilities")
  public List<ResourceHasResourceCapability> getResourceHasResourceCapabilities() {
    return resourceHasResourceCapabilities;
  }
  
  @JsonProperty("resourceHasResourceCapabilities")
  public void setResourceHasResourceCapabilities(List<ResourceHasResourceCapability> resourceHasResourceCapabilities) {
    this.resourceHasResourceCapabilities = resourceHasResourceCapabilities;
  }

  @JsonProperty("serviceHasResourcesSvc")
  public List<ServiceHasResourceSvc> getServiceHasResourcesSvc() {
    return serviceHasResourcesSvc;
  }
  
  @JsonProperty("serviceHasResourcesSvc")
  public void setServiceHasResourcesSvc(List<ServiceHasResourceSvc> serviceHasResourcesSvc) {
    this.serviceHasResourcesSvc = serviceHasResourcesSvc;
  }

  @JsonProperty("serviceHasResourcesSW")
  public List<ServiceHasResourceSW> getServiceHasResourcesSW() {
    return serviceHasResourcesSW;
  }
  
  @JsonProperty("serviceHasResourcesSW")
  public void setServiceHasResourcesSW(List<ServiceHasResourceSW> serviceHasResourcesSW) {
    this.serviceHasResourcesSW = serviceHasResourcesSW;
  }

  @JsonProperty("serviceHasResourcesHW")
  public List<ServiceHasResourceHW> getServiceHasResourcesHW() {
    return serviceHasResourcesHW;
  }
  
  @JsonProperty("serviceHasResourcesHW")
  public void setServiceHasResourcesHW(List<ServiceHasResourceHW> serviceHasResourcesHW) {
    this.serviceHasResourcesHW = serviceHasResourcesHW;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  alias: ").append(alias).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  objectCategoryID: ").append(objectCategoryID).append("\n");
    sb.append("  locationID: ").append(locationID).append("\n");
    sb.append("  resourceHasProvidersSvc: ").append(resourceHasProvidersSvc).append("\n");
    sb.append("  resourceHasProvidersSW: ").append(resourceHasProvidersSW).append("\n");
    sb.append("  resourceHasProvidersHW: ").append(resourceHasProvidersHW).append("\n");
    sb.append("  resourceHasResourceCapabilities: ").append(resourceHasResourceCapabilities).append("\n");
    sb.append("  serviceHasResourcesSvc: ").append(serviceHasResourcesSvc).append("\n");
    sb.append("  serviceHasResourcesSW: ").append(serviceHasResourcesSW).append("\n");
    sb.append("  serviceHasResourcesHW: ").append(serviceHasResourcesHW).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

