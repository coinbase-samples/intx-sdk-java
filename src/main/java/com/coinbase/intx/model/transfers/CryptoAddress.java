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

import com.fasterxml.jackson.annotation.JsonProperty;

public class CryptoAddress {
    @JsonProperty("address")
    private String address;

    @JsonProperty("network_arn_id")
    private String networkArnId;

    @JsonProperty("destination_tag")
    private String destinationTag;

    public CryptoAddress() {}

    private CryptoAddress(Builder builder) {
        this.address = builder.address;
        this.networkArnId = builder.networkArnId;
        this.destinationTag = builder.destinationTag;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNetworkArnId() {
        return networkArnId;
    }

    public void setNetworkArnId(String networkArnId) {
        this.networkArnId = networkArnId;
    }

    public String getDestinationTag() {
        return destinationTag;
    }

    public void setDestinationTag(String destinationTag) {
        this.destinationTag = destinationTag;
    }

    public static class Builder {
        private String address;
        private String networkArnId;
        private String destinationTag;

        public Builder() {}

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder networkArnId(String networkArnId) {
            this.networkArnId = networkArnId;
            return this;
        }

        public Builder destinationTag(String destinationTag) {
            this.destinationTag = destinationTag;
            return this;
        }

        public CryptoAddress build() {
            return new CryptoAddress(this);
        }
    }
}
