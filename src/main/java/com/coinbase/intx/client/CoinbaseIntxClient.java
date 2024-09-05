/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.coinbase.intx.client;

import com.coinbase.core.client.CoinbaseNetHttpClient;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.intx.credentials.CoinbaseIntxCredentials;
import com.coinbase.intx.errors.CoinbaseIntxErrorMessage;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.utils.Constants;
import com.fasterxml.jackson.core.type.TypeReference;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class CoinbaseIntxClient extends CoinbaseNetHttpClient {
    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials, String baseUrl) {
        super(credentials, baseUrl);
    }

    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials, String baseUrl, HttpClient client) {
        super(credentials, baseUrl, client);
    }

    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials) {
        super(credentials, Constants.BASE_URL);
    }

    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials, HttpClient client) {
        super(credentials, Constants.BASE_URL, client);
    }

    @Override
    protected <T> T handleResponse(
            HttpResponse<String> response,
            List<Integer> expectedStatusCodes,
            TypeReference<T> responseClass) throws CoinbaseIntxException {
        if (!expectedStatusCodes.contains(response.statusCode())) {
            try {
                CoinbaseIntxErrorMessage errorMessage = mapper.readValue(response.body(), CoinbaseIntxErrorMessage.class);
                throw errorMessage.createCoinbaseException();
            } catch (Exception e) {
                throw new CoinbaseIntxException(response.statusCode(), response.body());
            }
        }

        try {
            return mapper.readValue(response.body(), responseClass);
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to deserialize class", e);
        }
    }
}
