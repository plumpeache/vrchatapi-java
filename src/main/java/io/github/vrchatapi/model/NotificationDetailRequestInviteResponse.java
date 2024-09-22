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
 * NotificationDetailRequestInviteResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationDetailRequestInviteResponse {
  public static final String SERIALIZED_NAME_IN_RESPONSE_TO = "inResponseTo";
  @SerializedName(SERIALIZED_NAME_IN_RESPONSE_TO)
  private String inResponseTo;

  public static final String SERIALIZED_NAME_REQUEST_MESSAGE = "requestMessage";
  @SerializedName(SERIALIZED_NAME_REQUEST_MESSAGE)
  private String requestMessage;

  public NotificationDetailRequestInviteResponse() {
  }

  public NotificationDetailRequestInviteResponse inResponseTo(String inResponseTo) {
    
    this.inResponseTo = inResponseTo;
    return this;
  }

   /**
   * Get inResponseTo
   * @return inResponseTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "not_00000000-0000-0000-0000-000000000000", required = true, value = "")

  public String getInResponseTo() {
    return inResponseTo;
  }


  public void setInResponseTo(String inResponseTo) {
    this.inResponseTo = inResponseTo;
  }


  public NotificationDetailRequestInviteResponse requestMessage(String requestMessage) {
    
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
    NotificationDetailRequestInviteResponse notificationDetailRequestInviteResponse = (NotificationDetailRequestInviteResponse) o;
    return Objects.equals(this.inResponseTo, notificationDetailRequestInviteResponse.inResponseTo) &&
        Objects.equals(this.requestMessage, notificationDetailRequestInviteResponse.requestMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inResponseTo, requestMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDetailRequestInviteResponse {\n");
    sb.append("    inResponseTo: ").append(toIndentedString(inResponseTo)).append("\n");
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
    openapiFields.add("inResponseTo");
    openapiFields.add("requestMessage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("inResponseTo");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationDetailRequestInviteResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationDetailRequestInviteResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationDetailRequestInviteResponse is not found in the empty JSON string", NotificationDetailRequestInviteResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotificationDetailRequestInviteResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationDetailRequestInviteResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotificationDetailRequestInviteResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("inResponseTo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `inResponseTo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("inResponseTo").toString()));
      }
      if ((jsonObj.get("requestMessage") != null && !jsonObj.get("requestMessage").isJsonNull()) && !jsonObj.get("requestMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `requestMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("requestMessage").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationDetailRequestInviteResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationDetailRequestInviteResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationDetailRequestInviteResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationDetailRequestInviteResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationDetailRequestInviteResponse>() {
           @Override
           public void write(JsonWriter out, NotificationDetailRequestInviteResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationDetailRequestInviteResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationDetailRequestInviteResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationDetailRequestInviteResponse
  * @throws IOException if the JSON string is invalid with respect to NotificationDetailRequestInviteResponse
  */
  public static NotificationDetailRequestInviteResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationDetailRequestInviteResponse.class);
  }

 /**
  * Convert an instance of NotificationDetailRequestInviteResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

