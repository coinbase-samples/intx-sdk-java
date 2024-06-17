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

public class SupportedNetwork {

    @JsonProperty("asset_id")
    private long assetId;

    @JsonProperty("asset_uuid")
    private String assetUuid;

    @JsonProperty("asset_name")
    private String assetName;

    @JsonProperty("network_arn_id")
    private String networkArnId;

    @JsonProperty("min_withdrawal_amt")
    private double minWithdrawalAmt;

    @JsonProperty("max_withdrawal_amt")
    private double maxWithdrawalAmt;

    @JsonProperty("network_confirms")
    private int networkConfirms;

    @JsonProperty("processing_time")
    private int processingTime;

    @JsonProperty("is_default")
    private boolean isDefault;

    @JsonProperty("network_name")
    private String networkName;

    @JsonProperty("display_name")
    private String displayName;

    public SupportedNetwork() {}

    private SupportedNetwork(Builder builder) {
        this.assetId = builder.assetId;
        this.assetUuid = builder.assetUuid;
        this.assetName = builder.assetName;
        this.networkArnId = builder.networkArnId;
        this.minWithdrawalAmt = builder.minWithdrawalAmt;
        this.maxWithdrawalAmt = builder.maxWithdrawalAmt;
        this.networkConfirms = builder.networkConfirms;
        this.processingTime = builder.processingTime;
        this.isDefault = builder.isDefault;
        this.networkName = builder.networkName;
        this.displayName = builder.displayName;
    }

    public static class Builder {
        private long assetId;
        private String assetUuid;
        private String assetName;
        private String networkArnId;
        private double minWithdrawalAmt;
        private double maxWithdrawalAmt;
        private int networkConfirms;
        private int processingTime;
        private boolean isDefault;
        private String networkName;
        private String displayName;

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

        public Builder networkArnId(String networkArnId) {
            this.networkArnId = networkArnId;
            return this;
        }

        public Builder minWithdrawalAmt(double minWithdrawalAmt) {
            this.minWithdrawalAmt = minWithdrawalAmt;
            return this;
        }

        public Builder maxWithdrawalAmt(double maxWithdrawalAmt) {
            this.maxWithdrawalAmt = maxWithdrawalAmt;
            return this;
        }

        public Builder networkConfirms(int networkConfirms) {
            this.networkConfirms = networkConfirms;
            return this;
        }

        public Builder processingTime(int processingTime) {
            this.processingTime = processingTime;
            return this;
        }

        public Builder isDefault(boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }

        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public SupportedNetwork build() {
            return new SupportedNetwork(this);
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

    public String getNetworkArnId() {
        return networkArnId;
    }

    public void setNetworkArnId(String networkArnId) {
        this.networkArnId = networkArnId;
    }

    public double getMinWithdrawalAmt() {
        return minWithdrawalAmt;
    }

    public void setMinWithdrawalAmt(double minWithdrawalAmt) {
        this.minWithdrawalAmt = minWithdrawalAmt;
    }

    public double getMaxWithdrawalAmt() {
        return maxWithdrawalAmt;
    }

    public void setMaxWithdrawalAmt(double maxWithdrawalAmt) {
        this.maxWithdrawalAmt = maxWithdrawalAmt;
    }

    public int getNetworkConfirms() {
        return networkConfirms;
    }

    public void setNetworkConfirms(int networkConfirms) {
        this.networkConfirms = networkConfirms;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
}
