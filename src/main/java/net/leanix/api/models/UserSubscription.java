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

import java.io.Serializable;

public class UserSubscription implements Serializable
{
	/*  */
	private String ID = null;
	/*  */
	private String factSheetID = null;
	/*  */
	private String userID = null;
	/*  */
	private String subscriptionTypeID = null;
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

	@JsonProperty("factSheetID")
	public String getFactSheetID()
	{
		return factSheetID;
	}
	
	@JsonProperty("factSheetID")
	public void setFactSheetID(String factSheetID)
	{
		this.factSheetID = factSheetID;
	}

	@JsonProperty("userID")
	public String getUserID()
	{
		return userID;
	}
	
	@JsonProperty("userID")
	public void setUserID(String userID)
	{
		this.userID = userID;
	}

	@JsonProperty("subscriptionTypeID")
	public String getSubscriptionTypeID()
	{
		return subscriptionTypeID;
	}
	
	@JsonProperty("subscriptionTypeID")
	public void setSubscriptionTypeID(String subscriptionTypeID)
	{
		this.subscriptionTypeID = subscriptionTypeID;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("class UserSubscription {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  factSheetID: ").append(factSheetID).append("\n");
		sb.append("  userID: ").append(userID).append("\n");
		sb.append("  subscriptionTypeID: ").append(subscriptionTypeID).append("\n");
		sb.append("}\n");
		return sb.toString();
	}
}

