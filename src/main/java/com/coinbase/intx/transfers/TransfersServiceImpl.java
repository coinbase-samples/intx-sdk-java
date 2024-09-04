package com.coinbase.intx.transfers;

import com.coinbase.core.service.CoinbaseServiceImpl;
import com.coinbase.intx.client.CoinbaseIntxClient;
import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.transfers.*;

public class TransfersServiceImpl extends CoinbaseServiceImpl implements TransfersService {
    public TransfersServiceImpl(CoinbaseIntxClient client) {
        super(client);
    }

    @Override
    public ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseIntxException {
        ListTransfersResponse resp = doGet(request, ListTransfersResponse.class);
        return new ListTransfersResponse.Builder()
                .pagination(resp.getPagination())
                .results(resp.getResults())
                .build();
    }

    @Override
    public GetTransferResponse getTransfer(GetTransferRequest request) throws CoinbaseIntxException {
        Transfer transfer = doGet(request, Transfer.class);
        return new GetTransferResponse.Builder()
                .transfer(transfer)
                .build();
    }

    @Override
    public WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) throws CoinbaseIntxException {
        WithdrawToCryptoAddressResponse resp = doPost(request, WithdrawToCryptoAddressResponse.class);
        return new WithdrawToCryptoAddressResponse.Builder()
                .idem(resp.getIdem())
                .build();
    }

    @Override
    public CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseIntxException {
        CreateCryptoAddressResponse resp = doPost(request, CreateCryptoAddressResponse.class);
        return new CreateCryptoAddressResponse.Builder()
                .cryptoAddress(resp.getCryptoAddress())
                .build();
    }

    @Override
    public CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseIntxException {
        CreateCounterpartyIdResponse resp = doPost(request, CreateCounterpartyIdResponse.class);
        return new CreateCounterpartyIdResponse.Builder()
                .counterparty(resp.getCounterparty())
                .build();
    }

    @Override
    public ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseIntxException {
        ValidateCounterpartyIdResponse resp = doPost(request, ValidateCounterpartyIdResponse.class);
        return new ValidateCounterpartyIdResponse.Builder()
                .counterpartyId(resp.getCounterpartyId())
                .valid(resp.isValid())
                .build();
    }

    @Override
    public WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseIntxException {
        WithdrawToCounterpartyIdResponse resp = doPost(request, WithdrawToCounterpartyIdResponse.class);
        return new WithdrawToCounterpartyIdResponse.Builder()
                .idem(resp.getIdem())
                .portfolioUuid(resp.getPortfolioUuid())
                .sourceCounterpartyId(resp.getSourceCounterpartyId())
                .targetCounterpartyId(resp.getTargetCounterpartyId())
                .asset(resp.getAsset())
                .amount(resp.getAmount())
                .build();
    }
}
