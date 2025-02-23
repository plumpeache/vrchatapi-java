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
import io.github.vrchatapi.model.DeveloperType;
import io.github.vrchatapi.model.UserState;
import io.github.vrchatapi.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.LocalDate;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class User {
  public static final String SERIALIZED_NAME_ALLOW_AVATAR_COPYING = "allowAvatarCopying";
  @SerializedName(SERIALIZED_NAME_ALLOW_AVATAR_COPYING)
  private Boolean allowAvatarCopying = true;

  public static final String SERIALIZED_NAME_BIO = "bio";
  @SerializedName(SERIALIZED_NAME_BIO)
  private String bio;

  public static final String SERIALIZED_NAME_BIO_LINKS = "bioLinks";
  @SerializedName(SERIALIZED_NAME_BIO_LINKS)
  private List<String> bioLinks = new ArrayList<String>();

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL = "currentAvatarImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_IMAGE_URL)
  private String currentAvatarImageUrl;

  public static final String SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL = "currentAvatarThumbnailImageUrl";
  @SerializedName(SERIALIZED_NAME_CURRENT_AVATAR_THUMBNAIL_IMAGE_URL)
  private String currentAvatarThumbnailImageUrl;

  public static final String SERIALIZED_NAME_DATE_JOINED = "date_joined";
  @SerializedName(SERIALIZED_NAME_DATE_JOINED)
  private LocalDate dateJoined;

  public static final String SERIALIZED_NAME_DEVELOPER_TYPE = "developerType";
  @SerializedName(SERIALIZED_NAME_DEVELOPER_TYPE)
  private DeveloperType developerType = DeveloperType.NONE;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_FRIEND_KEY = "friendKey";
  @SerializedName(SERIALIZED_NAME_FRIEND_KEY)
  private String friendKey;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_IS_FRIEND = "isFriend";
  @SerializedName(SERIALIZED_NAME_IS_FRIEND)
  private Boolean isFriend;

  public static final String SERIALIZED_NAME_LAST_LOGIN = "last_login";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN)
  private String lastLogin;

  public static final String SERIALIZED_NAME_LAST_PLATFORM = "last_platform";
  @SerializedName(SERIALIZED_NAME_LAST_PLATFORM)
  private String lastPlatform;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_PROFILE_PIC_OVERRIDE = "profilePicOverride";
  @SerializedName(SERIALIZED_NAME_PROFILE_PIC_OVERRIDE)
  private String profilePicOverride;

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private UserState state = UserState.OFFLINE;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private UserStatus status = UserStatus.OFFLINE;

  public static final String SERIALIZED_NAME_STATUS_DESCRIPTION = "statusDescription";
  @SerializedName(SERIALIZED_NAME_STATUS_DESCRIPTION)
  private String statusDescription;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<String>();

  public static final String SERIALIZED_NAME_USER_ICON = "userIcon";
  @SerializedName(SERIALIZED_NAME_USER_ICON)
  private String userIcon;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;


  public User allowAvatarCopying(Boolean allowAvatarCopying) {
    
    this.allowAvatarCopying = allowAvatarCopying;
    return this;
  }

   /**
   * Get allowAvatarCopying
   * @return allowAvatarCopying
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getAllowAvatarCopying() {
    return allowAvatarCopying;
  }


  public void setAllowAvatarCopying(Boolean allowAvatarCopying) {
    this.allowAvatarCopying = allowAvatarCopying;
  }


  public User bio(String bio) {
    
    this.bio = bio;
    return this;
  }

   /**
   * Get bio
   * @return bio
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBio() {
    return bio;
  }


  public void setBio(String bio) {
    this.bio = bio;
  }


  public User bioLinks(List<String> bioLinks) {
    
    this.bioLinks = bioLinks;
    return this;
  }

  public User addBioLinksItem(String bioLinksItem) {
    this.bioLinks.add(bioLinksItem);
    return this;
  }

   /**
   * Get bioLinks
   * @return bioLinks
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public List<String> getBioLinks() {
    return bioLinks;
  }


  public void setBioLinks(List<String> bioLinks) {
    this.bioLinks = bioLinks;
  }


  public User currentAvatarImageUrl(String currentAvatarImageUrl) {
    
    this.currentAvatarImageUrl = currentAvatarImageUrl;
    return this;
  }

   /**
   * When profilePicOverride is not empty, use it instead.
   * @return currentAvatarImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/file/file_ae46d521-7281-4b38-b365-804b32a1d6a7/1/file", required = true, value = "When profilePicOverride is not empty, use it instead.")

  public String getCurrentAvatarImageUrl() {
    return currentAvatarImageUrl;
  }


  public void setCurrentAvatarImageUrl(String currentAvatarImageUrl) {
    this.currentAvatarImageUrl = currentAvatarImageUrl;
  }


  public User currentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
    return this;
  }

   /**
   * When profilePicOverride is not empty, use it instead.
   * @return currentAvatarThumbnailImageUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://api.vrchat.cloud/api/1/image/file_aae83ed9-d42d-4d72-9f4b-9f1e41ed17e1/1/256", required = true, value = "When profilePicOverride is not empty, use it instead.")

  public String getCurrentAvatarThumbnailImageUrl() {
    return currentAvatarThumbnailImageUrl;
  }


  public void setCurrentAvatarThumbnailImageUrl(String currentAvatarThumbnailImageUrl) {
    this.currentAvatarThumbnailImageUrl = currentAvatarThumbnailImageUrl;
  }


  public User dateJoined(LocalDate dateJoined) {
    
    this.dateJoined = dateJoined;
    return this;
  }

   /**
   * Get dateJoined
   * @return dateJoined
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LocalDate getDateJoined() {
    return dateJoined;
  }


  public void setDateJoined(LocalDate dateJoined) {
    this.dateJoined = dateJoined;
  }


  public User developerType(DeveloperType developerType) {
    
    this.developerType = developerType;
    return this;
  }

   /**
   * Get developerType
   * @return developerType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DeveloperType getDeveloperType() {
    return developerType;
  }


  public void setDeveloperType(DeveloperType developerType) {
    this.developerType = developerType;
  }


  public User displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A users visual display name. This is what shows up in-game, and can different from their &#x60;username&#x60;. Changing display name is restricted to a cooldown period.
   * @return displayName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A users visual display name. This is what shows up in-game, and can different from their `username`. Changing display name is restricted to a cooldown period.")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public User friendKey(String friendKey) {
    
    this.friendKey = friendKey;
    return this;
  }

   /**
   * Get friendKey
   * @return friendKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getFriendKey() {
    return friendKey;
  }


  public void setFriendKey(String friendKey) {
    this.friendKey = friendKey;
  }


  public User id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", required = true, value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public User instanceId(String instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance.
   * @return instanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812:12345~hidden(usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469)~region(eu)~nonce(27e8414a-59a0-4f3d-af1f-f27557eb49a2)", value = "InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance.")

  public String getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public User isFriend(Boolean isFriend) {
    
    this.isFriend = isFriend;
    return this;
  }

   /**
   * Either their &#x60;friendKey&#x60;, or empty string if you are not friends. Unknown usage.
   * @return isFriend
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either their `friendKey`, or empty string if you are not friends. Unknown usage.")

  public Boolean getIsFriend() {
    return isFriend;
  }


  public void setIsFriend(Boolean isFriend) {
    this.isFriend = isFriend;
  }


  public User lastLogin(String lastLogin) {
    
    this.lastLogin = lastLogin;
    return this;
  }

   /**
   * Either a date-time or empty string.
   * @return lastLogin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either a date-time or empty string.")

  public String getLastLogin() {
    return lastLogin;
  }


  public void setLastLogin(String lastLogin) {
    this.lastLogin = lastLogin;
  }


  public User lastPlatform(String lastPlatform) {
    
    this.lastPlatform = lastPlatform;
    return this;
  }

   /**
   * This can be &#x60;standalonewindows&#x60; or &#x60;android&#x60;, but can also pretty much be any random Unity verison such as &#x60;2019.2.4-801-Release&#x60; or &#x60;2019.2.2-772-Release&#x60; or even &#x60;unknownplatform&#x60;.
   * @return lastPlatform
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "standalonewindows", required = true, value = "This can be `standalonewindows` or `android`, but can also pretty much be any random Unity verison such as `2019.2.4-801-Release` or `2019.2.2-772-Release` or even `unknownplatform`.")

  public String getLastPlatform() {
    return lastPlatform;
  }


  public void setLastPlatform(String lastPlatform) {
    this.lastPlatform = lastPlatform;
  }


  public User location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public User profilePicOverride(String profilePicOverride) {
    
    this.profilePicOverride = profilePicOverride;
    return this;
  }

   /**
   * Get profilePicOverride
   * @return profilePicOverride
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getProfilePicOverride() {
    return profilePicOverride;
  }


  public void setProfilePicOverride(String profilePicOverride) {
    this.profilePicOverride = profilePicOverride;
  }


  public User state(UserState state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserState getState() {
    return state;
  }


  public void setState(UserState state) {
    this.state = state;
  }


  public User status(UserStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public UserStatus getStatus() {
    return status;
  }


  public void setStatus(UserStatus status) {
    this.status = status;
  }


  public User statusDescription(String statusDescription) {
    
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Get statusDescription
   * @return statusDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getStatusDescription() {
    return statusDescription;
  }


  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }


  public User tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public User addTagsItem(String tagsItem) {
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


  public User userIcon(String userIcon) {
    
    this.userIcon = userIcon;
    return this;
  }

   /**
   * Get userIcon
   * @return userIcon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getUserIcon() {
    return userIcon;
  }


  public void setUserIcon(String userIcon) {
    this.userIcon = userIcon;
  }


  public User username(String username) {
    
    this.username = username;
    return this;
  }

   /**
   * A users unique name, used during login. This is different from &#x60;displayName&#x60; which is what shows up in-game. A users &#x60;username&#x60; can never be changed.
   * @return username
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A users unique name, used during login. This is different from `displayName` which is what shows up in-game. A users `username` can never be changed.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  public User worldId(String worldId) {
    
    this.worldId = worldId;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return worldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getWorldId() {
    return worldId;
  }


  public void setWorldId(String worldId) {
    this.worldId = worldId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.allowAvatarCopying, user.allowAvatarCopying) &&
        Objects.equals(this.bio, user.bio) &&
        Objects.equals(this.bioLinks, user.bioLinks) &&
        Objects.equals(this.currentAvatarImageUrl, user.currentAvatarImageUrl) &&
        Objects.equals(this.currentAvatarThumbnailImageUrl, user.currentAvatarThumbnailImageUrl) &&
        Objects.equals(this.dateJoined, user.dateJoined) &&
        Objects.equals(this.developerType, user.developerType) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.friendKey, user.friendKey) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.instanceId, user.instanceId) &&
        Objects.equals(this.isFriend, user.isFriend) &&
        Objects.equals(this.lastLogin, user.lastLogin) &&
        Objects.equals(this.lastPlatform, user.lastPlatform) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.profilePicOverride, user.profilePicOverride) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.statusDescription, user.statusDescription) &&
        Objects.equals(this.tags, user.tags) &&
        Objects.equals(this.userIcon, user.userIcon) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.worldId, user.worldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAvatarCopying, bio, bioLinks, currentAvatarImageUrl, currentAvatarThumbnailImageUrl, dateJoined, developerType, displayName, friendKey, id, instanceId, isFriend, lastLogin, lastPlatform, location, profilePicOverride, state, status, statusDescription, tags, userIcon, username, worldId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    allowAvatarCopying: ").append(toIndentedString(allowAvatarCopying)).append("\n");
    sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
    sb.append("    bioLinks: ").append(toIndentedString(bioLinks)).append("\n");
    sb.append("    currentAvatarImageUrl: ").append(toIndentedString(currentAvatarImageUrl)).append("\n");
    sb.append("    currentAvatarThumbnailImageUrl: ").append(toIndentedString(currentAvatarThumbnailImageUrl)).append("\n");
    sb.append("    dateJoined: ").append(toIndentedString(dateJoined)).append("\n");
    sb.append("    developerType: ").append(toIndentedString(developerType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    friendKey: ").append(toIndentedString(friendKey)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    isFriend: ").append(toIndentedString(isFriend)).append("\n");
    sb.append("    lastLogin: ").append(toIndentedString(lastLogin)).append("\n");
    sb.append("    lastPlatform: ").append(toIndentedString(lastPlatform)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    profilePicOverride: ").append(toIndentedString(profilePicOverride)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    userIcon: ").append(toIndentedString(userIcon)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
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

