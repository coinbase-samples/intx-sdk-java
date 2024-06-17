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

import com.fasterxml.jackson.annotation.JsonUnwrapped;

import java.util.List;

public class ListInstrumentsResponse {

    @JsonUnwrapped
    private List<Instrument> instruments;

    public ListInstrumentsRequest request;

    public ListInstrumentsResponse() {}

    public ListInstrumentsResponse(Builder builder) {
        this.instruments = builder.instruments;
        this.request = builder.request;
    }

    public List<Instrument> getInstruments() {return instruments; }

    public void setInstruments(List<Instrument> instruments) {this.instruments = instruments; }

    public ListInstrumentsRequest getRequest() {return request; }

    public void setRequest(ListInstrumentsRequest request) {
        this.request = request;
    }

    public static class Builder {
        private List<Instrument> instruments;
        public ListInstrumentsRequest request;

        public Builder () {}

        public Builder instruments(List<Instrument> instruments) {
            this.instruments = instruments;
            return this;
        }

        public Builder request(ListInstrumentsRequest request) {
            this.request = request;
            return this;
        }

        public ListInstrumentsResponse build() {
            return new ListInstrumentsResponse(this);
        }
    }
}