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

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.assets.*;
import com.coinbase.intx.model.feerates.ListFeeRateTiersRequest;
import com.coinbase.intx.model.feerates.ListFeeRateTiersResponse;
import com.coinbase.intx.model.instruments.*;
import com.coinbase.intx.model.orders.*;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.model.transfers.*;

public interface CoinbaseIntxApi {
    // Portfolios
    ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request)  throws CoinbaseIntxException;
    GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws CoinbaseIntxException;
    CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseIntxException;
    PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request) throws CoinbaseIntxException;
    UpdatePortfolioResponse updatePortfolio(String portfolioId, UpdatePortfolioRequest request) throws CoinbaseIntxException;
    GetPortfolioDetailResponse getPortfolioDetail(GetPortfolioDetailRequest request) throws CoinbaseIntxException;
    GetPortfolioSummaryResponse getPortfolioSummary(GetPortfolioSummaryRequest request) throws CoinbaseIntxException;
    ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbaseIntxException;
    GetBalanceForPortfolioAssetResponse getBalanceForPortfolioAsset(GetBalanceForPortfolioAssetRequest request) throws CoinbaseIntxException;
    ListPortfolioPositionsResponse listPortfolioPositions(ListPortfolioPositionsRequest request) throws CoinbaseIntxException;
    GetPositionForPortfolioInstrumentResponse getPositionForPortfolioInstrument(GetPositionForPortfolioInstrumentRequest request) throws CoinbaseIntxException;
    ListFillsByPortfoliosResponse listFillsByPortfolios(ListFillsByPortfoliosRequest request) throws CoinbaseIntxException;
    ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseIntxException;
    EnableDisableCrossCollateralResponse enableDisableCrossCollateral(EnableDisableCrossCollateralRequest request) throws CoinbaseIntxException;
    EnableDisableAutoMarginResponse enableDisableAutoMargin(EnableDisableAutoMarginRequest request) throws CoinbaseIntxException;
    SetPortfolioMarginOverrideResponse setPortfolioMarginOverride(SetPortfolioMarginOverrideRequest request) throws CoinbaseIntxException;
    TransferFundsResponse transferFunds(TransferFundsRequest request) throws CoinbaseIntxException;
    TransferPositionsResponse transferPositions(TransferPositionsRequest request) throws CoinbaseIntxException;
    ListPortfolioFeeRatesResponse listPortfolioFeeRates(ListPortfolioFeeRatesRequest request) throws CoinbaseIntxException;

    // Assets
    ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbaseIntxException;
    GetAssetResponse getAsset(GetAssetRequest request) throws CoinbaseIntxException;
    GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request) throws CoinbaseIntxException;

    // Instruments
    ListInstrumentsResponse listInstruments(ListInstrumentsRequest request) throws CoinbaseIntxException;
    GetInstrumentResponse getInstrument(GetInstrumentRequest request) throws CoinbaseIntxException;
    GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request) throws CoinbaseIntxException;
    GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request) throws CoinbaseIntxException;
    GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) throws CoinbaseIntxException;
    GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) throws CoinbaseIntxException;

    // Orders
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseIntxException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseIntxException;
    CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseIntxException;
    GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseIntxException;
    ModifyOrderResponse modifyOrder(ModifyOrderRequest request) throws CoinbaseIntxException;
    ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseIntxException;

    // Fee Rates
    ListFeeRateTiersResponse listFeeRateTiers(ListFeeRateTiersRequest request) throws CoinbaseIntxException;

    // Transfers
    ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseIntxException;
    GetTransferResponse getTransfer(GetTransferRequest request) throws CoinbaseIntxException;
    WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) throws CoinbaseIntxException;
    CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseIntxException;
    CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseIntxException;
    ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseIntxException;
    WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseIntxException;
}