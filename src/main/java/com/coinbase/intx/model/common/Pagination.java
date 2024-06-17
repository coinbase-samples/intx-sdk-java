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

package com.coinbase.intx.model.common;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    @JsonProperty("result_limit")
    private int resultLimit;

    @JsonProperty("result_offset")
    private int resultOffset;

    public Pagination() {}

    private Pagination(Builder builder) {
        this.resultLimit = builder.resultLimit;
        this.resultOffset = builder.resultOffset;
    }

    public int getResultLimit() {
        return resultLimit;
    }

    public void setResultLimit(int resultLimit) {
        this.resultLimit = resultLimit;
    }

    public int getResultOffset() {
        return resultOffset;
    }

    public void setResultOffset(int resultOffset) {
        this.resultOffset = resultOffset;
    }

    public static class Builder {
        private int resultLimit;
        private int resultOffset;

        public Builder() {}

        public Builder resultLimit(int resultLimit) {
            this.resultLimit = resultLimit;
            return this;
        }

        public Builder resultOffset(int resultOffset) {
            this.resultOffset = resultOffset;
            return this;
        }

        public Pagination build() {
            return new Pagination(this);
        }
    }
}

