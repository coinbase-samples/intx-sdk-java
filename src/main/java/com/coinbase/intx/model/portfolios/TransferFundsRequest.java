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

public class TransferFundsRequest extends CoinbasePostRequest {
    private String from;
    private String to;
    private String asset;
    private String amount;

    public TransferFundsRequest() {}

    private TransferFundsRequest(Builder builder) {
        this.from = builder.from;
        this.to = builder.to;
        this.asset = builder.asset;
        this.amount = builder.amount;
    }

    @Override
    public String getPath() {
        return "/portfolios/transfer";
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAsset() {
        return asset;
    }

    public String getAmount() {
        return amount;
    }

    public static class Builder {
        private String from;
        private String to;
        private String asset;
        private String amount;

        public Builder() {}

        public Builder from(String from) {
            this.from = from;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        public Builder amount(String amount) {
            this.amount = amount;
            return this;
        }

        public TransferFundsRequest build() {
            return new TransferFundsRequest(this);
        }
    }
}
