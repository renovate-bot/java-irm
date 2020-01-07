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
 * Response for the ListArtifacts method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.ListArtifactsResponse}
 */
public final class ListArtifactsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.ListArtifactsResponse)
    ListArtifactsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListArtifactsResponse.newBuilder() to construct.
  private ListArtifactsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListArtifactsResponse() {
    artifacts_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListArtifactsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListArtifactsResponse(
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
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                artifacts_ =
                    new java.util.ArrayList<com.google.irm.service.v1alpha2.api.Artifact>();
                mutable_bitField0_ |= 0x00000001;
              }
              artifacts_.add(
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.Artifact.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        artifacts_ = java.util.Collections.unmodifiableList(artifacts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_ListArtifactsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.IncidentsService
        .internal_static_google_cloud_irm_v1alpha2_ListArtifactsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.ListArtifactsResponse.class,
            com.google.irm.service.v1alpha2.api.ListArtifactsResponse.Builder.class);
  }

  public static final int ARTIFACTS_FIELD_NUMBER = 1;
  private java.util.List<com.google.irm.service.v1alpha2.api.Artifact> artifacts_;
  /**
   *
   *
   * <pre>
   * List of artifacts.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
   */
  public java.util.List<com.google.irm.service.v1alpha2.api.Artifact> getArtifactsList() {
    return artifacts_;
  }
  /**
   *
   *
   * <pre>
   * List of artifacts.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
   */
  public java.util.List<? extends com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
      getArtifactsOrBuilderList() {
    return artifacts_;
  }
  /**
   *
   *
   * <pre>
   * List of artifacts.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
   */
  public int getArtifactsCount() {
    return artifacts_.size();
  }
  /**
   *
   *
   * <pre>
   * List of artifacts.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.Artifact getArtifacts(int index) {
    return artifacts_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of artifacts.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
   */
  public com.google.irm.service.v1alpha2.api.ArtifactOrBuilder getArtifactsOrBuilder(int index) {
    return artifacts_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of artifacts.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Page token to fetch the next set of artifacts.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < artifacts_.size(); i++) {
      output.writeMessage(1, artifacts_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < artifacts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, artifacts_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.ListArtifactsResponse)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.ListArtifactsResponse other =
        (com.google.irm.service.v1alpha2.api.ListArtifactsResponse) obj;

    if (!getArtifactsList().equals(other.getArtifactsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getArtifactsCount() > 0) {
      hash = (37 * hash) + ARTIFACTS_FIELD_NUMBER;
      hash = (53 * hash) + getArtifactsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse parseFrom(
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
      com.google.irm.service.v1alpha2.api.ListArtifactsResponse prototype) {
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
   * Response for the ListArtifacts method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.ListArtifactsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.ListArtifactsResponse)
      com.google.irm.service.v1alpha2.api.ListArtifactsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_ListArtifactsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_ListArtifactsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.ListArtifactsResponse.class,
              com.google.irm.service.v1alpha2.api.ListArtifactsResponse.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.ListArtifactsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getArtifactsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (artifactsBuilder_ == null) {
        artifacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        artifactsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.IncidentsService
          .internal_static_google_cloud_irm_v1alpha2_ListArtifactsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.ListArtifactsResponse getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.ListArtifactsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.ListArtifactsResponse build() {
      com.google.irm.service.v1alpha2.api.ListArtifactsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.ListArtifactsResponse buildPartial() {
      com.google.irm.service.v1alpha2.api.ListArtifactsResponse result =
          new com.google.irm.service.v1alpha2.api.ListArtifactsResponse(this);
      int from_bitField0_ = bitField0_;
      if (artifactsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          artifacts_ = java.util.Collections.unmodifiableList(artifacts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.artifacts_ = artifacts_;
      } else {
        result.artifacts_ = artifactsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.irm.service.v1alpha2.api.ListArtifactsResponse) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.ListArtifactsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.ListArtifactsResponse other) {
      if (other == com.google.irm.service.v1alpha2.api.ListArtifactsResponse.getDefaultInstance())
        return this;
      if (artifactsBuilder_ == null) {
        if (!other.artifacts_.isEmpty()) {
          if (artifacts_.isEmpty()) {
            artifacts_ = other.artifacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureArtifactsIsMutable();
            artifacts_.addAll(other.artifacts_);
          }
          onChanged();
        }
      } else {
        if (!other.artifacts_.isEmpty()) {
          if (artifactsBuilder_.isEmpty()) {
            artifactsBuilder_.dispose();
            artifactsBuilder_ = null;
            artifacts_ = other.artifacts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            artifactsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getArtifactsFieldBuilder()
                    : null;
          } else {
            artifactsBuilder_.addAllMessages(other.artifacts_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.irm.service.v1alpha2.api.ListArtifactsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.irm.service.v1alpha2.api.ListArtifactsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.irm.service.v1alpha2.api.Artifact> artifacts_ =
        java.util.Collections.emptyList();

    private void ensureArtifactsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        artifacts_ =
            new java.util.ArrayList<com.google.irm.service.v1alpha2.api.Artifact>(artifacts_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Artifact,
            com.google.irm.service.v1alpha2.api.Artifact.Builder,
            com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
        artifactsBuilder_;

    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public java.util.List<com.google.irm.service.v1alpha2.api.Artifact> getArtifactsList() {
      if (artifactsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(artifacts_);
      } else {
        return artifactsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public int getArtifactsCount() {
      if (artifactsBuilder_ == null) {
        return artifacts_.size();
      } else {
        return artifactsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Artifact getArtifacts(int index) {
      if (artifactsBuilder_ == null) {
        return artifacts_.get(index);
      } else {
        return artifactsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder setArtifacts(int index, com.google.irm.service.v1alpha2.api.Artifact value) {
      if (artifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtifactsIsMutable();
        artifacts_.set(index, value);
        onChanged();
      } else {
        artifactsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder setArtifacts(
        int index, com.google.irm.service.v1alpha2.api.Artifact.Builder builderForValue) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.set(index, builderForValue.build());
        onChanged();
      } else {
        artifactsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder addArtifacts(com.google.irm.service.v1alpha2.api.Artifact value) {
      if (artifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtifactsIsMutable();
        artifacts_.add(value);
        onChanged();
      } else {
        artifactsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder addArtifacts(int index, com.google.irm.service.v1alpha2.api.Artifact value) {
      if (artifactsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureArtifactsIsMutable();
        artifacts_.add(index, value);
        onChanged();
      } else {
        artifactsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder addArtifacts(
        com.google.irm.service.v1alpha2.api.Artifact.Builder builderForValue) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.add(builderForValue.build());
        onChanged();
      } else {
        artifactsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder addArtifacts(
        int index, com.google.irm.service.v1alpha2.api.Artifact.Builder builderForValue) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.add(index, builderForValue.build());
        onChanged();
      } else {
        artifactsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder addAllArtifacts(
        java.lang.Iterable<? extends com.google.irm.service.v1alpha2.api.Artifact> values) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, artifacts_);
        onChanged();
      } else {
        artifactsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder clearArtifacts() {
      if (artifactsBuilder_ == null) {
        artifacts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        artifactsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public Builder removeArtifacts(int index) {
      if (artifactsBuilder_ == null) {
        ensureArtifactsIsMutable();
        artifacts_.remove(index);
        onChanged();
      } else {
        artifactsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Artifact.Builder getArtifactsBuilder(int index) {
      return getArtifactsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.ArtifactOrBuilder getArtifactsOrBuilder(int index) {
      if (artifactsBuilder_ == null) {
        return artifacts_.get(index);
      } else {
        return artifactsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public java.util.List<? extends com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
        getArtifactsOrBuilderList() {
      if (artifactsBuilder_ != null) {
        return artifactsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(artifacts_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Artifact.Builder addArtifactsBuilder() {
      return getArtifactsFieldBuilder()
          .addBuilder(com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public com.google.irm.service.v1alpha2.api.Artifact.Builder addArtifactsBuilder(int index) {
      return getArtifactsFieldBuilder()
          .addBuilder(index, com.google.irm.service.v1alpha2.api.Artifact.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of artifacts.
     * </pre>
     *
     * <code>repeated .google.cloud.irm.v1alpha2.Artifact artifacts = 1;</code>
     */
    public java.util.List<com.google.irm.service.v1alpha2.api.Artifact.Builder>
        getArtifactsBuilderList() {
      return getArtifactsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.Artifact,
            com.google.irm.service.v1alpha2.api.Artifact.Builder,
            com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>
        getArtifactsFieldBuilder() {
      if (artifactsBuilder_ == null) {
        artifactsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.Artifact,
                com.google.irm.service.v1alpha2.api.Artifact.Builder,
                com.google.irm.service.v1alpha2.api.ArtifactOrBuilder>(
                artifacts_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        artifacts_ = null;
      }
      return artifactsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of artifacts.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of artifacts.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of artifacts.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of artifacts.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Page token to fetch the next set of artifacts.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.ListArtifactsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.ListArtifactsResponse)
  private static final com.google.irm.service.v1alpha2.api.ListArtifactsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.ListArtifactsResponse();
  }

  public static com.google.irm.service.v1alpha2.api.ListArtifactsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListArtifactsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListArtifactsResponse>() {
        @java.lang.Override
        public ListArtifactsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListArtifactsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListArtifactsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListArtifactsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.ListArtifactsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
