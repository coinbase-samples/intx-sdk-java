package com.coinbase.intx.instruments;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.instruments.*;

public interface InstrumentsService {
    // Instruments
    ListInstrumentsResponse listInstruments(ListInstrumentsRequest request) throws CoinbaseIntxException;
    GetInstrumentResponse getInstrument(GetInstrumentRequest request) throws CoinbaseIntxException;
    GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request) throws CoinbaseIntxException;
    GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request) throws CoinbaseIntxException;
    GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) throws CoinbaseIntxException;
    GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) throws CoinbaseIntxException;
}
