package com.mastering.errorhandler.application.enums;

import java.util.HashMap;
import java.util.Map;

public enum AccountType implements BaseEnum {
    STATIC("01"),
    DYNAMIC("02");

    private static Map<String, AccountType> map = new HashMap<>();
    private String val;

    static {
        for (AccountType accountType : AccountType.values()) {
            map.put(accountType.getVal(), accountType);
        }
    }

    AccountType(String val) {
        this.val = val;
    }

    public static AccountType getByValues(String value) {
        return map.get(value);
    }

    @Override
    public String getVal() {
        return val;
    }
}
