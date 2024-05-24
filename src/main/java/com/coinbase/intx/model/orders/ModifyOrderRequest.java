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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModifyOrderRequest {
    @JsonProperty("id")
    private String id;

    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("price")
    private String price;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("size")
    private String size;

    public ModifyOrderRequest() {}

    private ModifyOrderRequest(Builder builder) {
        this.id = builder.id;
        this.portfolio = builder.portfolio;
        this.clientOrderId = builder.clientOrderId;
        this.price = builder.price;
        this.stopPrice = builder.stopPrice;
        this.size = builder.size;
    }

    public String getId() {
        return id;
    }

    public static class Builder {
        private String id;
        private String portfolio;
        private String clientOrderId;
        private String price;
        private String stopPrice;
        private String size;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
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

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public ModifyOrderRequest build() {
            return new ModifyOrderRequest(this);
        }
    }
}
