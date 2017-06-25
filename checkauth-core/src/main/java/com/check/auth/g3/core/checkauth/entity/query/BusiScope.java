package com.check.auth.g3.core.checkauth.entity.query;

import java.util.List;

public class BusiScope {
    private  String typeName;
    private  String typeCode;
    private  List<KeyValueBean> areaList;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public List<KeyValueBean> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<KeyValueBean> areaList) {
        this.areaList = areaList;
    }

}
