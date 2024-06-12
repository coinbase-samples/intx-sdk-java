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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;


public class GetAssetRequest extends CoinbaseGetRequest {
    private String assetId;

    public GetAssetRequest() {}

    private GetAssetRequest(Builder builder) {
        this.assetId = builder.assetId;
    }

    @Override
    public String getPath() {
        return String.format("/assets/%s", this.getAssetId());
    }

    @Override
    public String getQueryString() {
        return "";
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public static class Builder {
        private String assetId;

        public Builder assetId(String assetId) {
            this.assetId = assetId;
            return this;
        }

        public GetAssetRequest build() throws CoinbaseClientException {
            this.validate();
            return new GetAssetRequest(this);
        }

        private void validate() {
            if (isNullOrEmpty(assetId)) {
                throw new CoinbaseClientException("assetId is required");
            }
        }
    }
}
