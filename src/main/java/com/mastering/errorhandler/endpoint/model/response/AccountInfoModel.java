package com.mastering.errorhandler.endpoint.model.response;

import com.mastering.errorhandler.application.domain.AccountInfo;
import com.mastering.errorhandler.application.enums.AccountState;
import com.mastering.errorhandler.application.enums.AccountType;
import com.mastering.errorhandler.application.enums.BooleanYN;
import com.mastering.errorhandler.application.enums.RoleCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoModel {
    private String accountNo;
    private AccountType accountType;
    private AccountInfo parentAccountNo;
    private String bankName;
    private Date expiryDate;
    private RoleCode roleCode;
    private BooleanYN walletDisbursmentYN;
    private BigDecimal balanceBefore;
    private BigDecimal balance;
    private AccountState accountState;
}
