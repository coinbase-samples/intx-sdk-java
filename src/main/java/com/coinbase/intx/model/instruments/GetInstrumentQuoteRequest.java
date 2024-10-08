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

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class GetInstrumentQuoteRequest {
    private String instrument;

    public GetInstrumentQuoteRequest() {}

    private GetInstrumentQuoteRequest(Builder builder) {
        this.instrument = builder.instrument;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrumentQuote(String instrumentQuote) {
        this.instrument = instrumentQuote;
    }

    public static class Builder {
        private String instrument;

        public Builder instrument(String instrumentQuote) {
            this.instrument = instrumentQuote;
            return this;
        }

        public GetInstrumentQuoteRequest build() throws CoinbaseClientException {
            validate();
            return new GetInstrumentQuoteRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(instrument)) {
                throw new CoinbaseClientException("Instrument is required");
            }
        }
    }
}
