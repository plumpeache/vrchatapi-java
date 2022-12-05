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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets FavoriteGroupVisibility
 */
@JsonAdapter(FavoriteGroupVisibility.Adapter.class)
public enum FavoriteGroupVisibility {
  
  PRIVATE("private"),
  
  FRIENDS("friends"),
  
  PUBLIC("public");

  private String value;

  FavoriteGroupVisibility(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static FavoriteGroupVisibility fromValue(String value) {
    for (FavoriteGroupVisibility b : FavoriteGroupVisibility.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<FavoriteGroupVisibility> {
    @Override
    public void write(final JsonWriter jsonWriter, final FavoriteGroupVisibility enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public FavoriteGroupVisibility read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return FavoriteGroupVisibility.fromValue(value);
    }
  }
}

