/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.3.0
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
import java.math.BigDecimal;

/**
 * InlineObject4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InlineObject4 {
  public static final String SERIALIZED_NAME_SIGNATURE_MD5 = "signatureMd5";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_MD5)
  private String signatureMd5;

  public static final String SERIALIZED_NAME_SIGNATURE_SIZE_IN_BYTES = "signatureSizeInBytes";
  @SerializedName(SERIALIZED_NAME_SIGNATURE_SIZE_IN_BYTES)
  private BigDecimal signatureSizeInBytes;

  public static final String SERIALIZED_NAME_FILE_MD5 = "fileMd5";
  @SerializedName(SERIALIZED_NAME_FILE_MD5)
  private String fileMd5;

  public static final String SERIALIZED_NAME_FILE_SIZE_IN_BYTES = "fileSizeInBytes";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE_IN_BYTES)
  private BigDecimal fileSizeInBytes;


  public InlineObject4 signatureMd5(String signatureMd5) {
    
    this.signatureMd5 = signatureMd5;
    return this;
  }

   /**
   * Get signatureMd5
   * @return signatureMd5
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSignatureMd5() {
    return signatureMd5;
  }


  public void setSignatureMd5(String signatureMd5) {
    this.signatureMd5 = signatureMd5;
  }


  public InlineObject4 signatureSizeInBytes(BigDecimal signatureSizeInBytes) {
    
    this.signatureSizeInBytes = signatureSizeInBytes;
    return this;
  }

   /**
   * Get signatureSizeInBytes
   * @return signatureSizeInBytes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getSignatureSizeInBytes() {
    return signatureSizeInBytes;
  }


  public void setSignatureSizeInBytes(BigDecimal signatureSizeInBytes) {
    this.signatureSizeInBytes = signatureSizeInBytes;
  }


  public InlineObject4 fileMd5(String fileMd5) {
    
    this.fileMd5 = fileMd5;
    return this;
  }

   /**
   * Get fileMd5
   * @return fileMd5
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFileMd5() {
    return fileMd5;
  }


  public void setFileMd5(String fileMd5) {
    this.fileMd5 = fileMd5;
  }


  public InlineObject4 fileSizeInBytes(BigDecimal fileSizeInBytes) {
    
    this.fileSizeInBytes = fileSizeInBytes;
    return this;
  }

   /**
   * Get fileSizeInBytes
   * @return fileSizeInBytes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getFileSizeInBytes() {
    return fileSizeInBytes;
  }


  public void setFileSizeInBytes(BigDecimal fileSizeInBytes) {
    this.fileSizeInBytes = fileSizeInBytes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(this.signatureMd5, inlineObject4.signatureMd5) &&
        Objects.equals(this.signatureSizeInBytes, inlineObject4.signatureSizeInBytes) &&
        Objects.equals(this.fileMd5, inlineObject4.fileMd5) &&
        Objects.equals(this.fileSizeInBytes, inlineObject4.fileSizeInBytes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureMd5, signatureSizeInBytes, fileMd5, fileSizeInBytes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    sb.append("    signatureMd5: ").append(toIndentedString(signatureMd5)).append("\n");
    sb.append("    signatureSizeInBytes: ").append(toIndentedString(signatureSizeInBytes)).append("\n");
    sb.append("    fileMd5: ").append(toIndentedString(fileMd5)).append("\n");
    sb.append("    fileSizeInBytes: ").append(toIndentedString(fileSizeInBytes)).append("\n");
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

