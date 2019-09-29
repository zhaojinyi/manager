package com.csz.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.entity.Role;
import com.csz.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.dto
 */
@Mapper(componentModel = "spring")
public interface RoleConvert {

    Role dtoToEntity(RoleDto dto);
    RoleDto entityToDto(Role user);
    List<RoleDto> listEntityToDto(List<Role> userList);
    List<Role> listDtoToEntity(List<RoleDto> userDtoList);
    Page<RoleDto> pageEntityToDto(Page<Role> page);



}
