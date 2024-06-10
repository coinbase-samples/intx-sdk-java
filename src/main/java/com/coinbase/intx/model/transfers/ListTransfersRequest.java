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

package com.coinbase.intx.model.transfers;

import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendQueryParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListTransfersRequest extends CoinbaseGetRequest {
    @JsonProperty("portfolios")
    private String portfolios;

    @JsonProperty("time_from")
    private String timeFrom;

    @JsonProperty("time_to")
    private String timeTo;

    @JsonProperty("result_limit")
    private Integer resultLimit;

    @JsonProperty("result_offset")
    private Integer resultOffset;

    @JsonProperty("status")
    private String status;

    @JsonProperty("type")
    private String type;

    public ListTransfersRequest() {}

    private ListTransfersRequest(Builder builder) {
        this.portfolios = builder.portfolios;
        this.timeFrom = builder.timeFrom;
        this.timeTo = builder.timeTo;
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
        this.status = builder.status;
        this.type = builder.type;
    }

    @Override
    public String getPath() {
        return "/transfers";
    }

    @Override
    public String getQueryString() {
        String queryParams = appendQueryParams("", "portfolios", portfolios);
        queryParams = appendQueryParams(queryParams, "time_from", timeFrom);
        queryParams = appendQueryParams(queryParams, "time_to", timeTo);
        queryParams = appendQueryParams(queryParams, "result_limit", resultLimit.toString());
        queryParams = appendQueryParams(queryParams, "result_offset", resultOffset.toString());
        queryParams = appendQueryParams(queryParams, "status", status);
        queryParams = appendQueryParams(queryParams, "type", type);
        return queryParams;
    }

    public static class Builder {
        private String portfolios;
        private String timeFrom;
        private String timeTo;
        private Integer resultLimit;
        private Integer resultOffset;
        private String status;
        private String type;

        public Builder() {}

        public Builder portfolios(String portfolios) {
            this.portfolios = portfolios;
            return this;
        }

        public Builder timeFrom(String timeFrom) {
            this.timeFrom = timeFrom;
            return this;
        }

        public Builder timeTo(String timeTo) {
            this.timeTo = timeTo;
            return this;
        }

        public Builder resultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        public Builder resultOffset(Integer resultOffset) {
            this.resultOffset = resultOffset;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ListTransfersRequest build() {
            return new ListTransfersRequest(this);
        }
    }
}
