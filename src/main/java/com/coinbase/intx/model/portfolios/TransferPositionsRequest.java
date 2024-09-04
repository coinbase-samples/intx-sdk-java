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

import com.coinbase.core.http.CoinbasePostRequest;

public class TransferPositionsRequest {
    private String from;
    private String to;
    private String instrument;
    private String quantity;
    private String side;

    public TransferPositionsRequest() {}

    private TransferPositionsRequest(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.instrument = builder.instrument;
        this.quantity = builder.quantity;
        this.side = builder.side;
    }

    @Override
    public String getPath() {
        return "/portfolios/transfer-position";
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getSide() {
        return side;
    }

    public static class Builder {
        private String from;
        private String to;
        private String instrument;
        private String quantity;
        private String side;

        public Builder() {}

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder instrument(String instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder quantity(String quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public TransferPositionsRequest build() {
            return new TransferPositionsRequest(this);
        }
    }
}
