package com.mastering.errorhandler.application.enumconverter;

import com.mastering.errorhandler.application.enums.RoleCode;

import javax.persistence.AttributeConverter;

public class RoleCodeConverter implements AttributeConverter<RoleCode, String> {

    @Override
    public String convertToDatabaseColumn(RoleCode attribute) {
        return attribute == null ? null : attribute.getVal();
    }

    @Override
    public RoleCode convertToEntityAttribute(String dbData) {
        return RoleCode.getByValues(dbData);
    }
}
