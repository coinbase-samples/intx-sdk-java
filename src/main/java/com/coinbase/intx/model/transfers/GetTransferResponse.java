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

public class GetTransferResponse {
    @JsonProperty("transfer")
    private Transfer transfer;

    public GetTransferResponse() {}

    private GetTransferResponse(Builder builder) {
        this.transfer = builder.transfer;
    }

    public Transfer getTransfer() {
        return transfer;
    }

    public void setTransfer(Transfer transfer) {
        this.transfer = transfer;
    }

    public static class Builder {
        private Transfer transfer;

        public Builder() {}

        public Builder transfer(Transfer transfer) {
            this.transfer = transfer;
            return this;
        }

        public GetTransferResponse build() {
            return new GetTransferResponse(this);
        }
    }
}
