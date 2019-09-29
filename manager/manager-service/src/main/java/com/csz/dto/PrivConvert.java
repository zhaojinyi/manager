package com.csz.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.entity.Priv;
import com.csz.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.dto
 */
@Mapper(componentModel = "spring")
public interface PrivConvert {

    Priv dtoToEntity(PrivDto dto);
    PrivDto entityToDto(Priv priv);
    List<PrivDto> listEntityToDto(List<Priv> privList);
    List<Priv> listDtoToEntity(List<PrivDto> privDtoList);
    Page<PrivDto> pageEntityToDto(Page<Priv> page);



}
