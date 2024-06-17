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

public class Portfolio {

    @JsonProperty("portfolio_id")
    private String portfolioId;

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("name")
    private String name;

    @JsonProperty("user_uuid")
    private String userUuid;

    @JsonProperty("maker_fee_rate")
    private String makerFeeRate;

    @JsonProperty("taker_fee_rate")
    private String takerFeeRate;

    @JsonProperty("trading_lock")
    private boolean tradingLock;

    @JsonProperty("withdrawal_lock")
    private boolean withdrawalLock;

    @JsonProperty("borrow_disabled")
    private boolean borrowDisabled;

    @JsonProperty("is_lsp")
    private boolean isLsp;

    @JsonProperty("is_default")
    private boolean isDefault;

    @JsonProperty("cross_collateral_enabled")
    private boolean crossCollateralEnabled;

    @JsonProperty("auto_margin_enabled")
    private boolean autoMarginEnabled;

    @JsonProperty("pre_launch_trading_enabled")
    private boolean preLaunchTradingEnabled;

    @JsonProperty("position_offsets_enabled")
    private boolean positionOffsetsEnabled;

    public Portfolio() {}

    public Portfolio(Builder builder) {
        this.portfolioId = builder.portfolioId;
        this.portfolioUuid = builder.portfolioUuid;
        this.name = builder.name;
        this.userUuid = builder.userUuid;
        this.makerFeeRate = builder.makerFeeRate;
        this.takerFeeRate = builder.takerFeeRate;
        this.tradingLock = builder.tradingLock;
        this.withdrawalLock = builder.withdrawalLock;
        this.borrowDisabled = builder.borrowDisabled;
        this.isLsp = builder.isLsp;
        this.isDefault = builder.isDefault;
        this.crossCollateralEnabled = builder.crossCollateralEnabled;
        this.autoMarginEnabled = builder.autoMarginEnabled;
        this.preLaunchTradingEnabled = builder.preLaunchTradingEnabled;
        this.positionOffsetsEnabled = builder.positionOffsetsEnabled;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getMakerFeeRate() {
        return makerFeeRate;
    }

    public void setMakerFeeRate(String makerFeeRate) {
        this.makerFeeRate = makerFeeRate;
    }

    public String getTakerFeeRate() {
        return takerFeeRate;
    }

    public void setTakerFeeRate(String takerFeeRate) {
        this.takerFeeRate = takerFeeRate;
    }

    public boolean isTradingLock() {
        return tradingLock;
    }

    public void setTradingLock(boolean tradingLock) {
        this.tradingLock = tradingLock;
    }

    public boolean isWithdrawalLock() {
        return withdrawalLock;
    }

    public void setWithdrawalLock(boolean withdrawalLock) {
        this.withdrawalLock = withdrawalLock;
    }

    public boolean isBorrowDisabled() {
        return borrowDisabled;
    }

    public void setBorrowDisabled(boolean borrowDisabled) {
        this.borrowDisabled = borrowDisabled;
    }

    public boolean isLsp() {
        return isLsp;
    }

    public void setLsp(boolean lsp) {
        isLsp = lsp;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean aDefault) {
        isDefault = aDefault;
    }

    public boolean isCrossCollateralEnabled() {
        return crossCollateralEnabled;
    }

    public void setCrossCollateralEnabled(boolean crossCollateralEnabled) {
        this.crossCollateralEnabled = crossCollateralEnabled;
    }

    public boolean isAutoMarginEnabled() {
        return autoMarginEnabled;
    }

    public void setAutoMarginEnabled(boolean autoMarginEnabled) {
        this.autoMarginEnabled = autoMarginEnabled;
    }

    public boolean isPreLaunchTradingEnabled() {
        return preLaunchTradingEnabled;
    }

    public void setPreLaunchTradingEnabled(boolean preLaunchTradingEnabled) {
        this.preLaunchTradingEnabled = preLaunchTradingEnabled;
    }

    public boolean isPositionOffsetsEnabled() {
        return positionOffsetsEnabled;
    }

    public void setPositionOffsetsEnabled(boolean positionOffsetsEnabled) {
        this.positionOffsetsEnabled = positionOffsetsEnabled;
    }

    public static class Builder {
        private String portfolioId;
        private String portfolioUuid;
        private String name;
        private String userUuid;
        private String makerFeeRate;
        private String takerFeeRate;
        private boolean tradingLock;
        private boolean withdrawalLock;
        private boolean borrowDisabled;
        private boolean isLsp;
        private boolean isDefault;
        private boolean crossCollateralEnabled;
        private boolean autoMarginEnabled;
        private boolean preLaunchTradingEnabled;
        private boolean positionOffsetsEnabled;

        public Builder() {}

        public Builder portfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder userUuid(String userUuid) {
            this.userUuid = userUuid;
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

        public Builder tradingLock(boolean tradingLock) {
            this.tradingLock = tradingLock;
            return this;
        }

        public Builder withdrawalLock(boolean withdrawalLock) {
            this.withdrawalLock = withdrawalLock;
            return this;
        }

        public Builder borrowDisabled(boolean borrowDisabled) {
            this.borrowDisabled = borrowDisabled;
            return this;
        }

        public Builder isLsp(boolean isLsp) {
            this.isLsp = isLsp;
            return this;
        }

        public Builder isDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder crossCollateralEnabled(boolean crossCollateralEnabled) {
            this.crossCollateralEnabled = crossCollateralEnabled;
            return this;
        }

        public Builder autoMarginEnabled(boolean autoMarginEnabled) {
            this.autoMarginEnabled = autoMarginEnabled;
            return this;
        }

        public Builder preLaunchTradingEnabled(boolean preLaunchTradingEnabled) {
            this.preLaunchTradingEnabled = preLaunchTradingEnabled;
            return this;
        }

        public Builder positionOffsetsEnabled(boolean positionOffsetsEnabled) {
            this.positionOffsetsEnabled = positionOffsetsEnabled;
            return this;
        }

        public Portfolio build() {
            return new Portfolio(this);
        }
    }
}
