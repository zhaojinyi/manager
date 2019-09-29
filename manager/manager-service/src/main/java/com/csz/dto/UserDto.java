package com.csz.dto;

/**
 * @Auther: 无聊的人
 * @Date: 2019/9/28
 * @Description: com.csz.dto
 */

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class UserDto {

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;
}
