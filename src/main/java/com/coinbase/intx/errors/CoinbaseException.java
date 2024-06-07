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

package com.coinbase.intx.errors;

public class CoinbaseException extends RuntimeException {
    private final int statusCode;

    public CoinbaseException(int statusCode, String message) {
        super(message);
        this.statusCode = statusCode;
    }

    public CoinbaseException(String message, Throwable cause) {
        super(message, cause);
        this.statusCode = 500;
    }

    public CoinbaseException(int statusCode, String message, Throwable cause) {
        super(message, cause);
        this.statusCode = statusCode;
    }

    public CoinbaseException(Throwable cause) {
        super(cause);
        this.statusCode = 500;
    }

    public CoinbaseException(String message) {
        super(message);
        this.statusCode = 500;
    }

    public int getStatusCode() {
        return statusCode;
    }
}

