package com.csz.console;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.Dept;
import com.csz.exception.FriendException;
import com.csz.service.DeptService;
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
@Api(value = "DeptController", description = "部门管理")
@RestController
@RequestMapping("/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @ApiOperation(value = "查询部门列表")
    @PostMapping("/page")
    public Page<Dept> pageDept(@RequestBody CommonSearchDto<Dept> commonSearchDto) {
        return deptService.pageDept(commonSearchDto);
    }

    @ApiOperation(value = "添加部门")
    @PostMapping("addDept")
    public void addDept(@RequestBody Dept dept) {
        deptService.save(dept);
    }

    @ApiOperation(value = "更新部门")
    @PostMapping("updDept")
    public void updDept(@RequestBody Dept dept) {
        deptService.updateById(dept);
    }

    @ApiOperation(value = "根据id查询部门")
    @GetMapping("getDeptById")
    public Dept getDeptById(@RequestParam("id") Integer id){
        Dept dept = deptService.getById(id);
        return dept;
    }

    @ApiOperation(value = "根据id删除部门")
    @GetMapping("delDept")
    public void delDept(@RequestParam("id") Integer id) {
        boolean b = deptService.removeById(id);
        if(!b) {
            throw new FriendException("删除失败");
        }
    }
}
