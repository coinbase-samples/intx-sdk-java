package com.coinbase.intx.portfolios;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.portfolios.*;

public interface PortfoliosService {
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
}
