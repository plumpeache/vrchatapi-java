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
import io.github.vrchatapi.model.FavoriteType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
public class Favorite {
  public static final String SERIALIZED_NAME_FAVORITE_ID = "favoriteId";
  @SerializedName(SERIALIZED_NAME_FAVORITE_ID)
  private String favoriteId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FavoriteType type = FavoriteType.FRIEND;

  public Favorite() {
  }

  public Favorite favoriteId(String favoriteId) {
    
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * MUST be either AvatarID, UserID or WorldID.
   * @return favoriteId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "MUST be either AvatarID, UserID or WorldID.")

  public String getFavoriteId() {
    return favoriteId;
  }


  public void setFavoriteId(String favoriteId) {
    this.favoriteId = favoriteId;
  }


  public Favorite id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "fvrt_9568d189-8776-44a5-a8c8-defc981e44de", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Favorite tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Favorite addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Favorite type(FavoriteType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public FavoriteType getType() {
    return type;
  }


  public void setType(FavoriteType type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Favorite favorite = (Favorite) o;
    return Objects.equals(this.favoriteId, favorite.favoriteId) &&
        Objects.equals(this.id, favorite.id) &&
        Objects.equals(this.tags, favorite.tags) &&
        Objects.equals(this.type, favorite.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favoriteId, id, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Favorite {\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("favoriteId");
    openapiFields.add("id");
    openapiFields.add("tags");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("favoriteId");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("type");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Favorite
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Favorite.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Favorite is not found in the empty JSON string", Favorite.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Favorite.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Favorite` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Favorite.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("favoriteId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `favoriteId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("favoriteId").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Favorite.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Favorite' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Favorite> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Favorite.class));

       return (TypeAdapter<T>) new TypeAdapter<Favorite>() {
           @Override
           public void write(JsonWriter out, Favorite value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Favorite read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Favorite given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Favorite
  * @throws IOException if the JSON string is invalid with respect to Favorite
  */
  public static Favorite fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Favorite.class);
  }

 /**
  * Convert an instance of Favorite to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

