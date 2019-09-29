package com.csz.console;

import com.csz.dto.UserConvert;
import com.csz.dto.UserDto;
import com.csz.entity.User;
import com.csz.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.console
 */
@Api(value = "UserController", description = "用户管理")
@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserConvert userConvert;

    @ApiOperation(value = "查询用户列表")
    @PostMapping("/list")
    public List<UserDto> listUser() {
        return userConvert.listEntityToDto(userService.listUser());
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("addUser")
    public void addUser(@RequestBody UserDto userDto) {
        userService.addUser(userConvert.dtoToEntity(userDto));
    }
}
