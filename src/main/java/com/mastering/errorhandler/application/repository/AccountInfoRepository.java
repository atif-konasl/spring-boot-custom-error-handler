package com.mastering.errorhandler.application.repository;

import com.mastering.errorhandler.application.domain.AccountInfo;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AccountInfoRepository extends CrudRepository<AccountInfo, Long> {

}
