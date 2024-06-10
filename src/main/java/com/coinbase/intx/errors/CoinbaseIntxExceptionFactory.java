/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.intx.errors;

import com.fasterxml.jackson.databind.ObjectMapper;

public class CoinbaseIntxExceptionFactory {
    private static final ObjectMapper mapper = new ObjectMapper();

    public static CoinbaseIntxException create(int statusCode, String responseBody) {
        try {
            CoinbaseIntxErrorMessage errorMessage = mapper.readValue(responseBody, CoinbaseIntxErrorMessage.class);
            return new CoinbaseIntxException(statusCode, errorMessage.getMessage());
        } catch (Exception e) {
            return new CoinbaseIntxException(statusCode, responseBody);
        }
    }

    public static CoinbaseIntxException create(String responseBody, Throwable cause) {
        try {
            CoinbaseIntxErrorMessage errorMessage = mapper.readValue(responseBody, CoinbaseIntxErrorMessage.class);
            return new CoinbaseIntxException(errorMessage.getMessage(), cause);
        } catch (Exception e) {
            return new CoinbaseIntxException(responseBody, cause);
        }
    }

    public static CoinbaseIntxException create(int statusCode, String responseBody, Throwable cause) {
        try {
            CoinbaseIntxErrorMessage errorMessage = mapper.readValue(responseBody, CoinbaseIntxErrorMessage.class);
            return new CoinbaseIntxException(statusCode, errorMessage.getMessage(), cause);
        } catch (Exception e) {
            return new CoinbaseIntxException(statusCode, responseBody, cause);
        }
    }

    public static CoinbaseIntxException create(Throwable cause) {
        return new CoinbaseIntxException(cause);
    }
}
