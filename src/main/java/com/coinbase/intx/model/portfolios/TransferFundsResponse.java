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

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransferFundsResponse {
    @JsonProperty("success")
    private boolean success;

    @JsonProperty("request")
    private TransferFundsRequest request;

    public TransferFundsResponse() {}

    private TransferFundsResponse(Builder builder) {
        this.success = builder.success;
        this.request = builder.request;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public TransferFundsRequest getRequest() {
        return request;
    }

    public void setRequest(TransferFundsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private boolean success;
        private TransferFundsRequest request;

        public Builder() {}

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder request(TransferFundsRequest request) {
            this.request = request;
            return this;
        }

        public TransferFundsResponse build() {
            return new TransferFundsResponse(this);
        }
    }
}
