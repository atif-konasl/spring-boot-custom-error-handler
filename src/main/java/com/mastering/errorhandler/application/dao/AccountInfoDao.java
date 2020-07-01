package com.mastering.errorhandler.application.dao;

import com.mastering.errorhandler.application.domain.AccountInfo;

public interface AccountInfoDao {

    AccountInfo findAccountInfo(Long accountNo);

    AccountInfo saveAccountInfo(AccountInfo accountInfo);
}
