package com.coinbase.intx.feerates;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.feerates.FeeRate;
import com.coinbase.intx.model.feerates.ListFeeRateTiersRequest;
import com.coinbase.intx.model.feerates.ListFeeRateTiersResponse;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class FeeRatesServiceImpl extends CoinbaseServiceImpl implements FeeRatesService {
    public FeeRatesServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public ListFeeRateTiersResponse listFeeRateTiers(ListFeeRateTiersRequest request) throws CoinbaseIntxException {
        List<FeeRate> feeRates = this.request(
                HttpMethod.GET,
                "/fee-rate-tiers",
                null,
                List.of(200),
                new TypeReference<>() {});
        return new ListFeeRateTiersResponse.Builder()
                .results(feeRates)
                .build();
    }
}
