package com.csz.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.csz.dto.UserDto;
import com.csz.entity.User;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.service
 */

public interface UserService  extends IService<User> {

    List<User> listUser();

    void addUser(User user);
}

