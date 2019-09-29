package com.csz.console;


import com.csz.dto.RoleConvert;
import com.csz.dto.RoleDto;
import com.csz.exception.FriendException;
import com.csz.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-09-29
 */
@Api(value = "RoleController", description = "角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @Autowired
    private RoleConvert roleConvert;

    @ApiOperation("添加角色")
    @PostMapping("addRole")
    public void addRole(@RequestBody RoleDto roleDto) {
        boolean save = roleService.save(roleConvert.dtoToEntity(roleDto));
        if(!save) {
            throw new FriendException("添加角色失败");
        }
    }
}
