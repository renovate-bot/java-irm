/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/irm/v1alpha2/incidents_service.proto

package com.google.irm.service.v1alpha2.api;

/**
 *
 *
 * <pre>
 * Request to force a role handover.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.ForceIncidentRoleHandoverRequest}
 */
public final class ForceIncidentRoleHandoverRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.ForceIncidentRoleHandoverRequest)
    ForceIncidentRoleHandoverRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ForceIncidentRoleHandoverRequest.newBuilder() to construct.
  private ForceIncidentRoleHandoverRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ForceIncidentRoleHandoverRequest() {
    name_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ForceIncidentRoleHandoverRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              com.google.irm.service.v1alpha2.api.User.Builder subBuilder = null;
              if (newAssignee_ != null) {
                subBuilder = newAssignee_.toBuilder();
              }
              newAssignee_ =
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(newAssignee_);
                newAssignee_ = subBuilder.buildPartial();
              }

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
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_ForceIncidentRoleHandoverRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_ForceIncidentRoleHandoverRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest.class,
            com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Resource name of the role assignment.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the role assignment.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NEW_ASSIGNEE_FIELD_NUMBER = 2;
  private com.google.irm.service.v1alpha2.api.User newAssignee_;
  /**
   *
   *
   * <pre>
   * The proposed assignee, who will now be the assignee. This should not be
   * the current user; otherwise ConfirmRoleHandover should be called.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
   */
  public boolean hasNewAssignee() {
    return newAssignee_ != null;
  }
  /**
   *
   *
   * <pre>
   * The proposed assignee, who will now be the assignee. This should not be
   * the current user; otherwise ConfirmRoleHandover should be called.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
   */
  public com.google.irm.service.v1alpha2.api.User getNewAssignee() {
    return newAssignee_ == null
        ? com.google.irm.service.v1alpha2.api.User.getDefaultInstance()
        : newAssignee_;
  }
  /**
   *
   *
   * <pre>
   * The proposed assignee, who will now be the assignee. This should not be
   * the current user; otherwise ConfirmRoleHandover should be called.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
   */
  public com.google.irm.service.v1alpha2.api.UserOrBuilder getNewAssigneeOrBuilder() {
    return getNewAssignee();
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (newAssignee_ != null) {
      output.writeMessage(2, getNewAssignee());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (newAssignee_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getNewAssignee());
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest other =
        (com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasNewAssignee() != other.hasNewAssignee()) return false;
    if (hasNewAssignee()) {
      if (!getNewAssignee().equals(other.getNewAssignee())) return false;
    }
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasNewAssignee()) {
      hash = (37 * hash) + NEW_ASSIGNEE_FIELD_NUMBER;
      hash = (53 * hash) + getNewAssignee().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest prototype) {
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
   * Request to force a role handover.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.ForceIncidentRoleHandoverRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.ForceIncidentRoleHandoverRequest)
      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_ForceIncidentRoleHandoverRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_ForceIncidentRoleHandoverRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest.class,
              com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest.Builder.class);
    }

    // Construct using
    // com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest.newBuilder()
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
      name_ = "";

      if (newAssigneeBuilder_ == null) {
        newAssignee_ = null;
      } else {
        newAssignee_ = null;
        newAssigneeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_ForceIncidentRoleHandoverRequest_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
        getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest build() {
      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest buildPartial() {
      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest result =
          new com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest(this);
      result.name_ = name_;
      if (newAssigneeBuilder_ == null) {
        result.newAssignee_ = newAssignee_;
      } else {
        result.newAssignee_ = newAssigneeBuilder_.build();
      }
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
      if (other instanceof com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest) {
        return mergeFrom(
            (com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest other) {
      if (other
          == com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
              .getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasNewAssignee()) {
        mergeNewAssignee(other.getNewAssignee());
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
      com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the role assignment.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the role assignment.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the role assignment.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the role assignment.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the role assignment.
     * </pre>
     *
     * <code>string name = 1;</code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.irm.service.v1alpha2.api.User newAssignee_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.User,
            com.google.irm.service.v1alpha2.api.User.Builder,
            com.google.irm.service.v1alpha2.api.UserOrBuilder>
        newAssigneeBuilder_;
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public boolean hasNewAssignee() {
      return newAssigneeBuilder_ != null || newAssignee_ != null;
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public com.google.irm.service.v1alpha2.api.User getNewAssignee() {
      if (newAssigneeBuilder_ == null) {
        return newAssignee_ == null
            ? com.google.irm.service.v1alpha2.api.User.getDefaultInstance()
            : newAssignee_;
      } else {
        return newAssigneeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public Builder setNewAssignee(com.google.irm.service.v1alpha2.api.User value) {
      if (newAssigneeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        newAssignee_ = value;
        onChanged();
      } else {
        newAssigneeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public Builder setNewAssignee(
        com.google.irm.service.v1alpha2.api.User.Builder builderForValue) {
      if (newAssigneeBuilder_ == null) {
        newAssignee_ = builderForValue.build();
        onChanged();
      } else {
        newAssigneeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public Builder mergeNewAssignee(com.google.irm.service.v1alpha2.api.User value) {
      if (newAssigneeBuilder_ == null) {
        if (newAssignee_ != null) {
          newAssignee_ =
              com.google.irm.service.v1alpha2.api.User.newBuilder(newAssignee_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          newAssignee_ = value;
        }
        onChanged();
      } else {
        newAssigneeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public Builder clearNewAssignee() {
      if (newAssigneeBuilder_ == null) {
        newAssignee_ = null;
        onChanged();
      } else {
        newAssignee_ = null;
        newAssigneeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public com.google.irm.service.v1alpha2.api.User.Builder getNewAssigneeBuilder() {

      onChanged();
      return getNewAssigneeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    public com.google.irm.service.v1alpha2.api.UserOrBuilder getNewAssigneeOrBuilder() {
      if (newAssigneeBuilder_ != null) {
        return newAssigneeBuilder_.getMessageOrBuilder();
      } else {
        return newAssignee_ == null
            ? com.google.irm.service.v1alpha2.api.User.getDefaultInstance()
            : newAssignee_;
      }
    }
    /**
     *
     *
     * <pre>
     * The proposed assignee, who will now be the assignee. This should not be
     * the current user; otherwise ConfirmRoleHandover should be called.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User new_assignee = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.User,
            com.google.irm.service.v1alpha2.api.User.Builder,
            com.google.irm.service.v1alpha2.api.UserOrBuilder>
        getNewAssigneeFieldBuilder() {
      if (newAssigneeBuilder_ == null) {
        newAssigneeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.User,
                com.google.irm.service.v1alpha2.api.User.Builder,
                com.google.irm.service.v1alpha2.api.UserOrBuilder>(
                getNewAssignee(), getParentForChildren(), isClean());
        newAssignee_ = null;
      }
      return newAssigneeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.ForceIncidentRoleHandoverRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.ForceIncidentRoleHandoverRequest)
  private static final com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest();
  }

  public static com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ForceIncidentRoleHandoverRequest> PARSER =
      new com.google.protobuf.AbstractParser<ForceIncidentRoleHandoverRequest>() {
        @java.lang.Override
        public ForceIncidentRoleHandoverRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ForceIncidentRoleHandoverRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ForceIncidentRoleHandoverRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ForceIncidentRoleHandoverRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.ForceIncidentRoleHandoverRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
