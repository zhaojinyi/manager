package com.csz.entity;

import java.math.BigDecimal;
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
@TableName("product_submit")
public class ProductSubmit implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 客户名
     */
    private String customName;

    /**
     * 零点提报
     */
    private String zeroSubmit;

    /**
     * 商品标题
     */
    private String shopTitle;

    /**
     * 商品ID
     */
    private Integer goodsId;

    /**
     * 商品活动
     */
    private String shopActive;

    /**
     * 商品分类
     */
    private String shopItem;

    /**
     * 商品主图
     */
    private String shopMainPic;

    /**
     * 商品营销图
     */
    private String shopMarketPic;

    /**
     * 推广文案
     */
    private String extensionStrategy;

    /**
     * 特色文案
     */
    private String characteristicStrategy;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 优惠券类型
     */
    private String couponType;

    /**
     * 优惠券名称
     */
    private String couponName;

    /**
     * 优惠券链接
     */
    private String couponUrl;

    /**
     * 券后价格
     */
    private BigDecimal couponAfterPrice;

    /**
     * 优惠券总量
     */
    private String couponCount;

    /**
     * 券面额
     */
    private String couponPrice;

    /**
     * 服务费单价
     */
    private String servicePrice;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 预计回款时间
     */
    private String returnMoneyTime;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 淘宝价
     */
    private String taobaoPrice;

    /**
     * 拍几件
     */
    private String buyCount;

    /**
     * 线上线下结算
     */
    private String settlementType;

    /**
     * 上传实拍图
     */
    private String uploadPic;

    /**
     * 选择平台
     */
    private String platform;


}
