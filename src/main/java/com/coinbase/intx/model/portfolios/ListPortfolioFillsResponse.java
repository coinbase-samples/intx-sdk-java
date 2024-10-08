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
import com.coinbase.intx.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioFillsResponse {

    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("results")
    private List<Fill> results;

    public ListPortfolioFillsResponse() {}

    private ListPortfolioFillsResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.results = builder.results;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Fill> getResults() {
        return results;
    }

    public void setResults(List<Fill> results) {
        this.results = results;
    }

    public static class Builder {
        private Pagination pagination;
        private List<Fill> results;

        public Builder() {}

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder results(List<Fill> results) {
            this.results = results;
            return this;
        }

        public ListPortfolioFillsResponse build() {
            return new ListPortfolioFillsResponse(this);
        }
    }
}
