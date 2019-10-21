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
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String account;

    private String password;

    private String salt;

    private String name;

    private String phone;

    /**
     * 1. 内部账号 2.微信账号
     */
    private String type;

    private LocalDateTime createTime;

    private String createUserId;

    private LocalDateTime lastModifyTime;

    private String lastModifyId;

    private Boolean isDelete;

    private String deleteUserId;

    private LocalDateTime deleteTime;


}
