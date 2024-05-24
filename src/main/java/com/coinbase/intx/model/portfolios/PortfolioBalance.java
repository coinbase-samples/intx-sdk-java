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

public class PortfolioBalance {

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

    public PortfolioBalance() {}

    public PortfolioBalance(Builder builder) {
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

        public PortfolioBalance build() {
            return new PortfolioBalance(this);
        }
    }
}
