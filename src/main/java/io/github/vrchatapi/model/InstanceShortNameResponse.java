/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.10.1
 * Contact: me@ariesclark.com
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
 * InstanceShortNameResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InstanceShortNameResponse {
  public static final String SERIALIZED_NAME_SECURE_NAME = "secureName";
  @SerializedName(SERIALIZED_NAME_SECURE_NAME)
  private String secureName;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public InstanceShortNameResponse() {
  }

  public InstanceShortNameResponse secureName(String secureName) {
    
    this.secureName = secureName;
    return this;
  }

   /**
   * Get secureName
   * @return secureName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7eavhhng", required = true, value = "")

  public String getSecureName() {
    return secureName;
  }


  public void setSecureName(String secureName) {
    this.secureName = secureName;
  }


  public InstanceShortNameResponse shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02u7yz8j", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstanceShortNameResponse instanceShortNameResponse = (InstanceShortNameResponse) o;
    return Objects.equals(this.secureName, instanceShortNameResponse.secureName) &&
        Objects.equals(this.shortName, instanceShortNameResponse.shortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secureName, shortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstanceShortNameResponse {\n");
    sb.append("    secureName: ").append(toIndentedString(secureName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
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
    openapiFields.add("secureName");
    openapiFields.add("shortName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("secureName");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InstanceShortNameResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!InstanceShortNameResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InstanceShortNameResponse is not found in the empty JSON string", InstanceShortNameResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InstanceShortNameResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InstanceShortNameResponse` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : InstanceShortNameResponse.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("secureName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secureName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secureName").toString()));
      }
      if ((jsonObj.get("shortName") != null && !jsonObj.get("shortName").isJsonNull()) && !jsonObj.get("shortName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InstanceShortNameResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InstanceShortNameResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InstanceShortNameResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InstanceShortNameResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<InstanceShortNameResponse>() {
           @Override
           public void write(JsonWriter out, InstanceShortNameResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InstanceShortNameResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InstanceShortNameResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InstanceShortNameResponse
  * @throws IOException if the JSON string is invalid with respect to InstanceShortNameResponse
  */
  public static InstanceShortNameResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InstanceShortNameResponse.class);
  }

 /**
  * Convert an instance of InstanceShortNameResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

