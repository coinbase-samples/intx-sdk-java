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

package com.coinbase.intx.portfolios;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.portfolios.*;

public interface PortfoliosService {
    // Portfolios
    ListPortfoliosResponse listPortfolios()  throws CoinbaseIntxException;
    GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws CoinbaseIntxException;
    CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseIntxException;
    PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request) throws CoinbaseIntxException;
    UpdatePortfolioResponse updatePortfolio(UpdatePortfolioRequest request) throws CoinbaseIntxException;
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
    ListPortfolioFeeRatesResponse listPortfolioFeeRates() throws CoinbaseIntxException;
}
