// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.Context;
import com.azure.learn.computation.models.ComputeNode;
import com.azure.learn.computation.models.ComputeOperation;
import com.azure.learn.computation.models.ComputeOperationStatus;
import com.azure.learn.computation.models.LinuxComputeNode;
import com.azure.learn.computation.models.WindowsComputeNode;

import reactor.core.publisher.Mono;

@ServiceClient(builder = ComputationClientBuilder.class)
public final class ComputationClient {

    ComputationClient() {
        // package-private constructor
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ComputeNode getComputeNode(String name) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ComputeNode> getComputeNodeWithResponse(String name, Context context) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ComputeNode> listComputeNodes() {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public LinuxComputeNode upsertLinuxComputeNode(String nodeName, LinuxComputeNode computeNode) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<LinuxComputeNode> upsertLinuxComputeNodeWithResponse(String nodeName, LinuxComputeNode computeNode, boolean ifUnchanged, Context context) {
       throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public WindowsComputeNode upsertWindowsComputeNode(String nodeName, WindowsComputeNode computeNode) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<WindowsComputeNode> upsertWindowsComputeNodeWithResponse(String nodeName, WindowsComputeNode computeNode, boolean ifUnchanged, Context context) {
       throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<ComputeOperationStatus, ComputeOperation> beginComputePi(String nodeName) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public SyncPoller<ComputeOperationStatus, ComputeOperation> beginComputePi(String nodeName, Integer precision) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}