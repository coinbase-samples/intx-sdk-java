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

package com.coinbase.intx.model.orders;

import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendQueryParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListOrdersRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("instrument")
    private String instrument;

    @JsonProperty("instrument_type")
    private String instrumentType;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("order_type")
    private String orderType;

    @JsonProperty("side")
    private String side;

    @JsonProperty("ref_datetime")
    private String refDatetime;

    @JsonProperty("result_limit")
    private Integer resultLimit;

    @JsonProperty("result_offset")
    private Integer resultOffset;

    public ListOrdersRequest() {}

    private ListOrdersRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.instrument = builder.instrument;
        this.instrumentType = builder.instrumentType;
        this.clientOrderId = builder.clientOrderId;
        this.eventType = builder.eventType;
        this.orderType = builder.orderType;
        this.side = builder.side;
        this.refDatetime = builder.refDatetime;
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
    }

    @Override
    public String getPath() {
        return "/orders";
    }

    @Override
    public String getQueryString() {
        String queryParams = appendQueryParams("", "portfolio", portfolio);
        queryParams = appendQueryParams(queryParams, "instrument", instrument);
        queryParams = appendQueryParams(queryParams, "instrument_type", instrumentType);
        queryParams = appendQueryParams(queryParams, "client_order_id", clientOrderId);
        queryParams = appendQueryParams(queryParams, "event_type", eventType);
        queryParams = appendQueryParams(queryParams, "order_type", orderType);
        queryParams = appendQueryParams(queryParams, "side", side);
        queryParams = appendQueryParams(queryParams, "ref_datetime", refDatetime);
        queryParams = appendQueryParams(queryParams, "result_limit", resultLimit.toString());
        queryParams = appendQueryParams(queryParams, "result_offset", resultOffset.toString());
        return queryParams;
    }

    public static class Builder {
        private String portfolio;
        private String instrument;
        private String instrumentType;
        private String clientOrderId;
        private String eventType;
        private String orderType;
        private String side;
        private String refDatetime;
        private Integer resultLimit;
        private Integer resultOffset;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder instrument(String instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder instrumentType(String instrumentType) {
            this.instrumentType = instrumentType;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder refDatetime(String refDatetime) {
            this.refDatetime = refDatetime;
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

        public ListOrdersRequest build() {
            return new ListOrdersRequest(this);
        }
    }
}
