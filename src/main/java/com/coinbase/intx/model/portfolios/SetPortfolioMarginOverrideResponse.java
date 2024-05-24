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

public class SetPortfolioMarginOverrideResponse {
    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("margin_override")
    private double marginOverride;

    @JsonProperty("request")
    private SetPortfolioMarginOverrideRequest request;

    public SetPortfolioMarginOverrideResponse() {}

    private SetPortfolioMarginOverrideResponse(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.marginOverride = builder.marginOverride;
        this.request = builder.request;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public double getMarginOverride() {
        return marginOverride;
    }

    public SetPortfolioMarginOverrideRequest getRequest() {
        return request;
    }

    public static class Builder {
        private String portfolioId;
        private double marginOverride;
        private SetPortfolioMarginOverrideRequest request;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder marginOverride(double marginOverride) {
            this.marginOverride = marginOverride;
            return this;
        }

        public Builder request(SetPortfolioMarginOverrideRequest request) {
            this.request = request;
            return this;
        }

        public SetPortfolioMarginOverrideResponse build() {
            return new SetPortfolioMarginOverrideResponse(this);
        }
    }
}
