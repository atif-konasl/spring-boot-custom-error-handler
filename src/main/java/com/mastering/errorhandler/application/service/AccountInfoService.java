package com.mastering.errorhandler.application.service;

import com.mastering.errorhandler.endpoint.model.param.AccountInfoCreateData;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoCreateResponse;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoModel;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public interface AccountInfoService {

    AccountInfoCreateResponse createAccountInfo(
            AccountInfoCreateData accInfoData) throws ParseException;

    AccountInfoModel getAccountInfo(Long accountInfoId);
}
