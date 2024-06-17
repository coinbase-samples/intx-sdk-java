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

package com.coinbase.intx.model.instruments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetAggregatedCandlesResponse {
    @JsonProperty("aggregations")
    private Aggregation[] aggregations;

    private GetAggregatedCandlesRequest request;

    public GetAggregatedCandlesResponse() {}

    private GetAggregatedCandlesResponse(Builder builder) {
        this.aggregations = builder.aggregations;
        this.request = builder.request;
    }

    public Aggregation[] getAggregations() {
        return aggregations;
    }

    public void setAggregations(Aggregation[] aggregations) {
        this.aggregations = aggregations;
    }

    public GetAggregatedCandlesRequest getRequest() {
        return request;
    }

    public void setRequest(GetAggregatedCandlesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Aggregation[] aggregations;
        private GetAggregatedCandlesRequest request;

        public Builder() {}

        public Builder aggregations(Aggregation[] aggregations) {
            this.aggregations = aggregations;
            return this;
        }

        public Builder request(GetAggregatedCandlesRequest request) {
            this.request = request;
            return this;
        }

        public GetAggregatedCandlesResponse build() {
            return new GetAggregatedCandlesResponse(this);
        }
    }
}
