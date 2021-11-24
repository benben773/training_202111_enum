package com.tdd.bo;

/**
 * @author ：ls05
 * @date ：Created in 2021/11/24 13:14
 */
public class EnumBody {
    private String enumFildName;
    private String enumValue;
    private String desc;

    public EnumBody(String enumFildName, String enumValue, String desc) {
        this.enumFildName = enumFildName;
        this.enumValue = enumValue;
        this.desc = desc;
    }

    public String getEnumFildName() {
        return enumFildName;
    }

    public String getEnumValue() {
        return enumValue;
    }

    public String getDesc() {
        return desc;
    }
}
