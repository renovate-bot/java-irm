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

public interface SendShiftHandoffRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.SendShiftHandoffRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the Stackdriver project that the handoff is being sent
   * from. for example, `projects/{project_id}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * The resource name of the Stackdriver project that the handoff is being sent
   * from. for example, `projects/{project_id}`
   * </pre>
   *
   * <code>string parent = 1;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Email addresses of the recipients of the handoff, for example,
   * "user&#64;example.com". Must contain at least one entry.
   * </pre>
   *
   * <code>repeated string recipients = 2;</code>
   *
   * @return A list containing the recipients.
   */
  java.util.List<java.lang.String> getRecipientsList();
  /**
   *
   *
   * <pre>
   * Email addresses of the recipients of the handoff, for example,
   * "user&#64;example.com". Must contain at least one entry.
   * </pre>
   *
   * <code>repeated string recipients = 2;</code>
   *
   * @return The count of recipients.
   */
  int getRecipientsCount();
  /**
   *
   *
   * <pre>
   * Email addresses of the recipients of the handoff, for example,
   * "user&#64;example.com". Must contain at least one entry.
   * </pre>
   *
   * <code>repeated string recipients = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The recipients at the given index.
   */
  java.lang.String getRecipients(int index);
  /**
   *
   *
   * <pre>
   * Email addresses of the recipients of the handoff, for example,
   * "user&#64;example.com". Must contain at least one entry.
   * </pre>
   *
   * <code>repeated string recipients = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the recipients at the given index.
   */
  com.google.protobuf.ByteString getRecipientsBytes(int index);

  /**
   *
   *
   * <pre>
   * Email addresses that should be CC'd on the handoff. Optional.
   * </pre>
   *
   * <code>repeated string cc = 3;</code>
   *
   * @return A list containing the cc.
   */
  java.util.List<java.lang.String> getCcList();
  /**
   *
   *
   * <pre>
   * Email addresses that should be CC'd on the handoff. Optional.
   * </pre>
   *
   * <code>repeated string cc = 3;</code>
   *
   * @return The count of cc.
   */
  int getCcCount();
  /**
   *
   *
   * <pre>
   * Email addresses that should be CC'd on the handoff. Optional.
   * </pre>
   *
   * <code>repeated string cc = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The cc at the given index.
   */
  java.lang.String getCc(int index);
  /**
   *
   *
   * <pre>
   * Email addresses that should be CC'd on the handoff. Optional.
   * </pre>
   *
   * <code>repeated string cc = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the cc at the given index.
   */
  com.google.protobuf.ByteString getCcBytes(int index);

  /**
   *
   *
   * <pre>
   * The subject of the email. Required.
   * </pre>
   *
   * <code>string subject = 4;</code>
   *
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   *
   *
   * <pre>
   * The subject of the email. Required.
   * </pre>
   *
   * <code>string subject = 4;</code>
   *
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString getSubjectBytes();

  /**
   *
   *
   * <pre>
   * Content type string, for example, 'text/plain' or 'text/html'.
   * </pre>
   *
   * <code>string notes_content_type = 5;</code>
   *
   * @return The notesContentType.
   */
  java.lang.String getNotesContentType();
  /**
   *
   *
   * <pre>
   * Content type string, for example, 'text/plain' or 'text/html'.
   * </pre>
   *
   * <code>string notes_content_type = 5;</code>
   *
   * @return The bytes for notesContentType.
   */
  com.google.protobuf.ByteString getNotesContentTypeBytes();

  /**
   *
   *
   * <pre>
   * Additional notes to be included in the handoff. Optional.
   * </pre>
   *
   * <code>string notes_content = 6;</code>
   *
   * @return The notesContent.
   */
  java.lang.String getNotesContent();
  /**
   *
   *
   * <pre>
   * Additional notes to be included in the handoff. Optional.
   * </pre>
   *
   * <code>string notes_content = 6;</code>
   *
   * @return The bytes for notesContent.
   */
  com.google.protobuf.ByteString getNotesContentBytes();

  /**
   *
   *
   * <pre>
   * The set of incidents that should be included in the handoff. Optional.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.SendShiftHandoffRequest.Incident incidents = 7;
   * </code>
   */
  java.util.List<com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest.Incident>
      getIncidentsList();
  /**
   *
   *
   * <pre>
   * The set of incidents that should be included in the handoff. Optional.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.SendShiftHandoffRequest.Incident incidents = 7;
   * </code>
   */
  com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest.Incident getIncidents(int index);
  /**
   *
   *
   * <pre>
   * The set of incidents that should be included in the handoff. Optional.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.SendShiftHandoffRequest.Incident incidents = 7;
   * </code>
   */
  int getIncidentsCount();
  /**
   *
   *
   * <pre>
   * The set of incidents that should be included in the handoff. Optional.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.SendShiftHandoffRequest.Incident incidents = 7;
   * </code>
   */
  java.util.List<
          ? extends com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest.IncidentOrBuilder>
      getIncidentsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The set of incidents that should be included in the handoff. Optional.
   * </pre>
   *
   * <code>repeated .google.cloud.irm.v1alpha2.SendShiftHandoffRequest.Incident incidents = 7;
   * </code>
   */
  com.google.irm.service.v1alpha2.api.SendShiftHandoffRequest.IncidentOrBuilder
      getIncidentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If set to true a ShiftHandoffResponse will be returned but the handoff
   * will not actually be sent.
   * </pre>
   *
   * <code>bool preview_only = 8;</code>
   *
   * @return The previewOnly.
   */
  boolean getPreviewOnly();
}
