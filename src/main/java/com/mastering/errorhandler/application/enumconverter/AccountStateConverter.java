package com.mastering.errorhandler.application.enumconverter;

import com.mastering.errorhandler.application.enums.AccountState;

import javax.persistence.AttributeConverter;

public class AccountStateConverter implements AttributeConverter<AccountState, String> {

    @Override
    public String convertToDatabaseColumn(AccountState attribute) {
        return attribute == null ? null : attribute.getVal();
    }

    @Override
    public AccountState convertToEntityAttribute(String dbData) {
        return AccountState.getByValues(dbData);
    }
}
