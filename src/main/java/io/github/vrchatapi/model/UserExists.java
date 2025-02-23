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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Status object representing if a queried user by username or userId exists or not. This model is primarily used by the &#x60;/auth/exists&#x60; endpoint, which in turn is used during registration. Please see the documentation on that endpoint for more information on usage.
 */
@ApiModel(description = "Status object representing if a queried user by username or userId exists or not. This model is primarily used by the `/auth/exists` endpoint, which in turn is used during registration. Please see the documentation on that endpoint for more information on usage.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserExists {
  public static final String SERIALIZED_NAME_USER_EXISTS = "userExists";
  @SerializedName(SERIALIZED_NAME_USER_EXISTS)
  private Boolean userExists = false;


  public UserExists userExists(Boolean userExists) {
    
    this.userExists = userExists;
    return this;
  }

   /**
   * Status if a user exist with that username or userId.
   * @return userExists
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status if a user exist with that username or userId.")

  public Boolean getUserExists() {
    return userExists;
  }


  public void setUserExists(Boolean userExists) {
    this.userExists = userExists;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserExists userExists = (UserExists) o;
    return Objects.equals(this.userExists, userExists.userExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExists {\n");
    sb.append("    userExists: ").append(toIndentedString(userExists)).append("\n");
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

