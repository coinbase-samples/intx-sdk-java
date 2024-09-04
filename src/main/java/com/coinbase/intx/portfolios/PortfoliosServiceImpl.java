package com.coinbase.intx.portfolios;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.portfolios.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class PortfoliosServiceImpl extends CoinbaseServiceImpl implements PortfoliosService {
    public PortfoliosServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public ListPortfoliosResponse listPortfolios() throws CoinbaseIntxException {
        List<Portfolio> portfolios = this.request(
                HttpMethod.GET,
                "/portfolios",
                null,
                List.of(200),
                new TypeReference<List<Portfolio>>() {});
        return new ListPortfoliosResponse.Builder()
                .portfolios(portfolios)
                .build();
    }

    @Override
    public GetPortfolioResponse getPortfolio(GetPortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s", request.getPortfolioId()),
                null,
                List.of(200),
                new TypeReference<Portfolio>(){});
        return new GetPortfolioResponse.Builder()
                .portfolio(portfolio)
                .build();
    }

    @Override
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = this.request(
                HttpMethod.POST,
                "/portfolios",
                request,
                List.of(200),
                new TypeReference<Portfolio>(){});
        return new CreatePortfolioResponse.Builder()
                .portfolio(portfolio)
                .build();
    }

    @Override
    public PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = this.request(
                HttpMethod.PATCH,
                "/portfolios",
                request,
                List.of(200),
                new TypeReference<Portfolio>(){});
        return new PatchPortfolioResponse.Builder()
                .portfolio(portfolio)
                .build();
    }


    @Override
    public UpdatePortfolioResponse updatePortfolio(UpdatePortfolioRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = this.request(
                HttpMethod.PUT,
                String.format("/portfolios/%s", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<Portfolio>(){});
        return new UpdatePortfolioResponse.Builder()
                .portfolio(portfolio)
                .build();
    }

    @Override
    public GetPortfolioDetailResponse getPortfolioDetail(GetPortfolioDetailRequest request) throws CoinbaseIntxException {
        PortfolioDetail portfolioDetail = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/detail", request.getPortfolio()),
                null,
                List.of(200),
                new TypeReference<PortfolioDetail>(){});
        return new GetPortfolioDetailResponse.Builder()
                .portfolioDetail(portfolioDetail)
                .build();
    }

    @Override
    public GetPortfolioSummaryResponse getPortfolioSummary(GetPortfolioSummaryRequest request) throws CoinbaseIntxException {
        PortfolioDetail.Summary summary = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/summary", request.getPortfolio()),
                null,
                List.of(200),
                new TypeReference<PortfolioDetail.Summary>(){});
        return new GetPortfolioSummaryResponse.Builder()
                .summary(summary)
                .build();
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) throws CoinbaseIntxException {
        List<PortfolioBalance> balances = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/balances", request.getPortfolio()),
                null,
                List.of(200),
                new TypeReference<List<PortfolioBalance>>() {});
        return new ListPortfolioBalancesResponse.Builder()
                .balances(balances)
                .build();
    }

    @Override
    public GetBalanceForPortfolioAssetResponse getBalanceForPortfolioAsset(GetBalanceForPortfolioAssetRequest request) throws CoinbaseIntxException {
        PortfolioBalance balance = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/balances/%s", request.getPortfolio(), request.getAsset()),
                null,
                List.of(200),
                new TypeReference<PortfolioBalance>(){});
        return new GetBalanceForPortfolioAssetResponse.Builder()
                .balance(balance)
                .build();
    }

    @Override
    public ListPortfolioPositionsResponse listPortfolioPositions(ListPortfolioPositionsRequest request) throws CoinbaseIntxException {
        List<PortfolioDetail.Position> positions = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/positions", request.getPortfolio()),
                null,
                List.of(200),
                new TypeReference<List<PortfolioDetail.Position>>() {});
        return new ListPortfolioPositionsResponse.Builder()
                .positions(positions)
                .build();
    }

    @Override
    public GetPositionForPortfolioInstrumentResponse getPositionForPortfolioInstrument(GetPositionForPortfolioInstrumentRequest request) throws CoinbaseIntxException {
        PortfolioDetail.Position position = this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/positions/%s", request.getPortfolio(), request.getInstrument()),
                null,
                List.of(200),
                new TypeReference<PortfolioDetail.Position>(){});
        return new GetPositionForPortfolioInstrumentResponse.Builder()
                .position(position)
                .build();
    }

    @Override
    public ListFillsByPortfoliosResponse listFillsByPortfolios(ListFillsByPortfoliosRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.GET,
                "/portfolios/fills",
                request,
                List.of(200),
                new TypeReference<ListFillsByPortfoliosResponse>() {});
    }

    @Override
    public ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.GET,
                String.format("/portfolios/%s/fills", request.getPortfolio()),
                request,
                List.of(200),
                new TypeReference<ListPortfolioFillsResponse>() {});
    }

    @Override
    public EnableDisableCrossCollateralResponse enableDisableCrossCollateral(EnableDisableCrossCollateralRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/cross-collateral-enabled", request.getPortfolio()),
                request,
                List.of(200),
                new TypeReference<Portfolio>(){});
        return new EnableDisableCrossCollateralResponse.Builder()
                .portfolio(portfolio)
                .build();
    }

    @Override
    public EnableDisableAutoMarginResponse enableDisableAutoMargin(EnableDisableAutoMarginRequest request) throws CoinbaseIntxException {
        Portfolio portfolio = this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/auto-margin-enabled", request.getPortfolio()),
                request,
                List.of(200),
                new TypeReference<Portfolio>(){});
        return new EnableDisableAutoMarginResponse.Builder()
                .portfolio(portfolio)
                .build();
    }

    @Override
    public SetPortfolioMarginOverrideResponse setPortfolioMarginOverride(SetPortfolioMarginOverrideRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                String.format("/portfolios/%s/margin-override", request.getPortfolioId()),
                request,
                List.of(200),
                new TypeReference<SetPortfolioMarginOverrideResponse>() {});
    }

    @Override
    public TransferFundsResponse transferFunds(TransferFundsRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/portfolios/transfer",
                request,
                List.of(200),
                new TypeReference<TransferFundsResponse>() {});
    }

    @Override
    public TransferPositionsResponse transferPositions(TransferPositionsRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/portfolios/transfer-position",
                request,
                List.of(200),
                new TypeReference<TransferPositionsResponse>() {});
    }

    @Override
    public ListPortfolioFeeRatesResponse listPortfolioFeeRates() throws CoinbaseIntxException {
        List<PortfolioFeeRate> feeRates = this.request(
                HttpMethod.GET,
                "/portfolios/fee-rates",
                null,
                List.of(200),
                new TypeReference<List<PortfolioFeeRate>>() {});
        return new ListPortfolioFeeRatesResponse.Builder()
                .feeRates(feeRates)
                .build();
    }
}
