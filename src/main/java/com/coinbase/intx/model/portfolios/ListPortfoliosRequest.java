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

import com.coinbase.core.http.CoinbaseGetRequest;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListPortfoliosRequest {
    @Override
    protected String getQueryString() {
        return "";
    }

    @Override
    protected String getPath() {
        return "/portfolios";
    }

    public static class Builder {
        public Builder() {}

        public ListPortfoliosRequest build() {
            return new ListPortfoliosRequest();
        }
    }
}
