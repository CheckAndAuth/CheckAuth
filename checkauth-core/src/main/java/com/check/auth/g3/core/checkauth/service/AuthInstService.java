package com.check.auth.g3.core.checkauth.service;

import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;

import java.util.List;
import java.util.Map;

public interface AuthInstService {

    public void insertAuthInst(AuthInstEntity authInstDirEntity);
    
    public AuthInstEntity selectAuthInstByInstCode(String instCode);

    public PageDTO<AuthInstEntity>  selectListByPage(Map<String,Object> map,int pageNum, int pageSize);
    
    public List<AuthInstEntity> selectAuthInstByContent(String content, String flag);

}
