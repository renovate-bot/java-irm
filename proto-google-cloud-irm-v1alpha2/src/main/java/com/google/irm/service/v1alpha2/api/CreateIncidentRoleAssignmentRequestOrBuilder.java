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

public interface CreateIncidentRoleAssignmentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.irm.v1alpha2.CreateIncidentRoleAssignmentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name of the incident, for example,
   * "projects/{project_id}/incidents/{incident_id}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Resource name of the incident, for example,
   * "projects/{project_id}/incidents/{incident_id}".
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Role assignment to create.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
   */
  boolean hasIncidentRoleAssignment();
  /**
   *
   *
   * <pre>
   * Role assignment to create.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentRoleAssignment getIncidentRoleAssignment();
  /**
   *
   *
   * <pre>
   * Role assignment to create.
   * </pre>
   *
   * <code>.google.cloud.irm.v1alpha2.IncidentRoleAssignment incident_role_assignment = 2;</code>
   */
  com.google.irm.service.v1alpha2.api.IncidentRoleAssignmentOrBuilder
      getIncidentRoleAssignmentOrBuilder();
}
