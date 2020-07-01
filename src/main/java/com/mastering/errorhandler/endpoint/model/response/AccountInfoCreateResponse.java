package com.mastering.errorhandler.endpoint.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfoCreateResponse {
    private String accountNo;
    private String accountType;
    private Date expiryDate;
}
