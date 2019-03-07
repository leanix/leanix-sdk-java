/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 4.0.217
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.leanix.api.models.LxField;

/**
 * Location
 */

public class Location extends LxField {
  @JsonProperty("placeId")
  private String placeId = null;

  @JsonProperty("rawAddress")
  private String rawAddress = null;

  @JsonProperty("latitude")
  private Double latitude = null;

  @JsonProperty("longitude")
  private Double longitude = null;

  @JsonProperty("geoCity")
  private String geoCity = null;

  @JsonProperty("geoCountryCode")
  private String geoCountryCode = null;

  @JsonProperty("geoCountry")
  private String geoCountry = null;

  @JsonProperty("geoAddress")
  private String geoAddress = null;

  @JsonProperty("geoStreet")
  private String geoStreet = null;

  @JsonProperty("geoHouseNumber")
  private String geoHouseNumber = null;

  @JsonProperty("geoPostalCode")
  private String geoPostalCode = null;

  public Location placeId(String placeId) {
    this.placeId = placeId;
    return this;
  }

   /**
   * Get placeId
   * @return placeId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getPlaceId() {
    return placeId;
  }

  public void setPlaceId(String placeId) {
    this.placeId = placeId;
  }

  public Location rawAddress(String rawAddress) {
    this.rawAddress = rawAddress;
    return this;
  }

   /**
   * Get rawAddress
   * @return rawAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getRawAddress() {
    return rawAddress;
  }

  public void setRawAddress(String rawAddress) {
    this.rawAddress = rawAddress;
  }

  public Location latitude(Double latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * Get latitude
   * @return latitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLatitude() {
    return latitude;
  }

  public void setLatitude(Double latitude) {
    this.latitude = latitude;
  }

  public Location longitude(Double longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * Get longitude
   * @return longitude
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLongitude() {
    return longitude;
  }

  public void setLongitude(Double longitude) {
    this.longitude = longitude;
  }

  public Location geoCity(String geoCity) {
    this.geoCity = geoCity;
    return this;
  }

   /**
   * Get geoCity
   * @return geoCity
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoCity() {
    return geoCity;
  }

  public void setGeoCity(String geoCity) {
    this.geoCity = geoCity;
  }

  public Location geoCountryCode(String geoCountryCode) {
    this.geoCountryCode = geoCountryCode;
    return this;
  }

   /**
   * Get geoCountryCode
   * @return geoCountryCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoCountryCode() {
    return geoCountryCode;
  }

  public void setGeoCountryCode(String geoCountryCode) {
    this.geoCountryCode = geoCountryCode;
  }

  public Location geoCountry(String geoCountry) {
    this.geoCountry = geoCountry;
    return this;
  }

   /**
   * Get geoCountry
   * @return geoCountry
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoCountry() {
    return geoCountry;
  }

  public void setGeoCountry(String geoCountry) {
    this.geoCountry = geoCountry;
  }

  public Location geoAddress(String geoAddress) {
    this.geoAddress = geoAddress;
    return this;
  }

   /**
   * Get geoAddress
   * @return geoAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoAddress() {
    return geoAddress;
  }

  public void setGeoAddress(String geoAddress) {
    this.geoAddress = geoAddress;
  }

  public Location geoStreet(String geoStreet) {
    this.geoStreet = geoStreet;
    return this;
  }

   /**
   * Get geoStreet
   * @return geoStreet
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoStreet() {
    return geoStreet;
  }

  public void setGeoStreet(String geoStreet) {
    this.geoStreet = geoStreet;
  }

  public Location geoHouseNumber(String geoHouseNumber) {
    this.geoHouseNumber = geoHouseNumber;
    return this;
  }

   /**
   * Get geoHouseNumber
   * @return geoHouseNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoHouseNumber() {
    return geoHouseNumber;
  }

  public void setGeoHouseNumber(String geoHouseNumber) {
    this.geoHouseNumber = geoHouseNumber;
  }

  public Location geoPostalCode(String geoPostalCode) {
    this.geoPostalCode = geoPostalCode;
    return this;
  }

   /**
   * Get geoPostalCode
   * @return geoPostalCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGeoPostalCode() {
    return geoPostalCode;
  }

  public void setGeoPostalCode(String geoPostalCode) {
    this.geoPostalCode = geoPostalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Location location = (Location) o;
    return Objects.equals(this.placeId, location.placeId) &&
        Objects.equals(this.rawAddress, location.rawAddress) &&
        Objects.equals(this.latitude, location.latitude) &&
        Objects.equals(this.longitude, location.longitude) &&
        Objects.equals(this.geoCity, location.geoCity) &&
        Objects.equals(this.geoCountryCode, location.geoCountryCode) &&
        Objects.equals(this.geoCountry, location.geoCountry) &&
        Objects.equals(this.geoAddress, location.geoAddress) &&
        Objects.equals(this.geoStreet, location.geoStreet) &&
        Objects.equals(this.geoHouseNumber, location.geoHouseNumber) &&
        Objects.equals(this.geoPostalCode, location.geoPostalCode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(placeId, rawAddress, latitude, longitude, geoCity, geoCountryCode, geoCountry, geoAddress, geoStreet, geoHouseNumber, geoPostalCode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Location {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    placeId: ").append(toIndentedString(placeId)).append("\n");
    sb.append("    rawAddress: ").append(toIndentedString(rawAddress)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    geoCity: ").append(toIndentedString(geoCity)).append("\n");
    sb.append("    geoCountryCode: ").append(toIndentedString(geoCountryCode)).append("\n");
    sb.append("    geoCountry: ").append(toIndentedString(geoCountry)).append("\n");
    sb.append("    geoAddress: ").append(toIndentedString(geoAddress)).append("\n");
    sb.append("    geoStreet: ").append(toIndentedString(geoStreet)).append("\n");
    sb.append("    geoHouseNumber: ").append(toIndentedString(geoHouseNumber)).append("\n");
    sb.append("    geoPostalCode: ").append(toIndentedString(geoPostalCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

