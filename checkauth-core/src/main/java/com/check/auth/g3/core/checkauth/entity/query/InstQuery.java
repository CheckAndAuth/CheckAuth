/**
 * Copyright: Copyright (c)2016
 * Company: 易宝支付(YeePay)
 */
package com.check.auth.g3.core.checkauth.entity.query;

import java.io.Serializable;

/**
 * 类名称: OrgQuery <br>
 * 类描述: <br>
 *
 * @author suicheng.si
 * @version 1.0.0
 * @since 16/8/17 下午3:33
 */
public class InstQuery implements Serializable {

    private String queryFlag;
    private String queryContent;
    private int pageNum = 1;
    private int pageSize = 50;

    public String getQueryFlag() {
        return queryFlag;
    }

    public void setQueryFlag(String queryFlag) {
        this.queryFlag = queryFlag;
    }

    public String getQueryContent() {
        return queryContent;
    }

    public void setQueryContent(String queryContent) {
        this.queryContent = queryContent;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }




}