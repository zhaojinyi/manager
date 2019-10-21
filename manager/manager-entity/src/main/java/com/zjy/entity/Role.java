package com.zjy.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-10-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    private String role;

    private String name;

    private String display;

    private LocalDateTime createTime;

    private Boolean isDelete;

    private Long createUserId;

    private Long deleteUserId;

    private LocalDateTime deleteTime;

    private Long modifyId;

    private LocalDateTime modifyTime;


}
