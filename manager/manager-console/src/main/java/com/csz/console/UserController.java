package com.csz.console;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.User;
import com.csz.exception.FriendException;
import com.csz.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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

    @ApiOperation(value = "查询用户列表")
    @PostMapping("/page")
    public Page<User> pageUser(@RequestBody CommonSearchDto<User> commonSearchDto) {
        System.out.println(commonSearchDto+"---------------");
        return userService.pageUser(commonSearchDto);
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("addUser")
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @ApiOperation(value = "更新用户")
    @PostMapping("updUser")
    public void updUser(@RequestBody User user) {
        userService.updateById(user);
    }

    @ApiOperation(value = "根据id查询用户")
    @GetMapping("getUserById")
    public User getUserById(@RequestParam("id") Integer id){
        User user = userService.getById(id);
        return user;
//        return userService.getById(id);
    }

    @ApiOperation(value = "根据id删除用户")
    @GetMapping("delUser")
    public void delUser(@RequestParam("id") Integer id) {
        boolean b = userService.removeById(id);
        if(!b) {
            throw new FriendException("删除失败");
        }
    }

}
