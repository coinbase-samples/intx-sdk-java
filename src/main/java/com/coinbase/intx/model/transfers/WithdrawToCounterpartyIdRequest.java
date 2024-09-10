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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WithdrawToCounterpartyIdRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("counterparty_id")
    private String counterpartyId;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("nonce")
    private Integer nonce;

    public WithdrawToCounterpartyIdRequest() {}

    private WithdrawToCounterpartyIdRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.counterpartyId = builder.counterpartyId;
        this.asset = builder.asset;
        this.amount = builder.amount;
        this.nonce = builder.nonce;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getCounterpartyId() {
        return counterpartyId;
    }

    public String getAsset() {
        return asset;
    }

    public String getAmount() {
        return amount;
    }

    public Integer getNonce() {
        return nonce;
    }

    public static class Builder {
        private String portfolio;
        private String counterpartyId;
        private String asset;
        private String amount;
        private Integer nonce;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
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

        public Builder nonce(Integer nonce) {
            this.nonce = nonce;
            return this;
        }

        public WithdrawToCounterpartyIdRequest build() {
            return new WithdrawToCounterpartyIdRequest(this);
        }
    }
}
