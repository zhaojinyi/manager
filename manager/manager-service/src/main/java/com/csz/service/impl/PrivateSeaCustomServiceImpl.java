package com.csz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.PrivateSeaCustom;
import com.csz.mapper.PrivateSeaCustomMapper;
import com.csz.service.PrivateSeaCustomService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-07
 */
@Service
public class PrivateSeaCustomServiceImpl extends ServiceImpl<PrivateSeaCustomMapper, PrivateSeaCustom> implements PrivateSeaCustomService {


    @Autowired
    private PrivateSeaCustomMapper privateSeaCustomMapper;

    @Override
    public Page<PrivateSeaCustom> pageUser(CommonSearchDto<PrivateSeaCustom> commonSearchDto) {

        Page<PrivateSeaCustom> page = commonSearchDto.getPageToSearch();
        QueryWrapper<PrivateSeaCustom> wrapper = commonSearchDto.createWrapper();
        page = (Page)privateSeaCustomMapper.selectPage(page, wrapper);
        page.setTotal(privateSeaCustomMapper.selectCount(wrapper));

        return page;
    }
}
