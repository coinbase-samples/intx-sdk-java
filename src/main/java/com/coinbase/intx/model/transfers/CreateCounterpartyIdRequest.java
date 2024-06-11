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

package com.coinbase.intx.model.transfers;

import com.coinbase.core.http.CoinbasePostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateCounterpartyIdRequest extends CoinbasePostRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    public CreateCounterpartyIdRequest() {}

    private CreateCounterpartyIdRequest(Builder builder) {
        this.portfolio = builder.portfolio;
    }

    @Override
    public String getPath() {
        return "/transfers/create-counterparty-id";
    }

    public String getPortfolio() {
        return portfolio;
    }

    public static class Builder {
        private String portfolio;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public CreateCounterpartyIdRequest build() {
            return new CreateCounterpartyIdRequest(this);
        }
    }
}
