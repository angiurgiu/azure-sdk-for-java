// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.util.Configuration;
import com.azure.core.util.ServiceVersion;

@ServiceClientBuilder(serviceClients = {ComputationClient.class, ComputationAsyncClient.class})
public final class ComputationClientBuilder {
    public ComputationClientBuilder credential(TokenCredential credential) {
        // implementation
        return this;
    }

    public ComputationClientBuilder httpClient(HttpClient httpClient) {
        // implementation
        return this;
    }

    public ComputationClientBuilder endpoint(String endpoint) {
        // implementation
        return this;
    }

    public ComputationClientBuilder httpLogOptions(HttpLogOptions logOptions) {
        // implementation
        return this;
    }

    public ComputationClientBuilder addPolicy(HttpPipelinePolicy policy) {
        // implementation
        return this;
    }

    public ComputationClientBuilder pipeline(HttpPipeline pipeline) {
        // implementation
        return this;
    }

    public ComputationClientBuilder configuration(Configuration configuration) {
        // implementation
        return this;
    }

    public ComputationClientBuilder retryPolicy(HttpPipelinePolicy retryPolicy) {
        // implementation
        return this;
    }

    public ComputationClientBuilder serviceVersion(ServiceVersion version) {
        // implementation
        return this;
    }

    // build methods
    public ComputationClient buildClient() {
        // implementation
        return new ComputationClient();
    }

    public ComputationAsyncClient buildAsyncClient() {
        // implementation
        return new ComputationAsyncClient();
    }
}