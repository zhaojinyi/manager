package com.csz.entity;

import java.time.LocalDateTime;
import java.sql.Blob;
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
@TableName("back_moneys")
public class BackMoneys implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer bmId;

    /**
     * 销售部
     */
    private Integer bmDeptId;

    /**
     * 部门
     */
    private Integer bmGroupId;

    /**
     * 负责人
     */
    private Integer bmUserId;

    /**
     * 店铺名称（外键）
     */
    private String bmShopName;

    /**
     * 商品ID
     */
    private Integer bmGoodsId;

    /**
     * 优惠券名称
     */
    private String bmYhqName;

    /**
     * 上线时间
     */
    private LocalDateTime bmOnlineTime;

    /**
     * 下线时间
     */
    private LocalDateTime bmOfflineTime;

    /**
     * 操作类型
     */
    private String bmType;

    /**
     * 打款金额
     */
    private Double bmMakeMoney;

    /**
     * 返款金额
     */
    private Double bmBackMoney;

    /**
     * 剩余金额
     */
    private Double bmSurplus;

    /**
     * 打款账户
     */
    private String bmMakeAccount;

    /**
     * 打款时间
     */
    private LocalDateTime bmMakeTime;

    /**
     * 申请时间
     */
    private LocalDateTime bmCreateTime;

    /**
     * 备注
     */
    private String bmText;

    /**
     * 优惠券图片
     */
    private Blob bmYhqPhoto;

    /**
     * 确认状态
     */
    private String bmConfirmType;

    /**
     * 打款截图
     */
    private Blob bmMakePhoto;

    /**
     * 备用字段
     */
    private String bmByzd;

    /**
     * 返款类型（支付宝，银行卡）
     */
    private String bmBackType;

    /**
     * 销售花名
     */
    private String bmUserName;

    /**
     * 返款比例
     */
    private String bmBackBl;

    /**
     * 返款账户
     */
    private String bmBackAccount;

    /**
     * 返款账号
     */
    private String bmBackAccountNumber;


}
