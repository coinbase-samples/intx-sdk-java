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

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbaseGetRequest;

import static com.coinbase.core.utils.Utils.appendQueryParams;

public class GetDailyTradingVolumesRequest extends CoinbaseGetRequest {
    private String instruments;
    private Integer resultLimit;
    private Integer resultOffset;
    private String timeFrom;
    private Boolean showOther;

    public GetDailyTradingVolumesRequest() {}

    private GetDailyTradingVolumesRequest(Builder builder) {
        this.instruments = builder.instruments;
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
        this.timeFrom = builder.timeFrom;
        this.showOther = builder.showOther;
    }

    @Override
    public String getPath() {
        return "/instruments/volumes/daily";
    }

    @Override
    public String getQueryString() {
        String queryParams = appendQueryParams("", "instruments", this.instruments);
        queryParams = appendQueryParams(queryParams, "result_limit", this.resultLimit.toString());
        queryParams = appendQueryParams(queryParams, "result_offset", this.resultOffset.toString());
        queryParams = appendQueryParams(queryParams, "time_from", this.timeFrom);
        queryParams = appendQueryParams(queryParams, "show_other", this.showOther.toString());
        return queryParams;
    }

    public String getInstruments() {
        return instruments;
    }

    public void setInstruments(String instruments) {
        this.instruments = instruments;
    }

    public Integer getResultLimit() {
        return resultLimit;
    }

    public void setResultLimit(Integer resultLimit) {
        this.resultLimit = resultLimit;
    }

    public Integer getResultOffset() {
        return resultOffset;
    }

    public void setResultOffset(Integer resultOffset) {
        this.resultOffset = resultOffset;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Boolean getShowOther() {
        return showOther;
    }

    public void setShowOther(Boolean showOther) {
        this.showOther = showOther;
    }

    public static class Builder {
        private String instruments;
        private Integer resultLimit;
        private Integer resultOffset;
        private String timeFrom;
        private Boolean showOther;

        public Builder() {}

        public Builder instruments(String instruments) {
            this.instruments = instruments;
            return this;
        }

        public Builder resultLimit(Integer resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        public Builder resultOffset(Integer resultOffset) {
            this.resultOffset = resultOffset;
            return this;
        }

        public Builder timeFrom(String timeFrom) {
            this.timeFrom = timeFrom;
            return this;
        }

        public Builder showOther(Boolean showOther) {
            this.showOther = showOther;
            return this;
        }

        public GetDailyTradingVolumesRequest build() {
            return new GetDailyTradingVolumesRequest(this);
        }
    }
}
