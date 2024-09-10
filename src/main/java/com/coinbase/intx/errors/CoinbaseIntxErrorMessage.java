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

package com.coinbase.intx.errors;

import com.coinbase.core.errors.CoinbaseErrorMessage;
import com.coinbase.core.errors.CoinbaseException;

public class CoinbaseIntxErrorMessage implements CoinbaseErrorMessage {
    private String title;
    private int status;
    private String error;

    public CoinbaseIntxErrorMessage() {
    }

    @Override
    public CoinbaseException createCoinbaseException() {
        return new CoinbaseIntxException(status, String.format("Title: %s, Error: %s", this.title, this.error));
    }
}
