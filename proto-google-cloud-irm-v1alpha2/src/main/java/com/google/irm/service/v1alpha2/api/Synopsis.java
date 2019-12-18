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
// source: google/cloud/irm/v1alpha2/incidents.proto

package com.google.irm.service.v1alpha2.api;

/**
 *
 *
 * <pre>
 * Synopsis is a summary of an incident and it contains a textual content,
 * an author and a last updated timestamp.
 * </pre>
 *
 * Protobuf type {@code google.cloud.irm.v1alpha2.Synopsis}
 */
public final class Synopsis extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.irm.v1alpha2.Synopsis)
    SynopsisOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Synopsis.newBuilder() to construct.
  private Synopsis(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Synopsis() {
    contentType_ = "";
    content_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private Synopsis(
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

              contentType_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              content_ = s;
              break;
            }
          case 26:
            {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (updateTime_ != null) {
                subBuilder = updateTime_.toBuilder();
              }
              updateTime_ =
                  input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(updateTime_);
                updateTime_ = subBuilder.buildPartial();
              }

              break;
            }
          case 34:
            {
              com.google.irm.service.v1alpha2.api.User.Builder subBuilder = null;
              if (author_ != null) {
                subBuilder = author_.toBuilder();
              }
              author_ =
                  input.readMessage(
                      com.google.irm.service.v1alpha2.api.User.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(author_);
                author_ = subBuilder.buildPartial();
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
    return com.google.irm.service.v1alpha2.api.Incidents
        .internal_static_google_cloud_irm_v1alpha2_Synopsis_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.irm.service.v1alpha2.api.Incidents
        .internal_static_google_cloud_irm_v1alpha2_Synopsis_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.irm.service.v1alpha2.api.Synopsis.class,
            com.google.irm.service.v1alpha2.api.Synopsis.Builder.class);
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 1;
  private volatile java.lang.Object contentType_;
  /**
   *
   *
   * <pre>
   * Content type string, for example, 'text/plain' or 'text/markdown'.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   */
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Content type string, for example, 'text/plain' or 'text/markdown'.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   */
  public com.google.protobuf.ByteString getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object content_;
  /**
   *
   *
   * <pre>
   * Textual content of the synopsis. It can be plain text or markdown as
   * indicated by the content_type.
   * </pre>
   *
   * <code>string content = 2;</code>
   */
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Textual content of the synopsis. It can be plain text or markdown as
   * indicated by the content_type.
   * </pre>
   *
   * <code>string content = 2;</code>
   */
  public com.google.protobuf.ByteString getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * Last updated timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * Last updated timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * Last updated timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int AUTHOR_FIELD_NUMBER = 4;
  private com.google.irm.service.v1alpha2.api.User author_;
  /**
   *
   *
   * <pre>
   * Author of the synopsis.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
   */
  public boolean hasAuthor() {
    return author_ != null;
  }
  /**
   *
   *
   * <pre>
   * Author of the synopsis.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
   */
  public com.google.irm.service.v1alpha2.api.User getAuthor() {
    return author_ == null
        ? com.google.irm.service.v1alpha2.api.User.getDefaultInstance()
        : author_;
  }
  /**
   *
   *
   * <pre>
   * Author of the synopsis.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
   */
  public com.google.irm.service.v1alpha2.api.UserOrBuilder getAuthorOrBuilder() {
    return getAuthor();
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
    if (!getContentTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentType_);
    }
    if (!getContentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, content_);
    }
    if (updateTime_ != null) {
      output.writeMessage(3, getUpdateTime());
    }
    if (author_ != null) {
      output.writeMessage(4, getAuthor());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getContentTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentType_);
    }
    if (!getContentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, content_);
    }
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateTime());
    }
    if (author_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getAuthor());
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
    if (!(obj instanceof com.google.irm.service.v1alpha2.api.Synopsis)) {
      return super.equals(obj);
    }
    com.google.irm.service.v1alpha2.api.Synopsis other =
        (com.google.irm.service.v1alpha2.api.Synopsis) obj;

    if (!getContentType().equals(other.getContentType())) return false;
    if (!getContent().equals(other.getContent())) return false;
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (hasAuthor() != other.hasAuthor()) return false;
    if (hasAuthor()) {
      if (!getAuthor().equals(other.getAuthor())) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis parseFrom(
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

  public static Builder newBuilder(com.google.irm.service.v1alpha2.api.Synopsis prototype) {
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
   * Synopsis is a summary of an incident and it contains a textual content,
   * an author and a last updated timestamp.
   * </pre>
   *
   * Protobuf type {@code google.cloud.irm.v1alpha2.Synopsis}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.irm.v1alpha2.Synopsis)
      com.google.irm.service.v1alpha2.api.SynopsisOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_Synopsis_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_Synopsis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.irm.service.v1alpha2.api.Synopsis.class,
              com.google.irm.service.v1alpha2.api.Synopsis.Builder.class);
    }

    // Construct using com.google.irm.service.v1alpha2.api.Synopsis.newBuilder()
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
      contentType_ = "";

      content_ = "";

      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      if (authorBuilder_ == null) {
        author_ = null;
      } else {
        author_ = null;
        authorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.irm.service.v1alpha2.api.Incidents
          .internal_static_google_cloud_irm_v1alpha2_Synopsis_descriptor;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.Synopsis getDefaultInstanceForType() {
      return com.google.irm.service.v1alpha2.api.Synopsis.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.Synopsis build() {
      com.google.irm.service.v1alpha2.api.Synopsis result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.irm.service.v1alpha2.api.Synopsis buildPartial() {
      com.google.irm.service.v1alpha2.api.Synopsis result =
          new com.google.irm.service.v1alpha2.api.Synopsis(this);
      result.contentType_ = contentType_;
      result.content_ = content_;
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      if (authorBuilder_ == null) {
        result.author_ = author_;
      } else {
        result.author_ = authorBuilder_.build();
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
      if (other instanceof com.google.irm.service.v1alpha2.api.Synopsis) {
        return mergeFrom((com.google.irm.service.v1alpha2.api.Synopsis) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.irm.service.v1alpha2.api.Synopsis other) {
      if (other == com.google.irm.service.v1alpha2.api.Synopsis.getDefaultInstance()) return this;
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        onChanged();
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      if (other.hasAuthor()) {
        mergeAuthor(other.getAuthor());
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
      com.google.irm.service.v1alpha2.api.Synopsis parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.irm.service.v1alpha2.api.Synopsis) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object contentType_ = "";
    /**
     *
     *
     * <pre>
     * Content type string, for example, 'text/plain' or 'text/markdown'.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Content type string, for example, 'text/plain' or 'text/markdown'.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     */
    public com.google.protobuf.ByteString getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Content type string, for example, 'text/plain' or 'text/markdown'.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     */
    public Builder setContentType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      contentType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content type string, for example, 'text/plain' or 'text/markdown'.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     */
    public Builder clearContentType() {

      contentType_ = getDefaultInstance().getContentType();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content type string, for example, 'text/plain' or 'text/markdown'.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     */
    public Builder setContentTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      contentType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     *
     *
     * <pre>
     * Textual content of the synopsis. It can be plain text or markdown as
     * indicated by the content_type.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Textual content of the synopsis. It can be plain text or markdown as
     * indicated by the content_type.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Textual content of the synopsis. It can be plain text or markdown as
     * indicated by the content_type.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public Builder setContent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      content_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Textual content of the synopsis. It can be plain text or markdown as
     * indicated by the content_type.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public Builder clearContent() {

      content_ = getDefaultInstance().getContent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Textual content of the synopsis. It can be plain text or markdown as
     * indicated by the content_type.
     * </pre>
     *
     * <code>string content = 2;</code>
     */
    public Builder setContentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      content_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * Last updated timestamp.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private com.google.irm.service.v1alpha2.api.User author_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.User,
            com.google.irm.service.v1alpha2.api.User.Builder,
            com.google.irm.service.v1alpha2.api.UserOrBuilder>
        authorBuilder_;
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public boolean hasAuthor() {
      return authorBuilder_ != null || author_ != null;
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public com.google.irm.service.v1alpha2.api.User getAuthor() {
      if (authorBuilder_ == null) {
        return author_ == null
            ? com.google.irm.service.v1alpha2.api.User.getDefaultInstance()
            : author_;
      } else {
        return authorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public Builder setAuthor(com.google.irm.service.v1alpha2.api.User value) {
      if (authorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        author_ = value;
        onChanged();
      } else {
        authorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public Builder setAuthor(com.google.irm.service.v1alpha2.api.User.Builder builderForValue) {
      if (authorBuilder_ == null) {
        author_ = builderForValue.build();
        onChanged();
      } else {
        authorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public Builder mergeAuthor(com.google.irm.service.v1alpha2.api.User value) {
      if (authorBuilder_ == null) {
        if (author_ != null) {
          author_ =
              com.google.irm.service.v1alpha2.api.User.newBuilder(author_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          author_ = value;
        }
        onChanged();
      } else {
        authorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public Builder clearAuthor() {
      if (authorBuilder_ == null) {
        author_ = null;
        onChanged();
      } else {
        author_ = null;
        authorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public com.google.irm.service.v1alpha2.api.User.Builder getAuthorBuilder() {

      onChanged();
      return getAuthorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    public com.google.irm.service.v1alpha2.api.UserOrBuilder getAuthorOrBuilder() {
      if (authorBuilder_ != null) {
        return authorBuilder_.getMessageOrBuilder();
      } else {
        return author_ == null
            ? com.google.irm.service.v1alpha2.api.User.getDefaultInstance()
            : author_;
      }
    }
    /**
     *
     *
     * <pre>
     * Author of the synopsis.
     * </pre>
     *
     * <code>.google.cloud.irm.v1alpha2.User author = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.irm.service.v1alpha2.api.User,
            com.google.irm.service.v1alpha2.api.User.Builder,
            com.google.irm.service.v1alpha2.api.UserOrBuilder>
        getAuthorFieldBuilder() {
      if (authorBuilder_ == null) {
        authorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.irm.service.v1alpha2.api.User,
                com.google.irm.service.v1alpha2.api.User.Builder,
                com.google.irm.service.v1alpha2.api.UserOrBuilder>(
                getAuthor(), getParentForChildren(), isClean());
        author_ = null;
      }
      return authorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.irm.v1alpha2.Synopsis)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.irm.v1alpha2.Synopsis)
  private static final com.google.irm.service.v1alpha2.api.Synopsis DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.irm.service.v1alpha2.api.Synopsis();
  }

  public static com.google.irm.service.v1alpha2.api.Synopsis getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Synopsis> PARSER =
      new com.google.protobuf.AbstractParser<Synopsis>() {
        @java.lang.Override
        public Synopsis parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new Synopsis(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<Synopsis> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Synopsis> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.irm.service.v1alpha2.api.Synopsis getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
