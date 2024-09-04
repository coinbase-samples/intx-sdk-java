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
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.errors.CoinbaseIntxExceptionFactory;
import com.coinbase.intx.model.feerates.FeeRate;
import com.coinbase.intx.model.feerates.*;
import com.coinbase.intx.model.instruments.*;
import com.coinbase.intx.model.orders.*;
import com.coinbase.intx.model.portfolios.*;
import com.coinbase.intx.model.transfers.*;
import com.coinbase.intx.utils.Constants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.util.List;

public class CoinbaseIntxHttpClient {
    private final ObjectMapper mapper;
    public CoinbaseIntxHttpClient(String baseUrl, CoinbaseCredentials credentials, HttpClient client) {
        super(baseUrl, credentials, client);
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public CoinbaseIntxHttpClient(String baseUrl, String credentialsJson) {
        super(baseUrl, credentialsJson);
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public CoinbaseIntxHttpClient(String baseUrl, CoinbaseCredentials credentials) {
        super(baseUrl, credentials);
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public CoinbaseIntxHttpClient(CoinbaseCredentials credentials) {
        super(Constants.BASE_URL, credentials);
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public CoinbaseIntxHttpClient(String credentialsJson) {
        super(Constants.BASE_URL, credentialsJson);
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public CoinbaseIntxHttpClient(CoinbaseCredentials credentials, HttpClient client) {
        super(Constants.BASE_URL, credentials, client);
        this.mapper = new ObjectMapper();
        this.mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    public CoinbaseIntxHttpClient(String credentialsJson, HttpClient client) {
        super(Constants.BASE_URL, credentialsJson, client);
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
                .header(Constants.ACCESS_KEY_HEADER, super.getCredentials().getAccessKey())
                .header(Constants.PASSPHRASE_HEADER, super.getCredentials().getPassphrase())
                .header(Constants.SIGNATURE_HEADER, signature)
                .header(Constants.TIMESTAMP_HEADER, String.valueOf(timestamp))
                .header(Constants.CONTENT_TYPE_HEADER, Constants.CONTENT_TYPE_JSON);
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
        CancelOrdersResponse resp = doDelete(request, CancelOrdersResponse.class);
        return new CancelOrdersResponse.Builder()
                .results(resp.getResults())
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
        ListOrdersResponse resp = doGet(request, ListOrdersResponse.class);
        return new ListOrdersResponse.Builder()
                .pagination(resp.getPagination())
                .results(resp.getResults())
                .build();
    }


    @Override
    public ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseIntxException {
        ListTransfersResponse resp = doGet(request, ListTransfersResponse.class);
        return new ListTransfersResponse.Builder()
                .pagination(resp.getPagination())
                .results(resp.getResults())
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
        WithdrawToCryptoAddressResponse resp = doPost(request, WithdrawToCryptoAddressResponse.class);
        return new WithdrawToCryptoAddressResponse.Builder()
                .idem(resp.getIdem())
                .build();
    }

    @Override
    public CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseIntxException {
        CreateCryptoAddressResponse resp = doPost(request, CreateCryptoAddressResponse.class);
        return new CreateCryptoAddressResponse.Builder()
                .cryptoAddress(resp.getCryptoAddress())
                .build();
    }

    @Override
    public CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseIntxException {
        CreateCounterpartyIdResponse resp = doPost(request, CreateCounterpartyIdResponse.class);
        return new CreateCounterpartyIdResponse.Builder()
                .counterparty(resp.getCounterparty())
                .build();
    }

    @Override
    public ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseIntxException {
        ValidateCounterpartyIdResponse resp = doPost(request, ValidateCounterpartyIdResponse.class);
        return new ValidateCounterpartyIdResponse.Builder()
                .counterpartyId(resp.getCounterpartyId())
                .valid(resp.isValid())
                .build();
    }

    @Override
    public WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseIntxException {
        WithdrawToCounterpartyIdResponse resp = doPost(request, WithdrawToCounterpartyIdResponse.class);
        return new WithdrawToCounterpartyIdResponse.Builder()
                .idem(resp.getIdem())
                .portfolioUuid(resp.getPortfolioUuid())
                .sourceCounterpartyId(resp.getSourceCounterpartyId())
                .targetCounterpartyId(resp.getTargetCounterpartyId())
                .asset(resp.getAsset())
                .amount(resp.getAmount())
                .build();
    }
}
