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

public class CreateCounterpartyIdResponse {
    @JsonProperty("counterparty")
    private Counterparty counterparty;

    public CreateCounterpartyIdResponse() {}

    private CreateCounterpartyIdResponse(Builder builder) {
        this.counterparty = builder.counterparty;
    }

    public Counterparty getCounterparty() {
        return counterparty;
    }

    public void setCounterparty(Counterparty counterparty) {
        this.counterparty = counterparty;
    }

    public static class Builder {
        private Counterparty counterparty;

        public Builder() {}

        public Builder counterparty(Counterparty counterparty) {
            this.counterparty = counterparty;
            return this;
        }

        public CreateCounterpartyIdResponse build() {
            return new CreateCounterpartyIdResponse(this);
        }
    }
}
