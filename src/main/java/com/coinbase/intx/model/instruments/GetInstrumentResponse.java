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

public class GetInstrumentResponse {

    private Instrument instrument;
    private GetInstrumentRequest request;

    public GetInstrumentResponse() {}

    private GetInstrumentResponse(Builder builder) {
        this.instrument = builder.instrument;
        this.request = builder.request;
    }

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public GetInstrumentRequest getRequest() {
        return request;
    }

    public void setRequest(GetInstrumentRequest request) {
        this.request = request;
    }

    public static class Builder {
        private Instrument instrument;
        private GetInstrumentRequest request;

        public Builder() {}

        public Builder instrument(Instrument instrument) {
            this.instrument = instrument;
            return this;
        }

        public Builder request(GetInstrumentRequest request) {
            this.request = request;
            return this;
        }

        public GetInstrumentResponse build() {
            return new GetInstrumentResponse(this);
        }
    }
}
