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

import com.coinbase.intx.errors.CoinbaseException;
import com.coinbase.intx.model.assets.*;
import com.coinbase.intx.model.feerates.ListFeeRateTiersRequest;
import com.coinbase.intx.model.feerates.ListFeeRateTiersResponse;
import com.coinbase.intx.model.instruments.*;
import com.coinbase.intx.model.orders.*;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.model.transfers.*;

public interface CoinbaseIntxApi {
    // Portfolios
    ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request)  throws CoinbaseException;
    GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws CoinbaseException;
    CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseException;
    PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request) throws CoinbaseException;
    UpdatePortfolioResponse updatePortfolio(String portfolioId, UpdatePortfolioRequest request) throws CoinbaseException;
    GetPortfolioDetailResponse getPortfolioDetail(GetPortfolioDetailRequest request) throws CoinbaseException;
    GetPortfolioSummaryResponse getPortfolioSummary(GetPortfolioSummaryRequest request) throws CoinbaseException;
    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbaseException;
    GetBalanceForPortfolioAssetResponse getBalanceForPortfolioAsset(GetBalanceForPortfolioAssetRequest request) throws CoinbaseException;
    ListPortfolioPositionsResponse listPortfolioPositions(ListPortfolioPositionsRequest request) throws CoinbaseException;
    GetPositionForPortfolioInstrumentResponse getPositionForPortfolioInstrument(GetPositionForPortfolioInstrumentRequest request) throws CoinbaseException;
    ListFillsByPortfoliosResponse listFillsByPortfolios(ListFillsByPortfoliosRequest request) throws CoinbaseException;
    ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseException;
    EnableDisableCrossCollateralResponse enableDisableCrossCollateral(EnableDisableCrossCollateralRequest request) throws CoinbaseException;
    EnableDisableAutoMarginResponse enableDisableAutoMargin(EnableDisableAutoMarginRequest request) throws CoinbaseException;
    SetPortfolioMarginOverrideResponse setPortfolioMarginOverride(SetPortfolioMarginOverrideRequest request) throws CoinbaseException;
    TransferFundsResponse transferFunds(TransferFundsRequest request) throws CoinbaseException;
    TransferPositionsResponse transferPositions(TransferPositionsRequest request) throws CoinbaseException;
    ListPortfolioFeeRatesResponse listPortfolioFeeRates(ListPortfolioFeeRatesRequest request) throws CoinbaseException;

    // Assets
    ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbaseException;
    GetAssetResponse getAsset(GetAssetRequest request) throws CoinbaseException;
    GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request) throws CoinbaseException;

    // Instruments
    ListInstrumentsResponse listInstruments(ListInstrumentsRequest request) throws CoinbaseException;
    GetInstrumentResponse getInstrument(GetInstrumentRequest request) throws CoinbaseException;
    GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request) throws CoinbaseException;
    GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request) throws CoinbaseException;
    GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) throws CoinbaseException;
    GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) throws CoinbaseException;

    // Orders
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseException;
    CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseException;
    GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseException;
    ModifyOrderResponse modifyOrder(ModifyOrderRequest request) throws CoinbaseException;
    ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseException;

    // Fee Rates
    ListFeeRateTiersResponse listFeeRateTiers(ListFeeRateTiersRequest request) throws CoinbaseException;

    // Transfers
    ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseException;
    GetTransferResponse getTransfer(GetTransferRequest request) throws CoinbaseException;
    WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) throws CoinbaseException;
    CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseException;
    CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseException;
    ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseException;
    WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseException;
}