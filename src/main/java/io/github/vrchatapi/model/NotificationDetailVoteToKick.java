/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.6
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
 * NotificationDetailVoteToKick
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NotificationDetailVoteToKick {
  public static final String SERIALIZED_NAME_INITIATOR_USER_ID = "initiatorUserId";
  @SerializedName(SERIALIZED_NAME_INITIATOR_USER_ID)
  private String initiatorUserId;

  public static final String SERIALIZED_NAME_USER_TO_KICK_ID = "userToKickId";
  @SerializedName(SERIALIZED_NAME_USER_TO_KICK_ID)
  private String userToKickId;

  public NotificationDetailVoteToKick() {
  }

  public NotificationDetailVoteToKick initiatorUserId(String initiatorUserId) {
    
    this.initiatorUserId = initiatorUserId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return initiatorUserId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getInitiatorUserId() {
    return initiatorUserId;
  }


  public void setInitiatorUserId(String initiatorUserId) {
    this.initiatorUserId = initiatorUserId;
  }


  public NotificationDetailVoteToKick userToKickId(String userToKickId) {
    
    this.userToKickId = userToKickId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return userToKickId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getUserToKickId() {
    return userToKickId;
  }


  public void setUserToKickId(String userToKickId) {
    this.userToKickId = userToKickId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationDetailVoteToKick notificationDetailVoteToKick = (NotificationDetailVoteToKick) o;
    return Objects.equals(this.initiatorUserId, notificationDetailVoteToKick.initiatorUserId) &&
        Objects.equals(this.userToKickId, notificationDetailVoteToKick.userToKickId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(initiatorUserId, userToKickId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationDetailVoteToKick {\n");
    sb.append("    initiatorUserId: ").append(toIndentedString(initiatorUserId)).append("\n");
    sb.append("    userToKickId: ").append(toIndentedString(userToKickId)).append("\n");
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
    openapiFields.add("initiatorUserId");
    openapiFields.add("userToKickId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("initiatorUserId");
    openapiRequiredFields.add("userToKickId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationDetailVoteToKick
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationDetailVoteToKick.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationDetailVoteToKick is not found in the empty JSON string", NotificationDetailVoteToKick.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!NotificationDetailVoteToKick.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `NotificationDetailVoteToKick` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NotificationDetailVoteToKick.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("initiatorUserId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `initiatorUserId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("initiatorUserId").toString()));
      }
      if (!jsonObj.get("userToKickId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userToKickId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userToKickId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationDetailVoteToKick.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationDetailVoteToKick' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationDetailVoteToKick> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationDetailVoteToKick.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationDetailVoteToKick>() {
           @Override
           public void write(JsonWriter out, NotificationDetailVoteToKick value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationDetailVoteToKick read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationDetailVoteToKick given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationDetailVoteToKick
  * @throws IOException if the JSON string is invalid with respect to NotificationDetailVoteToKick
  */
  public static NotificationDetailVoteToKick fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationDetailVoteToKick.class);
  }

 /**
  * Convert an instance of NotificationDetailVoteToKick to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

