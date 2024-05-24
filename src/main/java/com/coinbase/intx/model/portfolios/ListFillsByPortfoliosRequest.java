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

import com.coinbase.intx.utils.Utils;

public class ListFillsByPortfoliosRequest {
    private String[] portfolios;
    private String orderId;
    private String clientOrderId;
    private String refDatetime;
    private Integer resultLimit;
    private Integer resultOffset;
    private String timeFrom;

    public ListFillsByPortfoliosRequest() {}

    private ListFillsByPortfoliosRequest(Builder builder) {
        this.portfolios = builder.portfolios;
        this.orderId = builder.orderId;
        this.clientOrderId = builder.clientOrderId;
        this.refDatetime = builder.refDatetime;
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
        this.timeFrom = builder.timeFrom;
    }

    public String[] getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(String[] portfolios) {
        this.portfolios = portfolios;
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

    public Integer getResultLimit() {
        return resultLimit;
    }

    public void setResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
    }

    public Integer getResultOffset() {
        return resultOffset;
    }

    public void setResultOffset(Integer resultOffset) {
        this.resultOffset = resultOffset;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getQueryString() {
        String queryParams = "";
        for (String portfolio : this.portfolios) {
            queryParams = Utils.appendQueryParams(queryParams, "portfolios", portfolio);
        }
        if (this.orderId != null) {
            queryParams = Utils.appendQueryParams(queryParams, "order_id", this.orderId);
        }
        if (this.clientOrderId != null) {
            queryParams = Utils.appendQueryParams(queryParams, "client_order_id", this.clientOrderId);
        }
        if (this.refDatetime != null) {
            queryParams = Utils.appendQueryParams(queryParams, "ref_datetime", this.refDatetime);
        }
        if (this.resultLimit != null) {
            queryParams = Utils.appendQueryParams(queryParams, "result_limit", String.valueOf(this.resultLimit));
        }
        if (this.resultOffset != null) {
            queryParams = Utils.appendQueryParams(queryParams, "result_offset", String.valueOf(this.resultOffset));
        }
        if (this.timeFrom != null) {
            queryParams = Utils.appendQueryParams(queryParams, "time_from", this.timeFrom);
        }
        return queryParams;
    }

    public static class Builder {
        private String[] portfolios;
        private String orderId;
        private String clientOrderId;
        private String refDatetime;
        private Integer resultLimit;
        private Integer resultOffset;
        private String timeFrom;

        public Builder() {}

        public Builder portfolios(String[] portfolios) {
            this.portfolios = portfolios;
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

        public Builder resultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        public Builder resultOffset(Integer resultOffset) {
            this.resultOffset = resultOffset;
            return this;
        }

        public Builder timeFrom(String timeFrom) {
            this.timeFrom = timeFrom;
            return this;
        }

        public ListFillsByPortfoliosRequest build() {
            return new ListFillsByPortfoliosRequest(this);
        }
    }
}
