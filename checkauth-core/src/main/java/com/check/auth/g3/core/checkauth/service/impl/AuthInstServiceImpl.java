package com.check.auth.g3.core.checkauth.service.impl;

import com.check.auth.g3.core.checkauth.dao.AuthInstMapper;
import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstService;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("authInstService")
public class AuthInstServiceImpl implements AuthInstService {

    @Autowired
    AuthInstMapper authInstMapper;

    @Override
    public void insertAuthInst(AuthInstEntity authInstEntity) {
        authInstMapper.insertAuthInst(authInstEntity);
    }

	@Override
	public AuthInstEntity selectAuthInstByInstCode(String instCode) {
		return authInstMapper.selectAuthInstByInstCode(instCode);
	}

    @Override
    public PageDTO<AuthInstEntity> selectListByPage(Map<String,Object> queryMap,int pageNum,int pageSize) {
        Long count= authInstMapper.getCountByMap(queryMap);
        PageDTO<AuthInstEntity> page = new PageDTO<AuthInstEntity>(count, pageNum, pageSize);
        queryMap.put("offset", page.getOffset());
        queryMap.put("limit", page.getPageSize());
        List<AuthInstEntity> authList=authInstMapper.selectAuthInstByMap(queryMap);
        page.setPageList(authList);
        return page;
    }
}
