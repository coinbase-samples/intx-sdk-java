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

package com.coinbase.intx.model.assets;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Asset {

    @JsonProperty("asset_id")
    private long assetId;

    @JsonProperty("asset_uuid")
    private String assetUuid;

    @JsonProperty("asset_name")
    private String assetName;

    @JsonProperty("status")
    private String status;

    @JsonProperty("collateral_weight")
    private double collateralWeight;

    @JsonProperty("supported_networks_enabled")
    private boolean supportedNetworksEnabled;

    @JsonProperty("min_borrow_qty")
    private int minBorrowQty;

    @JsonProperty("max_borrow_qty")
    private int maxBorrowQty;

    @JsonProperty("loan_collateral_requirement_multiplier")
    private double loanCollateralRequirementMultiplier;

    @JsonProperty("ecosystem_collateral_limit_breached")
    private boolean ecosystemCollateralLimitBreached;

    @JsonProperty("account_collateral_limit")
    private String accountCollateralLimit;

    public Asset() {}

    private Asset(Builder builder) {
        this.assetId = builder.assetId;
        this.assetUuid = builder.assetUuid;
        this.assetName = builder.assetName;
        this.status = builder.status;
        this.collateralWeight = builder.collateralWeight;
        this.supportedNetworksEnabled = builder.supportedNetworksEnabled;
        this.minBorrowQty = builder.minBorrowQty;
        this.maxBorrowQty = builder.maxBorrowQty;
        this.loanCollateralRequirementMultiplier = builder.loanCollateralRequirementMultiplier;
        this.ecosystemCollateralLimitBreached = builder.ecosystemCollateralLimitBreached;
        this.accountCollateralLimit = builder.accountCollateralLimit;
    }

    public static class Builder {
        private long assetId;
        private String assetUuid;
        private String assetName;
        private String status;
        private double collateralWeight;
        private boolean supportedNetworksEnabled;
        private int minBorrowQty;
        private int maxBorrowQty;
        private double loanCollateralRequirementMultiplier;
        private boolean ecosystemCollateralLimitBreached;
        private String accountCollateralLimit;

        public Builder() {}

        public Builder assetId(long assetId) {
            this.assetId = assetId;
            return this;
        }

        public Builder assetUuid(String assetUuid) {
            this.assetUuid = assetUuid;
            return this;
        }

        public Builder assetName(String assetName) {
            this.assetName = assetName;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder collateralWeight(double collateralWeight) {
            this.collateralWeight = collateralWeight;
            return this;
        }

        public Builder supportedNetworksEnabled(boolean supportedNetworksEnabled) {
            this.supportedNetworksEnabled = supportedNetworksEnabled;
            return this;
        }

        public Builder minBorrowQty(int minBorrowQty) {
            this.minBorrowQty = minBorrowQty;
            return this;
        }

        public Builder maxBorrowQty(int maxBorrowQty) {
            this.maxBorrowQty = maxBorrowQty;
            return this;
        }

        public Builder loanCollateralRequirementMultiplier(double loanCollateralRequirementMultiplier) {
            this.loanCollateralRequirementMultiplier = loanCollateralRequirementMultiplier;
            return this;
        }

        public Builder ecosystemCollateralLimitBreached(boolean ecosystemCollateralLimitBreached) {
            this.ecosystemCollateralLimitBreached = ecosystemCollateralLimitBreached;
            return this;
        }

        public Builder accountCollateralLimit(String accountCollateralLimit) {
            this.accountCollateralLimit = accountCollateralLimit;
            return this;
        }

        public Asset build() {
            return new Asset(this);
        }
    }

    public long getAssetId() {
        return assetId;
    }

    public void setAssetId(long assetId) {
        this.assetId = assetId;
    }

    public String getAssetUuid() {
        return assetUuid;
    }

    public void setAssetUuid(String assetUuid) {
        this.assetUuid = assetUuid;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getCollateralWeight() {
        return collateralWeight;
    }

    public void setCollateralWeight(double collateralWeight) {
        this.collateralWeight = collateralWeight;
    }

    public boolean isSupportedNetworksEnabled() {
        return supportedNetworksEnabled;
    }

    public void setSupportedNetworksEnabled(boolean supportedNetworksEnabled) {
        this.supportedNetworksEnabled = supportedNetworksEnabled;
    }

    public int getMinBorrowQty() {
        return minBorrowQty;
    }

    public void setMinBorrowQty(int minBorrowQty) {
        this.minBorrowQty = minBorrowQty;
    }

    public int getMaxBorrowQty() {
        return maxBorrowQty;
    }

    public void setMaxBorrowQty(int maxBorrowQty) {
        this.maxBorrowQty = maxBorrowQty;
    }

    public double getLoanCollateralRequirementMultiplier() {
        return loanCollateralRequirementMultiplier;
    }

    public void setLoanCollateralRequirementMultiplier(double loanCollateralRequirementMultiplier) {
        this.loanCollateralRequirementMultiplier = loanCollateralRequirementMultiplier;
    }

    public boolean isEcosystemCollateralLimitBreached() {
        return ecosystemCollateralLimitBreached;
    }

    public void setEcosystemCollateralLimitBreached(boolean ecosystemCollateralLimitBreached) {
        this.ecosystemCollateralLimitBreached = ecosystemCollateralLimitBreached;
    }

    public String getAccountCollateralLimit() {
        return accountCollateralLimit;
    }

    public void setAccountCollateralLimit(String accountCollateralLimit) {
        this.accountCollateralLimit = accountCollateralLimit;
    }
}
