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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UnityPackage {
  public static final String SERIALIZED_NAME_ASSET_URL = "assetUrl";
  @SerializedName(SERIALIZED_NAME_ASSET_URL)
  private String assetUrl;

  public static final String SERIALIZED_NAME_ASSET_URL_OBJECT = "assetUrlObject";
  @SerializedName(SERIALIZED_NAME_ASSET_URL_OBJECT)
  private Object assetUrlObject;

  public static final String SERIALIZED_NAME_ASSET_VERSION = "assetVersion";
  @SerializedName(SERIALIZED_NAME_ASSET_VERSION)
  private Integer assetVersion;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_PLUGIN_URL = "pluginUrl";
  @SerializedName(SERIALIZED_NAME_PLUGIN_URL)
  private String pluginUrl;

  public static final String SERIALIZED_NAME_PLUGIN_URL_OBJECT = "pluginUrlObject";
  @SerializedName(SERIALIZED_NAME_PLUGIN_URL_OBJECT)
  private Object pluginUrlObject;

  public static final String SERIALIZED_NAME_UNITY_SORT_NUMBER = "unitySortNumber";
  @SerializedName(SERIALIZED_NAME_UNITY_SORT_NUMBER)
  private Long unitySortNumber;

  public static final String SERIALIZED_NAME_UNITY_VERSION = "unityVersion";
  @SerializedName(SERIALIZED_NAME_UNITY_VERSION)
  private String unityVersion = "5.3.4p1";

  public UnityPackage() {
  }

  public UnityPackage assetUrl(String assetUrl) {
    
    this.assetUrl = assetUrl;
    return this;
  }

   /**
   * Get assetUrl
   * @return assetUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAssetUrl() {
    return assetUrl;
  }


  public void setAssetUrl(String assetUrl) {
    this.assetUrl = assetUrl;
  }


  public UnityPackage assetUrlObject(Object assetUrlObject) {
    
    this.assetUrlObject = assetUrlObject;
    return this;
  }

   /**
   * Get assetUrlObject
   * @return assetUrlObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getAssetUrlObject() {
    return assetUrlObject;
  }


  public void setAssetUrlObject(Object assetUrlObject) {
    this.assetUrlObject = assetUrlObject;
  }


  public UnityPackage assetVersion(Integer assetVersion) {
    
    this.assetVersion = assetVersion;
    return this;
  }

   /**
   * Get assetVersion
   * minimum: 0
   * @return assetVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getAssetVersion() {
    return assetVersion;
  }


  public void setAssetVersion(Integer assetVersion) {
    this.assetVersion = assetVersion;
  }


  public UnityPackage createdAt(OffsetDateTime createdAt) {
    
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


  public UnityPackage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "unp_52b12c39-4163-457d-a4a9-630e7aff1bff", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public UnityPackage platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;.
   * @return platform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standalonewindows", required = true, value = "This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public UnityPackage pluginUrl(String pluginUrl) {
    
    this.pluginUrl = pluginUrl;
    return this;
  }

   /**
   * Get pluginUrl
   * @return pluginUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPluginUrl() {
    return pluginUrl;
  }


  public void setPluginUrl(String pluginUrl) {
    this.pluginUrl = pluginUrl;
  }


  public UnityPackage pluginUrlObject(Object pluginUrlObject) {
    
    this.pluginUrlObject = pluginUrlObject;
    return this;
  }

   /**
   * Get pluginUrlObject
   * @return pluginUrlObject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getPluginUrlObject() {
    return pluginUrlObject;
  }


  public void setPluginUrlObject(Object pluginUrlObject) {
    this.pluginUrlObject = pluginUrlObject;
  }


  public UnityPackage unitySortNumber(Long unitySortNumber) {
    
    this.unitySortNumber = unitySortNumber;
    return this;
  }

   /**
   * Get unitySortNumber
   * minimum: 0
   * @return unitySortNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getUnitySortNumber() {
    return unitySortNumber;
  }


  public void setUnitySortNumber(Long unitySortNumber) {
    this.unitySortNumber = unitySortNumber;
  }


  public UnityPackage unityVersion(String unityVersion) {
    
    this.unityVersion = unityVersion;
    return this;
  }

   /**
   * Get unityVersion
   * @return unityVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2018.4.12f1", required = true, value = "")

  public String getUnityVersion() {
    return unityVersion;
  }


  public void setUnityVersion(String unityVersion) {
    this.unityVersion = unityVersion;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnityPackage unityPackage = (UnityPackage) o;
    return Objects.equals(this.assetUrl, unityPackage.assetUrl) &&
        Objects.equals(this.assetUrlObject, unityPackage.assetUrlObject) &&
        Objects.equals(this.assetVersion, unityPackage.assetVersion) &&
        Objects.equals(this.createdAt, unityPackage.createdAt) &&
        Objects.equals(this.id, unityPackage.id) &&
        Objects.equals(this.platform, unityPackage.platform) &&
        Objects.equals(this.pluginUrl, unityPackage.pluginUrl) &&
        Objects.equals(this.pluginUrlObject, unityPackage.pluginUrlObject) &&
        Objects.equals(this.unitySortNumber, unityPackage.unitySortNumber) &&
        Objects.equals(this.unityVersion, unityPackage.unityVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetUrl, assetUrlObject, assetVersion, createdAt, id, platform, pluginUrl, pluginUrlObject, unitySortNumber, unityVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnityPackage {\n");
    sb.append("    assetUrl: ").append(toIndentedString(assetUrl)).append("\n");
    sb.append("    assetUrlObject: ").append(toIndentedString(assetUrlObject)).append("\n");
    sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pluginUrl: ").append(toIndentedString(pluginUrl)).append("\n");
    sb.append("    pluginUrlObject: ").append(toIndentedString(pluginUrlObject)).append("\n");
    sb.append("    unitySortNumber: ").append(toIndentedString(unitySortNumber)).append("\n");
    sb.append("    unityVersion: ").append(toIndentedString(unityVersion)).append("\n");
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
    openapiFields.add("assetUrl");
    openapiFields.add("assetUrlObject");
    openapiFields.add("assetVersion");
    openapiFields.add("created_at");
    openapiFields.add("id");
    openapiFields.add("platform");
    openapiFields.add("pluginUrl");
    openapiFields.add("pluginUrlObject");
    openapiFields.add("unitySortNumber");
    openapiFields.add("unityVersion");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("assetVersion");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("platform");
    openapiRequiredFields.add("unityVersion");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UnityPackage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UnityPackage.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UnityPackage is not found in the empty JSON string", UnityPackage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UnityPackage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UnityPackage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UnityPackage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("assetUrl") != null && !jsonObj.get("assetUrl").isJsonNull()) && !jsonObj.get("assetUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `assetUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("assetUrl").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("pluginUrl") != null && !jsonObj.get("pluginUrl").isJsonNull()) && !jsonObj.get("pluginUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pluginUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pluginUrl").toString()));
      }
      if (!jsonObj.get("unityVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unityVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unityVersion").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UnityPackage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UnityPackage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UnityPackage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UnityPackage.class));

       return (TypeAdapter<T>) new TypeAdapter<UnityPackage>() {
           @Override
           public void write(JsonWriter out, UnityPackage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UnityPackage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UnityPackage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UnityPackage
  * @throws IOException if the JSON string is invalid with respect to UnityPackage
  */
  public static UnityPackage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UnityPackage.class);
  }

 /**
  * Convert an instance of UnityPackage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

