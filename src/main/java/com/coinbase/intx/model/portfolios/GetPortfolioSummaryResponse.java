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

public class GetPortfolioSummaryResponse {

    @JsonProperty("summary")
    private PortfolioDetail.Summary summary;

    @JsonProperty("request")
    private GetPortfolioSummaryRequest request;

    public GetPortfolioSummaryResponse() {}

    private GetPortfolioSummaryResponse(Builder builder) {
        this.summary = builder.summary;
        this.request = builder.request;
    }

    public PortfolioDetail.Summary getSummary() {
        return summary;
    }

    public void setSummary(PortfolioDetail.Summary summary) {
        this.summary = summary;
    }

    public GetPortfolioSummaryRequest getRequest() {
        return request;
    }

    public void setRequest(GetPortfolioSummaryRequest request) {
        this.request = request;
    }

    public static class Builder {
        private PortfolioDetail.Summary summary;
        private GetPortfolioSummaryRequest request;

        public Builder() {}

        public Builder summary(PortfolioDetail.Summary summary) {
            this.summary = summary;
            return this;
        }

        public Builder request(GetPortfolioSummaryRequest request) {
            this.request = request;
            return this;
        }

        public GetPortfolioSummaryResponse build() {
            return new GetPortfolioSummaryResponse(this);
        }
    }
}
