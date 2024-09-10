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
public class CreateCryptoAddressRequest {
    @JsonProperty("portfolio")
    private String portfolio;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("network_arn_id")
    private String networkArnId;

    public CreateCryptoAddressRequest() {}

    private CreateCryptoAddressRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.asset = builder.asset;
        this.networkArnId = builder.networkArnId;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public String getAsset() {
        return asset;
    }

    public String getNetworkArnId() {
        return networkArnId;
    }

    public static class Builder {
        private String portfolio;
        private String asset;
        private String networkArnId;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        public Builder networkArnId(String networkArnId) {
            this.networkArnId = networkArnId;
            return this;
        }

        public CreateCryptoAddressRequest build() {
            return new CreateCryptoAddressRequest(this);
        }
    }
}
