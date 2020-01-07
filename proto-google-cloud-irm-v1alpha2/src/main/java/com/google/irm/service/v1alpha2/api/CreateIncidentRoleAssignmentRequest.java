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
 * Request for creating a role assignment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest}
 */
public final class CreateIncidentRoleAssignmentRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest)
    CreateIncidentRoleAssignmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateIncidentRoleAssignmentRequest.newBuilder() to construct.
  private CreateIncidentRoleAssignmentRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateIncidentRoleAssignmentRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateIncidentRoleAssignmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateIncidentRoleAssignmentRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.Builder subBuilder = null;
              if (incidentRoleAssignment_ != null) {
                subBuilder = incidentRoleAssignment_.toBuilder();
              }
              incidentRoleAssignment_ =
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(incidentRoleAssignment_);
                incidentRoleAssignment_ = subBuilder.buildPartial();
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
        .internal_static_google_cloud_irm_v1alpha2_CreateIncidentRoleAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_CreateIncidentRoleAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest.class,
            com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Resource name of the incident, for example,
   * "projects/{project_id}/incidents/{incident_id}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Resource name of the incident, for example,
   * "projects/{project_id}/incidents/{incident_id}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INCIDENT_ROLE_ASSIGNMENT_FIELD_NUMBER = 2;
  private com.google.irm.service.v1alpha2.api.IncidentRoleAssignment incidentRoleAssignment_;
  /**
   *
   *
   * <pre>
   * Role assignment to create.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
   *
   * @return Whether the incidentRoleAssignment field is set.
   */
  public boolean hasIncidentRoleAssignment() {
    return incidentRoleAssignment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Role assignment to create.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
   *
   * @return The incidentRoleAssignment.
   */
  public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment getIncidentRoleAssignment() {
    return incidentRoleAssignment_ == null
        ? com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.getDefaultInstance()
        : incidentRoleAssignment_;
  }
  /**
   *
   *
   * <pre>
   * Role assignment to create.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
   */
  public com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder
      getIncidentRoleAssignmentOrBuilder() {
    return getIncidentRoleAssignment();
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (incidentRoleAssignment_ != null) {
      output.writeMessage(2, getIncidentRoleAssignment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (incidentRoleAssignment_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getIncidentRoleAssignment());
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest other =
        (com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasIncidentRoleAssignment() != other.hasIncidentRoleAssignment()) return false;
    if (hasIncidentRoleAssignment()) {
      if (!getIncidentRoleAssignment().equals(other.getIncidentRoleAssignment())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasIncidentRoleAssignment()) {
      hash = (37 * hash) + INCIDENT_ROLE_ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getIncidentRoleAssignment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parseFrom(
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
      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest prototype) {
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
   * Request for creating a role assignment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest)
      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_CreateIncidentRoleAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_CreateIncidentRoleAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest.class,
              com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest.newBuilder()
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
      parent_ = "";

      if (incidentRoleAssignmentBuilder_ == null) {
        incidentRoleAssignment_ = null;
      } else {
        incidentRoleAssignment_ = null;
        incidentRoleAssignmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_CreateIncidentRoleAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
        getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest build() {
      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest buildPartial() {
      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest result =
          new com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest(this);
      result.parent_ = parent_;
      if (incidentRoleAssignmentBuilder_ == null) {
        result.incidentRoleAssignment_ = incidentRoleAssignment_;
      } else {
        result.incidentRoleAssignment_ = incidentRoleAssignmentBuilder_.build();
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
      if (other
          instanceof com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest) {
        return mergeFrom(
            (com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest other) {
      if (other
          == com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasIncidentRoleAssignment()) {
        mergeIncidentRoleAssignment(other.getIncidentRoleAssignment());
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
      com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Resource name of the incident, for example,
     * "projects/{project_id}/incidents/{incident_id}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the incident, for example,
     * "projects/{project_id}/incidents/{incident_id}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Resource name of the incident, for example,
     * "projects/{project_id}/incidents/{incident_id}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the incident, for example,
     * "projects/{project_id}/incidents/{incident_id}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Resource name of the incident, for example,
     * "projects/{project_id}/incidents/{incident_id}".
     * </pre>
     *
     * <code>string parent = 1;</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.irm.service.v1alpha2.api.IncidentRoleAssignment incidentRoleAssignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.Builder,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder>
        incidentRoleAssignmentBuilder_;
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     *
     * @return Whether the incidentRoleAssignment field is set.
     */
    public boolean hasIncidentRoleAssignment() {
      return incidentRoleAssignmentBuilder_ != null || incidentRoleAssignment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     *
     * @return The incidentRoleAssignment.
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment getIncidentRoleAssignment() {
      if (incidentRoleAssignmentBuilder_ == null) {
        return incidentRoleAssignment_ == null
            ? com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.getDefaultInstance()
            : incidentRoleAssignment_;
      } else {
        return incidentRoleAssignmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    public Builder setIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.IncidentRoleAssignment value) {
      if (incidentRoleAssignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        incidentRoleAssignment_ = value;
        onChanged();
      } else {
        incidentRoleAssignmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    public Builder setIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.Builder builderForValue) {
      if (incidentRoleAssignmentBuilder_ == null) {
        incidentRoleAssignment_ = builderForValue.build();
        onChanged();
      } else {
        incidentRoleAssignmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    public Builder mergeIncidentRoleAssignment(
        com.google.irm.service.v1alpha2.api.IncidentRoleAssignment value) {
      if (incidentRoleAssignmentBuilder_ == null) {
        if (incidentRoleAssignment_ != null) {
          incidentRoleAssignment_ =
              com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.newBuilder(
                      incidentRoleAssignment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          incidentRoleAssignment_ = value;
        }
        onChanged();
      } else {
        incidentRoleAssignmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    public Builder clearIncidentRoleAssignment() {
      if (incidentRoleAssignmentBuilder_ == null) {
        incidentRoleAssignment_ = null;
        onChanged();
      } else {
        incidentRoleAssignment_ = null;
        incidentRoleAssignmentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.Builder
        getIncidentRoleAssignmentBuilder() {

      onChanged();
      return getIncidentRoleAssignmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    public com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder
        getIncidentRoleAssignmentOrBuilder() {
      if (incidentRoleAssignmentBuilder_ != null) {
        return incidentRoleAssignmentBuilder_.getMessageOrBuilder();
      } else {
        return incidentRoleAssignment_ == null
            ? com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.getDefaultInstance()
            : incidentRoleAssignment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Role assignment to create.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.Builder,
            com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder>
        getIncidentRoleAssignmentFieldBuilder() {
      if (incidentRoleAssignmentBuilder_ == null) {
        incidentRoleAssignmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.IncidentRoleAssignment,
                com.google.irm.service.v1alpha2.api.IncidentRoleAssignment.Builder,
                com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder>(
                getIncidentRoleAssignment(), getParentForChildren(), isClean());
        incidentRoleAssignment_ = null;
      }
      return incidentRoleAssignmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest)
  private static final com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest();
  }

  public static com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateIncidentRoleAssignmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateIncidentRoleAssignmentRequest>() {
        @java.lang.Override
        public CreateIncidentRoleAssignmentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateIncidentRoleAssignmentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateIncidentRoleAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateIncidentRoleAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.CreateIncidentRoleAssignmentRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
