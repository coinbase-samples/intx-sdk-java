package com.coinbase.intx.orders;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.orders.*;

public interface OrdersService {
    // Orders
    CreateOrderResponse createOrder(CreateOrderRequest request) throws CoinbaseIntxException;
    CancelOrderResponse cancelOrder(CancelOrderRequest request) throws CoinbaseIntxException;
    CancelOrdersResponse cancelOrders(CancelOrdersRequest request) throws CoinbaseIntxException;
    GetOrderResponse getOrder(GetOrderRequest request) throws CoinbaseIntxException;
    ModifyOrderResponse modifyOrder(ModifyOrderRequest request) throws CoinbaseIntxException;
    ListOrdersResponse listOrders(ListOrdersRequest request) throws CoinbaseIntxException;
}
