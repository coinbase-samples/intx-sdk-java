package com.coinbase.intx.transfers;

import com.coinbase.intx.errors.CoinbaseIntxException;
import com.coinbase.intx.model.transfers.*;

public interface TransfersService {
    // Transfers
    ListTransfersResponse listTransfers(ListTransfersRequest request) throws CoinbaseIntxException;
    GetTransferResponse getTransfer(GetTransferRequest request) throws CoinbaseIntxException;
    WithdrawToCryptoAddressResponse withdrawToCryptoAddress(WithdrawToCryptoAddressRequest request) throws CoinbaseIntxException;
    CreateCryptoAddressResponse createCryptoAddress(CreateCryptoAddressRequest request) throws CoinbaseIntxException;
    CreateCounterpartyIdResponse createCounterpartyId(CreateCounterpartyIdRequest request) throws CoinbaseIntxException;
    ValidateCounterpartyIdResponse validateCounterpartyId(ValidateCounterpartyIdRequest request) throws CoinbaseIntxException;
    WithdrawToCounterpartyIdResponse withdrawToCounterpartyId(WithdrawToCounterpartyIdRequest request) throws CoinbaseIntxException;
}
