package com.csz.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-01
 */
public interface UserService extends IService<User> {

    Page pageUser(CommonSearchDto<User> commonSearchDto);

    void addUser(User user);

}
