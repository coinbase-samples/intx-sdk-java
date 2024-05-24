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

public class WithdrawToCryptoAddressResponse {
    @JsonProperty("idem")
    private String idem;

    public WithdrawToCryptoAddressResponse() {}

    private WithdrawToCryptoAddressResponse(Builder builder) {
        this.idem = builder.idem;
    }

    public String getIdem() {
        return idem;
    }

    public void setIdem(String idem) {
        this.idem = idem;
    }

    public static class Builder {
        private String idem;

        public Builder() {}

        public Builder idem(String idem) {
            this.idem = idem;
            return this;
        }

        public WithdrawToCryptoAddressResponse build() {
            return new WithdrawToCryptoAddressResponse(this);
        }
    }
}
