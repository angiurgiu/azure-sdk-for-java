// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.learn.appconfig;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.learn.appconfig.models.ConfigurationSetting;

import reactor.core.publisher.Mono;

@ServiceClient(builder = ConfigurationClientBuilder.class)
public final class ConfigurationClient {

    ConfigurationClient() {
        // package-private constructor
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationSetting getConfigurationSetting(String key) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public ConfigurationSetting getConfigurationSetting(String key, String label) {
        throw new UnsupportedOperationException("not yet implemented");
    }

    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ConfigurationSetting> getConfigurationSettingWithResponse(ConfigurationSetting setting, boolean ifChanged, Context context) {
        throw new UnsupportedOperationException("not yet implemented");
    }
}