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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * \&quot;none\&quot; User is a normal user \&quot;trusted\&quot; Unknown \&quot;internal\&quot; Is a VRChat Developer \&quot;moderator\&quot; Is a VRChat Moderator  Staff can hide their developerType at will.
 */
@JsonAdapter(DeveloperType.Adapter.class)
public enum DeveloperType {
  
  NONE("none"),
  
  TRUSTED("trusted"),
  
  INTERNAL("internal"),
  
  MODERATOR("moderator");

  private String value;

  DeveloperType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static DeveloperType fromValue(String value) {
    for (DeveloperType b : DeveloperType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<DeveloperType> {
    @Override
    public void write(final JsonWriter jsonWriter, final DeveloperType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public DeveloperType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return DeveloperType.fromValue(value);
    }
  }
}

