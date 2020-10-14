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

    public final static Integer PRECISION = 152;
    public static ComputationClient computationClient;

    public static float PI;

    public static void main(String[] args) throws InterruptedException {
        computationClient = new ComputationClientBuilder()
            .credential(new DefaultAzureCredentialBuilder().build())
            .endpoint(System.getenv("API_LEARN_ENDPOINT"))
            .buildClient();

        LinuxComputeNode linuxNode = InitializeLinuxNodeSample();
        WindowsComputeNode windowsNode = InitializeWindowsNodeSample();
            
        Float linuxPi = ComputePiSample(linuxNode);
        Float windowsPi = ComputePiSample(windowsNode);

        // We know that the node exists, and we want to change the sshPublicKey
        linuxNode = InitializeLinuxNodeSample();

        // We know that the node exists, and we want to change the userName
        windowsNode = InitializeWindowsNodeSample();

        Float updatedLinuxPi = ComputePiSample(linuxNode);
        Float updatedWindowsPi = ComputePiSample(windowsNode);

        if (linuxPi != updatedLinuxPi)
        {
            throw new RuntimeException("Compute operation was inconsistent between retries on Linux VMs.");
        }

        if (windowsPi != updatedWindowsPi)
        {
            throw new RuntimeException("Compute operation was inconsistent between retries on Windows VMs.");
        }

        if (linuxPi != windowsPi)
        {
            throw new RuntimeException("Compute operation was inconsistent between computations on Linux and on Windows VMs.");
        }

        PI = windowsPi;
    }

    public static LinuxComputeNode InitializeLinuxNodeSample()
    {
        return computationClient.createLinuxComputeNode(
            "FIRST_LINUX_NODE", new LinuxComputeNode("SSH_KEY"));
    }

    public static WindowsComputeNode InitializeWindowsNodeSample()
    {
        return computationClient.createWindowsComputeNode(
            "FIRST_WINDOWS_NODE", new WindowsComputeNode("AGIURG"));
    }

    public static float ComputePiSample(ComputeNode computeNode)
    {
        SyncPoller<ComputeOperationStatus, ComputeOperation> syncOperationPoller = 
            computationClient.beginComputePi(computeNode.getName(), PRECISION);

        syncOperationPoller.waitForCompletion();

        ComputeOperation computeOperation = syncOperationPoller.getFinalResult();

        Float computedPi;
        if (computeOperation.getStatus() == ComputeOperationStatus.SUCCEEDED)
        {
            return computeOperation.getValue();
        }
        else {
            throw new RuntimeException("Compute operation failed. Status: " + computeOperation.getStatus());
        }
    }

    public static LinuxComputeNode CreateOrUpdateLinuxNodeSample(String nodeName, String newSshKey)
    {
        // upsert operation: overwrite even if it already exists
        return computationClient.createLinuxComputeNodeWithResponse(
            nodeName, new LinuxComputeNode(newSshKey), false, Context.NONE).getValue();
    }

    public static WindowsComputeNode CreateOrUpdateWindowsNodeSample(String nodeName, String newUsername)
    {
        // upsert operation: overwrite even if it already exists
        return computationClient.createWindowsComputeNodeWithResponse(
            nodeName, new WindowsComputeNode(newUsername), false, Context.NONE).getValue();
    }
}
