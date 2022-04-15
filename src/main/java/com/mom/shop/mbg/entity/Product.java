package com.mom.shop.mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author Clozer
 * @since 2022-04-15 11:08:41
 */
@Getter
@Setter
@TableName("product")
@ApiModel(value = "Product对象", description = "")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("`name`")
    private String name;

    @ApiModelProperty("没有收录的品牌为0")
    @TableField("brand_id")
    private Integer brandId;

    @ApiModelProperty("没有分类的默认0")
    @TableField("category_id")
    private Integer categoryId;

    @TableField("price")
    private BigDecimal price;

    @ApiModelProperty("默认会员价90%")
    @TableField("promotion_price")
    private BigDecimal promotionPrice;

    @ApiModelProperty("默认名字开头大小写字母")
    @TableField("key_words")
    private String keyWords;

    @ApiModelProperty("销量")
    @TableField("sales")
    private Integer sales;

    @TableField("brand_name")
    private String brandName;

    @ApiModelProperty("0上架,1缺货,2即将缺货")
    @TableField("`status`")
    private Integer status;

    @TableField("category_name")
    private String categoryName;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;


}
