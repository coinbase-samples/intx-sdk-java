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

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.core.http.CoinbaseHttpClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.errors.CoinbaseIntxExceptionFactory;
import com.coinbase.intx.model.feerates.FeeRate;
import com.coinbase.intx.model.feerates.*;
import com.coinbase.intx.model.instruments.*;
import com.coinbase.intx.model.orders.*;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.model.assets.*;
import com.coinbase.intx.model.transfers.*;
import com.coinbase.intx.utils.Constants;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.time.Instant;
import java.util.List;

public class CoinbaseIntxHttpClient extends CoinbaseHttpClient implements CoinbaseIntxApi {
    private final HttpClient client;
    private final CoinbaseCredentials credentials;
    private final String baseUrl;
    private final ObjectMapper mapper;

    public CoinbaseIntxHttpClient(Builder builder) {
        this.credentials = builder.credentials;
        this.client = builder.client;
        this.baseUrl = builder.baseUrl;
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Override
    protected String handleResponse(int statusCode, String response) throws CoinbaseIntxException {
        if (statusCode != 200 && statusCode != 201 && statusCode != 204) {
            throw CoinbaseIntxExceptionFactory.create(statusCode, response);
        }

        return response;
    }

    @Override
    protected HttpRequest.Builder attachHeaders(HttpRequest.Builder builder, String signature, long timestamp) {
        return builder
                .header(Constants.ACCESS_KEY_HEADER, credentials.getAccessKey())
                .header(Constants.PASSPHRASE_HEADER, credentials.getPassphrase())
                .header(Constants.SIGNATURE_HEADER, signature)
                .header(Constants.TIMESTAMP_HEADER, String.valueOf(timestamp))
                .header(Constants.CONTENT_TYPE_HEADER, Constants.CONTENT_TYPE_JSON);
    }

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
        ListFillsByPortfoliosResponse responseObj = doGet(request, ListFillsByPortfoliosResponse.class);
        return new ListFillsByPortfoliosResponse.Builder()
                .pagination(responseObj.getPagination())
                .results(responseObj.getResults())
                .request(request)
                .build();
    }

    @Override
    public ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) throws CoinbaseIntxException {
        ListPortfolioFillsResponse responseObj = doGet(request, ListPortfolioFillsResponse.class);
        return new ListPortfolioFillsResponse.Builder()
                .pagination(responseObj.getPagination())
                .results(responseObj.getResults())
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
        SetPortfolioMarginOverrideResponse responseObj = doPost(request, SetPortfolioMarginOverrideResponse.class);
        return new SetPortfolioMarginOverrideResponse.Builder()
                .portfolioId(responseObj.getPortfolioId())
                .marginOverride(responseObj.getMarginOverride())
                .request(request)
                .build();
    }

    @Override
    public TransferFundsResponse transferFunds(TransferFundsRequest request) throws CoinbaseIntxException {
        TransferFundsResponse responseObj = doPost(request, TransferFundsResponse.class);
        return new TransferFundsResponse.Builder()
                .success(responseObj.isSuccess())
                .request(request)
                .build();
    }

    @Override
    public TransferPositionsResponse transferPositions(TransferPositionsRequest request) throws CoinbaseIntxException {
        TransferPositionsResponse responseObj = doPost(request, TransferPositionsResponse.class);
        return new TransferPositionsResponse.Builder()
                .success(responseObj.isSuccess())
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

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) throws CoinbaseIntxException {
        List<Asset> assets = doGet(request, (Class<List<Asset>>)(Class<?>) List.class);
        return new ListAssetsResponse.Builder()
                .assets(assets)
                .request(request)
                .build();
    }

    @Override
    public ListInstrumentsResponse listInstruments(ListInstrumentsRequest request) throws CoinbaseIntxException {
        List<Instrument> instruments = doGet(request, (Class<List<Instrument>>)(Class<?>) List.class);
        return new ListInstrumentsResponse.Builder()
                .instruments(instruments)
                .request(request)
                .build();
    }

    @Override
    public GetAssetResponse getAsset(GetAssetRequest request) throws CoinbaseIntxException {
        Asset asset = doGet(request, Asset.class);
        return new GetAssetResponse.Builder()
                .asset(asset)
                .request(request)
                .build();
    }

    @Override
    public GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request) throws CoinbaseIntxException {
        List<SupportedNetwork> networks = doGet(request, (Class<List<SupportedNetwork>>)(Class<?>) List.class);
        return new GetSupportedNetworksResponse.Builder()
                .networks(networks)
                .request(request)
                .build();
    }

    @Override
    public GetInstrumentResponse getInstrument(GetInstrumentRequest request) throws CoinbaseIntxException {
        Instrument instrument = doGet(request, Instrument.class);
        return new GetInstrumentResponse.Builder()
                .instrument(instrument)
                .request(request)
                .build();
    }

    @Override
    public GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request) throws CoinbaseIntxException {
        Quote quote = doGet(request, Quote.class);
        return new GetInstrumentQuoteResponse.Builder()
                .quote(quote)
                .request(request)
                .build();
    }

    @Override
    public GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request) throws CoinbaseIntxException {
        InstrumentDailyTradingVolumes dailyTradingVolumes = doGet(request, InstrumentDailyTradingVolumes.class);
        return new GetDailyTradingVolumesResponse.Builder()
                .dailyTradingVolumes(dailyTradingVolumes)
                .request(request)
                .build();
    }

    @Override
    public GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) throws CoinbaseIntxException {
        GetAggregatedCandlesResponse responseObj = doGet(request, GetAggregatedCandlesResponse.class);
        return new GetAggregatedCandlesResponse.Builder()
                .aggregations(responseObj.getAggregations())
                .request(request)
                .build();
    }

    @Override
    public GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) throws CoinbaseIntxException {
        GetHistoricalFundingRatesResponse responseObj = doGet(request, GetHistoricalFundingRatesResponse.class);
        return new GetHistoricalFundingRatesResponse.Builder()
                .pagination(responseObj.getPagination())
                .results(responseObj.getResults())
                .build();
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseIntxException {
        Order order = doPost(request, Order.class);
        return new CreateOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseIntxException {
        Order order = doDelete(request, Order.class);
        return new CancelOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseIntxException {
        CancelOrdersResponse responseObj = doDelete(request, CancelOrdersResponse.class);
        return new CancelOrdersResponse.Builder()
                .results(responseObj.getResults())
                .build();
    }

    @Override
    public GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseIntxException {
        Order order = doGet(request, Order.class);
        return new GetOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public ModifyOrderResponse modifyOrder(ModifyOrderRequest request) throws CoinbaseIntxException {
        Order order = doPut(request, Order.class);
        return new ModifyOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseIntxException {
        ListOrdersResponse responseObj = doGet(request, ListOrdersResponse.class);
        return new ListOrdersResponse.Builder()
                .pagination(responseObj.getPagination())
                .results(responseObj.getResults())
                .build();
    }

    @Override
    public ListFeeRateTiersResponse listFeeRateTiers(ListFeeRateTiersRequest request) throws CoinbaseIntxException {
        List<FeeRate> feeRates = doGet(request, (Class<List<FeeRate>>)(Class<?>) List.class);
        return new ListFeeRateTiersResponse.Builder()
                .results(feeRates)
                .build();
    }

    @Override
    public ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseIntxException {
        ListTransfersResponse responseObj = doGet(request, ListTransfersResponse.class);
        return new ListTransfersResponse.Builder()
                .pagination(responseObj.getPagination())
                .results(responseObj.getResults())
                .build();
    }

    @Override
    public GetTransferResponse getTransfer(GetTransferRequest request) throws CoinbaseIntxException {
        Transfer transfer = doGet(request, Transfer.class);
        return new GetTransferResponse.Builder()
                .transfer(transfer)
                .build();
    }

    @Override
    public WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) throws CoinbaseIntxException {
        String path = "/transfers/withdraw";
        String response = post(path, "", request);

        try {
            WithdrawToCryptoAddressResponse responseObj = mapper.readValue(response, WithdrawToCryptoAddressResponse.class);
            return new WithdrawToCryptoAddressResponse.Builder()
                    .idem(responseObj.getIdem())
                    .build();
        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the withdraw to crypto address response", e);
        }
    }

    @Override
    public CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseIntxException {
        String path = "/transfers/address";
        String response = post(path, "", request);

        try {
            CreateCryptoAddressResponse responseObj = mapper.readValue(response, CreateCryptoAddressResponse.class);
            return new CreateCryptoAddressResponse.Builder()
                    .cryptoAddress(responseObj.getCryptoAddress())
                    .build();
        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the create crypto address response", e);
        }
    }

    @Override
    public CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseIntxException {
        String path = "/transfers/create-counterparty-id";
        String response = post(path, "", request);

        try {
            CreateCounterpartyIdResponse responseObj = mapper.readValue(response, CreateCounterpartyIdResponse.class);
            return new CreateCounterpartyIdResponse.Builder()
                    .counterparty(responseObj.getCounterparty())
                    .build();
        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the create counterparty id response", e);
        }
    }

    @Override
    public ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseIntxException {
        String path = "/transfers/validate-counterparty-id";
        String response = post(path, "", request);

        try {
            ValidateCounterpartyIdResponse responseObj = mapper.readValue(response, ValidateCounterpartyIdResponse.class);
            return new ValidateCounterpartyIdResponse.Builder()
                    .counterpartyId(responseObj.getCounterpartyId())
                    .valid(responseObj.isValid())
                    .build();
        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the validate counterparty id response", e);
        }
    }

    @Override
    public WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseIntxException {
        String path = "/transfers/withdraw/counterparty";
        String response = post(path, "", request);

        try {
            WithdrawToCounterpartyIdResponse responseObj = mapper.readValue(response, WithdrawToCounterpartyIdResponse.class);
            return new WithdrawToCounterpartyIdResponse.Builder()
                    .idem(responseObj.getIdem())
                    .portfolioUuid(responseObj.getPortfolioUuid())
                    .sourceCounterpartyId(responseObj.getSourceCounterpartyId())
                    .targetCounterpartyId(responseObj.getTargetCounterpartyId())
                    .asset(responseObj.getAsset())
                    .amount(responseObj.getAmount())
                    .build();
        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to retrieve the withdraw to counterparty id response", e);
        }
    }

    private String get(String path, String query) throws CoinbaseIntxException {
        HttpRequest.Builder builder = generateHttpRequest(path, query, Constants.GET, null);
        if (builder == null) {
            throw new CoinbaseIntxException("Failed to generate HTTP request");
        }

        HttpRequest httpRequest = builder.GET().build();
        return sendRequest(httpRequest, new int[]{200});
    }

    private String post(String path, String query, Object requestBody) throws CoinbaseIntxException {
        HttpRequest.Builder builder = generateHttpRequest(path, query, Constants.POST, requestBody);
        if (builder == null) {
            throw new CoinbaseIntxException("Failed to generate HTTP request for POST");
        }

        HttpRequest httpRequest = builder.POST(HttpRequest.BodyPublishers.ofString(toJsonStr(requestBody))).build();
        return sendRequest(httpRequest, new int[]{200, 201});
    }

    private String put(String path, String query, Object requestBody) throws CoinbaseIntxException {
        HttpRequest.Builder builder = generateHttpRequest(path, query, Constants.PUT, requestBody);
        if (builder == null) {
            throw new CoinbaseIntxException("Failed to generate HTTP request for PUT");
        }

        HttpRequest httpRequest = builder.PUT(HttpRequest.BodyPublishers.ofString(toJsonStr(requestBody))).build();
        return sendRequest(httpRequest, new int[]{200, 204});
    }

    private String delete(String path, String query, Object requestBody) throws CoinbaseIntxException {
        HttpRequest.Builder builder = generateHttpRequest(path, query, Constants.DELETE, null);
        if (builder == null) {
            throw new CoinbaseIntxException("Failed to generate HTTP request for DELETE");
        }

        HttpRequest httpRequest = builder.DELETE().build();
        return sendRequest(httpRequest, new int[]{200, 204});
    }


    private HttpRequest.Builder generateHttpRequest(String path, String query, String method, Object requestBody) throws CoinbaseIntxException {
        String callUrl = baseUrl + path + query;
        URI uri = URI.create(callUrl);
        long unixTimestamp = Instant.now().getEpochSecond();
        String signature;
        try {
            signature = credentials.sign(unixTimestamp, method, uri.getPath(), requestBody != null ? toJsonStr(requestBody) : "");
        } catch (Throwable e) {
            throw new CoinbaseIntxException("Failed to generate request signature", e);
        }

        return HttpRequest.newBuilder()
                .uri(uri)
                .header(Constants.ACCESS_KEY_HEADER, credentials.getAccessKey())
                .header(Constants.PASSPHRASE_HEADER, credentials.getPassphrase())
                .header(Constants.SIGNATURE_HEADER, signature)
                .header(Constants.TIMESTAMP_HEADER, String.valueOf(unixTimestamp))
                .header(Constants.CONTENT_TYPE_HEADER, Constants.CONTENT_TYPE_JSON);
    }

    private String toJsonStr(Object object) throws RuntimeException {
        try {
            return mapper.writeValueAsString(object);
        } catch (Throwable e) {
            throw new RuntimeException("Failed to serialize object to JSON", e);
        }
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public static class Builder {
        public final CoinbaseCredentials credentials;
        public HttpClient client;
        public String baseUrl = Constants.BASE_URL;

        public Builder(CoinbaseCredentials credentials) {
            this.credentials = credentials;
        }

        public Builder withClient(HttpClient client) {
            this.client = client;
            return this;
        }

        public Builder withBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public CoinbaseIntxHttpClient build() throws IllegalStateException {
            validate();
            if (client == null) {
                client = HttpClient.newBuilder().build();
            }
            return new CoinbaseIntxHttpClient(this);
        }

        private void validate() throws IllegalStateException {
            if (credentials == null) {
                throw new IllegalStateException("Credentials must be provided");
            }
        }
    }

}
