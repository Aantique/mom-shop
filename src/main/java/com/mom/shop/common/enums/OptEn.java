package com.mom.shop.common.enums;

import com.jojo.stone.free.enums.IEnum;

/**
 * @author : songxuyang
 * @date : 2022/4/15
 */

public enum OptEn implements IEnum {
    INSERT("1","新增"),
    DELETE("2","删除"),
    EDIT("3","编辑");
    private String value;
    private String desc;

    OptEn(String value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public String getDesc() {
        return desc;
    }
}
