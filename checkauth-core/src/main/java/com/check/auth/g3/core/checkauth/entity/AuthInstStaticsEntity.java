package com.check.auth.g3.core.checkauth.entity;

import java.util.List;
import java.util.Map;

public class AuthInstStaticsEntity {

    private  long id;
    private  long instDetailId;
    private  String authYear;
    private  int authCount;
    private  int authPersonCount;
    private List<Map<String,Object>>  groupStaticsList;
    //private  Map<String,List<String>>  authTypeArea; //认证机构的认证类别和认证领域


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAuthYear() {
        return authYear;
    }

    public void setAuthYear(String authYear) {
        this.authYear = authYear;
    }

    public int getAuthCount() {
        return authCount;
    }

    public void setAuthCount(int authCount) {
        this.authCount = authCount;
    }

    public int getAuthPersonCount() {
        return authPersonCount;
    }

    public void setAuthPersonCount(int authPersonCount) {
        this.authPersonCount = authPersonCount;
    }

    public long getInstDetailId() {
        return instDetailId;
    }

    public void setInstDetailId(long instDetailId) {
        this.instDetailId = instDetailId;
    }

    public List<Map<String, Object>> getGroupStaticsList() {
        return groupStaticsList;
    }

    public void setGroupStaticsList(List<Map<String, Object>> groupStaticsList) {
        this.groupStaticsList = groupStaticsList;
    }
}
