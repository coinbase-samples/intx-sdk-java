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

import com.coinbase.intx.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HistoricalFundingRate {
    @JsonProperty("instrument_id")
    private String instrumentId;

    @JsonProperty("funding_rate")
    private double fundingRate;

    @JsonProperty("mark_price")
    private double markPrice;

    @JsonProperty("event_time")
    private String eventTime;

    @JsonProperty("pagination")
    private Pagination pagination;

    public HistoricalFundingRate() {}

    public HistoricalFundingRate(Builder builder) {
        this.instrumentId = builder.instrumentId;
        this.fundingRate = builder.fundingRate;
        this.markPrice = builder.markPrice;
        this.eventTime = builder.eventTime;
        this.pagination = builder.pagination;
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public double getFundingRate() {
        return fundingRate;
    }

    public double getMarkPrice() {
        return markPrice;
    }

    public String getEventTime() {
        return eventTime;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public static class Builder {
        private String instrumentId;
        private double fundingRate;
        private double markPrice;
        private String eventTime;
        private Pagination pagination;

        public Builder instrumentId(String instrumentId) {
            this.instrumentId = instrumentId;
            return this;
        }

        public Builder fundingRate(double fundingRate) {
            this.fundingRate = fundingRate;
            return this;
        }

        public Builder markPrice(double markPrice) {
            this.markPrice = markPrice;
            return this;
        }

        public Builder eventTime(String eventTime) {
            this.eventTime = eventTime;
            return this;
        }

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public HistoricalFundingRate build() {
            return new HistoricalFundingRate(this);
        }
    }
}
