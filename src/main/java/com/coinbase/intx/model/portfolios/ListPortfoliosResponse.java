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

import java.util.List;

public class ListPortfoliosResponse {
    @JsonProperty("portfolios")
    private List<Portfolio> portfolios;

    public ListPortfoliosResponse() {}

    private ListPortfoliosResponse(Builder builder) {
        this.portfolios = builder.portfolios;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public static class Builder {
        private List<Portfolio> portfolios;

        public Builder portfolios(List<Portfolio> portfolios) {
            this.portfolios = portfolios;
            return this;
        }

        public ListPortfoliosResponse build() {
            return new ListPortfoliosResponse(this);
        }
    }
}
