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

public class PortfolioFeeRate {
    @JsonProperty("instrument_type")
    private String instrumentType;

    @JsonProperty("fee_tier_id")
    private String feeTierId;

    @JsonProperty("is_vip_tier")
    private boolean isVipTier;

    @JsonProperty("fee_tier_name")
    private String feeTierName;

    @JsonProperty("maker_fee_rate")
    private String makerFeeRate;

    @JsonProperty("taker_fee_rate")
    private String takerFeeRate;

    @JsonProperty("rebate_rate")
    private String rebateRate;

    @JsonProperty("is_override")
    private boolean isOverride;

    @JsonProperty("trailing_30day_volume")
    private String trailing30DayVolume;

    @JsonProperty("trailing_24hr_usdc_balance")
    private String trailing24HrUsdcBalance;

    public PortfolioFeeRate() {}

    private PortfolioFeeRate(Builder builder) {
        this.instrumentType = builder.instrumentType;
        this.feeTierId = builder.feeTierId;
        this.isVipTier = builder.isVipTier;
        this.feeTierName = builder.feeTierName;
        this.makerFeeRate = builder.makerFeeRate;
        this.takerFeeRate = builder.takerFeeRate;
        this.rebateRate = builder.rebateRate;
        this.isOverride = builder.isOverride;
        this.trailing30DayVolume = builder.trailing30DayVolume;
        this.trailing24HrUsdcBalance = builder.trailing24HrUsdcBalance;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public String getFeeTierId() {
        return feeTierId;
    }

    public boolean isVipTier() {
        return isVipTier;
    }

    public String getFeeTierName() {
        return feeTierName;
    }

    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    public String getRebateRate() {
        return rebateRate;
    }

    public boolean isOverride() {
        return isOverride;
    }

    public String getTrailing30DayVolume() {
        return trailing30DayVolume;
    }

    public String getTrailing24HrUsdcBalance() {
        return trailing24HrUsdcBalance;
    }

    public static class Builder {
        private String instrumentType;
        private String feeTierId;
        private boolean isVipTier;
        private String feeTierName;
        private String makerFeeRate;
        private String takerFeeRate;
        private String rebateRate;
        private boolean isOverride;
        private String trailing30DayVolume;
        private String trailing24HrUsdcBalance;

        public Builder() {}

        public Builder instrumentType(String instrumentType) {
            this.instrumentType = instrumentType;
            return this;
        }

        public Builder feeTierId(String feeTierId) {
            this.feeTierId = feeTierId;
            return this;
        }

        public Builder isVipTier(boolean isVipTier) {
            this.isVipTier = isVipTier;
            return this;
        }

        public Builder feeTierName(String feeTierName) {
            this.feeTierName = feeTierName;
            return this;
        }

        public Builder makerFeeRate(String makerFeeRate) {
            this.makerFeeRate = makerFeeRate;
            return this;
        }

        public Builder takerFeeRate(String takerFeeRate) {
            this.takerFeeRate = takerFeeRate;
            return this;
        }

        public Builder rebateRate(String rebateRate) {
            this.rebateRate = rebateRate;
            return this;
        }

        public Builder isOverride(boolean isOverride) {
            this.isOverride = isOverride;
            return this;
        }

        public Builder trailing30DayVolume(String trailing30DayVolume) {
            this.trailing30DayVolume = trailing30DayVolume;
            return this;
        }

        public Builder trailing24HrUsdcBalance(String trailing24HrUsdcBalance) {
            this.trailing24HrUsdcBalance = trailing24HrUsdcBalance;
            return this;
        }

        public PortfolioFeeRate build() {
            return new PortfolioFeeRate(this);
        }
    }
}
