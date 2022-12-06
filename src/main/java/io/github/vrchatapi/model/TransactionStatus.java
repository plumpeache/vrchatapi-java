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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets TransactionStatus
 */
@JsonAdapter(TransactionStatus.Adapter.class)
public enum TransactionStatus {
  
  ACTIVE("active"),
  
  FAILED("failed"),
  
  EXPIRED("expired"),
  
  CHARGEBACK("chargeback");

  private String value;

  TransactionStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionStatus fromValue(String value) {
    for (TransactionStatus b : TransactionStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<TransactionStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionStatus.fromValue(value);
    }
  }
}

