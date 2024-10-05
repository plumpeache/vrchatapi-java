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
import io.github.vrchatapi.model.LicenseAction;
import io.github.vrchatapi.model.LicenseType;
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
 * License
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class License {
  public static final String SERIALIZED_NAME_FOR_ID = "forId";
  @SerializedName(SERIALIZED_NAME_FOR_ID)
  private String forId;

  public static final String SERIALIZED_NAME_FOR_TYPE = "forType";
  @SerializedName(SERIALIZED_NAME_FOR_TYPE)
  private LicenseType forType = LicenseType.PERMISSION;

  public static final String SERIALIZED_NAME_FOR_NAME = "forName";
  @SerializedName(SERIALIZED_NAME_FOR_NAME)
  private String forName;

  public static final String SERIALIZED_NAME_FOR_ACTION = "forAction";
  @SerializedName(SERIALIZED_NAME_FOR_ACTION)
  private LicenseAction forAction = LicenseAction.HAVE;

  public License() {
  }

  public License forId(String forId) {
    
    this.forId = forId;
    return this;
  }

   /**
   * Either a AvatarID, LicenseGroupID, PermissionID or ProductID. This depends on the &#x60;forType&#x60; field.
   * @return forId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either a AvatarID, LicenseGroupID, PermissionID or ProductID. This depends on the `forType` field.")

  public String getForId() {
    return forId;
  }


  public void setForId(String forId) {
    this.forId = forId;
  }


  public License forType(LicenseType forType) {
    
    this.forType = forType;
    return this;
  }

   /**
   * Get forType
   * @return forType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LicenseType getForType() {
    return forType;
  }


  public void setForType(LicenseType forType) {
    this.forType = forType;
  }


  public License forName(String forName) {
    
    this.forName = forName;
    return this;
  }

   /**
   * Get forName
   * @return forName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getForName() {
    return forName;
  }


  public void setForName(String forName) {
    this.forName = forName;
  }


  public License forAction(LicenseAction forAction) {
    
    this.forAction = forAction;
    return this;
  }

   /**
   * Get forAction
   * @return forAction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LicenseAction getForAction() {
    return forAction;
  }


  public void setForAction(LicenseAction forAction) {
    this.forAction = forAction;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.forId, license.forId) &&
        Objects.equals(this.forType, license.forType) &&
        Objects.equals(this.forName, license.forName) &&
        Objects.equals(this.forAction, license.forAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forId, forType, forName, forAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    sb.append("    forId: ").append(toIndentedString(forId)).append("\n");
    sb.append("    forType: ").append(toIndentedString(forType)).append("\n");
    sb.append("    forName: ").append(toIndentedString(forName)).append("\n");
    sb.append("    forAction: ").append(toIndentedString(forAction)).append("\n");
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
    openapiFields.add("forId");
    openapiFields.add("forType");
    openapiFields.add("forName");
    openapiFields.add("forAction");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("forId");
    openapiRequiredFields.add("forType");
    openapiRequiredFields.add("forName");
    openapiRequiredFields.add("forAction");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to License
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!License.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in License is not found in the empty JSON string", License.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!License.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `License` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : License.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("forId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forId").toString()));
      }
      if (!jsonObj.get("forName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `forName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("forName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!License.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'License' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<License> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(License.class));

       return (TypeAdapter<T>) new TypeAdapter<License>() {
           @Override
           public void write(JsonWriter out, License value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public License read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of License given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of License
  * @throws IOException if the JSON string is invalid with respect to License
  */
  public static License fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, License.class);
  }

 /**
  * Convert an instance of License to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

