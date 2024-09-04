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
import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetHistoricalFundingRatesRequest {
    private String instrument;
    private Integer resultLimit;
    private Integer resultOffset;

    public GetHistoricalFundingRatesRequest() {}

    private GetHistoricalFundingRatesRequest(Builder builder) {
        this.instrument = builder.instrument;
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
    }

    @Override
    public String getPath() {
        return String.format("/instruments/%s/funding", this.getInstrument());
    }

    @Override
    public String getQueryString() {
        String queryParams = "";
        queryParams = appendQueryParams(queryParams, "result_limit", resultLimit.toString());
        queryParams = appendQueryParams(queryParams, "result_offset", resultOffset.toString());
        return queryParams;
    }

    public String getInstrument() {
        return instrument;
    }

    public Integer getResultLimit() {
        return resultLimit;
    }

    public Integer getResultOffset() {
        return resultOffset;
    }

    public static class Builder {
        private String instrument;
        private Integer resultLimit;
        private Integer resultOffset;

        public Builder() {}

        public Builder instrument(String instrument) {
            this.instrument = instrument;
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

        public GetHistoricalFundingRatesRequest build() throws CoinbaseClientException {
            validate();
            return new GetHistoricalFundingRatesRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(instrument)) {
                throw new CoinbaseClientException("instrument is required");
            }
        }
    }
}
