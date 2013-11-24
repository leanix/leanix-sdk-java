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
public class ProjectHasProvider {
  /*  */
  private String ID = null;
  /*  */
  private String providerID = null;
  /*  */
  private String projectID = null;
  /*  */
  private String orderNo = null;
  /*  */
  private Double orderedOpex = null;
  /*  */
  private Double orderedCapex = null;
  /*  */
  private String comment = null;
  /*  */
  private Double actualsOpex = null;
  /*  */
  private Double actualsCapex = null;
  /*  */
  private Double etcOpex = null;
  /*  */
  private Double etcCapex = null;
  /*  */
  private Double deltaOpex = null;
  /*  */
  private Double deltaCapex = null;
  @JsonProperty("ID")
  public String getID() {
    return ID;
  }
  
  @JsonProperty("ID")
  public void setID(String ID) {
    this.ID = ID;
  }

  @JsonProperty("providerID")
  public String getProviderID() {
    return providerID;
  }
  
  @JsonProperty("providerID")
  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }

  @JsonProperty("projectID")
  public String getProjectID() {
    return projectID;
  }
  
  @JsonProperty("projectID")
  public void setProjectID(String projectID) {
    this.projectID = projectID;
  }

  @JsonProperty("orderNo")
  public String getOrderNo() {
    return orderNo;
  }
  
  @JsonProperty("orderNo")
  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }

  @JsonProperty("orderedOpex")
  public Double getOrderedOpex() {
    return orderedOpex;
  }
  
  @JsonProperty("orderedOpex")
  public void setOrderedOpex(Double orderedOpex) {
    this.orderedOpex = orderedOpex;
  }

  @JsonProperty("orderedCapex")
  public Double getOrderedCapex() {
    return orderedCapex;
  }
  
  @JsonProperty("orderedCapex")
  public void setOrderedCapex(Double orderedCapex) {
    this.orderedCapex = orderedCapex;
  }

  @JsonProperty("comment")
  public String getComment() {
    return comment;
  }
  
  @JsonProperty("comment")
  public void setComment(String comment) {
    this.comment = comment;
  }

  @JsonProperty("actualsOpex")
  public Double getActualsOpex() {
    return actualsOpex;
  }
  
  @JsonProperty("actualsOpex")
  public void setActualsOpex(Double actualsOpex) {
    this.actualsOpex = actualsOpex;
  }

  @JsonProperty("actualsCapex")
  public Double getActualsCapex() {
    return actualsCapex;
  }
  
  @JsonProperty("actualsCapex")
  public void setActualsCapex(Double actualsCapex) {
    this.actualsCapex = actualsCapex;
  }

  @JsonProperty("etcOpex")
  public Double getEtcOpex() {
    return etcOpex;
  }
  
  @JsonProperty("etcOpex")
  public void setEtcOpex(Double etcOpex) {
    this.etcOpex = etcOpex;
  }

  @JsonProperty("etcCapex")
  public Double getEtcCapex() {
    return etcCapex;
  }
  
  @JsonProperty("etcCapex")
  public void setEtcCapex(Double etcCapex) {
    this.etcCapex = etcCapex;
  }

  @JsonProperty("deltaOpex")
  public Double getDeltaOpex() {
    return deltaOpex;
  }
  
  @JsonProperty("deltaOpex")
  public void setDeltaOpex(Double deltaOpex) {
    this.deltaOpex = deltaOpex;
  }

  @JsonProperty("deltaCapex")
  public Double getDeltaCapex() {
    return deltaCapex;
  }
  
  @JsonProperty("deltaCapex")
  public void setDeltaCapex(Double deltaCapex) {
    this.deltaCapex = deltaCapex;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectHasProvider {\n");
    sb.append("  ID: ").append(ID).append("\n");
    sb.append("  providerID: ").append(providerID).append("\n");
    sb.append("  projectID: ").append(projectID).append("\n");
    sb.append("  orderNo: ").append(orderNo).append("\n");
    sb.append("  orderedOpex: ").append(orderedOpex).append("\n");
    sb.append("  orderedCapex: ").append(orderedCapex).append("\n");
    sb.append("  comment: ").append(comment).append("\n");
    sb.append("  actualsOpex: ").append(actualsOpex).append("\n");
    sb.append("  actualsCapex: ").append(actualsCapex).append("\n");
    sb.append("  etcOpex: ").append(etcOpex).append("\n");
    sb.append("  etcCapex: ").append(etcCapex).append("\n");
    sb.append("  deltaOpex: ").append(deltaOpex).append("\n");
    sb.append("  deltaCapex: ").append(deltaCapex).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

