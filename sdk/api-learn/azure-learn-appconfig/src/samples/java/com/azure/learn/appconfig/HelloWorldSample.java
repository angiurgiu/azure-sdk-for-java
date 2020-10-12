// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.appconfig;

/**
 * A sample for demonstrating App Configuration client library usage.
 */
public class HelloWorldSample {

    /**
     * Main method to run the sample.
     * @param args Input args to the program.
     */
    public static void main(String[] args) {
       	ConfigurationClient configurationClient = new ConfigurationClientBuilder()
	        .credential(new DefaultAzureCredentialBuilder().build())
	        .endpoint(System.getenv("API_LEARN_ENDPOINT"))
	        .buildClient();
    }
}
