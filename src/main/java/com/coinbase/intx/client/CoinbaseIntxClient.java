package com.coinbase.intx.client;

import com.coinbase.core.client.CoinbaseNetHttpClient;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.intx.credentials.CoinbaseIntxCredentials;
import com.coinbase.intx.errors.CoinbaseIntxErrorMessage;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.utils.Constants;
import com.fasterxml.jackson.core.type.TypeReference;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class CoinbaseIntxClient extends CoinbaseNetHttpClient {
    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials, String baseUrl) {
        super(credentials, baseUrl);
    }

    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials, String baseUrl, HttpClient client) {
        super(credentials, baseUrl, client);
    }

    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials) {
        super(credentials, Constants.BASE_URL);
    }

    public CoinbaseIntxClient(CoinbaseIntxCredentials credentials, HttpClient client) {
        super(credentials, Constants.BASE_URL, client);
    }

    @Override
    protected <T> T handleResponse(
            HttpResponse<String> response,
            List<Integer> expectedStatusCodes,
            TypeReference<T> responseClass) throws CoinbaseIntxException {
        if (!expectedStatusCodes.contains(response.statusCode())) {
            try {
                CoinbaseIntxErrorMessage errorMessage = mapper.readValue(response.body(), CoinbaseIntxErrorMessage.class);
                throw errorMessage.createCoinbaseException();
            } catch (Exception e) {
                throw new CoinbaseIntxException(response.statusCode(), response.body());
            }
        }

        try {
            return mapper.readValue(response.body(), responseClass);
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to deserialize class", e);
        }
    }
}
