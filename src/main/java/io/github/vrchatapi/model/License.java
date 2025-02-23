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
import io.github.vrchatapi.model.LicenseAction;
import io.github.vrchatapi.model.LicenseType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * License
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class License {
  public static final String SERIALIZED_NAME_FOR_ID = "forId";
  @SerializedName(SERIALIZED_NAME_FOR_ID)
  private String forId;

  public static final String SERIALIZED_NAME_FOR_TYPE = "forType";
  @SerializedName(SERIALIZED_NAME_FOR_TYPE)
  private LicenseType forType = LicenseType.PERMISSION;

  public static final String SERIALIZED_NAME_FOR_NAME = "forName";
  @SerializedName(SERIALIZED_NAME_FOR_NAME)
  private String forName;

  public static final String SERIALIZED_NAME_FOR_ACTION = "forAction";
  @SerializedName(SERIALIZED_NAME_FOR_ACTION)
  private LicenseAction forAction = LicenseAction.HAVE;


  public License forId(String forId) {
    
    this.forId = forId;
    return this;
  }

   /**
   * Either a AvatarID, LicenseGroupID, PermissionID or ProductID. This depends on the &#x60;forType&#x60; field.
   * @return forId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Either a AvatarID, LicenseGroupID, PermissionID or ProductID. This depends on the `forType` field.")

  public String getForId() {
    return forId;
  }


  public void setForId(String forId) {
    this.forId = forId;
  }


  public License forType(LicenseType forType) {
    
    this.forType = forType;
    return this;
  }

   /**
   * Get forType
   * @return forType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LicenseType getForType() {
    return forType;
  }


  public void setForType(LicenseType forType) {
    this.forType = forType;
  }


  public License forName(String forName) {
    
    this.forName = forName;
    return this;
  }

   /**
   * Get forName
   * @return forName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getForName() {
    return forName;
  }


  public void setForName(String forName) {
    this.forName = forName;
  }


  public License forAction(LicenseAction forAction) {
    
    this.forAction = forAction;
    return this;
  }

   /**
   * Get forAction
   * @return forAction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public LicenseAction getForAction() {
    return forAction;
  }


  public void setForAction(LicenseAction forAction) {
    this.forAction = forAction;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    License license = (License) o;
    return Objects.equals(this.forId, license.forId) &&
        Objects.equals(this.forType, license.forType) &&
        Objects.equals(this.forName, license.forName) &&
        Objects.equals(this.forAction, license.forAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forId, forType, forName, forAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class License {\n");
    sb.append("    forId: ").append(toIndentedString(forId)).append("\n");
    sb.append("    forType: ").append(toIndentedString(forType)).append("\n");
    sb.append("    forName: ").append(toIndentedString(forName)).append("\n");
    sb.append("    forAction: ").append(toIndentedString(forAction)).append("\n");
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

