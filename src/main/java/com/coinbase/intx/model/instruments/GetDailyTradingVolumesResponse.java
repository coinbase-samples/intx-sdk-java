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

public class GetDailyTradingVolumesResponse {
    private InstrumentDailyTradingVolumes dailyTradingVolumes;
    private GetDailyTradingVolumesRequest request;

    public GetDailyTradingVolumesResponse() {}

    private GetDailyTradingVolumesResponse(Builder builder) {
        this.dailyTradingVolumes = builder.dailyTradingVolumes;
        this.request = builder.request;
    }

    public InstrumentDailyTradingVolumes getDailyTradingVolumes() {
        return dailyTradingVolumes;
    }

    public void setDailyTradingVolumes(InstrumentDailyTradingVolumes dailyTradingVolumes) {
        this.dailyTradingVolumes = dailyTradingVolumes;
    }

    public GetDailyTradingVolumesRequest getRequest() {
        return request;
    }

    public void setRequest(GetDailyTradingVolumesRequest request) {
        this.request = request;
    }

    public static class Builder {
        private InstrumentDailyTradingVolumes dailyTradingVolumes;
        private GetDailyTradingVolumesRequest request;

        public Builder() {}

        public Builder dailyTradingVolumes(InstrumentDailyTradingVolumes dailyTradingVolumes) {
            this.dailyTradingVolumes = dailyTradingVolumes;
            return this;
        }

        public Builder request(GetDailyTradingVolumesRequest request) {
            this.request = request;
            return this;
        }

        public GetDailyTradingVolumesResponse build() {
            return new GetDailyTradingVolumesResponse(this);
        }
    }
}
