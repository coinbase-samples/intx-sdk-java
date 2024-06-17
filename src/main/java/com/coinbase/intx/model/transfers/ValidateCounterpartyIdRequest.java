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

import com.coinbase.core.http.CoinbasePostRequest;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ValidateCounterpartyIdRequest extends CoinbasePostRequest {
    @JsonProperty("counterparty_id")
    private String counterpartyId;

    public ValidateCounterpartyIdRequest() {}

    private ValidateCounterpartyIdRequest(Builder builder) {
        this.counterpartyId = builder.counterpartyId;
    }

    @Override
    public String getPath() {
        return "/transfers/validate-counterparty-id";
    }

    public String getCounterpartyId() {
        return counterpartyId;
    }

    public static class Builder {
        private String counterpartyId;

        public Builder() {}

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        public ValidateCounterpartyIdRequest build() {
            return new ValidateCounterpartyIdRequest(this);
        }
    }
}
