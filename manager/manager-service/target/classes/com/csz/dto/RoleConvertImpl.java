package com.csz.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.entity.Role;
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
public class RoleConvertImpl implements RoleConvert {

    @Override
    public Role dtoToEntity(RoleDto dto) {
        if ( dto == null ) {
            return null;
        }

        Role role = new Role();

        role.setRole( dto.getRole() );
        role.setName( dto.getName() );
        role.setDescription( dto.getDescription() );

        return role;
    }

    @Override
    public RoleDto entityToDto(Role user) {
        if ( user == null ) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setRole( user.getRole() );
        roleDto.setName( user.getName() );
        roleDto.setDescription( user.getDescription() );

        return roleDto;
    }

    @Override
    public List<RoleDto> listEntityToDto(List<Role> userList) {
        if ( userList == null ) {
            return null;
        }

        List<RoleDto> list = new ArrayList<RoleDto>( userList.size() );
        for ( Role role : userList ) {
            list.add( entityToDto( role ) );
        }

        return list;
    }

    @Override
    public List<Role> listDtoToEntity(List<RoleDto> userDtoList) {
        if ( userDtoList == null ) {
            return null;
        }

        List<Role> list = new ArrayList<Role>( userDtoList.size() );
        for ( RoleDto roleDto : userDtoList ) {
            list.add( dtoToEntity( roleDto ) );
        }

        return list;
    }

    @Override
    public Page<RoleDto> pageEntityToDto(Page<Role> page) {
        if ( page == null ) {
            return null;
        }

        Page<RoleDto> page1 = new Page<RoleDto>();

        page1.setPages( page.getPages() );
        page1.setRecords( listEntityToDto( page.getRecords() ) );
        page1.setTotal( page.getTotal() );
        page1.setSize( page.getSize() );
        page1.setCurrent( page.getCurrent() );

        return page1;
    }
}
