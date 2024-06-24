/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.6
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * * \&quot;online\&quot; User is online in VRChat * \&quot;active\&quot; User is online, but not in VRChat * \&quot;offline\&quot; User is offline  Always offline when returned through &#x60;getCurrentUser&#x60; (/auth/user).
 */
@JsonAdapter(UserState.Adapter.class)
public enum UserState {
  
  OFFLINE("offline"),
  
  ACTIVE("active"),
  
  ONLINE("online");

  private String value;

  UserState(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static UserState fromValue(String value) {
    for (UserState b : UserState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<UserState> {
    @Override
    public void write(final JsonWriter jsonWriter, final UserState enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public UserState read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return UserState.fromValue(value);
    }
  }
}

