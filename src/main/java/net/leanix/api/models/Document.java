/*
 * LeanIX Pathfinder REST API
 * Core application for storage and analysis of IT landscape data
 *
 * OpenAPI spec version: 5.0.170
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.leanix.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * Document
 */

public class Document {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("name")
  private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("url")
    private String url = null;

    @JsonProperty("origin")
    private String origin = null;

    @JsonProperty("documentType")
    private String documentType = null;

    @JsonProperty("metadata")
    private String metadata = null;

    @JsonProperty("createdAt")
    private OffsetDateTime createdAt = null;

    @JsonProperty("fileInformation")
    private FileInformation fileInformation = null;

    public Document id(UUID id) {
        this.id = id;
        return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Document name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Document description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Document url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Document origin(String origin) {
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
    **/
   @ApiModelProperty(example = "null", value = "")
   public String getOrigin() {
       return origin;
   }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Document documentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * Get documentType
     * @return documentType
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Document metadata(String metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     * @return metadata
     **/
    @ApiModelProperty(example = "null", value = "")
    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Document createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     **/
  @ApiModelProperty(example = "null", value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Document fileInformation(FileInformation fileInformation) {
    this.fileInformation = fileInformation;
    return this;
  }

   /**
   * Get fileInformation
   * @return fileInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public FileInformation getFileInformation() {
    return fileInformation;
  }

  public void setFileInformation(FileInformation fileInformation) {
    this.fileInformation = fileInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.name, document.name) &&
        Objects.equals(this.description, document.description) &&
        Objects.equals(this.url, document.url) &&
        Objects.equals(this.origin, document.origin) &&
        Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.metadata, document.metadata) &&
        Objects.equals(this.createdAt, document.createdAt) &&
        Objects.equals(this.fileInformation, document.fileInformation);
  }

  @Override
  public int hashCode() {
      return Objects.hash(id, name, description, url, origin, documentType, metadata, createdAt, fileInformation);
  }


  @Override
  public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("class Document {\n");

      sb.append("    id: ").append(toIndentedString(id)).append("\n");
      sb.append("    name: ").append(toIndentedString(name)).append("\n");
      sb.append("    description: ").append(toIndentedString(description)).append("\n");
      sb.append("    url: ").append(toIndentedString(url)).append("\n");
      sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
      sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
      sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
      sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
      sb.append("    fileInformation: ").append(toIndentedString(fileInformation)).append("\n");
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

