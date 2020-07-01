package com.mastering.errorhandler.application.enumconverter;

import com.mastering.errorhandler.application.enums.AccountType;

import javax.persistence.AttributeConverter;

public class AccountTypeConverter implements AttributeConverter<AccountType, String> {

    @Override
    public String convertToDatabaseColumn(AccountType attribute) {
        return attribute == null ? null : attribute.getVal();
    }

    @Override
    public AccountType convertToEntityAttribute(String dbData) {
        return AccountType.getByValues(dbData);
    }
}
