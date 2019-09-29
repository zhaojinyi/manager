package com.csz.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.entity.Priv;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-09-29T18:27:52+0800",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_131 (Oracle Corporation)"
)
@Component
public class PrivConvertImpl implements PrivConvert {

    @Override
    public Priv dtoToEntity(PrivDto dto) {
        if ( dto == null ) {
            return null;
        }

        Priv priv = new Priv();

        priv.setName( dto.getName() );
        priv.setUrl( dto.getUrl() );
        priv.setParentId( dto.getParentId() );

        return priv;
    }

    @Override
    public PrivDto entityToDto(Priv priv) {
        if ( priv == null ) {
            return null;
        }

        PrivDto privDto = new PrivDto();

        privDto.setName( priv.getName() );
        privDto.setUrl( priv.getUrl() );
        privDto.setParentId( priv.getParentId() );

        return privDto;
    }

    @Override
    public List<PrivDto> listEntityToDto(List<Priv> privList) {
        if ( privList == null ) {
            return null;
        }

        List<PrivDto> list = new ArrayList<PrivDto>( privList.size() );
        for ( Priv priv : privList ) {
            list.add( entityToDto( priv ) );
        }

        return list;
    }

    @Override
    public List<Priv> listDtoToEntity(List<PrivDto> privDtoList) {
        if ( privDtoList == null ) {
            return null;
        }

        List<Priv> list = new ArrayList<Priv>( privDtoList.size() );
        for ( PrivDto privDto : privDtoList ) {
            list.add( dtoToEntity( privDto ) );
        }

        return list;
    }

    @Override
    public Page<PrivDto> pageEntityToDto(Page<Priv> page) {
        if ( page == null ) {
            return null;
        }

        Page<PrivDto> page1 = new Page<PrivDto>();

        page1.setPages( page.getPages() );
        page1.setRecords( listEntityToDto( page.getRecords() ) );
        page1.setTotal( page.getTotal() );
        page1.setSize( page.getSize() );
        page1.setCurrent( page.getCurrent() );

        return page1;
    }
}
