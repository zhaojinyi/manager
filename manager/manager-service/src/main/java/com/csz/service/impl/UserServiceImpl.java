package com.csz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.User;
import com.csz.mapper.UserMapper;
import com.csz.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-01
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Page<User> pageUser(CommonSearchDto<User> commonSearchDto) {

        Page<User> page = commonSearchDto.getPageToSearch();
        QueryWrapper<User> wrapper = commonSearchDto.createWrapper();
        page =(Page) userMapper.selectPage(page, wrapper);
        return page;
    }

    @Override
    public void addUser(User user) {
        user.setIsDelete(0);
        userMapper.insert(user);
    }
}
