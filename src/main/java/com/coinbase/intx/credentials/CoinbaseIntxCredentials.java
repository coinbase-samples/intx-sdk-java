/*
 * Copyright 2024-present Coinbase Global, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.coinbase.intx.credentials;

import com.coinbase.core.credentials.CoinbaseCredentials;
import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.intx.utils.Constants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;
import static com.coinbase.intx.utils.Constants.HMAC_SHA256;

public class CoinbaseIntxCredentials implements CoinbaseCredentials {
    @JsonProperty(required = true)
    private String accessKey;
    @JsonProperty(required = true)
    private String passphrase;
    @JsonProperty(required = true)
    private String signingKey;
    
    public CoinbaseIntxCredentials(String credentialsJson) throws CoinbaseClientException {
        ObjectMapper mapper = new ObjectMapper();
        try {
            CoinbaseIntxCredentials credentials = mapper.readValue(credentialsJson, CoinbaseIntxCredentials.class);
            this.accessKey = credentials.getAccessKey();
            this.passphrase = credentials.getPassphrase();
            this.signingKey = credentials.getSigningKey();
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to parse credentials", e);
        }
    }

    public CoinbaseIntxCredentials(String accessKey, String passphrase, String signingKey) throws CoinbaseClientException {
        if (isNullOrEmpty(accessKey)) {
            throw new CoinbaseClientException("Access key is required");
        }
        this.accessKey = accessKey;

        if (isNullOrEmpty(passphrase)) {
            throw new CoinbaseClientException("Passphrase is required");
        }
        this.passphrase = passphrase;

        if (isNullOrEmpty(signingKey)) {
            throw new CoinbaseClientException("Signing key is required");
        }
        this.signingKey = signingKey;
    }

    public CoinbaseIntxCredentials() {}

    public CoinbaseIntxCredentials(Builder builder) {
        this.accessKey = builder.accessKey;
        this.passphrase = builder.passphrase;
        this.signingKey = builder.signingKey;
    }

    @Override
    public Map<String, String> generateAuthHeaders(String method, java.net.URI uri, String body) throws CoinbaseClientException {
        long timestamp = System.currentTimeMillis() / 1000;
        String path = uri.getPath();
        String signature = sign(timestamp, method, path, body);

        return Map.of(
                "CB-ACCESS-KEY", accessKey,
                "CB-ACCESS-SIGN", signature,
                "CB-ACCESS-TIMESTAMP", String.valueOf(timestamp),
                "CB-ACCESS-PASSPHRASE", passphrase,
                "User-Agent", String.format("intx-sdk-java/%s", Constants.SDK_VERSION)
        );
    }

    private String sign(long timestamp, String method, String path, String body) throws CoinbaseClientException {
        try {
            String message = String.format("%s%s%s%s", timestamp, method, path, body);

            byte[] hmacKey = Base64.getDecoder().decode(signingKey);
            Mac mac = Mac.getInstance(HMAC_SHA256);
            mac.init(new SecretKeySpec(hmacKey, HMAC_SHA256));

            byte[] signature = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(signature);
        } catch (Throwable e) {
            throw new CoinbaseClientException("Failed to generate signature", e);
        }
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    protected String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public static class Builder {
        private String accessKey;
        private String passphrase;
        private String signingKey;

        public Builder() {}

        public Builder accessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }

        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            return this;
        }

        public Builder signingKey(String signingKey) {
            this.signingKey = signingKey;
            return this;
        }

        public CoinbaseCredentials build() throws CoinbaseClientException {
            this.validate();
            return new CoinbaseIntxCredentials(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(this.accessKey)) {
                throw new CoinbaseClientException("Access key is required");
            }
            if (isNullOrEmpty(this.passphrase)) {
                throw new CoinbaseClientException("Passphrase is required");
            }
            if (isNullOrEmpty(this.signingKey)) {
                throw new CoinbaseClientException("Signing key is required");
            }
        }
    }
}
