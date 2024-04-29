/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.3
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
import java.time.OffsetDateTime;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.vrchatapi.JSON;

/**
 * GroupGalleryImage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupGalleryImage {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_GALLERY_ID = "galleryId";
  @SerializedName(SERIALIZED_NAME_GALLERY_ID)
  private String galleryId;

  public static final String SERIALIZED_NAME_FILE_ID = "fileId";
  @SerializedName(SERIALIZED_NAME_FILE_ID)
  private String fileId;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private URI imageUrl;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SUBMITTED_BY_USER_ID = "submittedByUserId";
  @SerializedName(SERIALIZED_NAME_SUBMITTED_BY_USER_ID)
  private String submittedByUserId;

  public static final String SERIALIZED_NAME_APPROVED = "approved";
  @SerializedName(SERIALIZED_NAME_APPROVED)
  private Boolean approved = false;

  public static final String SERIALIZED_NAME_APPROVED_BY_USER_ID = "approvedByUserId";
  @SerializedName(SERIALIZED_NAME_APPROVED_BY_USER_ID)
  private String approvedByUserId;

  public static final String SERIALIZED_NAME_APPROVED_AT = "approvedAt";
  @SerializedName(SERIALIZED_NAME_APPROVED_AT)
  private OffsetDateTime approvedAt;

  public GroupGalleryImage() {
  }

  public GroupGalleryImage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ggim_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupGalleryImage groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupGalleryImage galleryId(String galleryId) {
    
    this.galleryId = galleryId;
    return this;
  }

   /**
   * Get galleryId
   * @return galleryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ggal_a03a4b55-4ca6-4490-9519-40ba6351a233", value = "")

  public String getGalleryId() {
    return galleryId;
  }


  public void setGalleryId(String galleryId) {
    this.galleryId = galleryId;
  }


  public GroupGalleryImage fileId(String fileId) {
    
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "file_ce35d830-e20a-4df0-a6d4-5aaef4508044", value = "")

  public String getFileId() {
    return fileId;
  }


  public void setFileId(String fileId) {
    this.fileId = fileId;
  }


  public GroupGalleryImage imageUrl(URI imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/file/file_ce35d830-e20a-4df0-a6d4-5aaef4508044/1/file", value = "")

  public URI getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(URI imageUrl) {
    this.imageUrl = imageUrl;
  }


  public GroupGalleryImage createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GroupGalleryImage submittedByUserId(String submittedByUserId) {
    
    this.submittedByUserId = submittedByUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return submittedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getSubmittedByUserId() {
    return submittedByUserId;
  }


  public void setSubmittedByUserId(String submittedByUserId) {
    this.submittedByUserId = submittedByUserId;
  }


  public GroupGalleryImage approved(Boolean approved) {
    
    this.approved = approved;
    return this;
  }

   /**
   * Get approved
   * @return approved
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "")

  public Boolean getApproved() {
    return approved;
  }


  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  public GroupGalleryImage approvedByUserId(String approvedByUserId) {
    
    this.approvedByUserId = approvedByUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return approvedByUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getApprovedByUserId() {
    return approvedByUserId;
  }


  public void setApprovedByUserId(String approvedByUserId) {
    this.approvedByUserId = approvedByUserId;
  }


  public GroupGalleryImage approvedAt(OffsetDateTime approvedAt) {
    
    this.approvedAt = approvedAt;
    return this;
  }

   /**
   * Get approvedAt
   * @return approvedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getApprovedAt() {
    return approvedAt;
  }


  public void setApprovedAt(OffsetDateTime approvedAt) {
    this.approvedAt = approvedAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupGalleryImage groupGalleryImage = (GroupGalleryImage) o;
    return Objects.equals(this.id, groupGalleryImage.id) &&
        Objects.equals(this.groupId, groupGalleryImage.groupId) &&
        Objects.equals(this.galleryId, groupGalleryImage.galleryId) &&
        Objects.equals(this.fileId, groupGalleryImage.fileId) &&
        Objects.equals(this.imageUrl, groupGalleryImage.imageUrl) &&
        Objects.equals(this.createdAt, groupGalleryImage.createdAt) &&
        Objects.equals(this.submittedByUserId, groupGalleryImage.submittedByUserId) &&
        Objects.equals(this.approved, groupGalleryImage.approved) &&
        Objects.equals(this.approvedByUserId, groupGalleryImage.approvedByUserId) &&
        Objects.equals(this.approvedAt, groupGalleryImage.approvedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, groupId, galleryId, fileId, imageUrl, createdAt, submittedByUserId, approved, approvedByUserId, approvedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupGalleryImage {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    galleryId: ").append(toIndentedString(galleryId)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    submittedByUserId: ").append(toIndentedString(submittedByUserId)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
    sb.append("    approvedByUserId: ").append(toIndentedString(approvedByUserId)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("groupId");
    openapiFields.add("galleryId");
    openapiFields.add("fileId");
    openapiFields.add("imageUrl");
    openapiFields.add("createdAt");
    openapiFields.add("submittedByUserId");
    openapiFields.add("approved");
    openapiFields.add("approvedByUserId");
    openapiFields.add("approvedAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupGalleryImage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupGalleryImage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupGalleryImage is not found in the empty JSON string", GroupGalleryImage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupGalleryImage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupGalleryImage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("galleryId") != null && !jsonObj.get("galleryId").isJsonNull()) && !jsonObj.get("galleryId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `galleryId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("galleryId").toString()));
      }
      if ((jsonObj.get("fileId") != null && !jsonObj.get("fileId").isJsonNull()) && !jsonObj.get("fileId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fileId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fileId").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
      if ((jsonObj.get("submittedByUserId") != null && !jsonObj.get("submittedByUserId").isJsonNull()) && !jsonObj.get("submittedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `submittedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("submittedByUserId").toString()));
      }
      if ((jsonObj.get("approvedByUserId") != null && !jsonObj.get("approvedByUserId").isJsonNull()) && !jsonObj.get("approvedByUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `approvedByUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("approvedByUserId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupGalleryImage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupGalleryImage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupGalleryImage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupGalleryImage.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupGalleryImage>() {
           @Override
           public void write(JsonWriter out, GroupGalleryImage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupGalleryImage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupGalleryImage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupGalleryImage
  * @throws IOException if the JSON string is invalid with respect to GroupGalleryImage
  */
  public static GroupGalleryImage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupGalleryImage.class);
  }

 /**
  * Convert an instance of GroupGalleryImage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

