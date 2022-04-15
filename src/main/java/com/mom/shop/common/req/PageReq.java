package com.mom.shop.common.req;

import lombok.Data;

/**
 * @author Clozer
 * @date 2022/3/27 3:43 PM
 */
@Data
public class PageReq {

    private Integer size = 100;

    private Integer current = 1;
}
