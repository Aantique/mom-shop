package com.mom.shop.common.enums;

/**
 * @author Clozer
 * @date 2022/3/27 3:16 PM
 */

public interface IEnum {

    /**
     *
     * super getEnum
     * @param type
     * @param value
     * @param <T>
     * @return
     */
    public static <T extends IEnum> T getEnum(Class<T> type, int value) {
        T[] objs = type.getEnumConstants();
        for (T em : objs) {
            if (em.getValue().equals(value)) {
                return em;
            }
        }
        return null;
    }

    /**
     * return Integer
     * @return Integer
     */
    String getValue();


    /**
     * return String
     * @return
     */
    String getDesc();
}
