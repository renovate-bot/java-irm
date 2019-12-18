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

/**
 * A client to Stackdriver Incident Response & Management API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>===================== IncidentServiceClient =====================
 *
 * <p>Service Description: The Incident API for Incident Response &amp; Management.
 *
 * <p>Sample for IncidentServiceClient:
 *
 * <pre>
 * <code>
 * try (IncidentServiceClient incidentServiceClient = IncidentServiceClient.create()) {
 *   Incident incident = Incident.newBuilder().build();
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Incident response = incidentServiceClient.createIncident(incident, parent);
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.irm.v1alpha2;

import javax.annotation.Generated;
