package com.mom.shop.common.resp;


import com.mom.shop.common.enums.RestCodeEn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Clozer
 * @date 2022/3/26 7:26 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {
    private String code;
    private String message;
    private Boolean success;
    private T data;

    public static <T> Result<T> success(T data){
        return new Result<>("200","success",true,data);
    }

    public static <T> Result<T> fail(T data){
        return new Result<>("404","failed",true,data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> Result<T> forbidden(T data) {
        return new Result<T>(RestCodeEn.FORBIDDEN.getValue(), RestCodeEn.FORBIDDEN.getDesc(),false, data);
    }

    public static <T> Result<T> unauthorized(T date){
        return new Result<>(RestCodeEn.UNAUTHORIZED.getValue(),RestCodeEn.UNAUTHORIZED.getDesc(), false,date);
    }
}
