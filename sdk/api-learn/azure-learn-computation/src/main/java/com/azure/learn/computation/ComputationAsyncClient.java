// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import static com.azure.core.util.FluxUtil.monoError;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.Response;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.PollerFlux;
import com.azure.learn.computation.models.ComputeNode;
import com.azure.learn.computation.models.ComputeOperation;
import com.azure.learn.computation.models.ComputeOperationStatus;
import com.azure.learn.computation.models.LinuxComputeNode;
import com.azure.learn.computation.models.WindowsComputeNode;

import reactor.core.publisher.Mono;

@ServiceClient(builder = ComputationClientBuilder.class, isAsync = true)
public final class ComputationAsyncClient {
    ComputationAsyncClient() {
        // package-private constructor
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<ComputeNode> getComputeNode(String nodeName) {
        return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ComputeNode>> getComputeNodeWithResponse(String nodeName) {
        return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ComputeNode> listComputeNodes() {
        return new PagedFlux<>(() -> monoError(
            new ClientLogger(ComputationAsyncClient.class), new RuntimeException("not yet implemented")));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<LinuxComputeNode> upsertLinuxComputeNode(String nodeName, LinuxComputeNode computeNode) {
       return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<LinuxComputeNode>> upsertLinuxComputeNodeWithResponse(String nodeName, LinuxComputeNode computeNode, boolean ifUnchanged) {
       return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<WindowsComputeNode> upsertWindowsComputeNode(String nodeName, WindowsComputeNode computeNode) {
       return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<WindowsComputeNode>> upsertWindowsComputeNodeWithResponse(String nodeName, WindowsComputeNode computeNode, boolean ifUnchanged) {
       return Mono.error(new UnsupportedOperationException("not yet implemented"));
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<ComputeOperationStatus, ComputeOperation> beginComputePi(String nodeName) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public PollerFlux<ComputeOperationStatus, ComputeOperation> beginComputePi(String nodeName, Integer precision) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}
