package com.mastering.errorhandler.endpoint.api;

import com.mastering.errorhandler.application.service.AccountInfoService;
import com.mastering.errorhandler.application.service.AccountInfoServiceImpl;
import com.mastering.errorhandler.endpoint.model.request.AccountInfoCreateRequest;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoCreateResponse;
import com.mastering.errorhandler.endpoint.model.response.AccountInfoModel;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Slf4j
@RestController
@RequestMapping("/api/account-info")
public class AccountInfoController {
    Logger logger = LoggerFactory.getLogger(AccountInfoController.class);
    private AccountInfoService accountInfoService;

    @Autowired
    public AccountInfoController(AccountInfoServiceImpl accountInfoService) {
        this.accountInfoService = accountInfoService;
    }


    @PostMapping
    public AccountInfoCreateResponse createAccountInfo(
            @RequestBody @Valid AccountInfoCreateRequest request) {
        logger.info("Getting {request} : " + request.toString());
        return null;
    }


    @ApiOperation(value = "Api for getting single account info")
    @GetMapping(value = "/{id}")
    public AccountInfoModel getAccountInfo(@PathVariable Long id) {
        if (id == null || id.equals(Long.valueOf(0))) {
            log.error("Account info is invalid");
            return null;
        }
        AccountInfoModel responseModel = accountInfoService.getAccountInfo(id);
        return responseModel;
    }
}
