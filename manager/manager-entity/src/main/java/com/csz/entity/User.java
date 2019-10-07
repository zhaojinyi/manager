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
 * @since 2019-10-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("sys_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private int id;

    private String salt;

    /**
     * 登录账号
     */
    private String username;

    private String password;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 员工类型  1.新员工  2.老员工
     */
    private String type;

    /**
     * 部门
     */
    private Integer deptId;

    /**
     * 小组
     */
    private Integer groupId;

    /**
     * 用户对应的角色
     */
    private Integer userRole;
}
