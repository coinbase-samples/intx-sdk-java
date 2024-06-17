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

public class Instrument {

    @JsonProperty("instrument_id")
    private String instrumentId;

    @JsonProperty("instrument_uuid")
    private String instrumentUuid;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("type")
    private String type;

    @JsonProperty("base_asset_id")
    private String baseAssetId;

    @JsonProperty("base_asset_uuid")
    private String baseAssetUuid;

    @JsonProperty("base_asset_name")
    private String baseAssetName;

    @JsonProperty("quote_asset_id")
    private String quoteAssetId;

    @JsonProperty("quote_asset_uuid")
    private String quoteAssetUuid;

    @JsonProperty("quote_asset_name")
    private String quoteAssetName;

    @JsonProperty("base_increment")
    private String baseIncrement;

    @JsonProperty("quote_increment")
    private String quoteIncrement;

    @JsonProperty("price_band_percent")
    private double priceBandPercent;

    @JsonProperty("market_order_percent")
    private double marketOrderPercent;

    @JsonProperty("qty_24hr")
    private String qty24hr;

    @JsonProperty("notional_24hr")
    private String notional24hr;

    @JsonProperty("avg_daily_qty")
    private String avgDailyQty;

    @JsonProperty("avg_daily_notional")
    private String avgDailyNotional;

    @JsonProperty("previous_day_qty")
    private String previousDayQty;

    @JsonProperty("open_interest")
    private String openInterest;

    @JsonProperty("position_limit_qty")
    private String positionLimitQty;

    @JsonProperty("position_limit_adq_pct")
    private double positionLimitAdqPct;

    @JsonProperty("replacement_cost")
    private String replacementCost;

    @JsonProperty("base_imf")
    private double baseImf;

    @JsonProperty("default_imf")
    private String defaultImf;

    @JsonProperty("min_notional_value")
    private String minNotionalValue;

    @JsonProperty("funding_interval")
    private String fundingInterval;

    @JsonProperty("trading_state")
    private String tradingState;

    @JsonProperty("quote")
    private Quote quote;

    @JsonProperty("mode")
    private String mode;

    @JsonProperty("base_asset_multiplier")
    private String baseAssetMultiplier;

    public Instrument() {
    }

    public Instrument(Builder builder) {
        this.instrumentId = builder.instrumentId;
        this.instrumentUuid = builder.instrumentUuid;
        this.symbol = builder.symbol;
        this.type = builder.type;
        this.baseAssetId = builder.baseAssetId;
        this.baseAssetUuid = builder.baseAssetUuid;
        this.baseAssetName = builder.baseAssetName;
        this.quoteAssetId = builder.quoteAssetId;
        this.quoteAssetUuid = builder.quoteAssetUuid;
        this.quoteAssetName = builder.quoteAssetName;
        this.baseIncrement = builder.baseIncrement;
        this.quoteIncrement = builder.quoteIncrement;
        this.priceBandPercent = builder.priceBandPercent;
        this.marketOrderPercent = builder.marketOrderPercent;
        this.qty24hr = builder.qty24hr;
        this.notional24hr = builder.notional24hr;
        this.avgDailyQty = builder.avgDailyQty;
        this.avgDailyNotional = builder.avgDailyNotional;
        this.previousDayQty = builder.previousDayQty;
        this.openInterest = builder.openInterest;
        this.positionLimitQty = builder.positionLimitQty;
        this.positionLimitAdqPct = builder.positionLimitAdqPct;
        this.replacementCost = builder.replacementCost;
        this.baseImf = builder.baseImf;
        this.defaultImf = builder.defaultImf;
        this.minNotionalValue = builder.minNotionalValue;
        this.fundingInterval = builder.fundingInterval;
        this.tradingState = builder.tradingState;
        this.quote = builder.quote;
        this.mode = builder.mode;
        this.baseAssetMultiplier = builder.baseAssetMultiplier;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBaseAssetId() {
        return baseAssetId;
    }

    public void setBaseAssetId(String baseAssetId) {
        this.baseAssetId = baseAssetId;
    }

    public String getBaseAssetUuid() {
        return baseAssetUuid;
    }

    public void setBaseAssetUuid(String baseAssetUuid) {
        this.baseAssetUuid = baseAssetUuid;
    }

    public String getBaseAssetName() {
        return baseAssetName;
    }

    public void setBaseAssetName(String baseAssetName) {
        this.baseAssetName = baseAssetName;
    }

    public String getQuoteAssetId() {
        return quoteAssetId;
    }

    public void setQuoteAssetId(String quoteAssetId) {
        this.quoteAssetId = quoteAssetId;
    }

    public String getQuoteAssetUuid() {
        return quoteAssetUuid;
    }

    public void setQuoteAssetUuid(String quoteAssetUuid) {
        this.quoteAssetUuid = quoteAssetUuid;
    }

    public String getQuoteAssetName() {
        return quoteAssetName;
    }

    public void setQuoteAssetName(String quoteAssetName) {
        this.quoteAssetName = quoteAssetName;
    }

    public String getBaseIncrement() {
        return baseIncrement;
    }

    public void setBaseIncrement(String baseIncrement) {
        this.baseIncrement = baseIncrement;
    }

    public String getQuoteIncrement() {
        return quoteIncrement;
    }

    public void setQuoteIncrement(String quoteIncrement) {
        this.quoteIncrement = quoteIncrement;
    }

    public double getPriceBandPercent() {
        return priceBandPercent;
    }

    public void setPriceBandPercent(double priceBandPercent) {
        this.priceBandPercent = priceBandPercent;
    }

    public double getMarketOrderPercent() {
        return marketOrderPercent;
    }

    public void setMarketOrderPercent(double marketOrderPercent) {
        this.marketOrderPercent = marketOrderPercent;
    }

    public String getQty24hr() {
        return qty24hr;
    }

    public void setQty24hr(String qty24hr) {
        this.qty24hr = qty24hr;
    }

    public String getNotional24hr() {
        return notional24hr;
    }

    public void setNotional24hr(String notional24hr) {
        this.notional24hr = notional24hr;
    }

    public String getAvgDailyQty() {
        return avgDailyQty;
    }

    public void setAvgDailyQty(String avgDailyQty) {
        this.avgDailyQty = avgDailyQty;
    }

    public String getAvgDailyNotional() {
        return avgDailyNotional;
    }

    public void setAvgDailyNotional(String avgDailyNotional) {
        this.avgDailyNotional = avgDailyNotional;
    }

    public String getPreviousDayQty() {
        return previousDayQty;
    }

    public void setPreviousDayQty(String previousDayQty) {
        this.previousDayQty = previousDayQty;
    }

    public String getOpenInterest() {
        return openInterest;
    }

    public void setOpenInterest(String openInterest) {
        this.openInterest = openInterest;
    }

    public String getPositionLimitQty() {
        return positionLimitQty;
    }

    public void setPositionLimitQty(String positionLimitQty) {
        this.positionLimitQty = positionLimitQty;
    }

    public double getPositionLimitAdqPct() {
        return positionLimitAdqPct;
    }

    public void setPositionLimitAdqPct(double positionLimitAdqPct) {
        this.positionLimitAdqPct = positionLimitAdqPct;
    }

    public String getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(String replacementCost) {
        this.replacementCost = replacementCost;
    }

    public double getBaseImf() {
        return baseImf;
    }

    public void setBaseImf(double baseImf) {
        this.baseImf = baseImf;
    }

    public String getDefaultImf() {
        return defaultImf;
    }

    public void setDefaultImf(String defaultImf) {
        this.defaultImf = defaultImf;
    }

    public String getMinNotionalValue() {
        return minNotionalValue;
    }

    public void setMinNotionalValue(String minNotionalValue) {
        this.minNotionalValue = minNotionalValue;
    }

    public String getFundingInterval() {
        return fundingInterval;
    }

    public void setFundingInterval(String fundingInterval) {
        this.fundingInterval = fundingInterval;
    }

    public String getTradingState() {
        return tradingState;
    }

    public void setTradingState(String tradingState) {
        this.tradingState = tradingState;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getBaseAssetMultiplier() {
        return baseAssetMultiplier;
    }

    public void setBaseAssetMultiplier(String baseAssetMultiplier) {
        this.baseAssetMultiplier = baseAssetMultiplier;
    }

    public static class Builder {
        private String instrumentId;
        private String instrumentUuid;
        private String symbol;
        private String type;
        private String baseAssetId;
        private String baseAssetUuid;
        private String baseAssetName;
        private String quoteAssetId;
        private String quoteAssetUuid;
        private String quoteAssetName;
        private String baseIncrement;
        private String quoteIncrement;
        private double priceBandPercent;
        private double marketOrderPercent;
        private String qty24hr;
        private String notional24hr;
        private String avgDailyQty;
        private String avgDailyNotional;
        private String previousDayQty;
        private String openInterest;
        private String positionLimitQty;
        private double positionLimitAdqPct;
        private String replacementCost;
        private double baseImf;
        private String defaultImf;
        private String minNotionalValue;
        private String fundingInterval;
        private String tradingState;
        private Quote quote;
        private String mode;
        private String baseAssetMultiplier;

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

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder baseAssetId(String baseAssetId) {
            this.baseAssetId = baseAssetId;
            return this;
        }

        public Builder baseAssetUuid(String baseAssetUuid) {
            this.baseAssetUuid = baseAssetUuid;
            return this;
        }

        public Builder baseAssetName(String baseAssetName) {
            this.baseAssetName = baseAssetName;
            return this;
        }

        public Builder quoteAssetId(String quoteAssetId) {
            this.quoteAssetId = quoteAssetId;
            return this;
        }

        public Builder quoteAssetUuid(String quoteAssetUuid) {
            this.quoteAssetUuid = quoteAssetUuid;
            return this;
        }

        public Builder quoteAssetName(String quoteAssetName) {
            this.quoteAssetName = quoteAssetName;
            return this;
        }

        public Builder baseIncrement(String baseIncrement) {
            this.baseIncrement = baseIncrement;
            return this;
        }

        public Builder quoteIncrement(String quoteIncrement) {
            this.quoteIncrement = quoteIncrement;
            return this;
        }

        public Builder priceBandPercent(double priceBandPercent) {
            this.priceBandPercent = priceBandPercent;
            return this;
        }

        public Builder marketOrderPercent(double marketOrderPercent) {
            this.marketOrderPercent = marketOrderPercent;
            return this;
        }

        public Builder qty24hr(String qty24hr) {
            this.qty24hr = qty24hr;
            return this;
        }

        public Builder notional24hr(String notional24hr) {
            this.notional24hr = notional24hr;
            return this;
        }

        public Builder avgDailyQty(String avgDailyQty) {
            this.avgDailyQty = avgDailyQty;
            return this;
        }

        public Builder avgDailyNotional(String avgDailyNotional) {
            this.avgDailyNotional = avgDailyNotional;
            return this;
        }

        public Builder previousDayQty(String previousDayQty) {
            this.previousDayQty = previousDayQty;
            return this;
        }

        public Builder openInterest(String openInterest) {
            this.openInterest = openInterest;
            return this;
        }

        public Builder positionLimitQty(String positionLimitQty) {
            this.positionLimitQty = positionLimitQty;
            return this;
        }

        public Builder positionLimitAdqPct(double positionLimitAdqPct) {
            this.positionLimitAdqPct = positionLimitAdqPct;
            return this;
        }

        public Builder replacementCost(String replacementCost) {
            this.replacementCost = replacementCost;
            return this;
        }

        public Builder baseImf(double baseImf) {
            this.baseImf = baseImf;
            return this;
        }

        public Builder defaultImf(String defaultImf) {
            this.defaultImf = defaultImf;
            return this;
        }

        public Builder minNotionalValue(String minNotionalValue) {
            this.minNotionalValue = minNotionalValue;
            return this;
        }

        public Builder fundingInterval(String fundingInterval) {
            this.fundingInterval = fundingInterval;
            return this;
        }

        public Builder tradingState(String tradingState) {
            this.tradingState = tradingState;
            return this;
        }

        public Builder quote(Quote quote) {
            this.quote = quote;
            return this;
        }

        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        public Instrument build() {
            return new Instrument(this);
        }

        public Builder baseAssetMultiplier(String baseAssetMultiplier) {
            this.baseAssetMultiplier = baseAssetMultiplier;
            return this;
        }
    }
}