package com.mastering.errorhandler.application.domain;

import com.mastering.errorhandler.application.enumconverter.AccountStateConverter;
import com.mastering.errorhandler.application.enumconverter.AccountTypeConverter;
import com.mastering.errorhandler.application.enumconverter.BooleanYNConverter;
import com.mastering.errorhandler.application.enumconverter.RoleCodeConverter;
import com.mastering.errorhandler.application.enums.AccountState;
import com.mastering.errorhandler.application.enums.AccountType;
import com.mastering.errorhandler.application.enums.BooleanYN;
import com.mastering.errorhandler.application.enums.RoleCode;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "account_info")
@Data
@EqualsAndHashCode(callSuper = false)
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccountInfo extends BaseDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "acc_no")
    private String accountNo;

    @Column(name = "acc_type")
    @Convert(converter = AccountTypeConverter.class)
    private AccountType accountType;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pacc_no", referencedColumnName = "acc_no")
    private AccountInfo parentAccountNo;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "exp_date")
    private Date expiryDate;

    @Column(name = "role_code")
    @Convert(converter = RoleCodeConverter.class)
    private RoleCode roleCode;

    @Column(name = "walet_disb_yn")
    @Convert(converter = BooleanYNConverter.class)
    private BooleanYN walletDisbursmentYN;

    @Column(name = "bal_bfore")
    private BigDecimal balanceBefore;

    @Column(name = "bal")
    private BigDecimal balance;

    @Column(name = "hmac")
    private String hmac;

    @Column(name = "stat")
    @Convert(converter = AccountStateConverter.class)
    private AccountState accountState;
}
