package com.csz.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author JinYiZhao
 * @since 2019-09-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class RolePrivRelation implements Serializable {

    private static final long serialVersionUID = 1L;
    @TableId(type= IdType.ID_WORKER)
    private Long id;
    private Integer roleId;

    private Integer privId;


}
