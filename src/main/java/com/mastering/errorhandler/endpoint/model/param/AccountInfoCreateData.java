package com.mastering.errorhandler.endpoint.model.param;

import com.mastering.errorhandler.application.enums.AccountType;
import com.mastering.errorhandler.application.enums.BooleanYN;
import com.mastering.errorhandler.application.enums.RoleCode;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoCreateData {
    private String accountNo;
    private AccountType accountType;
    private String parentAccountNo;
    private String bankName;
    private Date expiryDate;
    private RoleCode roleCode;
    private BooleanYN walletDisbursmentYN;
}
