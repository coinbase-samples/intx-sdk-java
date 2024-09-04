package com.coinbase.intx.transfers;

import com.coinbase.core.common.HttpMethod;
import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.transfers.*;
import com.fasterxml.jackson.core.type.TypeReference;

import java.util.List;

public class TransfersServiceImpl extends CoinbaseServiceImpl implements TransfersService {
    public TransfersServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.GET,
                "/transfers",
                request,
                List.of(200),
                new TypeReference<ListTransfersResponse>() {});
    }

    @Override
    public GetTransferResponse getTransfer(GetTransferRequest request) throws CoinbaseIntxException {
        Transfer transfer = this.request(
                HttpMethod.GET,
                String.format("/transfers/%s", request.getTransferUuid()),
                null,
                List.of(200),
                new TypeReference<Transfer>() {});
        return new GetTransferResponse.Builder()
                .transfer(transfer)
                .build();
    }

    @Override
    public WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/transfers/withdraw",
                request,
                List.of(200),
                new TypeReference<WithdrawToCryptoAddressResponse>() {});
    }

    @Override
    public CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/transfers/address",
                request,
                List.of(200),
                new TypeReference<CreateCryptoAddressResponse>() {});
    }

    @Override
    public CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/transfers/create-counterparty-id",
                request,
                List.of(200),
                new TypeReference<CreateCounterpartyIdResponse>() {});
    }

    @Override
    public ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/transfers/validate-counterparty-id",
                request,
                List.of(200),
                new TypeReference<ValidateCounterpartyIdResponse>() {});
    }

    @Override
    public WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseIntxException {
        return this.request(
                HttpMethod.POST,
                "/transfers/withdraw/counterparty",
                request,
                List.of(200),
                new TypeReference<WithdrawToCounterpartyIdResponse>() {});
    }
}
