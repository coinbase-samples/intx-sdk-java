package com.coinbase.intx.portfolios;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.portfolios.*;

import java.util.List;

public class PortfoliosServiceImpl implements PortfoliosService {
    @Override
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) throws CoinbaseIntxException {
        List<Portfolio> portfolios = doGet(request, (Class<List<Portfolio>>)(Class<?>) List.class);
        return new ListPortfoliosResponse.Builder()
                .portfolios(portfolios)
                .request(request)
                .build();
    }

    @Override
    public GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = doGet(request, Portfolio.class);
        return new GetPortfolioResponse.Builder()
                .portfolio(portfolio)
                .request(request)
                .build();
    }

    @Override
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = doPost(request, Portfolio.class);
        return new CreatePortfolioResponse.Builder()
                .portfolio(portfolio)
                .request(request)
                .build();
    }

    @Override
    public PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = doPatch(request, Portfolio.class);
        return new PatchPortfolioResponse.Builder()
                .portfolio(portfolio)
                .request(request)
                .build();
    }


    @Override
    public UpdatePortfolioResponse updatePortfolio(String portfolioId, UpdatePortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = doPut(request, Portfolio.class);
        return new UpdatePortfolioResponse.Builder()
                .portfolio(portfolio)
                .request(request)
                .build();
    }

    @Override
    public GetPortfolioDetailResponse getPortfolioDetail(GetPortfolioDetailRequest request) throws CoinbaseIntxException {
        PortfolioDetail portfolioDetail = doGet(request, PortfolioDetail.class);
        return new GetPortfolioDetailResponse.Builder()
                .portfolioDetail(portfolioDetail)
                .request(request)
                .build();
    }

    @Override
    public GetPortfolioSummaryResponse getPortfolioSummary(GetPortfolioSummaryRequest request) throws CoinbaseIntxException {
        PortfolioDetail.Summary summary = doGet(request, PortfolioDetail.Summary.class);
        return new GetPortfolioSummaryResponse.Builder()
                .summary(summary)
                .request(request)
                .build();
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbaseIntxException {
        List<PortfolioBalance> balances = doGet(request, (Class<List<PortfolioBalance>>)(Class<?>) List.class);
        return new ListPortfolioBalancesResponse.Builder()
                .balances(balances)
                .request(request)
                .build();
    }

    @Override
    public GetBalanceForPortfolioAssetResponse getBalanceForPortfolioAsset(GetBalanceForPortfolioAssetRequest request) throws CoinbaseIntxException {
        PortfolioBalance balance = doGet(request, PortfolioBalance.class);
        return new GetBalanceForPortfolioAssetResponse.Builder()
                .balance(balance)
                .request(request)
                .build();
    }

    @Override
    public ListPortfolioPositionsResponse listPortfolioPositions(ListPortfolioPositionsRequest request) throws CoinbaseIntxException {
        List<PortfolioDetail.Position> positions = doGet(request, (Class<List<PortfolioDetail.Position>>)(Class<?>) List.class);
        return new ListPortfolioPositionsResponse.Builder()
                .positions(positions)
                .request(request)
                .build();
    }

    @Override
    public GetPositionForPortfolioInstrumentResponse getPositionForPortfolioInstrument(GetPositionForPortfolioInstrumentRequest request) throws CoinbaseIntxException {
        PortfolioDetail.Position position = doGet(request, PortfolioDetail.Position.class);
        return new GetPositionForPortfolioInstrumentResponse.Builder()
                .position(position)
                .request(request)
                .build();
    }

    @Override
    public ListFillsByPortfoliosResponse listFillsByPortfolios(ListFillsByPortfoliosRequest request) throws CoinbaseIntxException {
        ListFillsByPortfoliosResponse resp = doGet(request, ListFillsByPortfoliosResponse.class);
        return new ListFillsByPortfoliosResponse.Builder()
                .pagination(resp.getPagination())
                .results(resp.getResults())
                .request(request)
                .build();
    }

    @Override
    public ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseIntxException {
        ListPortfolioFillsResponse resp = doGet(request, ListPortfolioFillsResponse.class);
        return new ListPortfolioFillsResponse.Builder()
                .pagination(resp.getPagination())
                .results(resp.getResults())
                .request(request)
                .build();
    }

    @Override
    public EnableDisableCrossCollateralResponse enableDisableCrossCollateral(EnableDisableCrossCollateralRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = doPost(request, Portfolio.class);
        return new EnableDisableCrossCollateralResponse.Builder()
                .portfolio(portfolio)
                .request(request)
                .build();
    }

    @Override
    public EnableDisableAutoMarginResponse enableDisableAutoMargin(EnableDisableAutoMarginRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = doPost(request, Portfolio.class);
        return new EnableDisableAutoMarginResponse.Builder()
                .portfolio(portfolio)
                .request(request)
                .build();
    }

    @Override
    public SetPortfolioMarginOverrideResponse setPortfolioMarginOverride(SetPortfolioMarginOverrideRequest request) throws CoinbaseIntxException {
        SetPortfolioMarginOverrideResponse resp = doPost(request, SetPortfolioMarginOverrideResponse.class);
        return new SetPortfolioMarginOverrideResponse.Builder()
                .portfolioId(resp.getPortfolioId())
                .marginOverride(resp.getMarginOverride())
                .request(request)
                .build();
    }

    @Override
    public TransferFundsResponse transferFunds(TransferFundsRequest request) throws CoinbaseIntxException {
        TransferFundsResponse resp = doPost(request, TransferFundsResponse.class);
        return new TransferFundsResponse.Builder()
                .success(resp.isSuccess())
                .request(request)
                .build();
    }

    @Override
    public TransferPositionsResponse transferPositions(TransferPositionsRequest request) throws CoinbaseIntxException {
        TransferPositionsResponse resp = doPost(request, TransferPositionsResponse.class);
        return new TransferPositionsResponse.Builder()
                .success(resp.isSuccess())
                .request(request)
                .build();
    }

    @Override
    public ListPortfolioFeeRatesResponse listPortfolioFeeRates(ListPortfolioFeeRatesRequest request) throws CoinbaseIntxException {
        List<PortfolioFeeRate> feeRates = doGet(request, (Class<List<PortfolioFeeRate>>)(Class<?>) List.class);
        return new ListPortfolioFeeRatesResponse.Builder()
                .feeRates(feeRates)
                .request(request)
                .build();
    }
}
