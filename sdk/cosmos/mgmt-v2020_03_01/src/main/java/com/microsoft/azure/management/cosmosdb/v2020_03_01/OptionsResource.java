/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB options resource object.
 */
public class OptionsResource {
    /**
     * Value of the Cosmos DB resource throughput. Use the ThroughputSetting
     * resource when retrieving offer details.
     */
    @JsonProperty(value = "throughput")
    private Integer throughput;

    /**
     * Get value of the Cosmos DB resource throughput. Use the ThroughputSetting resource when retrieving offer details.
     *
     * @return the throughput value
     */
    public Integer throughput() {
        return this.throughput;
    }

    /**
     * Set value of the Cosmos DB resource throughput. Use the ThroughputSetting resource when retrieving offer details.
     *
     * @param throughput the throughput value to set
     * @return the OptionsResource object itself.
     */
    public OptionsResource withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

}
