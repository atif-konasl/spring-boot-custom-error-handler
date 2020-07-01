package com.mastering.errorhandler.endpoint.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoCreateRequest {

    @NotNull
    @ApiModelProperty(value = "Account number", example = "1236445454", required = true)
    private String accountNo;

    @NotNull
    @ApiModelProperty(value = "Type of the account", example = "Savings(01) Or Salary(02)", required = true)
    private String accountType;

    @NotNull
    @ApiModelProperty(value = "Added any parent account number", example = "1236445454")
    private String parentAccountNo;

    @NotNull
    @ApiModelProperty(value = "Name of the bank", example = "National bank", required = true)
    private String bankName;

    @NotNull
    @ApiModelProperty(value = "Expiry date of the account", example = "01/2025", required = true)
    private Date expiryDate;

    @NotNull
    @ApiModelProperty(value = "Role code of the customer", example = "01 or 02")
    private String roleCode;

    @NotNull
    @ApiModelProperty(value = "Wallet disbursement YN ", example = "Y/N")
    private String walletDisbursmentYN;
}
