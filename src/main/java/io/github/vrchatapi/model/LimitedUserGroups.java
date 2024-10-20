/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.6
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
import java.time.OffsetDateTime;
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
 * LimitedUserGroups
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LimitedUserGroups {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_CODE = "shortCode";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE)
  private String shortCode;

  public static final String SERIALIZED_NAME_DISCRIMINATOR = "discriminator";
  @SerializedName(SERIALIZED_NAME_DISCRIMINATOR)
  private String discriminator;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ICON_ID = "iconId";
  @SerializedName(SERIALIZED_NAME_ICON_ID)
  private String iconId;

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_BANNER_ID = "bannerId";
  @SerializedName(SERIALIZED_NAME_BANNER_ID)
  private String bannerId;

  public static final String SERIALIZED_NAME_BANNER_URL = "bannerUrl";
  @SerializedName(SERIALIZED_NAME_BANNER_URL)
  private String bannerUrl;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private String privacy;

  public static final String SERIALIZED_NAME_LAST_POST_CREATED_AT = "lastPostCreatedAt";
  @SerializedName(SERIALIZED_NAME_LAST_POST_CREATED_AT)
  private OffsetDateTime lastPostCreatedAt;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_MEMBER_COUNT = "memberCount";
  @SerializedName(SERIALIZED_NAME_MEMBER_COUNT)
  private Integer memberCount;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_MEMBER_VISIBILITY = "memberVisibility";
  @SerializedName(SERIALIZED_NAME_MEMBER_VISIBILITY)
  private String memberVisibility;

  public static final String SERIALIZED_NAME_IS_REPRESENTING = "isRepresenting";
  @SerializedName(SERIALIZED_NAME_IS_REPRESENTING)
  private Boolean isRepresenting;

  public static final String SERIALIZED_NAME_MUTUAL_GROUP = "mutualGroup";
  @SerializedName(SERIALIZED_NAME_MUTUAL_GROUP)
  private Boolean mutualGroup;

  public static final String SERIALIZED_NAME_LAST_POST_READ_AT = "lastPostReadAt";
  @SerializedName(SERIALIZED_NAME_LAST_POST_READ_AT)
  private OffsetDateTime lastPostReadAt;

  public LimitedUserGroups() {
  }

  public LimitedUserGroups id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gmem_95cdb3b4-4643-4eb6-bdab-46a4e1e5ce37", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public LimitedUserGroups name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LimitedUserGroups shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * Get shortCode
   * @return shortCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC123", value = "")

  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }


  public LimitedUserGroups discriminator(String discriminator) {
    
    this.discriminator = discriminator;
    return this;
  }

   /**
   * Get discriminator
   * @return discriminator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "")

  public String getDiscriminator() {
    return discriminator;
  }


  public void setDiscriminator(String discriminator) {
    this.discriminator = discriminator;
  }


  public LimitedUserGroups description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public LimitedUserGroups iconId(String iconId) {
    
    this.iconId = iconId;
    return this;
  }

   /**
   * Get iconId
   * @return iconId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconId() {
    return iconId;
  }


  public void setIconId(String iconId) {
    this.iconId = iconId;
  }


  public LimitedUserGroups iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public LimitedUserGroups bannerId(String bannerId) {
    
    this.bannerId = bannerId;
    return this;
  }

   /**
   * Get bannerId
   * @return bannerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBannerId() {
    return bannerId;
  }


  public void setBannerId(String bannerId) {
    this.bannerId = bannerId;
  }


  public LimitedUserGroups bannerUrl(String bannerUrl) {
    
    this.bannerUrl = bannerUrl;
    return this;
  }

   /**
   * Get bannerUrl
   * @return bannerUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBannerUrl() {
    return bannerUrl;
  }


  public void setBannerUrl(String bannerUrl) {
    this.bannerUrl = bannerUrl;
  }


  public LimitedUserGroups privacy(String privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPrivacy() {
    return privacy;
  }


  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }


  public LimitedUserGroups lastPostCreatedAt(OffsetDateTime lastPostCreatedAt) {
    
    this.lastPostCreatedAt = lastPostCreatedAt;
    return this;
  }

   /**
   * Get lastPostCreatedAt
   * @return lastPostCreatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPostCreatedAt() {
    return lastPostCreatedAt;
  }


  public void setLastPostCreatedAt(OffsetDateTime lastPostCreatedAt) {
    this.lastPostCreatedAt = lastPostCreatedAt;
  }


  public LimitedUserGroups ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public LimitedUserGroups memberCount(Integer memberCount) {
    
    this.memberCount = memberCount;
    return this;
  }

   /**
   * Get memberCount
   * @return memberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMemberCount() {
    return memberCount;
  }


  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }


  public LimitedUserGroups groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public LimitedUserGroups memberVisibility(String memberVisibility) {
    
    this.memberVisibility = memberVisibility;
    return this;
  }

   /**
   * Get memberVisibility
   * @return memberVisibility
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMemberVisibility() {
    return memberVisibility;
  }


  public void setMemberVisibility(String memberVisibility) {
    this.memberVisibility = memberVisibility;
  }


  public LimitedUserGroups isRepresenting(Boolean isRepresenting) {
    
    this.isRepresenting = isRepresenting;
    return this;
  }

   /**
   * Get isRepresenting
   * @return isRepresenting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRepresenting() {
    return isRepresenting;
  }


  public void setIsRepresenting(Boolean isRepresenting) {
    this.isRepresenting = isRepresenting;
  }


  public LimitedUserGroups mutualGroup(Boolean mutualGroup) {
    
    this.mutualGroup = mutualGroup;
    return this;
  }

   /**
   * Get mutualGroup
   * @return mutualGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getMutualGroup() {
    return mutualGroup;
  }


  public void setMutualGroup(Boolean mutualGroup) {
    this.mutualGroup = mutualGroup;
  }


  public LimitedUserGroups lastPostReadAt(OffsetDateTime lastPostReadAt) {
    
    this.lastPostReadAt = lastPostReadAt;
    return this;
  }

   /**
   * Get lastPostReadAt
   * @return lastPostReadAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getLastPostReadAt() {
    return lastPostReadAt;
  }


  public void setLastPostReadAt(OffsetDateTime lastPostReadAt) {
    this.lastPostReadAt = lastPostReadAt;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitedUserGroups limitedUserGroups = (LimitedUserGroups) o;
    return Objects.equals(this.id, limitedUserGroups.id) &&
        Objects.equals(this.name, limitedUserGroups.name) &&
        Objects.equals(this.shortCode, limitedUserGroups.shortCode) &&
        Objects.equals(this.discriminator, limitedUserGroups.discriminator) &&
        Objects.equals(this.description, limitedUserGroups.description) &&
        Objects.equals(this.iconId, limitedUserGroups.iconId) &&
        Objects.equals(this.iconUrl, limitedUserGroups.iconUrl) &&
        Objects.equals(this.bannerId, limitedUserGroups.bannerId) &&
        Objects.equals(this.bannerUrl, limitedUserGroups.bannerUrl) &&
        Objects.equals(this.privacy, limitedUserGroups.privacy) &&
        Objects.equals(this.lastPostCreatedAt, limitedUserGroups.lastPostCreatedAt) &&
        Objects.equals(this.ownerId, limitedUserGroups.ownerId) &&
        Objects.equals(this.memberCount, limitedUserGroups.memberCount) &&
        Objects.equals(this.groupId, limitedUserGroups.groupId) &&
        Objects.equals(this.memberVisibility, limitedUserGroups.memberVisibility) &&
        Objects.equals(this.isRepresenting, limitedUserGroups.isRepresenting) &&
        Objects.equals(this.mutualGroup, limitedUserGroups.mutualGroup) &&
        Objects.equals(this.lastPostReadAt, limitedUserGroups.lastPostReadAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortCode, discriminator, description, iconId, iconUrl, bannerId, bannerUrl, privacy, lastPostCreatedAt, ownerId, memberCount, groupId, memberVisibility, isRepresenting, mutualGroup, lastPostReadAt);
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
    sb.append("class LimitedUserGroups {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(discriminator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    bannerUrl: ").append(toIndentedString(bannerUrl)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    lastPostCreatedAt: ").append(toIndentedString(lastPostCreatedAt)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    memberVisibility: ").append(toIndentedString(memberVisibility)).append("\n");
    sb.append("    isRepresenting: ").append(toIndentedString(isRepresenting)).append("\n");
    sb.append("    mutualGroup: ").append(toIndentedString(mutualGroup)).append("\n");
    sb.append("    lastPostReadAt: ").append(toIndentedString(lastPostReadAt)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("shortCode");
    openapiFields.add("discriminator");
    openapiFields.add("description");
    openapiFields.add("iconId");
    openapiFields.add("iconUrl");
    openapiFields.add("bannerId");
    openapiFields.add("bannerUrl");
    openapiFields.add("privacy");
    openapiFields.add("lastPostCreatedAt");
    openapiFields.add("ownerId");
    openapiFields.add("memberCount");
    openapiFields.add("groupId");
    openapiFields.add("memberVisibility");
    openapiFields.add("isRepresenting");
    openapiFields.add("mutualGroup");
    openapiFields.add("lastPostReadAt");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LimitedUserGroups
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LimitedUserGroups.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LimitedUserGroups is not found in the empty JSON string", LimitedUserGroups.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!LimitedUserGroups.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `LimitedUserGroups` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("shortCode") != null && !jsonObj.get("shortCode").isJsonNull()) && !jsonObj.get("shortCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortCode").toString()));
      }
      if ((jsonObj.get("discriminator") != null && !jsonObj.get("discriminator").isJsonNull()) && !jsonObj.get("discriminator").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discriminator` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discriminator").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("iconId") != null && !jsonObj.get("iconId").isJsonNull()) && !jsonObj.get("iconId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconId").toString()));
      }
      if ((jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
      if ((jsonObj.get("bannerId") != null && !jsonObj.get("bannerId").isJsonNull()) && !jsonObj.get("bannerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerId").toString()));
      }
      if ((jsonObj.get("bannerUrl") != null && !jsonObj.get("bannerUrl").isJsonNull()) && !jsonObj.get("bannerUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerUrl").toString()));
      }
      if ((jsonObj.get("privacy") != null && !jsonObj.get("privacy").isJsonNull()) && !jsonObj.get("privacy").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `privacy` to be a primitive type in the JSON string but got `%s`", jsonObj.get("privacy").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if ((jsonObj.get("groupId") != null && !jsonObj.get("groupId").isJsonNull()) && !jsonObj.get("groupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("groupId").toString()));
      }
      if ((jsonObj.get("memberVisibility") != null && !jsonObj.get("memberVisibility").isJsonNull()) && !jsonObj.get("memberVisibility").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `memberVisibility` to be a primitive type in the JSON string but got `%s`", jsonObj.get("memberVisibility").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LimitedUserGroups.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LimitedUserGroups' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LimitedUserGroups> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LimitedUserGroups.class));

       return (TypeAdapter<T>) new TypeAdapter<LimitedUserGroups>() {
           @Override
           public void write(JsonWriter out, LimitedUserGroups value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LimitedUserGroups read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LimitedUserGroups given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LimitedUserGroups
  * @throws IOException if the JSON string is invalid with respect to LimitedUserGroups
  */
  public static LimitedUserGroups fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LimitedUserGroups.class);
  }

 /**
  * Convert an instance of LimitedUserGroups to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

