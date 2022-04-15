package com.mom.shop.mbg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("operation")
@ApiModel(value = "Operation对象", description = "")
public class Operation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("结果")
    @TableField("result")
    private String result;

    @ApiModelProperty("对数据库的操作")
    @TableField("operation")
    private String operation;

    @TableField("create_time")
    private LocalDateTime createTime;


}
