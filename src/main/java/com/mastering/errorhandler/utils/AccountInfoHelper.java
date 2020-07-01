package com.mastering.errorhandler.utils;

import com.mastering.errorhandler.application.domain.AccountInfo;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoModel;

public class AccountInfoHelper {

    public static AccountInfoModel buildAccountInfoModel(AccountInfo accountInfo) {
        return AccountInfoModel.builder()
                .accountNo(accountInfo.getAccountNo())
                .accountType(accountInfo.getAccountType())
                .parentAccountNo(accountInfo.getParentAccountNo())
                .bankName(accountInfo.getBankName())
                .expiryDate(accountInfo.getExpiryDate())
                .roleCode(accountInfo.getRoleCode())
                .walletDisbursmentYN(accountInfo.getWalletDisbursmentYN())
                .balance(accountInfo.getBalance())
                .balanceBefore(accountInfo.getBalanceBefore())
                .accountState(accountInfo.getAccountState())
                .build();
    }
}
