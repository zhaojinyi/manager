package com.csz.entity;

import java.time.LocalDateTime;
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
@TableName("waiting_work")
public class WaitingWork implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 任务
     */
    private String work;

    /**
     * 项目类型
     */
    private Integer workType;

    /**
     * 项目状态
     */
    private Integer workStatus;

    /**
     * 送达时间
     */
    private LocalDateTime sendTime;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 用户id 关联用户
     */
    private Integer userId;

    /**
     * 年
     */
    private Integer year;

    /**
     * 月
     */
    private Integer month;


}
