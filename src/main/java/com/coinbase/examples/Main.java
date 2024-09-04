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

import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.credentials.CoinbaseIntxCredentials;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.portfolios.PortfoliosService;
import com.coinbase.intx.portfolios.PortfoliosServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws CoinbaseIntxException {
        String credsStringBlob = System.getenv("INTX_CREDENTIALS");
        ObjectMapper mapper = new ObjectMapper();

        try {
            CoinbaseIntxCredentials credentials = new CoinbaseIntxCredentials(credsStringBlob);
            CoinbaseIntxClient client = new CoinbaseIntxClient(credentials, "https://api-n5e1.coinbase.com/api/v1");

            PortfoliosService portfoliosService = new PortfoliosServiceImpl(client);

            ListPortfoliosResponse listResponse = portfoliosService.listPortfolios();
            System.out.println("List Portfolios Response:");
            System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(listResponse));

        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the list portfolios response", e);
        }
    }
}