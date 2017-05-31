package com.check.auth.g3.core.checkauth.service.impl;

import com.check.auth.g3.core.checkauth.dao.AuthInstMapper;
import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("authInstService")
public class AuthInstServiceImpl implements AuthInstService {

    @Autowired
    AuthInstMapper authInstMapper;

    @Override
    public void insertAuthInst(AuthInstEntity authInstDirEntity) {
        authInstMapper.insertAuthInst(authInstDirEntity);
    }

	@Override
	public AuthInstEntity selectAuthInstByInstCode(String instCode) {
		return authInstMapper.selectAuthInstByInstCode(instCode);
	}
}
