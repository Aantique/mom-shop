package com.mom.shop.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author : songxuyang
 * @date : 2022/4/15
 */
@Data
@Builder
public class AttributeVo {

    private Integer id;
    private String name;
    List<String> inputList;
}
