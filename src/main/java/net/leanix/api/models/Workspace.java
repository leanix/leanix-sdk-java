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

package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
public class Workspace
{
	/*  */
	private String ID = null;
	/*  */
	private String name = null;
	/*  */
	private String workspaceStatusID = null;
	/*  */
	private String config = null;
	/*  */
	private String setup = null;
	@JsonProperty("ID")
	public String getID()
	{
		return ID;
	}
	
	@JsonProperty("ID")
	public void setID(String ID)
	{
		this.ID = ID;
	}

	@JsonProperty("name")
	public String getName()
	{
		return name;
	}
	
	@JsonProperty("name")
	public void setName(String name)
	{
		this.name = name;
	}

	@JsonProperty("workspaceStatusID")
	public String getWorkspaceStatusID()
	{
		return workspaceStatusID;
	}
	
	@JsonProperty("workspaceStatusID")
	public void setWorkspaceStatusID(String workspaceStatusID)
	{
		this.workspaceStatusID = workspaceStatusID;
	}

	@JsonProperty("config")
	public String getConfig()
	{
		return config;
	}
	
	@JsonProperty("config")
	public void setConfig(String config)
	{
		this.config = config;
	}

	@JsonProperty("setup")
	public String getSetup()
	{
		return setup;
	}
	
	@JsonProperty("setup")
	public void setSetup(String setup)
	{
		this.setup = setup;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class Workspace {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  name: ").append(name).append("\n");
		sb.append("  workspaceStatusID: ").append(workspaceStatusID).append("\n");
		sb.append("  config: ").append(config).append("\n");
		sb.append("  setup: ").append(setup).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

