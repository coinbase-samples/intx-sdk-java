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

package com.coinbase.examples;

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.portfolios.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.coinbase.intx.client.CoinbaseIntxHttpClient;

public class Main {
    public static void main(String[] args) throws CoinbaseIntxException {
        String credsStringBlob = System.getenv("INTX_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbaseCredentials credentials = new CoinbaseCredentials(credsStringBlob);
            CoinbaseIntxHttpClient client = new CoinbaseIntxHttpClient(credentials);

            ListPortfoliosRequest listReq = new ListPortfoliosRequest.Builder()
                    .build();
            ListPortfoliosResponse listResponse = client.listPortfolios(listReq);
            System.out.println("List Portfolios Response:");
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listResponse));

        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the list portfolios response", e);
        }
    }
}