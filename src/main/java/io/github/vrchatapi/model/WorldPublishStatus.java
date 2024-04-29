/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.3
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
 * WorldPublishStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WorldPublishStatus {
  public static final String SERIALIZED_NAME_CAN_PUBILSH = "canPubilsh";
  @SerializedName(SERIALIZED_NAME_CAN_PUBILSH)
  private Boolean canPubilsh = true;

  public WorldPublishStatus() {
  }

  public WorldPublishStatus canPubilsh(Boolean canPubilsh) {
    
    this.canPubilsh = canPubilsh;
    return this;
  }

   /**
   * Get canPubilsh
   * @return canPubilsh
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanPubilsh() {
    return canPubilsh;
  }


  public void setCanPubilsh(Boolean canPubilsh) {
    this.canPubilsh = canPubilsh;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorldPublishStatus worldPublishStatus = (WorldPublishStatus) o;
    return Objects.equals(this.canPubilsh, worldPublishStatus.canPubilsh);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canPubilsh);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorldPublishStatus {\n");
    sb.append("    canPubilsh: ").append(toIndentedString(canPubilsh)).append("\n");
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
    openapiFields.add("canPubilsh");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("canPubilsh");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorldPublishStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorldPublishStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorldPublishStatus is not found in the empty JSON string", WorldPublishStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!WorldPublishStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `WorldPublishStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorldPublishStatus.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorldPublishStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorldPublishStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorldPublishStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorldPublishStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<WorldPublishStatus>() {
           @Override
           public void write(JsonWriter out, WorldPublishStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public WorldPublishStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of WorldPublishStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorldPublishStatus
  * @throws IOException if the JSON string is invalid with respect to WorldPublishStatus
  */
  public static WorldPublishStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorldPublishStatus.class);
  }

 /**
  * Convert an instance of WorldPublishStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

