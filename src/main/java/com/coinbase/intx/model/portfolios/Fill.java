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

public class Fill {

    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("portfolio_name")
    private String portfolioName;

    @JsonProperty("fill_id")
    private String fillId;

    @JsonProperty("exec_id")
    private String execId;

    @JsonProperty("order_id")
    private String orderId;

    @JsonProperty("instrument_id")
    private String instrumentId;

    @JsonProperty("instrument_uuid")
    private String instrumentUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("match_id")
    private String matchId;

    @JsonProperty("fill_price")
    private String fillPrice;

    @JsonProperty("fill_qty")
    private String fillQty;

    @JsonProperty("client_id")
    private String clientId;

    @JsonProperty("client_order_id")
    private String clientOrderId;

    @JsonProperty("order_qty")
    private String orderQty;

    @JsonProperty("limit_price")
    private String limitPrice;

    @JsonProperty("total_filled")
    private String totalFilled;

    @JsonProperty("filled_vwap")
    private String filledVwap;

    @JsonProperty("expire_time")
    private String expireTime;

    @JsonProperty("stop_price")
    private String stopPrice;

    @JsonProperty("side")
    private String side;

    @JsonProperty("tif")
    private String tif;

    @JsonProperty("stp_mode")
    private String stpMode;

    @JsonProperty("flags")
    private String flags;

    @JsonProperty("fee")
    private String fee;

    @JsonProperty("fee_asset")
    private String feeAsset;

    @JsonProperty("order_status")
    private String orderStatus;

    @JsonProperty("event_time")
    private String eventTime;

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

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getFillId() {
        return fillId;
    }

    public void setFillId(String fillId) {
        this.fillId = fillId;
    }

    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getFillPrice() {
        return fillPrice;
    }

    public void setFillPrice(String fillPrice) {
        this.fillPrice = fillPrice;
    }

    public String getFillQty() {
        return fillQty;
    }

    public void setFillQty(String fillQty) {
        this.fillQty = fillQty;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(String orderQty) {
        this.orderQty = orderQty;
    }

    public String getLimitPrice() {
        return limitPrice;
    }

    public void setLimitPrice(String limitPrice) {
        this.limitPrice = limitPrice;
    }

    public String getTotalFilled() {
        return totalFilled;
    }

    public void setTotalFilled(String totalFilled) {
        this.totalFilled = totalFilled;
    }

    public String getFilledVwap() {
        return filledVwap;
    }

    public void setFilledVwap(String filledVwap) {
        this.filledVwap = filledVwap;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public String getStopPrice() {
        return stopPrice;
    }

    public void setStopPrice(String stopPrice) {
        this.stopPrice = stopPrice;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getTif() {
        return tif;
    }

    public void setTif(String tif) {
        this.tif = tif;
    }

    public String getStpMode() {
        return stpMode;
    }

    public void setStpMode(String stpMode) {
        this.stpMode = stpMode;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public String getFeeAsset() {
        return feeAsset;
    }

    public void setFeeAsset(String feeAsset) {
        this.feeAsset = feeAsset;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }
}
