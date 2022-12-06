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
import java.util.LinkedHashSet;
import java.util.Set;

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
public class FinishFileDataUploadRequest {
  public static final String SERIALIZED_NAME_ETAGS = "etags";
  @SerializedName(SERIALIZED_NAME_ETAGS)
  private Set<String> etags = null;

  public static final String SERIALIZED_NAME_NEXT_PART_NUMBER = "nextPartNumber";
  @SerializedName(SERIALIZED_NAME_NEXT_PART_NUMBER)
  private String nextPartNumber = "0";

  public static final String SERIALIZED_NAME_MAX_PARTS = "maxParts";
  @SerializedName(SERIALIZED_NAME_MAX_PARTS)
  private String maxParts = "0";

  public FinishFileDataUploadRequest() {
  }

  public FinishFileDataUploadRequest etags(Set<String> etags) {
    
    this.etags = etags;
    return this;
  }

  public FinishFileDataUploadRequest addEtagsItem(String etagsItem) {
    if (this.etags == null) {
      this.etags = new LinkedHashSet<>();
    }
    this.etags.add(etagsItem);
    return this;
  }

   /**
   * Array of ETags uploaded.
   * @return etags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of ETags uploaded.")

  public Set<String> getEtags() {
    return etags;
  }


  public void setEtags(Set<String> etags) {
    this.etags = etags;
  }


  public FinishFileDataUploadRequest nextPartNumber(String nextPartNumber) {
    
    this.nextPartNumber = nextPartNumber;
    return this;
  }

   /**
   * Always a zero in string form, despite how many parts uploaded.
   * @return nextPartNumber
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Always a zero in string form, despite how many parts uploaded.")

  public String getNextPartNumber() {
    return nextPartNumber;
  }


  public void setNextPartNumber(String nextPartNumber) {
    this.nextPartNumber = nextPartNumber;
  }


  public FinishFileDataUploadRequest maxParts(String maxParts) {
    
    this.maxParts = maxParts;
    return this;
  }

   /**
   * Always a zero in string form, despite how many parts uploaded.
   * @return maxParts
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Always a zero in string form, despite how many parts uploaded.")

  public String getMaxParts() {
    return maxParts;
  }


  public void setMaxParts(String maxParts) {
    this.maxParts = maxParts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishFileDataUploadRequest finishFileDataUploadRequest = (FinishFileDataUploadRequest) o;
    return Objects.equals(this.etags, finishFileDataUploadRequest.etags) &&
        Objects.equals(this.nextPartNumber, finishFileDataUploadRequest.nextPartNumber) &&
        Objects.equals(this.maxParts, finishFileDataUploadRequest.maxParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etags, nextPartNumber, maxParts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishFileDataUploadRequest {\n");
    sb.append("    etags: ").append(toIndentedString(etags)).append("\n");
    sb.append("    nextPartNumber: ").append(toIndentedString(nextPartNumber)).append("\n");
    sb.append("    maxParts: ").append(toIndentedString(maxParts)).append("\n");
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
    openapiFields.add("etags");
    openapiFields.add("nextPartNumber");
    openapiFields.add("maxParts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("nextPartNumber");
    openapiRequiredFields.add("maxParts");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FinishFileDataUploadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FinishFileDataUploadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FinishFileDataUploadRequest is not found in the empty JSON string", FinishFileDataUploadRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!FinishFileDataUploadRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `FinishFileDataUploadRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : FinishFileDataUploadRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("etags") != null && !jsonObj.get("etags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `etags` to be an array in the JSON string but got `%s`", jsonObj.get("etags").toString()));
      }
      if (!jsonObj.get("nextPartNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nextPartNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nextPartNumber").toString()));
      }
      if (!jsonObj.get("maxParts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `maxParts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("maxParts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FinishFileDataUploadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FinishFileDataUploadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FinishFileDataUploadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FinishFileDataUploadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<FinishFileDataUploadRequest>() {
           @Override
           public void write(JsonWriter out, FinishFileDataUploadRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FinishFileDataUploadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FinishFileDataUploadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FinishFileDataUploadRequest
  * @throws IOException if the JSON string is invalid with respect to FinishFileDataUploadRequest
  */
  public static FinishFileDataUploadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FinishFileDataUploadRequest.class);
  }

 /**
  * Convert an instance of FinishFileDataUploadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

