package com.csz.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("work_target_month")
public class WorkTargetMonth implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 第一周目标
     */
    private Double firstWeek;

    private Double secondWeek;

    private Double thirdWeek;

    private Double fourthWeek;

    private Double fifthWeek;

    /**
     * 月目标  工作进度使用
     */
    private Double workTarget;

    private Integer year;

    private Integer month;

    /**
     * 关联用户
     */
    private Integer userId;


}
