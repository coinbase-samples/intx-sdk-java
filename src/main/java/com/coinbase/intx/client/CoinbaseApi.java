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

package com.coinbase.intx.client;

import com.coinbase.intx.model.assets.*;
import com.coinbase.intx.model.feerates.ListFeeRateTiersRequest;
import com.coinbase.intx.model.feerates.ListFeeRateTiersResponse;
import com.coinbase.intx.model.instruments.*;
import com.coinbase.intx.model.orders.*;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.model.transfers.*;

public interface CoinbaseApi {
    ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request);
    GetPortfolioResponse getPortfolio(GetPortfolioRequest request);

    CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request);

    PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request);

    UpdatePortfolioResponse updatePortfolio(String portfolioId, UpdatePortfolioRequest request);

    GetPortfolioDetailResponse getPortfolioDetail(GetPortfolioDetailRequest request);

    GetPortfolioSummaryResponse getPortfolioSummary(GetPortfolioSummaryRequest request);

    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request);

    GetBalanceForPortfolioAssetResponse getBalanceForPortfolioAsset(GetBalanceForPortfolioAssetRequest request);

    ListPortfolioPositionsResponse listPortfolioPositions(ListPortfolioPositionsRequest request);

    GetPositionForPortfolioInstrumentResponse getPositionForPortfolioInstrument(GetPositionForPortfolioInstrumentRequest request);

    ListFillsByPortfoliosResponse listFillsByPortfolios(ListFillsByPortfoliosRequest request);

    ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request);

    EnableDisableCrossCollateralResponse enableDisableCrossCollateral(EnableDisableCrossCollateralRequest request);

    EnableDisableAutoMarginResponse enableDisableAutoMargin(EnableDisableAutoMarginRequest request);

    SetPortfolioMarginOverrideResponse setPortfolioMarginOverride(SetPortfolioMarginOverrideRequest request);

    TransferFundsResponse transferFunds(TransferFundsRequest request);

    TransferPositionsResponse transferPositions(TransferPositionsRequest request);

    ListPortfolioFeeRatesResponse listPortfolioFeeRates(ListPortfolioFeeRatesRequest request);

    ListAssetsResponse listAssets(ListAssetsRequest request);
    GetAssetResponse getAsset(GetAssetRequest request);
    GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request);

    ListInstrumentsResponse listInstruments(ListInstrumentsRequest request);
    GetInstrumentResponse getInstrument(GetInstrumentRequest request);
    GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request);
    GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request);
    GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request);
    GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request);

    CreateOrderResponse createOrder(CreateOrderRequest request);
    CancelOrderResponse cancelOrder(CancelOrderRequest request);
    CancelOrdersResponse cancelOrders(CancelOrdersRequest request);
    GetOrderResponse getOrder(GetOrderRequest request);
    ModifyOrderResponse modifyOrder(ModifyOrderRequest request);
    ListOrdersResponse listOrders(ListOrdersRequest request);

    ListFeeRateTiersResponse listFeeRateTiers(ListFeeRateTiersRequest request);

    ListTransfersResponse listTransfers(ListTransfersRequest request);

    GetTransferResponse getTransfer(GetTransferRequest request);

    WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request);

    CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request);

    CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request);

    ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request);

    WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request);
}