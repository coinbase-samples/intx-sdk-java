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

package com.coinbase.intx.orders;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.orders.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class OrdersServiceImpl extends CoinbaseServiceImpl implements OrdersService {
    public OrdersServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseIntxException {
        Order order = this.request(
                HttpMethod.POST,
                "/orders",
                request,
                List.of(200),
                new TypeReference<>() {});
        return new CreateOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseIntxException {
        Order order = this.request(
                HttpMethod.DELETE,
                String.format("/orders/%s", request.getId()),
                request,
                List.of(200),
                new TypeReference<>() {});
        return new CancelOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.DELETE,
                "/orders",
                request,
                List.of(200),
                new TypeReference<CancelOrdersResponse>() {});
    }

    @Override
    public GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseIntxException {
        Order order = this.request(
                HttpMethod.GET,
                String.format("/orders/%s", request.getId()),
                request,
                List.of(200),
                new TypeReference<>() {});
        return new GetOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public ModifyOrderResponse modifyOrder(ModifyOrderRequest request) throws CoinbaseIntxException {
        Order order = this.request(
                HttpMethod.PUT,
                String.format("/orders/%s", request.getId()),
                request,
                List.of(200),
                new TypeReference<>() {});
        return new ModifyOrderResponse.Builder()
                .order(order)
                .build();
    }

    @Override
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.GET,
                "/orders",
                request,
                List.of(200),
                new TypeReference<ListOrdersResponse>() {});
    }
}
