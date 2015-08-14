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
import java.io.*;

import java.util.*;
import net.leanix.api.models.Project;
public class ProjectUpdate implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String projectID = null;
	/*  */
	private String projectStatusID = null;
	/*  */
	private String statusDate = null;
	/*  */
	private String description = null;
	/*  */
	private String createUserID = null;
	/*  */
	private String updateUserID = null;
	/*  */
	private Double etcOpex = null;
	/*  */
	private Double etcCapex = null;
	/*  */
	private Double actualsOpex = null;
	/*  */
	private Double actualsCapex = null;
	/*  */
	private Long statusDateYear = null;
	/*  */
	private Long statusDateMonth = null;
	/*  */
	private Long progress = null;
	/*  */
	private List<Project> projects = new ArrayList<Project>();
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

	@JsonProperty("projectID")
	public String getProjectID()
	{
		return projectID;
	}
	
	@JsonProperty("projectID")
	public void setProjectID(String projectID)
	{
		this.projectID = projectID;
	}

	@JsonProperty("projectStatusID")
	public String getProjectStatusID()
	{
		return projectStatusID;
	}
	
	@JsonProperty("projectStatusID")
	public void setProjectStatusID(String projectStatusID)
	{
		this.projectStatusID = projectStatusID;
	}

	@JsonProperty("statusDate")
	public String getStatusDate()
	{
		return statusDate;
	}
	
	@JsonProperty("statusDate")
	public void setStatusDate(String statusDate)
	{
		this.statusDate = statusDate;
	}

	@JsonProperty("description")
	public String getDescription()
	{
		return description;
	}
	
	@JsonProperty("description")
	public void setDescription(String description)
	{
		this.description = description;
	}

	@JsonProperty("createUserID")
	public String getCreateUserID()
	{
		return createUserID;
	}
	
	@JsonProperty("createUserID")
	public void setCreateUserID(String createUserID)
	{
		this.createUserID = createUserID;
	}

	@JsonProperty("updateUserID")
	public String getUpdateUserID()
	{
		return updateUserID;
	}
	
	@JsonProperty("updateUserID")
	public void setUpdateUserID(String updateUserID)
	{
		this.updateUserID = updateUserID;
	}

	@JsonProperty("etcOpex")
	public Double getEtcOpex()
	{
		return etcOpex;
	}
	
	@JsonProperty("etcOpex")
	public void setEtcOpex(Double etcOpex)
	{
		this.etcOpex = etcOpex;
	}

	@JsonProperty("etcCapex")
	public Double getEtcCapex()
	{
		return etcCapex;
	}
	
	@JsonProperty("etcCapex")
	public void setEtcCapex(Double etcCapex)
	{
		this.etcCapex = etcCapex;
	}

	@JsonProperty("actualsOpex")
	public Double getActualsOpex()
	{
		return actualsOpex;
	}
	
	@JsonProperty("actualsOpex")
	public void setActualsOpex(Double actualsOpex)
	{
		this.actualsOpex = actualsOpex;
	}

	@JsonProperty("actualsCapex")
	public Double getActualsCapex()
	{
		return actualsCapex;
	}
	
	@JsonProperty("actualsCapex")
	public void setActualsCapex(Double actualsCapex)
	{
		this.actualsCapex = actualsCapex;
	}

	@JsonProperty("statusDateYear")
	public Long getStatusDateYear()
	{
		return statusDateYear;
	}
	
	@JsonProperty("statusDateYear")
	public void setStatusDateYear(Long statusDateYear)
	{
		this.statusDateYear = statusDateYear;
	}

	@JsonProperty("statusDateMonth")
	public Long getStatusDateMonth()
	{
		return statusDateMonth;
	}
	
	@JsonProperty("statusDateMonth")
	public void setStatusDateMonth(Long statusDateMonth)
	{
		this.statusDateMonth = statusDateMonth;
	}

	@JsonProperty("progress")
	public Long getProgress()
	{
		return progress;
	}
	
	@JsonProperty("progress")
	public void setProgress(Long progress)
	{
		this.progress = progress;
	}

	@JsonProperty("projects")
	public List<Project> getProjects()
	{
		return projects;
	}
	
	@JsonProperty("projects")
	public void setProjects(List<Project> projects)
	{
		this.projects = projects;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class ProjectUpdate {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  projectID: ").append(projectID).append("\n");
		sb.append("  projectStatusID: ").append(projectStatusID).append("\n");
		sb.append("  statusDate: ").append(statusDate).append("\n");
		sb.append("  description: ").append(description).append("\n");
		sb.append("  createUserID: ").append(createUserID).append("\n");
		sb.append("  updateUserID: ").append(updateUserID).append("\n");
		sb.append("  etcOpex: ").append(etcOpex).append("\n");
		sb.append("  etcCapex: ").append(etcCapex).append("\n");
		sb.append("  actualsOpex: ").append(actualsOpex).append("\n");
		sb.append("  actualsCapex: ").append(actualsCapex).append("\n");
		sb.append("  statusDateYear: ").append(statusDateYear).append("\n");
		sb.append("  statusDateMonth: ").append(statusDateMonth).append("\n");
		sb.append("  progress: ").append(progress).append("\n");
		sb.append("  projects: ").append(projects).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

