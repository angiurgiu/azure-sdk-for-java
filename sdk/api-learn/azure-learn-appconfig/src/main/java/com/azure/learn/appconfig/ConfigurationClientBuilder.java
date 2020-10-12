// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.appconfig;

public final class ConfigurationClientBuilder {
    public ConfigurationClientBuilder credential(TokenCredential credential) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder httpClient(HttpClient httpClient) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder endpoint(String endpoint) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder httpLogOptions(HttpLogOptions logOptions) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder addPolicy(HttpPipelinePolicy policy) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder pipeline(HttpPipeline pipeline) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder configuration(Configuration configuration) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder retryPolicy(HttpPipelinePolicy retryPolicy) {
        // implementation
        return this;
    }

    public ConfigurationClientBuilder serviceVersion(ServiceVersion version) {
        // implementation
        return this;
    }

    // build methods
    public ConfigurationClient buildClient() {
        // implementation
        return new ConfigurationClient();
    }

    public ConfigurationAsyncClient buildAsyncClient() {
        // implementation
        return new ConfigurationAsyncClient();
    }
}