/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.10.0
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
import io.github.vrchatapi.model.InstancePlatforms;
import io.github.vrchatapi.model.InstanceType;
import io.github.vrchatapi.model.Region;
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
 * * &#x60;hidden&#x60; field is only present if InstanceType is &#x60;hidden&#x60; aka \&quot;Friends+\&quot;, and is instance creator. * &#x60;friends&#x60; field is only present if InstanceType is &#x60;friends&#x60; aka \&quot;Friends\&quot;, and is instance creator. * &#x60;private&#x60; field is only present if InstanceType is &#x60;private&#x60; aka \&quot;Invite\&quot; or \&quot;Invite+\&quot;, and is instance creator.
 */
@ApiModel(description = "* `hidden` field is only present if InstanceType is `hidden` aka \"Friends+\", and is instance creator. * `friends` field is only present if InstanceType is `friends` aka \"Friends\", and is instance creator. * `private` field is only present if InstanceType is `private` aka \"Invite\" or \"Invite+\", and is instance creator.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Instance {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active = true;

  public static final String SERIALIZED_NAME_CAN_REQUEST_INVITE = "canRequestInvite";
  @SerializedName(SERIALIZED_NAME_CAN_REQUEST_INVITE)
  private Boolean canRequestInvite = true;

  public static final String SERIALIZED_NAME_CAPACITY = "capacity";
  @SerializedName(SERIALIZED_NAME_CAPACITY)
  private Integer capacity;

  public static final String SERIALIZED_NAME_CLIENT_NUMBER = "clientNumber";
  @SerializedName(SERIALIZED_NAME_CLIENT_NUMBER)
  private String clientNumber;

  public static final String SERIALIZED_NAME_FULL = "full";
  @SerializedName(SERIALIZED_NAME_FULL)
  private Boolean full = false;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private String instanceId;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_N_USERS = "n_users";
  @SerializedName(SERIALIZED_NAME_N_USERS)
  private Integer nUsers;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_PERMANENT = "permanent";
  @SerializedName(SERIALIZED_NAME_PERMANENT)
  private Boolean permanent = false;

  public static final String SERIALIZED_NAME_PHOTON_REGION = "photonRegion";
  @SerializedName(SERIALIZED_NAME_PHOTON_REGION)
  private Region photonRegion = Region.US;

  public static final String SERIALIZED_NAME_PLATFORMS = "platforms";
  @SerializedName(SERIALIZED_NAME_PLATFORMS)
  private InstancePlatforms platforms;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private Region region = Region.US;

  public static final String SERIALIZED_NAME_SECURE_NAME = "secureName";
  @SerializedName(SERIALIZED_NAME_SECURE_NAME)
  private String secureName;

  public static final String SERIALIZED_NAME_SHORT_NAME = "shortName";
  @SerializedName(SERIALIZED_NAME_SHORT_NAME)
  private String shortName;

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private InstanceType type;

  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;

  public static final String SERIALIZED_NAME_HIDDEN = "hidden";
  @SerializedName(SERIALIZED_NAME_HIDDEN)
  private String hidden;

  public static final String SERIALIZED_NAME_FRIENDS = "friends";
  @SerializedName(SERIALIZED_NAME_FRIENDS)
  private String friends;

  public static final String SERIALIZED_NAME_PRIVATE = "private";
  @SerializedName(SERIALIZED_NAME_PRIVATE)
  private String _private;

  public Instance() {
  }

  public Instance active(Boolean active) {
    
    this.active = active;
    return this;
  }

   /**
   * Get active
   * @return active
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getActive() {
    return active;
  }


  public void setActive(Boolean active) {
    this.active = active;
  }


  public Instance canRequestInvite(Boolean canRequestInvite) {
    
    this.canRequestInvite = canRequestInvite;
    return this;
  }

   /**
   * Get canRequestInvite
   * @return canRequestInvite
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")

  public Boolean getCanRequestInvite() {
    return canRequestInvite;
  }


  public void setCanRequestInvite(Boolean canRequestInvite) {
    this.canRequestInvite = canRequestInvite;
  }


  public Instance capacity(Integer capacity) {
    
    this.capacity = capacity;
    return this;
  }

   /**
   * Get capacity
   * minimum: 0
   * @return capacity
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")

  public Integer getCapacity() {
    return capacity;
  }


  public void setCapacity(Integer capacity) {
    this.capacity = capacity;
  }


  public Instance clientNumber(String clientNumber) {
    
    this.clientNumber = clientNumber;
    return this;
  }

   /**
   * Always returns \&quot;unknown\&quot;.
   * @return clientNumber
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Always returns \"unknown\".")

  public String getClientNumber() {
    return clientNumber;
  }


  public void setClientNumber(String clientNumber) {
    this.clientNumber = clientNumber;
  }


  public Instance full(Boolean full) {
    
    this.full = full;
    return this;
  }

   /**
   * Get full
   * @return full
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getFull() {
    return full;
  }


  public void setFull(Boolean full) {
    this.full = full;
  }


  public Instance id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812:12345~hidden(usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469)~region(eu)~nonce(27e8414a-59a0-4f3d-af1f-f27557eb49a2)", required = true, value = "InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Instance instanceId(String instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12345~hidden(usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469)~region(eu)~nonce(27e8414a-59a0-4f3d-af1f-f27557eb49a2)", required = true, value = "")

  public String getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }


  public Instance location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * InstanceID can be \&quot;offline\&quot; on User profiles if you are not friends with that user and \&quot;private\&quot; if you are friends and user is in private instance.
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812:12345~hidden(usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469)~region(eu)~nonce(27e8414a-59a0-4f3d-af1f-f27557eb49a2)", required = true, value = "InstanceID can be \"offline\" on User profiles if you are not friends with that user and \"private\" if you are friends and user is in private instance.")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public Instance nUsers(Integer nUsers) {
    
    this.nUsers = nUsers;
    return this;
  }

   /**
   * Get nUsers
   * minimum: 0
   * @return nUsers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "6", required = true, value = "")

  public Integer getnUsers() {
    return nUsers;
  }


  public void setnUsers(Integer nUsers) {
    this.nUsers = nUsers;
  }


  public Instance name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "12345", required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Instance ownerId(String ownerId) {
    
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


  public Instance permanent(Boolean permanent) {
    
    this.permanent = permanent;
    return this;
  }

   /**
   * Get permanent
   * @return permanent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getPermanent() {
    return permanent;
  }


  public void setPermanent(Boolean permanent) {
    this.permanent = permanent;
  }


  public Instance photonRegion(Region photonRegion) {
    
    this.photonRegion = photonRegion;
    return this;
  }

   /**
   * Get photonRegion
   * @return photonRegion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Region getPhotonRegion() {
    return photonRegion;
  }


  public void setPhotonRegion(Region photonRegion) {
    this.photonRegion = photonRegion;
  }


  public Instance platforms(InstancePlatforms platforms) {
    
    this.platforms = platforms;
    return this;
  }

   /**
   * Get platforms
   * @return platforms
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InstancePlatforms getPlatforms() {
    return platforms;
  }


  public void setPlatforms(InstancePlatforms platforms) {
    this.platforms = platforms;
  }


  public Instance region(Region region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Region getRegion() {
    return region;
  }


  public void setRegion(Region region) {
    this.region = region;
  }


  public Instance secureName(String secureName) {
    
    this.secureName = secureName;
    return this;
  }

   /**
   * Get secureName
   * @return secureName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "7eavhhng", required = true, value = "")

  public String getSecureName() {
    return secureName;
  }


  public void setSecureName(String secureName) {
    this.secureName = secureName;
  }


  public Instance shortName(String shortName) {
    
    this.shortName = shortName;
    return this;
  }

   /**
   * Get shortName
   * @return shortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02u7yz8j", value = "")

  public String getShortName() {
    return shortName;
  }


  public void setShortName(String shortName) {
    this.shortName = shortName;
  }


  public Instance tags(List<String> tags) {
    
    this.tags = tags;
    return this;
  }

  public Instance addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * The tags array on Instances usually contain the language tags of the people in the instance. 
   * @return tags
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "[\"show_social_rank\",\"language_eng\",\"language_jpn\"]", required = true, value = "The tags array on Instances usually contain the language tags of the people in the instance. ")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    this.tags = tags;
  }


  public Instance type(InstanceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InstanceType getType() {
    return type;
  }


  public void setType(InstanceType type) {
    this.type = type;
  }


  public Instance worldId(String worldId) {
    
    this.worldId = worldId;
    return this;
  }

   /**
   * WorldID be \&quot;offline\&quot; on User profiles if you are not friends with that user.
   * @return worldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "WorldID be \"offline\" on User profiles if you are not friends with that user.")

  public String getWorldId() {
    return worldId;
  }


  public void setWorldId(String worldId) {
    this.worldId = worldId;
  }


  public Instance hidden(String hidden) {
    
    this.hidden = hidden;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return hidden
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getHidden() {
    return hidden;
  }


  public void setHidden(String hidden) {
    this.hidden = hidden;
  }


  public Instance friends(String friends) {
    
    this.friends = friends;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return friends
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getFriends() {
    return friends;
  }


  public void setFriends(String friends) {
    this.friends = friends;
  }


  public Instance _private(String _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return _private
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getPrivate() {
    return _private;
  }


  public void setPrivate(String _private) {
    this._private = _private;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Instance instance = (Instance) o;
    return Objects.equals(this.active, instance.active) &&
        Objects.equals(this.canRequestInvite, instance.canRequestInvite) &&
        Objects.equals(this.capacity, instance.capacity) &&
        Objects.equals(this.clientNumber, instance.clientNumber) &&
        Objects.equals(this.full, instance.full) &&
        Objects.equals(this.id, instance.id) &&
        Objects.equals(this.instanceId, instance.instanceId) &&
        Objects.equals(this.location, instance.location) &&
        Objects.equals(this.nUsers, instance.nUsers) &&
        Objects.equals(this.name, instance.name) &&
        Objects.equals(this.ownerId, instance.ownerId) &&
        Objects.equals(this.permanent, instance.permanent) &&
        Objects.equals(this.photonRegion, instance.photonRegion) &&
        Objects.equals(this.platforms, instance.platforms) &&
        Objects.equals(this.region, instance.region) &&
        Objects.equals(this.secureName, instance.secureName) &&
        Objects.equals(this.shortName, instance.shortName) &&
        Objects.equals(this.tags, instance.tags) &&
        Objects.equals(this.type, instance.type) &&
        Objects.equals(this.worldId, instance.worldId) &&
        Objects.equals(this.hidden, instance.hidden) &&
        Objects.equals(this.friends, instance.friends) &&
        Objects.equals(this._private, instance._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, canRequestInvite, capacity, clientNumber, full, id, instanceId, location, nUsers, name, ownerId, permanent, photonRegion, platforms, region, secureName, shortName, tags, type, worldId, hidden, friends, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Instance {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    canRequestInvite: ").append(toIndentedString(canRequestInvite)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    clientNumber: ").append(toIndentedString(clientNumber)).append("\n");
    sb.append("    full: ").append(toIndentedString(full)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    nUsers: ").append(toIndentedString(nUsers)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    permanent: ").append(toIndentedString(permanent)).append("\n");
    sb.append("    photonRegion: ").append(toIndentedString(photonRegion)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    secureName: ").append(toIndentedString(secureName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    friends: ").append(toIndentedString(friends)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("canRequestInvite");
    openapiFields.add("capacity");
    openapiFields.add("clientNumber");
    openapiFields.add("full");
    openapiFields.add("id");
    openapiFields.add("instanceId");
    openapiFields.add("location");
    openapiFields.add("n_users");
    openapiFields.add("name");
    openapiFields.add("ownerId");
    openapiFields.add("permanent");
    openapiFields.add("photonRegion");
    openapiFields.add("platforms");
    openapiFields.add("region");
    openapiFields.add("secureName");
    openapiFields.add("shortName");
    openapiFields.add("tags");
    openapiFields.add("type");
    openapiFields.add("worldId");
    openapiFields.add("hidden");
    openapiFields.add("friends");
    openapiFields.add("private");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("active");
    openapiRequiredFields.add("canRequestInvite");
    openapiRequiredFields.add("capacity");
    openapiRequiredFields.add("clientNumber");
    openapiRequiredFields.add("full");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("instanceId");
    openapiRequiredFields.add("location");
    openapiRequiredFields.add("n_users");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("permanent");
    openapiRequiredFields.add("photonRegion");
    openapiRequiredFields.add("platforms");
    openapiRequiredFields.add("region");
    openapiRequiredFields.add("secureName");
    openapiRequiredFields.add("tags");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("worldId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Instance
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Instance.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Instance is not found in the empty JSON string", Instance.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Instance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Instance` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Instance.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("clientNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `clientNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("clientNumber").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("instanceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `instanceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("instanceId").toString()));
      }
      if (!jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      // validate the required field `platforms`
      InstancePlatforms.validateJsonObject(jsonObj.getAsJsonObject("platforms"));
      if (!jsonObj.get("secureName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `secureName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("secureName").toString()));
      }
      if ((jsonObj.get("shortName") != null && !jsonObj.get("shortName").isJsonNull()) && !jsonObj.get("shortName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortName").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("tags") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if (!jsonObj.get("worldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worldId").toString()));
      }
      if ((jsonObj.get("hidden") != null && !jsonObj.get("hidden").isJsonNull()) && !jsonObj.get("hidden").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `hidden` to be a primitive type in the JSON string but got `%s`", jsonObj.get("hidden").toString()));
      }
      if ((jsonObj.get("friends") != null && !jsonObj.get("friends").isJsonNull()) && !jsonObj.get("friends").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `friends` to be a primitive type in the JSON string but got `%s`", jsonObj.get("friends").toString()));
      }
      if ((jsonObj.get("private") != null && !jsonObj.get("private").isJsonNull()) && !jsonObj.get("private").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `private` to be a primitive type in the JSON string but got `%s`", jsonObj.get("private").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Instance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Instance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Instance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Instance.class));

       return (TypeAdapter<T>) new TypeAdapter<Instance>() {
           @Override
           public void write(JsonWriter out, Instance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Instance read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Instance given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Instance
  * @throws IOException if the JSON string is invalid with respect to Instance
  */
  public static Instance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Instance.class);
  }

 /**
  * Convert an instance of Instance to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

