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

import com.coinbase.core.http.CoinbasePutRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdatePortfolioRequest extends CoinbasePutRequest {
    @JsonProperty("portfolio_id")
    private String portfolioId;
    @JsonProperty("name")
    private String name;

    public UpdatePortfolioRequest() {}

    private UpdatePortfolioRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.name = builder.name;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s", this.getPortfolioId());
    }

    public String getName() {
        return name;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public static class Builder {
        private String name;
        private String portfolioId;

        public Builder() {}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public UpdatePortfolioRequest build() {
            validate();
            return new UpdatePortfolioRequest(this);
        }

        private void validate() {
            if (portfolioId == null) {
                throw new IllegalArgumentException("Portfolio ID is required");
            }
        }
    }
}
