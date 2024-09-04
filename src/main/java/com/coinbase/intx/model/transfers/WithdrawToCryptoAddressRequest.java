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

import com.coinbase.core.http.CoinbasePostRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class WithdrawToCryptoAddressRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("amount")
    private String amount;

    @JsonProperty("add_network_fee_to_total")
    private Boolean addNetworkFeeToTotal;

    @JsonProperty("network_arn_id")
    private String networkArnId;

    @JsonProperty("address")
    private String address;

    @JsonProperty("nonce")
    private Integer nonce;

    public WithdrawToCryptoAddressRequest() {}

    private WithdrawToCryptoAddressRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.asset = builder.asset;
        this.amount = builder.amount;
        this.addNetworkFeeToTotal = builder.addNetworkFeeToTotal;
        this.networkArnId = builder.networkArnId;
        this.address = builder.address;
        this.nonce = builder.nonce;
    }

    @Override
    public String getPath() {
        return "/transfers/withdraw";
    }

    public static class Builder {
        private String portfolio;
        private String asset;
        private String amount;
        private Boolean addNetworkFeeToTotal;
        private String networkArnId;
        private String address;
        private Integer nonce;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
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

        public Builder addNetworkFeeToTotal(Boolean addNetworkFeeToTotal) {
            this.addNetworkFeeToTotal = addNetworkFeeToTotal;
            return this;
        }

        public Builder networkArnId(String networkArnId) {
            this.networkArnId = networkArnId;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder nonce(Integer nonce) {
            this.nonce = nonce;
            return this;
        }

        public WithdrawToCryptoAddressRequest build() {
            return new WithdrawToCryptoAddressRequest(this);
        }
    }
}
