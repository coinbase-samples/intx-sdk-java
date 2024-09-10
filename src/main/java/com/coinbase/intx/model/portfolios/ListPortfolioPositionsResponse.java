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

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ListPortfolioPositionsResponse {

    @JsonProperty("positions")
    private List<PortfolioDetail.Position> positions;

    public ListPortfolioPositionsResponse() {}

    private ListPortfolioPositionsResponse(Builder builder) {
        this.positions = builder.positions;
    }

    public List<PortfolioDetail.Position> getPositions() {
        return positions;
    }

    public void setPositions(List<PortfolioDetail.Position> positions) {
        this.positions = positions;
    }

    public static class Builder {
        private List<PortfolioDetail.Position> positions;

        public Builder() {}

        public Builder positions(List<PortfolioDetail.Position> positions) {
            this.positions = positions;
            return this;
        }

        public ListPortfolioPositionsResponse build() {
            return new ListPortfolioPositionsResponse(this);
        }
    }
}
