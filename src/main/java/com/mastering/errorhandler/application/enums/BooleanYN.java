package com.mastering.errorhandler.application.enums;

import java.util.HashMap;
import java.util.Map;

public enum BooleanYN implements BaseEnum {
    Y("0"),
    N("1");

    private static Map<String, BooleanYN> map = new HashMap<>();
    private String val;

    static {
        for (BooleanYN booleanYN : BooleanYN.values()) {
            map.put(booleanYN.getVal(), booleanYN);
        }
    }

    BooleanYN(String val) {
        this.val = val;
    }

    public static BooleanYN getByValues(String value) {
        return map.get(value);
    }

    @Override
    public String getVal() {
        return val;
    }
}
