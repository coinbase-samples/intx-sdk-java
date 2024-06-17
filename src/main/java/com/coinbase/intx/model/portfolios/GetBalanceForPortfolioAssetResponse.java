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

package com.coinbase.intx.model.portfolios;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetBalanceForPortfolioAssetResponse {

    @JsonProperty("balance")
    private PortfolioBalance balance;

    @JsonProperty("request")
    private GetBalanceForPortfolioAssetRequest request;

    public GetBalanceForPortfolioAssetResponse() {}

    private GetBalanceForPortfolioAssetResponse(Builder builder) {
        this.balance = builder.balance;
        this.request = builder.request;
    }

    public PortfolioBalance getBalance() {
        return balance;
    }

    public void setBalance(PortfolioBalance balance) {
        this.balance = balance;
    }

    public GetBalanceForPortfolioAssetRequest getRequest() {
        return request;
    }

    public void setRequest(GetBalanceForPortfolioAssetRequest request) {
        this.request = request;
    }

    public static class Builder {
        private PortfolioBalance balance;
        private GetBalanceForPortfolioAssetRequest request;

        public Builder() {}

        public Builder balance(PortfolioBalance balance) {
            this.balance = balance;
            return this;
        }

        public Builder request(GetBalanceForPortfolioAssetRequest request) {
            this.request = request;
            return this;
        }

        public GetBalanceForPortfolioAssetResponse build() {
            return new GetBalanceForPortfolioAssetResponse(this);
        }
    }
}
