/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.19.1
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
 * Whether to allow offline analysis
 */
@ApiModel(description = "Whether to allow offline analysis")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIConfigOfflineAnalysis {
  public static final String SERIALIZED_NAME_ANDROID = "android";
  @SerializedName(SERIALIZED_NAME_ANDROID)
  private Boolean android = true;

  public static final String SERIALIZED_NAME_STANDALONEWINDOWS = "standalonewindows";
  @SerializedName(SERIALIZED_NAME_STANDALONEWINDOWS)
  private Boolean standalonewindows = true;

  public APIConfigOfflineAnalysis() {
  }

  public APIConfigOfflineAnalysis android(Boolean android) {
    
    this.android = android;
    return this;
  }

   /**
   * Whether to allow offline analysis
   * @return android
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to allow offline analysis")

  public Boolean getAndroid() {
    return android;
  }


  public void setAndroid(Boolean android) {
    this.android = android;
  }


  public APIConfigOfflineAnalysis standalonewindows(Boolean standalonewindows) {
    
    this.standalonewindows = standalonewindows;
    return this;
  }

   /**
   * Whether to allow offline analysis
   * @return standalonewindows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether to allow offline analysis")

  public Boolean getStandalonewindows() {
    return standalonewindows;
  }


  public void setStandalonewindows(Boolean standalonewindows) {
    this.standalonewindows = standalonewindows;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIConfigOfflineAnalysis apIConfigOfflineAnalysis = (APIConfigOfflineAnalysis) o;
    return Objects.equals(this.android, apIConfigOfflineAnalysis.android) &&
        Objects.equals(this.standalonewindows, apIConfigOfflineAnalysis.standalonewindows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(android, standalonewindows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIConfigOfflineAnalysis {\n");
    sb.append("    android: ").append(toIndentedString(android)).append("\n");
    sb.append("    standalonewindows: ").append(toIndentedString(standalonewindows)).append("\n");
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
    openapiFields.add("android");
    openapiFields.add("standalonewindows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to APIConfigOfflineAnalysis
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!APIConfigOfflineAnalysis.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in APIConfigOfflineAnalysis is not found in the empty JSON string", APIConfigOfflineAnalysis.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!APIConfigOfflineAnalysis.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `APIConfigOfflineAnalysis` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!APIConfigOfflineAnalysis.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'APIConfigOfflineAnalysis' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<APIConfigOfflineAnalysis> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(APIConfigOfflineAnalysis.class));

       return (TypeAdapter<T>) new TypeAdapter<APIConfigOfflineAnalysis>() {
           @Override
           public void write(JsonWriter out, APIConfigOfflineAnalysis value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public APIConfigOfflineAnalysis read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of APIConfigOfflineAnalysis given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of APIConfigOfflineAnalysis
  * @throws IOException if the JSON string is invalid with respect to APIConfigOfflineAnalysis
  */
  public static APIConfigOfflineAnalysis fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, APIConfigOfflineAnalysis.class);
  }

 /**
  * Convert an instance of APIConfigOfflineAnalysis to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

