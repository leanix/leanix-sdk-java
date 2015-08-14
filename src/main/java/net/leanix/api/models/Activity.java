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
import java.util.Date;

public class Activity implements Serializable {
    /*  */
    private String ID;
    /*  */
    private ActivityFactSheet factSheet;
    /*  */
    private ActivityUser user;
    /*  */
    private String eventType;
    /*  */
    private String title;
    /*  */
    private Date date;
    /*  */
    private String description;

    @JsonProperty("ID")
    public String getID() {
        return ID;
    }

    @JsonProperty("ID")
    public void setID(String ID) {
        this.ID = ID;
    }

    @JsonProperty("factSheet")
    public ActivityFactSheet getFactSheet() {
        return factSheet;
    }

    @JsonProperty("factSheet")
    public void setFactSheet(ActivityFactSheet factSheet) {
        this.factSheet = factSheet;
    }

    @JsonProperty("user")
    public ActivityUser getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(ActivityUser user) {
        this.user = user;
    }

    @JsonProperty("eventType")
    public String getEventType() {
        return eventType;
    }

    @JsonProperty("eventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

}
