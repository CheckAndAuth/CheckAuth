package com.check.auth.g3.core.checkauth.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.check.auth.g3.core.checkauth.dao.AuthInstMainInfoMapper;
import com.check.auth.g3.core.checkauth.entity.AuthInstMainInfoEntity;
import com.check.auth.g3.core.checkauth.service.AuthInstMainInfoService;
@Service("authInstMainInfoService")
public class AuthInstMainInfoServiceImpl implements AuthInstMainInfoService{

	@Autowired
	AuthInstMainInfoMapper authInstMainInfoMapper;
	
	@Override
	public void insert(AuthInstMainInfoEntity authInstMainInfoEntity) {
		authInstMainInfoMapper.insert(authInstMainInfoEntity);
	}

	@Override
	public AuthInstMainInfoEntity selectMainInstInfoByInstCode(String instCode) {
		return authInstMainInfoMapper.selectMainInstInfoByInstCode(instCode);
	}
}
