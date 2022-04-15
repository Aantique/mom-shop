package com.mom.shop.common.utils;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mom.shop.common.req.PageReq;


/**
 * @author Clozer
 * @date 2022/3/30 17:29
 */
public class PageUtil {

    public static <T> IPage<T> getPages(BaseMapper<T> mapper, PageReq pageReq){
        IPage<T> page = new Page<T>(pageReq.getCurrent(),pageReq.getSize());
        mapper.selectPage(page,null);
        return page;
    }

    public static <T> IPage<T> getPagesByWrapper(BaseMapper<T> mapper, PageReq pageReq, Wrapper<T> wa){
        IPage<T> page = new Page<T>(pageReq.getCurrent(),pageReq.getSize());
        mapper.selectPage(page,wa);
        return page;
    }

}
