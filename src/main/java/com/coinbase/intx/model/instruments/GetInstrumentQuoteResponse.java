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

public class GetInstrumentQuoteResponse {

    private Quote quote;
    private GetInstrumentQuoteRequest request;

    public GetInstrumentQuoteResponse() {}

    private GetInstrumentQuoteResponse(Builder builder) {
        this.quote = builder.quote;
        this.request = builder.request;
    }

    public Quote getQuote() {
        return quote;
    }

    public void setQuote(Quote quote) {
        this.quote = quote;
    }

    public GetInstrumentQuoteRequest getRequest() {
        return request;
    }

    public void setRequest(GetInstrumentQuoteRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Quote quote;
        private GetInstrumentQuoteRequest request;

        public Builder() {}

        public Builder quote(Quote quote) {
            this.quote = quote;
            return this;
        }

        public Builder request(GetInstrumentQuoteRequest request) {
            this.request = request;
            return this;
        }

        public GetInstrumentQuoteResponse build() {
            return new GetInstrumentQuoteResponse(this);
        }
    }
}
