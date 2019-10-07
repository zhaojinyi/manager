package com.csz.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.Util.CommonSearchDto;
import com.csz.entity.PrivateSeaCustom;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-07
 */
public interface PrivateSeaCustomService extends IService<PrivateSeaCustom> {

    Page<PrivateSeaCustom> pageUser(CommonSearchDto<PrivateSeaCustom> commonSearchDto);
}
