package com.zjy.service.impl;

import com.zjy.entity.User;
import com.zjy.mapper.UserMapper;
import com.zjy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
