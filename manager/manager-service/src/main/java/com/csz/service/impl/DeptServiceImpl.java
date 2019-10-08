package com.csz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.Dept;
import com.csz.mapper.DeptMapper;
import com.csz.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.smartcardio.CommandAPDU;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-07
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {


    @Resource
    private DeptMapper deptMapper;

    @Override
    public Page<Dept> pageDept(CommonSearchDto<Dept> commonSearchDto) {
        Page<Dept> page = commonSearchDto.getPageToSearch();
        QueryWrapper<Dept> wrapper = commonSearchDto.createWrapper();

        page = (Page)deptMapper.selectPage(page, wrapper);

        return page;
    }
}
