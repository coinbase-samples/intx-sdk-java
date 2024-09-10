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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioBalancesResponse {

    @JsonProperty("balances")
    private List<PortfolioBalance> balances;

    public ListPortfolioBalancesResponse() {}

    private ListPortfolioBalancesResponse(Builder builder) {
        this.balances = builder.balances;
    }

    public List<PortfolioBalance> getBalances() {
        return balances;
    }

    public void setBalances(List<PortfolioBalance> balances) {
        this.balances = balances;
    }

    public static class Builder {
        private List<PortfolioBalance> balances;

        public Builder() {}

        public Builder balances(List<PortfolioBalance> balances) {
            this.balances = balances;
            return this;
        }

        public ListPortfolioBalancesResponse build() {
            return new ListPortfolioBalancesResponse(this);
        }
    }
}
