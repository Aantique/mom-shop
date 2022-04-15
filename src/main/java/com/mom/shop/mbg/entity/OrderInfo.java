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
@TableName("order_info")
@ApiModel(value = "OrderInfo对象", description = "")
public class OrderInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("sku_id")
    private Integer skuId;

    @TableField("product_id")
    private Integer productId;

    @ApiModelProperty("电子支付为0，现金为1，走储蓄为2")
    @TableField("payment_method")
    private Integer paymentMethod;

    @TableField("amount")
    private BigDecimal amount;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;

    @ApiModelProperty("商品数量")
    @TableField("quantity")
    private Integer quantity;

    @TableField("product_name")
    private String productName;

    @TableField("sp_data")
    private String spData;


}
