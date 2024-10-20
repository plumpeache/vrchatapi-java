/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.6
 * Contact: vrchatapi.lpv0t@aries.fyi
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
import io.github.vrchatapi.model.SubscriptionPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

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
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Subscription {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_STEAM_ITEM_ID = "steamItemId";
  @SerializedName(SERIALIZED_NAME_STEAM_ITEM_ID)
  private String steamItemId;

  public static final String SERIALIZED_NAME_OCULUS_SKU = "oculusSku";
  @SerializedName(SERIALIZED_NAME_OCULUS_SKU)
  private String oculusSku;

  public static final String SERIALIZED_NAME_GOOGLE_PRODUCT_ID = "googleProductId";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PRODUCT_ID)
  private String googleProductId;

  public static final String SERIALIZED_NAME_GOOGLE_PLAN_ID = "googlePlanId";
  @SerializedName(SERIALIZED_NAME_GOOGLE_PLAN_ID)
  private String googlePlanId;

  public static final String SERIALIZED_NAME_PICO_SKU = "picoSku";
  @SerializedName(SERIALIZED_NAME_PICO_SKU)
  private String picoSku;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private SubscriptionPeriod period = SubscriptionPeriod.MONTH;

  public static final String SERIALIZED_NAME_TIER = "tier";
  @SerializedName(SERIALIZED_NAME_TIER)
  private Integer tier;

  public Subscription() {
  }

  public Subscription id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Subscription steamItemId(String steamItemId) {
    
    this.steamItemId = steamItemId;
    return this;
  }

   /**
   * Get steamItemId
   * @return steamItemId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getSteamItemId() {
    return steamItemId;
  }


  public void setSteamItemId(String steamItemId) {
    this.steamItemId = steamItemId;
  }


  public Subscription oculusSku(String oculusSku) {
    
    this.oculusSku = oculusSku;
    return this;
  }

   /**
   * Get oculusSku
   * @return oculusSku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOculusSku() {
    return oculusSku;
  }


  public void setOculusSku(String oculusSku) {
    this.oculusSku = oculusSku;
  }


  public Subscription googleProductId(String googleProductId) {
    
    this.googleProductId = googleProductId;
    return this;
  }

   /**
   * Get googleProductId
   * @return googleProductId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGoogleProductId() {
    return googleProductId;
  }


  public void setGoogleProductId(String googleProductId) {
    this.googleProductId = googleProductId;
  }


  public Subscription googlePlanId(String googlePlanId) {
    
    this.googlePlanId = googlePlanId;
    return this;
  }

   /**
   * Get googlePlanId
   * @return googlePlanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGooglePlanId() {
    return googlePlanId;
  }


  public void setGooglePlanId(String googlePlanId) {
    this.googlePlanId = googlePlanId;
  }


  public Subscription picoSku(String picoSku) {
    
    this.picoSku = picoSku;
    return this;
  }

   /**
   * Get picoSku
   * @return picoSku
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPicoSku() {
    return picoSku;
  }


  public void setPicoSku(String picoSku) {
    this.picoSku = picoSku;
  }


  public Subscription amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public Subscription description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Subscription period(SubscriptionPeriod period) {
    
    this.period = period;
    return this;
  }

   /**
   * Get period
   * @return period
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public SubscriptionPeriod getPeriod() {
    return period;
  }


  public void setPeriod(SubscriptionPeriod period) {
    this.period = period;
  }


  public Subscription tier(Integer tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTier() {
    return tier;
  }


  public void setTier(Integer tier) {
    this.tier = tier;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Subscription subscription = (Subscription) o;
    return Objects.equals(this.id, subscription.id) &&
        Objects.equals(this.steamItemId, subscription.steamItemId) &&
        Objects.equals(this.oculusSku, subscription.oculusSku) &&
        Objects.equals(this.googleProductId, subscription.googleProductId) &&
        Objects.equals(this.googlePlanId, subscription.googlePlanId) &&
        Objects.equals(this.picoSku, subscription.picoSku) &&
        Objects.equals(this.amount, subscription.amount) &&
        Objects.equals(this.description, subscription.description) &&
        Objects.equals(this.period, subscription.period) &&
        Objects.equals(this.tier, subscription.tier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, steamItemId, oculusSku, googleProductId, googlePlanId, picoSku, amount, description, period, tier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Subscription {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    steamItemId: ").append(toIndentedString(steamItemId)).append("\n");
    sb.append("    oculusSku: ").append(toIndentedString(oculusSku)).append("\n");
    sb.append("    googleProductId: ").append(toIndentedString(googleProductId)).append("\n");
    sb.append("    googlePlanId: ").append(toIndentedString(googlePlanId)).append("\n");
    sb.append("    picoSku: ").append(toIndentedString(picoSku)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("steamItemId");
    openapiFields.add("oculusSku");
    openapiFields.add("googleProductId");
    openapiFields.add("googlePlanId");
    openapiFields.add("picoSku");
    openapiFields.add("amount");
    openapiFields.add("description");
    openapiFields.add("period");
    openapiFields.add("tier");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("steamItemId");
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("period");
    openapiRequiredFields.add("tier");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Subscription
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Subscription.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Subscription is not found in the empty JSON string", Subscription.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Subscription.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Subscription` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Subscription.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("steamItemId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `steamItemId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("steamItemId").toString()));
      }
      if ((jsonObj.get("oculusSku") != null && !jsonObj.get("oculusSku").isJsonNull()) && !jsonObj.get("oculusSku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `oculusSku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("oculusSku").toString()));
      }
      if ((jsonObj.get("googleProductId") != null && !jsonObj.get("googleProductId").isJsonNull()) && !jsonObj.get("googleProductId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googleProductId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googleProductId").toString()));
      }
      if ((jsonObj.get("googlePlanId") != null && !jsonObj.get("googlePlanId").isJsonNull()) && !jsonObj.get("googlePlanId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `googlePlanId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("googlePlanId").toString()));
      }
      if ((jsonObj.get("picoSku") != null && !jsonObj.get("picoSku").isJsonNull()) && !jsonObj.get("picoSku").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `picoSku` to be a primitive type in the JSON string but got `%s`", jsonObj.get("picoSku").toString()));
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Subscription.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Subscription' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Subscription> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Subscription.class));

       return (TypeAdapter<T>) new TypeAdapter<Subscription>() {
           @Override
           public void write(JsonWriter out, Subscription value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Subscription read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Subscription given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Subscription
  * @throws IOException if the JSON string is invalid with respect to Subscription
  */
  public static Subscription fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Subscription.class);
  }

 /**
  * Convert an instance of Subscription to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

