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

import com.coinbase.core.errors.CoinbaseClientException;
import com.fasterxml.jackson.annotation.JsonIgnore;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class ListPortfolioFillsRequest {
    @JsonIgnore
    private String portfolio;
    private String orderId;
    private String clientOrderId;
    private String refDatetime;
    private int resultLimit;
    private int resultOffset;
    private String timeFrom;

    public ListPortfolioFillsRequest() {}

    private ListPortfolioFillsRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.orderId = builder.orderId;
        this.clientOrderId = builder.clientOrderId;
        this.refDatetime = builder.refDatetime;
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
        this.timeFrom = builder.timeFrom;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getRefDatetime() {
        return refDatetime;
    }

    public void setRefDatetime(String refDatetime) {
        this.refDatetime = refDatetime;
    }

    public int getResultLimit() {
        return resultLimit;
    }

    public void setResultLimit(int resultLimit) {
        this.resultLimit = resultLimit;
    }

    public int getResultOffset() {
        return resultOffset;
    }

    public void setResultOffset(int resultOffset) {
        this.resultOffset = resultOffset;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public static class Builder {
        private String portfolio;
        private String orderId;
        private String clientOrderId;
        private String refDatetime;
        private int resultLimit;
        private int resultOffset;
        private String timeFrom;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder refDatetime(String refDatetime) {
            this.refDatetime = refDatetime;
            return this;
        }

        public Builder resultLimit(int resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        public Builder resultOffset(int resultOffset) {
            this.resultOffset = resultOffset;
            return this;
        }

        public Builder timeFrom(String timeFrom) {
            this.timeFrom = timeFrom;
            return this;
        }

        public ListPortfolioFillsRequest build() throws CoinbaseClientException {
            validate();
            return new ListPortfolioFillsRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.portfolio)) {
                throw new CoinbaseClientException("Portfolio is required");
            }
        }
    }
}
