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

import com.coinbase.core.errors.CoinbaseClientException;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetBalanceForPortfolioAssetRequest {
    private String portfolio;
    private String asset;

    public GetBalanceForPortfolioAssetRequest() {}

    private GetBalanceForPortfolioAssetRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.asset = builder.asset;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public static class Builder {
        private String portfolio;
        private String asset;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        public GetBalanceForPortfolioAssetRequest build() throws CoinbaseClientException {
            validate();
            return new GetBalanceForPortfolioAssetRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(portfolio)) {
                throw new CoinbaseClientException("Portfolio is required");
            }
            if (isNullOrEmpty(asset)) {
                throw new CoinbaseClientException("Asset is required");
            }
        }
    }
}
