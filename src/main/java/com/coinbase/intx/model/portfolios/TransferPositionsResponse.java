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

public class TransferPositionsResponse {
    @JsonProperty("success")
    private boolean success;

    public TransferPositionsResponse() {}

    private TransferPositionsResponse(Builder builder) {
        this.success = builder.success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class Builder {
        private boolean success;

        public Builder() {}

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public TransferPositionsResponse build() {
            return new TransferPositionsResponse(this);
        }
    }
}
