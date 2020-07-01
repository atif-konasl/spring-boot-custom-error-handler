package com.mastering.errorhandler.application.enumconverter;

import com.mastering.errorhandler.application.enums.BooleanYN;

import javax.persistence.AttributeConverter;

public class BooleanYNConverter implements AttributeConverter<BooleanYN, String> {

    @Override
    public String convertToDatabaseColumn(BooleanYN attribute) {
        return attribute == null ? null : attribute.getVal();
    }

    @Override
    public BooleanYN convertToEntityAttribute(String dbData) {
        return BooleanYN.getByValues(dbData);
    }
}
