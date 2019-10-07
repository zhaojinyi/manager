package com.csz.Util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Objects;

/**
 * @Auther: 无聊的人
 * @Date: 2019/10/7
 * @Description: com.csz.Util
 */
public class PageDto{
    private Integer pageSize;
    private Integer pageNum;

    public PageDto() {
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }
}
