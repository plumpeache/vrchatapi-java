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
import io.github.vrchatapi.model.GroupJoinState;
import io.github.vrchatapi.model.GroupPrivacy;
import io.github.vrchatapi.model.GroupRoleTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * CreateGroupRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroupRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SHORT_CODE = "shortCode";
  @SerializedName(SERIALIZED_NAME_SHORT_CODE)
  private String shortCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_JOIN_STATE = "joinState";
  @SerializedName(SERIALIZED_NAME_JOIN_STATE)
  private GroupJoinState joinState = GroupJoinState.OPEN;

  public static final String SERIALIZED_NAME_ICON_ID = "iconId";
  @SerializedName(SERIALIZED_NAME_ICON_ID)
  private String iconId;

  public static final String SERIALIZED_NAME_BANNER_ID = "bannerId";
  @SerializedName(SERIALIZED_NAME_BANNER_ID)
  private String bannerId;

  public static final String SERIALIZED_NAME_PRIVACY = "privacy";
  @SerializedName(SERIALIZED_NAME_PRIVACY)
  private GroupPrivacy privacy = GroupPrivacy.DEFAULT;

  public static final String SERIALIZED_NAME_ROLE_TEMPLATE = "roleTemplate";
  @SerializedName(SERIALIZED_NAME_ROLE_TEMPLATE)
  private GroupRoleTemplate roleTemplate = GroupRoleTemplate.DEFAULT;

  public CreateGroupRequest() {
  }

  public CreateGroupRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateGroupRequest shortCode(String shortCode) {
    
    this.shortCode = shortCode;
    return this;
  }

   /**
   * Get shortCode
   * @return shortCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getShortCode() {
    return shortCode;
  }


  public void setShortCode(String shortCode) {
    this.shortCode = shortCode;
  }


  public CreateGroupRequest description(String description) {
    
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


  public CreateGroupRequest joinState(GroupJoinState joinState) {
    
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


  public CreateGroupRequest iconId(String iconId) {
    
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


  public CreateGroupRequest bannerId(String bannerId) {
    
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


  public CreateGroupRequest privacy(GroupPrivacy privacy) {
    
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


  public CreateGroupRequest roleTemplate(GroupRoleTemplate roleTemplate) {
    
    this.roleTemplate = roleTemplate;
    return this;
  }

   /**
   * Get roleTemplate
   * @return roleTemplate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GroupRoleTemplate getRoleTemplate() {
    return roleTemplate;
  }


  public void setRoleTemplate(GroupRoleTemplate roleTemplate) {
    this.roleTemplate = roleTemplate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupRequest createGroupRequest = (CreateGroupRequest) o;
    return Objects.equals(this.name, createGroupRequest.name) &&
        Objects.equals(this.shortCode, createGroupRequest.shortCode) &&
        Objects.equals(this.description, createGroupRequest.description) &&
        Objects.equals(this.joinState, createGroupRequest.joinState) &&
        Objects.equals(this.iconId, createGroupRequest.iconId) &&
        Objects.equals(this.bannerId, createGroupRequest.bannerId) &&
        Objects.equals(this.privacy, createGroupRequest.privacy) &&
        Objects.equals(this.roleTemplate, createGroupRequest.roleTemplate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, shortCode, description, joinState, iconId, bannerId, privacy, roleTemplate);
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
    sb.append("class CreateGroupRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    shortCode: ").append(toIndentedString(shortCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    joinState: ").append(toIndentedString(joinState)).append("\n");
    sb.append("    iconId: ").append(toIndentedString(iconId)).append("\n");
    sb.append("    bannerId: ").append(toIndentedString(bannerId)).append("\n");
    sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
    sb.append("    roleTemplate: ").append(toIndentedString(roleTemplate)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("shortCode");
    openapiFields.add("description");
    openapiFields.add("joinState");
    openapiFields.add("iconId");
    openapiFields.add("bannerId");
    openapiFields.add("privacy");
    openapiFields.add("roleTemplate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("shortCode");
    openapiRequiredFields.add("roleTemplate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateGroupRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateGroupRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateGroupRequest is not found in the empty JSON string", CreateGroupRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateGroupRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateGroupRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateGroupRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("shortCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shortCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shortCode").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("iconId") != null && !jsonObj.get("iconId").isJsonNull()) && !jsonObj.get("iconId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconId").toString()));
      }
      if ((jsonObj.get("bannerId") != null && !jsonObj.get("bannerId").isJsonNull()) && !jsonObj.get("bannerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bannerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bannerId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateGroupRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateGroupRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateGroupRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateGroupRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateGroupRequest>() {
           @Override
           public void write(JsonWriter out, CreateGroupRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateGroupRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateGroupRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateGroupRequest
  * @throws IOException if the JSON string is invalid with respect to CreateGroupRequest
  */
  public static CreateGroupRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateGroupRequest.class);
  }

 /**
  * Convert an instance of CreateGroupRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

