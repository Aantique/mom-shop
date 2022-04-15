package com.mom.shop.common.exception;

import com.jojo.stone.free.enums.ErrorCodeEn;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author Clozer
 * @date 2022/3/26 8:31 PM
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class StarException extends RuntimeException{
    private String message;
    private String code;

    public StarException(){
        this(ErrorCodeEn.SYSTEM_ERROR);
    }

    public StarException(ErrorCodeEn errorCodeEn){
        this(errorCodeEn.getDesc(),errorCodeEn.getValue());
    }

    public StarException(String code,String message){
        super(message);
        this.message = message;
        this.code = code;
    }
}
