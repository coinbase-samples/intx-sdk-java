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

import java.util.List;

import com.coinbase.intx.model.common.Pagination;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InstrumentDailyTradingVolumes {
    @JsonProperty("pagination")
    private Pagination pagination;

    @JsonProperty("results")
    private List<Result> results;

    public InstrumentDailyTradingVolumes() {}

    private InstrumentDailyTradingVolumes(Builder builder) {
        this.pagination = builder.pagination;
        this.results = builder.results;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public static class Builder {
        private Pagination pagination;
        private List<Result> results;

        public Builder() {}

        public Builder pagination(Pagination pagination) {
            this.pagination = pagination;
            return this;
        }

        public Builder results(List<Result> results) {
            this.results = results;
            return this;
        }

        public InstrumentDailyTradingVolumes build() {
            return new InstrumentDailyTradingVolumes(this);
        }
    }

    public static class Result {
        @JsonProperty("timestamp")
        private String timestamp;

        @JsonProperty("instruments")
        private List<InstrumentSubset> instruments;

        @JsonProperty("totals")
        private Totals totals;

        public Result() {}

        private Result(Builder builder) {
            this.timestamp = builder.timestamp;
            this.instruments = builder.instruments;
            this.totals = builder.totals;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public List<InstrumentSubset> getInstruments() {
            return instruments;
        }

        public void setInstruments(List<InstrumentSubset> instruments) {
            this.instruments = instruments;
        }

        public Totals getTotals() {
            return totals;
        }

        public void setTotals(Totals totals) {
            this.totals = totals;
        }

        public static class Builder {
            private String timestamp;
            private List<InstrumentSubset> instruments;
            private Totals totals;

            public Builder() {}

            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Builder instruments(List<InstrumentSubset> instruments) {
                this.instruments = instruments;
                return this;
            }

            public Builder totals(Totals totals) {
                this.totals = totals;
                return this;
            }

            public Result build() {
                return new Result(this);
            }
        }
    }

    public static class InstrumentSubset {
        @JsonProperty("symbol")
        private String symbol;

        @JsonProperty("volume")
        private String volume;

        @JsonProperty("notional")
        private String notional;

        public InstrumentSubset() {}

        private InstrumentSubset(Builder builder) {
            this.symbol = builder.symbol;
            this.volume = builder.volume;
            this.notional = builder.notional;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getVolume() {
            return volume;
        }

        public void setVolume(String volume) {
            this.volume = volume;
        }

        public String getNotional() {
            return notional;
        }

        public void setNotional(String notional) {
            this.notional = notional;
        }

        public static class Builder {
            private String symbol;
            private String volume;
            private String notional;

            public Builder() {}

            public Builder symbol(String symbol) {
                this.symbol = symbol;
                return this;
            }

            public Builder volume(String volume) {
                this.volume = volume;
                return this;
            }

            public Builder notional(String notional) {
                this.notional = notional;
                return this;
            }

            public InstrumentSubset build() {
                return new InstrumentSubset(this);
            }
        }
    }

    public static class Totals {
        @JsonProperty("total_instruments_volume")
        private String totalInstrumentsVolume;

        @JsonProperty("total_instruments_notional")
        private String totalInstrumentsNotional;

        @JsonProperty("total_exchange_volume")
        private String totalExchangeVolume;

        @JsonProperty("total_exchange_notional")
        private String totalExchangeNotional;

        public Totals() {}

        private Totals(Builder builder) {
            this.totalInstrumentsVolume = builder.totalInstrumentsVolume;
            this.totalInstrumentsNotional = builder.totalInstrumentsNotional;
            this.totalExchangeVolume = builder.totalExchangeVolume;
            this.totalExchangeNotional = builder.totalExchangeNotional;
        }

        public String getTotalInstrumentsVolume() {
            return totalInstrumentsVolume;
        }

        public void setTotalInstrumentsVolume(String totalInstrumentsVolume) {
            this.totalInstrumentsVolume = totalInstrumentsVolume;
        }

        public String getTotalInstrumentsNotional() {
            return totalInstrumentsNotional;
        }

        public void setTotalInstrumentsNotional(String totalInstrumentsNotional) {
            this.totalInstrumentsNotional = totalInstrumentsNotional;
        }

        public String getTotalExchangeVolume() {
            return totalExchangeVolume;
        }

        public void setTotalExchangeVolume(String totalExchangeVolume) {
            this.totalExchangeVolume = totalExchangeVolume;
        }

        public String getTotalExchangeNotional() {
            return totalExchangeNotional;
        }

        public void setTotalExchangeNotional(String totalExchangeNotional) {
            this.totalExchangeNotional = totalExchangeNotional;
        }

        public static class Builder {
            private String totalInstrumentsVolume;
            private String totalInstrumentsNotional;
            private String totalExchangeVolume;
            private String totalExchangeNotional;

            public Builder() {}

            public Builder totalInstrumentsVolume(String totalInstrumentsVolume) {
                this.totalInstrumentsVolume = totalInstrumentsVolume;
                return this;
            }

            public Builder totalInstrumentsNotional(String totalInstrumentsNotional) {
                this.totalInstrumentsNotional = totalInstrumentsNotional;
                return this;
            }

            public Builder totalExchangeVolume(String totalExchangeVolume) {
                this.totalExchangeVolume = totalExchangeVolume;
                return this;
            }

            public Builder totalExchangeNotional(String totalExchangeNotional) {
                this.totalExchangeNotional = totalExchangeNotional;
                return this;
            }

            public Totals build() {
                return new Totals(this);
            }
        }
    }
}
