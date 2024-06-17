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

package com.coinbase.intx.model.transfers;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transfer {
    @JsonProperty("transfer_uuid")
    private String transferUuid;

    @JsonProperty("transfer_type")
    private String transferType;

    @JsonProperty("amount")
    private double amount;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("status")
    private String status;

    @JsonProperty("network_name")
    private String networkName;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("from_portfolio")
    private Portfolio fromPortfolio;

    @JsonProperty("to_portfolio")
    private Portfolio toPortfolio;

    @JsonProperty("from_address")
    private double fromAddress;

    @JsonProperty("to_address")
    private double toAddress;

    @JsonProperty("from_cb_account")
    private String fromCbAccount;

    @JsonProperty("to_cb_account")
    private String toCbAccount;

    @JsonProperty("from_counterparty_id")
    private String fromCounterpartyId;

    @JsonProperty("to_counterparty_id")
    private String toCounterpartyId;

    @JsonProperty("instrument_id")
    private long instrumentId;

    @JsonProperty("position_id")
    private String positionId;

    public static class Portfolio {
        @JsonProperty("id")
        private String id;

        @JsonProperty("uuid")
        private String uuid;

        @JsonProperty("name")
        private String name;

        public Portfolio() {}

        private Portfolio(Builder builder) {
            this.id = builder.id;
            this.uuid = builder.uuid;
            this.name = builder.name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static class Builder {
            private String id;
            private String uuid;
            private String name;

            public Builder() {}

            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Portfolio build() {
                return new Portfolio(this);
            }
        }
    }

    public Transfer() {}

    private Transfer(Builder builder) {
        this.transferUuid = builder.transferUuid;
        this.transferType = builder.transferType;
        this.amount = builder.amount;
        this.asset = builder.asset;
        this.status = builder.status;
        this.networkName = builder.networkName;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.fromPortfolio = builder.fromPortfolio;
        this.toPortfolio = builder.toPortfolio;
        this.fromAddress = builder.fromAddress;
        this.toAddress = builder.toAddress;
        this.fromCbAccount = builder.fromCbAccount;
        this.toCbAccount = builder.toCbAccount;
        this.fromCounterpartyId = builder.fromCounterpartyId;
        this.toCounterpartyId = builder.toCounterpartyId;
        this.instrumentId = builder.instrumentId;
        this.positionId = builder.positionId;
    }

    public String getTransferUuid() {
        return transferUuid;
    }

    public void setTransferUuid(String transferUuid) {
        this.transferUuid = transferUuid;
    }

    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Portfolio getFromPortfolio() {
        return fromPortfolio;
    }

    public void setFromPortfolio(Portfolio fromPortfolio) {
        this.fromPortfolio = fromPortfolio;
    }

    public Portfolio getToPortfolio() {
        return toPortfolio;
    }

    public void setToPortfolio(Portfolio toPortfolio) {
        this.toPortfolio = toPortfolio;
    }

    public double getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(double fromAddress) {
        this.fromAddress = fromAddress;
    }

    public double getToAddress() {
        return toAddress;
    }

    public void setToAddress(double toAddress) {
        this.toAddress = toAddress;
    }

    public String getFromCbAccount() {
        return fromCbAccount;
    }

    public void setFromCbAccount(String fromCbAccount) {
        this.fromCbAccount = fromCbAccount;
    }

    public String getToCbAccount() {
        return toCbAccount;
    }

    public void setToCbAccount(String toCbAccount) {
        this.toCbAccount = toCbAccount;
    }

    public String getFromCounterpartyId() {
        return fromCounterpartyId;
    }

    public void setFromCounterpartyId(String fromCounterpartyId) {
        this.fromCounterpartyId = fromCounterpartyId;
    }

    public String getToCounterpartyId() {
        return toCounterpartyId;
    }

    public void setToCounterpartyId(String toCounterpartyId) {
        this.toCounterpartyId = toCounterpartyId;
    }

    public long getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(long instrumentId) {
        this.instrumentId = instrumentId;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public static class Builder {
        private String transferUuid;
        private String transferType;
        private double amount;
        private String asset;
        private String status;
        private String networkName;
        private String createdAt;
        private String updatedAt;
        private Portfolio fromPortfolio;
        private Portfolio toPortfolio;
        private double fromAddress;
        private double toAddress;
        private String fromCbAccount;
        private String toCbAccount;
        private String fromCounterpartyId;
        private String toCounterpartyId;
        private long instrumentId;
        private String positionId;

        public Builder() {}

        public Builder transferUuid(String transferUuid) {
            this.transferUuid = transferUuid;
            return this;
        }

        public Builder transferType(String transferType) {
            this.transferType = transferType;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder networkName(String networkName) {
            this.networkName = networkName;
            return this;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder fromPortfolio(Portfolio fromPortfolio) {
            this.fromPortfolio = fromPortfolio;
            return this;
        }

        public Builder toPortfolio(Portfolio toPortfolio) {
            this.toPortfolio = toPortfolio;
            return this;
        }

        public Builder fromAddress(double fromAddress) {
            this.fromAddress = fromAddress;
            return this;
        }

        public Builder toAddress(double toAddress) {
            this.toAddress = toAddress;
            return this;
        }

        public Builder fromCbAccount(String fromCbAccount) {
            this.fromCbAccount = fromCbAccount;
            return this;
        }

        public Builder toCbAccount(String toCbAccount) {
            this.toCbAccount = toCbAccount;
            return this;
        }

        public Builder fromCounterpartyId(String fromCounterpartyId) {
            this.fromCounterpartyId = fromCounterpartyId;
            return this;
        }

        public Builder toCounterpartyId(String toCounterpartyId) {
            this.toCounterpartyId = toCounterpartyId;
            return this;
        }

        public Builder instrumentId(long instrumentId) {
            this.instrumentId = instrumentId;
            return this;
        }

        public Builder positionId(String positionId) {
            this.positionId = positionId;
            return this;
        }

        public Transfer build() {
            return new Transfer(this);
        }
    }
}
