package com.coinbase.intx.feerates;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.feerates.ListFeeRateTiersResponse;

public interface FeeRatesService {
    // Fee Rates
    ListFeeRateTiersResponse listFeeRateTiers() throws CoinbaseIntxException;
}
