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
