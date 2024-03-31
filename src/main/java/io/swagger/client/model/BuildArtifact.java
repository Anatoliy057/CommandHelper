/*
 * MethodScript Apps
 * This is the api for the apps.methodscript.com server. This provides various public functionality for users of the MethodScript programming language.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Metadata about an artifact.
 */
@Schema(description = "Metadata about an artifact.")

public class BuildArtifact {
  @SerializedName("artifact")
  private String artifact = null;

  @SerializedName("buildId")
  private String buildId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("link")
  private String link = null;

  @SerializedName("fullLink")
  private String fullLink = null;

  @SerializedName("sha")
  private String sha = null;

  @SerializedName("commitDetails")
  private String commitDetails = null;

  @SerializedName("poisoned")
  private Boolean poisoned = null;

  public BuildArtifact artifact(String artifact) {
    this.artifact = artifact;
    return this;
  }

   /**
   * The artifact name.
   * @return artifact
  **/
  @Schema(required = true, description = "The artifact name.")
  public String getArtifact() {
    return artifact;
  }

  public void setArtifact(String artifact) {
    this.artifact = artifact;
  }

  public BuildArtifact buildId(String buildId) {
    this.buildId = buildId;
    return this;
  }

   /**
   * The build id, i.e. \&quot;build-123\&quot;.
   * @return buildId
  **/
  @Schema(required = true, description = "The build id, i.e. \"build-123\".")
  public String getBuildId() {
    return buildId;
  }

  public void setBuildId(String buildId) {
    this.buildId = buildId;
  }

  public BuildArtifact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The full artifact name, i.e. \&quot;build-123/artifact.jar\&quot;. This is what is used in the url to request the artifact.
   * @return name
  **/
  @Schema(required = true, description = "The full artifact name, i.e. \"build-123/artifact.jar\". This is what is used in the url to request the artifact.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BuildArtifact date(String date) {
    this.date = date;
    return this;
  }

   /**
   * The datetime when the artifact was built. yyyy-MM-dd&#x27;T&#x27;HH:mm:ss.SSSZ
   * @return date
  **/
  @Schema(required = true, description = "The datetime when the artifact was built. yyyy-MM-dd'T'HH:mm:ss.SSSZ")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public BuildArtifact link(String link) {
    this.link = link;
    return this;
  }

   /**
   * The path for the url, i.e. \&quot;/builds/artifact/build-123%2Fartifact.jar\&quot;.
   * @return link
  **/
  @Schema(required = true, description = "The path for the url, i.e. \"/builds/artifact/build-123%2Fartifact.jar\".")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public BuildArtifact fullLink(String fullLink) {
    this.fullLink = fullLink;
    return this;
  }

   /**
   * The full link to the artifact, including the host.
   * @return fullLink
  **/
  @Schema(required = true, description = "The full link to the artifact, including the host.")
  public String getFullLink() {
    return fullLink;
  }

  public void setFullLink(String fullLink) {
    this.fullLink = fullLink;
  }

  public BuildArtifact sha(String sha) {
    this.sha = sha;
    return this;
  }

   /**
   * The git sha hash of the commit that was used to make this build. May be an empty string, if the commit isn&#x27;t known, never null.
   * @return sha
  **/
  @Schema(required = true, description = "The git sha hash of the commit that was used to make this build. May be an empty string, if the commit isn't known, never null.")
  public String getSha() {
    return sha;
  }

  public void setSha(String sha) {
    this.sha = sha;
  }

  public BuildArtifact commitDetails(String commitDetails) {
    this.commitDetails = commitDetails;
    return this;
  }

   /**
   * The git commit message of the commit used to make this build. May be an empty string, if the commit isn&#x27;t known, never null.
   * @return commitDetails
  **/
  @Schema(required = true, description = "The git commit message of the commit used to make this build. May be an empty string, if the commit isn't known, never null.")
  public String getCommitDetails() {
    return commitDetails;
  }

  public void setCommitDetails(String commitDetails) {
    this.commitDetails = commitDetails;
  }

  public BuildArtifact poisoned(Boolean poisoned) {
    this.poisoned = poisoned;
    return this;
  }

   /**
   * A poisoned build shouldn&#x27;t be recommended. This is a build that is known to have had problems, but was already published, and will not be taken down.
   * @return poisoned
  **/
  @Schema(required = true, description = "A poisoned build shouldn't be recommended. This is a build that is known to have had problems, but was already published, and will not be taken down.")
  public Boolean isPoisoned() {
    return poisoned;
  }

  public void setPoisoned(Boolean poisoned) {
    this.poisoned = poisoned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildArtifact buildArtifact = (BuildArtifact) o;
    return Objects.equals(this.artifact, buildArtifact.artifact) &&
        Objects.equals(this.buildId, buildArtifact.buildId) &&
        Objects.equals(this.name, buildArtifact.name) &&
        Objects.equals(this.date, buildArtifact.date) &&
        Objects.equals(this.link, buildArtifact.link) &&
        Objects.equals(this.fullLink, buildArtifact.fullLink) &&
        Objects.equals(this.sha, buildArtifact.sha) &&
        Objects.equals(this.commitDetails, buildArtifact.commitDetails) &&
        Objects.equals(this.poisoned, buildArtifact.poisoned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifact, buildId, name, date, link, fullLink, sha, commitDetails, poisoned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildArtifact {\n");
    
    sb.append("    artifact: ").append(toIndentedString(artifact)).append("\n");
    sb.append("    buildId: ").append(toIndentedString(buildId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    fullLink: ").append(toIndentedString(fullLink)).append("\n");
    sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
    sb.append("    commitDetails: ").append(toIndentedString(commitDetails)).append("\n");
    sb.append("    poisoned: ").append(toIndentedString(poisoned)).append("\n");
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
