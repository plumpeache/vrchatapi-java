/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.7
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
import io.github.vrchatapi.model.GroupPostVisibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * CreateGroupPostRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroupPostRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_SEND_NOTIFICATION = "sendNotification";
  @SerializedName(SERIALIZED_NAME_SEND_NOTIFICATION)
  private Boolean sendNotification = false;

  public static final String SERIALIZED_NAME_ROLE_IDS = "roleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<String> roleIds = null;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private GroupPostVisibility visibility;

  public CreateGroupPostRequest() {
  }

  public CreateGroupPostRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Post title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Event is starting soon!", required = true, value = "Post title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreateGroupPostRequest text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Post text
   * @return text
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Come join us for the event!", required = true, value = "Post text")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CreateGroupPostRequest imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "file_ce35d830-e20a-4df0-a6d4-5aaef4508044", value = "")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CreateGroupPostRequest sendNotification(Boolean sendNotification) {
    
    this.sendNotification = sendNotification;
    return this;
  }

   /**
   * Send notification to group members.
   * @return sendNotification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "Send notification to group members.")

  public Boolean getSendNotification() {
    return sendNotification;
  }


  public void setSendNotification(Boolean sendNotification) {
    this.sendNotification = sendNotification;
  }


  public CreateGroupPostRequest roleIds(List<String> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public CreateGroupPostRequest addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   *  
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }


  public CreateGroupPostRequest visibility(GroupPostVisibility visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GroupPostVisibility getVisibility() {
    return visibility;
  }


  public void setVisibility(GroupPostVisibility visibility) {
    this.visibility = visibility;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupPostRequest createGroupPostRequest = (CreateGroupPostRequest) o;
    return Objects.equals(this.title, createGroupPostRequest.title) &&
        Objects.equals(this.text, createGroupPostRequest.text) &&
        Objects.equals(this.imageId, createGroupPostRequest.imageId) &&
        Objects.equals(this.sendNotification, createGroupPostRequest.sendNotification) &&
        Objects.equals(this.roleIds, createGroupPostRequest.roleIds) &&
        Objects.equals(this.visibility, createGroupPostRequest.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, text, imageId, sendNotification, roleIds, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupPostRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sendNotification: ").append(toIndentedString(sendNotification)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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
    openapiFields.add("title");
    openapiFields.add("text");
    openapiFields.add("imageId");
    openapiFields.add("sendNotification");
    openapiFields.add("roleIds");
    openapiFields.add("visibility");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("text");
    openapiRequiredFields.add("sendNotification");
    openapiRequiredFields.add("visibility");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGroupPostRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateGroupPostRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupPostRequest is not found in the empty JSON string", CreateGroupPostRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateGroupPostRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGroupPostRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupPostRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (!jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      if ((jsonObj.get("imageId") != null && !jsonObj.get("imageId").isJsonNull()) && !jsonObj.get("imageId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIds") != null && !jsonObj.get("roleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIds` to be an array in the JSON string but got `%s`", jsonObj.get("roleIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupPostRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupPostRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupPostRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupPostRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupPostRequest>() {
           @Override
           public void write(JsonWriter out, CreateGroupPostRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGroupPostRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateGroupPostRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGroupPostRequest
  * @throws IOException if the JSON string is invalid with respect to CreateGroupPostRequest
  */
  public static CreateGroupPostRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupPostRequest.class);
  }

 /**
  * Convert an instance of CreateGroupPostRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

