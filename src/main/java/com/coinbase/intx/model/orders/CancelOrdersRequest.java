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

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelOrdersRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("instrument")
    private String instrument;

    @JsonProperty("side")
    private String side;

    @JsonProperty("instrument_type")
    private String instrumentType;

    public CancelOrdersRequest() {}

    private CancelOrdersRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.instrument = builder.instrument;
        this.side = builder.side;
        this.instrumentType = builder.instrumentType;
    }

    public static class Builder {
        private String portfolio;
        private String instrument;
        private String side;
        private String instrumentType;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder instrument(String instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder instrumentType(String instrumentType) {
            this.instrumentType = instrumentType;
            return this;
        }

        public CancelOrdersRequest build() {
            return new CancelOrdersRequest(this);
        }
    }
}
