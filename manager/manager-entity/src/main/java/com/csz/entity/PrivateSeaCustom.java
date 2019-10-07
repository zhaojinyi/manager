package com.csz.entity;

import java.time.LocalDateTime;

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
@TableName("private_sea_custom")
public class PrivateSeaCustom implements Serializable {

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
    private String wangwangaccount;

    /**
     * 店铺老板
     */
    private String shopBoss;

    /**
     * 店铺QQ
     */
    private String shopQq;

    /**
     * 店铺链接
     */
    private String shopUrl;

    /**
     * 成熟度
     */
    private String maturity;

    /**
     * 店铺类型
     */
    private String shopType;

    /**
     * 主营
     */
    private String mainOperate;

    private String operateQq;

    private String operateWx;

    /**
     * 运营电话
     */
    private String operatePhone;

    /**
     * 店铺电话
     */
    private String shopPhone;

    /**
     * 下次跟进时间
     */
    private LocalDateTime nextTime;

    /**
     * 下次跟进记录
     */
    private String followUpRecord;

    /**
     * 回款时间
     */
    private String refundsTime;

    /**
     * 回款金额
     */
    private String refundsMoney;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 资料类型
     */
    private String dataType;

    /**
     * 操作人
     */
    private Integer operatorUserId;

    /**
     * 30天推广量
     */
    @TableField("Extension")
    private Integer Extension;

    /**
     * 是否开通淘客
     */
    private String taokeType;

    /**
     * 是否与本公司合作
     */
    private String cooperation;

    /**
     * 合作次数
     */
    private Integer cooperationNum;

    /**
     * 录入次数
     */
    private Integer entryNum;

    /**
     * 备用字段
     */
    @TableField("Spare")
    private String Spare;

    /**
     * 是否为公海用户
     */
    private String privateType;

    /**
     * 私海用户
     */
    private Integer privateUserId;


}
