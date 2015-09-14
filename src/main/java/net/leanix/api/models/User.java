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
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
	/*  */
	private String ID = null;
	/*  */
	private String firstName = null;
	/*  */
	private String lastName = null;
	/*  */
	private String email = null;
	/*  */
	private String userStatusID = null;
	/*  */
	private List<UserSubscription> userSubscriptions = new ArrayList<UserSubscription>();

	/*  */
	private String uuid = null;

	@JsonProperty("ID")
	public String getID() {
		return ID;
	}

	@JsonProperty("ID")
	public void setID(String ID) {
		this.ID = ID;
	}

	@JsonProperty("firstName")
	public String getFirstName() {
		return firstName;
	}

	@JsonProperty("firstName")
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@JsonProperty("lastName")
	public String getLastName() {
		return lastName;
	}

	@JsonProperty("lastName")
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@JsonProperty("email")
	public String getEmail() {
		return email;
	}

	@JsonProperty("email")
	public void setEmail(String email) {
		this.email = email;
	}

	@JsonProperty("userStatusID")
	public String getUserStatusID() {
		return userStatusID;
	}

	@JsonProperty("userStatusID")
	public void setUserStatusID(String userStatusID) {
		this.userStatusID = userStatusID;
	}

	@JsonProperty("userSubscriptions")
	public List<UserSubscription> getUserSubscriptions() {
		return userSubscriptions;
	}

	@JsonProperty("userSubscriptions")
	public void setUserSubscriptions(List<UserSubscription> userSubscriptions) {
		this.userSubscriptions = userSubscriptions;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class User {\n");
		sb.append("  ID: ").append(ID).append("\n");
		sb.append("  firstName: ").append(firstName).append("\n");
		sb.append("  lastName: ").append(lastName).append("\n");
		sb.append("  email: ").append(email).append("\n");
		sb.append("  userStatusID: ").append(userStatusID).append("\n");
		sb.append("  userSubscriptions: ").append(userSubscriptions).append("\n");
		sb.append("}\n");
		return sb.toString();
	}

	@JsonProperty("uuid")
	public String getUuid() {
		return uuid;
	}

	@JsonProperty("uuid")
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
}
