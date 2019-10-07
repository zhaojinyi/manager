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
@TableName("shop")
public class Shop implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 旺旺账号
     */
    private String shopWangwang;

    /**
     * 推广产品
     */
    private String shopProduct;

    /**
     * 创建人
     */
    private Integer shopUseId;

    /**
     * 店铺联系人
     */
    private String shopContacts;

    /**
     * 店铺电话
     */
    private String shopPhone;

    /**
     * 所属部门
     */
    private Integer shopDeptId;

    /**
     * 所属人员
     */
    private Integer shopUserId2;

    /**
     * 成熟度
     */
    private String shopMature;

    /**
     * 店铺qq
     */
    private String shopQq;

    /**
     * 店铺类型
     */
    private String shopType;

    /**
     * 主营
     */
    private String shopMain;

    /**
     * 回款时间
     */
    private LocalDateTime shopBackTime;

    /**
     * 创建时间
     */
    private LocalDateTime shopCreateTime;

    /**
     * 运营微信
     */
    private String shopWx;

    /**
     * 运营电话
     */
    private String shopOperatePhone;

    /**
     * 提报方式
     */
    @TableField("shop_tbType")
    private String shopTbtype;

    /**
     * 结算方式
     */
    @TableField("shop_jsType")
    private String shopJstype;

    /**
     * 实拍图
     */
    @TableField("shop_Real_shooting")
    private Blob shopRealShooting;

    /**
     * 备用字段
     */
    private String shopBz;


}
