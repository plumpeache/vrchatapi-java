/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.4.1
 * Contact: me@ruby.js.org
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

/**
 * InlineObject8
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject8 {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FavoriteType type;

  public static final String SERIALIZED_NAME_FAVORITE_ID = "favoriteId";
  @SerializedName(SERIALIZED_NAME_FAVORITE_ID)
  private String favoriteId;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();


  public InlineObject8 type(FavoriteType type) {
    
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


  public InlineObject8 favoriteId(String favoriteId) {
    
    this.favoriteId = favoriteId;
    return this;
  }

   /**
   * Must be either AvatarID, WorldID or UserID.
   * @return favoriteId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Must be either AvatarID, WorldID or UserID.")

  public String getFavoriteId() {
    return favoriteId;
  }


  public void setFavoriteId(String favoriteId) {
    this.favoriteId = favoriteId;
  }


  public InlineObject8 tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public InlineObject8 addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Tags indicate which group this favorite belongs to. Adding multiple groups makes it show up in all. Removing it from one in that case removes it from all.
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Tags indicate which group this favorite belongs to. Adding multiple groups makes it show up in all. Removing it from one in that case removes it from all.")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject8 inlineObject8 = (InlineObject8) o;
    return Objects.equals(this.type, inlineObject8.type) &&
        Objects.equals(this.favoriteId, inlineObject8.favoriteId) &&
        Objects.equals(this.tags, inlineObject8.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, favoriteId, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject8 {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    favoriteId: ").append(toIndentedString(favoriteId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

}

