package com.csz.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.dto
 */
@Mapper(componentModel = "spring")
public interface UserConvert {

    User dtoToEntity(UserDto dto);
    UserDto entityToDto(User user);
    List<UserDto> listEntityToDto(List<User> userList);
    List<User> listDtoToEntity(List<UserDto> userDtoList);
    Page<UserDto> pageEntityToDto(Page<User> page);



}
