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

package com.coinbase.intx.model.portfolios;

import com.coinbase.core.errors.CoinbaseClientException;
import com.coinbase.core.http.CoinbasePostRequest;

import static com.coinbase.core.utils.Utils.isNullOrEmpty;

public class EnableDisableCrossCollateralRequest extends CoinbasePostRequest {
    private String portfolio;
    private boolean enabled;

    public EnableDisableCrossCollateralRequest() {}

    private EnableDisableCrossCollateralRequest(Builder builder) {
        this.portfolio = builder.portfolio;
        this.enabled = builder.enabled;
    }

    @Override
    public String getPath() {
        return String.format("/portfolios/%s/cross-collateral-enabled", this.getPortfolio());
    }

    public String getPortfolio() {
        return portfolio;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public static class Builder {
        private String portfolio;
        private boolean enabled;

        public Builder() {}

        public Builder portfolio(String portfolio) {
            this.portfolio = portfolio;
            return this;
        }

        public Builder enabled(boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public EnableDisableCrossCollateralRequest build() throws CoinbaseClientException {
            validate();
            return new EnableDisableCrossCollateralRequest(this);
        }

        private void validate() throws CoinbaseClientException {
            if (isNullOrEmpty(portfolio)) {
                throw new CoinbaseClientException("Portfolio is required");
            }
        }
    }
}
