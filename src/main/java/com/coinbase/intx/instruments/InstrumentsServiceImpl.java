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

package com.coinbase.intx.instruments;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.instruments.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class InstrumentsServiceImpl extends CoinbaseServiceImpl implements InstrumentsService {
    public InstrumentsServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public ListInstrumentsResponse listInstruments() throws CoinbaseIntxException {
        List<Instrument> instruments = this.request(
                HttpMethod.GET,
                "/instruments",
                null,
                List.of(200),
                new TypeReference<>() {});
        return new ListInstrumentsResponse.Builder()
                .instruments(instruments)
                .build();
    }

    @Override
    public GetInstrumentResponse getInstrument(GetInstrumentRequest request) throws CoinbaseIntxException {
        Instrument instrument = this.request(
                HttpMethod.GET,
                String.format("/instruments/%s", request.getInstrumentId()),
                null,
                List.of(200),
                new TypeReference<>() {});
        return new GetInstrumentResponse.Builder()
                .instrument(instrument)
                .build();
    }

    @Override
    public GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request) throws CoinbaseIntxException {
        Quote quote = this.request(
                HttpMethod.GET,
                String.format("/instruments/%s/quote", request.getInstrument()),
                null,
                List.of(200),
                new TypeReference<Quote>() {});
        return new GetInstrumentQuoteResponse.Builder()
                .quote(quote)
                .build();
    }

    @Override
    public GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request) throws CoinbaseIntxException {
        InstrumentDailyTradingVolumes dailyTradingVolumes = this.request(
                HttpMethod.GET,
                "/instruments/volumes/daily",
                request,
                List.of(200),
                new TypeReference<InstrumentDailyTradingVolumes>() {});
        return new GetDailyTradingVolumesResponse.Builder()
                .dailyTradingVolumes(dailyTradingVolumes)
                .build();
    }

    @Override
    public GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.GET,
                String.format("/instruments/%s/candles", request.getInstrument()),
                request,
                List.of(200),
                new TypeReference<GetAggregatedCandlesResponse>() {});
    }

    @Override
    public GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.GET,
                String.format("/instruments/%s/funding", request.getInstrument()),
                request,
                List.of(200),
                new TypeReference<GetHistoricalFundingRatesResponse>() {});
    }
}
