/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.18.9
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
 * Gets or Sets GroupPermissions
 */
@JsonAdapter(GroupPermissions.Adapter.class)
public enum GroupPermissions {
  
  group_all("*"),
  
  group_announcement_manage("group-announcement-manage"),
  
  group_audit_view("group-audit-view"),
  
  group_bans_manage("group-bans-manage"),
  
  group_data_manage("group-data-manage"),
  
  group_default_role_manage("group-default-role-manage"),
  
  group_galleries_manage("group-galleries-manage"),
  
  group_instance_age_gated_create("group-instance-age-gated-create"),
  
  group_instance_join("group-instance-join"),
  
  group_instance_manage("group-instance-manage"),
  
  group_instance_moderate("group-instance-moderate"),
  
  group_instance_open_create("group-instance-open-create"),
  
  group_instance_plus_create("group-instance-plus-create"),
  
  group_instance_plus_portal("group-instance-plus-portal"),
  
  group_instance_plus_portal_unlocked("group-instance-plus-portal-unlocked"),
  
  group_instance_public_create("group-instance-public-create"),
  
  group_instance_queue_priority("group-instance-queue-priority"),
  
  group_instance_restricted_create("group-instance-restricted-create"),
  
  group_invites_manage("group-invites-manage"),
  
  group_members_manage("group-members-manage"),
  
  group_members_remove("group-members-remove"),
  
  group_members_viewall("group-members-viewall"),
  
  group_roles_assign("group-roles-assign"),
  
  group_roles_manage("group-roles-manage");

  private String value;

  GroupPermissions(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static GroupPermissions fromValue(String value) {
    for (GroupPermissions b : GroupPermissions.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<GroupPermissions> {
    @Override
    public void write(final JsonWriter jsonWriter, final GroupPermissions enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public GroupPermissions read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return GroupPermissions.fromValue(value);
    }
  }
}

