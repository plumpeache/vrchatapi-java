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
import io.github.vrchatapi.model.GroupGallery;
import io.github.vrchatapi.model.GroupJoinState;
import io.github.vrchatapi.model.GroupMemberStatus;
import io.github.vrchatapi.model.GroupMyMember;
import io.github.vrchatapi.model.GroupPrivacy;
import io.github.vrchatapi.model.GroupRole;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Group
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Group {
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

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public static final String SERIALIZED_NAME_BANNER_URL = "bannerUrl";
  @SerializedName(SERIALIZED_NAME_BANNER_URL)
  private String bannerUrl;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private GroupPrivacy privacy = GroupPrivacy.DEFAULT;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_RULES = "rules";
  @SerializedName(SERIALIZED_NAME_RULES)
  private String rules;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<String> links = null;

  public static final String SERIALIZED_NAME_LANGUAGES = "languages";
  @SerializedName(SERIALIZED_NAME_LANGUAGES)
  private List<String> languages = null;

  public static final String SERIALIZED_NAME_ICON_ID = "iconId";
  @SerializedName(SERIALIZED_NAME_ICON_ID)
  private String iconId;

  public static final String SERIALIZED_NAME_BANNER_ID = "bannerId";
  @SerializedName(SERIALIZED_NAME_BANNER_ID)
  private String bannerId;

  public static final String SERIALIZED_NAME_MEMBER_COUNT = "memberCount";
  @SerializedName(SERIALIZED_NAME_MEMBER_COUNT)
  private Integer memberCount;

  public static final String SERIALIZED_NAME_MEMBER_COUNT_SYNCED_AT = "memberCountSyncedAt";
  @SerializedName(SERIALIZED_NAME_MEMBER_COUNT_SYNCED_AT)
  private OffsetDateTime memberCountSyncedAt;

  public static final String SERIALIZED_NAME_IS_VERIFIED = "isVerified";
  @SerializedName(SERIALIZED_NAME_IS_VERIFIED)
  private Boolean isVerified = false;

  public static final String SERIALIZED_NAME_JOIN_STATE = "joinState";
  @SerializedName(SERIALIZED_NAME_JOIN_STATE)
  private GroupJoinState joinState = GroupJoinState.OPEN;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_GALLERIES = "galleries";
  @SerializedName(SERIALIZED_NAME_GALLERIES)
  private List<GroupGallery> galleries = null;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_ONLINE_MEMBER_COUNT = "onlineMemberCount";
  @SerializedName(SERIALIZED_NAME_ONLINE_MEMBER_COUNT)
  private Integer onlineMemberCount;

  public static final String SERIALIZED_NAME_MEMBERSHIP_STATUS = "membershipStatus";
  @SerializedName(SERIALIZED_NAME_MEMBERSHIP_STATUS)
  private GroupMemberStatus membershipStatus = GroupMemberStatus.INACTIVE;

  public static final String SERIALIZED_NAME_MY_MEMBER = "myMember";
  @SerializedName(SERIALIZED_NAME_MY_MEMBER)
  private GroupMyMember myMember;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<GroupRole> roles = null;

  public Group() {
  }

  public Group id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Group name(String name) {
    
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


  public Group shortCode(String shortCode) {
    
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


  public Group discriminator(String discriminator) {
    
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


  public Group description(String description) {
    
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


  public Group iconUrl(String iconUrl) {
    
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


  public Group bannerUrl(String bannerUrl) {
    
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


  public Group privacy(GroupPrivacy privacy) {
    
    this.privacy = privacy;
    return this;
  }

   /**
   * Get privacy
   * @return privacy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupPrivacy getPrivacy() {
    return privacy;
  }


  public void setPrivacy(GroupPrivacy privacy) {
    this.privacy = privacy;
  }


  public Group ownerId(String ownerId) {
    
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


  public Group rules(String rules) {
    
    this.rules = rules;
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRules() {
    return rules;
  }


  public void setRules(String rules) {
    this.rules = rules;
  }


  public Group links(List<String> links) {
    
    this.links = links;
    return this;
  }

  public Group addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLinks() {
    return links;
  }


  public void setLinks(List<String> links) {
    this.links = links;
  }


  public Group languages(List<String> languages) {
    
    this.languages = languages;
    return this;
  }

  public Group addLanguagesItem(String languagesItem) {
    if (this.languages == null) {
      this.languages = new ArrayList<>();
    }
    this.languages.add(languagesItem);
    return this;
  }

   /**
   * Get languages
   * @return languages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getLanguages() {
    return languages;
  }


  public void setLanguages(List<String> languages) {
    this.languages = languages;
  }


  public Group iconId(String iconId) {
    
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


  public Group bannerId(String bannerId) {
    
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


  public Group memberCount(Integer memberCount) {
    
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


  public Group memberCountSyncedAt(OffsetDateTime memberCountSyncedAt) {
    
    this.memberCountSyncedAt = memberCountSyncedAt;
    return this;
  }

   /**
   * Get memberCountSyncedAt
   * @return memberCountSyncedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getMemberCountSyncedAt() {
    return memberCountSyncedAt;
  }


  public void setMemberCountSyncedAt(OffsetDateTime memberCountSyncedAt) {
    this.memberCountSyncedAt = memberCountSyncedAt;
  }


  public Group isVerified(Boolean isVerified) {
    
    this.isVerified = isVerified;
    return this;
  }

   /**
   * Get isVerified
   * @return isVerified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsVerified() {
    return isVerified;
  }


  public void setIsVerified(Boolean isVerified) {
    this.isVerified = isVerified;
  }


  public Group joinState(GroupJoinState joinState) {
    
    this.joinState = joinState;
    return this;
  }

   /**
   * Get joinState
   * @return joinState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupJoinState getJoinState() {
    return joinState;
  }


  public void setJoinState(GroupJoinState joinState) {
    this.joinState = joinState;
  }


  public Group tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Group addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   *  
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Group galleries(List<GroupGallery> galleries) {
    
    this.galleries = galleries;
    return this;
  }

  public Group addGalleriesItem(GroupGallery galleriesItem) {
    if (this.galleries == null) {
      this.galleries = new ArrayList<>();
    }
    this.galleries.add(galleriesItem);
    return this;
  }

   /**
   *  
   * @return galleries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = " ")

  public List<GroupGallery> getGalleries() {
    return galleries;
  }


  public void setGalleries(List<GroupGallery> galleries) {
    this.galleries = galleries;
  }


  public Group createdAt(OffsetDateTime createdAt) {
    
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


  public Group onlineMemberCount(Integer onlineMemberCount) {
    
    this.onlineMemberCount = onlineMemberCount;
    return this;
  }

   /**
   * Get onlineMemberCount
   * @return onlineMemberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOnlineMemberCount() {
    return onlineMemberCount;
  }


  public void setOnlineMemberCount(Integer onlineMemberCount) {
    this.onlineMemberCount = onlineMemberCount;
  }


  public Group membershipStatus(GroupMemberStatus membershipStatus) {
    
    this.membershipStatus = membershipStatus;
    return this;
  }

   /**
   * Get membershipStatus
   * @return membershipStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupMemberStatus getMembershipStatus() {
    return membershipStatus;
  }


  public void setMembershipStatus(GroupMemberStatus membershipStatus) {
    this.membershipStatus = membershipStatus;
  }


  public Group myMember(GroupMyMember myMember) {
    
    this.myMember = myMember;
    return this;
  }

   /**
   * Get myMember
   * @return myMember
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupMyMember getMyMember() {
    return myMember;
  }


  public void setMyMember(GroupMyMember myMember) {
    this.myMember = myMember;
  }


  public Group roles(List<GroupRole> roles) {
    
    this.roles = roles;
    return this;
  }

  public Group addRolesItem(GroupRole rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Only returned if ?includeRoles&#x3D;true is specified.
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only returned if ?includeRoles=true is specified.")

  public List<GroupRole> getRoles() {
    return roles;
  }


  public void setRoles(List<GroupRole> roles) {
    this.roles = roles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Group group = (Group) o;
    return Objects.equals(this.id, group.id) &&
        Objects.equals(this.name, group.name) &&
        Objects.equals(this.shortCode, group.shortCode) &&
        Objects.equals(this.discriminator, group.discriminator) &&
        Objects.equals(this.description, group.description) &&
        Objects.equals(this.iconUrl, group.iconUrl) &&
        Objects.equals(this.bannerUrl, group.bannerUrl) &&
        Objects.equals(this.privacy, group.privacy) &&
        Objects.equals(this.ownerId, group.ownerId) &&
        Objects.equals(this.rules, group.rules) &&
        Objects.equals(this.links, group.links) &&
        Objects.equals(this.languages, group.languages) &&
        Objects.equals(this.iconId, group.iconId) &&
        Objects.equals(this.bannerId, group.bannerId) &&
        Objects.equals(this.memberCount, group.memberCount) &&
        Objects.equals(this.memberCountSyncedAt, group.memberCountSyncedAt) &&
        Objects.equals(this.isVerified, group.isVerified) &&
        Objects.equals(this.joinState, group.joinState) &&
        Objects.equals(this.tags, group.tags) &&
        Objects.equals(this.galleries, group.galleries) &&
        Objects.equals(this.createdAt, group.createdAt) &&
        Objects.equals(this.onlineMemberCount, group.onlineMemberCount) &&
        Objects.equals(this.membershipStatus, group.membershipStatus) &&
        Objects.equals(this.myMember, group.myMember) &&
        Objects.equals(this.roles, group.roles);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, shortCode, discriminator, description, iconUrl, bannerUrl, privacy, ownerId, rules, links, languages, iconId, bannerId, memberCount, memberCountSyncedAt, isVerified, joinState, tags, galleries, createdAt, onlineMemberCount, membershipStatus, myMember, roles);
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
    sb.append("class Group {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    discriminator: ").append(toIndentedString(discriminator)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    bannerUrl: ").append(toIndentedString(bannerUrl)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    memberCountSyncedAt: ").append(toIndentedString(memberCountSyncedAt)).append("\n");
    sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
    sb.append("    joinState: ").append(toIndentedString(joinState)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    galleries: ").append(toIndentedString(galleries)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    onlineMemberCount: ").append(toIndentedString(onlineMemberCount)).append("\n");
    sb.append("    membershipStatus: ").append(toIndentedString(membershipStatus)).append("\n");
    sb.append("    myMember: ").append(toIndentedString(myMember)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
    openapiFields.add("iconUrl");
    openapiFields.add("bannerUrl");
    openapiFields.add("privacy");
    openapiFields.add("ownerId");
    openapiFields.add("rules");
    openapiFields.add("links");
    openapiFields.add("languages");
    openapiFields.add("iconId");
    openapiFields.add("bannerId");
    openapiFields.add("memberCount");
    openapiFields.add("memberCountSyncedAt");
    openapiFields.add("isVerified");
    openapiFields.add("joinState");
    openapiFields.add("tags");
    openapiFields.add("galleries");
    openapiFields.add("createdAt");
    openapiFields.add("onlineMemberCount");
    openapiFields.add("membershipStatus");
    openapiFields.add("myMember");
    openapiFields.add("roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Group
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Group.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Group is not found in the empty JSON string", Group.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Group.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Group` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
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
      if ((jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
      if ((jsonObj.get("bannerUrl") != null && !jsonObj.get("bannerUrl").isJsonNull()) && !jsonObj.get("bannerUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerUrl").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      if ((jsonObj.get("rules") != null && !jsonObj.get("rules").isJsonNull()) && !jsonObj.get("rules").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rules` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rules").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be an array in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("languages") != null && !jsonObj.get("languages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `languages` to be an array in the JSON string but got `%s`", jsonObj.get("languages").toString()));
      }
      if ((jsonObj.get("iconId") != null && !jsonObj.get("iconId").isJsonNull()) && !jsonObj.get("iconId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconId").toString()));
      }
      if ((jsonObj.get("bannerId") != null && !jsonObj.get("bannerId").isJsonNull()) && !jsonObj.get("bannerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (jsonObj.get("galleries") != null && !jsonObj.get("galleries").isJsonNull()) {
        JsonArray jsonArraygalleries = jsonObj.getAsJsonArray("galleries");
        if (jsonArraygalleries != null) {
          // ensure the json data is an array
          if (!jsonObj.get("galleries").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `galleries` to be an array in the JSON string but got `%s`", jsonObj.get("galleries").toString()));
          }

          // validate the optional field `galleries` (array)
          for (int i = 0; i < jsonArraygalleries.size(); i++) {
            GroupGallery.validateJsonObject(jsonArraygalleries.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `myMember`
      if (jsonObj.get("myMember") != null && !jsonObj.get("myMember").isJsonNull()) {
        GroupMyMember.validateJsonObject(jsonObj.getAsJsonObject("myMember"));
      }
      if (jsonObj.get("roles") != null && !jsonObj.get("roles").isJsonNull()) {
        JsonArray jsonArrayroles = jsonObj.getAsJsonArray("roles");
        if (jsonArrayroles != null) {
          // ensure the json data is an array
          if (!jsonObj.get("roles").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
          }

          // validate the optional field `roles` (array)
          for (int i = 0; i < jsonArrayroles.size(); i++) {
            GroupRole.validateJsonObject(jsonArrayroles.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Group.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Group' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Group> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Group.class));

       return (TypeAdapter<T>) new TypeAdapter<Group>() {
           @Override
           public void write(JsonWriter out, Group value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Group read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Group given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Group
  * @throws IOException if the JSON string is invalid with respect to Group
  */
  public static Group fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Group.class);
  }

 /**
  * Convert an instance of Group to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

