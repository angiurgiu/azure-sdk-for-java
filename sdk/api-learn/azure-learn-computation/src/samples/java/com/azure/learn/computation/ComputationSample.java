// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.computation;

import com.azure.core.util.Context;
import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.learn.computation.models.ComputeNode;
import com.azure.learn.computation.models.ComputeOperation;
import com.azure.learn.computation.models.ComputeOperationStatus;
import com.azure.learn.computation.models.LinuxComputeNode;
import com.azure.learn.computation.models.WindowsComputeNode;
import com.azure.core.util.polling.SyncPoller;

/**
 * A sample for demonstrating Conditional Access.
 */
public class ComputationSample {

    public final static Integer DEFAULT_PRECISION = 152;

    public static void main(String[] args) throws InterruptedException {
        ComputationClient computationClient = new ComputationClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint(System.getenv("API_LEARN_ENDPOINT"))
            .buildClient();

        LinuxComputeNode linuxNode = computationClient.upsertLinuxComputeNode(
            "FIRST_LINUX_NODE", new LinuxComputeNode("SSH_KEY"));
        WindowsComputeNode windowsNode = computationClient.upsertWindowsComputeNode(
            "FIRST_WINDOWS_NODE", new WindowsComputeNode("AGIURG"));
            
        SyncPoller<ComputeOperationStatus, ComputeOperation> syncLinuxPoller = 
            computationClient.beginComputePi(linuxNode.getName(), DEFAULT_PRECISION);

        SyncPoller<ComputeOperationStatus, ComputeOperation> syncWindowsPoller = 
            computationClient.beginComputePi(windowsNode.getName(), DEFAULT_PRECISION);

        syncLinuxPoller.waitForCompletion();

        syncWindowsPoller.waitForCompletion();

        ComputeOperation linuxOperation = syncLinuxPoller.getFinalResult();
        ComputeOperation windowsOperation = syncWindowsPoller.getFinalResult();

        Float linuxPi;
        Float windowsPi;
        if (linuxOperation.getStatus() == ComputeOperationStatus.SUCCEEDED)
        {
            linuxPi = syncLinuxPoller.getFinalResult().getValue();
        }
        
        if (windowsOperation.getStatus() == ComputeOperationStatus.SUCCEEDED)
        {
            windowsPi = syncWindowsPoller.getFinalResult().getValue();
        }
    }
}
