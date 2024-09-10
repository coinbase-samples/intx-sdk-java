package com.coinbase.intx.factory;

import com.coinbase.intx.assets.AssetsService;
import com.coinbase.intx.assets.AssetsServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.feerates.FeeRatesService;
import com.coinbase.intx.feerates.FeeRatesServiceImpl;
import com.coinbase.intx.instruments.InstrumentsService;
import com.coinbase.intx.instruments.InstrumentsServiceImpl;
import com.coinbase.intx.orders.OrdersService;
import com.coinbase.intx.orders.OrdersServiceImpl;
import com.coinbase.intx.portfolios.PortfoliosService;
import com.coinbase.intx.portfolios.PortfoliosServiceImpl;
import com.coinbase.intx.transfers.TransfersService;
import com.coinbase.intx.transfers.TransfersServiceImpl;

public class IntxServiceFactory {
    public static AssetsService createAssetsService(CoinbaseIntxClient client) {
        return new AssetsServiceImpl(client);
    }

    public static FeeRatesService createFeeRatesService(CoinbaseIntxClient client) {
        return new FeeRatesServiceImpl(client);
    }

    public static InstrumentsService createInstrumentsService(CoinbaseIntxClient client) {
        return new InstrumentsServiceImpl(client);
    }

    public static OrdersService createOrdersService(CoinbaseIntxClient client) {
        return new OrdersServiceImpl(client);
    }

    public static PortfoliosService createPortfoliosService(CoinbaseIntxClient client) {
        return new PortfoliosServiceImpl(client);
    }

    public static TransfersService createTransfersService(CoinbaseIntxClient client) {
        return new TransfersServiceImpl(client);
    }
}
