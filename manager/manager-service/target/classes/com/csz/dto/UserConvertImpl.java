package com.csz.dto;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.csz.entity.User;
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
public class UserConvertImpl implements UserConvert {

    @Override
    public User dtoToEntity(UserDto dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setUsername( dto.getUsername() );
        user.setPassword( dto.getPassword() );

        return user;
    }

    @Override
    public UserDto entityToDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );

        return userDto;
    }

    @Override
    public List<UserDto> listEntityToDto(List<User> userList) {
        if ( userList == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( userList.size() );
        for ( User user : userList ) {
            list.add( entityToDto( user ) );
        }

        return list;
    }

    @Override
    public List<User> listDtoToEntity(List<UserDto> userDtoList) {
        if ( userDtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( userDtoList.size() );
        for ( UserDto userDto : userDtoList ) {
            list.add( dtoToEntity( userDto ) );
        }

        return list;
    }

    @Override
    public Page<UserDto> pageEntityToDto(Page<User> page) {
        if ( page == null ) {
            return null;
        }

        Page<UserDto> page1 = new Page<UserDto>();

        page1.setPages( page.getPages() );
        page1.setRecords( listEntityToDto( page.getRecords() ) );
        page1.setTotal( page.getTotal() );
        page1.setSize( page.getSize() );
        page1.setCurrent( page.getCurrent() );

        return page1;
    }
}
