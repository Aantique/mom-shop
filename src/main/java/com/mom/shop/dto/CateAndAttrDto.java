package com.mom.shop.dto;

import com.mom.shop.mbg.entity.Attribute;
import com.mom.shop.mbg.entity.Category;
import lombok.Data;

import java.util.List;

/**
 * @author : songxuyang
 * @date : 2022/4/15
 */
@Data
public class CateAndAttrDto {
    private Category category;
    private List<Attribute> attrs;
}
