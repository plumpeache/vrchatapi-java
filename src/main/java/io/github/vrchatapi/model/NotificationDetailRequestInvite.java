/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.4
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
 * NotificationDetailRequestInvite
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationDetailRequestInvite {
  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_REQUEST_MESSAGE = "requestMessage";
  @SerializedName(SERIALIZED_NAME_REQUEST_MESSAGE)
  private String requestMessage;

  public NotificationDetailRequestInvite() {
  }

  public NotificationDetailRequestInvite platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * TODO: Does this still exist?
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TODO: Does this still exist?")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public NotificationDetailRequestInvite requestMessage(String requestMessage) {
    
    this.requestMessage = requestMessage;
    return this;
  }

   /**
   * Used when using InviteMessage Slot.
   * @return requestMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Used when using InviteMessage Slot.")

  public String getRequestMessage() {
    return requestMessage;
  }


  public void setRequestMessage(String requestMessage) {
    this.requestMessage = requestMessage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDetailRequestInvite notificationDetailRequestInvite = (NotificationDetailRequestInvite) o;
    return Objects.equals(this.platform, notificationDetailRequestInvite.platform) &&
        Objects.equals(this.requestMessage, notificationDetailRequestInvite.requestMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, requestMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDetailRequestInvite {\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    requestMessage: ").append(toIndentedString(requestMessage)).append("\n");
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
    openapiFields.add("platform");
    openapiFields.add("requestMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationDetailRequestInvite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationDetailRequestInvite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationDetailRequestInvite is not found in the empty JSON string", NotificationDetailRequestInvite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotificationDetailRequestInvite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationDetailRequestInvite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("requestMessage") != null && !jsonObj.get("requestMessage").isJsonNull()) && !jsonObj.get("requestMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationDetailRequestInvite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationDetailRequestInvite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationDetailRequestInvite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationDetailRequestInvite.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationDetailRequestInvite>() {
           @Override
           public void write(JsonWriter out, NotificationDetailRequestInvite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationDetailRequestInvite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationDetailRequestInvite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationDetailRequestInvite
  * @throws IOException if the JSON string is invalid with respect to NotificationDetailRequestInvite
  */
  public static NotificationDetailRequestInvite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationDetailRequestInvite.class);
  }

 /**
  * Convert an instance of NotificationDetailRequestInvite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

