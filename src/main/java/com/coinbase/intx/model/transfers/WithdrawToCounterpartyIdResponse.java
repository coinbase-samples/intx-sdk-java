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

public class WithdrawToCounterpartyIdResponse {
    @JsonProperty("idem")
    private String idem;

    @JsonProperty("portfolio_uuid")
    private String portfolioUuid;

    @JsonProperty("source_counterparty_id")
    private String sourceCounterpartyId;

    @JsonProperty("target_counterparty_id")
    private String targetCounterpartyId;

    @JsonProperty("asset")
    private String asset;

    @JsonProperty("amount")
    private Double amount;

    public WithdrawToCounterpartyIdResponse() {}

    private WithdrawToCounterpartyIdResponse(Builder builder) {
        this.idem = builder.idem;
        this.portfolioUuid = builder.portfolioUuid;
        this.sourceCounterpartyId = builder.sourceCounterpartyId;
        this.targetCounterpartyId = builder.targetCounterpartyId;
        this.asset = builder.asset;
        this.amount = builder.amount;
    }

    public String getIdem() {
        return idem;
    }

    public void setIdem(String idem) {
        this.idem = idem;
    }

    public String getPortfolioUuid() {
        return portfolioUuid;
    }

    public void setPortfolioUuid(String portfolioUuid) {
        this.portfolioUuid = portfolioUuid;
    }

    public String getSourceCounterpartyId() {
        return sourceCounterpartyId;
    }

    public void setSourceCounterpartyId(String sourceCounterpartyId) {
        this.sourceCounterpartyId = sourceCounterpartyId;
    }

    public String getTargetCounterpartyId() {
        return targetCounterpartyId;
    }

    public void setTargetCounterpartyId(String targetCounterpartyId) {
        this.targetCounterpartyId = targetCounterpartyId;
    }

    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public static class Builder {
        private String idem;
        private String portfolioUuid;
        private String sourceCounterpartyId;
        private String targetCounterpartyId;
        private String asset;
        private Double amount;

        public Builder() {}

        public Builder idem(String idem) {
            this.idem = idem;
            return this;
        }

        public Builder portfolioUuid(String portfolioUuid) {
            this.portfolioUuid = portfolioUuid;
            return this;
        }

        public Builder sourceCounterpartyId(String sourceCounterpartyId) {
            this.sourceCounterpartyId = sourceCounterpartyId;
            return this;
        }

        public Builder targetCounterpartyId(String targetCounterpartyId) {
            this.targetCounterpartyId = targetCounterpartyId;
            return this;
        }

        public Builder asset(String asset) {
            this.asset = asset;
            return this;
        }

        public Builder amount(Double amount) {
            this.amount = amount;
            return this;
        }

        public WithdrawToCounterpartyIdResponse build() {
            return new WithdrawToCounterpartyIdResponse(this);
        }
    }
}
