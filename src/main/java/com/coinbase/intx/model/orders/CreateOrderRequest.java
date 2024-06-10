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

import com.coinbase.core.http.CoinbasePostRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateOrderRequest extends CoinbasePostRequest {
    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("size")
    private String size;

    @JsonProperty("tif")
    private String tif;

    @JsonProperty("instrument")
    private String instrument;

    @JsonProperty("type")
    private String type;

    @JsonProperty("price")
    private String price;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("stop_limit_price")
    private String stopLimitPrice;

    @JsonProperty("expire_time")
    private String expireTime;

    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("user")
    private String user;

    @JsonProperty("stp_mode")
    private String stpMode;

    @JsonProperty("post_only")
    private boolean postOnly;

    public CreateOrderRequest() {}

    private CreateOrderRequest(Builder builder) {
        this.clientOrderId = builder.clientOrderId;
        this.side = builder.side;
        this.size = builder.size;
        this.tif = builder.tif;
        this.instrument = builder.instrument;
        this.type = builder.type;
        this.price = builder.price;
        this.stopPrice = builder.stopPrice;
        this.stopLimitPrice = builder.stopLimitPrice;
        this.expireTime = builder.expireTime;
        this.portfolio = builder.portfolio;
        this.user = builder.user;
        this.stpMode = builder.stpMode;
        this.postOnly = builder.postOnly;
    }

    @Override
    public String getPath() {
        return "/orders";
    }

    public static class Builder {
        private String clientOrderId;
        private String side;
        private String size;
        private String tif;
        private String instrument;
        private String type;
        private String price;
        private String stopPrice;
        private String stopLimitPrice;
        private String expireTime;
        private String portfolio;
        private String user;
        private String stpMode;
        private boolean postOnly;

        public Builder() {}

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder tif(String tif) {
            this.tif = tif;
            return this;
        }

        public Builder instrument(String instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder stopLimitPrice(String stopLimitPrice) {
            this.stopLimitPrice = stopLimitPrice;
            return this;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder user(String user) {
            this.user = user;
            return this;
        }

        public Builder stpMode(String stpMode) {
            this.stpMode = stpMode;
            return this;
        }

        public Builder postOnly(boolean postOnly) {
            this.postOnly = postOnly;
            return this;
        }

        public CreateOrderRequest build() {
            return new CreateOrderRequest(this);
        }
    }
}
