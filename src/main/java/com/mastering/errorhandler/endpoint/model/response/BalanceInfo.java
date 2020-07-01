package com.mastering.errorhandler.endpoint.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BalanceInfo {
    private String accountNo;
    private BigDecimal balance;
}
