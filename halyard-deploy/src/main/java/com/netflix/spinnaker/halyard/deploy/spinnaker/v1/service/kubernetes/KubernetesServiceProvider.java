/*
 * Copyright 2017 Google, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.kubernetes;

import com.netflix.spinnaker.halyard.config.model.v1.providers.kubernetes.KubernetesAccount;
import com.netflix.spinnaker.halyard.deploy.spinnaker.v1.service.DeployableServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class KubernetesServiceProvider extends DeployableServiceProvider<KubernetesAccount> {
  @Autowired
  KubernetesClouddriverBootstrapService clouddriverBootstrapService;

  @Autowired
  KubernetesClouddriverService clouddriverService;

  @Autowired
  KubernetesDeckService deckService;

  @Autowired
  KubernetesEchoService echoService;

  @Autowired
  KubernetesFiatService fiatService;

  @Autowired
  KubernetesFront50Service front50Service;

  @Autowired
  KubernetesGateService gateService;

  @Autowired
  KubernetesIgorService igorService;

  @Autowired
  KubernetesMonitoringDaemonService monitoringDaemonService;

  @Autowired
  KubernetesOrcaBootstrapService orcaBootstrapService;

  @Autowired
  KubernetesOrcaService orcaService;

  @Autowired
  KubernetesRedisBootstrapService redisBootstrapService;

  @Autowired
  KubernetesRedisService redisService;

  @Autowired
  KubernetesRoscoService roscoService;

  // For serialization
  public KubernetesServiceProvider() {}
}