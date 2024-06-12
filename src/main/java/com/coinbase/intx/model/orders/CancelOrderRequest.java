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

package com.coinbase.intx.model.orders;

import com.coinbase.core.http.CoinbaseDeleteRequest;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.coinbase.core.utils.Utils.appendQueryParams;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CancelOrderRequest extends CoinbaseDeleteRequest {
    @JsonProperty("id")
    private String id;

    @JsonProperty("portfolio")
    private String portfolio;

    public CancelOrderRequest() {}

    private CancelOrderRequest(Builder builder) {
        this.id = builder.id;
        this.portfolio = builder.portfolio;
    }

    @Override
    public String getPath() {
        return String.format("/orders/%s", this.getId());
    }

    @Override
    public String getQueryString() {
        return appendQueryParams("", "portfolio", this.getPortfolio());
    }

    public String getId() {
        return id;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public static class Builder {
        private String id;
        private String portfolio;

        public Builder() {}

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public CancelOrderRequest build() {
            validate();
            return new CancelOrderRequest(this);
        }

        private void validate() {
            if (id == null) {
                throw new IllegalArgumentException("Id is required");
            }
        }
    }
}
