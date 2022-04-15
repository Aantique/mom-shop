package com.mom.shop.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : songxuyang
 * @date : 2022/4/15
 */

public class StringUtil {


    public static Boolean isNullOrEmp(String s){
        return s != null && s.replaceAll(" ", "").length() != 0;
    }

    public static List<String> removeSpaceAndSplit(String s){
        if (isNullOrEmp(s)){
            return Arrays.asList(s.replaceAll(" ", "").split(","));
        }
        return new ArrayList<>();
    }
}
