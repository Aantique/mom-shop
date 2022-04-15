package com.mom.shop.common.enums;

import com.jojo.stone.free.enums.IEnum;

/**
 * @author Clozer
 * @date 2022/3/28 17:30
 */
public enum RestCodeEn implements IEnum {

    SUCCESS("200", "操作成功"),
    FAILED("500", "操作失败"),
    VALIDATE_FAILED("404", "参数检验失败"),
    UNAUTHORIZED("401", "暂未登录或token已经过期"),
    FORBIDDEN("403", "没有相关权限");
    private String value;
    private String desc;

    RestCodeEn(String value, String desc) {
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
