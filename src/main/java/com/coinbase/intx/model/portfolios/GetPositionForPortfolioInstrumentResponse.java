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

public class GetPositionForPortfolioInstrumentResponse {

    @JsonProperty("position")
    private PortfolioDetail.Position position;

    @JsonProperty("request")
    private GetPositionForPortfolioInstrumentRequest request;

    public GetPositionForPortfolioInstrumentResponse() {}

    private GetPositionForPortfolioInstrumentResponse(Builder builder) {
        this.position = builder.position;
        this.request = builder.request;
    }

    public PortfolioDetail.Position getPosition() {
        return position;
    }

    public void setPosition(PortfolioDetail.Position position) {
        this.position = position;
    }

    public GetPositionForPortfolioInstrumentRequest getRequest() {
        return request;
    }

    public void setRequest(GetPositionForPortfolioInstrumentRequest request) {
        this.request = request;
    }

    public static class Builder {
        private PortfolioDetail.Position position;
        private GetPositionForPortfolioInstrumentRequest request;

        public Builder() {}

        public Builder position(PortfolioDetail.Position position) {
            this.position = position;
            return this;
        }

        public Builder request(GetPositionForPortfolioInstrumentRequest request) {
            this.request = request;
            return this;
        }

        public GetPositionForPortfolioInstrumentResponse build() {
            return new GetPositionForPortfolioInstrumentResponse(this);
        }
    }
}
