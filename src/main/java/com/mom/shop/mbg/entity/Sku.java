package com.mom.shop.mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
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
@TableName("sku")
@ApiModel(value = "Sku对象", description = "")
public class Sku implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("product_id")
    private Integer productId;

    @TableField("price")
    private BigDecimal price;

    @TableField("promotion_price")
    private BigDecimal promotionPrice;

    @ApiModelProperty("0是还有，1是售罄")
    @TableField("staus")
    private Integer staus;

    @TableField("sales")
    private Integer sales;

    @TableField("stock")
    private Integer stock;

    @TableField("sp_data")
    private String spData;


}
