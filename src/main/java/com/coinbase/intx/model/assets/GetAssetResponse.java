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

public class GetAssetResponse {

    private Asset asset;
    private GetAssetRequest request;

    public GetAssetResponse() {}

    private GetAssetResponse(Builder builder) {
        this.asset = builder.asset;
        this.request = builder.request;
    }

    public Asset getAsset() {
        return asset;
    }

    public void setAsset(Asset asset) {
        this.asset = asset;
    }

    public GetAssetRequest getRequest() {
        return request;
    }

    public void setRequest(GetAssetRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Asset asset;
        private GetAssetRequest request;

        public Builder() {}

        public Builder asset(Asset asset) {
            this.asset = asset;
            return this;
        }

        public Builder request(GetAssetRequest request) {
            this.request = request;
            return this;
        }

        public GetAssetResponse build() {
            return new GetAssetResponse(this);
        }
    }
}
