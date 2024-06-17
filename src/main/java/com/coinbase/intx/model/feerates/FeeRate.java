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

package com.coinbase.intx.model.feerates;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FeeRate {
    @JsonProperty("fee_tier_type")
    private String feeTierType;

    @JsonProperty("instrument_type")
    private String instrumentType;

    @JsonProperty("fee_tier_id")
    private int feeTierId;

    @JsonProperty("fee_tier_name")
    private String feeTierName;

    @JsonProperty("maker_fee_rate")
    private double makerFeeRate;

    @JsonProperty("taker_fee_rate")
    private double takerFeeRate;

    @JsonProperty("rebate_rate")
    private double rebateRate;

    @JsonProperty("min_balance")
    private double minBalance;

    @JsonProperty("min_volume")
    private double minVolume;

    @JsonProperty("require_balance_and_volume")
    private boolean requireBalanceAndVolume;

    public FeeRate() {}

    private FeeRate(Builder builder) {
        this.feeTierType = builder.feeTierType;
        this.instrumentType = builder.instrumentType;
        this.feeTierId = builder.feeTierId;
        this.feeTierName = builder.feeTierName;
        this.makerFeeRate = builder.makerFeeRate;
        this.takerFeeRate = builder.takerFeeRate;
        this.rebateRate = builder.rebateRate;
        this.minBalance = builder.minBalance;
        this.minVolume = builder.minVolume;
        this.requireBalanceAndVolume = builder.requireBalanceAndVolume;
    }

    public String getFeeTierType() {
        return feeTierType;
    }

    public void setFeeTierType(String feeTierType) {
        this.feeTierType = feeTierType;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public int getFeeTierId() {
        return feeTierId;
    }

    public void setFeeTierId(int feeTierId) {
        this.feeTierId = feeTierId;
    }

    public String getFeeTierName() {
        return feeTierName;
    }

    public void setFeeTierName(String feeTierName) {
        this.feeTierName = feeTierName;
    }

    public double getMakerFeeRate() {
        return makerFeeRate;
    }

    public void setMakerFeeRate(double makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    public double getTakerFeeRate() {
        return takerFeeRate;
    }

    public void setTakerFeeRate(double takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    public double getRebateRate() {
        return rebateRate;
    }

    public void setRebateRate(double rebateRate) {
        this.rebateRate = rebateRate;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public void setMinBalance(double minBalance) {
        this.minBalance = minBalance;
    }

    public double getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(double minVolume) {
        this.minVolume = minVolume;
    }

    public boolean isRequireBalanceAndVolume() {
        return requireBalanceAndVolume;
    }

    public void setRequireBalanceAndVolume(boolean requireBalanceAndVolume) {
        this.requireBalanceAndVolume = requireBalanceAndVolume;
    }

    public static class Builder {
        private String feeTierType;
        private String instrumentType;
        private int feeTierId;
        private String feeTierName;
        private double makerFeeRate;
        private double takerFeeRate;
        private double rebateRate;
        private double minBalance;
        private double minVolume;
        private boolean requireBalanceAndVolume;

        public Builder() {}

        public Builder feeTierType(String feeTierType) {
            this.feeTierType = feeTierType;
            return this;
        }

        public Builder instrumentType(String instrumentType) {
            this.instrumentType = instrumentType;
            return this;
        }

        public Builder feeTierId(int feeTierId) {
            this.feeTierId = feeTierId;
            return this;
        }

        public Builder feeTierName(String feeTierName) {
            this.feeTierName = feeTierName;
            return this;
        }

        public Builder makerFeeRate(double makerFeeRate) {
            this.makerFeeRate = makerFeeRate;
            return this;
        }

        public Builder takerFeeRate(double takerFeeRate) {
            this.takerFeeRate = takerFeeRate;
            return this;
        }

        public Builder rebateRate(double rebateRate) {
            this.rebateRate = rebateRate;
            return this;
        }

        public Builder minBalance(double minBalance) {
            this.minBalance = minBalance;
            return this;
        }

        public Builder minVolume(double minVolume) {
            this.minVolume = minVolume;
            return this;
        }

        public Builder requireBalanceAndVolume(boolean requireBalanceAndVolume) {
            this.requireBalanceAndVolume = requireBalanceAndVolume;
            return this;
        }

        public FeeRate build() {
            return new FeeRate(this);
        }
    }
}
