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

public class ListAssetsResponse {

    @JsonUnwrapped
    private List<Asset> assets;

    private ListAssetsRequest request;

    public ListAssetsResponse() {}

    public ListAssetsResponse(Builder builder) {
        this.assets = builder.assets;
        this.request = builder.request;
    }

    public List<Asset> getAssets() {
        return assets;
    }

    public void setAssets(List<Asset> assets) {
        this.assets = assets;
    }

    public ListAssetsRequest getRequest() {
        return request;
    }

    public void setRequest(ListAssetsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private List<Asset> assets;
        private ListAssetsRequest request;

        public Builder() {}

        public Builder assets(List<Asset> assets) {
            this.assets = assets;
            return this;
        }

        public Builder request(ListAssetsRequest request) {
            this.request = request;
            return this;
        }

        public ListAssetsResponse build() {
            return new ListAssetsResponse(this);
        }
    }
}
