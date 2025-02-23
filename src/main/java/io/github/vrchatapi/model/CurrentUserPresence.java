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
 * CurrentUserPresence
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CurrentUserPresence {
  public static final String SERIALIZED_NAME_AVATAR_THUMBNAIL = "avatarThumbnail";
  @SerializedName(SERIALIZED_NAME_AVATAR_THUMBNAIL)
  private String avatarThumbnail;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_TAGS = "currentAvatarTags";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_TAGS)
  private String currentAvatarTags;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTANCE = "instance";
  @SerializedName(SERIALIZED_NAME_INSTANCE)
  private String instance;

  public static final String SERIALIZED_NAME_INSTANCE_TYPE = "instanceType";
  @SerializedName(SERIALIZED_NAME_INSTANCE_TYPE)
  private String instanceType;

  public static final String SERIALIZED_NAME_IS_REJOINING = "isRejoining";
  @SerializedName(SERIALIZED_NAME_IS_REJOINING)
  private String isRejoining;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_PROFILE_PIC_OVERRIDE = "profilePicOverride";
  @SerializedName(SERIALIZED_NAME_PROFILE_PIC_OVERRIDE)
  private String profilePicOverride;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TRAVELING_TO_INSTANCE = "travelingToInstance";
  @SerializedName(SERIALIZED_NAME_TRAVELING_TO_INSTANCE)
  private String travelingToInstance;

  public static final String SERIALIZED_NAME_TRAVELING_TO_WORLD = "travelingToWorld";
  @SerializedName(SERIALIZED_NAME_TRAVELING_TO_WORLD)
  private String travelingToWorld;

  public static final String SERIALIZED_NAME_USER_ICON = "userIcon";
  @SerializedName(SERIALIZED_NAME_USER_ICON)
  private String userIcon;

  public static final String SERIALIZED_NAME_WORLD = "world";
  @SerializedName(SERIALIZED_NAME_WORLD)
  private String world;

  public CurrentUserPresence() {
  }

  public CurrentUserPresence avatarThumbnail(String avatarThumbnail) {
    
    this.avatarThumbnail = avatarThumbnail;
    return this;
  }

   /**
   * Get avatarThumbnail
   * @return avatarThumbnail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAvatarThumbnail() {
    return avatarThumbnail;
  }


  public void setAvatarThumbnail(String avatarThumbnail) {
    this.avatarThumbnail = avatarThumbnail;
  }


  public CurrentUserPresence currentAvatarTags(String currentAvatarTags) {
    
    this.currentAvatarTags = currentAvatarTags;
    return this;
  }

   /**
   * Get currentAvatarTags
   * @return currentAvatarTags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCurrentAvatarTags() {
    return currentAvatarTags;
  }


  public void setCurrentAvatarTags(String currentAvatarTags) {
    this.currentAvatarTags = currentAvatarTags;
  }


  public CurrentUserPresence displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public CurrentUserPresence groups(List<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public CurrentUserPresence addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public CurrentUserPresence id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public CurrentUserPresence instance(String instance) {
    
    this.instance = instance;
    return this;
  }

   /**
   * Get instance
   * @return instance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInstance() {
    return instance;
  }


  public void setInstance(String instance) {
    this.instance = instance;
  }


  public CurrentUserPresence instanceType(String instanceType) {
    
    this.instanceType = instanceType;
    return this;
  }

   /**
   * either an InstanceType or an empty string
   * @return instanceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "either an InstanceType or an empty string")

  public String getInstanceType() {
    return instanceType;
  }


  public void setInstanceType(String instanceType) {
    this.instanceType = instanceType;
  }


  public CurrentUserPresence isRejoining(String isRejoining) {
    
    this.isRejoining = isRejoining;
    return this;
  }

   /**
   * Get isRejoining
   * @return isRejoining
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIsRejoining() {
    return isRejoining;
  }


  public void setIsRejoining(String isRejoining) {
    this.isRejoining = isRejoining;
  }


  public CurrentUserPresence platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * either a Platform or an empty string
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "either a Platform or an empty string")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public CurrentUserPresence profilePicOverride(String profilePicOverride) {
    
    this.profilePicOverride = profilePicOverride;
    return this;
  }

   /**
   * Get profilePicOverride
   * @return profilePicOverride
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProfilePicOverride() {
    return profilePicOverride;
  }


  public void setProfilePicOverride(String profilePicOverride) {
    this.profilePicOverride = profilePicOverride;
  }


  public CurrentUserPresence status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * either a UserStatus or empty string
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "either a UserStatus or empty string")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CurrentUserPresence travelingToInstance(String travelingToInstance) {
    
    this.travelingToInstance = travelingToInstance;
    return this;
  }

   /**
   * Get travelingToInstance
   * @return travelingToInstance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTravelingToInstance() {
    return travelingToInstance;
  }


  public void setTravelingToInstance(String travelingToInstance) {
    this.travelingToInstance = travelingToInstance;
  }


  public CurrentUserPresence travelingToWorld(String travelingToWorld) {
    
    this.travelingToWorld = travelingToWorld;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return travelingToWorld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getTravelingToWorld() {
    return travelingToWorld;
  }


  public void setTravelingToWorld(String travelingToWorld) {
    this.travelingToWorld = travelingToWorld;
  }


  public CurrentUserPresence userIcon(String userIcon) {
    
    this.userIcon = userIcon;
    return this;
  }

   /**
   * Get userIcon
   * @return userIcon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserIcon() {
    return userIcon;
  }


  public void setUserIcon(String userIcon) {
    this.userIcon = userIcon;
  }


  public CurrentUserPresence world(String world) {
    
    this.world = world;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return world
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getWorld() {
    return world;
  }


  public void setWorld(String world) {
    this.world = world;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CurrentUserPresence currentUserPresence = (CurrentUserPresence) o;
    return Objects.equals(this.avatarThumbnail, currentUserPresence.avatarThumbnail) &&
        Objects.equals(this.currentAvatarTags, currentUserPresence.currentAvatarTags) &&
        Objects.equals(this.displayName, currentUserPresence.displayName) &&
        Objects.equals(this.groups, currentUserPresence.groups) &&
        Objects.equals(this.id, currentUserPresence.id) &&
        Objects.equals(this.instance, currentUserPresence.instance) &&
        Objects.equals(this.instanceType, currentUserPresence.instanceType) &&
        Objects.equals(this.isRejoining, currentUserPresence.isRejoining) &&
        Objects.equals(this.platform, currentUserPresence.platform) &&
        Objects.equals(this.profilePicOverride, currentUserPresence.profilePicOverride) &&
        Objects.equals(this.status, currentUserPresence.status) &&
        Objects.equals(this.travelingToInstance, currentUserPresence.travelingToInstance) &&
        Objects.equals(this.travelingToWorld, currentUserPresence.travelingToWorld) &&
        Objects.equals(this.userIcon, currentUserPresence.userIcon) &&
        Objects.equals(this.world, currentUserPresence.world);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarThumbnail, currentAvatarTags, displayName, groups, id, instance, instanceType, isRejoining, platform, profilePicOverride, status, travelingToInstance, travelingToWorld, userIcon, world);
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
    sb.append("class CurrentUserPresence {\n");
    sb.append("    avatarThumbnail: ").append(toIndentedString(avatarThumbnail)).append("\n");
    sb.append("    currentAvatarTags: ").append(toIndentedString(currentAvatarTags)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
    sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
    sb.append("    isRejoining: ").append(toIndentedString(isRejoining)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    profilePicOverride: ").append(toIndentedString(profilePicOverride)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    travelingToInstance: ").append(toIndentedString(travelingToInstance)).append("\n");
    sb.append("    travelingToWorld: ").append(toIndentedString(travelingToWorld)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
    sb.append("    world: ").append(toIndentedString(world)).append("\n");
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
    openapiFields.add("avatarThumbnail");
    openapiFields.add("currentAvatarTags");
    openapiFields.add("displayName");
    openapiFields.add("groups");
    openapiFields.add("id");
    openapiFields.add("instance");
    openapiFields.add("instanceType");
    openapiFields.add("isRejoining");
    openapiFields.add("platform");
    openapiFields.add("profilePicOverride");
    openapiFields.add("status");
    openapiFields.add("travelingToInstance");
    openapiFields.add("travelingToWorld");
    openapiFields.add("userIcon");
    openapiFields.add("world");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CurrentUserPresence
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CurrentUserPresence.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CurrentUserPresence is not found in the empty JSON string", CurrentUserPresence.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CurrentUserPresence.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CurrentUserPresence` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("avatarThumbnail") != null && !jsonObj.get("avatarThumbnail").isJsonNull()) && !jsonObj.get("avatarThumbnail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarThumbnail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarThumbnail").toString()));
      }
      if ((jsonObj.get("currentAvatarTags") != null && !jsonObj.get("currentAvatarTags").isJsonNull()) && !jsonObj.get("currentAvatarTags").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currentAvatarTags` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currentAvatarTags").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("instance") != null && !jsonObj.get("instance").isJsonNull()) && !jsonObj.get("instance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instance").toString()));
      }
      if ((jsonObj.get("instanceType") != null && !jsonObj.get("instanceType").isJsonNull()) && !jsonObj.get("instanceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceType").toString()));
      }
      if ((jsonObj.get("isRejoining") != null && !jsonObj.get("isRejoining").isJsonNull()) && !jsonObj.get("isRejoining").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `isRejoining` to be a primitive type in the JSON string but got `%s`", jsonObj.get("isRejoining").toString()));
      }
      if ((jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonNull()) && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if ((jsonObj.get("profilePicOverride") != null && !jsonObj.get("profilePicOverride").isJsonNull()) && !jsonObj.get("profilePicOverride").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `profilePicOverride` to be a primitive type in the JSON string but got `%s`", jsonObj.get("profilePicOverride").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("travelingToInstance") != null && !jsonObj.get("travelingToInstance").isJsonNull()) && !jsonObj.get("travelingToInstance").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelingToInstance` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelingToInstance").toString()));
      }
      if ((jsonObj.get("travelingToWorld") != null && !jsonObj.get("travelingToWorld").isJsonNull()) && !jsonObj.get("travelingToWorld").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travelingToWorld` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travelingToWorld").toString()));
      }
      if ((jsonObj.get("userIcon") != null && !jsonObj.get("userIcon").isJsonNull()) && !jsonObj.get("userIcon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `userIcon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("userIcon").toString()));
      }
      if ((jsonObj.get("world") != null && !jsonObj.get("world").isJsonNull()) && !jsonObj.get("world").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `world` to be a primitive type in the JSON string but got `%s`", jsonObj.get("world").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CurrentUserPresence.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CurrentUserPresence' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CurrentUserPresence> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CurrentUserPresence.class));

       return (TypeAdapter<T>) new TypeAdapter<CurrentUserPresence>() {
           @Override
           public void write(JsonWriter out, CurrentUserPresence value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CurrentUserPresence read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CurrentUserPresence given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CurrentUserPresence
  * @throws IOException if the JSON string is invalid with respect to CurrentUserPresence
  */
  public static CurrentUserPresence fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CurrentUserPresence.class);
  }

 /**
  * Convert an instance of CurrentUserPresence to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

