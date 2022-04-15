package com.mom.shop.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mom.shop.common.req.PageReq;
import com.mom.shop.mbg.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Clozer
 * @since 2022-04-15 11:08:40
 */
public interface CategoryService extends IService<Category> {

    /**
     * listByPage
     * @param pageReq
     * @return
     */
    IPage<Category> listByPage(PageReq pageReq);

}
