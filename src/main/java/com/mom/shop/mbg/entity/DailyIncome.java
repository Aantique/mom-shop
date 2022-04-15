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
 * @since 2022-04-15 11:08:40
 */
@Getter
@Setter
@TableName("daily_income")
@ApiModel(value = "DailyIncome对象", description = "")
public class DailyIncome implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("`date`")
    private String date;

    @TableField("income")
    private BigDecimal income;


}
