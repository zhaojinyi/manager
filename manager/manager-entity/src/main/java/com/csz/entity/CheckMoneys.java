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
@TableName("check_moneys")
public class CheckMoneys implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer cmId;

    /**
     * 销售部
     */
    private String cmSellDept;

    /**
     * 部门
     */
    private String cmDept;

    /**
     * 责任人
     */
    private Integer cmUserId;

    /**
     * 店铺名称
     */
    private String cmShopName;

    /**
     * 类型
     */
    private String cmShopType;

    /**
     * 结算金额
     */
    private Double cmJsMoney;

    /**
     * 返款金额
     */
    private Double cmFkMoney;

    /**
     * 剩余金额
     */
    private Double cmSyMoney;

    /**
     * 结算量
     */
    private Integer cmJsNums;

    /**
     * 服务费单价
     */
    private Double cmFwPrice;

    /**
     * 优惠券截图
     */
    private Blob cmYhqPhoto;

    /**
     * 装入账户
     */
    private String cmLoadCustomer;

    /**
     * 申请时间
     */
    private LocalDateTime cmApplyTime;

    /**
     * 查款状态
     */
    private String cmType;

    /**
     * 优惠券名称
     */
    private String cmYhqName;

    /**
     * 到款时间
     */
    private LocalDateTime cmBackTime;

    /**
     * 备注
     */
    private String cmText;

    /**
     * 分成金额
     */
    private Double cmFcMoney;

    /**
     * 券截图状态（有无）
     */
    private String cmYhqType;


}
