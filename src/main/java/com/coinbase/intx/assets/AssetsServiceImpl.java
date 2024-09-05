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

package com.coinbase.intx.assets;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.assets.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class AssetsServiceImpl extends CoinbaseServiceImpl implements AssetsService {
    public AssetsServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public ListAssetsResponse listAssets() throws CoinbaseIntxException {
        List<Asset> assets = this.request(
                HttpMethod.GET,
                "/assets",
                null,
                List.of(200),
                new TypeReference<>() {});

        return new ListAssetsResponse.Builder()
                .assets(assets)
                .build();
    }

    @Override
    public GetAssetResponse getAsset(GetAssetRequest request) throws CoinbaseIntxException {
        Asset asset = this.request(
                HttpMethod.GET,
                String.format("/assets/%s", request.getAssetId()),
                null,
                List.of(200),
                new TypeReference<>() {}
        );
        return new GetAssetResponse.Builder()
                .asset(asset)
                .build();
    }

    @Override
    public GetSupportedNetworksResponse getSupportedNetworks(GetSupportedNetworksRequest request) throws CoinbaseIntxException {
        List<SupportedNetwork> networks = this.request(
                HttpMethod.GET,
                String.format("/assets/%s/networks", request.getAsset()),
                request,
                List.of(200),
                new TypeReference<>() {});
        return new GetSupportedNetworksResponse.Builder()
                .networks(networks)
                .request(request)
                .build();
    }
}
