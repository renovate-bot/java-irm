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

public interface LookupSignalRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.LookupSignalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full resource name of the CSCC finding id this signal refers to (e.g.
   * "organizations/abc/sources/123/findings/xyz")
   * </pre>
   *
   * <code>string cscc_finding = 2;</code>
   */
  java.lang.String getCsccFinding();
  /**
   *
   *
   * <pre>
   * Full resource name of the CSCC finding id this signal refers to (e.g.
   * "organizations/abc/sources/123/findings/xyz")
   * </pre>
   *
   * <code>string cscc_finding = 2;</code>
   */
  com.google.protobuf.ByteString getCsccFindingBytes();

  /**
   *
   *
   * <pre>
   * The ID from the Stackdriver Alerting notification.
   * </pre>
   *
   * <code>string stackdriver_notification_id = 3;</code>
   */
  java.lang.String getStackdriverNotificationId();
  /**
   *
   *
   * <pre>
   * The ID from the Stackdriver Alerting notification.
   * </pre>
   *
   * <code>string stackdriver_notification_id = 3;</code>
   */
  com.google.protobuf.ByteString getStackdriverNotificationIdBytes();

  public com.google.irm.service.v1alpha2.api.LookupSignalRequest.AlternateIdCase
      getAlternateIdCase();
}
