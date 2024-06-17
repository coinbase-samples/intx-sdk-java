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

import java.util.List;

public class PortfolioDetail {

    @JsonProperty("summary")
    private Summary summary;

    @JsonProperty("balances")
    private List<Balance> balances;

    @JsonProperty("positions")
    private List<Position> positions;

    public PortfolioDetail() {}

    private PortfolioDetail(Builder builder) {
        this.summary = builder.summary;
        this.balances = builder.balances;
        this.positions = builder.positions;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Balance> getBalances() {
        return balances;
    }

    public void setBalances(List<Balance> balances) {
        this.balances = balances;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }

    public static class Builder {
        private Summary summary;
        private List<Balance> balances;
        private List<Position> positions;

        public Builder() {}

        public Builder summary(Summary summary) {
            this.summary = summary;
            return this;
        }

        public Builder balances(List<Balance> balances) {
            this.balances = balances;
            return this;
        }

        public Builder positions(List<Position> positions) {
            this.positions = positions;
            return this;
        }

        public PortfolioDetail build() {
            return new PortfolioDetail(this);
        }
    }

    public static class Summary {
        @JsonProperty("collateral")
        private String collateral;

        @JsonProperty("unrealized_pnl")
        private String unrealizedPnl;

        @JsonProperty("unrealized_pnl_percent")
        private String unrealizedPnlPercent;

        @JsonProperty("position_notional")
        private String positionNotional;

        @JsonProperty("open_position_notional")
        private String openPositionNotional;

        @JsonProperty("pending_fees")
        private String pendingFees;

        @JsonProperty("borrow")
        private String borrow;

        @JsonProperty("accrued_interest")
        private String accruedInterest;

        @JsonProperty("rolling_debt")
        private String rollingDebt;

        @JsonProperty("balance")
        private String balance;

        @JsonProperty("buying_power")
        private String buyingPower;

        @JsonProperty("portfolio_initial_margin")
        private double portfolioInitialMargin;

        @JsonProperty("portfolio_current_margin")
        private double portfolioCurrentMargin;

        @JsonProperty("portfolio_maintenance_margin")
        private double portfolioMaintenanceMargin;

        @JsonProperty("portfolio_close_out_margin")
        private double portfolioCloseOutMargin;

        @JsonProperty("in_liquidation")
        private boolean inLiquidation;

        @JsonProperty("portfolio_initial_margin_notional")
        private double portfolioInitialMarginNotional;

        @JsonProperty("portfolio_current_margin_notional")
        private double portfolioCurrentMarginNotional;

        @JsonProperty("portfolio_maintenance_margin_notional")
        private double portfolioMaintenanceMarginNotional;

        @JsonProperty("portfolio_close_out_margin_notional")
        private double portfolioCloseOutMarginNotional;

        @JsonProperty("margin_override")
        private double marginOverride;

        @JsonProperty("lock_up_initial_margin")
        private double lockUpInitialMargin;

        @JsonProperty("loan_collateral_requirement")
        private String loanCollateralRequirement;

        @JsonProperty("position_offset_notional")
        private double positionOffsetNotional;

        public Summary() {}

        private Summary(Builder builder) {
            this.collateral = builder.collateral;
            this.unrealizedPnl = builder.unrealizedPnl;
            this.unrealizedPnlPercent = builder.unrealizedPnlPercent;
            this.positionNotional = builder.positionNotional;
            this.openPositionNotional = builder.openPositionNotional;
            this.pendingFees = builder.pendingFees;
            this.borrow = builder.borrow;
            this.accruedInterest = builder.accruedInterest;
            this.rollingDebt = builder.rollingDebt;
            this.balance = builder.balance;
            this.buyingPower = builder.buyingPower;
            this.portfolioInitialMargin = builder.portfolioInitialMargin;
            this.portfolioCurrentMargin = builder.portfolioCurrentMargin;
            this.portfolioMaintenanceMargin = builder.portfolioMaintenanceMargin;
            this.portfolioCloseOutMargin = builder.portfolioCloseOutMargin;
            this.inLiquidation = builder.inLiquidation;
            this.portfolioInitialMarginNotional = builder.portfolioInitialMarginNotional;
            this.portfolioCurrentMarginNotional = builder.portfolioCurrentMarginNotional;
            this.portfolioMaintenanceMarginNotional = builder.portfolioMaintenanceMarginNotional;
            this.portfolioCloseOutMarginNotional = builder.portfolioCloseOutMarginNotional;
            this.marginOverride = builder.marginOverride;
            this.lockUpInitialMargin = builder.lockUpInitialMargin;
            this.loanCollateralRequirement = builder.loanCollateralRequirement;
            this.positionOffsetNotional = builder.positionOffsetNotional;
        }

        public String getCollateral() {
            return collateral;
        }

        public void setCollateral(String collateral) {
            this.collateral = collateral;
        }

        public String getUnrealizedPnl() {
            return unrealizedPnl;
        }

        public void setUnrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
        }

        public String getUnrealizedPnlPercent() {
            return unrealizedPnlPercent;
        }

        public void setUnrealizedPnlPercent(String unrealizedPnlPercent) {
            this.unrealizedPnlPercent = unrealizedPnlPercent;
        }

        public String getPositionNotional() {
            return positionNotional;
        }

        public void setPositionNotional(String positionNotional) {
            this.positionNotional = positionNotional;
        }

        public String getOpenPositionNotional() {
            return openPositionNotional;
        }

        public void setOpenPositionNotional(String openPositionNotional) {
            this.openPositionNotional = openPositionNotional;
        }

        public String getPendingFees() {
            return pendingFees;
        }

        public void setPendingFees(String pendingFees) {
            this.pendingFees = pendingFees;
        }

        public String getBorrow() {
            return borrow;
        }

        public void setBorrow(String borrow) {
            this.borrow = borrow;
        }

        public String getAccruedInterest() {
            return accruedInterest;
        }

        public void setAccruedInterest(String accruedInterest) {
            this.accruedInterest = accruedInterest;
        }

        public String getRollingDebt() {
            return rollingDebt;
        }

        public void setRollingDebt(String rollingDebt) {
            this.rollingDebt = rollingDebt;
        }

        public String getBalance() {
            return balance;
        }

        public void setBalance(String balance) {
            this.balance = balance;
        }

        public String getBuyingPower() {
            return buyingPower;
        }

        public void setBuyingPower(String buyingPower) {
            this.buyingPower = buyingPower;
        }

        public double getPortfolioInitialMargin() {
            return portfolioInitialMargin;
        }

        public void setPortfolioInitialMargin(double portfolioInitialMargin) {
            this.portfolioInitialMargin = portfolioInitialMargin;
        }

        public double getPortfolioCurrentMargin() {
            return portfolioCurrentMargin;
        }

        public void setPortfolioCurrentMargin(double portfolioCurrentMargin) {
            this.portfolioCurrentMargin = portfolioCurrentMargin;
        }

        public double getPortfolioMaintenanceMargin() {
            return portfolioMaintenanceMargin;
        }

        public void setPortfolioMaintenanceMargin(double portfolioMaintenanceMargin) {
            this.portfolioMaintenanceMargin = portfolioMaintenanceMargin;
        }

        public double getPortfolioCloseOutMargin() {
            return portfolioCloseOutMargin;
        }

        public void setPortfolioCloseOutMargin(double portfolioCloseOutMargin) {
            this.portfolioCloseOutMargin = portfolioCloseOutMargin;
        }

        public boolean isInLiquidation() {
            return inLiquidation;
        }

        public void setInLiquidation(boolean inLiquidation) {
            this.inLiquidation = inLiquidation;
        }

        public double getPortfolioInitialMarginNotional() {
            return portfolioInitialMarginNotional;
        }

        public void setPortfolioInitialMarginNotional(double portfolioInitialMarginNotional) {
            this.portfolioInitialMarginNotional = portfolioInitialMarginNotional;
        }

        public double getPortfolioCurrentMarginNotional() {
            return portfolioCurrentMarginNotional;
        }

        public void setPortfolioCurrentMarginNotional(double portfolioCurrentMarginNotional) {
            this.portfolioCurrentMarginNotional = portfolioCurrentMarginNotional;
        }

        public double getPortfolioMaintenanceMarginNotional() {
            return portfolioMaintenanceMarginNotional;
        }

        public void setPortfolioMaintenanceMarginNotional(double portfolioMaintenanceMarginNotional) {
            this.portfolioMaintenanceMarginNotional = portfolioMaintenanceMarginNotional;
        }

        public double getPortfolioCloseOutMarginNotional() {
            return portfolioCloseOutMarginNotional;
        }

        public void setPortfolioCloseOutMarginNotional(double portfolioCloseOutMarginNotional) {
            this.portfolioCloseOutMarginNotional = portfolioCloseOutMarginNotional;
        }

        public double getMarginOverride() {
            return marginOverride;
        }

        public void setMarginOverride(double marginOverride) {
            this.marginOverride = marginOverride;
        }

        public double getLockUpInitialMargin() {
            return lockUpInitialMargin;
        }

        public void setLockUpInitialMargin(double lockUpInitialMargin) {
            this.lockUpInitialMargin = lockUpInitialMargin;
        }

        public String getLoanCollateralRequirement() {
            return loanCollateralRequirement;
        }

        public void setLoanCollateralRequirement(String loanCollateralRequirement) {
            this.loanCollateralRequirement = loanCollateralRequirement;
        }

        public double getPositionOffsetNotional() {
            return positionOffsetNotional;
        }

        public void setPositionOffsetNotional(double positionOffsetNotional) {
            this.positionOffsetNotional = positionOffsetNotional;
        }

        public static class Builder {
            private String collateral;
            private String unrealizedPnl;
            private String unrealizedPnlPercent;
            private String positionNotional;
            private String openPositionNotional;
            private String pendingFees;
            private String borrow;
            private String accruedInterest;
            private String rollingDebt;
            private String balance;
            private String buyingPower;
            private double portfolioInitialMargin;
            private double portfolioCurrentMargin;
            private double portfolioMaintenanceMargin;
            private double portfolioCloseOutMargin;
            private boolean inLiquidation;
            private double portfolioInitialMarginNotional;
            private double portfolioCurrentMarginNotional;
            private double portfolioMaintenanceMarginNotional;
            private double portfolioCloseOutMarginNotional;
            private double marginOverride;
            private double lockUpInitialMargin;
            private String loanCollateralRequirement;
            private double positionOffsetNotional;

            public Builder() {}

            public Builder collateral(String collateral) {
                this.collateral = collateral;
                return this;
            }

            public Builder unrealizedPnl(String unrealizedPnl) {
                this.unrealizedPnl = unrealizedPnl;
                return this;
            }

            public Builder unrealizedPnlPercent(String unrealizedPnlPercent) {
                this.unrealizedPnlPercent = unrealizedPnlPercent;
                return this;
            }

            public Builder positionNotional(String positionNotional) {
                this.positionNotional = positionNotional;
                return this;
            }

            public Builder openPositionNotional(String openPositionNotional) {
                this.openPositionNotional = openPositionNotional;
                return this;
            }

            public Builder pendingFees(String pendingFees) {
                this.pendingFees = pendingFees;
                return this;
            }

            public Builder borrow(String borrow) {
                this.borrow = borrow;
                return this;
            }

            public Builder accruedInterest(String accruedInterest) {
                this.accruedInterest = accruedInterest;
                return this;
            }

            public Builder rollingDebt(String rollingDebt) {
                this.rollingDebt = rollingDebt;
                return this;
            }

            public Builder balance(String balance) {
                this.balance = balance;
                return this;
            }

            public Builder buyingPower(String buyingPower) {
                this.buyingPower = buyingPower;
                return this;
            }

            public Builder portfolioInitialMargin(double portfolioInitialMargin) {
                this.portfolioInitialMargin = portfolioInitialMargin;
                return this;
            }

            public Builder portfolioCurrentMargin(double portfolioCurrentMargin) {
                this.portfolioCurrentMargin = portfolioCurrentMargin;
                return this;
            }

            public Builder portfolioMaintenanceMargin(double portfolioMaintenanceMargin) {
                this.portfolioMaintenanceMargin = portfolioMaintenanceMargin;
                return this;
            }

            public Builder portfolioCloseOutMargin(double portfolioCloseOutMargin) {
                this.portfolioCloseOutMargin = portfolioCloseOutMargin;
                return this;
            }

            public Builder inLiquidation(boolean inLiquidation) {
                this.inLiquidation = inLiquidation;
                return this;
            }

            public Builder portfolioInitialMarginNotional(double portfolioInitialMarginNotional) {
                this.portfolioInitialMarginNotional = portfolioInitialMarginNotional;
                return this;
            }

            public Builder portfolioCurrentMarginNotional(double portfolioCurrentMarginNotional) {
                this.portfolioCurrentMarginNotional = portfolioCurrentMarginNotional;
                return this;
            }

            public Builder portfolioMaintenanceMarginNotional(double portfolioMaintenanceMarginNotional) {
                this.portfolioMaintenanceMarginNotional = portfolioMaintenanceMarginNotional;
                return this;
            }

            public Builder portfolioCloseOutMarginNotional(double portfolioCloseOutMarginNotional) {
                this.portfolioCloseOutMarginNotional = portfolioCloseOutMarginNotional;
                return this;
            }

            public Builder marginOverride(double marginOverride) {
                this.marginOverride = marginOverride;
                return this;
            }

            public Builder lockUpInitialMargin(double lockUpInitialMargin) {
                this.lockUpInitialMargin = lockUpInitialMargin;
                return this;
            }

            public Builder loanCollateralRequirement(String loanCollateralRequirement) {
                this.loanCollateralRequirement = loanCollateralRequirement;
                return this;
            }

            public Builder positionOffsetNotional(double positionOffsetNotional) {
                this.positionOffsetNotional = positionOffsetNotional;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            }
        }
    }

    public static class Balance {
        @JsonProperty("asset_id")
        private String assetId;

        @JsonProperty("asset_name")
        private String assetName;

        @JsonProperty("asset_uuid")
        private String assetUuid;

        @JsonProperty("quantity")
        private String quantity;

        @JsonProperty("hold")
        private String hold;

        @JsonProperty("hold_available_for_collateral")
        private String holdAvailableForCollateral;

        @JsonProperty("transfer_hold")
        private String transferHold;

        @JsonProperty("collateral_value")
        private String collateralValue;

        @JsonProperty("max_withdraw_amount")
        private String maxWithdrawAmount;

        @JsonProperty("loan")
        private String loan;

        @JsonProperty("loan_collateral_requirement")
        private String loanCollateralRequirement;

        @JsonProperty("pledged_collateral_quantity")
        private String pledgedCollateralQuantity;

        public Balance() {}

        private Balance(Builder builder) {
            this.assetId = builder.assetId;
            this.assetName = builder.assetName;
            this.assetUuid = builder.assetUuid;
            this.quantity = builder.quantity;
            this.hold = builder.hold;
            this.holdAvailableForCollateral = builder.holdAvailableForCollateral;
            this.transferHold = builder.transferHold;
            this.collateralValue = builder.collateralValue;
            this.maxWithdrawAmount = builder.maxWithdrawAmount;
            this.loan = builder.loan;
            this.loanCollateralRequirement = builder.loanCollateralRequirement;
            this.pledgedCollateralQuantity = builder.pledgedCollateralQuantity;
        }

        public String getAssetId() {
            return assetId;
        }

        public void setAssetId(String assetId) {
            this.assetId = assetId;
        }

        public String getAssetName() {
            return assetName;
        }

        public void setAssetName(String assetName) {
            this.assetName = assetName;
        }

        public String getAssetUuid() {
            return assetUuid;
        }

        public void setAssetUuid(String assetUuid) {
            this.assetUuid = assetUuid;
        }

        public String getQuantity() {
            return quantity;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public String getHold() {
            return hold;
        }

        public void setHold(String hold) {
            this.hold = hold;
        }

        public String getHoldAvailableForCollateral() {
            return holdAvailableForCollateral;
        }

        public void setHoldAvailableForCollateral(String holdAvailableForCollateral) {
            this.holdAvailableForCollateral = holdAvailableForCollateral;
        }

        public String getTransferHold() {
            return transferHold;
        }

        public void setTransferHold(String transferHold) {
            this.transferHold = transferHold;
        }

        public String getCollateralValue() {
            return collateralValue;
        }

        public void setCollateralValue(String collateralValue) {
            this.collateralValue = collateralValue;
        }

        public String getMaxWithdrawAmount() {
            return maxWithdrawAmount;
        }

        public void setMaxWithdrawAmount(String maxWithdrawAmount) {
            this.maxWithdrawAmount = maxWithdrawAmount;
        }

        public String getLoan() {
            return loan;
        }

        public void setLoan(String loan) {
            this.loan = loan;
        }

        public String getLoanCollateralRequirement() {
            return loanCollateralRequirement;
        }

        public void setLoanCollateralRequirement(String loanCollateralRequirement) {
            this.loanCollateralRequirement = loanCollateralRequirement;
        }

        public String getPledgedCollateralQuantity() {
            return pledgedCollateralQuantity;
        }

        public void setPledgedCollateralQuantity(String pledgedCollateralQuantity) {
            this.pledgedCollateralQuantity = pledgedCollateralQuantity;
        }

        public static class Builder {
            private String assetId;
            private String assetName;
            private String assetUuid;
            private String quantity;
            private String hold;
            private String holdAvailableForCollateral;
            private String transferHold;
            private String collateralValue;
            private String maxWithdrawAmount;
            private String loan;
            private String loanCollateralRequirement;
            private String pledgedCollateralQuantity;

            public Builder() {}

            public Builder assetId(String assetId) {
                this.assetId = assetId;
                return this;
            }

            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            public Builder assetUuid(String assetUuid) {
                this.assetUuid = assetUuid;
                return this;
            }

            public Builder quantity(String quantity) {
                this.quantity = quantity;
                return this;
            }

            public Builder hold(String hold) {
                this.hold = hold;
                return this;
            }

            public Builder holdAvailableForCollateral(String holdAvailableForCollateral) {
                this.holdAvailableForCollateral = holdAvailableForCollateral;
                return this;
            }

            public Builder transferHold(String transferHold) {
                this.transferHold = transferHold;
                return this;
            }

            public Builder collateralValue(String collateralValue) {
                this.collateralValue = collateralValue;
                return this;
            }

            public Builder maxWithdrawAmount(String maxWithdrawAmount) {
                this.maxWithdrawAmount = maxWithdrawAmount;
                return this;
            }

            public Builder loan(String loan) {
                this.loan = loan;
                return this;
            }

            public Builder loanCollateralRequirement(String loanCollateralRequirement) {
                this.loanCollateralRequirement = loanCollateralRequirement;
                return this;
            }

            public Builder pledgedCollateralQuantity(String pledgedCollateralQuantity) {
                this.pledgedCollateralQuantity = pledgedCollateralQuantity;
                return this;
            }

            public Balance build() {
                return new Balance(this);
            }
        }
    }

    public static class Position {
        @JsonProperty("id")
        private String id;

        @JsonProperty("symbol")
        private String symbol;

        @JsonProperty("instrument_id")
        private String instrumentId;

        @JsonProperty("instrument_uuid")
        private String instrumentUuid;

        @JsonProperty("vwap")
        private String vwap;

        @JsonProperty("net_size")
        private String netSize;

        @JsonProperty("buy_order_size")
        private String buyOrderSize;

        @JsonProperty("sell_order_size")
        private String sellOrderSize;

        @JsonProperty("im_contribution")
        private double imContribution;

        @JsonProperty("unrealized_pnl")
        private String unrealizedPnl;

        @JsonProperty("mark_price")
        private String markPrice;

        @JsonProperty("entry_vwap")
        private String entryVwap;

        public Position() {}

        private Position(Builder builder) {
            this.id = builder.id;
            this.symbol = builder.symbol;
            this.instrumentId = builder.instrumentId;
            this.instrumentUuid = builder.instrumentUuid;
            this.vwap = builder.vwap;
            this.netSize = builder.netSize;
            this.buyOrderSize = builder.buyOrderSize;
            this.sellOrderSize = builder.sellOrderSize;
            this.imContribution = builder.imContribution;
            this.unrealizedPnl = builder.unrealizedPnl;
            this.markPrice = builder.markPrice;
            this.entryVwap = builder.entryVwap;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
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

        public String getVwap() {
            return vwap;
        }

        public void setVwap(String vwap) {
            this.vwap = vwap;
        }

        public String getNetSize() {
            return netSize;
        }

        public void setNetSize(String netSize) {
            this.netSize = netSize;
        }

        public String getBuyOrderSize() {
            return buyOrderSize;
        }

        public void setBuyOrderSize(String buyOrderSize) {
            this.buyOrderSize = buyOrderSize;
        }

        public String getSellOrderSize() {
            return sellOrderSize;
        }

        public void setSellOrderSize(String sellOrderSize) {
            this.sellOrderSize = sellOrderSize;
        }

        public double getImContribution() {
            return imContribution;
        }

        public void setImContribution(double imContribution) {
            this.imContribution = imContribution;
        }

        public String getUnrealizedPnl() {
            return unrealizedPnl;
        }

        public void setUnrealizedPnl(String unrealizedPnl) {
            this.unrealizedPnl = unrealizedPnl;
        }

        public String getMarkPrice() {
            return markPrice;
        }

        public void setMarkPrice(String markPrice) {
            this.markPrice = markPrice;
        }

        public String getEntryVwap() {
            return entryVwap;
        }

        public void setEntryVwap(String entryVwap) {
            this.entryVwap = entryVwap;
        }

        public static class Builder {
            private String id;
            private String symbol;
            private String instrumentId;
            private String instrumentUuid;
            private String vwap;
            private String netSize;
            private String buyOrderSize;
            private String sellOrderSize;
            private double imContribution;
            private String unrealizedPnl;
            private String markPrice;
            private String entryVwap;

            public Builder() {}

            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Builder symbol(String symbol) {
                this.symbol = symbol;
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

            public Builder vwap(String vwap) {
                this.vwap = vwap;
                return this;
            }

            public Builder netSize(String netSize) {
                this.netSize = netSize;
                return this;
            }

            public Builder buyOrderSize(String buyOrderSize) {
                this.buyOrderSize = buyOrderSize;
                return this;
            }

            public Builder sellOrderSize(String sellOrderSize) {
                this.sellOrderSize = sellOrderSize;
                return this;
            }

            public Builder imContribution(double imContribution) {
                this.imContribution = imContribution;
                return this;
            }

            public Builder unrealizedPnl(String unrealizedPnl) {
                this.unrealizedPnl = unrealizedPnl;
                return this;
            }

            public Builder markPrice(String markPrice) {
                this.markPrice = markPrice;
                return this;
            }

            public Builder entryVwap(String entryVwap) {
                this.entryVwap = entryVwap;
                return this;
            }

            public Position build() {
                return new Position(this);
            }
        }
    }
}
