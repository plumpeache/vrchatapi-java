/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.4
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
 * Gets or Sets OrderOption
 */
@JsonAdapter(OrderOption.Adapter.class)
public enum OrderOption {
  
  ASCENDING("ascending"),
  
  DESCENDING("descending");

  private String value;

  OrderOption(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderOption fromValue(String value) {
    for (OrderOption b : OrderOption.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<OrderOption> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderOption enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderOption read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderOption.fromValue(value);
    }
  }
}

