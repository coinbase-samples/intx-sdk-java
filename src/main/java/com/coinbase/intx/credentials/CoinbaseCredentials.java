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

package com.coinbase.intx.credentials;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CoinbaseCredentials {
    private static final String HMAC_SHA256 = "HmacSHA256";
    private static Mac macInstance;

    private String accessKey;
    private String passphrase;
    private String signingKey;
    private String portfolioId;

    static {
        try {
            macInstance = Mac.getInstance(HMAC_SHA256);
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize HMAC instance", e);
        }
    }

    public CoinbaseCredentials() {
    }

    public CoinbaseCredentials(Builder builder) {
        this.accessKey = builder.accessKey;
        this.passphrase = builder.passphrase;
        this.signingKey = builder.signingKey;
        this.portfolioId = builder.portfolioId;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getPassphrase() {
        return passphrase;
    }

    public void setPassphrase(String passphrase) {
        this.passphrase = passphrase;
    }

    public String getSigningKey() {
        return signingKey;
    }

    public void setSigningKey(String signingKey) {
        this.signingKey = signingKey;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String Sign(Long timestamp, String method, String requestPath, String body) throws RuntimeException {
        try {
            String message = timestamp + method + requestPath + (body != null ? body : "");
            byte[] hmacKey = Base64.getDecoder().decode(signingKey);

            Mac mac = (Mac) macInstance.clone();
            mac.init(new SecretKeySpec(hmacKey, HMAC_SHA256));
            byte[] signature = mac.doFinal(message.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(signature);
        } catch (Exception e) {
            throw new RuntimeException("Failed to generate signature", e);
        }
    }


    public static class Builder {
        private final String accessKey;
        private final String passphrase;
        private final String signingKey;

        private String portfolioId;

        public Builder(String accessKey, String passphrase, String signingKey) {
            this.accessKey = accessKey;
            this.passphrase = passphrase;
            this.signingKey = signingKey;
        }

        public Builder withPortfolioId(String portfolioId) {
            this.portfolioId = portfolioId;
            return this;
        }

        public CoinbaseCredentials build() {
            return new CoinbaseCredentials(this);
        }
    }
}
