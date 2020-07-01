package com.mastering.errorhandler.application.dao;

import com.mastering.errorhandler.application.domain.AccountInfo;
import com.mastering.errorhandler.application.repository.AccountInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountInfoDaoImpl implements AccountInfoDao {
    private AccountInfoRepository accountInfoRepository;

    @Autowired
    public AccountInfoDaoImpl(AccountInfoRepository accountInfoRepository) {
        this.accountInfoRepository = accountInfoRepository;
    }

    @Override
    public AccountInfo findAccountInfo(Long accountNo) {
        AccountInfo fetchedEntity = accountInfoRepository.findById(accountNo).orElse(null);
        return fetchedEntity;
    }

    @Override
    public AccountInfo saveAccountInfo(AccountInfo accountInfo) {
        return null;
    }
}
