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

public class ValidateCounterpartyIdResponse {
    @JsonProperty("counterparty_id")
    private String counterpartyId;

    @JsonProperty("valid")
    private boolean valid;

    public ValidateCounterpartyIdResponse() {}

    private ValidateCounterpartyIdResponse(Builder builder) {
        this.counterpartyId = builder.counterpartyId;
        this.valid = builder.valid;
    }

    public String getCounterpartyId() {
        return counterpartyId;
    }

    public void setCounterpartyId(String counterpartyId) {
        this.counterpartyId = counterpartyId;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public static class Builder {
        private String counterpartyId;
        private boolean valid;

        public Builder() {}

        public Builder counterpartyId(String counterpartyId) {
            this.counterpartyId = counterpartyId;
            return this;
        }

        public Builder valid(boolean valid) {
            this.valid = valid;
            return this;
        }

        public ValidateCounterpartyIdResponse build() {
            return new ValidateCounterpartyIdResponse(this);
        }
    }
}
