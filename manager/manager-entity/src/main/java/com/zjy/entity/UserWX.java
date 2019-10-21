package com.zjy.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserWX implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    /**
     * 来自哪个app
     */
    private String fromApp;

    /**
     * 微信的openId
     */
    private Integer openId;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别
     */
    private String sex;

    /**
     * 语言
     */
    private String language;

    /**
     * 城市
     */
    private String city;

    /**
     * 国家
     */
    private String country;

    /**
     * 省份
     */
    private String province;

    /**
     * 头像
     */
    private String headImgUrl;

    private LocalDateTime createTime;


}
