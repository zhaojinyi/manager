package com.csz.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.entity
 */
@Data
@TableName("sys_user")
public class User {

    @TableId(type = IdType.ID_WORKER)
    private Long id;
    private String username;
    private String password;
    private String salt;
}
