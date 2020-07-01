package com.mastering.errorhandler.application.enums;

import java.util.HashMap;
import java.util.Map;

public enum AccountState implements BaseEnum {
    ACTIVE("00"),
    INACTIVE("10");

    private static Map<String, AccountState> map = new HashMap<>();
    private String val;

    static {
        for (AccountState accountState : AccountState.values()) {
            map.put(accountState.getVal(), accountState);
        }
    }

    AccountState(String val) {
        this.val = val;
    }

    public static AccountState getByValues(String value) {
        return map.get(value);
    }

    @Override
    public String getVal() {
        return val;
    }
}
