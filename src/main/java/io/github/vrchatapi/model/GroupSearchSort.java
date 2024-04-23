/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.17.2
 * Contact: vrchatapi.lpv0t@aries.fyi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets GroupSearchSort
 */
@JsonAdapter(GroupSearchSort.Adapter.class)
public enum GroupSearchSort {
  
  ASC("joinedAt:asc"),
  
  DESC("joinedAt:desc");

  private String value;

  GroupSearchSort(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupSearchSort fromValue(String value) {
    for (GroupSearchSort b : GroupSearchSort.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GroupSearchSort> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupSearchSort enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupSearchSort read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupSearchSort.fromValue(value);
    }
  }
}

