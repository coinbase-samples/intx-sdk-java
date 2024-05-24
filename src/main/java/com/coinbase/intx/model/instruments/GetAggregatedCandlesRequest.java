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

import com.coinbase.intx.utils.Utils;

public class GetAggregatedCandlesRequest {
    private String instrument;
    private String granularity;
    private String start;
    private String end;

    public GetAggregatedCandlesRequest() {}

    private GetAggregatedCandlesRequest(Builder builder) {
        this.instrument = builder.instrument;
        this.granularity = builder.granularity;
        this.start = builder.start;
        this.end = builder.end;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getGranularity() {
        return granularity;
    }

    public void setGranularity(String granularity) {
        this.granularity = granularity;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getQueryString() {
        String queryParams = Utils.appendQueryParams("", "instrument", instrument);
        queryParams = Utils.appendQueryParams(queryParams, "granularity", granularity);
        if (this.start != null) {
            queryParams = Utils.appendQueryParams(queryParams, "start", start);
        }
        if (this.end != null) {
            queryParams = Utils.appendQueryParams(queryParams, "end", end);
        }
        return queryParams;
    }

    public static class Builder {
        private String instrument;
        private String granularity;
        private String start;
        private String end;

        public Builder() {}

        public Builder instrument(String instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder granularity(String granularity) {
            this.granularity = granularity;
            return this;
        }

        public Builder start(String start) {
            this.start = start;
            return this;
        }

        public Builder end(String end) {
            this.end = end;
            return this;
        }

        public GetAggregatedCandlesRequest build() {
            return new GetAggregatedCandlesRequest(this);
        }
    }
}
