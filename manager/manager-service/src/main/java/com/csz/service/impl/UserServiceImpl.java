package com.csz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.csz.PasswordUtil;
import com.csz.dto.UserDto;
import com.csz.entity.User;
import com.csz.mapper.RoleMapper;
import com.csz.mapper.UserMapper;
import com.csz.service.RoleService;
import com.csz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.service.impl
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> listUser() {
        return userMapper.selectList(new QueryWrapper<>());
    }


    @Override
    public void addUser(User user) {
        PasswordUtil.encryptPassword(user);
        userMapper.insert(user);
    }


}
