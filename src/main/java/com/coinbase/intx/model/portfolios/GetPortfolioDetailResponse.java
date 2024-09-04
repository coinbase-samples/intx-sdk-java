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

public class GetPortfolioDetailResponse {

    @JsonProperty("portfolio_detail")
    private PortfolioDetail portfolioDetail;

    public GetPortfolioDetailResponse() {}

    private GetPortfolioDetailResponse(Builder builder) {
        this.portfolioDetail = builder.portfolioDetail;
    }

    public PortfolioDetail getPortfolioDetail() {
        return portfolioDetail;
    }

    public void setPortfolioDetail(PortfolioDetail portfolioDetail) {
        this.portfolioDetail = portfolioDetail;
    }

    public static class Builder {
        private PortfolioDetail portfolioDetail;

        public Builder() {}

        public Builder portfolioDetail(PortfolioDetail portfolioDetail) {
            this.portfolioDetail = portfolioDetail;
            return this;
        }

        public GetPortfolioDetailResponse build() {
            return new GetPortfolioDetailResponse(this);
        }
    }
}
