package com.csz.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.csz.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.mapper
 */
public interface UserMapper extends BaseMapper<User>{

    List<User> selectUser();

}
