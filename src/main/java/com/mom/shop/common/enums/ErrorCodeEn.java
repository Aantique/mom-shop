package com.mom.shop.common.enums;

import com.jojo.stone.free.enums.IEnum;

/**
 * @author : songxuyang
 * @date : 2022/4/15
 */

public enum ErrorCodeEn implements IEnum {

    SYSTEM_ERROR("101","sys_error");

    private String desc;
    private String value;

    ErrorCodeEn( String value,String desc) {
        this.desc = desc;
        this.value = value;
    }

    @Override
    public String getValue() {
        return null;
    }

    @Override
    public String getDesc() {
        return null;
    }
}
