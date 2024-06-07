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

package com.coinbase.intx.utils;

public class Constants {
    public static final String BASE_URL = "https://api-n5e1.coinbase.com/api/v1";
    public static final String ACCESS_KEY_HEADER = "CB-ACCESS-KEY";
    public static final String PASSPHRASE_HEADER = "CB-ACCESS-PASSPHRASE";
    public static final String SIGNATURE_HEADER = "CB-ACCESS-SIGN";
    public static final String TIMESTAMP_HEADER = "CB-ACCESS-TIMESTAMP";
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    public static final String CONTENT_TYPE_JSON = "application/json";

    public static final String GET = "GET";
    public static final String POST = "POST";
    public static final String PUT = "PUT";
    public static final String DELETE = "DELETE";
    public static final String PATCH = "PATCH";

    public static final String HMAC_SHA256 = "HmacSHA256";
}
