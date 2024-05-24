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

package com.coinbase.intx.model.assets;

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.List;

public class GetSupportedNetworksResponse {

    @JsonUnwrapped
    private List<SupportedNetwork> networks;

    private GetSupportedNetworksRequest request;

    public GetSupportedNetworksResponse() {}

    private GetSupportedNetworksResponse(Builder builder) {
        this.networks = builder.networks;
        this.request = builder.request;
    }

    public List<SupportedNetwork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<SupportedNetwork> networks) {
        this.networks = networks;
    }

    public GetSupportedNetworksRequest getRequest() {
        return request;
    }

    public void setRequest(GetSupportedNetworksRequest request) {
        this.request = request;
    }

    public static class Builder {
        private List<SupportedNetwork> networks;
        private GetSupportedNetworksRequest request;

        public Builder() {}

        public Builder networks(List<SupportedNetwork> networks) {
            this.networks = networks;
            return this;
        }

        public Builder request(GetSupportedNetworksRequest request) {
            this.request = request;
            return this;
        }

        public GetSupportedNetworksResponse build() {
            return new GetSupportedNetworksResponse(this);
        }
    }
}
