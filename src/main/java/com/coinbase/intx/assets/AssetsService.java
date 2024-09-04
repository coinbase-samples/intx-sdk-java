package com.coinbase.intx.assets;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.assets.*;

public interface AssetsService {
    ListAssetsResponse listAssets() throws CoinbaseIntxException;
    GetAssetResponse getAsset(GetAssetRequest request) throws CoinbaseIntxException;
    GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request) throws CoinbaseIntxException;
}
