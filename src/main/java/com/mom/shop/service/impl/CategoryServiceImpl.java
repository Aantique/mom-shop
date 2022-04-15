package com.mom.shop.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.mom.shop.common.req.PageReq;
import com.mom.shop.common.utils.PageUtil;
import com.mom.shop.mbg.entity.Category;
import com.mom.shop.mbg.mapper.CategoryMapper;
import com.mom.shop.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Clozer
 * @since 2022-04-15 11:08:40
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public IPage<Category> listByPage(PageReq pageReq) {
        return PageUtil.getPages(categoryMapper,pageReq);
    }
}
