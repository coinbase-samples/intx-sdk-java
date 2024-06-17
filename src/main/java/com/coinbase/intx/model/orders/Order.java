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

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order {
    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("side")
    private String side;

    @JsonProperty("instrument_id")
    private String instrumentId;

    @JsonProperty("instrument_uuid")
    private String instrumentUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("type")
    private String type;

    @JsonProperty("price")
    private String price;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("stop_limit_price")
    private String stopLimitPrice;

    @JsonProperty("size")
    private String size;

    @JsonProperty("tif")
    private String tif;

    @JsonProperty("expire_time")
    private String expireTime;

    @JsonProperty("stp_mode")
    private String stpMode;

    @JsonProperty("event_type")
    private String eventType;

    @JsonProperty("event_time")
    private String eventTime;

    @JsonProperty("submit_time")
    private String submitTime;

    @JsonProperty("order_status")
    private String orderStatus;

    @JsonProperty("leaves_qty")
    private String leavesQty;

    @JsonProperty("exec_qty")
    private String execQty;

    @JsonProperty("avg_price")
    private String avgPrice;

    @JsonProperty("fee")
    private String fee;

    @JsonProperty("post_only")
    private Boolean postOnly;

    @JsonProperty("close_only")
    private Boolean closeOnly;

    public Order() {}

    private Order(Builder builder) {
        this.orderId = builder.orderId;
        this.clientOrderId = builder.clientOrderId;
        this.side = builder.side;
        this.instrumentId = builder.instrumentId;
        this.instrumentUuid = builder.instrumentUuid;
        this.symbol = builder.symbol;
        this.portfolioId = builder.portfolioId;
        this.portfolioUuid = builder.portfolioUuid;
        this.type = builder.type;
        this.price = builder.price;
        this.stopPrice = builder.stopPrice;
        this.stopLimitPrice = builder.stopLimitPrice;
        this.size = builder.size;
        this.tif = builder.tif;
        this.expireTime = builder.expireTime;
        this.stpMode = builder.stpMode;
        this.eventType = builder.eventType;
        this.eventTime = builder.eventTime;
        this.submitTime = builder.submitTime;
        this.orderStatus = builder.orderStatus;
        this.leavesQty = builder.leavesQty;
        this.execQty = builder.execQty;
        this.avgPrice = builder.avgPrice;
        this.fee = builder.fee;
        this.postOnly = builder.postOnly;
        this.closeOnly = builder.closeOnly;
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

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getInstrumentUuid() {
        return instrumentUuid;
    }

    public void setInstrumentUuid(String instrumentUuid) {
        this.instrumentUuid = instrumentUuid;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public String getStopLimitPrice() {
        return stopLimitPrice;
    }

    public void setStopLimitPrice(String stopLimitPrice) {
        this.stopLimitPrice = stopLimitPrice;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getStpMode() {
        return stpMode;
    }

    public void setStpMode(String stpMode) {
        this.stpMode = stpMode;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getLeavesQty() {
        return leavesQty;
    }

    public void setLeavesQty(String leavesQty) {
        this.leavesQty = leavesQty;
    }

    public String getExecQty() {
        return execQty;
    }

    public void setExecQty(String execQty) {
        this.execQty = execQty;
    }

    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public boolean getPostOnly() {
        return postOnly;
    }

    public void setPostOnly(boolean postOnly) {
        this.postOnly = postOnly;
    }

    public boolean getCloseOnly() {
        return closeOnly;
    }

    public void setCloseOnly(boolean closeOnly) {
        this.closeOnly = closeOnly;
    }

    public static class Builder {
        private String orderId;
        private String clientOrderId;
        private String side;
        private String instrumentId;
        private String instrumentUuid;
        private String symbol;
        private String portfolioId;
        private String portfolioUuid;
        private String type;
        private String price;
        private String stopPrice;
        private String stopLimitPrice;
        private String size;
        private String tif;
        private String expireTime;
        private String stpMode;
        private String eventType;
        private String eventTime;
        private String submitTime;
        private String orderStatus;
        private String leavesQty;
        private String execQty;
        private String avgPrice;
        private String fee;
        private Boolean postOnly;
        private Boolean closeOnly;

        public Builder() {}

        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        public Builder clientOrderId(String clientOrderId) {
            this.clientOrderId = clientOrderId;
            return this;
        }

        public Builder side(String side) {
            this.side = side;
            return this;
        }

        public Builder instrumentId(String instrumentId) {
            this.instrumentId = instrumentId;
            return this;
        }

        public Builder instrumentUuid(String instrumentUuid) {
            this.instrumentUuid = instrumentUuid;
            return this;
        }

        public Builder symbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder price(String price) {
            this.price = price;
            return this;
        }

        public Builder stopPrice(String stopPrice) {
            this.stopPrice = stopPrice;
            return this;
        }

        public Builder stopLimitPrice(String stopLimitPrice) {
            this.stopLimitPrice = stopLimitPrice;
            return this;
        }

        public Builder size(String size) {
            this.size = size;
            return this;
        }

        public Builder tif(String tif) {
            this.tif = tif;
            return this;
        }

        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        public Builder stpMode(String stpMode) {
            this.stpMode = stpMode;
            return this;
        }

        public Builder eventType(String eventType) {
            this.eventType = eventType;
            return this;
        }

        public Builder eventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder submitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }

        public Builder orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }

        public Builder leavesQty(String leavesQty) {
            this.leavesQty = leavesQty;
            return this;
        }

        public Builder execQty(String execQty) {
            this.execQty = execQty;
            return this;
        }

        public Builder avgPrice(String avgPrice) {
            this.avgPrice = avgPrice;
            return this;
        }

        public Builder fee(String fee) {
            this.fee = fee;
            return this;
        }

        public Builder postOnly(Boolean postOnly) {
            this.postOnly = postOnly;
            return this;
        }

        public Builder closeOnly(Boolean closeOnly) {
            this.closeOnly = closeOnly;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}
