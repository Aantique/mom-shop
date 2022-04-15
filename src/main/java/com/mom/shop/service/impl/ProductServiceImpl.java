package com.mom.shop.service.impl;

import com.mom.shop.mbg.entity.Product;
import com.mom.shop.mbg.mapper.ProductMapper;
import com.mom.shop.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Clozer
 * @since 2022-04-15 11:08:41
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
