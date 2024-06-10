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

import com.coinbase.core.http.CoinbasePatchRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatchPortfolioRequest extends CoinbasePatchRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("auto_margin_enabled")
    private Boolean autoMarginEnabled;

    @JsonProperty("cross_collateral_enabled")
    private Boolean crossCollateralEnabled;

    @JsonProperty("position_offsets_enabled")
    private Boolean positionOffsetsEnabled;

    @JsonProperty("portfolio_name")
    private String portfolioName;

    public PatchPortfolioRequest() {}

    private PatchPortfolioRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.autoMarginEnabled = builder.autoMarginEnabled;
        this.crossCollateralEnabled = builder.crossCollateralEnabled;
        this.positionOffsetsEnabled = builder.positionOffsetsEnabled;
        this.portfolioName = builder.portfolioName;
    }

    @Override
    public String getPath() {
        return "/portfolios";
    }

    public String getPortfolio() {
        return portfolio;
    }

    public Boolean getAutoMarginEnabled() {
        return autoMarginEnabled;
    }

    public Boolean getCrossCollateralEnabled() {
        return crossCollateralEnabled;
    }

    public Boolean getPositionOffsetsEnabled() {
        return positionOffsetsEnabled;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public static class Builder {
        private String portfolio;
        private Boolean autoMarginEnabled;
        private Boolean crossCollateralEnabled;
        private Boolean positionOffsetsEnabled;
        private String portfolioName;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder autoMarginEnabled(Boolean autoMarginEnabled) {
            this.autoMarginEnabled = autoMarginEnabled;
            return this;
        }

        public Builder crossCollateralEnabled(Boolean crossCollateralEnabled) {
            this.crossCollateralEnabled = crossCollateralEnabled;
            return this;
        }

        public Builder positionOffsetsEnabled(Boolean positionOffsetsEnabled) {
            this.positionOffsetsEnabled = positionOffsetsEnabled;
            return this;
        }

        public Builder portfolioName(String portfolioName) {
            this.portfolioName = portfolioName;
            return this;
        }

        public PatchPortfolioRequest build() {
            return new PatchPortfolioRequest(this);
        }
    }
}
