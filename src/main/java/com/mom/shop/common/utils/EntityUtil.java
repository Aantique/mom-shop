package com.mom.shop.common.utils;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Clozer
 * @date 2022/3/30 17:52
 */
public class EntityUtil {
    public static Map<String,Object> isEmpty(Object obj)  {
        Class<?> clazz = obj.getClass();
        //得到属性集合
        Field[] fs = clazz.getDeclaredFields();
        Map<String,Object> map = new HashMap<>();
        for (Field f : fs) {
            f.setAccessible(true);
            Object o = null;
            try {
                o = f.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            if (f.getType()==String.class && (o !=null) && o!=""){
                String name = f.getName();
                 map.put(name,o);
            }
        }
        return map;
    }

}
