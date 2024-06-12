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

import com.coinbase.core.http.CoinbasePostRequest;

public class SetPortfolioMarginOverrideRequest extends CoinbasePostRequest {
    private String portfolioId;
    private String marginOverride;

    public SetPortfolioMarginOverrideRequest() {}

    private SetPortfolioMarginOverrideRequest(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.marginOverride = builder.marginOverride;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/margin-override", this.getPortfolioId());
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public String getMarginOverride() {
        return marginOverride;
    }

    public static class Builder {
        private String portfolioId;
        private String marginOverride;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder marginOverride(String marginOverride) {
            this.marginOverride = marginOverride;
            return this;
        }

        public SetPortfolioMarginOverrideRequest build() {
            validate();
            return new SetPortfolioMarginOverrideRequest(this);
        }

        private void validate() {
            if (portfolioId == null) {
                throw new IllegalArgumentException("Portfolio ID is required");
            }
        }
    }
}
