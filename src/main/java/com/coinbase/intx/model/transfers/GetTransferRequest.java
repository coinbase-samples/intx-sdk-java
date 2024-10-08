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

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetTransferRequest {
    @JsonProperty("transfer_uuid")
    private String transferUuid;

    public GetTransferRequest() {}

    private GetTransferRequest(Builder builder) {
        this.transferUuid = builder.transferUuid;
    }

    public String getTransferUuid() {
        return transferUuid;
    }

    public void setTransferUuid(String transferUuid) {
        this.transferUuid = transferUuid;
    }

    public static class Builder {
        private String transferUuid;

        public Builder() {}

        public Builder transferUuid(String transferUuid) {
            this.transferUuid = transferUuid;
            return this;
        }

        public GetTransferRequest build() throws CoinbaseClientException {
            validate();
            return new GetTransferRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(transferUuid)) {
                throw new CoinbaseClientException("Transfer UUID is required");
            }
        }
    }
}
