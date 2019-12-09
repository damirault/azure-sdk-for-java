/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the Service Fabric Type Backend.
 */
public class BackendServiceFabricClusterProperties {
    /**
     * The client certificate thumbprint for the management endpoint.
     */
    @JsonProperty(value = "clientCertificatethumbprint", required = true)
    private String clientCertificatethumbprint;

    /**
     * Maximum number of retries while attempting resolve the partition.
     */
    @JsonProperty(value = "maxPartitionResolutionRetries")
    private Integer maxPartitionResolutionRetries;

    /**
     * The cluster management endpoint.
     */
    @JsonProperty(value = "managementEndpoints", required = true)
    private List<String> managementEndpoints;

    /**
     * Thumbprints of certificates cluster management service uses for tls
     * communication.
     */
    @JsonProperty(value = "serverCertificateThumbprints")
    private List<String> serverCertificateThumbprints;

    /**
     * Server X509 Certificate Names Collection.
     */
    @JsonProperty(value = "serverX509Names")
    private List<X509CertificateName> serverX509Names;

    /**
     * Get the client certificate thumbprint for the management endpoint.
     *
     * @return the clientCertificatethumbprint value
     */
    public String clientCertificatethumbprint() {
        return this.clientCertificatethumbprint;
    }

    /**
     * Set the client certificate thumbprint for the management endpoint.
     *
     * @param clientCertificatethumbprint the clientCertificatethumbprint value to set
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withClientCertificatethumbprint(String clientCertificatethumbprint) {
        this.clientCertificatethumbprint = clientCertificatethumbprint;
        return this;
    }

    /**
     * Get maximum number of retries while attempting resolve the partition.
     *
     * @return the maxPartitionResolutionRetries value
     */
    public Integer maxPartitionResolutionRetries() {
        return this.maxPartitionResolutionRetries;
    }

    /**
     * Set maximum number of retries while attempting resolve the partition.
     *
     * @param maxPartitionResolutionRetries the maxPartitionResolutionRetries value to set
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withMaxPartitionResolutionRetries(Integer maxPartitionResolutionRetries) {
        this.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
        return this;
    }

    /**
     * Get the cluster management endpoint.
     *
     * @return the managementEndpoints value
     */
    public List<String> managementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Set the cluster management endpoint.
     *
     * @param managementEndpoints the managementEndpoints value to set
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withManagementEndpoints(List<String> managementEndpoints) {
        this.managementEndpoints = managementEndpoints;
        return this;
    }

    /**
     * Get thumbprints of certificates cluster management service uses for tls communication.
     *
     * @return the serverCertificateThumbprints value
     */
    public List<String> serverCertificateThumbprints() {
        return this.serverCertificateThumbprints;
    }

    /**
     * Set thumbprints of certificates cluster management service uses for tls communication.
     *
     * @param serverCertificateThumbprints the serverCertificateThumbprints value to set
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withServerCertificateThumbprints(List<String> serverCertificateThumbprints) {
        this.serverCertificateThumbprints = serverCertificateThumbprints;
        return this;
    }

    /**
     * Get server X509 Certificate Names Collection.
     *
     * @return the serverX509Names value
     */
    public List<X509CertificateName> serverX509Names() {
        return this.serverX509Names;
    }

    /**
     * Set server X509 Certificate Names Collection.
     *
     * @param serverX509Names the serverX509Names value to set
     * @return the BackendServiceFabricClusterProperties object itself.
     */
    public BackendServiceFabricClusterProperties withServerX509Names(List<X509CertificateName> serverX509Names) {
        this.serverX509Names = serverX509Names;
        return this;
    }

}