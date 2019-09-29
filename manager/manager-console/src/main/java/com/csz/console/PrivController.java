package com.csz.console;


import com.csz.dto.PrivConvert;
import com.csz.dto.PrivDto;
import com.csz.dto.RoleDto;
import com.csz.exception.FriendException;
import com.csz.service.PrivService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-09-29
 */
@Api(value = "PrivController", description = "添加权限")
@RestController
@RequestMapping("/priv")
public class PrivController {

    @Autowired
    private PrivService privService;

    @Autowired
    private PrivConvert privConvert;

    @ApiOperation("添加权限")
    @PostMapping("addPriv")
    public void addPriv(@RequestBody PrivDto privDto) {
        boolean save = privService.save(privConvert.dtoToEntity(privDto));
        if(!save) {
            throw new FriendException("添加权限失败");
        }
    }
}
