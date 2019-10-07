package com.csz.entity;

import java.time.LocalDateTime;
import java.sql.Blob;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

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
@TableName("coop")
public class Coop implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    private Integer coopId;

    /**
     * 提报状态
     */
    private String coopType;

    /**
     * 平台状态
     */
    @TableField("coop_ptType")
    private String coopPttype;

    /**
     * 选单网状态
     */
    @TableField("coop_xdwType")
    private String coopXdwtype;

    /**
     * 商家客户
     */
    private String coopCustomer;

    /**
     * 商品主图
     */
    @TableField("coop_mainPicture")
    private Blob coopMainpicture;

    /**
     * 商品活动
     */
    private String coopActivity;

    /**
     * 商品id
     */
    @TableField("coop_goods_Id")
    private Integer coopGoodsId;

    /**
     * 零点提报
     */
    private String coopZero;

    /**
     * 券后价
     */
    @TableField("coop_alterPrice")
    private Double coopAlterprice;

    /**
     * 优惠券总量
     */
    @TableField("coop_yhqNums")
    private Integer coopYhqnums;

    /**
     * 佣金比例
     */
    @TableField("coop_yjScale")
    private String coopYjscale;

    /**
     * 提报时间
     */
    @TableField("coop_tbTime")
    private LocalDateTime coopTbtime;

    /**
     * 上线时间
     */
    @TableField("coop_startTime")
    private LocalDateTime coopStarttime;

    /**
     * 结束时间
     */
    @TableField("coop_endTime")
    private LocalDateTime coopEndtime;

    /**
     * 回款金额
     */
    private Double coopBack;

    /**
     * 部门
     */
    private Integer coopDeptId;

    /**
     * 负责人
     */
    private Integer coopUserId;

    /**
     * 优惠券名称
     */
    private String coopYhqName;

    /**
     * 备注信息
     */
    private String coopMessage;

    /**
     * 查看商品
     */
    private String coopShop;

    /**
     * 提报备注信息
     */
    @TableField("coop_tbMessage")
    private String coopTbmessage;


}
