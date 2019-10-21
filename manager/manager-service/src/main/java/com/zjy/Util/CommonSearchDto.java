package com.zjy.Util;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.Iterator;
import java.util.Map;

/**
 * @Auther: 无聊的人
 * @Date: 2019/10/7
 * @Description: com.zjy.Util
 */
public class CommonSearchDto<T> {

    private PageDto page;
    private Map<String, Object> form;
    private Map<String, String> op;
    private Map<String, String> con;
    private String orderBy;

    public QueryWrapper<T> createWrapper() {
        QueryWrapper<T> ew = new QueryWrapper();
        String key;
        String curOp;
        if (this.form != null) {
            Iterator var4 = this.form.keySet().iterator();

            while(var4.hasNext()) {
                key = (String)var4.next();
                if (this.op != null && this.op.containsKey(key)) {
                    curOp = (String)this.op.get(key);
                } else {
                    curOp = "=";
                }

                String column = key;
                Object val = this.form.get(key);
                byte var11 = -1;
                switch(curOp.hashCode()) {
                    case 60:
                        if (curOp.equals("<")) {
                            var11 = 2;
                        }
                        break;
                    case 61:
                        if (curOp.equals("=")) {
                            var11 = 0;
                        }
                        break;
                    case 62:
                        if (curOp.equals(">")) {
                            var11 = 1;
                        }
                        break;
                    case 1921:
                        if (curOp.equals("<=")) {
                            var11 = 4;
                        }
                        break;
                    case 1983:
                        if (curOp.equals(">=")) {
                            var11 = 3;
                        }
                        break;
                    case 3365:
                        if (curOp.equals("in")) {
                            var11 = 6;
                        }
                        break;
                    case 97425:
                        if (curOp.equals("bet")) {
                            var11 = 7;
                        }
                        break;
                    case 3321751:
                        if (curOp.equals("like")) {
                            var11 = 5;
                        }
                }

                switch(var11) {
                    case 0:
                        ew = ew.eq(column, val);
                        break;
                    case 1:
                        ew = ew.gt(column, val);
                        break;
                    case 2:
                        ew = ew.lt(column, val);
                        break;
                    case 3:
                        ew = ew.ge(column, val);
                        break;
                    case 4:
                        ew = ew.le(column, val);
                        break;
                    case 5:
                        ew = ew.like(column, val.toString());
                        break;
                    case 6:
                        ew = ew.in(column, (JSONArray)val);
                        break;
                    case 7:
                        JSONArray args = (JSONArray)val;
                        ew = ew.between(column, args.get(0), args.get(1));
                }
            }
        }

        if (this.orderBy != "") {
            String[] orderByInfo = this.orderBy.split(" ");
            curOp = orderByInfo[0];
            if (orderByInfo.length >= 2 && orderByInfo[1].toLowerCase().equals("asc")) {
                ew.orderByAsc(curOp);
            } else {
                ew.orderByDesc(curOp);
            }
        }

        return ew;
    }

    public Page<T> getPageToSearch() {

        return this.page == null ? new Page(0, 10) : new Page(this.page.getPageNum(), this.page.getPageSize());
    }

    public PageDto getPage() {
        return page;
    }

    public void setPage(PageDto page) {
        this.page = page;
    }

    public Map<String, Object> getForm() {
        return form;
    }

    public void setForm(Map<String, Object> form) {
        this.form = form;
    }

    public Map<String, String> getOp() {
        return op;
    }

    public void setOp(Map<String, String> op) {
        this.op = op;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public Map<String, String> getCon() {
        return con;
    }

    public void setCon(Map<String, String> con) {
        this.con = con;
    }

    @Override
    public String toString() {
        return "CommonSearchDto{" +
                "page=" + page +
                ", form=" + form +
                ", op=" + op +
                ", con=" + con +
                ", orderBy='" + orderBy + '\'' +
                '}';
    }
}
