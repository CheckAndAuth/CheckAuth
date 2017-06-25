package com.check.auth.g3.core.checkauth.entity.query;

public class KeyValueBean {
    private String keyName;
    private String keyValue;

    public KeyValueBean(String keyName,String keyValue){
        this.keyName=keyName;
        this.keyValue=keyValue;
    }
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyValue() {
        return keyValue;
    }

    public void setKeyValue(String keyValue) {
        this.keyValue = keyValue;
    }
}
