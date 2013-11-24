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
import net.leanix.api.models.ResourceHasProviderHW;
import net.leanix.api.models.ResourceHasProviderSW;
import net.leanix.api.models.ProjectHasProvider;
import net.leanix.api.models.ResourceHasProviderSvc;
public class Provider {
  /*  */
  private String ID = null;
  /*  */
  private String name = null;
  /*  */
  private String reference = null;
  /*  */
  private String alias = null;
  /*  */
  private String description = null;
  /*  */
  private List<ProjectHasProvider> projectHasProviders = new ArrayList<ProjectHasProvider>();
  /*  */
  private List<ResourceHasProviderSvc> resourceHasProvidersSvc = new ArrayList<ResourceHasProviderSvc>();
  /*  */
  private List<ResourceHasProviderSW> resourceHasProvidersSW = new ArrayList<ResourceHasProviderSW>();
  /*  */
  private List<ResourceHasProviderHW> resourceHasProvidersHW = new ArrayList<ResourceHasProviderHW>();
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

  @JsonProperty("projectHasProviders")
  public List<ProjectHasProvider> getProjectHasProviders() {
    return projectHasProviders;
  }
  
  @JsonProperty("projectHasProviders")
  public void setProjectHasProviders(List<ProjectHasProvider> projectHasProviders) {
    this.projectHasProviders = projectHasProviders;
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

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Provider {\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  reference: ").append(reference).append("\n");
    sb.append("  alias: ").append(alias).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  projectHasProviders: ").append(projectHasProviders).append("\n");
    sb.append("  resourceHasProvidersSvc: ").append(resourceHasProvidersSvc).append("\n");
    sb.append("  resourceHasProvidersSW: ").append(resourceHasProvidersSW).append("\n");
    sb.append("  resourceHasProvidersHW: ").append(resourceHasProvidersHW).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

