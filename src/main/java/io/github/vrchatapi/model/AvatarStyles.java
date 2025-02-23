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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * AvatarStyles
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AvatarStyles {
  public static final String SERIALIZED_NAME_PRIMARY = "primary";
  @SerializedName(SERIALIZED_NAME_PRIMARY)
  private String primary;

  public static final String SERIALIZED_NAME_SECONDARY = "secondary";
  @SerializedName(SERIALIZED_NAME_SECONDARY)
  private String secondary;

  public static final String SERIALIZED_NAME_SUPPLEMENTARY = "supplementary";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTARY)
  private List<String> supplementary = null;

  public AvatarStyles() {
  }

  public AvatarStyles primary(String primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Get primary
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrimary() {
    return primary;
  }


  public void setPrimary(String primary) {
    this.primary = primary;
  }


  public AvatarStyles secondary(String secondary) {
    
    this.secondary = secondary;
    return this;
  }

   /**
   * Get secondary
   * @return secondary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSecondary() {
    return secondary;
  }


  public void setSecondary(String secondary) {
    this.secondary = secondary;
  }


  public AvatarStyles supplementary(List<String> supplementary) {
    
    this.supplementary = supplementary;
    return this;
  }

  public AvatarStyles addSupplementaryItem(String supplementaryItem) {
    if (this.supplementary == null) {
      this.supplementary = new ArrayList<>();
    }
    this.supplementary.add(supplementaryItem);
    return this;
  }

   /**
   * Get supplementary
   * @return supplementary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getSupplementary() {
    return supplementary;
  }


  public void setSupplementary(List<String> supplementary) {
    this.supplementary = supplementary;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvatarStyles avatarStyles = (AvatarStyles) o;
    return Objects.equals(this.primary, avatarStyles.primary) &&
        Objects.equals(this.secondary, avatarStyles.secondary) &&
        Objects.equals(this.supplementary, avatarStyles.supplementary);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, secondary, supplementary);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvatarStyles {\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    secondary: ").append(toIndentedString(secondary)).append("\n");
    sb.append("    supplementary: ").append(toIndentedString(supplementary)).append("\n");
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
    openapiFields.add("primary");
    openapiFields.add("secondary");
    openapiFields.add("supplementary");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvatarStyles
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvatarStyles.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvatarStyles is not found in the empty JSON string", AvatarStyles.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AvatarStyles.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AvatarStyles` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("primary") != null && !jsonObj.get("primary").isJsonNull()) && !jsonObj.get("primary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `primary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("primary").toString()));
      }
      if ((jsonObj.get("secondary") != null && !jsonObj.get("secondary").isJsonNull()) && !jsonObj.get("secondary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secondary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secondary").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("supplementary") != null && !jsonObj.get("supplementary").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `supplementary` to be an array in the JSON string but got `%s`", jsonObj.get("supplementary").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvatarStyles.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvatarStyles' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvatarStyles> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvatarStyles.class));

       return (TypeAdapter<T>) new TypeAdapter<AvatarStyles>() {
           @Override
           public void write(JsonWriter out, AvatarStyles value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AvatarStyles read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AvatarStyles given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvatarStyles
  * @throws IOException if the JSON string is invalid with respect to AvatarStyles
  */
  public static AvatarStyles fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvatarStyles.class);
  }

 /**
  * Convert an instance of AvatarStyles to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

