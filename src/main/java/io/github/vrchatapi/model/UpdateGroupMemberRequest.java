/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.5
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
import io.github.vrchatapi.model.GroupUserVisibility;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * UpdateGroupMemberRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdateGroupMemberRequest {
  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private GroupUserVisibility visibility;

  public static final String SERIALIZED_NAME_IS_SUBSCRIBED_TO_ANNOUNCEMENTS = "isSubscribedToAnnouncements";
  @SerializedName(SERIALIZED_NAME_IS_SUBSCRIBED_TO_ANNOUNCEMENTS)
  private Boolean isSubscribedToAnnouncements;

  public static final String SERIALIZED_NAME_MANAGER_NOTES = "managerNotes";
  @SerializedName(SERIALIZED_NAME_MANAGER_NOTES)
  private String managerNotes;

  public UpdateGroupMemberRequest() {
  }

  public UpdateGroupMemberRequest visibility(GroupUserVisibility visibility) {
    
    this.visibility = visibility;
    return this;
  }

   /**
   * Get visibility
   * @return visibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupUserVisibility getVisibility() {
    return visibility;
  }


  public void setVisibility(GroupUserVisibility visibility) {
    this.visibility = visibility;
  }


  public UpdateGroupMemberRequest isSubscribedToAnnouncements(Boolean isSubscribedToAnnouncements) {
    
    this.isSubscribedToAnnouncements = isSubscribedToAnnouncements;
    return this;
  }

   /**
   * Get isSubscribedToAnnouncements
   * @return isSubscribedToAnnouncements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsSubscribedToAnnouncements() {
    return isSubscribedToAnnouncements;
  }


  public void setIsSubscribedToAnnouncements(Boolean isSubscribedToAnnouncements) {
    this.isSubscribedToAnnouncements = isSubscribedToAnnouncements;
  }


  public UpdateGroupMemberRequest managerNotes(String managerNotes) {
    
    this.managerNotes = managerNotes;
    return this;
  }

   /**
   * Get managerNotes
   * @return managerNotes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getManagerNotes() {
    return managerNotes;
  }


  public void setManagerNotes(String managerNotes) {
    this.managerNotes = managerNotes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateGroupMemberRequest updateGroupMemberRequest = (UpdateGroupMemberRequest) o;
    return Objects.equals(this.visibility, updateGroupMemberRequest.visibility) &&
        Objects.equals(this.isSubscribedToAnnouncements, updateGroupMemberRequest.isSubscribedToAnnouncements) &&
        Objects.equals(this.managerNotes, updateGroupMemberRequest.managerNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(visibility, isSubscribedToAnnouncements, managerNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateGroupMemberRequest {\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    isSubscribedToAnnouncements: ").append(toIndentedString(isSubscribedToAnnouncements)).append("\n");
    sb.append("    managerNotes: ").append(toIndentedString(managerNotes)).append("\n");
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
    openapiFields.add("visibility");
    openapiFields.add("isSubscribedToAnnouncements");
    openapiFields.add("managerNotes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdateGroupMemberRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UpdateGroupMemberRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateGroupMemberRequest is not found in the empty JSON string", UpdateGroupMemberRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdateGroupMemberRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateGroupMemberRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("managerNotes") != null && !jsonObj.get("managerNotes").isJsonNull()) && !jsonObj.get("managerNotes").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerNotes` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerNotes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateGroupMemberRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateGroupMemberRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateGroupMemberRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateGroupMemberRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateGroupMemberRequest>() {
           @Override
           public void write(JsonWriter out, UpdateGroupMemberRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateGroupMemberRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdateGroupMemberRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdateGroupMemberRequest
  * @throws IOException if the JSON string is invalid with respect to UpdateGroupMemberRequest
  */
  public static UpdateGroupMemberRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateGroupMemberRequest.class);
  }

 /**
  * Convert an instance of UpdateGroupMemberRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

