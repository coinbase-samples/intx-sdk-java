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
    public ListInstrumentsResponse listInstruments(ListInstrumentsRequest request) throws CoinbaseIntxException {
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
        InstrumentDailyTradingVolumes dailyTradingVolumes = doGet(request, InstrumentDailyTradingVolumes.class);
        return new GetDailyTradingVolumesResponse.Builder()
                .dailyTradingVolumes(dailyTradingVolumes)
                .request(request)
                .build();
    }

    @Override
    public GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) throws CoinbaseIntxException {
        GetAggregatedCandlesResponse resp = doGet(request, GetAggregatedCandlesResponse.class);
        return new GetAggregatedCandlesResponse.Builder()
                .aggregations(resp.getAggregations())
                .request(request)
                .build();
    }

    @Override
    public GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) throws CoinbaseIntxException {
        GetHistoricalFundingRatesResponse resp = doGet(request, GetHistoricalFundingRatesResponse.class);
        return new GetHistoricalFundingRatesResponse.Builder()
                .pagination(resp.getPagination())
                .results(resp.getResults())
                .build();
    }
}
