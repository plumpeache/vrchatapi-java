/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.2
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
 * Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Response {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private Integer statusCode;

  public Response() {
  }

  public Response message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public Response statusCode(Integer statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * minimum: 100
   * @return statusCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.message, response.message) &&
        Objects.equals(this.statusCode, response.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
    openapiFields.add("message");
    openapiFields.add("status_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status_code");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Response is not found in the empty JSON string", Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Response.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Response.class));

       return (TypeAdapter<T>) new TypeAdapter<Response>() {
           @Override
           public void write(JsonWriter out, Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Response
  * @throws IOException if the JSON string is invalid with respect to Response
  */
  public static Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Response.class);
  }

 /**
  * Convert an instance of Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

