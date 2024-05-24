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

package com.coinbase.intx.model.instruments;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Quote {

    @JsonProperty("best_bid_price")
    private String bestBidPrice;

    @JsonProperty("best_bid_size")
    private String bestBidSize;

    @JsonProperty("best_ask_price")
    private String bestAskPrice;

    @JsonProperty("best_ask_size")
    private String bestAskSize;

    @JsonProperty("trade_price")
    private String tradePrice;

    @JsonProperty("trade_qty")
    private String tradeQty;

    @JsonProperty("index_price")
    private String indexPrice;

    @JsonProperty("mark_price")
    private String markPrice;

    @JsonProperty("settlement_price")
    private String settlementPrice;

    @JsonProperty("limit_up")
    private String limitUp;

    @JsonProperty("limit_down")
    private String limitDown;

    @JsonProperty("predicted_funding")
    private String predictedFunding;

    @JsonProperty("timestamp")
    private String timestamp;

    public Quote() {
    }

    public Quote(Builder builder) {
        this.bestBidPrice = builder.bestBidPrice;
        this.bestBidSize = builder.bestBidSize;
        this.bestAskPrice = builder.bestAskPrice;
        this.bestAskSize = builder.bestAskSize;
        this.tradePrice = builder.tradePrice;
        this.tradeQty = builder.tradeQty;
        this.indexPrice = builder.indexPrice;
        this.markPrice = builder.markPrice;
        this.settlementPrice = builder.settlementPrice;
        this.limitUp = builder.limitUp;
        this.limitDown = builder.limitDown;
        this.predictedFunding = builder.predictedFunding;
        this.timestamp = builder.timestamp;
    }

    public String getBestBidPrice() {
        return bestBidPrice;
    }

    public String getBestBidSize() {
        return bestBidSize;
    }

    public String getBestAskPrice() {
        return bestAskPrice;
    }

    public String getBestAskSize() {
        return bestAskSize;
    }

    public String getTradePrice() {
        return tradePrice;
    }

    public String getTradeQty() {
        return tradeQty;
    }

    public String getIndexPrice() {
        return indexPrice;
    }

    public String getMarkPrice() {
        return markPrice;
    }

    public String getSettlementPrice() {
        return settlementPrice;
    }

    public String getLimitUp() {
        return limitUp;
    }

    public String getLimitDown() {
        return limitDown;
    }

    public String getPredictedFunding() {
        return predictedFunding;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public static class Builder {
        private String bestBidPrice;
        private String bestBidSize;
        private String bestAskPrice;
        private String bestAskSize;
        private String tradePrice;
        private String tradeQty;
        private String indexPrice;
        private String markPrice;
        private String settlementPrice;
        private String limitUp;
        private String limitDown;
        private String predictedFunding;
        private String timestamp;

        public Builder bestBidPrice(String bestBidPrice) {
            this.bestBidPrice = bestBidPrice;
            return this;
        }

        public Builder bestBidSize(String bestBidSize) {
            this.bestBidSize = bestBidSize;
            return this;
        }

        public Builder bestAskPrice(String bestAskPrice) {
            this.bestAskPrice = bestAskPrice;
            return this;
        }

        public Builder bestAskSize(String bestAskSize) {
            this.bestAskSize = bestAskSize;
            return this;
        }

        public Builder tradePrice(String tradePrice) {
            this.tradePrice = tradePrice;
            return this;
        }

        public Builder tradeQty(String tradeQty) {
            this.tradeQty = tradeQty;
            return this;
        }

        public Builder indexPrice(String indexPrice) {
            this.indexPrice = indexPrice;
            return this;
        }

        public Builder markPrice(String markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        public Builder settlementPrice(String settlementPrice) {
            this.settlementPrice = settlementPrice;
            return this;
        }

        public Builder limitUp(String limitUp) {
            this.limitUp = limitUp;
            return this;
        }

        public Builder limitDown(String limitDown) {
            this.limitDown = limitDown;
            return this;
        }

        public Builder predictedFunding(String predictedFunding) {
            this.predictedFunding = predictedFunding;
            return this;
        }

        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Quote build() {
            Quote quote = new Quote();
            quote.bestBidPrice = this.bestBidPrice;
            quote.bestBidSize = this.bestBidSize;
            quote.bestAskPrice = this.bestAskPrice;
            quote.bestAskSize = this.bestAskSize;
            quote.tradePrice = this.tradePrice;
            quote.tradeQty = this.tradeQty;
            quote.indexPrice = this.indexPrice;
            quote.markPrice = this.markPrice;
            quote.settlementPrice = this.settlementPrice;
            quote.limitUp = this.limitUp;
            quote.limitDown = this.limitDown;
            quote.predictedFunding = this.predictedFunding;
            quote.timestamp = this.timestamp;
            return quote;
        }
    }
}