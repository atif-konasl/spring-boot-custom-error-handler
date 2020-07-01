package com.mastering.errorhandler.application.enums;

import java.util.HashMap;
import java.util.Map;

public enum RoleCode implements BaseEnum {
    CUSTOMER("01"),
    BANK("02");

    private static Map<String, RoleCode> map = new HashMap<>();
    private String val;

    static {
        for (RoleCode roleCode : RoleCode.values()) {
            map.put(roleCode.getVal(), roleCode);
        }
    }

    RoleCode(String val) {
        this.val = val;
    }

    public static RoleCode getByValues(String value) {
        return map.get(value);
    }

    @Override
    public String getVal() {
        return val;
    }
}
