package com.mastering.errorhandler.application.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public interface BaseEnum {

    @JsonValue
    String getVal();
}
