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

public class GetPortfolioSummaryRequest {
    private String portfolio;

    public GetPortfolioSummaryRequest() {}

    private GetPortfolioSummaryRequest(Builder builder) {
        this.portfolio = builder.portfolio;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public static class Builder {
        private String portfolio;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public GetPortfolioSummaryRequest build() throws CoinbaseClientException {
            validate();
            return new GetPortfolioSummaryRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(portfolio)) {
                throw new CoinbaseClientException("Portfolio is required");
            }
        }
    }
}
