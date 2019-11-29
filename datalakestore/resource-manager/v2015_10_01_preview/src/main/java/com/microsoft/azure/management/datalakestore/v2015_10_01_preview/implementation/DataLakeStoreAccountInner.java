/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview.implementation;

import com.microsoft.azure.Resource;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.EncryptionIdentity;
import java.util.Map;
import com.microsoft.azure.management.datalakestore.v2015_10_01_preview.DataLakeStoreAccountProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store account information.
 */
public class DataLakeStoreAccountInner extends Resource {
    /**
     * The Key vault encryption identity, if any.
     */
    @JsonProperty(value = "identity")
    private EncryptionIdentity identity;

    /**
     * the Data Lake Store account properties.
     */
    @JsonProperty(value = "properties")
    private DataLakeStoreAccountProperties properties;

    /**
     * Get the Key vault encryption identity, if any.
     *
     * @return the identity value
     */
    public EncryptionIdentity identity() {
        return this.identity;
    }

    /**
     * Set the Key vault encryption identity, if any.
     *
     * @param identity the identity value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withIdentity(EncryptionIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the Data Lake Store account properties.
     *
     * @return the properties value
     */
    public DataLakeStoreAccountProperties properties() {
        return this.properties;
    }

    /**
     * Set the Data Lake Store account properties.
     *
     * @param properties the properties value to set
     * @return the DataLakeStoreAccountInner object itself.
     */
    public DataLakeStoreAccountInner withProperties(DataLakeStoreAccountProperties properties) {
        this.properties = properties;
        return this;
    }

}