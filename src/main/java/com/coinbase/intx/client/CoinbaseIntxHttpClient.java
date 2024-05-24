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

import com.coinbase.intx.credentials.CoinbaseIntxCredentials;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.feerates.FeeRate;
import com.coinbase.intx.model.feerates.*;
import com.coinbase.intx.model.instruments.*;
import com.coinbase.intx.model.orders.*;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.model.assets.*;
import com.coinbase.intx.model.transfers.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpClient;
import java.util.List;

public class CoinbaseIntxHttpClient implements CoinbaseIntxApi {
    private final HttpClient client;
    private final CoinbaseIntxCredentials credentials;
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
    public ListPortfoliosResponse listPortfolios(ListPortfoliosRequest request) {
        String path = "/portfolios";
        String response = get(path, "");

        try {
            List<Portfolio> portfolios = mapper.readValue(response, new TypeReference<List<Portfolio>>() {});
            return new ListPortfoliosResponse.Builder()
                    .portfolios(portfolios)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetPortfolioResponse getPortfolio(GetPortfolioRequest request) {
        String path = String.format("/portfolios/%s", request.getPortfolioId());
        String response = get(path, "");

        try {
            Portfolio portfolio = mapper.readValue(response, Portfolio.class);
            return new GetPortfolioResponse.Builder()
                    .portfolio(portfolio)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CreatePortfolioResponse createPortfolio(CreatePortfolioRequest request) {
        String path = "/portfolios";
        String response = post(path, "", request);

        try {
            Portfolio portfolio = mapper.readValue(response, Portfolio.class);
            return new CreatePortfolioResponse.Builder()
                    .portfolio(portfolio)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public PatchPortfolioResponse patchPortfolio(PatchPortfolioRequest request) {
        String path = "/portfolios";
        String response = patch(path, "", request);

        try {
            Portfolio portfolio = mapper.readValue(response, Portfolio.class);
            return new PatchPortfolioResponse.Builder()
                    .portfolio(portfolio)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    public UpdatePortfolioResponse updatePortfolio(String portfolioId, UpdatePortfolioRequest request) {
        String path = String.format("/portfolios/%s", portfolioId);
        String response = put(path, "", request);

        try {
            Portfolio portfolio = mapper.readValue(response, Portfolio.class);
            return new UpdatePortfolioResponse.Builder()
                    .portfolio(portfolio)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetPortfolioDetailResponse getPortfolioDetail(GetPortfolioDetailRequest request) {
        String path = String.format("/portfolios/%s/detail", request.getPortfolio());
        String response = get(path, "");

        try {
            PortfolioDetail portfolioDetail = mapper.readValue(response, PortfolioDetail.class);
            return new GetPortfolioDetailResponse.Builder()
                    .portfolioDetail(portfolioDetail)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetPortfolioSummaryResponse getPortfolioSummary(GetPortfolioSummaryRequest request) {
        String path = String.format("/portfolios/%s/detail", request.getPortfolio());
        String response = get(path, "");

        try {
            PortfolioDetail.Summary summary = mapper.readValue(response, PortfolioDetail.Summary.class);
            return new GetPortfolioSummaryResponse.Builder()
                    .summary(summary)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListPortfolioBalancesResponse listPortfolioBalances(ListPortfolioBalancesRequest request) {
        String path = String.format("/portfolios/%s/balances", request.getPortfolio());
        String response = get(path, "");

        try {
            List<PortfolioBalance> balances = mapper.readValue(response, new TypeReference<List<PortfolioBalance>>() {});
            return new ListPortfolioBalancesResponse.Builder()
                    .balances(balances)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetBalanceForPortfolioAssetResponse getBalanceForPortfolioAsset(GetBalanceForPortfolioAssetRequest request) {
        String path = String.format("/portfolios/%s/balances/%s", request.getPortfolio(), request.getAsset());
        String response = get(path, "");

        try {
            PortfolioBalance balance = mapper.readValue(response, PortfolioBalance.class);
            return new GetBalanceForPortfolioAssetResponse.Builder()
                    .balance(balance)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListPortfolioPositionsResponse listPortfolioPositions(ListPortfolioPositionsRequest request) {
        String path = String.format("/portfolios/%s/positions", request.getPortfolio());
        String response = get(path, "");

        try {
            List<PortfolioDetail.Position> positions = mapper.readValue(response, new TypeReference<List<PortfolioDetail.Position>>() {});
            return new ListPortfolioPositionsResponse.Builder()
                    .positions(positions)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetPositionForPortfolioInstrumentResponse getPositionForPortfolioInstrument(GetPositionForPortfolioInstrumentRequest request) {
        String path = String.format("/portfolios/%s/positions/%s", request.getPortfolio(), request.getInstrument());
        String response = get(path, "");

        try {
            PortfolioDetail.Position position = mapper.readValue(response, PortfolioDetail.Position.class);
            return new GetPositionForPortfolioInstrumentResponse.Builder()
                    .position(position)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListFillsByPortfoliosResponse listFillsByPortfolios(ListFillsByPortfoliosRequest request) {
        String path = "/portfolios/fills";
        String response = get(path + "?" + request.getQueryString(), "");

        try {
            ListFillsByPortfoliosResponse responseObj = mapper.readValue(response, ListFillsByPortfoliosResponse.class);
            return new ListFillsByPortfoliosResponse.Builder()
                    .pagination(responseObj.getPagination())
                    .results(responseObj.getResults())
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListPortfolioFillsResponse listPortfolioFills(ListPortfolioFillsRequest request) {
        String path = String.format("/portfolios/%s/fills", request.getPortfolio());
        String response = get(path + "?" + request.getQueryString(), "");

        try {
            ListPortfolioFillsResponse responseObj = mapper.readValue(response, ListPortfolioFillsResponse.class);
            return new ListPortfolioFillsResponse.Builder()
                    .pagination(responseObj.getPagination())
                    .results(responseObj.getResults())
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public EnableDisableCrossCollateralResponse enableDisableCrossCollateral(EnableDisableCrossCollateralRequest request) {
        String path = String.format("/portfolios/%s/cross-collateral-enabled", request.getPortfolio());
        String response = post(path, "", request);

        try {
            Portfolio portfolio = mapper.readValue(response, Portfolio.class);
            return new EnableDisableCrossCollateralResponse.Builder()
                    .portfolio(portfolio)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public EnableDisableAutoMarginResponse enableDisableAutoMargin(EnableDisableAutoMarginRequest request) {
        String path = String.format("/portfolios/%s/auto-margin-enabled", request.getPortfolio());
        String response = post(path, "", request);

        try {
            Portfolio portfolio = mapper.readValue(response, Portfolio.class);
            return new EnableDisableAutoMarginResponse.Builder()
                    .portfolio(portfolio)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public SetPortfolioMarginOverrideResponse setPortfolioMarginOverride(SetPortfolioMarginOverrideRequest request) {
        String path = "/portfolios/margin";
        String response = post(path, "", request);

        try {
            SetPortfolioMarginOverrideResponse responseObj = mapper.readValue(response, SetPortfolioMarginOverrideResponse.class);
            return new SetPortfolioMarginOverrideResponse.Builder()
                    .portfolioId(responseObj.getPortfolioId())
                    .marginOverride(responseObj.getMarginOverride())
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public TransferFundsResponse transferFunds(TransferFundsRequest request) {
        String path = "/portfolios/transfer";
        String response = post(path, "", request);

        try {
            TransferFundsResponse responseObj = mapper.readValue(response, TransferFundsResponse.class);
            return new TransferFundsResponse.Builder()
                    .success(responseObj.isSuccess())
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public TransferPositionsResponse transferPositions(TransferPositionsRequest request) {
        String path = "/portfolios/transfer-position";
        String response = post(path, "", request);

        try {
            TransferPositionsResponse responseObj = mapper.readValue(response, TransferPositionsResponse.class);
            return new TransferPositionsResponse.Builder()
                    .success(responseObj.isSuccess())
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListPortfolioFeeRatesResponse listPortfolioFeeRates(ListPortfolioFeeRatesRequest request) {
        String path = "/portfolios/fee-rates";
        String response = get(path, "");

        try {
            List<PortfolioFeeRate> feeRates = mapper.readValue(response, new TypeReference<List<PortfolioFeeRate>>() {});
            return new ListPortfolioFeeRatesResponse.Builder()
                    .feeRates(feeRates)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListAssetsResponse listAssets(ListAssetsRequest request) {
        String path = "/assets";
        String response = get(path, "");

        try {
            List<Asset> assets = mapper.readValue(response, new TypeReference<List<Asset>>() {});
            return new ListAssetsResponse.Builder()
                    .assets(assets)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListInstrumentsResponse listInstruments(ListInstrumentsRequest request) {
        String path = "/instruments";
        String response = get(path, "");

        try {
            List<Instrument> instruments = mapper.readValue(response, new TypeReference<List<Instrument>>() {});
            return new ListInstrumentsResponse.Builder()
                    .instruments(instruments)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetAssetResponse getAsset(GetAssetRequest request) {
        String path = String.format("/assets/%s", request.getAssetId());
        String response = get(path, "");

        try {
            Asset asset = mapper.readValue(response, Asset.class);
            return new GetAssetResponse.Builder()
                    .asset(asset)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request) {
        String path = String.format("/assets/%s/networks", request.getAsset());
        String response = get(path, "");

        try {
            List<SupportedNetwork> networks = mapper.readValue(response, new TypeReference<List<SupportedNetwork>>() {});
            return new GetSupportedNetworksResponse.Builder()
                    .networks(networks)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetInstrumentResponse getInstrument(GetInstrumentRequest request) {
        String path = String.format("/instruments/%s/quote", request.getInstrumentId());
        String response = get(path, "");

        try {
            Instrument instrument = mapper.readValue(response, Instrument.class);
            return new GetInstrumentResponse.Builder()
                    .instrument(instrument)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetInstrumentQuoteResponse getInstrumentQuote(GetInstrumentQuoteRequest request) {
        String path = String.format("/instruments/%s/quote", request.getInstrument());
        String response = get(path, "");

        try {
            Quote quote = mapper.readValue(response, Quote.class);
            return new GetInstrumentQuoteResponse.Builder()
                    .quote(quote)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetDailyTradingVolumesResponse getDailyTradingVolumes(GetDailyTradingVolumesRequest request) {
        String path = String.format("/instruments/volumes/daily");
        String response = get(path, request.getQueryString());

        try {
            InstrumentDailyTradingVolumes dailyTradingVolumes = mapper.readValue(response, InstrumentDailyTradingVolumes.class);
            return new GetDailyTradingVolumesResponse.Builder()
                    .dailyTradingVolumes(dailyTradingVolumes)
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetAggregatedCandlesResponse getAggregatedCandles(GetAggregatedCandlesRequest request) {
        String path = String.format("/instruments/%s/candles", request.getInstrument());
        String response = get(path, request.getQueryString());

        try {
            GetAggregatedCandlesResponse responseObj = mapper.readValue(response, GetAggregatedCandlesResponse.class);
            return new GetAggregatedCandlesResponse.Builder()
                    .aggregations(responseObj.getAggregations())
                    .request(request)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetHistoricalFundingRatesResponse getHistoricalFundingRates(GetHistoricalFundingRatesRequest request) {
        String url = String.format("/instruments/%s/funding", request.getInstrument());
        String response = get(url, request.getQueryString());

        try {
            GetHistoricalFundingRatesResponse responseObj = mapper.readValue(response, GetHistoricalFundingRatesResponse.class);
            return new GetHistoricalFundingRatesResponse.Builder()
                    .pagination(responseObj.getPagination())
                    .results(responseObj.getResults())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) {
        String path = "/orders";
        String response = post(path, "", request);

        try {
            Order order = mapper.readValue(response, Order.class);
            return new CreateOrderResponse.Builder()
                    .order(order)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) {
        String path = String.format("/orders/%s", request.getId());
        String response = delete(path + "?portfolio=" + request.getPortfolio(), "", request);

        try {
            Order order = mapper.readValue(response, Order.class);
            return new CancelOrderResponse.Builder()
                    .order(order)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CancelOrdersResponse cancelOrders(CancelOrdersRequest request) {
        String path = "/orders";
        String response = delete(path, "", request);

        try {
            CancelOrdersResponse responseObj = mapper.readValue(response, CancelOrdersResponse.class);
            return new CancelOrdersResponse.Builder()
                    .results(responseObj.getResults())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetOrderResponse getOrder(GetOrderRequest request) {
        String path = String.format("/orders/%s", request.getId());
        String response = get(path + "?portfolio=" + request.getPortfolio(), "");

        try {
            Order order = mapper.readValue(response, Order.class);
            return new GetOrderResponse.Builder()
                    .order(order)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ModifyOrderResponse modifyOrder(ModifyOrderRequest request) {
        String path = String.format("/orders/%s", request.getId());
        String response = put(path, "", request);

        try {
            Order order = mapper.readValue(response, Order.class);
            return new ModifyOrderResponse.Builder()
                    .order(order)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListOrdersResponse listOrders(ListOrdersRequest request) {
        String path = "/orders";
        String response = get(path + "?" + request.getQueryString(), "");

        try {
            ListOrdersResponse responseObj = mapper.readValue(response, ListOrdersResponse.class);
            return new ListOrdersResponse.Builder()
                    .pagination(responseObj.getPagination())
                    .results(responseObj.getResults())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListFeeRateTiersResponse listFeeRateTiers(ListFeeRateTiersRequest request) {
        String path = "/fee-rate-tiers";
        String response = get(path, "");

        try {
            List<FeeRate> feeRates = mapper.readValue(response, new TypeReference<List<FeeRate>>() {});
            return new ListFeeRateTiersResponse.Builder()
                    .results(feeRates)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ListTransfersResponse listTransfers(ListTransfersRequest request) {
        String path = "/transfers";
        String response = get(path + "?" + request.getQueryString(), "");

        try {
            ListTransfersResponse responseObj = mapper.readValue(response, ListTransfersResponse.class);
            return new ListTransfersResponse.Builder()
                    .pagination(responseObj.getPagination())
                    .results(responseObj.getResults())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public GetTransferResponse getTransfer(GetTransferRequest request) {
        String path = String.format("/transfers/%s", request.getTransferUuid());
        String response = get(path, "");

        try {
            Transfer transfer = mapper.readValue(response, Transfer.class);
            return new GetTransferResponse.Builder()
                    .transfer(transfer)
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) {
        String path = "/transfers/withdraw";
        String response = post(path, "", request);

        try {
            WithdrawToCryptoAddressResponse responseObj = mapper.readValue(response, WithdrawToCryptoAddressResponse.class);
            return new WithdrawToCryptoAddressResponse.Builder()
                    .idem(responseObj.getIdem())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) {
        String path = "/transfers/address";
        String response = post(path, "", request);

        try {
            CreateCryptoAddressResponse responseObj = mapper.readValue(response, CreateCryptoAddressResponse.class);
            return new CreateCryptoAddressResponse.Builder()
                    .cryptoAddress(responseObj.getCryptoAddress())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) {
        String path = "/transfers/create-counterparty-id";
        String response = post(path, "", request);

        try {
            CreateCounterpartyIdResponse responseObj = mapper.readValue(response, CreateCounterpartyIdResponse.class);
            return new CreateCounterpartyIdResponse.Builder()
                    .counterparty(responseObj.getCounterparty())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) {
        String path = "/transfers/validate-counterparty-id";
        String response = post(path, "", request);

        try {
            ValidateCounterpartyIdResponse responseObj = mapper.readValue(response, ValidateCounterpartyIdResponse.class);
            return new ValidateCounterpartyIdResponse.Builder()
                    .counterpartyId(responseObj.getCounterpartyId())
                    .valid(responseObj.isValid())
                    .build();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) {
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
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private String get(String path, String query) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, "GET", null);
        if (builder == null) {
            return null;
        }

        HttpRequest httpRequest = builder.GET().build();
        return sendRequest(httpRequest);
    }

    private String post(String path, String query, Object requestBody) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, "POST", requestBody);
        if (builder == null) {
            return null;
        }

        HttpRequest httpRequest = builder.POST(HttpRequest.BodyPublishers.ofString(toJson(requestBody))).build();
        return sendRequest(httpRequest);
    }

    private String put(String path, String query, Object requestBody) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, "PUT", requestBody);
        if (builder == null) {
            return null;
        }

        HttpRequest httpRequest = builder.PUT(HttpRequest.BodyPublishers.ofString(toJson(requestBody))).build();
        return sendRequest(httpRequest);
    }

    private String delete(String path, String query, Object requestBody) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, "DELETE", null);
        if (builder == null) {
            return null;
        }

        HttpRequest httpRequest = builder.DELETE().build();
        return sendRequest(httpRequest);
    }

    private String patch(String path, String query, Object requestBody) {
        HttpRequest.Builder builder = generateHttpRequest(path, query, "PATCH", requestBody);
        if (builder == null) {
            return null;
        }

        HttpRequest httpRequest = builder.method("PATCH", HttpRequest.BodyPublishers.ofString(toJson(requestBody))).build();
        return sendRequest(httpRequest);
    }

    private HttpRequest.Builder generateHttpRequest(String path, String query, String method, Object requestBody) {
        String callUrl = baseUrl + path + query;
        System.out.println("URL: " + callUrl);

        URI uri = URI.create(callUrl);
        long unixTime = System.currentTimeMillis() / 1000L;
        String signature;
        try {
            signature = credentials.Sign(unixTime, method, uri.getPath(), requestBody != null ? toJson(requestBody) : "");
        } catch (Exception e) {
            System.err.println("Failed to generate request signature: " + e.getMessage());
            return null;
        }

        return HttpRequest.newBuilder()
                .uri(uri)
                .header("CB-ACCESS-KEY", credentials.getAccessKey())
                .header("CB-ACCESS-PASSPHRASE", credentials.getPassphrase())
                .header("CB-ACCESS-SIGN", signature)
                .header("CB-ACCESS-TIMESTAMP", String.valueOf(unixTime))
                .header("Content-Type", "application/json");
    }

    private String sendRequest(HttpRequest request) {
        try {
            HttpResponse<String> resp = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (resp.statusCode() != 200) {
                System.out.println("Request failed with status code: " + resp.statusCode());
                System.out.println("Response body: " + resp.body());
                throw new CoinbaseIntxException(resp.statusCode(), resp.body());
            }
            return resp.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            throw new CoinbaseIntxException("Failed to send request", e);
        }
    }

    private String toJson(Object obj) {
        try {
            return mapper.writeValueAsString(obj);
        } catch (IOException e) {
            throw new RuntimeException("Failed to serialize object to JSON", e);
        }
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public static class Builder {
        public final CoinbaseIntxCredentials credentials;
        public HttpClient client;
        public String baseUrl = "https://api-n5e1.coinbase.com/api/v1";

        public Builder(CoinbaseIntxCredentials credentials) {
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
