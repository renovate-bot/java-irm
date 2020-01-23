/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/irm/v1alpha2/incidents.proto

package com.google.irm.service.v1alpha2.api;

/**
 *
 *
 * <pre>
 * Describes a role that can be assigned to an incident.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.IncidentRole}
 */
public final class IncidentRole extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.IncidentRole)
    IncidentRoleOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use IncidentRole.newBuilder() to construct.
  private IncidentRole(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IncidentRole() {
    type_ = 0;
    title_ = "";
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IncidentRole();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private IncidentRole(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              title_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              description_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.irm.service.v1alpha2.api.Incidents
        .internal_static_google_cloud_irm_v1alpha2_IncidentRole_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.Incidents
        .internal_static_google_cloud_irm_v1alpha2_IncidentRole_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.IncidentRole.class,
            com.google.irm.service.v1alpha2.api.IncidentRole.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * List of possible roles.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.irm.v1alpha2.IncidentRole.Type}
   */
  public enum Type implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The role is unspecified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Incident Commander: Manages response plan, near-term and long-term
     * objectives, establishes priorities, and delegates tasks as needed.
     * </pre>
     *
     * <code>TYPE_INCIDENT_COMMANDER = 1;</code>
     */
    TYPE_INCIDENT_COMMANDER(1),
    /**
     *
     *
     * <pre>
     * Communications Lead: Keeps everybody outside and within the response team
     * informed.
     * </pre>
     *
     * <code>TYPE_COMMUNICATIONS_LEAD = 2;</code>
     */
    TYPE_COMMUNICATIONS_LEAD(2),
    /**
     *
     *
     * <pre>
     * Operations Lead: Figures out what to do, and gets it done.
     * </pre>
     *
     * <code>TYPE_OPERATIONS_LEAD = 3;</code>
     */
    TYPE_OPERATIONS_LEAD(3),
    /**
     *
     *
     * <pre>
     * External Customer Communications Lead: Responsible for communicating
     * incident details to customers/public.
     * </pre>
     *
     * <code>TYPE_EXTERNAL_CUSTOMER_COMMUNICATIONS_LEAD = 4;</code>
     */
    TYPE_EXTERNAL_CUSTOMER_COMMUNICATIONS_LEAD(4),
    /**
     *
     *
     * <pre>
     * Primary Oncall: Responds to the initial page and handles all
     * responsibilities for pre-escalated incidents.
     * </pre>
     *
     * <code>TYPE_PRIMARY_ONCALL = 5;</code>
     */
    TYPE_PRIMARY_ONCALL(5),
    /**
     *
     *
     * <pre>
     * Secondary Oncall: Helps the primary oncall if necessary; mostly useful
     * for pre-escalated incidents.
     * </pre>
     *
     * <code>TYPE_SECONDARY_ONCALL = 6;</code>
     */
    TYPE_SECONDARY_ONCALL(6),
    /**
     *
     *
     * <pre>
     * User-specified roles. One example is a Planning Lead, who keeps track of
     * the incident. Another is an assistant Incident Commander.
     * </pre>
     *
     * <code>TYPE_OTHER = 7;</code>
     */
    TYPE_OTHER(7),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The role is unspecified.
     * </pre>
     *
     * <code>TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Incident Commander: Manages response plan, near-term and long-term
     * objectives, establishes priorities, and delegates tasks as needed.
     * </pre>
     *
     * <code>TYPE_INCIDENT_COMMANDER = 1;</code>
     */
    public static final int TYPE_INCIDENT_COMMANDER_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Communications Lead: Keeps everybody outside and within the response team
     * informed.
     * </pre>
     *
     * <code>TYPE_COMMUNICATIONS_LEAD = 2;</code>
     */
    public static final int TYPE_COMMUNICATIONS_LEAD_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Operations Lead: Figures out what to do, and gets it done.
     * </pre>
     *
     * <code>TYPE_OPERATIONS_LEAD = 3;</code>
     */
    public static final int TYPE_OPERATIONS_LEAD_VALUE = 3;
    /**
     *
     *
     * <pre>
     * External Customer Communications Lead: Responsible for communicating
     * incident details to customers/public.
     * </pre>
     *
     * <code>TYPE_EXTERNAL_CUSTOMER_COMMUNICATIONS_LEAD = 4;</code>
     */
    public static final int TYPE_EXTERNAL_CUSTOMER_COMMUNICATIONS_LEAD_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Primary Oncall: Responds to the initial page and handles all
     * responsibilities for pre-escalated incidents.
     * </pre>
     *
     * <code>TYPE_PRIMARY_ONCALL = 5;</code>
     */
    public static final int TYPE_PRIMARY_ONCALL_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Secondary Oncall: Helps the primary oncall if necessary; mostly useful
     * for pre-escalated incidents.
     * </pre>
     *
     * <code>TYPE_SECONDARY_ONCALL = 6;</code>
     */
    public static final int TYPE_SECONDARY_ONCALL_VALUE = 6;
    /**
     *
     *
     * <pre>
     * User-specified roles. One example is a Planning Lead, who keeps track of
     * the incident. Another is an assistant Incident Commander.
     * </pre>
     *
     * <code>TYPE_OTHER = 7;</code>
     */
    public static final int TYPE_OTHER_VALUE = 7;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Type valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Type forNumber(int value) {
      switch (value) {
        case 0:
          return TYPE_UNSPECIFIED;
        case 1:
          return TYPE_INCIDENT_COMMANDER;
        case 2:
          return TYPE_COMMUNICATIONS_LEAD;
        case 3:
          return TYPE_OPERATIONS_LEAD;
        case 4:
          return TYPE_EXTERNAL_CUSTOMER_COMMUNICATIONS_LEAD;
        case 5:
          return TYPE_PRIMARY_ONCALL;
        case 6:
          return TYPE_SECONDARY_ONCALL;
        case 7:
          return TYPE_OTHER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Type> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Type> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Type>() {
          public Type findValueByNumber(int number) {
            return Type.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentRole.getDescriptor().getEnumTypes().get(0);
    }

    private static final Type[] VALUES = values();

    public static Type valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Type(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.irm.v1alpha2.IncidentRole.Type)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   *
   *
   * <pre>
   * The type of role. The role type is immutable in role assignments. Each role
   * type can only be used once per incident, except for TYPE_OTHER.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The type of role. The role type is immutable in role assignments. Each role
   * type can only be used once per incident, except for TYPE_OTHER.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
   *
   * @return The type.
   */
  public com.google.irm.service.v1alpha2.api.IncidentRole.Type getType() {
    @SuppressWarnings("deprecation")
    com.google.irm.service.v1alpha2.api.IncidentRole.Type result =
        com.google.irm.service.v1alpha2.api.IncidentRole.Type.valueOf(type_);
    return result == null
        ? com.google.irm.service.v1alpha2.api.IncidentRole.Type.UNRECOGNIZED
        : result;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
   * must be unique within an incident.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
   * must be unique within an incident.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  public com.google.protobuf.ByteString getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  private volatile java.lang.Object description_;
  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Description of the role.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only unless TYPE_OTHER is used. Description of the role.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (type_
        != com.google.irm.service.v1alpha2.api.IncidentRole.Type.TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, description_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.irm.service.v1alpha2.api.IncidentRole.Type.TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!getDescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, description_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.IncidentRole)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.IncidentRole other =
        (com.google.irm.service.v1alpha2.api.IncidentRole) obj;

    if (type_ != other.type_) return false;
    if (!getTitle().equals(other.getTitle())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.irm.service.v1alpha2.api.IncidentRole prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Describes a role that can be assigned to an incident.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.IncidentRole}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.IncidentRole)
      com.google.irm.service.v1alpha2.api.IncidentRoleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_IncidentRole_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_IncidentRole_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.IncidentRole.class,
              com.google.irm.service.v1alpha2.api.IncidentRole.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.IncidentRole.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      type_ = 0;

      title_ = "";

      description_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_IncidentRole_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.IncidentRole getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.IncidentRole.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.IncidentRole build() {
      com.google.irm.service.v1alpha2.api.IncidentRole result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.IncidentRole buildPartial() {
      com.google.irm.service.v1alpha2.api.IncidentRole result =
          new com.google.irm.service.v1alpha2.api.IncidentRole(this);
      result.type_ = type_;
      result.title_ = title_;
      result.description_ = description_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.irm.service.v1alpha2.api.IncidentRole) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.IncidentRole) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.IncidentRole other) {
      if (other == com.google.irm.service.v1alpha2.api.IncidentRole.getDefaultInstance())
        return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.irm.service.v1alpha2.api.IncidentRole parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.irm.service.v1alpha2.api.IncidentRole) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The type of role. The role type is immutable in role assignments. Each role
     * type can only be used once per incident, except for TYPE_OTHER.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
     *
     * @return The enum numeric value on the wire for type.
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The type of role. The role type is immutable in role assignments. Each role
     * type can only be used once per incident, except for TYPE_OTHER.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
     *
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of role. The role type is immutable in role assignments. Each role
     * type can only be used once per incident, except for TYPE_OTHER.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
     *
     * @return The type.
     */
    public com.google.irm.service.v1alpha2.api.IncidentRole.Type getType() {
      @SuppressWarnings("deprecation")
      com.google.irm.service.v1alpha2.api.IncidentRole.Type result =
          com.google.irm.service.v1alpha2.api.IncidentRole.Type.valueOf(type_);
      return result == null
          ? com.google.irm.service.v1alpha2.api.IncidentRole.Type.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of role. The role type is immutable in role assignments. Each role
     * type can only be used once per incident, except for TYPE_OTHER.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.google.irm.service.v1alpha2.api.IncidentRole.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of role. The role type is immutable in role assignments. Each role
     * type can only be used once per incident, except for TYPE_OTHER.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRole.Type type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
     * must be unique within an incident.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
     * must be unique within an incident.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
     * must be unique within an incident.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      title_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
     * must be unique within an incident.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTitle() {

      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Title of the role. For TYPE_OTHER,
     * must be unique within an incident.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Description of the role.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Description of the role.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Description of the role.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      description_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Description of the role.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {

      description_ = getDefaultInstance().getDescription();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only unless TYPE_OTHER is used. Description of the role.
     * </pre>
     *
     * <code>string description = 3;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      description_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.IncidentRole)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.IncidentRole)
  private static final com.google.irm.service.v1alpha2.api.IncidentRole DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.IncidentRole();
  }

  public static com.google.irm.service.v1alpha2.api.IncidentRole getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IncidentRole> PARSER =
      new com.google.protobuf.AbstractParser<IncidentRole>() {
        @java.lang.Override
        public IncidentRole parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new IncidentRole(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<IncidentRole> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IncidentRole> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.IncidentRole getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
