/*
 * The MIT License (MIT)	 
 *
 * Copyright (c) 2015 LeanIX GmbH
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.leanix.benchmark;

import org.springframework.util.StringUtils;

import net.leanix.api.common.ApiClient;

public class ApiClientFactory {

    /**
     * Creates a new ApiClient based on property information. Allows to execute via -Dapi.basepath=https://local-eam.leanix.net/demo/api/v1
     * -Dapi.key=XXX
     * 
     * @return
     * @throws Exception
     */
    public static ApiClient getApiClient(String workspaceName, String apiKey) throws Exception {
        String apiHostName = ConfigurationProvider.getApiHostName();

        if (StringUtils.isEmpty(apiHostName)) {
            return getApiClientHelper(ConfigurationProvider.getApiBasePath(), apiKey);
        }
        return getApiClientHelper(String.format("https://%s/%s/api/v1", apiHostName, workspaceName), apiKey);
    }

    private static ApiClient getApiClientHelper(String basePath, String apiKey) throws Exception {
        ApiClient apiClient = new ApiClient();
        apiClient.addDefaultHeader("X-Api-Sync-Mode", "sync");
        apiClient.setBasePath(basePath);
        apiClient.setApiKey(apiKey);

        return apiClient;
    }
}
