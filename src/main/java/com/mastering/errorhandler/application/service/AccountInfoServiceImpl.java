package com.mastering.errorhandler.application.service;

import com.mastering.errorhandler.application.dao.AccountInfoDao;
import com.mastering.errorhandler.application.dao.AccountInfoDaoImpl;
import com.mastering.errorhandler.application.domain.AccountInfo;
import com.mastering.errorhandler.endpoint.model.param.AccountInfoCreateData;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoCreateResponse;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoModel;
import com.mastering.errorhandler.utils.AccountInfoHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@Slf4j
@Service
public class AccountInfoServiceImpl implements AccountInfoService {

    private AccountInfoDao accountInfoDao;

    @Autowired
    public AccountInfoServiceImpl(AccountInfoDaoImpl accountInfoDao) {
        this.accountInfoDao = accountInfoDao;
    }

    @Override
    public AccountInfoCreateResponse createAccountInfo(
            AccountInfoCreateData accInfoData) throws ParseException {


        return AccountInfoCreateResponse.builder()
                .accountNo("1234544555")
                .accountType("01")
                .expiryDate(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS")
                        .parse("2025-01-01T00:00:00.000"))
                .build();
    }

    @Override
    public AccountInfoModel getAccountInfo(Long accountInfoId) {
        log.info("Try to getting account information from db");

        AccountInfo accountInfo = accountInfoDao.findAccountInfo(accountInfoId);
        if (accountInfo == null) {
            log.error("Data not found in database.");
            return null;
            // Need to throw a custom error
        }
        AccountInfoModel responseModel = AccountInfoHelper.buildAccountInfoModel(accountInfo);
        return responseModel;
    }
}
