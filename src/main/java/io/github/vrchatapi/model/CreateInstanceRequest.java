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
import io.github.vrchatapi.model.GroupAccessType;
import io.github.vrchatapi.model.InstanceRegion;
import io.github.vrchatapi.model.InstanceType;
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
 * CreateInstanceRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateInstanceRequest {
  public static final String SERIALIZED_NAME_WORLD_ID = "worldId";
  @SerializedName(SERIALIZED_NAME_WORLD_ID)
  private String worldId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private InstanceType type;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private InstanceRegion region = InstanceRegion.US;

  public static final String SERIALIZED_NAME_OWNER_ID = "ownerId";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_ROLE_IDS = "roleIds";
  @SerializedName(SERIALIZED_NAME_ROLE_IDS)
  private List<String> roleIds = null;

  public static final String SERIALIZED_NAME_GROUP_ACCESS_TYPE = "groupAccessType";
  @SerializedName(SERIALIZED_NAME_GROUP_ACCESS_TYPE)
  private GroupAccessType groupAccessType = GroupAccessType.MEMBERS;

  public static final String SERIALIZED_NAME_QUEUE_ENABLED = "queueEnabled";
  @SerializedName(SERIALIZED_NAME_QUEUE_ENABLED)
  private Boolean queueEnabled = false;

  public static final String SERIALIZED_NAME_CLOSED_AT = "closedAt";
  @SerializedName(SERIALIZED_NAME_CLOSED_AT)
  private OffsetDateTime closedAt;

  public static final String SERIALIZED_NAME_CAN_REQUEST_INVITE = "canRequestInvite";
  @SerializedName(SERIALIZED_NAME_CAN_REQUEST_INVITE)
  private Boolean canRequestInvite = false;

  public static final String SERIALIZED_NAME_HARD_CLOSE = "hardClose";
  @SerializedName(SERIALIZED_NAME_HARD_CLOSE)
  private Boolean hardClose = false;

  public static final String SERIALIZED_NAME_INVITE_ONLY = "inviteOnly";
  @SerializedName(SERIALIZED_NAME_INVITE_ONLY)
  private Boolean inviteOnly = false;

  public CreateInstanceRequest() {
  }

  public CreateInstanceRequest worldId(String worldId) {
    
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


  public CreateInstanceRequest type(InstanceType type) {
    
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


  public CreateInstanceRequest region(InstanceRegion region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InstanceRegion getRegion() {
    return region;
  }


  public void setRegion(InstanceRegion region) {
    this.region = region;
  }


  public CreateInstanceRequest ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * A groupId if the instance type is \&quot;group\&quot;, null if instance type is public, or a userId otherwise
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A groupId if the instance type is \"group\", null if instance type is public, or a userId otherwise")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public CreateInstanceRequest roleIds(List<String> roleIds) {
    
    this.roleIds = roleIds;
    return this;
  }

  public CreateInstanceRequest addRoleIdsItem(String roleIdsItem) {
    if (this.roleIds == null) {
      this.roleIds = new ArrayList<>();
    }
    this.roleIds.add(roleIdsItem);
    return this;
  }

   /**
   * Group roleIds that are allowed to join if the type is \&quot;group\&quot; and groupAccessType is \&quot;member\&quot;
   * @return roleIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Group roleIds that are allowed to join if the type is \"group\" and groupAccessType is \"member\"")

  public List<String> getRoleIds() {
    return roleIds;
  }


  public void setRoleIds(List<String> roleIds) {
    this.roleIds = roleIds;
  }


  public CreateInstanceRequest groupAccessType(GroupAccessType groupAccessType) {
    
    this.groupAccessType = groupAccessType;
    return this;
  }

   /**
   * Get groupAccessType
   * @return groupAccessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GroupAccessType getGroupAccessType() {
    return groupAccessType;
  }


  public void setGroupAccessType(GroupAccessType groupAccessType) {
    this.groupAccessType = groupAccessType;
  }


  public CreateInstanceRequest queueEnabled(Boolean queueEnabled) {
    
    this.queueEnabled = queueEnabled;
    return this;
  }

   /**
   * Get queueEnabled
   * @return queueEnabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getQueueEnabled() {
    return queueEnabled;
  }


  public void setQueueEnabled(Boolean queueEnabled) {
    this.queueEnabled = queueEnabled;
  }


  public CreateInstanceRequest closedAt(OffsetDateTime closedAt) {
    
    this.closedAt = closedAt;
    return this;
  }

   /**
   * The time after which users won&#39;t be allowed to join the instance. This doesn&#39;t work for public instances.
   * @return closedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time after which users won't be allowed to join the instance. This doesn't work for public instances.")

  public OffsetDateTime getClosedAt() {
    return closedAt;
  }


  public void setClosedAt(OffsetDateTime closedAt) {
    this.closedAt = closedAt;
  }


  public CreateInstanceRequest canRequestInvite(Boolean canRequestInvite) {
    
    this.canRequestInvite = canRequestInvite;
    return this;
  }

   /**
   * Only applies to invite type instances to make them invite+
   * @return canRequestInvite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Only applies to invite type instances to make them invite+")

  public Boolean getCanRequestInvite() {
    return canRequestInvite;
  }


  public void setCanRequestInvite(Boolean canRequestInvite) {
    this.canRequestInvite = canRequestInvite;
  }


  public CreateInstanceRequest hardClose(Boolean hardClose) {
    
    this.hardClose = hardClose;
    return this;
  }

   /**
   * Currently unused, but will eventually be a flag to set if the closing of the instance should kick people.
   * @return hardClose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Currently unused, but will eventually be a flag to set if the closing of the instance should kick people.")

  public Boolean getHardClose() {
    return hardClose;
  }


  public void setHardClose(Boolean hardClose) {
    this.hardClose = hardClose;
  }


  public CreateInstanceRequest inviteOnly(Boolean inviteOnly) {
    
    this.inviteOnly = inviteOnly;
    return this;
  }

   /**
   * Get inviteOnly
   * @return inviteOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInviteOnly() {
    return inviteOnly;
  }


  public void setInviteOnly(Boolean inviteOnly) {
    this.inviteOnly = inviteOnly;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateInstanceRequest createInstanceRequest = (CreateInstanceRequest) o;
    return Objects.equals(this.worldId, createInstanceRequest.worldId) &&
        Objects.equals(this.type, createInstanceRequest.type) &&
        Objects.equals(this.region, createInstanceRequest.region) &&
        Objects.equals(this.ownerId, createInstanceRequest.ownerId) &&
        Objects.equals(this.roleIds, createInstanceRequest.roleIds) &&
        Objects.equals(this.groupAccessType, createInstanceRequest.groupAccessType) &&
        Objects.equals(this.queueEnabled, createInstanceRequest.queueEnabled) &&
        Objects.equals(this.closedAt, createInstanceRequest.closedAt) &&
        Objects.equals(this.canRequestInvite, createInstanceRequest.canRequestInvite) &&
        Objects.equals(this.hardClose, createInstanceRequest.hardClose) &&
        Objects.equals(this.inviteOnly, createInstanceRequest.inviteOnly);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(worldId, type, region, ownerId, roleIds, groupAccessType, queueEnabled, closedAt, canRequestInvite, hardClose, inviteOnly);
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
    sb.append("class CreateInstanceRequest {\n");
    sb.append("    worldId: ").append(toIndentedString(worldId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    roleIds: ").append(toIndentedString(roleIds)).append("\n");
    sb.append("    groupAccessType: ").append(toIndentedString(groupAccessType)).append("\n");
    sb.append("    queueEnabled: ").append(toIndentedString(queueEnabled)).append("\n");
    sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
    sb.append("    canRequestInvite: ").append(toIndentedString(canRequestInvite)).append("\n");
    sb.append("    hardClose: ").append(toIndentedString(hardClose)).append("\n");
    sb.append("    inviteOnly: ").append(toIndentedString(inviteOnly)).append("\n");
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
    openapiFields.add("worldId");
    openapiFields.add("type");
    openapiFields.add("region");
    openapiFields.add("ownerId");
    openapiFields.add("roleIds");
    openapiFields.add("groupAccessType");
    openapiFields.add("queueEnabled");
    openapiFields.add("closedAt");
    openapiFields.add("canRequestInvite");
    openapiFields.add("hardClose");
    openapiFields.add("inviteOnly");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("worldId");
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("region");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateInstanceRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateInstanceRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateInstanceRequest is not found in the empty JSON string", CreateInstanceRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateInstanceRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateInstanceRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateInstanceRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("worldId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worldId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worldId").toString()));
      }
      if ((jsonObj.get("ownerId") != null && !jsonObj.get("ownerId").isJsonNull()) && !jsonObj.get("ownerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ownerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ownerId").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("roleIds") != null && !jsonObj.get("roleIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleIds` to be an array in the JSON string but got `%s`", jsonObj.get("roleIds").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateInstanceRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateInstanceRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateInstanceRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateInstanceRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateInstanceRequest>() {
           @Override
           public void write(JsonWriter out, CreateInstanceRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateInstanceRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateInstanceRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateInstanceRequest
  * @throws IOException if the JSON string is invalid with respect to CreateInstanceRequest
  */
  public static CreateInstanceRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateInstanceRequest.class);
  }

 /**
  * Convert an instance of CreateInstanceRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

