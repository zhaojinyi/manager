package com.csz.console;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.PrivateSeaCustom;
import com.csz.exception.FriendException;
import com.csz.service.PrivateSeaCustomService;
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
 * @since 2019-10-07
 */
@Api(value = "PrivateSeaCustomController", description = "私海客户管理")
@RestController
@RequestMapping("/privateSeaCustomController")
public class PrivateSeaCustomController {

    @Autowired
    private PrivateSeaCustomService privateSeaCustomService;

    @ApiOperation(value = "查询用户列表")
    @PostMapping("/page")
    public Page<PrivateSeaCustom> pageUser(@RequestBody CommonSearchDto<PrivateSeaCustom> commonSearchDto) {
        return privateSeaCustomService.pageUser(commonSearchDto);
    }

    @PostMapping("updPrivateSeaCustom")
    public void updPrivateSeaCustom(@RequestBody PrivateSeaCustom privateSeaCustom) {
        boolean b = privateSeaCustomService.updateById(privateSeaCustom);
        if(!b) {
            throw new FriendException("更新四海用户失败");
        }
    }

    @GetMapping("delPrivateSeaCustomById")
    public void delPrivateSeaCustomById(@RequestParam("id") Integer id) {
        boolean b = privateSeaCustomService.removeById(id);
        if(!b) {
            throw new FriendException("更新四海用户失败");
        }
    }

    @GetMapping("getPrivateSeaCustomById")
    public PrivateSeaCustom getPrivateSeaCustomById(@RequestParam("id") Integer id) {
        PrivateSeaCustom privateSeaCustom = privateSeaCustomService.getById(id);

        if(privateSeaCustom != null) {
            return privateSeaCustom;
        } else {
            throw new FriendException("查询私海用户失败");
        }
    }

}
