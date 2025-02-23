/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.9
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
 * Favorite
 */
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
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FavoriteType type = FavoriteType.FRIEND;


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
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

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

}

